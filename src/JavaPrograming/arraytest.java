package JavaPrograming;

import java.util.ArrayList;

public class arraytest {

	public static void main(String[] args) {
		int[] x={3,11,23,56,2,7};
		int[] y={5,7,44,23,56};
		ArrayList<Integer> matching=new ArrayList<Integer>();
		ArrayList<Integer> non_matching=new ArrayList<Integer>();
		
		for(int i=0;i<x.length;i++){
			for(int j=0;j<y.length;j++){
				if(x[i]==y[j]){
					matching.add(x[i]);
				
				}
			}
		}
		System.out.println(matching);
		
		for(int s=0;s<x.length;s++){
			if(x[s] !=matching.get(0) && x[s] !=matching.get(1) && x[s] !=matching.get(2)){
				non_matching.add(x[s]);
			}
		}
		for(int t=0;t<y.length;t++){
			if(y[t] !=matching.get(0) && y[t] !=matching.get(1) && y[t] !=matching.get(2)){
				non_matching.add(y[t]);
			}
		}
		System.out.println(non_matching);
	}

}
