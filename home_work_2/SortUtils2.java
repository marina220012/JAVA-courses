package home_work_2;

public class SortUtils2 {
    public static void main(String[] args) {
        int[] container1 =new int[] {2,3,6,4,1,5};
        int[] container2 =new int[] {1,1,1,1};
        int[] container3 =new int[] {9,1,5,99,9,9};
        whatToDo(container1);
        whatToDo(container2);
        whatToDo(container3);
    }

    public static void whatToDo(int[] arr){
        System.out.println("\nВведенный массива");
        show(arr);
        arr =shakerSort(arr);
        System.out.println("\nОтсортированный массив");
        show(arr);
    }

    public static void show(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static int[] shakerSort(int[] arr){
        int left=0, right=arr.length-1;
        while(left<=right){
            for(int i=left; i<right;i++) {
                if (arr[i] > arr[i + 1]) {
                    int max;
                    max=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=max;
                }
            }
            right--;
            for(int i=right; i>left;i--) {
                if (arr[i-1] > arr[i]) {
                    int max;
                    max=arr[i];
                    arr[i]=arr[i-1];
                    arr[i-1]=max;
                }
            }
            left++;
        }
        return arr;
    }

}
