package com.ryg.demo7_28.fragment.thirdfragment_login_mvp;

import com.ryg.demo7_28.Bean.UserBean;

/**
 * Created by apple on 17/8/21.
 */

public class ThirdPresentImpl implements ThirdPresent {

    private ThirdView thirdView;
    private ThirdModelImpl thirdModel;

    public ThirdPresentImpl(ThirdView thirdView){
        this.thirdView = thirdView;
        thirdModel = new ThirdModelImpl();
    }

    @Override
    public void onUsernameError() {
        if(thirdView != null){
            thirdView.setUsernameError();
        }
    }

    @Override
    public void onPasswordError() {
        if(thirdView != null){
            thirdView.setPasswordError();
        }
    }

    @Override
    public void onSuccess() {
        if(thirdView != null){
            thirdView.Success();
        }
    }

    @Override
    public void login(String username, String password) {
        UserBean bean = new UserBean();
        bean.setUsername(username);
        bean.setPassword(password);
        thirdModel.login(bean,this);
    }
}
