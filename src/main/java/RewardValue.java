public class RewardValue {
        // Miles to Cash Conversion
        final double MTC = 0.0035;
        private double rewardCash;
        private int rewardMiles;

        public RewardValue(double cash) {
            rewardCash = cash;
        }
        public RewardValue(int miles) {
            rewardMiles = miles;
        }

        public double getCashValue(){

                return rewardCash;
        }

        public int getMilesValue(){

                return rewardMiles;
        }


}

