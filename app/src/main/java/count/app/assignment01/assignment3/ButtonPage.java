package count.app.assignment01.assignment3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import count.app.assignment01.R;

public class ButtonPage extends AppCompatActivity {
    Button A, B, C;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_page);
        A = findViewById(R.id.ContainerView);
        B= findViewById(R.id.FrameLayoutView);
        C= findViewById(R.id.FrameLayoutView2);
        A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ButtonPage.this, ContainerView.class);
                startActivity(intent);
            }
        });
        B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ButtonPage.this, FrameLayoutView.class);
                startActivity(intent);
            }
        });
        C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ButtonPage.this, ActivityFrameLayoutView2.class);
                startActivity(intent);
            }
        });
    }
}