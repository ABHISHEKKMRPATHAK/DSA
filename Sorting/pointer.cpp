#include<iostream>
using namespace std;
/*  void swap(int *x ,int *y ){
    int temp = *x ;
    *y = *x ;
    *y = temp ;
}
*/

int main(){
    int a = 10 , b =20 ;
    int *x , *y ;
    *x = a ;
    *y = b ;
    cout<<x<<endl;
    return 0 ;
}