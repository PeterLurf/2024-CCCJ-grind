#include <climits>
#include <iostream>
#include <unordered_map>
#include <vector>
#include <cmath>
#include <cstring>
#include <algorithm>

using namespace std;
int N,A,B;
long long Mincost;
int cost(int i, int j) {
    return A*i + B*j;
}
int main() {
    N = 5;
    A = 5;
    B = 7;
    int floor = 1;
    int room = 1;
    for (int i =0; i<N;i++){
        int thisFloor;
        thisFloor = cost(floor,room);
        int nextFloor;
        nextFloor = cost(floor+1,room);

        if (thisFloor < nextFloor){
            Mincost += thisFloor;
            floor++;
            room = 2;
        } else {
            Mincost += nextFloor;
            room++;
        }
    }
    cout << Mincost;
}

