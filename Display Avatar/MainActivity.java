package com.example.displayavatar;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;
import com.bumptech.glide.request.RequestOptions;

public class MainActivity extends AppCompatActivity {
    private ImageView avatarImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        avatarImageView = findViewById(R.id.avatarImageView);
        String avatarUrl = "https://vectorified.com/images/avatar-icon-png-13.png";
        Glide.with(this)
                .load(avatarUrl)
                .apply(new RequestOptions().circleCrop())
                .transition(DrawableTransitionOptions.withCrossFade())
                .placeholder(R.drawable.placeholder_image)
                .error(R.drawable.error_image)
                .into(avatarImageView);
    }
}
