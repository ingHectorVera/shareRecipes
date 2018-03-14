package com.example.verahector.sharerecipes.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.verahector.sharerecipes.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Login_Activity extends AppCompatActivity implements View.OnClickListener{

    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mAuth = FirebaseAuth.getInstance();

        setUI();
    }

    @Override
    protected void onStart() {
        super.onStart();

        FirebaseUser currentUser = mAuth.getCurrentUser();
        updateUI(currentUser);
    }

    @Override
    public void onClick(View v) {

    }

    private void setUI() {

    }

    private void updateUI(FirebaseUser currentUser) {
        if (currentUser != null) {
            String userName = currentUser.getDisplayName();
            String email = currentUser.getEmail();
            Intent intent = new Intent(getApplicationContext(), Menu_Activity.class);
            intent.putExtra("userName", userName);
            intent.putExtra("email", email);
            startActivity(intent);
        } else {

        }
    }

}
