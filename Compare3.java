
/**
 * Write a description of class Compare3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Compare3
{
    public static Comparable largest(Comparable c1, Comparable c2){
        if(c1.compareTo(c2) >0){
            return c1;
        }
        else{
            return c2;
            }
    }
}
