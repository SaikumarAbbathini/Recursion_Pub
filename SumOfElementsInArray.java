public class SumOfElementsInArray {
    
    static int sumOf(int []arr, int i){
        if(i==arr.length) return 0;

        return sumOf(arr,i+1)+arr[i];
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        System.out.println(sumOf(arr, 0));
    }

}
