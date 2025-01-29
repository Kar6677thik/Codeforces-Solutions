#include<iostream>
using namespace std;

int main() {
    int t;
    cin>>t;
    while (t>0) {
        int count;
        int n;
        string s = to_string(n);
        for (int i = 0; i < s.length(); i++) {
            if (n%10!=0) {
                count++;
            } else {
                
            }
            n /= 10;
        }
    }
    return 0;
}