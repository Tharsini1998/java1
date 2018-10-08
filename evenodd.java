import java.util.Scanner;

public class evenodd {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
      
        int num = reader.nextInt();

        if(num % 2 == 0)
            System.out.println(num + " is even"); 
	else if
		System.out.println(num + " is invalid ");
        else
            System.out.println(num + " is odd");
    }
}