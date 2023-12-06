package com.example.menudemo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Context Menu
        TextView textView=findViewById(R.id.tv);

        registerForContextMenu(textView);



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
            inflater.inflate(R.menu.my_menu,menu);
            return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int itemId=item.getItemId();

        if(itemId==R.id.newcanvas){
            Toast.makeText(MainActivity.this, "New Canvas Clicked", Toast.LENGTH_SHORT).show();
        } else if (itemId==R.id.setting){
            Toast.makeText(MainActivity.this, "Setting Clicked", Toast.LENGTH_SHORT).show();
        }
        return  super.onOptionsItemSelected(item);
    }


    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.setHeaderTitle("Changed");
        getMenuInflater().inflate(R.menu.context_menu,menu);
    }
    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        TextView textView=findViewById(R.id.tv);
        if(item.getItemId()==R.id.increase){
            textView.setTextSize(TypedValue.COMPLEX_UNIT_PX,textView.getTextSize()+10);
            return true;
        } else if (item.getItemId()==R.id.decrease){
            textView.setTextSize(TypedValue.COMPLEX_UNIT_PX,textView.getTextSize()-10);
            return true;
        }
        return super.onContextItemSelected(item);
    }
}