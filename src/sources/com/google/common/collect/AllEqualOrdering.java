package com.google.common.collect;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
final class AllEqualOrdering extends Ordering<Object> implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AllEqualOrdering f16623a = new AllEqualOrdering();
    private static final long serialVersionUID = 0;

    private Object readResolve() {
        return f16623a;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return 0;
    }

    public final String toString() {
        return "Ordering.allEqual()";
    }

    @Override // com.google.common.collect.Ordering
    public final Ordering g() {
        return this;
    }
}
