package com.bytedance.videoplayer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.VideoView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {
    private VideoView vv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        ImageView imageView = findViewById(R.id.imageView);
//        String url = "https://s3.pstatp.com/toutiao/static/img/logo.271e845.png";
//        Glide.with(this).load(url).into(imageView);

        vv = findViewById(R.id.vv);
        vv.setVideoPath(getVideoPath(R.raw.bytedance));
        MediaController mc = new MediaController(this);
        vv.setMediaController(mc);
        vv.start();
    }

    private String getVideoPath(int resId){
        return "android.resource://" + this.getPackageName() + "/" +resId;
    }
}
