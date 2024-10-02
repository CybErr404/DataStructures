package MiaContainerArrayListImplementation;

public class TestMiaContainer {
    public static void main(String[] args) {
        MiaContainer miaContainer = new MiaContainer();
        for(int i = 1; i <= 20; i++) {
            miaContainer.addData(i);
        }

        //miaContainer.addAll(2);
        //miaContainer.replace(3, 300);
        //miaContainer.removeFirst();
        //miaContainer.remove(19);
        //miaContainer.addFirst(100);
        miaContainer.addData(1, 43904);
        System.out.println(miaContainer.checkSize());
        System.out.println(miaContainer);

    }
}
