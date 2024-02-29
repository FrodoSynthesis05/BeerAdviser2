package com.example.BeerAdviser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;



import java.util.List;

public class categorias extends AppCompatActivity {

    private ProductExpert expert = new ProductExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void FindProduct (View view){


        TextView Producto = findViewById(R.id.Product);

        Spinner tipoProducto = findViewById(R.id.TypeOfProduct);

        String tipoProducto = String.valueOf(tipoProducto.getSelectedItem());

        List<String> listaProductos = expert.getProduct(tipoProducto);
        StringBuilder productosFormatted = new StringBuilder();


        for(String producto: listaProductos){
            productosFormatted.append(producto).append('\n');
        }


        Producto.setText(productosFormatted);

    }
}
