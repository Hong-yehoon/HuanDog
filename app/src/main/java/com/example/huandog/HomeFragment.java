package com.example.huandog;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import java.util.Arrays;
import java.util.List;

public class HomeFragment extends Fragment {

    TabLayout tablayout;
    ViewPager2 viewPager2;
    FragmentStateAdapter pagerAdapter;

    final List<String> tabTitle = Arrays.asList("State","Timeline");

    @Nullable
    @Override
    public View onCreateView( LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        ViewGroup viewGroup = (ViewGroup) inflater.inflate(R.layout.main_fragment_home, container, false);

        tablayout = (TabLayout)viewGroup.findViewById(R.id.home_tabLayout);
        viewPager2 = (ViewPager2)viewGroup.findViewById(R.id.home_viewPager);

        //Adapter
        pagerAdapter = new ViewPagerAdapter(this);
        viewPager2.setAdapter(pagerAdapter);


        /*tablayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager2.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });*/

        return viewGroup;
    }

    @Override
    public void onViewCreated( View view, Bundle savedInstanceState) {
        TabLayout tabLayout = view.findViewById(R.id.home_tabLayout);
        new TabLayoutMediator(tabLayout, viewPager2, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(TabLayout.Tab tab, int position) {

                TextView textview = new TextView(getContext());
                textview.setText(tabTitle.get(position));
                textview.setTextSize(17);
                textview.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
                tab.setCustomView(textview);

            }
        }).attach();
    }
}
