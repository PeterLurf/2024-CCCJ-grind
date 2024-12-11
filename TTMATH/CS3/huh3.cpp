#include <climits>
#include <iostream>
#include <vector>
#include <cmath>
#include <cstring>
#include <algorithm>
#include <cstdio>


using namespace std;

int main() {
    int n;
    cin >> n;
    vector<int> arr;
    //set all to 0
    memset(arr,0,sizeof(arr));
    
    vector<int> prefix;
    prefix.push_back(arr[0]);
    for (int i = 1; i < n; i++){
        prefix.push_back(prefix[i-1]+arr[i]);
    }
    int a = 0;//number of odd terms
    int b = 0;//number of even terms
    for (int i = 0; i < n; i++){
        if (prefix[i] % 2 == 0){
            b++;
        } else {
            a++;
        }
    }
    for (int i = prefix.size(); i>0;i--){
        for (int j = 0;j<prefix.size()-i+1;j++)
        {
            if ((prefix[j+i]-prefix[j])%2==0){
               //print all numbers between j and i
                for (int k = j; k < j+i;k++){
                     cout << arr[k] << " ";
                }
               
            }
        }
    }
}
