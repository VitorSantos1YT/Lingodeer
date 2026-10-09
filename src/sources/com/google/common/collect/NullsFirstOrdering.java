package com.google.common.collect;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
final class NullsFirstOrdering<T> extends Ordering<T> implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ordering f17116a;

    public NullsFirstOrdering(Ordering ordering) {
        this.f17116a = ordering;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        if (obj == obj2) {
            return 0;
        }
        if (obj == null) {
            return -1;
        }
        if (obj2 == null) {
            return 1;
        }
        return this.f17116a.compare(obj, obj2);
    }

    @Override // com.google.common.collect.Ordering
    public final Ordering e() {
        return this.f17116a.e();
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof NullsFirstOrdering) {
            return this.f17116a.equals(((NullsFirstOrdering) obj).f17116a);
        }
        return false;
    }

    @Override // com.google.common.collect.Ordering
    public final Ordering g() {
        return this.f17116a.g().e();
    }

    public final int hashCode() {
        return this.f17116a.hashCode() ^ 957692532;
    }

    public final String toString() {
        return this.f17116a + ".nullsFirst()";
    }

    @Override // com.google.common.collect.Ordering
    public final Ordering d() {
        return this;
    }
}
