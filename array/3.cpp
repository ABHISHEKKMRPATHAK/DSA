/* Find the "Kth" max and min element of an array */
#include<iostream>
using namespace std;
int arrayInitialiazation(int arr[20], int n){
    int i ;
    for(i = 0 ; i < n ; i++){
        cin>>arr[i];
    }
    return arr[20];
}
void arrayDisplay(int arr[20], int n){
    int i ;
    cout<<"ARRAY is ";
    for(i = 0 ; i < n ; i++){
        cout << arr[i] << "\t" ;
    }
}
int sortElement( int arr[20],int n){
    int i,j,key;;
 for (i = 1; i < n; i++)
    {
        key = arr[i];
        j = i - 1;

        while (j >= 0 && arr[j] > key)
        {
            arr[j + 1] = arr[j];
            j = j - 1;
        }
        arr[j + 1] = key;
    }
    return arr[20]; 
}
void kthEL(int option , int k , int n , int arr[20]){
    if(option ==1){
        cout<<arr[n-k];
    }
    else if(option ==2){
        cout<<arr[k-1];
    }
    else 
    cout<<"Sorry you entered a wrong choice"<<endl;
}
   

int main(){
    int array[20] , n  ,option ,k;
    cout<<"Give size of array : ";
    cin>>n;
    arrayInitialiazation(array,n);
    arrayDisplay(array,n);
    cout<< endl <<"Choose one from the below :"<<endl<<"1. MAX \t 2. MIN"<<endl;
    cin>>option;
    cout<<"Give the value of k : ";
    cin>>k;
    sortElement(array,n);
    kthEL(option,k,n,array);
    return 0;
}
