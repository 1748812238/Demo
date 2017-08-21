package com.ryg.demo7_28.fragment.thirdfragment_login_mvp;

/**
 * Created by apple on 17/8/21.
 */

public interface ThirdPresent {
    void onUsernameError();

    void onPasswordError();

    void onSuccess();

    void login(String username,String password);

}
