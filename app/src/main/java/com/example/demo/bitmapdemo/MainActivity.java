package com.example.demo.bitmapdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    private LoadImageTask loadImageTask;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.img_picture);

//    Load Image from internet  -> ASynsTask example
        loadImageTask = new LoadImageTask(imageView);
        loadImageTask.execute("https://thumbs.dreamstime.com/z/smile-emoticons-thumbs-up-isolated-60753634.jpg");

//    Load Image from internet  -> Threads example
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                URL url = null;
//                Bitmap bitmap = null;
//                try {
//                    url = new URL("https://thumbs.dreamstime.com/z/smile-emoticons-thumbs-up-isolated-60753634.jpg");
//                    bitmap = BitmapFactory.decodeStream(url.openStream());
//                } catch (MalformedURLException e) {
//                    e.printStackTrace();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//                final Bitmap finalBitmap = bitmap;
//                runOnUiThread(new Runnable() {
//                    @Override
//                    public void run() {
//                        imageView.setImageBitmap(finalBitmap);
//                    }
//                });
//            }
//        }).start();

    }
}
