package advance.dev;

import java.util.Scanner;

public class MainApp {
	static double divide(int a, int b) throws NotNumberZero {
		if(b == 0) {
			throw new NotNumberZero("So nhap vao k hop le vi bang 0");
		}
		return (double) a/b;
	}

	public static void parse(String a){
		int so;
	        if (a.trim().equals("")) {
	            System.out.println("Ban nhap chuoi rong, xin vui long nhap lai.");
	        }
	        try {
	            so = Integer.parseInt(a);
	    	    System.out.println("So la: "+ so);
	        } catch (NumberFormatException ex) {
	            System.out.println("Ban nhap chuoi khong hop le, xin vui long chi nhap so.");
	        }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao a,b: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		try {
			double c = divide(a, b);
			System.out.println(c);
		} catch (NotNumberZero s) {
			// TODO: handle exception
			System.out.println(s.toString());
		}
		System.out.println("Nhap vao a = ");
		String str = sc.next();
		parse(str);
	}

}


