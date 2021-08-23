
package com.bsdijital.burakandroid;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;









public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        EditText kullanici;
        EditText sifre;
        Button giris;
        Button kayit;

        kullanici = findViewById(R.id.kullaniciAdi);

        sifre = findViewById(R.id.sifre);

        giris = findViewById(R.id.girisYap);

        kayit = findViewById(R.id.kayitOl);


        giris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                startActivity(new Intent(MainActivity.this , Login.class));



            }
        });

        kayit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Kayit.class));
            }
        });




    }
}