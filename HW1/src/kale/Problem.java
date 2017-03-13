package kale;

public class Problem {
	//1代表等边三角形 2代表等腰三角形 3代表不等边三角形
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
