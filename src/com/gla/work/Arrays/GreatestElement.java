package com.gla.work.Arrays;

 class GreatestElement {
     public static void main(String[] args) {
         int arr[] = {5,-6,2,7,-9,1,10};

            int max = arr[0];

            for(int i=0;i<arr.length;i++){
                if(arr[i]>max){
                    max = arr[i];
                }
            }
            System.out.println("Maximum element is: "+ max);
        }
    }


