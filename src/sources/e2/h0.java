package e2;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h0 f24717a = new h0();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        e0 e0Var = (e0) obj;
        e0 e0Var2 = (e0) obj2;
        int i11 = 0;
        if (d.s(e0Var) && d.s(e0Var2)) {
            y2.i0 i0VarX = y2.f.x(e0Var);
            y2.i0 i0VarX2 = y2.f.x(e0Var2);
            if (!kotlin.jvm.internal.m.a(i0VarX, i0VarX2)) {
                Object[] objArr = new y2.i0[16];
                int i12 = 0;
                while (i0VarX != null) {
                    int i13 = i12 + 1;
                    if (objArr.length < i13) {
                        int length = objArr.length;
                        Object[] objArr2 = new Object[Math.max(i13, length * 2)];
                        System.arraycopy(objArr, 0, objArr2, 0, length);
                        objArr = objArr2;
                    }
                    if (i12 != 0) {
                        System.arraycopy(objArr, 0, objArr, 0 + 1, i12 + 0);
                    }
                    objArr[0] = i0VarX;
                    i12++;
                    i0VarX = i0VarX.w();
                }
                Object[] objArr3 = new y2.i0[16];
                int i14 = 0;
                while (i0VarX2 != null) {
                    int i15 = i14 + 1;
                    if (objArr3.length < i15) {
                        int length2 = objArr3.length;
                        Object[] objArr4 = new Object[Math.max(i15, length2 * 2)];
                        System.arraycopy(objArr3, 0, objArr4, 0, length2);
                        objArr3 = objArr4;
                    }
                    if (i14 != 0) {
                        System.arraycopy(objArr3, 0, objArr3, 0 + 1, i14 + 0);
                    }
                    objArr3[0] = i0VarX2;
                    i14++;
                    i0VarX2 = i0VarX2.w();
                }
                int iMin = Math.min(i12 - 1, i14 - 1);
                if (iMin >= 0) {
                    while (kotlin.jvm.internal.m.a(objArr[i11], objArr3[i11])) {
                        if (i11 != iMin) {
                            i11++;
                        }
                    }
                    return kotlin.jvm.internal.m.h(((y2.i0) objArr[i11]).x(), ((y2.i0) objArr3[i11]).x());
                }
                throw new IllegalStateException("Could not find a common ancestor between the two FocusModifiers.");
            }
        } else {
            if (d.s(e0Var)) {
                return -1;
            }
            if (d.s(e0Var2)) {
                return 1;
            }
        }
        return 0;
    }
}
