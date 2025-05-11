package Student_Info_System;

public class Student {
    String studentName;
    String studentNo;
    int classes;
    Course math;
    Course fizik;
    Course kimya;
    double average;
    boolean isPass;

    Student(String studentName, int classes, String studentNo, Course mat, Course fizik, Course kimya){
        this.studentName = studentName;
        this.studentNo = studentNo;
        this.classes = classes;
        this.math = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAverage();
        this.isPass = false;
    }

    public void addBulkExamNote(int mat, int fizik, int kimya){

        if (mat >= 0 && mat <=100){
            this.math.note = mat;
        }
        if (fizik >= 0 && fizik <=100){
            this.fizik.note = fizik;
        }
        if (kimya >= 0 && kimya <=100){
            this.kimya.note = kimya;
        }
    }

    public void addVerbalNote(int mat, int fizik, int kimya){

        if (mat >= 0 && mat <=100){
            this.math.verbal_note = mat;
        }
        if (fizik >= 0 && fizik <=100){
            this.fizik.verbal_note = fizik;
        }
        if (kimya >= 0 && kimya <=100){
            this.kimya.verbal_note = kimya;
        }
    }

    public void isPass(){

        if(this.math.note == 0 || this.fizik.note == 0 || this.kimya.note == 0 || this.math.verbal_note == 0
                || this.fizik.verbal_note == 0 || this.kimya.verbal_note == 0){

            System.out.println("Notlar tam olarak girilmemiş");

        }else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.average);

            if (this.isPass){
                System.out.println("Sınıfı Geçtiniz");
            }else {
                System.out.println("Sınıfta Kaldınız");
            }
        }
    }

    public boolean isCheckPass(){
        calcAverage();
        return this.average > 55;
    }

    public void setTotal_note(){
        this.math.total_note = (this.math.note * 0.80) + (this.math.verbal_note * 0.20);
        this.fizik.total_note = (this.fizik.note * 0.80) + (this.fizik.verbal_note * 0.20);
        this.kimya.total_note = (this.kimya.note * 0.80) + (this.kimya.verbal_note * 0.20);
    }

    public void calcAverage(){
        this.average = (this.math.total_note + this.fizik.total_note + this.kimya.total_note) / 3;
    }

    public void printNote(){
        System.out.println("====================================");
        System.out.println("Öğrenci : " + this.studentName);
        System.out.println("Matematik : " + this.math.total_note);
        System.out.println("Fizik : " + this.fizik.total_note);
        System.out.println("Kimya : " + this.kimya.total_note);
        System.out.println("====================================");
    }
}
