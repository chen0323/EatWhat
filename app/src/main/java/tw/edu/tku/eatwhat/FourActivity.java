package tw.edu.tku.eatwhat;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class FourActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        List<String> data = new ArrayList<>();
        data.add("蜜汁豬肉");
        data.add("醬爆豬肉片");
        data.add("客家鹹豬肉");
        data.add("香煎紐奧良豬肉");
        data.add("泡菜炒豬肉");
        data.add("醬燒豬五花");
        data.add("照燒豬肉片");
        data.add("薑汁燒肉");
        data.add("蜜汁叉燒肉");
        data.add("香麻烤豬肉");
        data.add("金針菇炒豬肉");
        data.add("炒香腸佐玉米筍");
        data.add("梅干扣肉");
        data.add("煎椒鹽松阪豬");


        ListView listview = findViewById(R.id.lv);
        listview.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, data));
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                String item = adapterView.getItemAtPosition(position).toString();
                Toast.makeText(FourActivity.this,"您的選擇是："+item,Toast.LENGTH_SHORT).show();
            }
        });
    }
}
