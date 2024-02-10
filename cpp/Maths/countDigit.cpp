#include<iostream>
using namespace std;

 int main()
 {
    int num;
    int count = 0;
    cout<<"Enter a number :"<<endl;
    cin>>num;
while(num!=0){
    num = num/10;
    ++count;
}
cout<<count;
return 0;
 }
