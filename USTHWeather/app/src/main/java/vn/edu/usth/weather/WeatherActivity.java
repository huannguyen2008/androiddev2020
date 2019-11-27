package vn.edu.usth.weather;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.util.Log;

import com.google.android.material.tabs.TabLayout;

public class WeatherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        Log.i("tag_info", "onCreate: hey hey! onCreate is coming to town");
        PagerAdapter adapter = new WeatherAndForecastFragmentPagerAdapter(getSupportFragmentManager());
        ViewPager pager = findViewById(R.id.pager);
        pager.setOffscreenPageLimit(3);
        pager.setAdapter(adapter);
        TabLayout tabLayout = findViewById(R.id.tab);
        tabLayout.setupWithViewPager(pager);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("tag_info", "onStart: onStart is coming too ");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("tag_info", "onResume: onResume is coming with it ");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("tag_info", "onResume: onPause is coming with it ");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("tag_info", "onResume: onDestroy is coming with it ");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("tag_info", "onResume: onDestroy is coming with it ");

    }
}
