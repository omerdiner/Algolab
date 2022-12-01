package String_2;

public class CatDog {
    public boolean catDog(String str) {
        int cats = 0;
        int dogs = 0;
        int i = 0;
        while (i < str.length() - 2) {
            if (str.substring(i, i + 3).equals("cat")) {
                cats++;
                i++;
            } else if (str.substring(i, i + 3).equals("dog")) {
                dogs++;
                i++;
            }
            i++;

        }

        return cats == dogs;
    }
}
