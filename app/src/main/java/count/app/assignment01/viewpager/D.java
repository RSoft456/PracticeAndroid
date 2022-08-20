package count.app.assignment01.viewpager;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import count.app.assignment01.R;


public class D extends Fragment {
    public D() {
        // Required empty public constructor
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.d("FragmentD","onCreateView");
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_d, container, false);
    }
}