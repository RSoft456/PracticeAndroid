package count.app.assignment01.assignment3;

import androidx.appcompat.app.AppCompatActivity;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.widget.FrameLayout;

import count.app.assignment01.R;

public class ActivityFrameLayoutView2 extends AppCompatActivity {
    FragmentManager FM;
    FragmentTransaction FT;
    FrameLayout f1;
    FrameLayout f2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_frame_layout_view2);
        f1=findViewById(R.id.FL1);
        f2=findViewById(R.id.FL2);
        FM=getFragmentManager();
        FT=FM.beginTransaction();
        FT= FT.add(R.id.FL1,new FragmentA());
        FT.commit();
        FM=getFragmentManager();
        FT=FM.beginTransaction();
        FT= FT.add(R.id.FL2,new FragmentB());
        FT.commit();
    }
}