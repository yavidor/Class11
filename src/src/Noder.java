package src;

public class Noder {
public static double avg(int[] arr) {
	int max=0;
	for  (int i=0;i<3;i++)
		max+=arr[i];
	return(max/3);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {100,50,0};
		System.out.println(avg(a));
	}

}
