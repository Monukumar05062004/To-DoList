public class Task {
    private String description;
    private boolean isCompleted;
    Task(String description){
        this.description=description;
        this.isCompleted=false;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description){
        this.description=description;
    }
    public void setCompleted(boolean isCompleted){
        this.isCompleted=isCompleted;
    }
    public boolean getComplete(){
        return isCompleted;
    }
    public String toString(){
        return (isCompleted?"[Complete]":"[Pending]")+description;
    }
}
