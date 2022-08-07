package count.app.assignment01.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import count.app.assignment01.R;
//import count.app.assignment01.StudentFragment;

public class FragmentTest extends AppCompatActivity {
    Button btn;
    FrameLayout fR;
    FragmentManager FM;
    FragmentTransaction FT;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_test);
        btn=findViewById(R.id.StuActbtn);
        fR=findViewById(R.id.framelayourStyAc);
        FM=getFragmentManager();
        FT=FM.beginTransaction();
        FT.add(R.id.framelayourStyAc,new StudentFragment());
        FT.commit();
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FM=getFragmentManager();
                FT=FM.beginTransaction();
                FT.replace(R.id.framelayourStyAc,new StudentBFragment());
                FT.commit();
            }
        });
    }

}