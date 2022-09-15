package count.app.assignment01.lab04;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import count.app.assignment01.R;

public class StudentList extends AppCompatActivity {
    TextView stutext;
    RecyclerView recycleview;
    ArrayList<Student> arraylist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_list);
        stutext= findViewById(R.id.stuTxt);
        recycleview=findViewById(R.id.RecyclerView);
        //arraylist=initStudentList();



        arraylist=initStudentListParametrised();
        initRecyclerView();

    }
    private void initRecyclerView(){
        RecyclerViewAdapter RVadapter = new RecyclerViewAdapter();
        recycleview.setAdapter(RVadapter);
        RVadapter.setStudentInterface(new StudentInterface() {
            @Override
            public void setStudentOnclick(Student student) {
                Toast toast = Toast.makeText(StudentList.this, "Name is: " + student.getName(), Toast.LENGTH_LONG);
               toast.show();
            }
        });
        //datat kese jara hai ye layout btana hai define krna hai layout list hai grid hai etc
        //tells recycler about how the datat is going to be visualised
        recycleview.setLayoutManager(new LinearLayoutManager(this));

        RVadapter.setData(arraylist);

    }
    private ArrayList<Student> initStudentList(){
        ArrayList<Student> studentArrayList = new ArrayList<>();
        Student stu1= new Student();
        stu1.setName("Ali");
        stu1.setPhone("2137264872");
        Student stu2= new Student();
        stu2.setName("Ahad");
        stu2.setPhone("2137264872");
        Student stu3= new Student();
        stu3.setName("Kashif");
        stu3.setPhone("2137264872");
        Student stu4= new Student();
        stu4.setName("Hamza");
        stu4.setPhone("2137264872");
        studentArrayList.add(stu1);
        studentArrayList.add(stu2);
        studentArrayList.add(stu3);
        studentArrayList.add(stu4);
        return studentArrayList;
    }

    private ArrayList<Student> initStudentListParametrised(){
        ArrayList<Student> studentArrayList = new ArrayList<>();
        Student stu1= new Student("Ali","2137264872");
        Student stu2= new Student("hamza","2137264872");
        Student stu3= new Student("Ahad","2137264872");
        Student stu4= new Student("Raza","2137264872");

        studentArrayList.add(stu1);
        studentArrayList.add(stu2);
        studentArrayList.add(stu3);
        studentArrayList.add(stu4);



//        studentArrayList.add(new Student("Ali","2137264872"));
//        studentArrayList.add(new Student("hamza","2137264872"));
//        studentArrayList.add( new Student("Ahad","2137264872"));
//        studentArrayList.add(new Student("Raza","2137264872"));

        return studentArrayList;
    }

//Interface implemented
//    @Override
//    public void setStudentOnclick() {
//        Toast toast = Toast.makeText(view.getContext(), "Name is: " + item.getName(), Toast.LENGTH_LONG);
//        toast.show();
//    }
}