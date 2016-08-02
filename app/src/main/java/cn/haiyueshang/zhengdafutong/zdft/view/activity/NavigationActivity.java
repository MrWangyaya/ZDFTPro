package cn.haiyueshang.zhengdafutong.zdft.view.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.facebook.drawee.backends.pipeline.Fresco;

import java.util.ArrayList;
import java.util.List;

import cn.haiyueshang.zhengdafutong.zdft.R;
import cn.haiyueshang.zhengdafutong.zdft.adapter.FragmentTabAdapter;
import cn.haiyueshang.zhengdafutong.zdft.view.fragment.CartFragment;
import cn.haiyueshang.zhengdafutong.zdft.view.fragment.CategoryFragment;
import cn.haiyueshang.zhengdafutong.zdft.view.fragment.HomeFragment;
import cn.haiyueshang.zhengdafutong.zdft.view.fragment.PersonalFragment;
import cn.haiyueshang.zhengdafutong.zdft.view.fragment.TelFragment;


/**
 * Created by wangzeya on 16/7/19.
 */
public class NavigationActivity extends FragmentActivity {
    public static final String TAG = NavigationActivity.class.getSimpleName();
    private RadioGroup radio_button_group;
    private FragmentTabAdapter tabAdapter;
    public List<Fragment> fragments = new ArrayList<Fragment>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Fresco.initialize(getApplicationContext());
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);
        initView();
    }

    protected void initView() {
        radio_button_group = (RadioGroup) findViewById(R.id.radio_button_group);
        fragments.add(new HomeFragment());
        fragments.add(new CategoryFragment());
        fragments.add(new TelFragment());
        fragments.add(new CartFragment());
        fragments.add(new PersonalFragment());
        tabAdapter = new FragmentTabAdapter(this, fragments, R.id.fragment_content, radio_button_group);
//		tabAdapter.onCheckedChanged(radio_button_group,R.id.navigation_tab_cart);
//		((RadioButton)radio_button_group.getChildAt(3)).setChecked(true);
    }

    public void navigateTo(int index){
        ((RadioButton)radio_button_group.getChildAt(index)).setChecked(true);
    }


}
