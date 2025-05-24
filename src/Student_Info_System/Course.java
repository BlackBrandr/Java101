package Student_Info_System;

public class Course {
    Teacher courseTeacher;
    String courseName;
    String courseCode;
    String prefix;
    double note;
    double verbal_note;
    double total_note;

    Course(String courseName, String courseCode, String prefix){
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.prefix = prefix;
        this.note = 0;
        this.verbal_note = 0;
    }

    public void addTeacher(Teacher t){
        if (this.prefix.equals(t.branch)){
            this.courseTeacher = t;
            System.out.println("İşlem başarılı");
        }else {
            System.out.println(t.teacherName + " Akademisyeni bu dersi veremez.");
        }
    }

    public void printTeacher(){
        if (courseTeacher != null){
            System.out.println(this.courseName + " Dersinin Akademisyeni : " + this.courseTeacher.teacherName);
        } else {
            System.out.println(this.courseName + this.courseName + " Dersine Akademisyen Atanmamıştır.");
        }
    }
}
