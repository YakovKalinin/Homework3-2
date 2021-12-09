public class BMIService {
    public int calculate (int growth, int mass) {
        int growthindex = growth * growth;
        int index = mass * 10000 / growthindex;
        return index;
    }

}
