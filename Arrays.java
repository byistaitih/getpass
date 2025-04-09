public class NewClass {
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static int[] getArray(){
        int arr[]={1,2,3,4};
        return arr;
    }
     public static void main(String[] args) {
       int arr1[]={1,2,3};
       int arr2[]={40,50,60};
       arr1=arr2;
       arr2[0]=100;
         System.out.println(arr1);
     }
     
    }
