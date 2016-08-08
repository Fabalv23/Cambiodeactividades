package fabian.cambiodeactividades;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SegundaPantalla extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_pantalla);

        Button boton1 = (Button) findViewById(R.id.button2);


        boton1.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {
        Intent a = new Intent(this,MainActivity.class);
        //Inicia la actividad
        startActivity(a);
    }


}
