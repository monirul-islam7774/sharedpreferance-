package com.example.monirul.register;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    private Button button;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

    button = findViewById(R.id.registerButtonId);
    textView = findViewById(R.id.textViewId);

    button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(HomeActivity.this,RegisterActivity.class);
            startActivityForResult(intent,1);
        }
    });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 1){
            SharedPreferences sharedPreferences = getSharedPreferences("key", Context.MODE_PRIVATE);
            String name = sharedPreferences.getString("name","");

            String value = data.getStringExtra("key");
            textView.setText(value);
        }
    }
}
