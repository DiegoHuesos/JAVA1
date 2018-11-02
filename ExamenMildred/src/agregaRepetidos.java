import java.util.ArrayList;

public class agregaRepetidos {
	
	public static int agregaRepetidos(int[] arr, int ocupArr, ArrayList<Integer> list){
		
		for(int i=0; i<ocupArr; i++){
			for(int e=0; e<list.size(); e++){
				if(arr[i]==list.get(e))
					for(int a=ocupArr; a>i; a--){
						arr[a]=arr[a-1];
						ocupArr+=1;
					}
						
			}
				
		}
		return ocupArr;
	}

	//Ejecutable
	public static void main (String[] args){
		int[]arr= new int[8];
		arr[0]=20;
		arr[1]=24;
		arr[2]=26;
		arr[3]=31;
		arr[4]=44;
		
		ArrayList <Integer> list= new ArrayList <Integer>();
		list.add(24);
		list.add(31);
		list.add(44);
		
		System.out.println(agregaRepetidos.agregaRepetidos(arr, 5, list));
	}
}
