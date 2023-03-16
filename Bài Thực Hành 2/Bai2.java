import java.util.Scanner;

public class Bai2{
	public static void main(String[] args) {
		Scanner mh=new Scanner(System.in);
		int a;
		System.out.println("Nhap vao mot so nguyen: ");
		a=mh.nextInt();
		if(a%2==0) System.out.println(+a+" la so chan");
		else System.out.println(+a +" la so le");
	}
}