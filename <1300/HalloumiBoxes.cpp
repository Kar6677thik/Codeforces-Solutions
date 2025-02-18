#include <bits/stdc++.h>
using namespace std;

int main() {
    int t;
    cin >> t;
    while (t-- > 0) {
        int n, k;
        cin >> n >> k;
        vector<int> arr(n);

        for (int i = 0; i < n; i++) {
            cin >> arr[i];
        }

        if (k >= 2) {
            cout << "YES" << endl;
        } else {
            vector<int> temp = arr;
            sort(temp.begin(), temp.end());
            if (arr == temp) cout << "YES" << endl;
            else cout << "NO" << endl;
        }
    }
    return 0;
}
