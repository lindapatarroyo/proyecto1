package com.loducode.project1;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

import com.loducode.project1.data.AppDatabase;
import com.loducode.project1.data.entities.Item;
import com.loducode.project1.data.dao.ItemDao;
import com.loducode.project1.repository.ItemRepository;
import com.loducode.project1.repository.ItemRepositoryImpl;

import java.util.List;

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
        AppDatabase db = AppDatabase.getInstance(this.getContext());
        ItemDao dao = db.itemDao();
        ItemRepository repo = new ItemRepositoryImpl(dao);

        Item item = new Item();
        item.setName("Item 1");
        item.setChecked(false);
        repo.insertItem(item);

        List<Item> items = repo.getAllItems();
        for (Item i: items){
            Log.d("Ejemplo", "item id"+i.getItemId()+" name= "+i.getName()+" check= "+i.isChecked());
        }
        /* //actualizar items
        Item itemUpdate = repo.findById(1);
        itemUpdate.setChecked(true);
        repo.update(itemUpdate);
        //Eliminar
        Item itemDelete = repo.delete(1);
        repo.deleteItem(itemDelete);
        */
        return view;
    }
}
