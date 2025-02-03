#include<bits/stdc++.h>
using namespace std;

int main() {
    int n, m;
    cin>>n>>m;
    int result = -1;
    for(int i = ceil((double) n/2); i <= n; i++) {
        if (i % m == 0) {
            result = i;
            break;
        }
    }
    cout<<result<<endl;
    return 0;
}