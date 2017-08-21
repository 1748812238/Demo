package com.ryg.demo7_28.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.ryg.demo7_28.R;
import com.ryg.demo7_28.fragment.thirdfragment_login_mvp.ThirdPresent;
import com.ryg.demo7_28.fragment.thirdfragment_login_mvp.ThirdPresentImpl;
import com.ryg.demo7_28.fragment.thirdfragment_login_mvp.ThirdView;

/**
 * Created by apple on 17/7/28.
 */

public class ThirdFragment extends Fragment implements ThirdView,View.OnClickListener{

    private EditText username;
    private EditText password;
    private Button btn_login;
    private ThirdPresentImpl thirdPresent;
    private View view;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_three,container,false);

        thirdPresent = new ThirdPresentImpl(this);

        username = (EditText) view.findViewById(R.id.username);
        password = (EditText) view.findViewById(R.id.password);
        btn_login = (Button) view.findViewById(R.id.btn_login);

        btn_login.setOnClickListener(this);



        return view;
    }

    @Override
    public void onClick(View v) {
        thirdPresent.login(username.getText().toString(),password.getText().toString());
    }

    @Override
    public void setUsernameError() {
        username.setError("username error");
    }

    @Override
    public void setPasswordError() {
        password.setError("password error");
    }

    @Override
    public void Success() {
        Toast.makeText(getActivity(),"success",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void toNewActivity() {

    }
}
