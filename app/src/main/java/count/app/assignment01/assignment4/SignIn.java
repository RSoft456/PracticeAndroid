package count.app.assignment01.assignment4;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import count.app.assignment01.R;
import count.app.assignment01.assignment2.Constants;

public class SignIn extends AppCompatActivity {
    Button signInBtn;
    EditText email, password;
    TextView signUpText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        signInBtn = findViewById(R.id.si);
        email = findViewById(R.id.siEmail);

        password = findViewById(R.id.siPassword);

        signUpText = findViewById(R.id.siSu);

        signInBtn.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                String MAIL = email.getText().toString();
                String PASSWORD = password.getText().toString();
                if (!MAIL.equals("")) {
                    if (!PASSWORD.equals("")) {
                        if (MAIL.equals(Constants.firstTeacheremail) || MAIL.equals(Constants.secondTeacheremail) || MAIL.equals(Constants.studentEmail)) {
                           if((MAIL.equals(Constants.firstTeacheremail) && PASSWORD.equals(Constants.firstTeacheremail)) || (MAIL.equals(Constants.secondTeacheremail) && PASSWORD.equals(Constants.secondTeacherpassowrd)) ||(MAIL.equals(Constants.studentEmail) && PASSWORD.equals(Constants.studentPassowrd))){
                               Intent intent = new Intent(SignIn.this, DataListFragment.class);
                               intent.putExtra("Email1", MAIL);
                               startActivity(intent);
                           }
                           else{
                               Toast toast = Toast.makeText(SignIn.this, "Invalid Password", Toast.LENGTH_LONG);
                               toast.show();
                           }
                        } else {
                            Toast toast = Toast.makeText(SignIn.this, "Invalid Email", Toast.LENGTH_LONG);
                            toast.show();
                        }
                    } else {
                        Toast toast = Toast.makeText(SignIn.this, "Please enter password", Toast.LENGTH_LONG);
                        toast.show();
                    }
                } else {
                    Toast toast = Toast.makeText(SignIn.this, "Please enter email", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });
        signUpText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignIn.this, SignUp.class);
                startActivity(intent);
            }
        });
    }
}