/* reverse the array */

#include<iostream>
using namespace std;

int arrayInitialization(int x , int array[20]){
    int i=0;
    for(int i =0 ; i<x ; i++){
        cin>>array[i];
    }   
    return array[20];     
}
void displayArray(int x , int array[20]){
    cout<<"Array-------------";
    for( int i = 0 ;i < x ;i++){
        cout <<array[i]<<"\t";
    }
}

void reversedArray(int x , int array[20]){
     cout << endl << "Reversed array --- ";
    for(int i = x-1; i >= 0 ; i--){
        cout <<array[i]<<"\t";
    }
}

int main(){
    int n , arr[20]; 
    cout << "Enter number of elements in array";
    cin >> n;
    arrayInitialization(n,arr);
    displayArray(n,arr);
    reversedArray(n,arr);

return 0;
}