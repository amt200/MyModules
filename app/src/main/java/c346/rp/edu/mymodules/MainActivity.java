package c346.rp.edu.mymodules;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    TextView c203;
    TextView c346;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        c203 = findViewById(R.id.tvC203);
        c346 = findViewById(R.id.tvC346);
        c203.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getBaseContext(), ModuleDetailActivity.class);
                String details = "Module Code: C203\nModule Name: Web Application Development in PHP\n"+
                        "Academic Year: 2019\nSemester: 2\nModule Credit: 4\nVenue: W65Q";

                in.putExtra("moduleDetails",details);
                startActivity(in);
            }
        });
        c346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getBaseContext(), ModuleDetailActivity.class);
                String details = "Module Code: C346\nModule Name: Android Programming\n"+
                        "Academic Year: 2019\nSemester: 2\nModule Credit: 4\nVenue: W65Q";

                in.putExtra("moduleDetails",details);
                startActivity(in);
            }
        });
    }
}
