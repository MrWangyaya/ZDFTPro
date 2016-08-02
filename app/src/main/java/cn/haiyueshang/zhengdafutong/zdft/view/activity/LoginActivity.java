package cn.haiyueshang.zhengdafutong.zdft.view.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import cn.haiyueshang.zhengdafutong.zdft.R;

/**
 * Created by zr on 2016/8/2.
 */
public class LoginActivity extends Activity implements View.OnClickListener {
    private ImageView iv_back;
    private EditText et_username;
    private EditText et_password;
    private Button bt_login;
    private TextView tv_phoneregist;
    private TextView tv_findbackpsd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        init();
    }

    private void init() {
        iv_back = (ImageView) findViewById(R.id.iv_login_back);
        iv_back.setOnClickListener(this);
        et_username = (EditText) findViewById(R.id.et_login_username);
        et_password = (EditText) findViewById(R.id.et_login_password);
        tv_phoneregist = (TextView) findViewById(R.id.tv_phone_test);
        tv_phoneregist.setOnClickListener(this);
        tv_findbackpsd = (TextView) findViewById(R.id.tv_findback_password);
        tv_findbackpsd.setOnClickListener(this);
        bt_login = (Button) findViewById(R.id.bt_login);
        bt_login.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.iv_login_back:
                finish();
                break;
            case R.id.tv_phone_test:
                startActivity(new Intent(this,PhoneRegistFirstActivity.class));
                break;
            case R.id.tv_findback_password:
                break;
            case R.id.bt_login:
                break;
        }
    }
}
