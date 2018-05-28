package com.jan.janhackathon;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.viewpagerindicator.CirclePageIndicator;

public class MainActivity extends AppCompatActivity {
    private PagerAdapter pagerAdapter;
    private ViewPager drawablePager;
    private CirclePageIndicator pageIndicator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        drawablePager =findViewById(R.id.vp_create_drawable);
        pagerAdapter = new DrawablePagerAdapter();
        drawablePager.setAdapter(pagerAdapter);
        pageIndicator = findViewById(R.id.vpi_create_drawable);
        pageIndicator.setViewPager(drawablePager);
    }

    public void goToSignInPage(View view) {
        startActivity(new Intent(MainActivity.this, LoginActivity.class));
    }

    public void goToSignUpPage(View view) {
        startActivity(new Intent(MainActivity.this, SignUpActivity.class));
    }

    public void goToDashBoard(View view) {
        startActivity(new Intent(MainActivity.this, DashBoard.class));
    }

    private class DrawablePagerAdapter extends PagerAdapter {

        @Override
        public int getCount() {
            return 3;
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            LayoutInflater inflater = LayoutInflater.from(MainActivity.this);
            ImageView pagerItem = (ImageView) inflater.inflate(R.layout.item_drawable_pager,
                    container,
                    false);

            switch (position) {
                case 0:
                    pagerItem.setImageResource(R.drawable.ic_jan_one);
                    break;
                case 1:
                    pagerItem.setImageResource(R.drawable.ic_jan_two);
                    break;
                case 2:
                    pagerItem.setImageResource(R.drawable.ic_jan_three);
                    break;
            }

            container.addView(pagerItem);
            return pagerItem;
        }

        @Override
        public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
            return view == object;
        }
        @Override
        public void destroyItem(ViewGroup collection, int position, Object view) {
            collection.removeView((View) view);
        }
    }
}
