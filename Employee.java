import java.util.*;
public class Employee {
    String name,PAN;
    int age,empID,basic_salary;
    double income;
    // Constructor with all parameters
    Employee(String name, int age, int empID, String PAN, int basic_salary){
        this.name=name;
        this.age=age;
        this.empID=empID;
        this.PAN=PAN;
        this.basic_salary=basic_salary;
    }
    

    Employee(String name, int empID, int basic_salary, int age, String PAN){
        this.name=name;
        this.empID=empID;
        this.basic_salary=basic_salary;
        this.age=age;
        this.PAN=PAN;
    }
    
    Employee(){
        this.name="";
        this.age=0;
        this.empID=0;
        this.PAN="";
        this.basic_salary=0;
    }

    void calculate(){
        double DA=0.4*basic_salary;
        double HRA=0.2*basic_salary;
        double PF=0.1*basic_salary;
        double gross=basic_salary+DA+HRA+250.00;
        double tax=0.1*basic_salary;
        double deduction=PF+100.00+tax;
        income=gross-deduction;
    }

    void display(){
        System.out.println("Name: "+name);
        System.out.println("Employee ID: "+empID);
        System.out.println("Age: "+age);
        System.out.println("PAN: "+PAN);
        System.out.println("Net income: "+income);
        System.out.println("   ");
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Employee[] emp=new Employee[5];
        for(int i=0;i<5;i++){
            System.out.println("Enter name, age, emp ID, PAN, basic salary for emp "+(i+1));      
            String name=sc.next();
            int age=sc.nextInt();
            int empID=sc.nextInt();
            String PAN=sc.next();
            int basic_salary=sc.nextInt();
            emp[i]= new Employee(name,age,empID,PAN,basic_salary);
        }
        for(int i=0;i<5;i++){
            emp[i].calculate();
            emp[i].display();
        }
        sc.close();
    }
}
