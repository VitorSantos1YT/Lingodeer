package com.google.common.collect;

import java.util.Comparator;
import java.util.SortedSet;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public abstract class ForwardingSortedSet<E> extends ForwardingSet<E> implements SortedSet<E> {
    @Override // java.util.SortedSet
    public Comparator comparator() {
        return j0().comparator();
    }

    @Override // java.util.SortedSet
    public Object first() {
        return j0().first();
    }

    @Override // java.util.SortedSet
    public SortedSet headSet(Object obj) {
        return j0().headSet(obj);
    }

    @Override // java.util.SortedSet
    public Object last() {
        return j0().last();
    }

    @Override // java.util.SortedSet
    public SortedSet subSet(Object obj, Object obj2) {
        return j0().subSet(obj, obj2);
    }

    @Override // java.util.SortedSet
    public SortedSet tailSet(Object obj) {
        return j0().tailSet(obj);
    }

    @Override // com.google.common.collect.ForwardingSet
    /* JADX INFO: renamed from: z0, reason: merged with bridge method [inline-methods] */
    public abstract SortedSet j0();
}
