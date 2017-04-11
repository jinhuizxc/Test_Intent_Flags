package com.example.jh.test_intent_flags;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * Created by jinhui  on 2017/4/11
 * 邮箱: 1004260403@qq.com
 */

public class Four extends AppCompatActivity {

    private static final String TAG = "Four";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e(TAG,"onCreate---------1");
        setContentView(R.layout.four);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Four.this, ForgetPassActivity.class);
                i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(i);
            }
        });

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(TAG,"onRestart-------2");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG,"onDestroy--------3");
    }

}
