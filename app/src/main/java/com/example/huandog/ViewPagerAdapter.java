package com.example.huandog;


import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ViewPagerAdapter extends FragmentStateAdapter {

    public ViewPagerAdapter(Fragment fragment) {
        super(fragment);

    }

    @Override
    public int getItemCount() {
        return 2;
    }

    @Override
    public Fragment createFragment(int position) {

        switch (position){
            case 0 :
                StatePager statePager = new StatePager();
                return statePager;

            case 1:
                TimelinePager timelinePager = new TimelinePager();
                return timelinePager;
        }
        return  createFragment(position);
    }

}
