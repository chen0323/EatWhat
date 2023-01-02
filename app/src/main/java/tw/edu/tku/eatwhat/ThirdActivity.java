package tw.edu.tku.eatwhat;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;

import java.util.ArrayList;
import java.util.List;


public class ThirdActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        List<String> data = new ArrayList<>();
        data.add("雞肉咖哩飯");
        data.add("韓式雞肉年糕");
        data.add("雞肉飯");
        data.add("薑爆雞肉");
        data.add("南瓜香菇雞肉炊飯");
        data.add("雞肉豆腐丸子");
        data.add("照燒雞肉");
        data.add("韓式雞肉炒年糕");
        data.add("雞肉蔬菜沙拉");
        data.add("沙茶煎雞肉");
        data.add("蜜汁金針雞肉捲");
        data.add("泡菜炒雞肉");
        data.add("彩椒雞肉");
        data.add("三杯雞肉");



        ListView listview = findViewById(R.id.lv);
        listview.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, data));
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                String item = adapterView.getItemAtPosition(position).toString();
                Toast.makeText(ThirdActivity.this,"您的選擇是："+item,Toast.LENGTH_SHORT).show();

            }
        });
    }
}
