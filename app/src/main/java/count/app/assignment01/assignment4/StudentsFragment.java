package count.app.assignment01.assignment4;

import static android.content.ContentValues.TAG;
import static count.app.assignment01.assignment4.DataListFragment.initRecyclerView;
import static count.app.assignment01.assignment4.DataListFragment.initStudentList;

import android.app.Fragment;
import android.os.Bundle;

import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import count.app.assignment01.R;

public class StudentsFragment extends Fragment {
    RecyclerView RV;
    ArrayList<StudentData> arraylist=new ArrayList<>();
    public StudentsFragment() {
        // Required empty public constructor
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_students, container, false);
        RV = view.findViewById(R.id.DLRecyclerView);
        arraylist=initStudentList();
        initRecyclerView(arraylist);
        return null;
    }

}