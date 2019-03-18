package com.Stack;

/**
 * @author action.zhou
 * @version v1.0
 * @date Created in 2019/3/18
 * @description
 */
public interface Stack<E> {

    int getSize();

    boolean isEmpty();

    void push(E e);

    E pop();

    E peek();
}
