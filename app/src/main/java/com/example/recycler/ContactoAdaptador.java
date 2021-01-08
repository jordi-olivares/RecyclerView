package com.example.recycler;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ContactoAdaptador extends RecyclerView.Adapter<ContactoAdaptador.ContactoViewHolder> {


    Context contexto;
    ArrayList<Contacto> contactos;

    public ContactoAdaptador(ArrayList<Contacto> contactos, Context contexto) {
        this.contactos = contactos;
        this.contexto=contexto;
    }

    //Infla el layout y lo pasa al viewholder para obtener los view
    @NonNull
    @Override
    public ContactoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_contacto,parent,false);
        return new ContactoViewHolder(v);
    }

    //Asocia cada elemento de la lista acada view
    @Override
    public void onBindViewHolder(@NonNull ContactoViewHolder holder, int position) {//aqui se setaean los valors de la lista
        Contacto contacto=contactos.get(position);
        holder.imgFotoCV.setImageResource(contacto.getFoto());
        holder.tvNombreCV.setText(contacto.getNombre());
        holder.tvTelefonoCV.setText(contacto.getTelefono());

        holder.imgFotoCV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(contexto, "Hola, Contexto"+position, Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public int getItemCount() {//cantidad de elementos que tiene la lista
        return contactos.size();
    }

    //esta clase maneja un solo item
    public static class ContactoViewHolder extends RecyclerView.ViewHolder{
        private ImageView imgFotoCV;
        private TextView tvNombreCV;
        private TextView tvTelefonoCV;

        public ContactoViewHolder(@NonNull View itemView) {
            super(itemView);
            imgFotoCV=(ImageView)itemView.findViewById(R.id.imgFotoCV);
            tvNombreCV=(TextView)itemView.findViewById(R.id.tvNombreCV);
            tvTelefonoCV=(TextView)itemView.findViewById(R.id.tvTelefonoCV);
        }
    }
}
