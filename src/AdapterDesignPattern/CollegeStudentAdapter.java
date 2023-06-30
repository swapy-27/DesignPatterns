package AdapterDesignPattern;

public class CollegeStudentAdapter implements Student{
   private CollegeStudent student;

   CollegeStudentAdapter(CollegeStudent student){
       this.student=student;
   }
    @Override
    public int getStudentID() {
        return student.getStudentID();
    }

    @Override
    public String getName() {
        return student.getName();
    }
}
