package com.example.contactsapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.contactsapplication.databinding.ActivityAddNewContactBinding;

public class AddNewContactActivity extends AppCompatActivity {
    ActivityAddNewContactBinding activityAddNewContactBinding;
    AddNewContactActivityClickHandlers clickHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_contact);
        activityAddNewContactBinding = DataBindingUtil.setContentView(this,R.layout.activity_add_new_contact);
        clickHandler = new AddNewContactActivityClickHandlers(this);
        activityAddNewContactBinding.setClickHandler(clickHandler);

    }
    
    public class AddNewContactActivityClickHandlers{
        Context context;

        public AddNewContactActivityClickHandlers(Context context) {
            this.context = context;
        }
        // on Submit Button Clicked
        public void onSubmitClicked(View view)
        {
            Toast.makeText(context, "Submit Button clicked", Toast.LENGTH_SHORT).show();
        }
    }

}