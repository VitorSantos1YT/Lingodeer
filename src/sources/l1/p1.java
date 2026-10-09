package l1;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f39390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f39391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f39392c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f39393d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final y.x f39394e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final qy.q f39395f;

    public p1(int i11, ArrayList arrayList) {
        this.f39390a = arrayList;
        this.f39391b = i11;
        if (i11 < 0) {
            r1.a("Invalid start index");
        }
        this.f39393d = new ArrayList();
        y.x xVar = new y.x();
        int size = arrayList.size();
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            t0 t0Var = (t0) this.f39390a.get(i13);
            int i14 = t0Var.f39467c;
            int i15 = t0Var.f39468d;
            xVar.h(i14, new m0(i13, i12, i15));
            i12 += i15;
        }
        this.f39394e = xVar;
        this.f39395f = com.bumptech.glide.d.v(new bj.a(this, 25));
    }

    public final boolean a(int i11, int i12) {
        int i13;
        y.x xVar = this.f39394e;
        m0 m0Var = (m0) xVar.b(i11);
        if (m0Var == null) {
            return false;
        }
        int i14 = m0Var.f39355b;
        int i15 = i12 - m0Var.f39356c;
        m0Var.f39356c = i12;
        if (i15 == 0) {
            return true;
        }
        Object[] objArr = xVar.f56738c;
        long[] jArr = xVar.f56736a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i16 = 0;
        while (true) {
            long j11 = jArr[i16];
            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i17 = 8 - ((~(i16 - length)) >>> 31);
                for (int i18 = 0; i18 < i17; i18++) {
                    if ((255 & j11) < 128) {
                        m0 m0Var2 = (m0) objArr[(i16 << 3) + i18];
                        if (m0Var2.f39355b >= i14 && !m0Var2.equals(m0Var) && (i13 = m0Var2.f39355b + i15) >= 0) {
                            m0Var2.f39355b = i13;
                        }
                    }
                    j11 >>= 8;
                }
                if (i17 != 8) {
                    return true;
                }
            }
            if (i16 == length) {
                return true;
            }
            i16++;
        }
    }
}
