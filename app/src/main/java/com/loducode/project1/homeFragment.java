package com.loducode.project1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class homeFragment extends Fragment {
    Button button;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        /*int i=2;
        if (i==2){
            Fragment fr=new OtherFragment();
            getActivity().getSupportFragmentManager().beginTransaction()
                    .replace(R.id.frame_Layout,fr)
                    .addToBackStack(null)
                    .commit();
        }*/
        return view;
    }
}
