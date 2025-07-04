class Solution {
    public int numberOfSteps(int num) {
        int steps = countSteps(num, 0);
        return steps;
    }

    int countSteps(int num, int steps){
        if(num == 0) return steps;

        if(num % 2 == 0) return countSteps(num / 2, steps + 1);
        return countSteps(num - 1, steps + 1);
    }
}