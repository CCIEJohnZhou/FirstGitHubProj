package JAVAPackages;

import java.util.Scanner;

public class Arrays2 {
        //���������༶����ͬѧ���ܷ�
	    public static void main(String[] args) {
	    	Scanner input= new Scanner(System.in);
			int [][] arr=new int[3][5];
			for (int i = 0; i < arr.length; i++) {
				System.out.println("��"+(i+1)+"���༶���ܳɼ�ͳ��");
				for(int j=0; j<arr[i].length ;j++) {
					System.out.print("��"+(j+1)+"��ѧ���ĳɼ�:");
					arr[i][j]=input.nextInt();
				}
				System.out.println();
			}
			System.out.println("\n***************�ɼ�ͳ��*****************");
			int sum;
			for (int i = 0; i < arr.length; i++) {
				sum=0;
				for(int j=0; j<arr[i].length ;j++) {
					sum+=arr[i][j];
				}
				System.out.println("��"+(i+1)+"���༶���ܳɼ�Ϊ��"+sum);
			}
		}
	   
}
