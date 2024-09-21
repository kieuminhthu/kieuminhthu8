
package studentver4;

import java.util.Date;

abstract class Student extends Person implements IPerson{
    private float gpa;
    private String major;

    public Student() {
    }
    
    public Student(String id, String fullName, Date dateofBirth, float gpa, String major) {
        super(id, fullName, dateofBirth);
        this.gpa = gpa;
        this.major = major;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
    @Override
    public void addPerson(){  
    }
    @Override
    public void updatePerson(String id){      
    }
    @Override
    public void displayInfo(){
        System.out.println("ID: " + id);
        System.out.println("Full name: " + fullName);
        System.out.println("Date of birth: " + dateofBirth);
        System.out.println("GPA: " + gpa);
        System.out.println("Major: " + major);
    }
}
