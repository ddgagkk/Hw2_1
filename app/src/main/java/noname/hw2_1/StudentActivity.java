package noname.hw2_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class StudentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);
         Intent tempIntent= getIntent();
        final Student tempStudent=(Student) tempIntent.getParcelableExtra("infor");
        TextView temp=(TextView) findViewById(R.id.txtName);
        temp.setText(tempStudent.name);
        Button submit= (Button) findViewById(R.id.btnsubmit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nguyenQuan= ((EditText) findViewById(R.id.editTextQueQuan)).getText().toString();
                String Dob= ((EditText) findViewById(R.id.editTextDOB)).getText().toString();
                String sex= ((EditText) findViewById(R.id.editTextSex)).getText().toString();
                String Class= ((EditText) findViewById(R.id.editTextClass)).getText().toString();
                String course= ((EditText) findViewById(R.id.editTextCourse)).getText().toString();
                tempStudent.queQuan=nguyenQuan;
                tempStudent.ngayThangSinh=Dob;
                tempStudent.gioiTinh=sex;
                tempStudent.lop=Class;
                tempStudent.khoaHoc=course;
                Intent intent= new Intent(StudentActivity.this,StudentInforActivity.class);
                intent.putExtra("infor",tempStudent);
                startActivity(intent);
            }
        });
    }
}
