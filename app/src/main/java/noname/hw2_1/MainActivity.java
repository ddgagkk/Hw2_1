package noname.hw2_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btnsubmit).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText name=(EditText) findViewById(R.id.editText);
                String text=name.getText().toString();
                Intent changeScreen= new Intent(MainActivity.this, StudentActivity.class);
                Student temp= new Student();
                temp.name=text;
                changeScreen.putExtra("infor",temp);
                startActivity(changeScreen);
            }
        });


    }
}
