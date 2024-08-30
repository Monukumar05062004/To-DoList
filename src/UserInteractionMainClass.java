import java.util.Scanner;

public class UserInteractionMainClass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ToDoList toDoList=new ToDoList();
        boolean running=true;
        System.out.print("Welcome to To-Do List Application!");
        while(running){
            System.out.println("\nMenu:");
            System.out.println("1. Add Task\n2. Edit Task.\n3.Remove Task\n4.Mark Task As Completed\n5.Display Task\n6. Exit");
            System.out.print("Choose an option: ");
            int choice=sc.nextInt();
            sc.nextLine();
           // System.out.println();
            switch(choice){
                case 1:
                    System.out.print("Enter Task Description:");
                    String desc=sc.nextLine();
                   // sc.nextLine();
                    toDoList.addTask(desc);
                    break;
                case 2:
                    System.out.println("Enter task no and new description which you want to update:");
                    int index=sc.nextInt();
                    sc.nextLine();
                    String newDec=sc.nextLine();
                    toDoList.editTask(index-1,newDec);
                    break;
                case 3:
                    System.out.print("Enter task no which you want to remove:");
                    int removeIndex=sc.nextInt();
                    toDoList.removeTask(removeIndex-1);
                    break;
                case 4:
                    System.out.println("Enter task no to mark as completed:");
                    int markedNo=sc.nextInt();
                    toDoList.markTaskAsCompleted(markedNo-1);
                    break;
                case 5:
                    toDoList.display();
                    break;
                case 6:
                    running=false;
                    System.out.println("Good bye and take care");
                    break;
                default:
                    System.out.println("invalid choice please chose a valid No");
            }
        }
    }
}
