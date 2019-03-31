package com.example.verahector.sharerecipes.app;

import android.content.Context;
import android.content.Intent;

import com.example.verahector.sharerecipes.logIn.EmailPasswordActivity;

public class NavigationUtils {

    public static void goToEmailLogIn(Context context) {
        Intent intent = new Intent(context, EmailPasswordActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
    }
}
