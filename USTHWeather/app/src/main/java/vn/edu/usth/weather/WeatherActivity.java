package vn.edu.usth.weather;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
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
        MediaPlayer mediaplayer = MediaPlayer.create(WeatherActivity.this,R.raw.musicbackground);
        mediaplayer.start();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Toast.makeText(this, R.string.refresh_toast, Toast.LENGTH_SHORT).show();
        return true;
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
