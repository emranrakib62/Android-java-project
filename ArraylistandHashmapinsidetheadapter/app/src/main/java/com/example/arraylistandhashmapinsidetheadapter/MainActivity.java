package com.example.arraylistandhashmapinsidetheadapter;



import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    ListView list;
    ImageView imageView;
    TextView tvname,tvmobile;
    ArrayList<HashMap<String,String> > arrayList=new ArrayList();
    HashMap<String,String> hashMap;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        list=findViewById(R.id.list);

        hashMap=new HashMap<>();
        hashMap.put("name","jubayer Hossain");
        hashMap.put("mobile","0188844484");
        hashMap.put("email","juba@gmail.com");
        arrayList.add(hashMap);


        hashMap=new HashMap<>();
        hashMap.put("name","karim");
        hashMap.put("mobile","7578652");
        hashMap.put("email","karim@gmail.com");
        arrayList.add(hashMap);


        hashMap=new HashMap<>();
        hashMap.put("name","hasan");
        hashMap.put("mobile","018484");
        hashMap.put("email","hasan@gmail.com");
        arrayList.add(hashMap);




        MyAdapter myAdapter=new MyAdapter();
        list.setAdapter(myAdapter);

    }

    private class MyAdapter extends BaseAdapter{
        LayoutInflater layoutInflater;
        @Override
        public int getCount() {
            return arrayList.size();
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }
        @Override
        public View getView(int position, View view, ViewGroup viewGroup) {
            layoutInflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            @SuppressLint("ViewHolder") View myview = layoutInflater.inflate(R.layout.item_layout, viewGroup, false);

            imageView = myview.findViewById(R.id.imageview);
            tvname = myview.findViewById(R.id.tvname);  // fixed id
            tvmobile = myview.findViewById(R.id.tvmobile);


            HashMap<String, String> hashMap = arrayList.get(position);


            tvname.setText(hashMap.get("name"));
            tvmobile.setText(hashMap.get("mobile"));

            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getApplicationContext(), "hello\nItem number: " + position, Toast.LENGTH_LONG).show();
                }
            });

            return myview;
        }

    }
}