package com.example.roxanap.invisibleme;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by roxanap on 15.01.2016.
 */
public class HomeActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView helloTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);
        Intent intent = getIntent();
        String email = intent.getStringExtra("email");
        helloTextView = (TextView) findViewById(R.id.hello);
        helloTextView.setText(email);


    }
    @Override
    public void onClick(View v) {

    }
}
