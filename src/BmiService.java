public class BmiService {
    public float calculate(float weight, float height) {
        float height2 = height * height;
        float bmi = weight / height2;
        return bmi;
    }
}