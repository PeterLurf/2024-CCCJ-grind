#include <climits>
#include <iostream>
#include <vector>
#include <cmath>
#include <cstring>
#include <algorithm>
#include <stack>
#include <string>  

using namespace std;
int main(){
    int q;
    cin >> q;
    for (int i = 0; i<q;i++) {
        int n,m; // range [n,m]
        cin >> n >> m;
        //digits of n
        int n_digits = 0;
        int temp = n;
        while (temp != 0) {
            temp /= 10;
            n_digits++;
            }
        //digits of m
        int m_digits = 0;
        temp = m;
        while (temp != 0) {
            temp /= 10;
            m_digits++;
            }

        
        int arrn[n_digits];
        int arrm[n_digits];
        for (int j = 0; j<n_digits;j++){
            arrn[j] = n%10;
            n = n/10;
        }
        for (int j = 0; j<n_digits-m_digits;j++){
            arrm[j] = 0;
            }
        for (int j = n_digits-m_digits; j<n_digits;j++){
            arrm[j] = m%10;
            m = m/10;
            }

        //print array
        for (int j = 0; j<n_digits;j++){
            cout << arrn[j];
            }
        cout << endl;
        for (int j = 0; j<n_digits;j++){
            cout << arrm[j];
            }


    }
    
}