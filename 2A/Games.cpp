#include<bits/stdc++.h>
using namespace std;

int main() {
    int n;
    cin>>n;
    vector<pair<int, int>> arr;
    for (int i = 0; i < n; i++) {
        int h,g;
        cin>>h>>g;
        arr.push_back({h, g});
    }
    int cnt = 0;
    for (int i = 0; i < n; i++) {
        for (int j = i + 1; j < n; j++) {
            if (arr[i].first == arr[j].second) cnt++;
            if (arr[i].second == arr[j].first) cnt++;
        }
    }
    cout<<cnt<<endl;
    return 0;
}