import java.util.Scanner;

class StudentRecord {
    int studentID;
    String name;
    String course;
    
    StudentRecord(int studentID,String name, String course){
        this.studentID = studentID;
        this.name = name;
        this.course = course;
    }
    
    void displayInfo(){
        System.out.println("Your ID is: " + studentID);
        System.out.println("Your name is: " + name);
        System.out.println("Your course is: " + course);
    }
}

class StudentApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter Your ID: "); 
        int studentID=scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Enter Your name: "); 
        String name=scanner.nextLine();
        
        System.out.println("Enter Your course: "); 
        String  course=scanner.nextLine();
        
        StudentRecord studentrecord = new StudentRecord(studentID,name,course);
        studentrecord.displayInfo();
        
        scanner.close();
    }
}