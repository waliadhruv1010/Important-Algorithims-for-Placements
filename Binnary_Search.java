class Binnary_Search{
    public static int BinnarySearch(int arr[],int k){
        int s=0;
        int e=arr.length-1;

        while(s<=e){
            int mid=s+e/2;

            if(arr[mid]==k){
                return 1;
            }
            else if(arr[mid]>k){
                s=mid-1;
            }else{
                e=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {40,11,66,1,8,22};
        int k=66;
        if(BinnarySearch(arr,k)  ==1){
           System.out.println("Found") ;
        }else{
            System.out.println("Not Found");
        }
        
    }
}