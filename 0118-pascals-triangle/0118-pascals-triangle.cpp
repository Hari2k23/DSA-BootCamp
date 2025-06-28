class Solution {
public:
    vector<vector<int>> generate(int numRows) {
        vector<vector<int>> result(numRows);
        for(int i=0;i<numRows;i++){
            result[i].resize(i+1);
            result[i][0] = 1;
            int res = 1;
            for(int j=1;j<i;j++){
                res = (res*(i-j+1))/j;
                result[i][j] = res;
            }
            result[i][i] = 1;
        }
        return result;
    }
};