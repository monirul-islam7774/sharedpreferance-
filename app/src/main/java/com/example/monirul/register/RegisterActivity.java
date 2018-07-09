package com.example.monirul.register;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {
    private Button saveBtn;
    private EditText nameEdit,emailEdit,phoneEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        saveBtn = findViewById(R.id.saveButtonId);
        nameEdit = findViewById(R.id.editTextNameId);
        emailEdit = findViewById(R.id.editTextMailId);
        phoneEdit = findViewById(R.id.editTextPhoneId);

        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String value = nameEdit.getText().toString();
                Intent intent = new Intent(RegisterActivity.this,HomeActivity.class);
                intent.putExtra("key",value);
                setResult(1,intent);
                finish();
            }
        });

    }
}
