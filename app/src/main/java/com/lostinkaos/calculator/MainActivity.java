package com.lostinkaos.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.lostinkaos.calculatorlibrary.Items;
import com.lostinkaos.calculatorlibrary.ResultProvider;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @Bind(R.id.btAdd)
    Button mAdd;

    @Bind(R.id.btSub)
    Button mSub;

    @Bind(R.id.btMultiply)
    Button mMul;

    @Bind(R.id.btDivide)
    Button mDiv;

    @Bind(R.id.tvNumber1)
    EditText mNum1;

    @Bind(R.id.tvNumber2)
    EditText mNum2;

    @Bind(R.id.tvResult)
    TextView mResult;

    final Items items = new Items();

    String flag;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);



        mAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag = "add";
                items.setNumber1(Integer.parseInt(mNum1.getText().toString()));
                items.setNumber2(Integer.parseInt(mNum2.getText().toString()));
              String result = ResultProvider.calculate(items.getNumber1(),items.getNumber2(),flag);
                Log.d("result",result);
                mResult.setText(result);
            }
        });

        mSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag = "sub";
                items.setNumber1(Integer.parseInt(mNum1.getText().toString()));
                items.setNumber2(Integer.parseInt(mNum2.getText().toString()));
                String result = ResultProvider.calculate(items.getNumber1(),items.getNumber2(),flag);
                Log.d("result",result);
                mResult.setText(result);
            }
        });
        mMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag = "mul";
                items.setNumber1(Integer.parseInt(mNum1.getText().toString()));
                items.setNumber2(Integer.parseInt(mNum2.getText().toString()));
                String result = ResultProvider.calculate(items.getNumber1(),items.getNumber2(),flag);
                Log.d("result",result);
                mResult.setText(result);
            }
        });

        mDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag = "div";
                items.setNumber1(Integer.parseInt(mNum1.getText().toString()));
                items.setNumber2(Integer.parseInt(mNum2.getText().toString()));
                String result = ResultProvider.calculate(items.getNumber1(),items.getNumber2(),flag);
                Log.d("result",result);
                mResult.setText(result);
            }
        });
    }
}
