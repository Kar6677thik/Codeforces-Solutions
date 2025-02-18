using ll = long long;

#include<bits/stdc++.h>
using namespace std;

int main() {
    int t;
    cin>>t;
    while(t-- > 0) {
        ll l, r;
        cin>>l>>r;
        if (l == 1 && r == 1) cout<<"1"<<endl;
        else cout<<r - l<<endl;       
    }
    return 0;
}