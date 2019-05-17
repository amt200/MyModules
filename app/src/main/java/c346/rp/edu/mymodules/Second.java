package c346.rp.edu.mymodules;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Second extends AppCompatActivity {
TextView tvC346;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
        tvC346 = findViewById(R.id.textView2);
        Intent inValue = getIntent();
        String display = inValue.getStringExtra("moduleDetails");
        tvC346.setText(display);
    }
}
