import java.util.Scanner;
public class Arrays {
    public static void main(String[] args) {
        //input
        int marks[]=new int[50];
        Scanner sc =new Scanner(System.in);
         marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();
        //output
        System.out.println("phy: "+marks[0]);
        System.out.println("chem: "+marks[1]);
        System.out.println("math: "+marks[2]);
        float percentage = (marks[0]+marks[1]+marks[2])/3;
        System.out.println("Percenatage: "+percentage+"%");
        //updation
        marks[0]=99;
        marks[1]=marks[1]-3;
        System.out.println("updated marks phy: "+ marks[0]);
        System.out.println("updated marks chem: "+ marks[1]);
        //length of an array
        System.out.println("Length: "+marks.length);
    }
}
