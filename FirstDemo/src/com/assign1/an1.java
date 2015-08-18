package com.assign1;

public class an1 {

	public static int large(int arr[]){  

        int lar=arr[0];  

        for(int i=0;i<arr.length;i++){  

            if(lar<arr[i])  

                lar=arr[i];  

        }  

        return lar;  

 } 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
