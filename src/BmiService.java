public class BmiService {
    public int calculate(float weight, float height) {
        int massIndex = (int)( weight / (height * 2));

        return massIndex;
    }
}
