package com.lvpeiling.belibeli.view.activity;

import android.os.Bundle;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.lvpeiling.belibeli.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LoginActivity extends BaseActivity {

    @BindView(R.id.autoTvUserName)
    AutoCompleteTextView autoTvUserName;
    @BindView(R.id.autoTvPwd)
    AutoCompleteTextView autoTvPwd;
    @BindView(R.id.checkbox)
    CheckBox checkbox;
    @BindView(R.id.tv_forget)
    TextView tvForget;
    @BindView(R.id.btn_login)
    Button btnLogin;
    @BindView(R.id.btn_register)
    Button btnRegister;
    @BindView(R.id.linearLayout)
    LinearLayout linearLayout;

    String mUserName, mPwd;
    @Override
    public int getContentViewId() {
        return R.layout.activity_login;
    }


    @Override
    protected void initAllView(Bundle savedInstanceState) {
        mUserName = autoTvUserName.getText().toString().trim();
        mPwd = autoTvPwd.getText().toString().trim();

    }

}
