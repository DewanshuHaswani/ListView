package com.example.listviews;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView myListView = findViewById(R.id.myListView);

        final ArrayList<String> myFriends = new ArrayList<String>();
        myFriends.add("Friend0");
        myFriends.add("Friend1");
        myFriends.add("Friend2");
        myFriends.add("Friend3");
        myFriends.add("Friend4");
        myFriends.add("Friend5");
        myFriends.add("Friend6");
        /*
        final ArrayList<String> myFriends = new ArrayList<string>(asList("person1","person2"));
         */
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,myFriends);

        myListView.setAdapter(arrayAdapter);

        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.i("Hy",myFriends.get(position));
                Toast.makeText(getApplicationContext(),"Hello" + myFriends.get(position),Toast.LENGTH_LONG);
            }
        });
    }
}