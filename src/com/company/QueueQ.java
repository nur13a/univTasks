package com.company;

public class QueueQ {
    private int[] queue;
    private int maxSize; // максимальное количество элементов в очереди
    private int nElem;  // текущее количество элементов в очереди
    private int front; // следующий элемент
    private int previous; // предыдущий элемент

    public QueueQ(int maxSize) {
        this.maxSize = maxSize;
        queue = new int[maxSize];
        previous = -1;
        front = 0;
        nElem = 0;
    }
//добавляет в очередь число, при этом увеличивая размер очереди
    public void insert(int elem) {
        if (previous == maxSize - 1) {
            previous = -1;
        }

        queue[++previous] = elem;
        nElem++;
    }
//удаляет первое число , при этом уменьшая размер очереди
    public int remove() {
        int temp = queue[front++];

        if (front == maxSize) {
            front = 0;
        }
        nElem--;
        return temp;

    }
//получить первого в очереди
    public int getFront() {
        return queue[front];
    }
//получить последнего в очереди
    public int getPrevious() {
        return queue[previous];
    }
//Проверка. Не заполнена ли
    public boolean isFull() {
        return (nElem == maxSize - 1);
    }

    public boolean isEmpty() {
        return (nElem == 0);
    }
// Получить количество элементов в очереди
    public int getSize() {
        return nElem;
    }
}
