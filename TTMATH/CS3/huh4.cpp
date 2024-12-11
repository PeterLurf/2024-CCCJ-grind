#include <iostream>
#include <vector>
#include <util.h>


using namespace std;

pair<int, int>mypair;

//custom compairtor pass in array and array of pointers
bool compare(int *a, int *b){
    return *a < *b;
}

int main(){

    
    int *pter[7];
    int arr[] = {1,2,6,4,2,6,3};
    int arrLength = sizeof(arr) / sizeof(arr[0]);
    for (int i =0; i< arrLength; i++) {
        pter[i] = &arr[i];
    }
    sort(pter, pter+arrLength, compare);
    pair<int, int> mypair;
    int medianIndex = arrLength/2;
    mypair = make_pair(medianIndex, *pter[medianIndex]);
    //print pair
    cout << mypair.first << " " << mypair.second;


}