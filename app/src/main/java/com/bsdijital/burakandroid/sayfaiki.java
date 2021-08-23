package com.bsdijital.burakandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.net.Uri;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.google.android.material.navigation.NavigationView;

public class sayfaiki extends AppCompatActivity {

    DrawerLayout drawerLayout;
    ActionBarDrawerToggle actionBarDrawerToggle;
    NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sayfaiki);

        ImageView img = (ImageView)findViewById(R.id.resim1);
        img.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(sayfaiki.this, web_sayfasi.class);

                startActivity(intent);
            }
        });


        ImageView img2 = (ImageView)findViewById(R.id.resim2);
        img2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(sayfaiki.this, social_media.class);

                startActivity(intent);
            }
        });




        this.setTitle("BS DİJİTAL");

        setUpToolbar();
        navigationView = (NavigationView) findViewById(R.id.navigation_menu);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId())
                {
                    case  R.id.nav_home:

                        Intent intent = new Intent(sayfaiki.this, sayfaiki.class);
                        startActivity(intent);
                        break;


                    case  R.id.instagram:

                        Intent a = new Intent();
                        a.setAction(Intent.ACTION_VIEW);
                        a.addCategory(Intent.CATEGORY_BROWSABLE);
                        a.setData(Uri.parse("https://www.instagram.com/bs_dijital/"));
                        startActivity(a);
                        break;


                    case  R.id.about_us:

                        Intent b = new Intent(sayfaiki.this, about_us.class);
                        startActivity(b);
                        break;



                    case  R.id.contact:

                        Intent y = new Intent(sayfaiki.this, iletisim_sayfasi.class);
                        startActivity(y);
                        break;

//Paste your privacy policy link

//                    case  R.id.nav_Policy:{
//
//                        Intent browserIntent  = new Intent(Intent.ACTION_VIEW , Uri.parse(""));
//                        startActivity(browserIntent);
//
//                    }
                    //       break;

                }
                return false;
            }
        });
    }
    public void setUpToolbar() {
        drawerLayout = findViewById(R.id.drawerLayout);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.app_name, R.string.app_name);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();

    }
}
