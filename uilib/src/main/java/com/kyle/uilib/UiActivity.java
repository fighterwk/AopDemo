package com.kyle.uilib;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 功能描述:
 * 作者:wangkun
 * 创建时间:2019/4/26 14:50
 **/
public class UiActivity extends AppCompatActivity {

    @BindView(R2.id.tv_name)
    TextView tvName;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ui);
        ButterKnife.bind(this);

        tvName.setText("---------1");

    }
}
