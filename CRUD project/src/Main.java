import java.util.ArrayList;
import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 1;
        while (choice>=1){
            System.out.println("Press 0 for Exit");
            System.out.println("Press 1 for insertion");
            System.out.println("Press 2 for Updation");
            System.out.println("Press 3 for Deletion");
            System.out.println("Press 4 for Travers");
            System.out.print("Enter the choice: ");
            choice = sc.nextInt();
            switch (choice){
                case 0:
                    System.out.println("Thanks For Visiting");
                    break;
                case 1:
                    System.out.print("Enter the Roll Number: ");
                    int roll = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter the Name of Student: ");
                    String Name = sc.nextLine();
                    System.out.print("Enter the Age of Student: ");
                    int Age = sc.nextInt();
                    student stdI = new student(roll,Name,Age);
                    studentInfo.insertStatement(stdI);
                    System.out.println("Data Inserted Successfully\n");
                    break;
                case 2:
                    System.out.print("Enter the Roll Number of student: ");
                    int rollNo = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter the Name of student: ");
                    String name = sc.nextLine();
                    student stdU = new student(rollNo,name,0);
                    studentInfo.updateStudent(stdU);
                    System.out.println("Data Update Successfully\n");
                    break;
                case 3:
                    System.out.print("Enter the Roll Number of Student: ");
                    int rollD = sc.nextInt();
                    student stdD = new student(rollD,"",0);
                    studentInfo.deleteStudent(stdD);
                    System.out.println("Student Data Deleted Successfully");
                    break;
                case 4:
                    ArrayList<student> list = studentInfo.readData();
                    System.out.println();
                    for(student slist: list){
                        System.out.println(slist);
                    }
                    System.out.println();
                default:
                    System.out.println("Choose Above Option");
            }
        }
    }
}