
package studentver4;

import java.util.ArrayList;

public class PersonList {
    private ArrayList<Person>  personList;

    public PersonList() {
        personList= new ArrayList<>();
    }
    public void addStudent(Student student){
        personList.add(student);
    }
    public void addTeacher(Teacher teacher){
        personList.add(teacher);
    }
    public void updatePerson(String id){
        for (Person person : personList){
            if (person.getId().equals(id)){
                person.updatePerson(id);
            }
        }
    }
    public void deletePersonByID(String id){
        personList.removeIf(person -> person.getId().equals(id));
    }
    public Person findPersonByID(String id){
        for (Person person : personList){
            if (person.getId().equals(id)){
                return person;
            }
        }
        return null;
    }
    public void displayEveryone(){
        for (Person person : personList){
            person.displayInfo();
        }
    }
      public Student findTopStudent(){
        Student topStudent = null;
        for (Person person : personList) {
            if (person instanceof Student student) {
                if (topStudent == null || student.getGpa() > topStudent.getGpa()) {
                    topStudent = student;
                }
            }
        }
     return topStudent;
    }
    public ArrayList<Teacher> findTeacherByDepartment(String department) {
        ArrayList<Teacher> teachers = new ArrayList<>();
        for (Person person : personList) {
            if (person instanceof Teacher) {
                Teacher teacher = (Teacher) person;
                if (teacher.getDepartment().equals(department)) {
                    teachers.add(teacher);
                }
            }
        }
        return teachers;
    }
}
