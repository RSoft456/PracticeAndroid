package count.app.assignment01.assignment4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import count.app.assignment01.R;
import count.app.assignment01.assignment2.Constants;

public class SignUp extends AppCompatActivity {
    Button SuBtn;
    EditText name, email, phone, pass, repass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        SuBtn = findViewById(R.id.su);
        name = findViewById(R.id.suName);

        email = findViewById(R.id.suEmail);

        phone = findViewById(R.id.suPhone);

        pass = findViewById(R.id.suPass);

        repass = findViewById(R.id.suRePass);

        SuBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String NAME = name.getText().toString();
                String EMAIL = email.getText().toString();
                String PHONE = phone.getText().toString();
                String PASS = pass.getText().toString();
                String REPASS = repass.getText().toString();
                if (!NAME.equals("")) {
                    if (!EMAIL.equals("")) {
                        if (!PHONE.equals("")) {
                            if (!PASS.equals("")) {
                                if (!REPASS.equals("")) {
                                    if (PASS.equals(REPASS)) {
                                        Constants.studentName = NAME;
                                        Constants.studentEmail = EMAIL;
                                        Constants.studentphone = PHONE;
                                        Constants.studentPassowrd = PASS;
                                        Toast toast = Toast.makeText(SignUp.this, "Signup complete ", Toast.LENGTH_LONG);
                                        toast.show();
                                        finish();
                                    } else {
                                        Toast toast = Toast.makeText(SignUp.this, "Passwords unmatched", Toast.LENGTH_LONG);
                                        toast.show();
                                    }
                                } else {
                                    Toast toast = Toast.makeText(SignUp.this, "Please re-enter Password", Toast.LENGTH_LONG);
                                    toast.show();
                                }

                            } else {
                                Toast toast = Toast.makeText(SignUp.this, "Please enter Password", Toast.LENGTH_LONG);
                                toast.show();
                            }

                        } else {
                            Toast toast = Toast.makeText(SignUp.this, "Please enter Phone", Toast.LENGTH_LONG);
                            toast.show();
                        }

                    } else {
                        Toast toast = Toast.makeText(SignUp.this, "Please enter Email", Toast.LENGTH_LONG);
                        toast.show();
                    }

                } else {
                    Toast toast = Toast.makeText(SignUp.this, "Please enter Name", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });

    }
}