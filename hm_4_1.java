import java.util.LinkedList;

public class hm_4_1 {
    private LinkedList elements = new LinkedList();

    public hm_4_1() {
    }

    public hm_4_1(LinkedList elements) {
        this.elements = elements;
    }

    public void enqueue(Object element) {
        elements.add(element);
    }

    public Object dequeue() {
        Object first = elements.getFirst();
        elements.removeFirst();
        return first;
    }

    public Object first() {
        return elements.getFirst();
    }

    public LinkedList getElements() {
        return elements;
    }

    public void setElements(LinkedList elements) {
        this.elements = elements;
    }

    public static void main(String[] args) {
      hm_4_1 queue = new hm_4_1();
        queue.enqueue(77);
        queue.enqueue(19);
        queue.enqueue(24);
        queue.enqueue(66);
        System.out.println(queue.getElements());
        queue.dequeue();
        queue.dequeue();
        System.out.println(queue.getElements());
        System.out.println(queue.first());
    }
}
