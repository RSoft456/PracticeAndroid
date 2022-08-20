package count.app.assignment01.viewpager;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import count.app.assignment01.R;

public class A extends Fragment {
    public A() {
        // Required empty public constructor
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.d("FragmentA","onCreateView");

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_a2, container, false);
    }
}