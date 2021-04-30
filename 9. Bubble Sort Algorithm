class bubbleSort {  
    static void bubbleSort(int[] arr) {  
        int n = arr.length;  
        int temp = 0;  
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(arr[j-1] > arr[j]){  
                                 //swap elements  
                                 temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp;  
                         }  
                          
                 }  
         }  
  
    }  
    public static void main(String[] args) {  
                int arr[] ={31,6,350,21,4,366,55};  
                 
                System.out.println("---Array Before Bubble Sort---");
                 
                for(int i=0; i < arr.length; i++){  
                        System.out.print(arr[i] + " ");  
                }  
                System.out.println();  
                  
                bubbleSort(arr);  //sorting array elements using bubble sort  
                 
                System.out.println("---Array After Bubble Sort---");

                for(int i=0; i < arr.length; i++){  
                        System.out.print(arr[i] + " ");  
                }  



                
   
        }  
}  


                //OUTPUT
                //---Array Before Bubble Sort---
                //31 6 350 21 4 366 55
                //---Array After Bubble Sort---
                //4 6 21 31 55 350 366
