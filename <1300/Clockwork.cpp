#include <bits/stdc++.h>
using namespace std;
using ll = long long;

int main() {
    int t;
    cin >> t;
    while (t-- > 0) {
        ll n;
        cin >> n;
        ll m;
        bool flag = false; 
        for (ll i = 0; i < n; i++) {
            cin >> m;
            if (m <= max(i, n - i - 1)*2) { 
                flag = false; 
                break;
            }
        }
        if (flag)
            cout << "YES" << endl;
        else
            cout << "NO" << endl;
    }
    return 0;
}
