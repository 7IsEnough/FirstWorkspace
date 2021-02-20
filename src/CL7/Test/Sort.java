package CL7.Test;

import java.util.Arrays;

/**
 * @author Promise
 * @create 2019-09-25-10:46
 */
public class Sort {
    public static void main(String[] args) {
        int[] arr = {0,3,5,8,9,6,4,7,22,13};
//        insertSort(arr);
//        shellSort(arr);
//        selectSort(arr);
//        heapSort(arr);
//        BubbleSort(arr);
//        quickSort(arr,0,arr.length-1);
        divideArray(arr);

    }
    //直接插入排序
    public static void insertSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j >0; j--) {
                if(arr[j-1]<=arr[j]){
                    break;
                }else {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }


    //希尔排序
    public static void shellSort(int[] arr){
        int len = arr.length;
        int gap = 1;
        int temp;
        while (gap < len/3){
            gap = gap * 3 + 1;
        }
        for(;gap>0;gap=gap/3){
            for(int i=gap;i<len;i++){
                temp = arr[i];
                for(int j=i-gap;j>=0;j=j-gap){
                    if(arr[j]>temp){
                        arr[j+gap] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }


    //选择排序
    public static void selectSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int minIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[minIndex]>arr[j]){
                    minIndex = j;
                }
            }
            if(!(minIndex==i)){
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    //堆排序
    public static void heapSort(int[] arr){
        for (int i = arr.length; i > 0; i--) {
            bulidHeap(arr,i);

            int temp = arr[0];
            arr[0] = arr[i-1];
            arr[i-1] = temp;
        }
        System.out.println(Arrays.toString(arr));



    }
    public static void bulidHeap(int[] arr,int limit){
        int parentIndex = limit/2;
        for (int i = parentIndex; i >=0; i--) {
            if(i*2>=limit){
                continue;
            }

            int left = i*2;
            int right = (left+1)>=limit ? left:(left+1);
            int maxChild = arr[left]>=arr[right] ? left:right;
            if(arr[maxChild] > arr[i]){
                int temp = arr[maxChild];
                arr[maxChild] = arr[i];
                arr[i] = temp;
            }
        }
    }


    //冒泡排序
    public static void BubbleSort(int[] arr){
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int i1 = 0; i1 < i; i1++) {
                if(arr[i1]>arr[i1+1]){
                    int temp = arr[i1];
                    arr[i1] = arr[i1+1];
                    arr[i1+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    //快速排序
    public static void quickSort(int[] arr,int low,int high){
        if(arr.length<=0) return;
        if(low >= high) {
            System.out.println(Arrays.toString(arr));
            return;
        }
        int temp = arr[low];
        int left = low;
        int right = high;
        while (left < right){
            while (left < right && arr[right]>=temp){
                right--;
            }
            arr[left] = arr[right];
            while (left < right && arr[left]<temp){
                left++;
            }
            arr[right] = arr[left];
        }
        arr[left] = temp;

        quickSort(arr,low,left-1);
        quickSort(arr,left+1,high);
    }

    //归并排序
    public static int[] divideArray(int[] arr){
        if(arr.length<=1)
            return arr;
        int num = arr.length/2;
        int i = 0;
        int k = 0;
        int[] arr1 = new int[num];
        int[] arr2 = new int[arr.length-num];
        while (i<num){
            arr1[i] = arr[i];
            i++;
        }
        while (i<arr.length){
            arr2[k] = arr[i];
            i++;
            k++;
        }
       return mergeSort(divideArray(arr1),divideArray(arr2));

    }
    public static int[] mergeSort(int[] arr1,int [] arr2){
        int i=0,j=0,k=0;
        int[] result = new int[arr1.length+arr2.length];
        while (i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                result[k] = arr1[i];
                k++;
                i++;
            }else {
                result[k] = arr2[j];
                k++;
                j++;
            }
        }
        while (i<arr1.length){
            result[k] = arr1[i];
            k++;
            i++;
        }
        while (j<arr2.length){
            result[k] = arr2[j];
            k++;
            j++;
        }
        System.out.println(Arrays.toString(result));
        return result;
    }



}
