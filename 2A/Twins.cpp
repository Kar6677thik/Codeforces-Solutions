using ll = long long;

#include <bits/stdc++.h>
using namespace std;

int main() {
    int n;
    cin >> n;
    
    vector<ll> arr; 
    ll m, sum = 0; 
    
    for (int i = 0; i < n; i++) {
        cin >> m;
        arr.push_back(m);
        sum += m;
    }

    sort(arr.rbegin(), arr.rend()); 
    ll mySum = 0, cnt = 0;

    for (int i = 0; i < n; i++) {
        mySum += arr[i];
        cnt++;
        if (mySum > sum / 2) {
            break;
        }
    }

    cout << cnt << endl;
    return 0;
}
