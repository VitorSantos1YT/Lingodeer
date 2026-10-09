package com.google.common.math;

import defpackage.e;
import hh.p0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
final class MathPreconditions {
    private MathPreconditions() {
    }

    public static void a(int i11, boolean z11, int i12, String str) {
        if (!z11) {
            throw new ArithmeticException(p0.i(i12, ")", e.q(i11, "overflow: ", str, "(", ", ")));
        }
    }

    public static void b(long j11, String str) {
        if (j11 >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " (" + j11 + ") must be >= 0");
    }

    public static void c(boolean z11) {
        if (!z11) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }
}
