#include <climits>
#include <iostream>
#include <vector>
#include <cmath>
#include <cstring>
#include <algorithm>
#include <stack>
#include <string>  

using namespace std;

bool customCompare(pair<int,int> a, pair<int,int> b){
    return a.first < b.first;
}

int main(){
    int N,L,S;
    cin >> N >> L >> S;
    //dynamic array
    vector<pair<int, int> > arr;
    for (int i = 0 ; i<N;i++) {
        int a,b,s;
        cin >> a >> b >> s;
        //insert into arr
        arr.push_back(make_pair(a,s));
        arr.push_back(make_pair(b,-s));
    }
    //sort arr
    sort(arr.begin(),arr.end(),customCompare);
    int candies = 0;
    int currentSpookyness = 0;
    for (int i =0; i<arr.size(); i++){
        int currentHouse = arr[i].first;
        int spooknessModifier = arr[i].second;

        if (spooknessModifier < S) {
            candies++;
        }
    }
}
    
  


