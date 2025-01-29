#include <bits/stdc++.h>
using namespace std;

vector<int> noteFinder(const vector<vector<char>>& notes) {
    vector<int> positions;
    for (const auto& row : notes) {
        auto it = find(row.begin(), row.end(), '#');
        if (it != row.end()) {
            int index = distance(row.begin(), it);
            positions.push_back(index+1);
        }
    }
    return positions;
}

int main() {
    int t;
    cin >> t; // Read the number of test cases
    while (t-- > 0) {
        int rows;
        cin >> rows;
        vector<vector<char>> notes(rows, vector<char>(4));
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < 4; j++) {
                cin >> notes[i][j];
            }
        }

        vector<int> result = noteFinder(notes);
        reverse(result.begin(), result.end());
        for (int pos : result) {
            cout << pos << " "; // Output the positions
        }
        cout << endl;
    }
    return 0;
}
