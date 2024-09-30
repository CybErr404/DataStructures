package MiaContainerArrayListImplementation;

import java.util.Arrays;

public class TestMiaContainer {
    public static void main(String[] args) {
        MiaContainer miaContainer = new MiaContainer();
        for(int i = 0; i < 20; i++) {
            miaContainer.addData(String.valueOf(i));
        }
        System.out.println("");
    }
}
