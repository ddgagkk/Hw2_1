package noname.hw2_1;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by hp on 9/27/2017.
 */

public class Student implements Parcelable {
     String name;
     String queQuan;
     String ngayThangSinh;
     String gioiTinh;
    String lop;
    String khoaHoc;

    public Student() {

    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(queQuan);
        dest.writeString(ngayThangSinh);
        dest.writeString(gioiTinh);
        dest.writeString(lop);
        dest.writeString(khoaHoc);
    }
    public static final Parcelable.Creator<Student> CREATOR
            = new Parcelable.Creator<Student>() {
        public Student createFromParcel(Parcel in) {
            return new Student(in);
        }

        public Student[] newArray(int size) {
            return new Student[size];
        }
    };

    public Student(Parcel in) {
       name= in.readString();
       queQuan= in.readString();
       ngayThangSinh= in.readString();
      gioiTinh=  in.readString();
        lop =in.readString();
        khoaHoc= in.readString();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", queQuan='" + queQuan + '\'' +
                ", ngayThangSinh='" + ngayThangSinh + '\'' +
                ", gioiTinh='" + gioiTinh + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

}
