#include<bits/stdc++.h>
using namespace std;

int main() {
    int a, b, c;
    cin>>a>>b>>c;
    int c1 = a*b*c, c2 = (a+b)*c, c3 = a+(b*c), c4 = a+b+c, c5 = (a*b)+c, c6 = a*(b+c);
    int maxi = max(c1, max(c2, max(c3, max(c4, max(c5, c6)))));
    cout<<maxi<<endl;
    return 0;
}