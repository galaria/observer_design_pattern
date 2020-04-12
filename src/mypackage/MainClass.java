package mypackage;


public class MainClass {

   
    public static void main(String[] args) {
        
        TeamChannel channel = new TeamChannel("Java");
        Student s1 = new Student("Nick");
        Student s2 = new Student("Mary");
        Student s3 = new Student("Jonathan");
        s1.subsribe(channel);
        s2.subsribe(channel);
        s3.subsribe(channel);
        channel.printChannelStudents();
        System.out.println("*******changing channel name******");
        channel.setName("Design Patterns");
        s3.unSubsribe(channel);
        
        
        
        
    }
    
}
