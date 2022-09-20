import java.util.Scanner;
class IntArr{
	int arr[]=new int[10];
	void input(){
		int i;
		Scanner in=new Scanner(System.in);
		System.out.print("Input 10 numbers:");
		for(i=0;i<10;i++)
			arr[i]=in.nextInt();
	}
	void display(){
		int i;
		for(i=0;i<10;i++)
			System.out.print(arr[i]+" ");
	}
	void largest(){
		int i,max=0;
		for(i=0;i<10;i++){
			if(arr[i]>max)
				max=arr[i];
		}
		System.out.println("Largest value: "+max);
	}
	void average(){
		int i,sum=0,avg=0;
		for(i=0;i<10;i++){
			sum=sum+ar[i];
		}
		avg=sum/10;
	}
	void sort(){
		int i,j,temp;
		for(i=0;i<10;i++){
			for(j=0;j<10-i-1;j++){
				if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
		}
		for(i=0;i<10;i++)
			System.out.print(arr[i]+" ");
	}
}