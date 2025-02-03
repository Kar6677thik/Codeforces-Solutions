#include<bits/stdc++.h>
using namespace std;

int main() {
    int s, n;
    cin>>s>>n;
    vector<pair<int, int>> levels;
    while (n-- > 0) {
        int a, b;
        cin>>a>>b;
        levels.push_back({a, b});
    }
    sort(levels.begin(), levels.end());
    bool res = true;
    for (auto it: levels) {
        if (s > it.first) s += it.second;
        else {
            res = false;
            break;
        }
    }
    if (res == true) cout<<"YES"<<endl;
    else cout<<"NO"<<endl;
    return 0;
}