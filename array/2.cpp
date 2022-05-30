/* finding minimum and maximum in array */

#include<iostream>
using namespace std;
int arrayInitialization(int x , int array[20]){
    int i=0;
    for(int i =0 ; i<x ; i++){
        cin>>array[i];
    }   
    return array[20];     
}
void displayArray(int n,int arr[20]){
    for(int i =0 ; i < n ;i++){
        cout<<arr[i]<<" ";
    }
}
void max(int n , int arr[20]){
int maxEl = arr[0];
for(int i = 1 ; i < n ; i++){
    if (maxEl < arr[i])
            maxEl = arr[i];
}
cout << endl << "MAXIMUM ELEMENT HERE IS  " << maxEl << endl;
}
void min(int n , int arr[20] ){
int minEL = arr[0];
for(int i = 1; i<n ; i++){
if(minEL > arr[i])
minEL = arr[i];
}
cout<<endl<<"MINIMUM ELEMENT HERE IS  " << minEL << endl;
}

int main(){
    int n , arr[20]; 
    cout << "Enter number of elements in array";
    cin >> n;
    arrayInitialization(n,arr);
    displayArray(n,arr);
    max(n , arr);
    min(n , arr);
    return 0;
}