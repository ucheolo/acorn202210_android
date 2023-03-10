package com.example.step05example;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    // 필요한 필드 선언
    EditText editText;
    List<String> names;
    ArrayAdapter<String> adapter;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 필요한 UI 의 참조값을 UI 에 부여된 id 를 이용해서 얻어오기
        listView = findViewById(R.id.listView);
        editText = findViewById(R.id.editText);
        Button addBtn = findViewById(R.id.addBtn);
        // 버튼 리스너 등록
        addBtn.setOnClickListener(this);
        // 모델 생성
        names = new ArrayList<>();
        // 아답터
        adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1,
                names);
        // 아답타를 ListView 에 연결
        listView.setAdapter(adapter);
    }

    @Override
    public void onClick(View view) {
        // 1. EditText 에 입력한 문자열을 읽어온다.
        String inputName=editText.getText().toString();
        // 2. 모델에 데이터를 추가한다.
        names.add(inputName);
        // 3. ListView 가 업데이트 될수 있도록 아답타에 모델이 수정되었다고 알린다.
        adapter.notifyDataSetChanged();
        // 4. EditText 에 입력한 문자열 삭제
        editText.setText("");

    }
}