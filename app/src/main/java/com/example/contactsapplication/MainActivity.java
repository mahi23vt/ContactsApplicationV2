package com.example.contactsapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.contactsapplication.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding activityMainBinding;
    MainActivityClickHandlers clickHandler;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        clickHandler = new MainActivityClickHandlers(this);
        activityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        activityMainBinding.setClickHandler(clickHandler);


    }
    public class MainActivityClickHandlers{
        Context context;

        public MainActivityClickHandlers(Context context) {
            this.context = context;
        }
        // onFABClicked
        public void onFABClicked(View view)
        {
            Intent i = new Intent(MainActivity.this,AddNewContactActivity.class);
            startActivityForResult(i,1);
            Toast.makeText(context, "FAB Clicked", Toast.LENGTH_SHORT).show();
        }
    }
}