public class PrefixSum {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int preffix[] = new int[arr.length];

        preffix[0]=arr[0];

        for(int i=1;i<arr.length;i++){
            preffix[i]=preffix[i-1]+arr[i];
        }

        for(int i=0;i<5;i++){
            System.out.print(preffix[i]+" ");
        }
    }
}
