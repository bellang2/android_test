package org.techtown.quiz_test;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ImageView imageView1;
    ImageView imageView2;

    int imageIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView1 = findViewById(R.id.imageView1);
        imageView2 = findViewById(R.id.imageView2);
    }

    public void onButton1Clicked(View v) {
        if (imageIndex == 0) {
            Toast.makeText(this, "정답이 아닙니다.",Toast.LENGTH_LONG).show();
        } else if (imageIndex == 1) {
            changeImage();
        }
    }

    public void onButton2Clicked(View v) {
        Toast.makeText(this, "정답이 아닙니다.",Toast.LENGTH_LONG).show();
    }

    public void onButton3Clicked(View v) {
        Toast.makeText(this, "정답이 아닙니다.",Toast.LENGTH_LONG).show();
    }

    public void onButton4Clicked(View v) {
        if (imageIndex == 1) {
            Toast.makeText(this, "정답이 아닙니다.",Toast.LENGTH_LONG).show();
        } else if (imageIndex == 0) {
            changeImage();
        }
    }

    private void changeImage() {
        if (imageIndex == 0) {
            imageView1.setVisibility(View.VISIBLE);
            imageView2.setVisibility(View.INVISIBLE);

            imageIndex = 1;
        } else if (imageIndex == 1) {
            imageView1.setVisibility(View.INVISIBLE);
            imageView2.setVisibility(View.VISIBLE);

            imageIndex = 0;
        }
    }
}
