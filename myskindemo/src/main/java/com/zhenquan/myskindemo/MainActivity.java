package com.zhenquan.myskindemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.zhy.changeskin.SkinManager;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SkinManager.getInstance().register(this);
        Button btn_changeBg = (Button) findViewById(R.id.btn_changebg);
        Button btn_change_txtcolor = (Button) findViewById(R.id.btn_change_txtcolor);
        btn_change_txtcolor.setOnClickListener(this);
        btn_changeBg.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_change_txtcolor:
                SkinManager.getInstance().changeSkin("green");
                break;
            case R.id.btn_changebg:
                SkinManager.getInstance().changeSkin("green");
                break;
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        SkinManager.getInstance().unregister(this);
    }
}
