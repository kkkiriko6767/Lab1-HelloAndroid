package com.fjnu.hellolab;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

/**
 * 实验一：Android 开发基础
 * 演示 Activity 的创建、布局加载、控件获取、事件监听、Toast 与 Log 的使用，
 * 同时把当前运行设备的版本信息显示在界面上，便于验证工程是否正常运行。
 */
public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private EditText etName;
    private TextView tvDevice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 加载布局文件
        setContentView(R.layout.activity_main);
        Log.i(TAG, "onCreate：布局加载完成");

        etName = findViewById(R.id.et_name);
        tvDevice = findViewById(R.id.tv_device);

        // 通过 Build 类读取设备与系统信息，验证工程确实跑在设备/模拟器上
        String deviceInfo = "设备：" + Build.MANUFACTURER + " " + Build.MODEL
                + "\n系统版本：Android " + Build.VERSION.RELEASE
                + "（API " + Build.VERSION.SDK_INT + "）";
        tvDevice.setText(deviceInfo);

        Button btnGreet = findViewById(R.id.btn_greet);
        Button btnClear = findViewById(R.id.btn_clear);

        btnGreet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = etName.getText().toString().trim();
                if (TextUtils.isEmpty(name)) {
                    Toast.makeText(MainActivity.this, "请先输入姓名", Toast.LENGTH_SHORT).show();
                    return;
                }
                Toast.makeText(MainActivity.this, "你好，" + name + "！欢迎进入 Android 世界",
                        Toast.LENGTH_SHORT).show();
                Log.d(TAG, "点击打招呼按钮，输入内容为：" + name);
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etName.setText("");
                Toast.makeText(MainActivity.this, "输入已清空", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart：界面可见");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume：界面获得焦点");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause：界面失去焦点");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy：Activity 销毁");
    }
}
