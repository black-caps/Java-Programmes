import java.util.Scanner;
public class rotation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int array[]=new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Enter How may times you want to rotate");
        int nr=sc.nextInt();
        System.out.println("Enter 1.>Left Rotation\n2.>Right Rotation");
        int choice=sc.nextInt();
        if(choice==1){
            for(int i=0;i<nr;i++)
            {
                int temp,j=0;
                    // Used j variable to remove the 2nd for loop
                    for(int k=j+1;k<=n-1;k++,j++){
                        temp=array[j];
                        array[j]=array[k];
                        array[k]=temp;

                    }

            }
            for(int i=0,j=0;i<n;i++){
                System.out.println(array[i]);
            }
        }
        else if(choice==2){
            for(int i=0;i<nr;i++){
                // used to remove the second for loop
                int temp,j=n-1;
                for(int k=n-2;k>=0;k--,j--){
                    temp=array[j];
                    array[j]=array[k];
                    array[k]=temp;
                }
            }
            for(int i=0;i<n;i++){
                System.out.println(array[i]);
            }


        }
    }
}
