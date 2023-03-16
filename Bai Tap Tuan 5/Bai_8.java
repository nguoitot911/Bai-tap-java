import java.util.Scanner;

public class Bai_8 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n;
	int Q[];
	do {
		System.out.println("Nhap vao day so: ");
		n=sc.nextInt();
	    }while(n<=0);
	Q=new int [n];
	for(int i=0;i<Q.length;i++) {
	System.out.println("A["+i+"]=");
	Q[i]=sc.nextInt();
	}
	float tong=0,trungbinhcong;
	for(int i=0;i<Q.length;i++) {
		tong+=Q[i];
	}
	trungbinhcong=tong/n;
	System.out.println("Trung binh cong cua day so la: "+trungbinhcong);
}
}