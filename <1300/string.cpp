#include<bits/stdc++.h>
using namespace std;

int main() {
    int t;
    cin>>t;
    while (t-- > 0) {
        string s;
        cin>>s;
        int count = 0;
        for (int i = 0; i < s.size(); i++) {
            if (s[i] == '1') count++;
        }
        cout<<count<<endl;
    }
    return 0;
}