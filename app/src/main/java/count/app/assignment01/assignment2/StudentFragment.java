package count.app.assignment01.assignment2;

import android.app.Fragment;
import android.os.Bundle;



import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import count.app.assignment01.R;


public class StudentFragment extends Fragment {
    TextView text;
    Button btn;

    public StudentFragment() {
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


        View views=inflater.inflate(R.layout.fragment_student, container, false);
        text=views.findViewById(R.id.textview);
        btn= views.findViewById(R.id.buttonfrag);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(getActivity(), "Welcome to fragment", Toast.LENGTH_LONG);
                toast.show();
            }
        });
        return views;
    }

}