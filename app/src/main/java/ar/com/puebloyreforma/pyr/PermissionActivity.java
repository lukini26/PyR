package ar.com.puebloyreforma.pyr;
import android.Manifest;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
public class PermissionActivity extends AbsRuntimePermission {
    private static final int REQUEST_PERMISSION = 10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_permission);

        requestAppPermissions(new String[]{
                        Manifest.permission.READ_CONTACTS,
                        Manifest.permission.WRITE_EXTERNAL_STORAGE,
                        Manifest.permission.WRITE_CONTACTS},
             R.string.msj,REQUEST_PERMISSION);
    }

    @Override
    public void onPermissionsGranted(int requestCode) {
        //Do anything when permisson granted
        Toast.makeText(getApplicationContext(), "Permission granted", Toast.LENGTH_LONG).show();
        Intent hola = new Intent (PermissionActivity.this,NoticiasActivity.class);
        startActivity(hola);
    }
}
