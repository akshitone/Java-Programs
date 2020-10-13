import java.util.Scanner;
class StudentExample
{
    int id;
    String name;

    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        StudentExample s1 = new StudentExample();
        System.out.print("Enter id number : ");
        s1.id = input.nextInt();
        System.out.print("Enter name : ");
        s1.name = input.next();
        System.out.println(s1.id);
        System.out.println(s1.name);
        input.close();
    }
}