
public class Probability implements ProbabilityCalc
{    
    private int favorable;
    private int sampleSpace;
    private double prob;
    public Probability(int fav, int samp){
        this.favorable=fav;
        this.sampleSpace=samp;
        prob = ((double)favorable)/sampleSpace;
    }
    /**
     * This uses the current Probability object (this) and a second Probability object
     * to calculate P(p1 AND p2) = p1 * p2
     */
    double probabilityAND(Probability p2){
        return 0;
    }
    
    /**
     * This uses the current Probability object (this) and a second Probability object
     * to calculate P(p1 OR p2) = p1 + p2 - (p1 AND p2)  where p1 AND p2 is the "overlap"
     */
    double probabilityOR(Probability p2, double overlap){
        return 0;
    }
}