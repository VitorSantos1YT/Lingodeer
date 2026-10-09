package com.google.common.collect;

import com.google.common.base.Preconditions;
import hh.p0;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
final class CollectPreconditions {
    public static void a(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException(p0.k(obj2, "null key in entry: null="));
        }
        if (obj2 != null) {
            return;
        }
        throw new NullPointerException("null value in entry: " + obj + "=null");
    }

    public static void b(int i11, String str) {
        if (i11 < 0) {
            throw new IllegalArgumentException(p.k(i11, str, " cannot be negative but was: "));
        }
    }

    public static void c(int i11, String str) {
        if (i11 <= 0) {
            throw new IllegalArgumentException(p.k(i11, str, " must be positive but was: "));
        }
    }

    public static void d(boolean z11) {
        Preconditions.p("no calls to next() since the last call to remove()", z11);
    }
}
