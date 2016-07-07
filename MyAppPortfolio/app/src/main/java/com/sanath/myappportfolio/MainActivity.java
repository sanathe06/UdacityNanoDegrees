package com.sanath.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button mButtonPopularMovies = (Button) findViewById(R.id.button_popular_movies);
        mButtonPopularMovies.setOnClickListener(this);
        Button mButtonStockHawk = (Button) findViewById(R.id.button_stock_hawk);
        mButtonStockHawk.setOnClickListener(this);
        Button mButtonBuildItBigger = (Button) findViewById(R.id.button_build_it_bigger);
        mButtonBuildItBigger.setOnClickListener(this);
        Button mButtonMakeMaterial = (Button) findViewById(R.id.button_make_you_app_material);
        mButtonMakeMaterial.setOnClickListener(this);
        Button mButtonGoUbiquitous = (Button) findViewById(R.id.button_go_ubiquitous);
        mButtonGoUbiquitous.setOnClickListener(this);
        Button mButtonCapstone = (Button) findViewById(R.id.button_capstone);
        mButtonCapstone.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        String appName;
        switch (id) {
            case R.id.button_popular_movies:
                appName = getString(R.string.popular_movies);
                break;
            case R.id.button_stock_hawk:
                appName = getString(R.string.stock_hawk);
                break;
            case R.id.button_build_it_bigger:
                appName = getString(R.string.build_it_bigger);
                break;
            case R.id.button_make_you_app_material:
                appName = getString(R.string.make_your_app_material);
                break;
            case R.id.button_go_ubiquitous:
                appName = getString(R.string.go_ubiquitous);
                break;
            case R.id.button_capstone:
                appName = getString(R.string.capstone);
                break;
            default:
                return;
        }
        Toast.makeText(this, String.format(getString(R.string.msg_format), appName), Toast.LENGTH_LONG).show();
    }
}
