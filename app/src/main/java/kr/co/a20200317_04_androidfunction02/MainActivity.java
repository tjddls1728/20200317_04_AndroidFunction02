package kr.co.a20200317_04_androidfunction02;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import kr.co.a20200317_04_androidfunction02.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main);

        binding.dialBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                다른 화면으로 이동 : intent
//                => 우리가 만든게 아니라, 안드로이드가 제공하는 화면으로 이동
//                => 전화 걸기 화면

//                어느 화면으로 갈지 -> 안드로이드가 요구하는 방식으로 작성 : uri
                Uri uri = Uri.parse("Tell:01012341234");
                Intent intent = new Intent(Intent.ACTION_DIAL,uri);
                startActivity(intent);

            }
        });
    }
}
