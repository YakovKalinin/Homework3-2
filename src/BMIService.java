public class BMIService {
    public int calculate (int growth, int mass) {
        int index1 = growth * growth;
        int index = mass * 10000 / index1;
        return index;
    }

}
