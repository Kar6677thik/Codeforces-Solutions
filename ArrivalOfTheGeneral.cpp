#include<bits/stdc++.h>
using namespace std;

int main() {
    int n;
    cin >> n;
    vector<int> line;
    for (int i = 0; i < n; i++) {
        int t;
        cin >> t;
        line.push_back(t);
    }
    int small = 0, large = 0, maxi = INT_MIN, mini = INT_MAX;
    for (int i = 0; i < n; i++) {
        if (line[i] < mini) {
            mini = line[i];
            small = i;
        }
        if (line[i] > maxi) {
            maxi = line[i];
            large = i;
        }
    }
    // cout << small << " "<< large << endl;
    int res = large + ((n-1) - small);
    if (large > small) {
        cout << res - 1;
    } else {
        cout << res;
    }
    return 0;
}