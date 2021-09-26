package com.piensa;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Activity_piensa extends Activity {
	int activa=1;
	String respuesta="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_piensa);
        cambia_imagenes();
    }
    public void siguiente(View v) {
    	EditText usuariorpt = (EditText) findViewById(R.id.respuesta);
    	if (!respuesta.equals(usuariorpt.getText().toString())){
    		Toast.makeText(getApplicationContext(),"Respuesta incorrecta", Toast.LENGTH_LONG).show();
    		return;
    	}
    	activa+=1;
  
    	cambia_imagenes();
	}
    public void cambia_imagenes() {
    	if (activa==1){
    		TextView totaletras = (TextView) findViewById(R.id.totaletras);
    		TextView desordenadas = (TextView) findViewById(R.id.desordenadas);
    		totaletras.setText("7 Letras");
    		desordenadas.setText("AAFRNCI");
    		ImageView img1 =(ImageView)  findViewById(R.id.imagen1);
    		img1.setImageResource(R.drawable.i5);
    		ImageView img2 =(ImageView)  findViewById(R.id.imagen2);
    		img2.setImageResource(R.drawable.i6);
    		ImageView img3 =(ImageView)  findViewById(R.id.imagen3);
    		img3.setImageResource(R.drawable.i7);
    		ImageView img4 =(ImageView)  findViewById(R.id.imagen4);
    		img4.setImageResource(R.drawable.i8);
    		respuesta="FRANCIA";
    	}
    	if (activa==2){
    		TextView totaletras = (TextView) findViewById(R.id.totaletras);
    		TextView desordenadas = (TextView) findViewById(R.id.desordenadas);
    		totaletras.setText("5 Letras");
    		desordenadas.setText("LSFEE");
    		ImageView img1 =(ImageView)  findViewById(R.id.imagen1);
    		img1.setImageResource(R.drawable.i1);
    		ImageView img2 =(ImageView)  findViewById(R.id.imagen2);
    		img2.setImageResource(R.drawable.i2);
    		ImageView img3 =(ImageView)  findViewById(R.id.imagen3);
    		img3.setImageResource(R.drawable.i3);
    		ImageView img4 =(ImageView)  findViewById(R.id.imagen4);
    		img4.setImageResource(R.drawable.i4);
    		respuesta="FEELS";
    	}
    	if (activa==3){
    		TextView totaletras = (TextView) findViewById(R.id.totaletras);
    		TextView desordenadas = (TextView) findViewById(R.id.desordenadas);
    		totaletras.setText("11 Letras");
    		desordenadas.setText("TRNADAIRFED");
    		ImageView img1 =(ImageView)  findViewById(R.id.imagen1);
    		img1.setImageResource(R.drawable.i9);
    		ImageView img2 =(ImageView)  findViewById(R.id.imagen2);
    		img2.setImageResource(R.drawable.i10);
    		ImageView img3 =(ImageView)  findViewById(R.id.imagen3);
    		img3.setImageResource(R.drawable.i11);
    		ImageView img4 =(ImageView)  findViewById(R.id.imagen4);
    		img4.setImageResource(R.drawable.i12);
    		respuesta="FRATERNIDAD";
    	}
    	if (activa==4){
    		TextView totaletras = (TextView) findViewById(R.id.totaletras);
    		TextView desordenadas = (TextView) findViewById(R.id.desordenadas);
    		totaletras.setText("7 Letras");
    		desordenadas.setText("OAMNHRE");
    		ImageView img1 =(ImageView)  findViewById(R.id.imagen1);
    		img1.setImageResource(R.drawable.i13);
    		ImageView img2 =(ImageView)  findViewById(R.id.imagen2);
    		img2.setImageResource(R.drawable.i14);
    		ImageView img3 =(ImageView)  findViewById(R.id.imagen3);
    		img3.setImageResource(R.drawable.i15);
    		ImageView img4 =(ImageView)  findViewById(R.id.imagen4);
    		img4.setImageResource(R.drawable.i16);
    		respuesta="HERMANO";
    	}
    	if (activa==5){
    		TextView totaletras = (TextView) findViewById(R.id.totaletras);
    		TextView desordenadas = (TextView) findViewById(R.id.desordenadas);
    		totaletras.setText("7 Letras");
    		desordenadas.setText("ALLLESA");
    		ImageView img1 =(ImageView)  findViewById(R.id.imagen1);
    		img1.setImageResource(R.drawable.i17);
    		ImageView img2 =(ImageView)  findViewById(R.id.imagen2);
    		img2.setImageResource(R.drawable.i18);
    		ImageView img3 =(ImageView)  findViewById(R.id.imagen3);
    		img3.setImageResource(R.drawable.i19);
    		ImageView img4 =(ImageView)  findViewById(R.id.imagen4);
    		img4.setImageResource(R.drawable.i20);
    		respuesta="LASALLE";
    	}
    	if (activa==6){
    		TextView totaletras = (TextView) findViewById(R.id.totaletras);
    		TextView desordenadas = (TextView) findViewById(R.id.desordenadas);
    		totaletras.setText("4 Letras");
    		desordenadas.setText("OLNE");
    		ImageView img1 =(ImageView)  findViewById(R.id.imagen1);
    		img1.setImageResource(R.drawable.i21);
    		ImageView img2 =(ImageView)  findViewById(R.id.imagen2);
    		img2.setImageResource(R.drawable.i22);
    		ImageView img3 =(ImageView)  findViewById(R.id.imagen3);
    		img3.setImageResource(R.drawable.i23);
    		ImageView img4 =(ImageView)  findViewById(R.id.imagen4);
    		img4.setImageResource(R.drawable.i24);
    		respuesta="LEON";
    	}
    	if (activa==7){
    		TextView totaletras = (TextView) findViewById(R.id.totaletras);
    		TextView desordenadas = (TextView) findViewById(R.id.desordenadas);
    		totaletras.setText("8 Letras");
    		desordenadas.setText("TOMASERS");
    		ImageView img1 =(ImageView)  findViewById(R.id.imagen1);
    		img1.setImageResource(R.drawable.i25);
    		ImageView img2 =(ImageView)  findViewById(R.id.imagen2);
    		img2.setImageResource(R.drawable.i26);
    		ImageView img3 =(ImageView)  findViewById(R.id.imagen3);
    		img3.setImageResource(R.drawable.i27);
    		ImageView img4 =(ImageView)  findViewById(R.id.imagen4);
    		img4.setImageResource(R.drawable.i28);
    		respuesta="MAESTROS";
    	}
    	if (activa==8){
    		TextView totaletras = (TextView) findViewById(R.id.totaletras);
    		TextView desordenadas = (TextView) findViewById(R.id.desordenadas);
    		totaletras.setText("8 Letras");
    		desordenadas.setText("OLRAPTSA");
    		ImageView img1 =(ImageView)  findViewById(R.id.imagen1);
    		img1.setImageResource(R.drawable.i29);
    		ImageView img2 =(ImageView)  findViewById(R.id.imagen2);
    		img2.setImageResource(R.drawable.i30);
    		ImageView img3 =(ImageView)  findViewById(R.id.imagen3);
    		img3.setImageResource(R.drawable.i31);
    		ImageView img4 =(ImageView)  findViewById(R.id.imagen4);
    		img4.setImageResource(R.drawable.i32);
    		respuesta="PASTORAL";
    	}
    	if (activa==9){
    		TextView totaletras = (TextView) findViewById(R.id.totaletras);
    		TextView desordenadas = (TextView) findViewById(R.id.desordenadas);
    		totaletras.setText("7 Letras");
    		desordenadas.setText("SIPRAEL");
    		ImageView img1 =(ImageView)  findViewById(R.id.imagen1);
    		img1.setImageResource(R.drawable.i33);
    		ImageView img2 =(ImageView)  findViewById(R.id.imagen2);
    		img2.setImageResource(R.drawable.i34);
    		ImageView img3 =(ImageView)  findViewById(R.id.imagen3);
    		img3.setImageResource(R.drawable.i35);
    		ImageView img4 =(ImageView)  findViewById(R.id.imagen4);
    		img4.setImageResource(R.drawable.i36);
    		respuesta="PILARES";
    	}
    	if (activa==10){
    		TextView totaletras = (TextView) findViewById(R.id.totaletras);
    		TextView desordenadas = (TextView) findViewById(R.id.desordenadas);
    		totaletras.setText("9 Letras");
    		desordenadas.setText("STIGPISROE");
    		ImageView img1 =(ImageView)  findViewById(R.id.imagen1);
    		img1.setImageResource(R.drawable.i37);
    		ImageView img2 =(ImageView)  findViewById(R.id.imagen2);
    		img2.setImageResource(R.drawable.i38);
    		ImageView img3 =(ImageView)  findViewById(R.id.imagen3);
    		img3.setImageResource(R.drawable.i39);
    		ImageView img4 =(ImageView)  findViewById(R.id.imagen4);
    		img4.setImageResource(R.drawable.i40);
    		respuesta="PRESTIGIO";
    	}


    }
    
}
