package ar.com.puebloyreforma.pyr;
//198838995839 face id

import android.content.ActivityNotFoundException;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.util.List;

import br.com.bloder.magic.view.MagicButton;



public class ContactoActivity extends MyAppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacto);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("ChildNavigationActivity");

        MagicButton btf, btins , btgmas , bttt ;
        // FACEBOOK BUTTON
        btf = (MagicButton) findViewById(R.id.magic_button_fb);
        btf.setMagicButtonClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                launchFacebook();
            }
        });

        //INSTAGRAM BUTTON
        btins = (MagicButton)findViewById(R.id.magic_button_in) ;
        btins.setMagicButtonClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Uri uri = Uri.parse("http://instagram.com/_u/puebloyreforma");
                Intent likeIng = new Intent(Intent.ACTION_VIEW, uri);

                likeIng.setPackage("com.instagram.android");

                try {
                    startActivity(likeIng);
                } catch (ActivityNotFoundException e) {
                    startActivity(new Intent(Intent.ACTION_VIEW,
                            Uri.parse("http://instagram.com/puebloyreforma")));
                }

            }
        });

        //TWITTER BUTTON

        bttt = (MagicButton)findViewById(R.id.magic_button_tt) ;
        bttt.setMagicButtonClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String twitter_user_name = "PuebloyReforma" ;
                try {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("twitter://user?screen_name=" + twitter_user_name)));
                }catch (Exception e) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/#!/" + twitter_user_name)));
                }
            }
        });




        //EL LINDO GOOGLE MAS BUTTON

        btgmas = (MagicButton)findViewById(R.id.magic_button_gmas) ;
        btgmas.setMagicButtonClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://plus.google.com/+puebloyreforma")));





            }
        });









    }
    //FUNCION ABRIR FACEBOOK O BROWSER
    public final void launchFacebook() {
        final String urlFb = "fb://page/"+"198838995839";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(urlFb));

        // If a Facebook app is installed, use it. Otherwise, launch
        // a browser
        final PackageManager packageManager = getPackageManager();
        List<ResolveInfo> list =
                packageManager.queryIntentActivities(intent,
                        PackageManager.MATCH_DEFAULT_ONLY);
        if (list.size() == 0) {
            final String urlBrowser = "https://www.facebook.com/pages/"+"198838995839";
            intent.setData(Uri.parse(urlBrowser));
        }

        startActivity(intent);}


























    }



























