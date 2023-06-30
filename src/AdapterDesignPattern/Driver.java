package AdapterDesignPattern;

import java.util.*;

public class Driver {

    public static void main(String[] args) {
            List<Student> list = new ArrayList<>();

            SchoolStudent schoolStudent = new SchoolStudent(1,"abc");
            list.add(schoolStudent);

//            CollegeStudent collegeStudent = new CollegeStudent(1,"abc");
//            list.add(collegeStudent);

            CollegeStudent collegeStudent = new CollegeStudent(1,"abc");
            list.add(new CollegeStudentAdapter(collegeStudent));

            list.forEach(st-> System.out.println(st.getName()+" "+st.getStudentID()));


    }
}
