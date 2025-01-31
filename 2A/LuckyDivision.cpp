#include<bits/stdc++.h>
using namespace std;

bool isLuckyNum(int n) {
    while (n) {
        if (n % 10 != 4 && n % 10 != 7) return false;
        n /= 10;
    }
    return true;
}

int main() {
    int n;
    cin>>n;
    if (isLuckyNum(n)) cout<<"YES"<<endl;
    else {
        if (n % 4 == 0 || n % 7 == 0 || n % 47 == 0 || n % 74 == 0 || n % 477 == 0 || n % 444 == 0 || n % 474 == 0 || n % 447 == 0 || n % 44 == 0 || n % 77 == 0) cout<<"YES"<<endl;
        else cout<<"NO"<<endl;
    }
    return 0;
}