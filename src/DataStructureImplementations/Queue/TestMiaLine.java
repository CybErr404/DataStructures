package DataStructureImplementations.Queue;

public class TestMiaLine {
    public static void main(String[] args) {
        MiaLine line = new MiaLine();
        line.add(3);
        line.add(2);
        line.add(1);
        line.add(0);
        System.out.println("Queue after adding 4 elements:\n" + line);
        System.out.println("Polling the first element:\n" + line.poll());
        line.remove();
        System.out.println("Queue after removing the element at the front of the line:\n" + line);
//        line.offer(10);
    }
}
