package Pr3;

import javafx.util.Pair;

import java.util.*;

public class MyMap<K,V> implements Map<K,V> {
    private Pair<K,V>[] map;

    public MyMap() {
        map=new Pair[0];
    }

    @Override
    public synchronized int size() {
        return map.length;
    }

    @Override
    public synchronized boolean isEmpty() {
        return map.length==0;
    }

    @Override
    public synchronized boolean containsKey(Object o) {
        for (int i=0;i<map.length;++i) {
            if(o.equals(map[i].getKey())) return true;
        }
        return false;
    }

    @Override
    public synchronized boolean containsValue(Object o) {
        for (Pair<K,V> m : map) {
            if(o.equals(m.getValue())) return true;
        }
        return false;
    }

    @Override
    public synchronized V get(Object o) {
        for (Pair<K,V> m : map) {
            if(o.equals(m.getKey())) return m.getValue();
        }
        return null;
    }

    @Override
    public synchronized V put(Object o, Object o2) {
        if(containsKey(o)){
            V prevVal = null;
            K prevKey;
            for (Pair<K,V> m : map) {
                if(o.equals(m.getKey())){
                    prevKey=m.getKey();
                    prevVal=m.getValue();
                    m=new Pair<K,V>(prevKey,(V)o2);
                }
            }
            return prevVal;
        }
        else {
            Pair<K, V>[] copy = new Pair[map.length + 1];
            for (int i = 0; i < map.length; ++i) {
                copy[i] = map[i];
            }
            copy[map.length] = new Pair<K, V>((K) o, (V) o2);
            map=copy;
            return null;
        }
    }

    @Override
    public synchronized V remove(Object o) {
        if (containsKey(o)){
            Pair<K, V>[] copy = new Pair[map.length -1];
            V prevVal = null;
            boolean wasKey=false;
            for(int i=0;i<map.length;++i){
                if(o.equals(map[i].getKey())){
                    wasKey=true;
                    prevVal = map[i].getValue();
                    continue;
                }
                if(!wasKey) copy[i]=map[i];
                else copy[i-1]=map[i];
            }
            map=copy;
            return prevVal;
        }
        else return null;
    }

    @Override
    public synchronized void putAll(Map addedMap) {
        Iterator<Entry<K,V>> iterator = addedMap.entrySet().iterator();
        while (iterator.hasNext())
        {
            Map.Entry<K,V> pair = iterator.next();
            this.put(pair.getKey(),pair.getValue());
        }
    }

    @Override
    public synchronized void clear() {
        map=new Pair[0];
    }

    @Override
    public synchronized Set<K> keySet() {
        Set<K> set = null;
        Iterator<Entry<K,V>> iterator = this.entrySet().iterator();
        while (iterator.hasNext()) {
            Entry<K, V> pair = iterator.next();
            set.add(pair.getKey());
        }
        return set;
    }

    @Override
    public synchronized Collection values() {
        Collection<V> collection =new ArrayList<>();
        for(int i=0;i<map.length;++i){
            collection.add(map[i].getValue());
        }
        return collection;
    }

    @Override
    public synchronized Set<Entry<K, V>> entrySet() {
        Set<Entry<K,V>> set=new HashSet<>();
        for(int i=0;i<map.length;++i){
            set.add(new AbstractMap.SimpleEntry<>(map[i].getKey(),map[i].getValue()));
        }
        return set;
    }
}