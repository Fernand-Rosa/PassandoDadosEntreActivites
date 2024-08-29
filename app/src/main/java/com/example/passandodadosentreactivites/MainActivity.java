package com.example.passandodadosentreactivites;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private Button buttonEnviar;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

            buttonEnviar = findViewById(R.id.buttonEnviar);

            buttonEnviar.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){

                    Intent intent = new Intent(getApplicationContext(), SegundaActivity.class);
                    Usuario usuario = new Usuario("Fernanda", "fernandarodriguesrosa@gmail.com");

                    //passar dados
                    intent.putExtra("nome", "Fernanda");
                    intent.putExtra("idade", 25);
                    intent.putExtra("objeto", usuario);


                    startActivity(intent);


                }
            });
        }

}