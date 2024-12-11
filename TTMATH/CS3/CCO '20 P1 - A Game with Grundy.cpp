#include <climits>
#include <cstdlib>
#include <iostream>
#include <limits>
#include <utility>
#include <vector>
#include <cmath>
#include <cstring>
#include <algorithm>
//CCO

using namespace std;
pair<int,int> intersecton (int x,int v,int h,int y){
    int left = (-y*h/v)+x;
    int right = (y*h/v)+x;
    return make_pair(left,right);
}

int main(){
    int N;
    cin >> N;
    int L,R,Y;
    cin >> L >> R >> Y;

    vector< pair <int,int> > compressedDiffernceArray;

    for (int i =0;i<N;i++){
        int x,v,h;
        cin >> x >> v >> h;
        pair<int,int> intersectionsAtY = intersecton(x,v,h,Y);

        //if pair first and second are really close to integers round them to that
        if (abs(intersectionsAtY.first - round(intersectionsAtY.first)) < 0.0001){
            intersectionsAtY.first = round(intersectionsAtY.first);
        }
        if (abs(intersectionsAtY.second - round(intersectionsAtY.second)) < 0.0001){
            intersectionsAtY.second = round(intersectionsAtY.second);
        }

        //else round up
        if (intersectionsAtY.first < round(intersectionsAtY.first)){
            intersectionsAtY.first = ceil(intersectionsAtY.first);
        }
        if (intersectionsAtY.second > round(intersectionsAtY.second)){
            intersectionsAtY.second = floor(intersectionsAtY.second);
        }

        compressedDiffernceArray.push_back(make_pair(intersectionsAtY.first,1));
        compressedDiffernceArray.push_back(make_pair(intersectionsAtY.second + 1,-1));
    }




}