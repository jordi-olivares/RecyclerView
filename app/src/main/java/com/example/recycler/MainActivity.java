package com.example.recycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView listaContactos;
    ArrayList<Contacto> contactos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contactos=new ArrayList<Contacto>();

        contactos.add(new Contacto("jordi","5443","jordi@correo.com",R.drawable.ic_bicy));
        contactos.add(new Contacto("jordi","5443","jordi@correo.com",R.drawable.ic_bicy));
        contactos.add(new Contacto("jordi","5443","jordi@correo.com",R.drawable.ic_person));
        contactos.add(new Contacto("jordi","5443","jordi@correo.com",R.drawable.ic_person2));
        contactos.add(new Contacto("jordi","5443","jordi@correo.com",R.drawable.ic_person));
        contactos.add(new Contacto("jordi","5443","jordi@correo.com",R.drawable.ic_bicy));
        contactos.add(new Contacto("jordi","5443","jordi@correo.com",R.drawable.ic_bicy));
        contactos.add(new Contacto("jordi","5443","jordi@correo.com",R.drawable.ic_person));
        contactos.add(new Contacto("jordi","5443","jordi@correo.com",R.drawable.ic_person2));
        contactos.add(new Contacto("jordi","5443","jordi@correo.com",R.drawable.ic_person));
        contactos.add(new Contacto("jordi","5443","jordi@correo.com",R.drawable.ic_bicy));
        contactos.add(new Contacto("jordi","5443","jordi@correo.com",R.drawable.ic_bicy));
        contactos.add(new Contacto("jordi","5443","jordi@correo.com",R.drawable.ic_person));
        contactos.add(new Contacto("jordi","5443","jordi@correo.com",R.drawable.ic_person2));
        contactos.add(new Contacto("jordi","5443","jordi@correo.com",R.drawable.ic_person));
        contactos.add(new Contacto("jordi","5443","jordi@correo.com",R.drawable.ic_bicy));
        contactos.add(new Contacto("jordi","5443","jordi@correo.com",R.drawable.ic_bicy));
        contactos.add(new Contacto("jordi","5443","jordi@correo.com",R.drawable.ic_person));
        contactos.add(new Contacto("jordi","5443","jordi@correo.com",R.drawable.ic_person2));
        contactos.add(new Contacto("jordi","5443","jordi@correo.com",R.drawable.ic_person));
        contactos.add(new Contacto("jordi","5443","jordi@correo.com",R.drawable.ic_bicy));
        contactos.add(new Contacto("jordi","5443","jordi@correo.com",R.drawable.ic_bicy));
        contactos.add(new Contacto("jordi","5443","jordi@correo.com",R.drawable.ic_person));
        contactos.add(new Contacto("jordi","5443","jordi@correo.com",R.drawable.ic_person2));
        contactos.add(new Contacto("jordi","5443","jordi@correo.com",R.drawable.ic_person));

        listaContactos=(RecyclerView)findViewById(R.id.rvContactos);

        //forma de mostrar con lista
        LinearLayoutManager llm=new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaContactos.setLayoutManager(llm);

        ContactoAdaptador adaptador=new ContactoAdaptador(contactos,this);
        listaContactos.setAdapter(adaptador);

    }
}