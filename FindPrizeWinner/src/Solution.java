
import java.util.Arrays;

import java.util.Scanner;
public class Solution {
	  public static void main(String[] args) {
			try(Scanner s = new Scanner(System.in))
			{
				int n = s.nextInt();
				int d = s.nextInt();
				int k = s.nextInt();
				int j = s.nextInt();
				
				//������� �ۼ��� �ּ���
                
				int[] ary = new int[n];
				Arrays.fill(ary, 1);
				int crntIndex=0;
				int cnt=0;
				int prizeWinner = 1;
				//���⸸ŭ ����, 0�̸� �Ѿ
				//Ż���� =0
				//�������� ������
				
				while(n!=1) {

					//�ð����
					if(d==1) {
						for(int i=1; i<=k;) {    //Ż���� ���� �ϱ� ���� ����
							
							if(crntIndex+1 == n) crntIndex = -1; 
							
							if(ary[crntIndex+1]==1) {// ������ ��ŭ ����.
								crntIndex++;
								i++;
							}else crntIndex++;
						}
					}
					else {
							for(int i=1; i<=k;) {    //Ż���� ���� �ϱ� ���� ����
							
							if(crntIndex-1 == -1) crntIndex = n; 
							
							if(ary[crntIndex-1]==1) {// ������ ��ŭ ����.
								crntIndex--;
								i++;
								
							}else crntIndex--;
						}
					//�ݽð�
					}
					ary[crntIndex] = 0; //Ż���� ����
					cnt++;
					k+=j;
					if(cnt+1 == n) break;
				}
				for(int i=0;; i++) {
					if(ary[i]==1) {
						System.out.print(i+1);
						break;
					}
				}
				
			}
	  }
}