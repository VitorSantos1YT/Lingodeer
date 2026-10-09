package x1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f55704a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f55705b = new Object();

    public static final void a(int i11, int i12) {
        if (i11 < 0 || i11 >= i12) {
            throw new IndexOutOfBoundsException("index (" + i11 + ") is out of bound of [0, " + i12 + ')');
        }
    }

    public static final boolean b(v vVar, int i11, p1.c cVar, boolean z11) {
        boolean z12;
        synchronized (f55704a) {
            try {
                int i12 = vVar.f55735d;
                if (i12 == i11) {
                    vVar.f55734c = cVar;
                    z12 = true;
                    if (z11) {
                        vVar.f55736e++;
                    }
                    vVar.f55735d = i12 + 1;
                } else {
                    z12 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z12;
    }

    public static final int c(long[] jArr, long j11) {
        int length = jArr.length - 1;
        int i11 = 0;
        while (i11 <= length) {
            int i12 = (i11 + length) >>> 1;
            long j12 = jArr[i12];
            if (j11 > j12) {
                i11 = i12 + 1;
            } else {
                if (j11 >= j12) {
                    return i12;
                }
                length = i12 - 1;
            }
        }
        return -(i11 + 1);
    }

    public static final v e(p pVar) {
        v vVar = pVar.f55703a;
        kotlin.jvm.internal.m.d(vVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.<get-readable>>");
        return (v) l.t(vVar, pVar);
    }

    public static final int f(p pVar) {
        v vVar = pVar.f55703a;
        kotlin.jvm.internal.m.d(vVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
        return ((v) l.h(vVar)).f55736e;
    }

    public static final boolean g(p pVar, fz.c cVar) {
        int i11;
        p1.c cVar2;
        Object objInvoke;
        f fVarJ;
        boolean zB;
        do {
            synchronized (f55704a) {
                v vVar = pVar.f55703a;
                kotlin.jvm.internal.m.d(vVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                v vVar2 = (v) l.h(vVar);
                i11 = vVar2.f55735d;
                cVar2 = vVar2.f55734c;
            }
            kotlin.jvm.internal.m.c(cVar2);
            p1.f fVarG = cVar2.g();
            objInvoke = cVar.invoke(fVarG);
            p1.c cVarE = fVarG.e();
            if (kotlin.jvm.internal.m.a(cVarE, cVar2)) {
                break;
            }
            v vVar3 = pVar.f55703a;
            kotlin.jvm.internal.m.d(vVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (l.f55691c) {
                fVarJ = l.j();
                zB = b((v) l.w(vVar3, pVar, fVarJ), i11, cVarE, true);
            }
            l.n(fVarJ, pVar);
        } while (!zB);
        return ((Boolean) objInvoke).booleanValue();
    }

    public static final void h() {
        throw new UnsupportedOperationException();
    }

    public abstract void d();
}
