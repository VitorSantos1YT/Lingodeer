package y;

import java.util.ConcurrentModificationException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f56757a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long[] f56758b = new long[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f56759c = new Object();

    public static final void a(u0 u0Var) {
        int i11 = u0Var.f56773d;
        int[] iArr = u0Var.f56771b;
        Object[] objArr = u0Var.f56772c;
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            Object obj = objArr[i13];
            if (obj != f56759c) {
                if (i13 != i12) {
                    iArr[i12] = iArr[i13];
                    objArr[i12] = obj;
                    objArr[i13] = null;
                }
                i12++;
            }
        }
        u0Var.f56770a = false;
        u0Var.f56773d = i12;
    }

    public static final void b(f fVar, int i11) {
        fVar.f56689a = new int[i11];
        fVar.f56690b = new Object[i11];
    }

    public static final int c(f fVar, Object obj, int i11) {
        int i12 = fVar.f56691c;
        if (i12 == 0) {
            return -1;
        }
        try {
            int iA = z.a.a(i12, i11, fVar.f56689a);
            if (iA < 0 || kotlin.jvm.internal.m.a(obj, fVar.f56690b[iA])) {
                return iA;
            }
            int i13 = iA + 1;
            while (i13 < i12 && fVar.f56689a[i13] == i11) {
                if (kotlin.jvm.internal.m.a(obj, fVar.f56690b[i13])) {
                    return i13;
                }
                i13++;
            }
            for (int i14 = iA - 1; i14 >= 0 && fVar.f56689a[i14] == i11; i14--) {
                if (kotlin.jvm.internal.m.a(obj, fVar.f56690b[i14])) {
                    return i14;
                }
            }
            return ~i13;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }
}
