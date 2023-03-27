package id.ac.uin.suska.recycleviewlatihan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.ClipData;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerview);

        List<item> items =new ArrayList<item>();
        items.add(new item("Reiirisu","Reireii@gmail.com", R.drawable.sinolep));
        items.add(new item("Cyborgg","Cyee@gmail.com",R.drawable.ratatuijoga));
        items.add(new item("Raiki","Sqwewww@gmail.com",R.drawable.wangy));
        items.add(new item("Bocchi","GGotohh@gmail.com",R.drawable.sinolep));
        items.add(new item("Reiirisu","Reireii@gmail.com",R.drawable.iniapaan));
        items.add(new item("Cyborgg","Cyee@gmail.com",R.drawable.ratatuijoga));
        items.add(new item("Raiki","Sqwewww@gmail.com",R.drawable.wangy));
        items.add(new item("Bocchi","GGotohh@gmail.com",R.drawable.sinolep));
        items.add(new item("Reiirisu","Reireii@gmail.com",R.drawable.iniapaan));
        items.add(new item("Cyborgg","Cyee@gmail.com",R.drawable.ratatuijoga));
        items.add(new item("Raiki","Sqwewww@gmail.com",R.drawable.wangy));
        items.add(new item("Bocchi","GGotohh@gmail.com",R.drawable.sinolep));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(),items));
    }
}