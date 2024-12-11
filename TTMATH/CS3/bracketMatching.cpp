#include <climits>
#include <iostream>
#include <vector>
#include <cmath>
#include <cstring>
#include <algorithm>
#include <stack>
#include <string>  // Moved include to the top

using namespace std;

int main() {
    for(int i = 0; i < 5; i++) {
        string a = "";
        cin >> a;
        
        vector<char> stack;
        bool balanced = true;
        for(int j = 0; j < a.size(); j++) {
            if(a[j] == '(' || a[j] == '[' || a[j] == '{') {
                stack.push_back(a[j]);
            } else if(a[j] == ')' || a[j] == ']' || a[j] == '}') {
                if (stack.empty()) {  // Check if stack is empty
                    balanced = false;
                    break;
                }
                if(a[j] == ')' && stack.back() == '(') {
                    stack.pop_back();
                } else if(a[j] == ']' && stack.back() == '[') {
                    stack.pop_back();
                } else if(a[j] == '}' && stack.back() == '{') {
                    stack.pop_back();
                } else {
                    balanced = false;
                    break;
                }
            }
        }

        if(!stack.empty()) {
            balanced = false;
        }
        if (balanced){
            cout << "balanced" << endl;
        } else {
            cout << "not balanced" << endl;
        }
    }
    return 0;
}
