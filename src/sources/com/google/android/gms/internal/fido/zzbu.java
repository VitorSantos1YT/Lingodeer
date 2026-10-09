package com.google.android.gms.internal.fido;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzbu extends zzbi {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final zzbu f9673f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient zzaz f9674e;

    static {
        zzcc zzccVar = zzaz.f9651b;
        f9673f = new zzbu(zzbs.f9665e, zzbp.f9664a);
    }

    public zzbu(zzaz zzazVar, Comparator comparator) {
        super(comparator);
        this.f9674e = zzazVar;
    }

    @Override // com.google.android.gms.internal.fido.zzav
    public final int b(Object[] objArr) {
        return this.f9674e.b(objArr);
    }

    @Override // com.google.android.gms.internal.fido.zzbi, java.util.NavigableSet
    public final Object ceiling(Object obj) {
        int iW = w(obj, true);
        zzaz zzazVar = this.f9674e;
        if (iW == zzazVar.size()) {
            return null;
        }
        return zzazVar.get(iW);
    }

    @Override // com.google.android.gms.internal.fido.zzav, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.f9674e, obj, this.f9660c) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        if (collection instanceof zzbo) {
            collection = ((zzbo) collection).zza();
        }
        Comparator comparator = this.f9660c;
        if (!zzca.a(comparator, collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        zzcc zzccVarListIterator = this.f9674e.listIterator(0);
        Iterator it = collection.iterator();
        zzar zzarVar = (zzar) zzccVarListIterator;
        if (zzarVar.hasNext()) {
            Object next = it.next();
            Object next2 = zzarVar.next();
            while (true) {
                try {
                    int iCompare = comparator.compare(next2, next);
                    if (iCompare >= 0) {
                        if (iCompare != 0) {
                            break;
                        }
                        if (!it.hasNext()) {
                            return true;
                        }
                        next = it.next();
                    } else {
                        if (!zzarVar.hasNext()) {
                            break;
                        }
                        next2 = zzarVar.next();
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.fido.zzav
    public final int d() {
        return this.f9674e.d();
    }

    @Override // com.google.android.gms.internal.fido.zzav
    public final int e() {
        return this.f9674e.e();
    }

    @Override // com.google.android.gms.internal.fido.zzbc, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        Object next;
        Object next2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            zzaz zzazVar = this.f9674e;
            if (zzazVar.size() == set.size()) {
                if (isEmpty()) {
                    return true;
                }
                Comparator comparator = this.f9660c;
                if (!zzca.a(comparator, set)) {
                    return containsAll(set);
                }
                Iterator it = set.iterator();
                try {
                    zzcc zzccVarListIterator = zzazVar.listIterator(0);
                    do {
                        zzar zzarVar = (zzar) zzccVarListIterator;
                        if (!zzarVar.hasNext()) {
                            return true;
                        }
                        next = zzarVar.next();
                        next2 = it.next();
                        if (next2 == null) {
                            break;
                        }
                    } while (comparator.compare(next, next2) == 0);
                } catch (ClassCastException | NoSuchElementException unused) {
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.fido.zzav
    /* JADX INFO: renamed from: f */
    public final zzcb iterator() {
        return this.f9674e.listIterator(0);
    }

    @Override // com.google.android.gms.internal.fido.zzbi, java.util.SortedSet
    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f9674e.get(0);
    }

    @Override // com.google.android.gms.internal.fido.zzbi, java.util.NavigableSet
    public final Object floor(Object obj) {
        int iV = v(obj, true) - 1;
        if (iV == -1) {
            return null;
        }
        return this.f9674e.get(iV);
    }

    @Override // com.google.android.gms.internal.fido.zzav
    public final Object[] g() {
        return this.f9674e.g();
    }

    @Override // com.google.android.gms.internal.fido.zzbi, java.util.NavigableSet
    public final Object higher(Object obj) {
        int iW = w(obj, false);
        zzaz zzazVar = this.f9674e;
        if (iW == zzazVar.size()) {
            return null;
        }
        return zzazVar.get(iW);
    }

    @Override // com.google.android.gms.internal.fido.zzbi, com.google.android.gms.internal.fido.zzbc, com.google.android.gms.internal.fido.zzav, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return this.f9674e.listIterator(0);
    }

    @Override // com.google.android.gms.internal.fido.zzbc
    public final zzaz l() {
        return this.f9674e;
    }

    @Override // com.google.android.gms.internal.fido.zzbi, java.util.SortedSet
    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        zzaz zzazVar = this.f9674e;
        return zzazVar.get(zzazVar.size() - 1);
    }

    @Override // com.google.android.gms.internal.fido.zzbi, java.util.NavigableSet
    public final Object lower(Object obj) {
        int iV = v(obj, false) - 1;
        if (iV == -1) {
            return null;
        }
        return this.f9674e.get(iV);
    }

    @Override // com.google.android.gms.internal.fido.zzbi
    public final zzbi n() {
        Comparator comparatorReverseOrder = Collections.reverseOrder(this.f9660c);
        return isEmpty() ? zzbi.t(comparatorReverseOrder) : new zzbu(this.f9674e.h(), comparatorReverseOrder);
    }

    @Override // com.google.android.gms.internal.fido.zzbi
    public final zzbi o(Object obj, boolean z11) {
        return x(0, v(obj, z11));
    }

    @Override // com.google.android.gms.internal.fido.zzbi
    public final zzbi r(Object obj, boolean z11, Object obj2, boolean z12) {
        return s(obj, z11).o(obj2, z12);
    }

    @Override // com.google.android.gms.internal.fido.zzbi
    public final zzbi s(Object obj, boolean z11) {
        return x(w(obj, z11), this.f9674e.size());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f9674e.size();
    }

    @Override // com.google.android.gms.internal.fido.zzbi, java.util.NavigableSet
    /* JADX INFO: renamed from: u */
    public final zzcb descendingIterator() {
        return this.f9674e.h().listIterator(0);
    }

    public final int v(Object obj, boolean z11) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.f9674e, obj, this.f9660c);
        if (iBinarySearch >= 0) {
            return z11 ? iBinarySearch + 1 : iBinarySearch;
        }
        return ~iBinarySearch;
    }

    public final int w(Object obj, boolean z11) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.f9674e, obj, this.f9660c);
        if (iBinarySearch >= 0) {
            return z11 ? iBinarySearch : iBinarySearch + 1;
        }
        return ~iBinarySearch;
    }

    public final zzbu x(int i11, int i12) {
        zzaz zzazVar = this.f9674e;
        if (i11 == 0) {
            if (i12 == zzazVar.size()) {
                return this;
            }
            i11 = 0;
        }
        Comparator comparator = this.f9660c;
        return i11 < i12 ? new zzbu(zzazVar.subList(i11, i12), comparator) : zzbi.t(comparator);
    }
}
