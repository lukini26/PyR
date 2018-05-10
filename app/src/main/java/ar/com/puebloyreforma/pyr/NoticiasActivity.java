package ar.com.puebloyreforma.pyr;


import android.*;
import android.Manifest;
import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.design.widget.Snackbar;
import android.support.v4.content.FileProvider;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.MenuView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.ShareActionProvider;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


import com.firebase.ui.database.FirebaseRecyclerAdapter;

import com.google.android.gms.analytics.HitBuilders;
import com.google.android.gms.analytics.Tracker;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.squareup.picasso.Picasso;

import java.io.File;
import java.net.URI;
import java.util.ArrayList;


public class NoticiasActivity extends MyAppCompatActivity {

    private RecyclerView mBlogList;
    FirebaseDatabase database;
    DatabaseReference myRef;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noticias);

        //Recycler View
        mBlogList = (RecyclerView)findViewById(R.id.blog_list);
        mBlogList.setHasFixedSize(true);
        mBlogList.setLayoutManager(new LinearLayoutManager(this));
        /*YoYo.with(Techniques.RotateInDownRight)
                .duration(700)
                .repeat(1)
                .playOn(findViewById(R.id.blog_list));*/

        // Send a Query to the database
        database = FirebaseDatabase.getInstance();
        myRef = database.getReference("Data");
    }

    @Override
    protected void onStart() {
        super.onStart();

        FirebaseRecyclerAdapter<ModelClass, BlogViewHolder> firebaseRecyclerAdapter =
                new FirebaseRecyclerAdapter<ModelClass, BlogViewHolder>(
                        ModelClass.class,
                        R.layout.design_row,
                        BlogViewHolder.class,
                        myRef)  {



                    @Override
                    protected void populateViewHolder(BlogViewHolder viewHolder, final ModelClass model, final int position) {
                        viewHolder.setTitle(model.getTitle());
                        viewHolder.setImage(getApplicationContext(), model.getImage());

                        viewHolder.button.setOnClickListener(new View.OnClickListener() {




                            @Override
                            public void onClick(final View view) {

                                new Thread(new Runnable() {
                                    public void run() {




                                        String url = model.getUrl() ;
                                        String filename = model.getTitle() +".jpg";
                                        String downloadUrlOfImage = url;

                                        File direct =
                                                new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES)
                                                        .getAbsolutePath() + "/" + "/Pyr" + "/");


                                        if (!direct.exists()) {
                                            direct.mkdir();
                                            Log.d("pyr", "dir created for first time");
                                        }

                                        DownloadManager dm = (DownloadManager)getBaseContext().getSystemService(Context.DOWNLOAD_SERVICE);
                                        Uri downloadUri = Uri.parse(downloadUrlOfImage);
                                        DownloadManager.Request request = new DownloadManager.Request(downloadUri);
                                        request.setAllowedNetworkTypes(DownloadManager.Request.NETWORK_WIFI | DownloadManager.Request.NETWORK_MOBILE)
                                                .setAllowedOverRoaming(false)
                                                .setTitle(filename)
                                                .setMimeType("image/jpeg")
                                                // .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                                                .setDestinationInExternalPublicDir(Environment.DIRECTORY_PICTURES,
                                                        File.separator + "pyr" + File.separator + filename);
                                        String pathl = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES)+ "/Pyr/" + filename;
                                        dm.enqueue(request);

                                        Uri path = FileProvider.getUriForFile(view.getContext() ,"ar.com.puebloyreforma.pyr", new File(pathl) ) ;

                                        Intent shareIntent = new Intent();
                                        shareIntent.setAction(Intent.ACTION_SEND);
                                        shareIntent.putExtra(Intent.EXTRA_TEXT, "http://www.puebloyreforma.com.ar/");
                                        shareIntent.putExtra(Intent.EXTRA_STREAM, path);
                                        shareIntent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
                                        shareIntent.setType("image/*");
                                        startActivity(Intent.createChooser(shareIntent, "Share..."));


                                    }
                                }).start();

































                            }
                                });
                            }

                };
        mBlogList.setAdapter(firebaseRecyclerAdapter);
    }
    //View Holder For Recycler View
    public static class BlogViewHolder extends RecyclerView.ViewHolder  {
        View mView;
        Button button ;

        public BlogViewHolder(View itemView) {

            super(itemView);
            mView= itemView;
           button = (Button)mView.findViewById(R.id.share);







            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // click en la imagen hace algo
                    //añadir luego
                   // Toast.makeText(v.getContext(), ("hola"+ getPosition()), Toast.LENGTH_SHORT).show();

                }
            });

        }
        public void setTitle(String title){
            TextView post_title = (TextView)mView.findViewById(R.id.titleText);
            post_title.setText(title);
        }
        public void setImage(Context ctx , String image){
            ImageView post_image = (ImageView)mView.findViewById(R.id.imageViewy);
            // We Need TO pass Context
            Picasso.with(ctx).load(image).into(post_image);
        }    }}



