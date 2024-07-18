//WAP to take two Array input from user and sort them in ascending or
//descending order as per user’s choice
#include<stdio>
 void swap(int *x,int *y){
     int temp=*x;
     *x=*y;
     *y=temp;
 }
 void sortarray(int arr[],int n,int order){
     for(int i=0;i<n-1;i++){
          for(int j=0;j<n-i-1;j++){
               if(order==1){
                    if(arr[j]>arr[j+1]);
                    swap(&arr[j],&arr[j+1]);
               }
               else
               {
                    if(arr[j]<arr[j+1]){
                         swap(&arr[j],&arr[j+1]);
                    }
               }
               }
     }
}
           int  main(){
               int n order;
               printf("enter the size of the arrays");
               scanf("%d",&n);
           }
            printf("enter element of the second array:");
           for(int j=0;j<n;j++){
               scanf("%d",&arr1[i];)
           }
           printf("enter element of the second array:");
           for(int i=0;i<n;i++){
               scanf("%d",&arr2[i];)
           }
           printf("Enter the order for sorting (1 for ascending, 2 for descending): ");
    scanf("%d", &order);

    printf("Sorting the first array...\n");
    sortArray(arr1, n, order);
    printf("Sorted first array: ");
    for (int i = 0; i < n; i++) {
        printf("%d ", arr1[i]);
    }

    printf("\nSorting the second array...\n");
    sortArray(arr2, n, order);
    printf("Sorted second array: ");
    for (int i = 0; i < n; i++) {
        printf("%d ", arr2[i]);
    }

    return 0;
}
                   

     