package com.sd.selection;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.sd.lib.selection.config.FViewSelection;
import com.sd.lib.selection.config.PropertiesConfig;
import com.sd.lib.selection.properties.TextViewProperties;

public class MainActivity extends AppCompatActivity
{
    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextView = findViewById(R.id.textview);

        mTextView.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                // 切换选中状态
                mTextView.setSelected(!mTextView.isSelected());
            }
        });

        FViewSelection.ofTextView(mTextView).setConfig(new PropertiesConfig<TextViewProperties>()
        {
            @Override
            public void config(TextViewProperties normal, TextViewProperties selected)
            {
                // 配置正常状态的参数
                normal.setTextColor(Color.BLUE).setTextSize(60);

                // 配置选中状态的参数
                selected.setTextColor(Color.RED).setTextSize(100);
            }
        }).setSelected(false);
    }
}
