package com.google.android.gms.internal.fido;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzbi extends zzbj implements NavigableSet, zzbz {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient Comparator f9660c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient zzbi f9661d;

    public zzbi(Comparator comparator) {
        this.f9660c = comparator;
    }

    public static zzbu t(Comparator comparator) {
        if (zzbp.f9664a.equals(comparator)) {
            return zzbu.f9673f;
        }
        zzcc zzccVar = zzaz.f9651b;
        return new zzbu(zzbs.f9665e, comparator);
    }

    @Override // java.util.NavigableSet
    public Object ceiling(Object obj) {
        obj.getClass();
        zzar zzarVar = (zzar) ((zzbu) s(obj, true)).f9674e.listIterator(0);
        if (zzarVar.hasNext()) {
            return zzarVar.next();
        }
        return null;
    }

    @Override // java.util.SortedSet, com.google.android.gms.internal.fido.zzbz
    public final Comparator comparator() {
        return this.f9660c;
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        zzbi zzbiVar = this.f9661d;
        if (zzbiVar != null) {
            return zzbiVar;
        }
        zzbi zzbiVarN = n();
        this.f9661d = zzbiVarN;
        zzbiVarN.f9661d = this;
        return zzbiVarN;
    }

    @Override // java.util.SortedSet
    public Object first() {
        return iterator().next();
    }

    @Override // java.util.NavigableSet
    public Object floor(Object obj) {
        obj.getClass();
        zzcb zzcbVarDescendingIterator = o(obj, true).descendingIterator();
        if (zzcbVarDescendingIterator.hasNext()) {
            return zzcbVarDescendingIterator.next();
        }
        return null;
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* synthetic */ SortedSet headSet(Object obj) {
        obj.getClass();
        return o(obj, false);
    }

    @Override // java.util.NavigableSet
    public Object higher(Object obj) {
        obj.getClass();
        zzar zzarVar = (zzar) ((zzbu) s(obj, false)).f9674e.listIterator(0);
        if (zzarVar.hasNext()) {
            return zzarVar.next();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.fido.zzbc, com.google.android.gms.internal.fido.zzav, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    @Override // java.util.SortedSet
    public Object last() {
        return ((zzar) descendingIterator()).next();
    }

    @Override // java.util.NavigableSet
    public Object lower(Object obj) {
        obj.getClass();
        zzcb zzcbVarDescendingIterator = o(obj, false).descendingIterator();
        if (zzcbVarDescendingIterator.hasNext()) {
            return zzcbVarDescendingIterator.next();
        }
        return null;
    }

    public abstract zzbi n();

    public abstract zzbi o(Object obj, boolean z11);

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    public abstract zzbi r(Object obj, boolean z11, Object obj2, boolean z12);

    public abstract zzbi s(Object obj, boolean z11);

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z11, Object obj2, boolean z12) {
        obj.getClass();
        obj2.getClass();
        if (this.f9660c.compare(obj, obj2) <= 0) {
            return r(obj, z11, obj2, z12);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* synthetic */ SortedSet tailSet(Object obj) {
        obj.getClass();
        return s(obj, true);
    }

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public abstract zzcb descendingIterator();

    @Override // java.util.NavigableSet
    public final /* synthetic */ NavigableSet headSet(Object obj, boolean z11) {
        obj.getClass();
        return o(obj, z11);
    }

    @Override // java.util.NavigableSet
    public final /* synthetic */ NavigableSet tailSet(Object obj, boolean z11) {
        obj.getClass();
        return s(obj, z11);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        if (this.f9660c.compare(obj, obj2) <= 0) {
            return r(obj, true, obj2, false);
        }
        throw new IllegalArgumentException();
    }
}
