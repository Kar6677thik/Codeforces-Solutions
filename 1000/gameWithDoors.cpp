#include<bits/stdc++.h>
using namespace std;

int main() {
    int t;
    cin>>t;
    while (t-- > 0) {
        int l, r, L, R, ans = 0;
        cin>>l>>r>>L>>R;
        if (L>r) {
            if ((l == L || r == R) && L - r != 1) ans += L-r;
        } else if (L == r) return 1;
        else {
            if ((l == L || r == R)) ans++;
            ans += r-L;
        }
        cout<<ans<< " ";
    }
    return 0;
}