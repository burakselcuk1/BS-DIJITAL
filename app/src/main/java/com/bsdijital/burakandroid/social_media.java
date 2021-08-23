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


import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;
import java.util.List;

public class social_media extends AppCompatActivity {

    DrawerLayout drawerLayout;
    ActionBarDrawerToggle actionBarDrawerToggle;
    NavigationView navigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_social_media);


        ImageSlider av=findViewById(R.id.imageSlider);




        List<SlideModel> slideModels=new ArrayList<>();


        slideModels.add(new SlideModel(R.drawable.resim1, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.resim2, ScaleTypes.FIT));

        slideModels.add(new SlideModel(R.drawable.resim3, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.resim4, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.resim5, ScaleTypes.FIT));




        av.setImageList(slideModels,ScaleTypes.FIT);






        this.setTitle("BS DİJİTAL");

        setUpToolbar();
        navigationView = (NavigationView) findViewById(R.id.navigation_menu);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId())
                {
                    case  R.id.nav_home:

                        Intent intent = new Intent(social_media.this, sayfaiki.class);
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

                        Intent b = new Intent(social_media.this, about_us.class);
                        startActivity(b);
                        break;



                    case  R.id.contact:

                        Intent y = new Intent(social_media.this, iletisim_sayfasi.class);
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
