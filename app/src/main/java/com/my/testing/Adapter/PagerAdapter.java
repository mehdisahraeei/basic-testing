package com.my.testing.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.my.testing.Fragments.First;
import com.my.testing.Fragments.Second;

public class PagerAdapter extends FragmentStateAdapter {



    public PagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position)
        {
            case 0:
                return new First();
            default:
                return new Second();
        }
    }


    @Override
    public int getItemCount() {
        return 2;
    }
}
