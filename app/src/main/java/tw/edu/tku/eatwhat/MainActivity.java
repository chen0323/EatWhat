package tw.edu.tku.eatwhat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private TextView tvRandom;
    private Button button5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ThirdActivity.class);
                startActivity(intent);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, FourActivity.class);
                startActivity(intent);
            }
        });



        button5 = findViewById(R.id.button5);
        final String[] strings =
                {"牛排","紅酒燉牛肉","威靈頓牛排","牛肉壽喜燒","紅燒牛肉麵","泰國綠咖哩","日式炸牛排","九層塔辣炒牛肉","彩椒炒牛肉","番茄燉牛肉","牛尾羅宋湯","牛肉烏龍麵","日式燒肉","沙茶牛肉",
                        "雞肉咖哩飯","韓式雞肉年糕","雞肉飯","薑爆雞肉","南瓜香菇雞肉炊飯","雞肉豆腐丸子","照燒雞肉","韓式雞肉炒年糕","雞肉蔬菜沙拉","沙茶煎雞肉","蜜汁金針雞肉捲","泡菜炒雞肉","彩椒雞肉","三杯雞肉",
                "蜜汁豬肉","醬爆豬肉片","客家鹹豬肉","香煎紐奧良豬肉","泡菜炒豬肉","醬燒豬五花","照燒豬肉片","薑汁燒肉","蜜汁叉燒肉","香麻烤豬肉","金珠菇炒豬肉","炒香腸佐玉米筍","梅干扣肉","煎椒鹽松阪豬"};
        final TextView textView = findViewById(R.id.tvRandom);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int index = new Random().nextInt(strings.length);
                String randomString = strings[index];
                textView.setText(randomString);
            }
        });

    }

}