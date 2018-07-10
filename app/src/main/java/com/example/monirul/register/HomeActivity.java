package com.example.monirul.register;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {

    private Button button;
    private ListView listView;
    ArrayList<String> contacts;
    ArrayAdapter<String> adapter = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

    button = findViewById(R.id.registerButtonId);
    listView = findViewById(R.id.listViewId);
    this.contacts = new ArrayList<>();
    adapter = new ArrayAdapter<>(HomeActivity.this,R.layout.sample_view,R.id.textView,contacts);


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

            String value = data.getStringExtra("name");
            contacts.add(value);
            listView.setAdapter(adapter);

        }
    }


}
