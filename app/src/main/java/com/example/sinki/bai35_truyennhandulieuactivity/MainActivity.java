package com.example.sinki.bai35_truyennhandulieuactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void moManHinhMoi(View view) {
        //đối số 1: là màn hình hiện tại gọi intent này(tên của Activity.this
        //đối số 2: là màn hình muốn mở lên(tên Activity.class
        Intent intent = new Intent(MainActivity.this,ManHinh2Activity.class);
        //gởi lệnh tới Android System để mở màn hình
        startActivity(intent);
    }
}
