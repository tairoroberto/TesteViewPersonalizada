package com.example.testeviewpersonalizada;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {
	private EmailText emailText;
	private Quadrado quadrado;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		emailText = ( EmailText)findViewById(R.id.emailNovo);
		
		/*
		quadrado = new Quadrado(this);
		
		LinearLayout layout = (LinearLayout)findViewById(R.id.layout);
		layout.addView(emailText);
		layout.addView(quadrado);*/
	}
	
	//metodo para verificar email
	public void verificarEmail(View view) {
		if (emailText.isEmail()) {
			Toast.makeText(MainActivity.this, "Sim", Toast.LENGTH_SHORT).show();
		}else{
			Toast.makeText(MainActivity.this, "Não", Toast.LENGTH_SHORT).show();
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
