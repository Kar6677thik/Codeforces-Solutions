#include<bits/stdc++.h>
using namespace std;

int main() {
    string s;
    getline(cin, s);
    set<char> st;
    if (s.size() == 2) cout<<"0"<<endl; 
    else {
        string temp = s.substr(1, s.size()-2);
        for (int i = 0; i < temp.size(); i++) {
            if (isalpha(temp[i])) st.insert(temp[i]);
        }
        cout<<st.size()<<endl;
    }
    return 0;
}