package cn.haiyueshang.zhengdafutong.zdft.view.activity;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import cn.haiyueshang.zhengdafutong.zdft.R;
import cn.haiyueshang.zhengdafutong.zdft.view.customview.CustomDialog;


/**
 * Created by zr on 2016/8/2.
 */
public class PhoneRegistFirstActivity extends Activity{
    private ImageView iv_back;
    private Button bt_next;
    private EditText et_phonenumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phonefastregist);

        init();
        setListener();
    }

    private void setListener() {
        iv_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        bt_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    private void init() {
        iv_back = (ImageView) findViewById(R.id.iv_regist_back);
        bt_next = (Button) findViewById(R.id.bt_regist_next);
        et_phonenumber = (EditText) findViewById(R.id.et_regist_phonenumber);
    }

    private void showAlertDialog(View view){
        CustomDialog.Builder builder = new CustomDialog.Builder(this);
        builder.setMessage("改手机号已被使用，继续注册将与原账号解绑。如果您希望使用原账号"
                +"，请返回登录界面直接登录。是否继续注册？");
        builder.setTitle("提示");
        builder.setPositiveButton("确定", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
                //设置你的操作事项
            }
        });

        builder.setNegativeButton("取消",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });

        builder.create().show();
    }
}
