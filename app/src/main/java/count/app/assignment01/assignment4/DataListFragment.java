package count.app.assignment01.assignment4;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;

import java.util.ArrayList;

import count.app.assignment01.R;
import count.app.assignment01.assignment2.Constants;
import count.app.assignment01.assignment3.FragmentA;
import count.app.assignment01.lab04.RecyclerViewAdapter;
import count.app.assignment01.lab04.Student;

public class DataListFragment extends AppCompatActivity {
    static RecyclerView RV;
    static ArrayList<StudentData> arraylist;
    static String mailID;
    FrameLayout FL;
    TextView heading;
    FragmentManager FM;
    FragmentTransaction FT;
    Button done;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_list_fragment);
        heading = findViewById(R.id.DataListHeading);
        RV = findViewById(R.id.DLRecyclerView);
        done = findViewById(R.id.DataListBtn);
        Intent intent = getIntent();
        mailID = intent.getStringExtra("Email1");
        if (mailID.equals(Constants.firstTeacheremail) || mailID.equals(Constants.secondTeacheremail)) {
            heading.setText("Students");
            FM = getFragmentManager();
            FT = FM.beginTransaction();
            FT = FT.add(R.id.DataListFL, new StudentsFragment());
            FT.commit();
        } else {
            heading.setText("Subjects");
            FM = getFragmentManager();
            FT = FM.beginTransaction();
            FT = FT.add(R.id.DataListFL, new SubjectFragment());
            FT.commit();
        }
        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DataListFragment.this, SignIn.class);
                startActivity(intent);
            }
        });
    }

    public static void initRecyclerView(ArrayList<StudentData> datalist) {
        AdapterRecyclerView RVadapter = new AdapterRecyclerView();
        RV.setAdapter(RVadapter);
        RV.setLayoutManager(new LinearLayoutManager(RV.getContext()));
        RVadapter.setData(datalist);
    }

    public static ArrayList<StudentData> initStudentList() {
        ArrayList<StudentData> DataList = new ArrayList<>();
        if (mailID.equals(Constants.firstTeacheremail))
            DataList = FirstTeacher();
        else
            DataList = SecondTeacher();
        return DataList;
    }

    private static ArrayList<StudentData> FirstTeacher() {
        ArrayList<StudentData> StudentDataList = new ArrayList<>();
        StudentData obj1 = new StudentData("Ali", "", "Maths", "");
        StudentData obj2 = new StudentData("Huma", "", "Urdu", "");
        StudentData obj3 = new StudentData("Ryaz", "", "English", "");
        StudentData obj4 = new StudentData("Hammad", "", "Biology", "");
        StudentData obj5 = new StudentData("Talha", "", "Chemistry", "");
        StudentData obj6 = new StudentData("Saad", "", "Physics", "");
        StudentData obj7 = new StudentData("Saqib", "", "Islamiyat", "");
        StudentData obj8 = new StudentData("Ramsha", "", "Pakistan Studies", "");
        StudentData obj9 = new StudentData("Laiba", "", "Statistics", "");
        StudentData obj10 = new StudentData("Nimra", "", "Professional Ethics", "");
        StudentData obj11 = new StudentData("Ashar", "", "Writing Skilss", "");
        StudentData obj12 = new StudentData("Umer", "", "Discrete Mathematics", "");
        StudentData obj13 = new StudentData("Fatima", "", "Linear Algebra", "");
        StudentData obj14 = new StudentData("Khadija", "", "Programming Fundamentals", "");
        StudentData obj15 = new StudentData("Hoormain", "", "Computer", "");
        StudentData obj16 = new StudentData("Mehreen", "", "Calculus-I", "");
        StudentData obj17 = new StudentData("Alizay", "", "Calculus-II", "");
        StudentData obj18 = new StudentData("Maryam", "", "Economics", "");
        StudentData obj19 = new StudentData("Sidra", "", "Basic Electronics", "");
        StudentData obj20 = new StudentData("Rizwan", "", "Geography", "");
        StudentDataList.add(obj1);
        StudentDataList.add(obj2);
        StudentDataList.add(obj3);
        StudentDataList.add(obj4);
        StudentDataList.add(obj5);
        StudentDataList.add(obj6);
        StudentDataList.add(obj7);
        StudentDataList.add(obj8);
        StudentDataList.add(obj9);
        StudentDataList.add(obj10);
        StudentDataList.add(obj11);
        StudentDataList.add(obj12);
        StudentDataList.add(obj13);
        StudentDataList.add(obj14);
        StudentDataList.add(obj15);
        StudentDataList.add(obj16);
        StudentDataList.add(obj17);
        StudentDataList.add(obj18);
        StudentDataList.add(obj19);
        StudentDataList.add(obj20);
        return StudentDataList;
    }

    private static ArrayList<StudentData> SecondTeacher() {
        ArrayList<StudentData> StudentDataList = new ArrayList<>();
        StudentData obj1 = new StudentData("Sidra", "", "Maths", "");
        StudentData obj2 = new StudentData("Batool", "", "Urdu", "");
        StudentData obj3 = new StudentData("Janita", "", "English", "");
        StudentData obj4 = new StudentData("Jessica", "", "Biology", "");
        StudentData obj5 = new StudentData("Habib", "", "Chemistry", "");
        StudentData obj6 = new StudentData("Saleem", "", "Physics", "");
        StudentData obj7 = new StudentData("Anan", "", "Islamiyat", "");
        StudentData obj8 = new StudentData("Sumaiya", "", "Pakistan Studies", "");
        StudentData obj9 = new StudentData("Laiba", "", "Statistics", "");
        StudentData obj10 = new StudentData("Josna", "", "Professional Ethics", "");
        StudentData obj11 = new StudentData("Fitrus", "", "Writing Skilss", "");
        StudentData obj12 = new StudentData("Maheen", "", "Discrete Mathematics", "");
        StudentData obj13 = new StudentData("Fatima", "", "Linear Algebra", "");
        StudentData obj14 = new StudentData("Ibrahim", "", "Programming Fundamentals", "");
        StudentData obj15 = new StudentData("Taha", "", "Computer", "");
        StudentData obj16 = new StudentData("Talal", "", "Calculus-I", "");
        StudentData obj17 = new StudentData("Sumair", "", "Calculus-II", "");
        StudentData obj18 = new StudentData("Mahnoor", "", "Economics", "");
        StudentData obj19 = new StudentData("Hoor", "", " Basic Electronics", "");
        StudentData obj20 = new StudentData("Ali", "", "Geography", "");
        StudentDataList.add(obj1);
        StudentDataList.add(obj2);
        StudentDataList.add(obj3);
        StudentDataList.add(obj4);
        StudentDataList.add(obj5);
        StudentDataList.add(obj6);
        StudentDataList.add(obj7);
        StudentDataList.add(obj8);
        StudentDataList.add(obj9);
        StudentDataList.add(obj10);
        StudentDataList.add(obj11);
        StudentDataList.add(obj12);
        StudentDataList.add(obj13);
        StudentDataList.add(obj14);
        StudentDataList.add(obj15);
        StudentDataList.add(obj16);
        StudentDataList.add(obj17);
        StudentDataList.add(obj18);
        StudentDataList.add(obj19);
        StudentDataList.add(obj20);
        return StudentDataList;
    }

    public static ArrayList<StudentData> Student() {
        ArrayList<StudentData> StudentDataList = new ArrayList<>();
        StudentData obj1 = new StudentData("", "Computer Science", "", "Mobile Application Development");
        StudentData obj2 = new StudentData("", "Software Engineering", "", "Web Development");
        StudentData obj3 = new StudentData("", "Data Science", "", "Machine Learning");
        StudentData obj4 = new StudentData("", "Information Technology", "", "Database Management");
        StudentData obj5 = new StudentData("", "Information Technology", "", "Network Administration");
        StudentData obj6 = new StudentData("", "Data Science", "", "Computer Vision");
        StudentData obj7 = new StudentData("", "Software Engineering", "", "Android App Development");
        StudentData obj8 = new StudentData("", "Information Technology", "", "Cloud Computing");
        StudentData obj9 = new StudentData("", "Software Engineering", "", "Data Analytics");
        StudentData obj10 = new StudentData("", "Computer Science", "", "Operating Systems");
        StudentData obj11 = new StudentData("", "Data Science", "", "Advanced Statistics");
        StudentData obj12 = new StudentData("", "Data Science", "", "Deep Learning");
        StudentData obj13 = new StudentData("", "Computer Science", "", "Basic Programming");
        StudentData obj14 = new StudentData("", "Software Engineering", "", "Artificial Intelligence");
        StudentData obj15 = new StudentData("", "Computer Science", "", "Algorithms and Data Structures");
        StudentData obj16 = new StudentData("", "Data Science", "", "Data Mining");
        StudentData obj17 = new StudentData("", "Information Technology", "", "Cyber Security");
        StudentData obj18 = new StudentData("", "Software Engineering", "", "Cyber Security");
        StudentData obj19 = new StudentData("", "Computer Science", "", "Software development and testing");
        StudentData obj20 = new StudentData("", "Software Engineering", "", "Database Administration");
        StudentDataList.add(obj1);
        StudentDataList.add(obj2);
        StudentDataList.add(obj3);
        StudentDataList.add(obj4);
        StudentDataList.add(obj5);
        StudentDataList.add(obj6);
        StudentDataList.add(obj7);
        StudentDataList.add(obj8);
        StudentDataList.add(obj9);
        StudentDataList.add(obj10);
        StudentDataList.add(obj11);
        StudentDataList.add(obj12);
        StudentDataList.add(obj13);
        StudentDataList.add(obj14);
        StudentDataList.add(obj15);
        StudentDataList.add(obj16);
        StudentDataList.add(obj17);
        StudentDataList.add(obj18);
        StudentDataList.add(obj19);
        StudentDataList.add(obj20);
        return StudentDataList;
    }
}