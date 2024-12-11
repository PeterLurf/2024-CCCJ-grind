#include <climits>
#include <iostream>
#include <vector>
#include <cmath>
#include <cstring>
#include <algorithm>

using namespace std;



bool f(int x){
    if(x>12) {
        return 10;
    }
    else if(x<13) {
        return 20;
    }
    else {
        return 30;
        }
}

int BinarySearchOnMonotonicFunction(int target){
    int l = 0, r = INT_MAX;
    while(l < r){
        int mid = l + (r - l) / 2;
        if(f(mid) < target){
            l = mid + 1;
        }else{
            r = mid;
        }
    }
    return l;
}

int main() {
    int target = 20;
    cout << BinarySearchOnMonotonicFunction(target) << endl;

}