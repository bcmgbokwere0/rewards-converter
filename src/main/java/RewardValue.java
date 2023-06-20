public class RewardValue {
        // Miles to Cash Conversion
        final double MTC = 0.0035;
        private double rewardCashValue;

        public RewardValue(double cash) {
            rewardCashValue = cash;
        }
        public RewardValue(int miles) {
            rewardCashValue = miles * MTC;
        }

        public double getCashValue(){

                return rewardCashValue;
        }

        public int getMilesValue(){

                return (int)(rewardCashValue / MTC);
        }

}

