package me.firdaus1453.homeworkeduca62;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class DaftarActivity extends AppCompatActivity {

    @BindView(R.id.btnFormDaftar)
    Button btnFormDaftar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnFormDaftar)
    public void onViewClicked() {
        startActivity(new Intent(this, MainActivity.class));
    }
}
