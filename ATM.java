public class ATM {
    public int countBanknotes(int sum) {

        int[] noteValues= {500,200,100,50,20,10,5,2,1};
        int value = 0;
        int result = 0;
        int i = 0;
        while (i < noteValues.length)
        {
           if(sum >= noteValues[i]) {
                value = sum / noteValues[i];
                //System.out.println("No of " + noteValues[i] + "'s" + " :" + value);
                sum = sum % noteValues[i];
                if (value >= 0) {
                    result += value;
                }
            }
           i++;
        }
        return result;
    }
}
