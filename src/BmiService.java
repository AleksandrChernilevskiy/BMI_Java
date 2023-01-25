public class BmiService {
    public double calculate (double mansHeight, double mass) {
        //double mansHeight = 185;
        //double mass = 65;
        double mansHeightFormula = (double) Math.pow( (mansHeight / 100) , 2);
        double result;
        if ( mass > mansHeightFormula ){
            result = (double) (mass / mansHeightFormula);
        } else {
            result = 0;
        }
        return result;
    }
}
