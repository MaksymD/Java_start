package lesson3;

public class VolumeMethod {
    public static void main(String[] args) {
        System.out.println(getVolume(4, 5, 7));
    }
    public static int getVolume(int length, int width, int height) {
        int volume = length * width * height;
        return volume;
    }
}
