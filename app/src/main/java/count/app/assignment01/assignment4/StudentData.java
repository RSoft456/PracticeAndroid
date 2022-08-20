package count.app.assignment01.assignment4;

public class StudentData {
    private String StudentName;
    private String CourseName;
    private String StudentDepartment;
    private String StudentSubject;

    public StudentData(String studentName, String studentDepartment, String studentSubject, String courseName) {
        this.StudentName = studentName;
        this.CourseName = courseName;
        this.StudentDepartment = studentDepartment;
        this.StudentSubject = studentSubject;
    }

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String courseName) {
        this.CourseName = courseName;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        this.StudentName = studentName;
    }

    public String getStudentDepartment() {
        return StudentDepartment;
    }

    public void setStudentDepartment(String studentDepartment) {
        this.StudentDepartment = studentDepartment;
    }

    public String getStudentSubject() {
        return StudentSubject;
    }

    public void setStudentSubject(String studentSubject) {
        this.StudentSubject = studentSubject;
    }
}
