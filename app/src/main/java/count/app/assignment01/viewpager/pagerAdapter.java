package count.app.assignment01.viewpager;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class pagerAdapter extends FragmentPagerAdapter {
    ArrayList<Fragment> fragmentArrayList;
    ArrayList<String> StringList;

    public pagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
        fragmentArrayList = new ArrayList<>();
        StringList=new ArrayList<>();
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragmentArrayList.get(position);
    }

    public void addFragment(Fragment fragment , String title) {
        fragmentArrayList.add(fragment);
        StringList.add(title);
    }


    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return StringList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentArrayList.size();
    }
}
