package aco11_1.week05.ds;

public interface IQueue<E> extends Iterable<E> {

    void enqueue(E obj);

    E dequeue();

}