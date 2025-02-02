#include<bits/stdc++.h>
using namespace std;

int main() {
    int n, m;
    cin>>n>>m;
    vector<int> temp;
    for (int i = 0; i < m; i++) {
        int a;
        cin>>a;
        temp.push_back(a);
    }
    sort(temp.begin(), temp.end());
    int mini = INT_MAX;
    for (int i = 0; i <= m-n; i++) {
        mini = min(mini, temp[n+i-1] - temp[i]);
    }
    cout<<mini<<endl;
    return 0;
}