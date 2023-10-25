package com.funder.robustplus;

import android.os.Bundle;
import android.widget.Toast;

import com.meituan.robust.PatchExecutor;
import com.meituan.robust.patch.PatchManipulateImp;
import com.meituan.robust.patch.RobustCallBackSample;
import com.meituan.robust.patch.RobustModify;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
  }

  private void runRobust() {
    new PatchExecutor(getApplicationContext(), new PatchManipulateImp(),
        new RobustCallBackSample()).start();
  }

  private void test() {
    RobustModify.modify();
    Toast.makeText(this, "hello ", Toast.LENGTH_LONG).show();
  }
}