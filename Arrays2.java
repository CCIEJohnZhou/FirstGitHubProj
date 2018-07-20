package JAVAPackages;

import java.util.Scanner;

public class Arrays2 {
        //计算三个班级五名同学的总分
	    public static void main(String[] args) {
	    	Scanner input= new Scanner(System.in);
			int [][] arr=new int[3][5];
			for (int i = 0; i < arr.length; i++) {
				System.out.println("第"+(i+1)+"个班级的总成绩统计");
				for(int j=0; j<arr[i].length ;j++) {
					System.out.print("第"+(j+1)+"个学生的成绩:");
					arr[i][j]=input.nextInt();
				}
				System.out.println();
			}
			System.out.println("\n***************成绩统计*****************");
			int sum;
			for (int i = 0; i < arr.length; i++) {
				sum=0;
				for(int j=0; j<arr[i].length ;j++) {
					sum+=arr[i][j];
				}
				System.out.println("第"+(i+1)+"个班级的总成绩为："+sum);
			}
		}
	   
}
