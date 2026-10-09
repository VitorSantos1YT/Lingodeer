package com.google.common.collect;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
final class CompoundOrdering<T> extends Ordering<T> implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Comparator[] f16673a;

    public CompoundOrdering(Ordering ordering, Comparator comparator) {
        this.f16673a = new Comparator[]{ordering, comparator};
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i11 = 0;
        while (true) {
            Comparator[] comparatorArr = this.f16673a;
            if (i11 >= comparatorArr.length) {
                return 0;
            }
            int iCompare = comparatorArr[i11].compare(obj, obj2);
            if (iCompare != 0) {
                return iCompare;
            }
            i11++;
        }
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CompoundOrdering) {
            return Arrays.equals(this.f16673a, ((CompoundOrdering) obj).f16673a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f16673a);
    }

    public final String toString() {
        return ep.a.k(new StringBuilder("Ordering.compound("), Arrays.toString(this.f16673a), ")");
    }
}
