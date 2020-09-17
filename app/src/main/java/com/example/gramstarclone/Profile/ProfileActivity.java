package com.example.gramstarclone.Profile;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ProgressBar;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentTransaction;

import com.example.gramstarclone.R;
import com.example.gramstarclone.Utils.BottomNavigationViewHelper;
import com.example.gramstarclone.Utils.GridImageAdapter;
import com.example.gramstarclone.Utils.UniversalImageLoader;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ProfileActivity extends AppCompatActivity{
    private static final String TAG = "ProfileActivity";
    private static final int ACTIVITY_NUM = 4;
    private static final int NUM_GRID_COLUMNS = 3;

    private Context mContext = ProfileActivity.this;

    private ProgressBar mProgressBar;
    private ImageView profilePhoto;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        Log.d(TAG, "onCreate: started.");

        init();


//        setupBottomNavigationView();
//        setupToolbar();
//        setupActivityWidgets();
//        setProfileImage();
//        tempGridSetup();

    }

    private void init(){
        Log.d(TAG, "init: inflating " + getString(R.string.profile_fragment));

        ProfileFragment fragment = new ProfileFragment();
        FragmentTransaction transaction = ProfileActivity.this.getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.container, fragment);
        transaction.addToBackStack(getString(R.string.profile_fragment));
        transaction.commit();
    }

//    private void tempGridSetup(){
//        ArrayList<String> imgURLs = new ArrayList<>();
//            imgURLs.add("https://img.theqoo.net/img/midMZ.jpg");
//            imgURLs.add("https://img.insight.co.kr/static/2019/11/05/700/o05x4z6gdt2hlcx358yg.jpg");
//            imgURLs.add("https://idolbest.net/data/file/girl_iu/2038948950_QRb9nU6G_f82b79b1b4677f7d53e4a8c2727408de426a2a72.jpeg");
//            imgURLs.add("https://img.insight.co.kr/static/2019/11/05/700/o05x4z6gdt2hlcx358yg.jpg");

//
//        setupImageGrid(imgURLs);
//    }
//
//    private void setupImageGrid(ArrayList<String> imgURLs){
//        GridView gridView = (GridView) findViewById(R.id.gridView);
//
//        int gridWidth = getResources().getDisplayMetrics().widthPixels;
//        int imageWidth = gridWidth/NUM_GRID_COLUMNS;
//        gridView.setColumnWidth(imageWidth);
//
//        GridImageAdapter adapter = new GridImageAdapter(mContext, R.layout.layout_grid_imageview, "", imgURLs);
//        gridView.setAdapter(adapter);
//    }
//
//    private void setProfileImage(){
//        Log.d(TAG, "setProfileImage: setting profile photo.");
//        String imgURL = "www.androidcentral.com/sites/androidcentral.com/files/styles/xlarge/public/article_images/2016/08/ac-lloyd.jpg?itok=bb72IeLf";
//        UniversalImageLoader.setImage(imgURL, profilePhoto, mProgressBar, "https://");
//    }
//
//    private void setupActivityWidgets(){
//        mProgressBar = (ProgressBar) findViewById(R.id.profileProgressBar);
//        mProgressBar.setVisibility(View.GONE);
//        profilePhoto = (ImageView) findViewById(R.id.profile_photo);
//
//    }
//
//    /**
//     * Responsible for setting up the profile toolbar
//     */
//    private void setupToolbar(){
//        Toolbar toolbar = (Toolbar) findViewById(R.id.profileToolBar);
//        setSupportActionBar(toolbar);
//
//        ImageView profileMenu = (ImageView) findViewById(R.id.profileMenu);
//        profileMenu.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.d(TAG, "onClick: navigating to account settings.");
//                Intent intent = new Intent(mContext, AccountSettingsActivity.class);
//                startActivity(intent);
//            }
//        });
//    }
//
//    /**
//     * BottomNavigationView setup
//     */
//    private void setupBottomNavigationView(){
//        Log.d(TAG, "setupBottomNavigationView: setting up BottomNavigationView");
//        BottomNavigationViewEx bottomNavigationViewEx = (BottomNavigationViewEx) findViewById(R.id.bottomNavViewBar);
//        BottomNavigationViewHelper.setupBottomNavigationView(bottomNavigationViewEx);
//        BottomNavigationViewHelper.enableNavigation(mContext, bottomNavigationViewEx);
//        Menu menu = bottomNavigationViewEx.getMenu();
//        MenuItem menuItem = menu.getItem(ACTIVITY_NUM);
//        menuItem.setChecked(true);
//    }

}