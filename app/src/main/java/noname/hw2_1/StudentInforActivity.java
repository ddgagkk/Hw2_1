package noname.hw2_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class StudentInforActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_infor);
        Intent tempIntent= getIntent();
        Student tempStudent=(Student) tempIntent.getParcelableExtra("infor");
        TextView temp=(TextView) findViewById(R.id.txtName);
        temp.setText(tempStudent.name);
        temp=(TextView) findViewById(R.id.viewQueQuan);
        temp.setText(tempStudent.queQuan);
        temp=(TextView) findViewById(R.id.viewDOB);
        temp.setText(tempStudent.ngayThangSinh);
        temp=(TextView) findViewById(R.id.viewSex);
        temp.setText(tempStudent.gioiTinh);
        temp=(TextView) findViewById(R.id.viewClass);
        temp.setText(tempStudent.lop);
        temp=(TextView) findViewById(R.id.viewtCourse);
        temp.setText(tempStudent.khoaHoc);
    }
}
