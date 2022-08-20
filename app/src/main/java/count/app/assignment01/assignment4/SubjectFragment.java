package count.app.assignment01.assignment4;

import static android.content.ContentValues.TAG;
import static count.app.assignment01.assignment4.DataListFragment.Student;
import static count.app.assignment01.assignment4.DataListFragment.initRecyclerView;

import android.app.Fragment;
import android.os.Bundle;


import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import count.app.assignment01.R;

public class SubjectFragment extends Fragment {
    RecyclerView RV;
    ArrayList<StudentData> arraylist=new ArrayList<>();
    public SubjectFragment() {
        // Required empty public constructor
    }
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_subject, container, false);
        RV = view.findViewById(R.id.DLRecyclerView);
        arraylist=Student();
        initRecyclerView(arraylist);
        return null;
    }
}