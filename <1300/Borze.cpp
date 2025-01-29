#include<bits/stdc++.h>
using namespace std;

int main() {
    string s;
    cin>>s;
    string res = "";
    int p = 0;
    while (p < s.size()) {
        if (s[p] == '.') {
            res += "0";
            p++;
        } else if (s[p] == '-') {
            if (s[p+1] == '.') {
                res += "1";
                p += 2;
            } else if (s[p+1] == '-') {
                res += "2";
                p += 2;
            }
        }
    }
    cout<<res<<endl;
    return 0;
}