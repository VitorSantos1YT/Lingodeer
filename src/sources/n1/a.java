package n1;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.m;
import y.e0;
import y.i0;
import y.o0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0 f43102a;

    public static final Object a(i0 i0Var) {
        Object objG = i0Var.g(null);
        if (objG == null) {
            return null;
        }
        if (!(objG instanceof e0)) {
            i0Var.k(null);
            return objG;
        }
        e0 e0Var = (e0) objG;
        if (e0Var.h()) {
            throw new NoSuchElementException("List is empty.");
        }
        int i11 = e0Var.f56687b - 1;
        Object objF = e0Var.f(i11);
        e0Var.k(i11);
        m.d(objF, "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
        if (e0Var.h()) {
            i0Var.k(null);
        }
        if (e0Var.f56687b == 1) {
            i0Var.m(null, e0Var.e());
        }
        return objF;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0060 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0062 A[LOOP:0: B:9:0x001e->B:22:0x0062, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x0065 A[EDGE_INSN: B:25:0x0065->B:23:0x0065 BREAK  A[LOOP:0: B:9:0x001e->B:22:0x0062], SYNTHETIC] */
    public static final e0 b(i0 i0Var) {
        if (i0Var.i()) {
            e0 e0Var = o0.f56746b;
            m.d(e0Var, "null cannot be cast to non-null type androidx.collection.ObjectList<E of androidx.collection.ObjectListKt.emptyObjectList>");
            return e0Var;
        }
        e0 e0Var2 = new e0();
        Object[] objArr = i0Var.f56715c;
        long[] jArr = i0Var.f56713a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j11 = jArr[i11];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i11 != length) {
                        break;
                        break;
                    }
                    i11++;
                } else {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j11) < 128) {
                            Object obj = objArr[(i11 << 3) + i13];
                            if (obj instanceof e0) {
                                e0Var2.c((e0) obj);
                            } else {
                                m.d(obj, "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
                                e0Var2.a(obj);
                            }
                        }
                        j11 >>= 8;
                    }
                    if (i12 != 8) {
                        break;
                    }
                    if (i11 != length) {
                        break;
                    }
                    i11++;
                }
            }
        }
        return e0Var2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return m.a(this.f43102a, ((a) obj).f43102a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f43102a.hashCode();
    }

    public final String toString() {
        return "MultiValueMap(map=" + this.f43102a + ')';
    }
}
