package com.bluewater.demo;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.bluewater.lib.ToastUtils;

public class MainActivity extends AppCompatActivity
{

    private Context mContext;
    private Activity mActivity;

    private Button mBtnToastUtilsDefaultText;
    private Button mBtnToastUtilsSuccess;
    private Button mBtnToastUtilsError;
    private Button mBtnToastUtilsInfo;
    private Button mBtnToastUtilsWarning;
    private Button mBtnToastUtilsDefault;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("ToastUtilsTestActivity");

        mContext = this;
        mActivity = this;
        ToastUtils.initToast(mContext);

        initView();
        initEvent();
    }

    private void initView()
    {
        mBtnToastUtilsDefaultText = findViewById(R.id.btn_toast_utils_default_text);
        mBtnToastUtilsSuccess = findViewById(R.id.btn_toast_utils_success);
        mBtnToastUtilsError = findViewById(R.id.btn_toast_utils_error);
        mBtnToastUtilsInfo = findViewById(R.id.btn_toast_utils_info);
        mBtnToastUtilsWarning = findViewById(R.id.btn_toast_utils_warning);
        mBtnToastUtilsDefault = findViewById(R.id.btn_toast_utils_default);
    }

    private void initEvent()
    {
        mBtnToastUtilsDefaultText.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                ToastUtils.onDefaultWithoutIconShowToast("DefaultText");
            }
        });

        mBtnToastUtilsSuccess.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                ToastUtils.onSuccessShowToast("Success");
            }
        });

        mBtnToastUtilsError.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                ToastUtils.onErrorShowToast("Error");
            }
        });

        mBtnToastUtilsInfo.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                ToastUtils.onInfoShowToast("Info");
            }
        });

        mBtnToastUtilsWarning.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                ToastUtils.onWarnShowToast("Warning");
            }
        });

        mBtnToastUtilsDefault.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                ToastUtils.onDefaultShowToast("Default");
            }
        });
    }

}