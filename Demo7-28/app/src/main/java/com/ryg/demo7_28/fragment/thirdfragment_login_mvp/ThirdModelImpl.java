package com.ryg.demo7_28.fragment.thirdfragment_login_mvp;

import com.ryg.demo7_28.Bean.UserBean;

/**
 * Created by apple on 17/8/21.
 */

public class ThirdModelImpl implements ThirdModel {
    @Override
    public void login(UserBean bean, ThirdPresent thirdPresent) {
        if(!bean.getUsername().equals("123")){
            thirdPresent.onUsernameError();
        }
        if (!bean.getPassword().equals("123")) {
            thirdPresent.onPasswordError();
        }
        if(bean.getPassword().equals("123") && bean.getUsername().equals("123")){
            thirdPresent.onSuccess();
        }
    }
}
