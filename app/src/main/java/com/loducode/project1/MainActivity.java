package com.loducode.project1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.loducode.project1.databinding.ActivityMainBinding;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    ArrayList<String> list = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        list.add("Lidna");
        list.add("Johana");
        list.add("Patarroyo");
        list.add("Acero");
        binding.btnShowFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openFragment();
            }
        });
        binding.btnShowRV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showRecyclerView();
            }
        });
    }
    private void showRecyclerView(){
        binding.fragmentContainer.setVisibility(View.GONE);
        binding.rvList.setVisibility(View.VISIBLE);
        binding.rvList.setHasFixedSize(true);
        binding.rvList.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        Adapter adapter = new Adapter(this, list);
        binding.rvList.setAdapter(adapter);

    }
    private void openFragment(){
        binding.fragmentContainer.setVisibility(View.VISIBLE);
        binding.rvList.setVisibility(View.GONE);
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.fragmentContainer, new OtherFragment());
        fragmentTransaction.commit();
    }
}