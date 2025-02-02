#include<bits/stdc++.h>
using namespace std;

int main() {
    int n;
    cin>>n;
    int a, b;
    int num;
    cin>>a;
    set<int> st;
    while (a-- > 0) {
        cin>>num;
        st.insert(num);
    }
    cin>>b;
    while(b-- > 0) {
        cin>>num;
        st.insert(num);
    }
    string check = st.size() == n ? "I become the guy." : "Oh, my keyboard!";
    cout<<check<<endl;
    return 0;
}