package com.example.zineddine.weatherapp;

import android.app.Activity;
import android.content.SharedPreferences;

/**
 * Created by Zineddine on 15/04/2018.
 */

public class MyCity {
    SharedPreferences prefs;

    public MyCity(Activity activity){
        prefs = activity.getPreferences(Activity.MODE_PRIVATE);
    }

    // Si l'utilisateur n'a pas choisi de ville, return
    // Paris
    String getCity(){
        return prefs.getString("city", "Paris, FR");
    }

    void setCity(String city){
        prefs.edit().putString("city", city).commit();
    }
}
