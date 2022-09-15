package count.app.assignment01.database;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.List;

import count.app.assignment01.R;

public class InsertStudent extends AppCompatActivity {
Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert_student);
        //Object to be inserted in data base
        StudentEntity Studentobj= new StudentEntity();
        Studentobj.FirstName="Ramsha";
        Studentobj.LastName="Mehmood";
        Studentobj.EmailAddress="Ramsha456@gmail.com";
        Studentobj.PhoneNumber="03945634281";
        //Creating connection with database
        MyStudentDBClass db = Room.databaseBuilder(getApplicationContext(),MyStudentDBClass.class,"Student_Database").allowMainThreadQueries().build();
        btn=findViewById(R.id.DataInsert);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                db.studentDAO().InsertStudent(Studentobj);
                List<StudentEntity> data = db.studentDAO().getall();
                Toast.makeText(InsertStudent.this, "data size"+data.size(), Toast.LENGTH_SHORT).show();
            }
        });



    }
}