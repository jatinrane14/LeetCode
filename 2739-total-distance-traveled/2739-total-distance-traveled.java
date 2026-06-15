class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        if(mainTank<5){
            return mainTank*10;
        }
        int transfer = Math.min((mainTank-1)/4, additionalTank);
        return  (mainTank+transfer)*10;
    }
}