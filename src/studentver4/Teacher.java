
package studentver4;

import java.util.Date;

public abstract class Teacher extends Person implements IPerson{
    private String department;
    private String teachingSubject;

    public Teacher() {
    }

    public Teacher(String id, String fullName, Date dateofBirth, String department, String teachingSubject) {
        super(id, fullName, dateofBirth);
        this.department = department;
        this.teachingSubject = teachingSubject;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getTeachingSubject() {
        return teachingSubject;
    }

    public void setTeachingSubject(String teachingSubject) {
        this.teachingSubject = teachingSubject;
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
        System.out.println("Department: " + department);
        System.out.println("TeachingSubject: " + teachingSubject);
    }
}
