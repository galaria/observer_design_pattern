
package mypackage;


public class Student extends Observer {

    private String name;

    public Student(String name) {
        this.name = name;
    }
    
    
    
    @Override
    protected void update(String message) {
        System.out.println(this.name+", "+message);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void subsribe/*setChannel*/(TeamChannel channel){
        super.channel=channel;
        channel.add(this);
    };
    
    public void unSubsribe(TeamChannel channel){
        super.channel=null;
        channel.remove(this);
    };
    
    
}
