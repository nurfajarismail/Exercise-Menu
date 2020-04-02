package com.example.exercise_menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button blog;
    EditText nama,sandi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        blog=(Button)findViewById(R.id.btnok);
        nama= (EditText) findViewById(R.id.editname);
        sandi= (EditText) findViewById(R.id.editPass);
        blog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(nama.getText().toString().equals("admin") &&
                sandi.getText().toString().equals("123")){
                    startActivity(new Intent(MainActivity.this, main2.class));
                    Toast.makeText(getApplicationContext(),"bisa sign in",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getApplicationContext(),"Password Salah",Toast.LENGTH_SHORT).show();

                }
            }
        });





    }
}
