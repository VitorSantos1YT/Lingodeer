package com.google.common.collect;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public abstract class ForwardingCollection<E> extends ForwardingObject implements Collection<E> {
    public boolean add(Object obj) {
        return o0().add(obj);
    }

    public boolean addAll(Collection collection) {
        return o0().addAll(collection);
    }

    public void clear() {
        o0().clear();
    }

    public boolean contains(Object obj) {
        return o0().contains(obj);
    }

    public boolean containsAll(Collection collection) {
        return o0().containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return o0().isEmpty();
    }

    public Iterator iterator() {
        return o0().iterator();
    }

    @Override // com.google.common.collect.ForwardingObject
    public abstract Collection j0();

    public final Object[] p0() {
        return toArray(new Object[size()]);
    }

    public final String r0() {
        int size = size();
        CollectPreconditions.b(size, "size");
        StringBuilder sb2 = new StringBuilder((int) Math.min(((long) size) * 8, 1073741824L));
        sb2.append('[');
        boolean z11 = true;
        for (E e8 : this) {
            if (!z11) {
                sb2.append(", ");
            }
            if (e8 == this) {
                sb2.append("(this Collection)");
            } else {
                sb2.append(e8);
            }
            z11 = false;
        }
        sb2.append(']');
        return sb2.toString();
    }

    public boolean remove(Object obj) {
        return o0().remove(obj);
    }

    public boolean removeAll(Collection collection) {
        return o0().removeAll(collection);
    }

    public boolean retainAll(Collection collection) {
        return o0().retainAll(collection);
    }

    @Override // java.util.Collection
    public final int size() {
        return o0().size();
    }

    public Object[] toArray() {
        return o0().toArray();
    }

    public Object[] toArray(Object[] objArr) {
        return o0().toArray(objArr);
    }
}
