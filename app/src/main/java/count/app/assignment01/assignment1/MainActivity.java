package count.app.assignment01.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import count.app.assignment01.R;
import count.app.assignment01.assignment2.FragmentTest;

public class MainActivity extends AppCompatActivity {

    Button btn;
    TextView name,phonenum,mailid,gen,dept;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.submit);
        name=findViewById(R.id.name2);
        phonenum=findViewById(R.id.phone);
        mailid=findViewById(R.id.email);
        gen=findViewById(R.id.gender);
        dept=findViewById(R.id.department);
        Bundle data = getIntent().getExtras();
        String Name=data.getString("Name");
        String phone=data.getString("Phone");
        String mail=data.getString("Email");
        String gend=data.getString("Gender");
        String dep=data.getString("Department");
        name.setText("Name:    " + Name);
        phonenum.setText("Phone:    "+phone);
        mailid.setText("Email:    " +mail);
        gen.setText("Gender:    "+gend);
        dept.setText("Department:    "+dep);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, FragmentTest.class);
                startActivity(intent);
            }
        });
    }
}