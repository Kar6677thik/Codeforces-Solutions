#include<bits/stdc++.h>
using namespace std;

int main() {
    int n, m, a, b;
    cin>>n>>m>>a>>b;
    int mTravel = (n/m)*b + min((n%m)*a, b);
    int singleTravel = n*a;
    cout<<min(mTravel, singleTravel)<<endl;
    return 0;
}