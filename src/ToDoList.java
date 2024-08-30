import java.util.ArrayList;
import java.util.List;

public class ToDoList {
   private List<Task> tasks;
   public ToDoList(){
       tasks=new ArrayList<>();
   }
   public void addTask(String description){
       Task newTask=new Task(description);
       tasks.add(newTask);
       System.out.println("Task added"+description);
   }
   public void editTask(int index,String newDescription){
       if(index<0||index>=tasks.size()){
           System.out.println("invalid task number");
       }
       tasks.get(index).setDescription(newDescription);
       System.out.println("Task Updated");
   }
   public void removeTask(int index){
       if(index<0||index>=tasks.size()){
           System.out.println("invalid task number");
       }
       Task removedTask=tasks.remove(index);
       System.out.println("task removed"+removedTask.getDescription());
   }
   public void markTaskAsCompleted(int index){
       if(index<0||index>=tasks.size()){
           System.out.println("invalid task number");
           return ;
       }
     tasks.get(index).setCompleted(true);
       System.out.println("Task marked as completed.");
   }
   public void display(){
       if(tasks.isEmpty()){
           System.out.println("No task in the list");
           return;
       }
       System.out.println("To-Do List");
     for(int i=0;i<tasks.size();i++){
         System.out.println(tasks.get(i));
     }
   }
}
