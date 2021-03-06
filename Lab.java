//import java.util.ArrayList;
import java.util.*;


// class Lab:
// 	Date of Lab
//  TAs Present (A list/string comprising of the names of the TAs present during the lab)
// 	Min. Lab Duration (The min time for which the student has to be present in the lab to be marked present)
// 	Student[n] (An array or list where ‘n’ is the no. of students in the class) and Student[i] would be referencing to an object of a new subclass comprising of:
// 		Roll No (UNIQUE ID)
// 		Login Time
// 		Logout Time


class Lab {
    private Date date;
    //ArrayList<String> TAs;
    private int minLabDuration; 
    ArrayList<StudentInLab> studentsInLab; // the new student class for the Lab class

    public Lab(int day, int month, int year) {
        this.date = new Date(day, month, year);
        studentsInLab = new ArrayList<StudentInLab>();
    }

    public void addMinLabDuration(int min){
        this.minLabDuration=min;
    }

    public int getminLabDuration(){
        return this.minLabDuration;
    }

    // public void AddTA(String name) {
    //     this.TAs.add(name);
    // }
    
    public void studentsAttended(){
        for (StudentInLab stud: studentsInLab){
            System.out.println(stud.id + " " + stud.studentData.name);  
        }
    }

    public StudentInLab addStudent(String id) {
        StudentInLab temp = new StudentInLab(id);
        studentsInLab.add(temp);
        return temp;
    }
}

class StudentInLab{
    String id;
    //private Time inTime;
    //private Time outTime;
    Student studentData;

    public StudentInLab( String id) {
        this.id = id;
       // this.inTime = inTime;
       // this.outTime = outTime;
    }
    
    public void setReference(Student sref){
        this.studentData=sref;
    }
}

class Date {
    int d;
    int m;
    int y;
    
    public Date(int day, int month, int year) {
        this.d = day;
        this.m = month;
        this.y = year;
    }
}

/*class Time {
    int h;
    int m;
    int s;
    
    public Time(int hours, int minutes, int seconds) {
        this.h = hours;
        this.m = minutes;
        this.s = seconds;
    }
}
*/