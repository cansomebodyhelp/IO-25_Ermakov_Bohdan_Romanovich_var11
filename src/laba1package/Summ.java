package laba1package;

public class Summ {
    public char azmina;
    public char bzmina;
    public float nzmina, mzmina;

    public void viraz() {
        float result = 0;
        for (float i = azmina; i <= nzmina; i++) {
            for (float j = bzmina; j <= mzmina; j++) {
                if (j != 0 && i != 2) {
                    result += (i / j) / (i - 2);
                }
            }
        }
        System.out.print(result);
    }
}