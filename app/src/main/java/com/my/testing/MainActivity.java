package com.my.testing;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.viewpager2.widget.ViewPager2;
import android.os.Bundle;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.my.testing.Adapter.PagerAdapter;



public class MainActivity extends AppCompatActivity {

    private ViewPager2 viewPager2;
    private TabLayout tabLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager2 = findViewById(R.id.viewPager2);
        tabLayout = findViewById(R.id.tablayout1);
        viewPager2.setAdapter(new PagerAdapter(this));


        TabLayoutMediator mediator = new TabLayoutMediator(tabLayout, viewPager2, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                switch (position) {
                    case 0: {
                        tab.setText("first");
                        tab.setIcon(R.drawable.first);

                        BadgeDrawable bd = tab.getOrCreateBadge();
                        bd.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.teal_700));
                        bd.setVisible(true);
                        bd.setNumber(1);
                        break;
                    }
                    case 1: {
                        tab.setText("second");
                        tab.setIcon(R.drawable.second);
                        break;
                    }
                }
            }
        });
        mediator.attach();


    }
}