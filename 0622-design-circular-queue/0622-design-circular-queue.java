class MyCircularQueue {

    int[] a;
    int front;
    int rear;
    int len;

    public MyCircularQueue(int k) {
        a = new int[k];
        front = 0;
        rear = -1;
        len = 0;
    }

    public boolean enQueue(int value) {

        if (isFull())
            return false;

        rear = (rear + 1) % a.length;
        a[rear] = value;
        len++;

        return true;
    }

    public boolean deQueue() {

        if (isEmpty())
            return false;

        front = (front + 1) % a.length;
        len--;

        return true;
    }

    public int Front() {

        if (isEmpty())
            return -1;

        return a[front];
    }

    public int Rear() {

        if (isEmpty())
            return -1;

        return a[rear];
    }

    public boolean isEmpty() {
        return len == 0;
    }

    public boolean isFull() {
        return len == a.length;
    }
}