package com.google.firebase.database.collection;

import com.google.firebase.database.snapshot.ChildKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ImmutableSortedMap<K, V> implements Iterable<Map.Entry<K, V>> {

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Builder {

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public interface KeyTranslator<C, D> {
        }

        public static ImmutableSortedMap a(HashMap map, Comparator comparator) {
            if (map.size() >= 25) {
                return RBTreeSortedMap.Builder.b(new ArrayList(map.keySet()), map, comparator);
            }
            ArrayList arrayList = new ArrayList(map.keySet());
            Collections.sort(arrayList, comparator);
            int size = arrayList.size();
            Object[] objArr = new Object[size];
            Object[] objArr2 = new Object[size];
            int size2 = arrayList.size();
            int i11 = 0;
            int i12 = 0;
            while (i12 < size2) {
                Object obj = arrayList.get(i12);
                i12++;
                objArr[i11] = obj;
                objArr2[i11] = map.get(obj);
                i11++;
            }
            return new ArraySortedMap(comparator, objArr, objArr2);
        }
    }

    public abstract boolean b(Object obj);

    public abstract Object d(ChildKey childKey);

    public abstract Comparator e();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImmutableSortedMap)) {
            return false;
        }
        ImmutableSortedMap immutableSortedMap = (ImmutableSortedMap) obj;
        if (!e().equals(immutableSortedMap.e()) || size() != immutableSortedMap.size()) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = iterator();
        Iterator<Map.Entry<K, V>> it2 = immutableSortedMap.iterator();
        while (it.hasNext()) {
            if (!it.next().equals(it2.next())) {
                return false;
            }
        }
        return true;
    }

    public abstract Object f();

    public abstract Object g();

    public abstract Object h(Object obj);

    public final int hashCode() {
        int iHashCode = e().hashCode();
        Iterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            iHashCode = (iHashCode * 31) + it.next().hashCode();
        }
        return iHashCode;
    }

    public abstract boolean isEmpty();

    public abstract void j(LLRBNode.NodeVisitor nodeVisitor);

    public abstract ImmutableSortedMap k(Iterable iterable, Object obj);

    public abstract ImmutableSortedMap l(Object obj);

    public abstract int size();

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append("{");
        boolean z11 = true;
        for (Map.Entry<K, V> entry : this) {
            if (z11) {
                z11 = false;
            } else {
                sb2.append(", ");
            }
            sb2.append("(");
            sb2.append(entry.getKey());
            sb2.append("=>");
            sb2.append(entry.getValue());
            sb2.append(")");
        }
        sb2.append("};");
        return sb2.toString();
    }

    public abstract Iterator v1();
}
