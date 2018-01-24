package com.example.chankeh.uiwidgettest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText editText;
    private ImageView img;
    private ProgressBar progress;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn1 = (Button)findViewById(R.id.btn_1);
        editText = (EditText)findViewById(R.id.edit_text);
        img = (ImageView)findViewById(R.id.img_view);
        progress = (ProgressBar)findViewById(R.id.pro_bar);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                  switch(view.getId()){
                      case R.id.btn_1:
//                          String inputText = editText.getText().toString();
//                          Toast.makeText(MainActivity.this,inputText,Toast.LENGTH_SHORT).show();
//                          img.setImageResource(R.drawable.test);
//                          if(progress.getVisibility()==View.GONE){
//                              progress.setVisibility(View.VISIBLE);
//                          }else
//                          {
//                              progress.setVisibility(View.GONE);
//                          }
                          int pro = progress.getProgress();
                          pro+=10;
                          progress.setProgress(pro);
                          break;
                      default:
                          break;
                  }
            }
        });
    }
}
