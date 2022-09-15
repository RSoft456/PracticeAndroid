package count.app.assignment01.sharedpreference;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import count.app.assignment01.R;

public class SharedPreferenceActivity extends AppCompatActivity {
    Button Sharedbtn;
    EditText username, password;
    SharedPreferences sharedPreference;
    SharedPreferences.Editor editor;
    TextView text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_preference);
        initSHaredPref();

        Sharedbtn = findViewById(R.id.SharedButton);
        username = findViewById(R.id.SharedUserName);
        password = findViewById(R.id.SharedPassword);
        text = findViewById(R.id.SharedPrefData);
        Sharedbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = username.getText().toString();
                String pass = password.getText().toString();
//                Toast toast =Toast.makeText(SharedPreferenceActivity.this,"Name:"+ name+"Password: "+pass,Toast.LENGTH_SHORT);
//                toast.show();
                PutSharedPref(name, pass);
                getSharedPre();
            }
        });
        getSharedPre();

    }

    private void getSharedPre() {
        String name= sharedPreference.getString("Studentname","");
        String pass=sharedPreference.getString("StudentPass","");
        text.setText("Name: "+ name+" ; "+"Pass: "+pass);
    }

    private void initSHaredPref() {
        sharedPreference = getSharedPreferences("my_Pref", MODE_PRIVATE);
        editor = sharedPreference.edit();

    }

    private void PutSharedPref(String Name, String Password) {
        editor.putString("Studentname", Name);
        editor.putString("StudentPass", Password);
        editor.apply();
    }
}