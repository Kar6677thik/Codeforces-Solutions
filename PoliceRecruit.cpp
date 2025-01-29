#include <iostream>
using namespace std;
int main() {
    int t;
    cin >> t;
    int count = 0;
    int unt = 0;
    while (t > 0) {
        int n;
        cin >> n;
        if (n == -1 && count == 0) {
            unt = unt + 1;
        }
        else if (n == -1 && count > 0) {
            count = count - 1;
        }
        else if (n >= 1) {
            count = count + n;
        }
        t = t - 1;
    }
    cout << unt << endl;
    return 0;
}

