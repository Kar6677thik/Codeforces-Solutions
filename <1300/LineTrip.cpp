#include<bits/stdc++.h>
using namespace std;

int main() {
    int t;
    cin>>t;
    while (t-- > 0) {
        int n, x;
        cin>>n>>x;
        vector<int> gas(n);
        for (int i = 0; i < n; i++) {
            cin>>gas[i];
        }
        int maxi = INT_MIN;
        for (int i = 0; i < n; i++) {
            int diff = gas[(i+1) % n] - gas[i % n];
            maxi = max(diff, maxi);
        }
        int result = max(gas[0], max(maxi, (x - gas[n-1])*2));
        cout<<result<<endl;
    }
    return 0;
}