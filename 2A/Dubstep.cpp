#include<bits/stdc++.h>
using namespace std;

int main() {
    string s;
    cin>>s;
    int p = 0;
    string res = "";
    while (p < s.size()) {
        if ((p + 2) < s.size() && s.substr(p, 3) == "WUB") {
            if (!res.empty() && res[res.size() - 1] != ' ') res += " ";
            p += 3;
        } else {
            res += s[p];
            p++;
        }
    }
    cout<<res<<endl;
    return 0;
}