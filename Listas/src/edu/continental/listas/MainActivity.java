package edu.continental.listas;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	ListView lista;
	ArrayList<String> equipos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        lista = (ListView) findViewById(R.id.ListaEquipos);
        equipos = new ArrayList<String>();
        
        equipos.add("Chile");
        equipos.add("Argentina");
        equipos.add("Per�");
        equipos.add("Paraguay");
        equipos.add("Colombia");
        equipos.add("Brasil");
        equipos.add("Bolivia");
        equipos.add("Uruguay");
        
        ArrayAdapter<String> adapter = new
        		ArrayAdapter<String>(this,
        				android.R.layout.simple_list_item_1, equipos);
        
        lista.setAdapter(adapter);
        
        lista.setOnItemClickListener(new OnItemClickListener() {
        	public void onItemClick(AdapterView<?> parent, View view, int position, long id) {  
        		
        		Toast.makeText(getApplicationContext(),
        				"Ha Dado Click en: " + position,
        				Toast.LENGTH_SHORT).show();
        	}
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
