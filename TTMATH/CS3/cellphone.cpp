#include <climits>
#include <cstdlib>
#include <iostream>
#include <vector>
#include <cmath>
#include <cstring>
#include <algorithm>

using namespace std;


pair<int, int> solveEquations(int d1, int d2, int d3, int d4, int n, int m) {
    int x1 = (d1 + d3 - (n - 1)) / 2;
    int y1 = d1 - x1;
    if (x1 >= 0 && x1 < n && y1 >= 0 && y1 < m &&
        abs(x1 - 0) + abs(y1 - 0) == d1 &&
        abs(x1 - 0) + abs(y1 - (m - 1)) == d2 &&
        abs(x1 - (n - 1)) + abs(y1 - 0) == d3 &&
        abs(x1 - (n - 1)) + abs(y1 - (m - 1)) == d4) {
        return pair<int, int>(x1, y1);
    }
    return pair<int, int>(-1, -1); // If no point is found
}

int main() {
    int n;
    int m;
    cin >> n; //length
    cin >> m; //height
    int d4;
    int d3;
    int d1;
    int d2;
    cout << "? " << 0 << " " << m-1<< flush;
    cin >> d4;
    cout << "? " << n-1 << " " << m-1 << flush;
    cin >> d3;
    cout << "? " << 0 << " " << 0 << flush;
    cin >> d1;
    cout << "? " << n-1 << " " << 0 << flush;
    cin >> d2;
    //find the 4 intercepts
    double x1 = (-m+1+d2-d1)/(-2);
    double y1 = -x1+d1;
    double x2 = (m+n-2+d3+m-1-d2)/2;
    double y2 = x2-m+1+d2;
    double x3 = (m+n-2-d3-m+1+d4)/2;
    double y3 = x3+m-2-d4;
    double x4 = (d1-m+1+d4)/2;
    double y4 = -x4+d1;

    //find middle of grind
    int xMid = (m+n)/2;
    int yMid = (m+n)/2;

    int dmid;
    cout << "? " << xMid << " " << yMid << flush;
    cin >> dmid;

    int cornerX;
    int cornerY;

    //loop through the points
    if (abs(int(x1) - xMid) + abs(int(y1) - yMid) == dmid) {
        cornerX = x1;
        cornerY = y1;
        
    } else if (abs(int(x2) - xMid) + abs(int(y2) - yMid) == dmid) {
        cornerX = x2;
        cornerY = y2;
    } else if (abs(int(x3) - xMid) + abs(int(y3) - yMid) == dmid) {
        cornerX = x3;
        cornerY = y3;
    } else if (abs(int(x4) - xMid) + abs(int(y4) - yMid) == dmid) {
        cornerX = x4;
        cornerY = y4;
    }

    //find the other point that has the furthest distance from cornerX and y
    int OppX;
    int OppY;
    int maxDist = 0;
    if(abs(int(x4) - cornerX) + abs(int(y4) - cornerY) > maxDist && 1<= x4 <= n && 1 <= y4 <=m){
        maxDist = abs(int(x4) - cornerX) + abs(int(y4) - cornerY);
        OppX = x4;
        OppY = y4;
    }
    if(abs(int(x3) - cornerX) + abs(int(y3) - cornerY) > maxDist && 1<= x3 <= n && 1 <= y3 <=m){
        maxDist = abs(int(x3) - cornerX) + abs(int(y3) - cornerY);
        OppX = x3;
        OppY = y3;
    }
    if(abs(int(x2) - cornerX) + abs(int(y2) - cornerY) > maxDist && 1<= x2 <= n && 1 <= y2 <=m){
        maxDist = abs(int(x2) - cornerX) + abs(int(y2) - cornerY);
        OppX = x2;
        OppY = y2;
    }
    if(abs(int(x1) - cornerX) + abs(int(y1) - cornerY) > maxDist && 1<= x1 <= n && 1 <= y1 <=m){
        maxDist = abs(int(x1) - cornerX) + abs(int(y1) - cornerY);
        OppX = x1;
        OppY = y1;
    }



    cout << cornerX << " " << cornerY << " " << OppX << " " << OppY << endl;




    
    






}