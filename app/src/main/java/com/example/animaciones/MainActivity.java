package com.example.animaciones;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    /* animicaiones:
    principios
    1. el movimiento - translate, en 2 ejes (X y Y)
    2. rotacion para esto se usan grados hasta 360° este tiene un pibote(el centro en algunas ocaciones) - rotation
    3. el principio es de el tamaño del objeto, puede ser ampliado o reducido de tamaño - Scale
    4. ultimo principio: la transparencia o canal alfa en términos técnicos (ej un RGBA EN 0 ES TRANPARENTE en 265 es aceptablemtne visible
    son un recurso dela aplicacion en la carpeta res:
    este debe ser creado en android resource directory -> anim
    anim ->animation resouce file
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}