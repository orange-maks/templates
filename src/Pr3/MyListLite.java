package Pr3;

import java.util.*;
import java.util.concurrent.Semaphore;

public class MyListLite<E> extends LinkedList<E> implements List<E> {
    private static final Semaphore semaphore = new Semaphore(1);
    @Override
    public int size() {
        return super.size();
    }

    @Override
    public boolean isEmpty() {
        return super.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        boolean c=false;
        try {
            semaphore.acquire();
            c= super.contains(o);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return c;
    }

    @Override
    public Iterator iterator() {
        Iterator iterator = null;
        try {
            semaphore.acquire();
            iterator=super.iterator();
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return iterator;
    }

    @Override
    public Object[] toArray() {
        Object[] objects = new Object[0];
        try {
            semaphore.acquire();
            objects=super.toArray();
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return objects;
    }

    @Override
    public boolean add(Object o) {
        boolean f = false;
        try {
            semaphore.acquire();
            f=super.add((E) o);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return f;
    }

    @Override
    public boolean remove(Object o) {
        boolean f = false;
        try {
            semaphore.acquire();
            f=super.remove(o);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return f;
    }

    @Override
    public boolean addAll(Collection collection) {
        boolean f = false;
        try {
            semaphore.acquire();
            f=super.addAll(collection);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return f;
    }

    @Override
    public boolean addAll(int i, Collection collection) {
        boolean f = false;
        try {
            semaphore.acquire();
            f=super.addAll(i,collection);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return f;
    }

    @Override
    public void clear() {
        try {
            semaphore.acquire();
            super.clear();
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public E get(int i) {
        E f = null;
        try {
            semaphore.acquire();
            f=super.get(i);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return f;
    }

    @Override
    public Object set(int i, Object o) {
        Object f = null;
        try {
            semaphore.acquire();
            f=super.set(i, (E) o);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return f;
    }

    @Override
    public void add(int i, Object o) {
        try {
            semaphore.acquire();
            super.add(i, (E) o);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public E remove(int i) {
        E f = null;
        try {
            semaphore.acquire();
            f=super.remove(i);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return f;
    }

    @Override
    public int indexOf(Object o) {
        int f = 0;
        try {
            semaphore.acquire();
            f=super.indexOf(o);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return f;
    }

    @Override
    public int lastIndexOf(Object o) {
        int f = 0;
        try {
            semaphore.acquire();
            f=super.lastIndexOf(o);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return f;
    }

    @Override
    public ListIterator listIterator() {
        ListIterator f = null;
        try {
            semaphore.acquire();
            f=super.listIterator();
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return f;
    }

    @Override
    public ListIterator listIterator(int i) {
        ListIterator f = null;
        try {
            semaphore.acquire();
            f=super.listIterator(i);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return f;
    }

    @Override
    public List subList(int i, int i1) {
        List f = null;
        try {
            semaphore.acquire();
            f=super.subList(i,i1);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return f;
    }

    @Override
    public boolean retainAll(Collection collection) {
        boolean f = false;
        try {
            semaphore.acquire();
            f=super.retainAll(collection);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return f;
    }

    @Override
    public boolean removeAll(Collection collection) {
        boolean f = false;
        try {
            semaphore.acquire();
            f=super.removeAll(collection);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return f;
    }

    @Override
    public boolean containsAll(Collection collection) {
        boolean f = false;
        try {
            semaphore.acquire();
            f=super.containsAll(collection);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return f;
    }

    @Override
    public Object[] toArray(Object[] objects) {
        Object[] f = new Object[0];
        try {
            semaphore.acquire();
            f=super.toArray(objects);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return f;
    }
}
