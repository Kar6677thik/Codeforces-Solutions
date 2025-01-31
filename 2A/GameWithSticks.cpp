#include<bits/stdc++.h>
using namespace std;

int main() {
    int n, m;
    cin>>n>>m;
    int mini = min(n,m);
    if (mini % 2 == 1) cout<<"Akshat"<<endl;
    else cout<<"Malvika"<<endl;
    return 0;
}