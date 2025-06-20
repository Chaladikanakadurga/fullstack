import java.util.Scanner;
class Morf{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    char a=sc.next().charAt(0);
    switch(Character.toUpperCase(a))
    {
      case 'M':
        System.out.println("Male");
        break; 
      case 'F':
        System.out.println("Female");
        break;
      default:
        System.out.println("Invalid input");
        break;
    }
}
}