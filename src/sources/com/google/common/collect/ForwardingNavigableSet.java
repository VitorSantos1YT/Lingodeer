package com.google.common.collect;

import java.util.Iterator;
import java.util.NavigableSet;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public abstract class ForwardingNavigableSet<E> extends ForwardingSortedSet<E> implements NavigableSet<E> {

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class StandardDescendingSet extends Sets.DescendingSet<E> {
    }

    @Override // com.google.common.collect.ForwardingSortedSet
    /* JADX INFO: renamed from: C0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public abstract NavigableSet j0();

    @Override // java.util.NavigableSet
    public Object ceiling(Object obj) {
        return o0().ceiling(obj);
    }

    @Override // java.util.NavigableSet
    public Iterator descendingIterator() {
        return o0().descendingIterator();
    }

    @Override // java.util.NavigableSet
    public NavigableSet descendingSet() {
        return o0().descendingSet();
    }

    @Override // java.util.NavigableSet
    public Object floor(Object obj) {
        return o0().floor(obj);
    }

    @Override // java.util.NavigableSet
    public NavigableSet headSet(Object obj, boolean z11) {
        return o0().headSet(obj, z11);
    }

    @Override // java.util.NavigableSet
    public Object higher(Object obj) {
        return o0().higher(obj);
    }

    @Override // java.util.NavigableSet
    public Object lower(Object obj) {
        return o0().lower(obj);
    }

    @Override // java.util.NavigableSet
    public Object pollFirst() {
        return o0().pollFirst();
    }

    @Override // java.util.NavigableSet
    public Object pollLast() {
        return o0().pollLast();
    }

    @Override // java.util.NavigableSet
    public NavigableSet subSet(Object obj, boolean z11, Object obj2, boolean z12) {
        return o0().subSet(obj, z11, obj2, z12);
    }

    @Override // java.util.NavigableSet
    public NavigableSet tailSet(Object obj, boolean z11) {
        return o0().tailSet(obj, z11);
    }
}
