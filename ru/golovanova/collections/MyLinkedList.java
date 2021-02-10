package ru.golovanova.collections;
import java.util.Iterator;

public class MyLinkedList<E> implements ILinkedList<E>{

    private Node<E> rootNode;
    private Node<E> lastNode;
    private int sizeNode;

    public MyLinkedList() {
        rootNode = null;
        lastNode = null;
        sizeNode = 0;
    }

    public void add(E element) {
        if (sizeNode != 0) {
            lastNode.setNextNode(new Node<>(element));
            lastNode = lastNode.getNextNode();
        } else {
            rootNode = lastNode = new Node<>(element);
        }
        sizeNode++;
    }

    public void add(int index, E element) {
        if (index == sizeNode)  {
            add(element);
            sizeNode++;
        } else if ((index == 0) &&(sizeNode > 0)) {
            rootNode = new Node<>(element, rootNode);
            sizeNode++;
        } else if ((index < sizeNode) && (index > 0)) {
            Node<E> cursor = rootNode;
            for (int i = 0; i < index - 1; i++){
                cursor = cursor.getNextNode();
            }
            cursor.setNextNode(new Node<>(element,cursor.getNextNode()));
            sizeNode++;
        }
    }

    public void clear() {
        Node<E> next;
        Node<E> sub = rootNode;
        if (this != null) {
            while (sizeNode!= -1) {
                next = sub.getNextNode();
                sub.setElement(null);
                sub.setNextNode(null);
                sub = next;
                sizeNode--;
            }
        }
    }

    public E get(int index) {
        if ((index < sizeNode) && (index > 0)) {
            if (index == sizeNode - 1) {
                return lastNode.getElement();
            } else {
                Node<E> sub = rootNode;
                for (int i = 0; i < index; i++) {
                    sub = sub.getNextNode();
                }
                return sub.getElement();
            }
        }
        throw new IndexOutOfBoundsException();
    }

    public int indexOf(E element) {
        if (element != null) {
            Node<E> sub = rootNode;
            int flag = 0;
            while (flag != sizeNode) {
                if (element.equals(sub.getElement())) {
                    return flag;
                } else {
                    sub = sub.getNextNode();
                    flag++;
                }
            }
            return -1;
        }
        return -2;
    }

   public E remove(int index) {
       if ((index < sizeNode) && (index > 0)) {
            if (index == 0) {
                E result = rootNode.getElement();
                rootNode = rootNode.getNextNode();
                sizeNode--;
                return result;
            }
            else {
                Node<E> sub = rootNode;
                int flag = 0;
                while ( flag != index - 1){
                    sub = sub.getNextNode();
                    flag++;
                }
                Node<E> help = sub.getNextNode();
                flag = 0;
                E result = help.getElement();
                sub.setNextNode(help.getNextNode());
                sizeNode--;
                return result;
            }
       }
       throw new IndexOutOfBoundsException();
   }

    public E set(int index, E element) {
        if ((index < sizeNode) && (index > 0)) {
            if ( index == sizeNode - 1){
                lastNode.setElement(element);
                return lastNode.getElement();
            }
            Node <E> result = rootNode;
            int flag = 0;
            while (flag != index){
                result = result.getNextNode();
                flag++;
            }
            result.setElement(element);
            return result.getElement();
        }
        throw new IndexOutOfBoundsException();
    }

    public int size() {
        return sizeNode;
    }

    public E[] toArray() {
        Object[] array =  new Object [sizeNode];
        Node<E> sub = rootNode;
        for (int i = 0; i < sizeNode; i++) {
            array [i]  = sub.getElement();
            sub = sub.getNextNode();
        }
        return (E[]) array;
    }

    public Iterator<E> iterator() {
        return new NodeIterator<>(rootNode);
    }

    public String toString() {
        StringBuilder MyLinkedListString = new StringBuilder("MyLinkedList ");
        Iterator<E> myIterator = new NodeIterator<E>(rootNode);
        MyLinkedListString.append("={");
        while (myIterator.hasNext() == true) {
            MyLinkedListString.append(",");
            MyLinkedListString.append(myIterator.next());
        }
        MyLinkedListString.append("}");
        return MyLinkedListString.toString();
    }
}
