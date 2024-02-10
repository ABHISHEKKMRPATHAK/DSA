#include<iostream>
using namespace std;

  void sum1(int a)
  {
    int sum =0;
         for(int i = 1 ; i<=a ; i++)
        {
              sum = sum+i;
        }
            cout<<"sum is :"<<sum;
   }

   void sum2 (int a)
   {
       int sum = (a * (a+1))/2;
       cout<<"sum is :"<<sum;
   }

    void sum3 (int a)
   {
       int sum=0;
       for(int i =1 ;i<=a;i++)
       {
           for(int j=1;j<=i;j++)
           {
            sum++;
           }
        }   
      cout<<"sum is : "<<sum;       
   }


int main(){
    int n,sum ;
    cout<< "enter value of n : ";
    cin >> n;
    sum3(n);
}