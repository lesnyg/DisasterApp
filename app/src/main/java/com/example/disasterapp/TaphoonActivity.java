package com.example.disasterapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TaphoonActivity extends BasicActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taphoon);

        toolbarAct();


        findViewById(R.id.typhoonsIng_tv).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), TyphoonIngActivity.class));
            }
        });


    }
}