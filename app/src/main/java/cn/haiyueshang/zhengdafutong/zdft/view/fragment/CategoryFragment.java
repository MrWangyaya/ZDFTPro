package cn.haiyueshang.zhengdafutong.zdft.view.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import cn.haiyueshang.zhengdafutong.zdft.R;

/**
 * Created by wangzeya on 16/8/2.
 */
public class CategoryFragment extends Fragment {

    private View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_category,null);

        return view;
    }

}
