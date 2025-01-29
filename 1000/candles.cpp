#include<bits/stdc++.h>
using namespace std;

int numOfCandles(int a, int b) {
    int num = a;
    int burnt = 0;
    while (a >= b) {
        num += a/b;
        burnt= a/b + a%b;
        a = burnt;
    }
    return num;
}

int main() {
    int a, b;
    cin>>a>>b;   
    cout<<numOfCandles(a, b);
    return 0;
}