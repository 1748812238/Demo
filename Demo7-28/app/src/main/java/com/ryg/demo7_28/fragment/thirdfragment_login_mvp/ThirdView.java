package com.ryg.demo7_28.fragment.thirdfragment_login_mvp;

/**
 * Created by apple on 17/8/21.
 */

public interface ThirdView {
    void setUsernameError();

    void setPasswordError();

    void Success();

    void toNewActivity();
}
