package tw.edu.tku.eatwhat;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        List<String> data = new ArrayList<>();
        data.add("牛排");
        data.add("紅酒燉牛肉");
        data.add("威靈頓牛排");
        data.add("牛肉壽喜燒");
        data.add("紅燒牛肉麵");
        data.add("泰國綠咖哩");
        data.add("日式炸牛排");
        data.add("九層塔辣炒牛肉");
        data.add("彩椒炒牛肉");
        data.add("番茄燉牛肉");
        data.add("牛尾羅宋湯");
        data.add("牛肉烏龍麵");
        data.add("日式燒肉");
        data.add("沙茶牛肉");


        ListView listview = findViewById(R.id.lv);
        listview.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, data));
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                String item = adapterView.getItemAtPosition(position).toString();
                Toast.makeText(SecondActivity.this,"您的選擇是："+item,Toast.LENGTH_SHORT).show();
            }
        });
    }
}





