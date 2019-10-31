package com.example.responsi;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FragmentActivity extends AppCompatActivity {

    Button btnfragment1, btnfragment2;
    TextView user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        user = findViewById(R.id.tvuser);
        btnfragment1 = findViewById(R.id.btnfragment1);
        btnfragment2 = findViewById(R.id.btnfragment2);

        Intent intent = getIntent();
        user.setText(intent.getStringExtra("NAMA"));



        btnfragment1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FragmentActivity.this, SatuFragment.class);
                startActivity(intent);
            }
        });

        btnfragment2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FragmentActivity.this, DuaFragment.class);
                startActivity(intent);
            }
        });
    }
    private void loadFragment (Fragment fragment){
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();

        fragmentTransaction.replace(R.id.FrameLayout, fragment);
        fragmentTransaction.commit();
    }
}
