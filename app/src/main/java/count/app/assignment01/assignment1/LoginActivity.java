package count.app.assignment01.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import count.app.assignment01.R;
import count.app.assignment01.lab04.StudentList;

public class LoginActivity extends AppCompatActivity {

    EditText name, password, phone, email, gender, dept;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        name = findViewById(R.id.name);
        password = findViewById(R.id.Password);
        phone = findViewById(R.id.Phone);
        email = findViewById(R.id.Email);
        gender = findViewById(R.id.Gender);
        dept = findViewById(R.id.Department);

        login = findViewById(R.id.Loginbtn);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputname = name.getText().toString();
                String pass = password.getText().toString();
                String ph = phone.getText().toString();
                String mail = email.getText().toString();
                String gen = gender.getText().toString();
                String dep = dept.getText().toString();
                Intent intent = new Intent(LoginActivity.this, StudentList.class);
                startActivity(intent);
                /*if (!inputname.equals("")) {
                    if (!pass.equals("")) {
                        if (!ph.equals("")) {
                            if (!mail.equals("")) {
                                if (!gen.equals("")) {
                                    if (!dep.equals("")) {
                                        if (inputname.equals(Constants.name)) {
                                            if (pass.equals(Constants.password)) {
                                                    if (mail.equals(Constants.Email)) {
                                                                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                                                                Bundle data = new Bundle();
                                                                data.putString("Name", inputname);
                                                                data.putString("Phone",ph);
                                                                data.putString("Email",mail);
                                                                data.putString("Gender",gen);
                                                                data.putString("Department",dep);
                                                                intent.putExtras(data);
                                                                startActivity(intent);
                                                    } else {
                                                        Toast toast = Toast.makeText(LoginActivity.this, "Invalid Email", Toast.LENGTH_LONG);
                                                        toast.show();
                                                    }
                                            } else {
                                                Toast toast = Toast.makeText(LoginActivity.this, "Invalid Password", Toast.LENGTH_LONG);
                                                toast.show();
                                            }
                                        } else {
                                            Toast toast = Toast.makeText(LoginActivity.this, "Invalid Username", Toast.LENGTH_LONG);
                                            toast.show();
                                        }
                                    } else {
                                        Toast toast = Toast.makeText(LoginActivity.this, "Please enter department", Toast.LENGTH_LONG);
                                        toast.show();
                                    }

                                } else {
                                    Toast toast = Toast.makeText(LoginActivity.this, "Please enter gender", Toast.LENGTH_LONG);
                                    toast.show();
                                }

                            } else {
                                Toast toast = Toast.makeText(LoginActivity.this, "Please enter Email", Toast.LENGTH_LONG);
                                toast.show();
                            }

                        } else {
                            Toast toast = Toast.makeText(LoginActivity.this, "Please enter Phone number", Toast.LENGTH_LONG);
                            toast.show();
                        }

                    } else {
                        Toast toast = Toast.makeText(LoginActivity.this, "Please enter password", Toast.LENGTH_LONG);
                        toast.show();
                    }

                } else {
                    Toast toast = Toast.makeText(LoginActivity.this, "Please enter name", Toast.LENGTH_LONG);
                    toast.show();
                }*/


            }
        });
    }

}