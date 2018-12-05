package me.firdaus1453.homeworkeduca62;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.btnLogin)
    Button btnLogin;
    @BindView(R.id.btnDaftar)
    Button btnDaftar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }

    @OnClick({R.id.btnLogin, R.id.btnDaftar})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btnLogin:
                break;
            case R.id.btnDaftar:
                startActivity(new Intent(this, DaftarActivity.class));
                break;
        }
    }
}
