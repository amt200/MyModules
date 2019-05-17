package c346.rp.edu.mymodules;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {
TextView tvC203;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);
        tvC203 = findViewById(R.id.textView);
        Intent inValue = getIntent();
        String display = inValue.getStringExtra("moduleDetails");
        tvC203.setText(display);
    }
}
