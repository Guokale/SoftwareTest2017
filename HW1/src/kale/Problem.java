package kale;

public class Problem {
	//1����ȱ������� 2������������� 3�����ȱ�������
	public int test(int a, int b, int c){
			if(a == b || a == c || b == c){
				if(a == b && b == c){
					return 1;
				}else{
					return 2;
				}
			}else{
				return 3;
			}
		}
}
