package com.example.responsi;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.responsi.helper.SharedPref;

public class LoginActivity extends AppCompatActivity {

    Button login;
    EditText nama, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        login = findViewById(R.id.btnlogin);
        nama = findViewById(R.id.etnama);
        password = findViewById(R.id.etpassword);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usernameKey = nama.getText().toString();
                String passwordKey = password.getText().toString();

                if (usernameKey.equals("admin") && passwordKey.equals("admin123")){
                    Toast.makeText(getApplicationContext(), "BERHASIL", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(LoginActivity.this, FragmentActivity.class);
                    startActivity(intent);
                    finish();
                }else {
                    AlertDialog.Builder builder = new AlertDialog.Builder(LoginActivity.this);
                    builder.setMessage("Username atau Password anda salah").setNegativeButton("Retry", null).create().show();

                }
            }
        });
    }
}
