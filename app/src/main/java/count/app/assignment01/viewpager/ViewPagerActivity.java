package count.app.assignment01.viewpager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import count.app.assignment01.R;

public class ViewPagerActivity extends AppCompatActivity {
    ViewPager viewPager;
    TabLayout tabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);
        initviewpager();
    }

    private void initviewpager() {
        viewPager = findViewById(R.id.StudentViewPager);
        tabLayout=findViewById(R.id.TabLayout);

        pagerAdapter object=new pagerAdapter(getSupportFragmentManager());
        object.addFragment(new A(),"Fargment A");
        object.addFragment(new B(),"Fragment B");
        object.addFragment(new C(),"Fragment C");
        object.addFragment(new D(),"Fragment D");
        viewPager.setAdapter(object);
        //To initialise all fragments at a time
        //viewPager.setOffscreenPageLimit(2);
        tabLayout.setupWithViewPager(viewPager);
    }
}

