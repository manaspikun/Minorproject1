package com.techpalle.minorproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class Main3Activity extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener {
    YouTubePlayerView youTubePlayerView;
   String video_id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Intent intent = getIntent();
        Bundle bundle=intent.getExtras();
      // int video_id= bundle.getInt("video_id");
         video_id=bundle.getString("video_id");


        youTubePlayerView = (YouTubePlayerView) findViewById(R.id.youtube);
        //initialize youtube with google api key
        youTubePlayerView.initialize("AIzaSyAJGtSoLHpG_5-qkS5tGVnPAqODWXmotbo", this);
    }

    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
        Toast.makeText(Main3Activity.this,video_id,Toast.LENGTH_LONG).show();

        youTubePlayer.loadVideo(video_id);
    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult)
    {
        Toast.makeText(Main3Activity.this, "Video loading failed", Toast.LENGTH_SHORT).show();
    }
}