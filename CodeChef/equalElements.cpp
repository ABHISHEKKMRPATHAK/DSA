#include <iostream>
using namespace std;

int main() {
	int testcases;
	cin>>testcases;
	while(testcases--){
	    int arr[10];
	    int num;
	    int count = 0;
	    cin>>num;
	    for(int i =0 ;i<num;i++){
	        cin>>arr[i];
	    }
	    for(int j =0 ;j < num ;j++){
	        for(int k = 1;k<num;k++){
	            if(arr[k]!=arr[j]){
	            arr[k]=arr[j];
	            count++;
	            }
	            else
	            break;
	            
	        }
	    }
	    cout<<count<<endl;
	}
	return 0;
}
