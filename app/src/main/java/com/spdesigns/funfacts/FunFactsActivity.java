package com.spdesigns.funfacts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class FunFactsActivity extends AppCompatActivity {

  public static final String TAG = FunFactsActivity.class.getSimpleName();
  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
  }
}
