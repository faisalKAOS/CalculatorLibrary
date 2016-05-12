package com.lostinkaos.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.util.StringBuilderPrinter;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.lostinkaos.calculatorlibrary.Items;
import com.lostinkaos.calculatorlibrary.ResultProvider;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @Bind(R.id.tvNumber1)
    EditText mNumber1;
    @Bind(R.id.tvNumber2)
    EditText mNumber2;
    @Bind(R.id.btCal)
    Button mCal;
    @Bind(R.id.tvAdd)
    TextView mAdd;
    @Bind(R.id.tvSub)
    TextView mSub;
    @Bind(R.id.tvMul)
    TextView mMul;
    @Bind(R.id.tvDiv)
    TextView mDiv;
    @Bind(R.id.tvMod)
    TextView mMod;


    Items items = new Items();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                items.setNumber1(Integer.parseInt(mNumber1.getText().toString()));
                items.setNumber2(Integer.parseInt(mNumber2.getText().toString()));
            //  ResultProvider.calculateAll(items.getNumber1(),items.getNumber2());
               // Log.d("res",items.getResultAdd());
                ResultProvider resultProvider = new ResultProvider();
                Integer resAdd = resultProvider.funAdd(items.getNumber1(), items.getNumber2());
                mAdd.setText(String.valueOf(resAdd));
                Integer resSub = resultProvider.funSub(items.getNumber1(), items.getNumber2());
                mSub.setText(String.valueOf(resSub));

              Integer resMul = resultProvider.funMul(items.getNumber1(), items.getNumber2());
                mMul.setText(String.valueOf(resMul));

                Integer resDiv = null;
                try {
                    resDiv = resultProvider.funDiv(items.getNumber1(), items.getNumber2());
                } catch (Exception e) {
                    e.printStackTrace();
                }
                mDiv.setText(String.valueOf(resDiv));

                Integer resMod = null;
                try {
                    resMod = resultProvider.funMod(items.getNumber1(), items.getNumber2());
                } catch (Exception e) {
                    e.printStackTrace();
                }
                mMod.setText(String.valueOf(resMod));
            }
        });



    }
}
