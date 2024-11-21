package src;

public class RainTrapping {
public static void main(String[] args) {
int hight[]= {0,1,0,2,1,0,1,3,2,1,2,1};
	RainTrapping rwt=new RainTrapping();
	int rainWater = rwt.rainWater(hight);
	System.out.println(rainWater);	
}
int rainWater(int a[]) {
	int n=a.length;
	int left[]=new int[n];
	int right[]=new int [n];
	left[0]=a[0];
	for(int i=1;i<n;i++) {
		left[i]=Math.max(left[i-1], a[i]);
	}
	right[n-1]=a[n-1];
	for(int i=n-2;i>=0;i--) {
		right[i]=Math.max(right[i+1],a[i]);
	}
	
	int ans=0;
	
	for(int i=0;i<n;i++) {
		ans+=(Math.min(left[i], right[i])-a[i]);
	}
	return ans;
	
}



}
