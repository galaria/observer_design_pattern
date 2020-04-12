
package mypackage;

import java.util.ArrayList;
import java.util.List;


public class TeamChannel {
    private String name;
    
    private List<Observer> students;

    public TeamChannel(String name) {
        this.name = name;
        students = new ArrayList();
    }
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        String message = "The channel name has changed to "+ this.name;
        notifyAllStudents(message);
    }

    public List<Observer> getStudents() {
        return students;
    }

    public void setStudents(List<Observer> students) {
        this.students = students;
    }
    
    public void add(Student student){
        students.add(student);
        String successMessage =  "You have succesfuly subscribed to channel "+ name;
        notifyStudent(student, successMessage);
    }

    void remove(Student student) {
        students.remove(student);
        String successMessage =  "You have succesfuly unsubscribed to channel "+ name;
        notifyStudent(student, successMessage);
    }
    
    public void printChannelStudents(){
        System.out.println("*********Printing students of channel "+ name);
        for (Observer s : students){
            Student student = (Student) s;//downcasting
            System.out.println(student.getName());
        }
    }
    
    public void notifyAllStudents(String message){
        for (Observer observer : students){
            observer.update(message);
        }
    }
    
    public void notifyStudent(Observer observer, String message){
        observer.update(message);
    }
}
