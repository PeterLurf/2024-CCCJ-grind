#include <climits>
#include <iostream>
#include <vector>
#include <cmath>
#include <cstring>
#include <algorithm>

using namespace std;


int main() {
    int n;
    int h;
    cin >> n; //length of cave
    cin >> h; //max height of cave
    vector<int> upRocks;
    vector<int> downRocks;


    for (int i = 0; i < n; i++){
        int temp;
        cin >> temp;
        if (i % 2 ==0){
            upRocks.push_back(temp);
        } else {
            downRocks.push_back(temp);
        }
    }
    
    //sort the up and down rocks

    sort(upRocks.begin(), upRocks.end());
    sort(downRocks.begin(), downRocks.end());
    //use binary search to 

    //find minimum in obs
    int min = INT_MAX;
    for (int i = 0; i < h; i++){
        if (obs[i] < min){
            min = obs[i];
        }
    }
    int num = 0;
    //use binary search to see how many heights have the same colisions as min
    for (int)

    cout << min << " " << num;
}