package com.google.firebase.database.collection;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class ImmutableSortedSet<T> implements Iterable<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImmutableSortedMap f19032a;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class WrappedEntryIterator<T> implements Iterator<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Iterator f19033a;

        public WrappedEntryIterator(Iterator it) {
            this.f19033a = it;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f19033a.hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            return ((Map.Entry) this.f19033a.next()).getKey();
        }

        @Override // java.util.Iterator
        public final void remove() {
            this.f19033a.remove();
        }
    }

    public ImmutableSortedSet(List list, Comparator comparator) {
        ImmutableSortedMap immutableSortedMapB;
        Map map = Collections.EMPTY_MAP;
        if (list.size() < 25) {
            Collections.sort(list, comparator);
            int size = list.size();
            Object[] objArr = new Object[size];
            Object[] objArr2 = new Object[size];
            int i11 = 0;
            for (Object obj : list) {
                objArr[i11] = obj;
                objArr2[i11] = map.get(obj);
                i11++;
            }
            immutableSortedMapB = new ArraySortedMap(comparator, objArr, objArr2);
        } else {
            immutableSortedMapB = RBTreeSortedMap.Builder.b(list, map, comparator);
        }
        this.f19032a = immutableSortedMapB;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ImmutableSortedSet) {
            return this.f19032a.equals(((ImmutableSortedSet) obj).f19032a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f19032a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new WrappedEntryIterator(this.f19032a.iterator());
    }

    public final Iterator v1() {
        return new WrappedEntryIterator(this.f19032a.v1());
    }

    public ImmutableSortedSet(ImmutableSortedMap immutableSortedMap) {
        this.f19032a = immutableSortedMap;
    }
}
