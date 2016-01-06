package com.roboticize.smoothngroove;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.Toast;


public class SmoothieGangActivity extends Activity {

    ImageView imageView19;
    ImageButton btntakephoto, btnshare;

    String fotoname;
    int progress;

    private File photofile, file;
    private int TAKENPHOTO = 0;
    Bitmap photo, canvasBitmap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_smoothie_gang);

        btntakephoto = (ImageButton) findViewById(R.id.btn_takephoto);
        btnshare = (ImageButton) findViewById(R.id.btn_share);
        imageView19 = (ImageView) findViewById(R.id.imageView19);


        btntakephoto.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                File photostorage = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
                photofile = new File(photostorage, (System.currentTimeMillis()) + ".jpg");

                Intent i = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                i.putExtra(MediaStore.EXTRA_OUTPUT, Uri.fromFile(photofile));
                startActivityForResult(i, TAKENPHOTO);
            }
        });

        btnshare.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                BitmapDrawable bitmapDrawable = (BitmapDrawable)imageView19.getDrawable();
                Bitmap bitmap = bitmapDrawable.getBitmap();

                File cache = getApplicationContext().getExternalCacheDir();
                File sharefile = new File(cache, "toshare.png");
                try {
                    FileOutputStream out = new FileOutputStream(sharefile);
                    bitmap.compress(Bitmap.CompressFormat.PNG, 100, out);
                    out.flush();
                    out.close();
                } catch (IOException e) {

                }
                Intent share = new Intent(Intent.ACTION_SEND);
                share.setType("image/*");
                share.putExtra(Intent.EXTRA_STREAM, Uri.parse("file://" + sharefile));
                try {
                    startActivity(Intent.createChooser(share, "Share photo"));
                } catch (Exception e) {

                }

            }
        });
    }

            @Override
            protected void onActivityResult(int requestCode, int resultCode, Intent data) {

                super.onActivityResult(requestCode, resultCode, data);
                if (requestCode == TAKENPHOTO) {

                    try {

                        photo = (Bitmap) data.getExtras().get("data");
                    }
                    catch(NullPointerException ex) {
                        photo = BitmapFactory.decodeFile(photofile.getAbsolutePath());
                    }

                    if(photo != null){
                        imageView19.setImageBitmap(photo);


                    }
                    else{
                        Toast.makeText(this, "Oops, can't get the photo from your gallery", Toast.LENGTH_LONG).show();
                    }
                }
            }


    public void Home(View view) {
        Intent startNewActivity = new Intent(this, Home.class);
        startActivity(startNewActivity);
    }

    public void contactUs(View view) {
        Intent startNewActivity = new Intent(this, ContactUsActivity.class);
        startActivity(startNewActivity);
    }

    public void Smoothies(View view) {
        Intent startNewActivity = new Intent(this, SmoothiesActivity.class);
        startActivity(startNewActivity);
    }

    public void aboutUs(View view) {
        Intent startNewActivity = new Intent(this, AboutUsActivity.class);
        startActivity(startNewActivity);
    }

    public void shop(View view) {
        Intent shopIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://shopsmoothngroove.myshopify.com"));
        startActivity(shopIntent);
    }


}
