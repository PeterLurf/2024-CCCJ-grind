#include <climits>
#include <iostream>
#include <vector>
#include <cmath>
#include <cstring>
#include <algorithm>
#include <stack>
#include <string>  // Moved include to the top
#include <deque>

using namespace std;
deque<pair<int,int> > maxMonoDeque;
deque<pair<int,int> > minMonoDeque;

void push(int val){
    int count = 0;
    while(!maxMonoDeque.empty() && maxMonoDeque.back().first < val){
        count += maxMonoDeque.back().second + 1;
        maxMonoDeque.pop_back();
    }
    maxMonoDeque.push_back({val, count});
}
void pop(){
    if(maxMonoDeque.front().second > 0){
        maxMonoDeque.front().second--;
    }else{
        maxMonoDeque.pop_front();
    }
}
int getMax(){
    return maxMonoDeque.front().first;
}

void pushMin(int val){
    int count = 0;
    while(!minMonoDeque.empty() && minMonoDeque.back().first > val){
        count += minMonoDeque.back().second + 1;
        minMonoDeque.pop_back();
    }
    minMonoDeque.push_back({val, count});
}
void popMin(){
    if(minMonoDeque.front().second > 0){
        minMonoDeque.front().second--;
    }else{
        minMonoDeque.pop_front();
    }
}
int getMin(){
    return minMonoDeque.front().first;
}

int main() { 
    //DMOPC '15 Contest 6 P5 - A Classic Problem

    int n;
    int k;
    cin >> n;
    cin >> k;
    vector<int> arr;
    for ( int i =0; i<n; i++){
        int a;
        cin >> a;
        arr.push_back(a);
    }
    //find
    return 0;


}