#include <iostream>
#include <vector>
using namespace std;
int main(){
    //memset
    vector<int> schoob;
    //when doing mods use const
   
    //pointers 
    int var = 25;
    int* foo;
    int **doo;
    foo = &var;
    doo = **foo;
    

    //pointers
    int baz;
    baz = *foo;
    cout << baz;
    



    return 0;
}

