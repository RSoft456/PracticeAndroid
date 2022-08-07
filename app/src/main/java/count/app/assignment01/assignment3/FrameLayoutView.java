package count.app.assignment01.assignment3;

import androidx.appcompat.app.AppCompatActivity;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import count.app.assignment01.R;
import count.app.assignment01.assignment3.FragmentA;
import count.app.assignment01.assignment3.FragmentB;

public class FrameLayoutView extends AppCompatActivity {
    FrameLayout FL;
    FragmentManager FM;
    FragmentTransaction FT;
    Button replace;
    int setter = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_layout_view);
        replace = findViewById(R.id.Replace);
        FM = getFragmentManager();
        FT = FM.beginTransaction();
        FT = FT.add(R.id.FL, new FragmentA());
        FT.commit();
        replace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (setter == 1) {
                    FM = getFragmentManager();
                    FT = FM.beginTransaction();
                    FT = FT.add(R.id.FL, new FragmentB());
                    FT.commit();
                    setter = 2;
                } else {
                    FM = getFragmentManager();
                    FT = FM.beginTransaction();
                    FT = FT.add(R.id.FL, new FragmentA());
                    FT.commit();
                    setter = 1;
                }
            }
        });
    }
}