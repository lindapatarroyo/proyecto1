package com.loducode.project1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.loducode.project1.databinding.FragmentOtherBinding;

import java.util.ArrayList;

public class OtherFragment extends Fragment {
    private FragmentOtherBinding binding;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
        }
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentOtherBinding.inflate(inflater, container, false);
        View view = binding.getRoot();
        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listaNumeros();
                Toast.makeText(getContext(), "Boton", Toast.LENGTH_SHORT).show();
            }
        });
    }
    private void listaNumeros(){
        String y = binding.numeroLim.getText().toString();
        int z = Integer.parseInt(y);
        String cadena="";
        ArrayList<Integer> listaDeNumeros = new ArrayList();
        for (int i=0; i<=z; i++){
            if (i%3 == 0){
                listaDeNumeros.add(i);
            }
        }
        for (int j=0; j<listaDeNumeros.size();j++){
            cadena +=(listaDeNumeros.get(j)).toString();
        }
        binding.listanumeros.setText(cadena);
    }
}
