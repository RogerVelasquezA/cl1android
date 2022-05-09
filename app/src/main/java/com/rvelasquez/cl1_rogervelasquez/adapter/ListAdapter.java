package com.rvelasquez.cl1_rogervelasquez.adapter;


import android.content.Intent;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.rvelasquez.cl1_rogervelasquez.R;
import com.rvelasquez.cl1_rogervelasquez.model.ListElement;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.RecyclerHolder> {
    private List<ListElement> items;
    private List<ListElement> originalItems;
    private RecyclerItemClick itemClick;

    public ListAdapter(List<ListElement> items/*, RecyclerItemClick itemClick*/) {
        this.items = items;
        //this.itemClick = itemClick;
        this.originalItems = new ArrayList<>();
        originalItems.addAll(items);
    }

    @NonNull
    @Override
    public RecyclerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_picture, parent, false);
        return new RecyclerHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final RecyclerHolder holder, final int position) {
        final ListElement lista = items.get(position);
        holder.imgItem.setImageResource(lista.getImagen());
        holder.nombre.setText(lista.getNombre());

    }

    @Override
    public int getItemCount() {
        return items.size();
    }
/*
    public void filter(final String strSearch) {
        if (strSearch.length() == 0) {
            items.clear();
            items.addAll(originalItems);
        }
        else {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                items.clear();
                List<ListElement> collect = originalItems.stream()
                        .filter(i -> i.getNombre().toLowerCase().contains(strSearch))
                        .collect(Collectors.toList());

                items.addAll(collect);
            }
            else {
                items.clear();
                for (ListElement i : originalItems) {
                    if (i.getNombre().toLowerCase().contains(strSearch)) {
                        items.add(i);
                    }
                }
            }
        }
        notifyDataSetChanged();
    }*/


    public class RecyclerHolder extends RecyclerView.ViewHolder {
        private ImageView imgItem;
        private TextView nombre;

        public RecyclerHolder(@NonNull View itemView_1) {
            super(itemView_1);

            imgItem = itemView.findViewById(R.id.cardImage);
            nombre = itemView.findViewById(R.id.userCard);
        }
    }

    public interface RecyclerItemClick {
        void itemClick(ListElement item);
    }
}


/*import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.rvelasquez.cl1_rogervelasquez.R;
import com.rvelasquez.cl1_rogervelasquez.model.ListElement;

import java.util.List;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder> {

    private List<ListElement> lista;
    private LayoutInflater mInflater;
    private Context context;

    public ListAdapter(List<ListElement> itemList, Context context) {

        this.mInflater = LayoutInflater.from(context);
        this.context = context;
        this.lista = itemList;
    }

    @Override
    public int getItemCount() {
        return lista.size();
    }

    @NonNull
    @Override
    public ListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.cardview_picture, null);
        return new ListAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ListAdapter.ViewHolder  holder, int position) {
        holder.bindData(lista.get(position));
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView usercard;
        ImageView imagen;

        ViewHolder(View itemView){
            super(itemView);
            usercard = itemView.findViewById(R.id.userCard);
            imagen = itemView.findViewById(R.id.cardImage);
        }
        void bindData(final ListElement item){
            usercard.setText(item.getNombre());


        }

    }*/
