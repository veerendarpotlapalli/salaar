package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.*;
import java.text.DateFormatSymbols;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView lmonth;
    String[] months;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("LIST VIEW");
        lmonth=findViewById(R.id.imonth);
        months=new DateFormatSymbols().getMonths();
        //ArrayAdapter<String> monthadapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,months);
        ArrayAdapter<String> monthadapter = new ArrayAdapter<>(this,R.layout.listview,months);
        lmonth.setAdapter(monthadapter);
        lmonth.setOnItemClickListener(this);
    }

    @Override
   // public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
    public void onItemClick(AdapterView<?> parent, View view, int position, long l) {
        //int position = i;
        String month=months[position];
       // String month = parent.getItemAtPosition(position).toString();
       // String month = ((TextView)view).getText().toString();
       // char position = 0 ;
        //String month = lmonth.getItemAtPosition(position).toString();
        Toast.makeText(getApplicationContext(),"clicked : "+month,Toast.LENGTH_SHORT).show();
    }
}