package com.rvelasquez.cl1_rogervelasquez.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.rvelasquez.cl1_rogervelasquez.R;
import com.rvelasquez.cl1_rogervelasquez.adapter.ListAdapter;
import com.rvelasquez.cl1_rogervelasquez.model.ListElement;

import java.util.ArrayList;
import java.util.List;

public class ContainerActivity extends AppCompatActivity {

    List<ListElement> lista;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_container);

        init();
        showToolbar(getResources().getString(R.string.toolbar_title_Lista), true);
    }

    private  void showToolbar(String title, boolean upButton){

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(title);
        getSupportActionBar().setDisplayHomeAsUpEnabled(upButton);


    }

    public void init(){
        lista = new ArrayList<>();
        lista.add(new ListElement(R.drawable.pizza1,"QUESO Y PEPPERONI"));
        lista.add(new ListElement(R.drawable.pizza2,"MARGARITA"));
        lista.add(new ListElement(R.drawable.pizza3,"PIZZA 4 QUESOS"));
        lista.add(new ListElement(R.drawable.pizza4,"POLLO"));
        lista.add(new ListElement(R.drawable.pizza5,"HUEVO Y TOCINO"));

        //ListAdapter listAdapter = new ListAdapter(lista,this);
        ListAdapter listAdapter = new ListAdapter(lista);

        RecyclerView recyclerView = findViewById(R.id.listRecycle);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(listAdapter);

    }


}