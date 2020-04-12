package mypackage;


public abstract class Observer {
    
    protected TeamChannel channel;
    
    protected abstract void update(String message);
}
