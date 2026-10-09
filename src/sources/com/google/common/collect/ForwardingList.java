package com.google.common.collect;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public abstract class ForwardingList<E> extends ForwardingCollection<E> implements List<E> {
    public void add(int i11, Object obj) {
        w0();
        Collections.EMPTY_LIST.add(i11, obj);
    }

    public boolean addAll(int i11, Collection collection) {
        w0();
        return Collections.EMPTY_LIST.addAll(i11, collection);
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        w0();
        return Collections.EMPTY_LIST.equals(obj);
    }

    @Override // java.util.List
    public final Object get(int i11) {
        w0();
        return Collections.EMPTY_LIST.get(i11);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        w0();
        return Collections.EMPTY_LIST.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        w0();
        return Collections.EMPTY_LIST.indexOf(obj);
    }

    @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public /* bridge */ /* synthetic */ Object j0() {
        w0();
        return Collections.EMPTY_LIST;
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        w0();
        return Collections.EMPTY_LIST.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        w0();
        return Collections.EMPTY_LIST.listIterator();
    }

    @Override // com.google.common.collect.ForwardingCollection
    public /* bridge */ /* synthetic */ Collection o0() {
        w0();
        return Collections.EMPTY_LIST;
    }

    @Override // java.util.List
    public final Object remove(int i11) {
        w0();
        return Collections.EMPTY_LIST.remove(i11);
    }

    @Override // java.util.List
    public final Object set(int i11, Object obj) {
        w0();
        return Collections.EMPTY_LIST.set(i11, obj);
    }

    @Override // java.util.List
    public final List subList(int i11, int i12) {
        w0();
        return Collections.EMPTY_LIST.subList(i11, i12);
    }

    public abstract List w0();

    @Override // java.util.List
    public final ListIterator listIterator(int i11) {
        w0();
        return Collections.EMPTY_LIST.listIterator(i11);
    }
}
