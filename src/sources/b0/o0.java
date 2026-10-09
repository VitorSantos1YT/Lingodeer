package b0;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class o0 implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0 f3627a;

    public o0(n0 n0Var) {
        this.f3627a = n0Var;
    }

    @Override // b0.y, b0.m
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final r2 a(j2 j2Var) {
        int[] iArr;
        Object[] objArr;
        n0 n0Var = this.f3627a;
        y.x xVar = n0Var.f3620b;
        y.w wVar = new y.w(xVar.f56740e + 2);
        y.x xVar2 = new y.x(xVar.f56740e);
        int[] iArr2 = xVar.f56737b;
        Object[] objArr2 = xVar.f56738c;
        long[] jArr = xVar.f56736a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j11 = jArr[i11];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8;
                    int i13 = 8 - ((~(i11 - length)) >>> 31);
                    int i14 = 0;
                    while (i14 < i13) {
                        if ((j11 & 255) < 128) {
                            int i15 = (i11 << 3) + i14;
                            int i16 = iArr2[i15];
                            m0 m0Var = (m0) objArr2[i15];
                            wVar.a(i16);
                            xVar2.h(i16, new q2((s) j2Var.f3575a.invoke(m0Var.f3606a), m0Var.f3607b));
                        }
                        j11 >>= i12;
                        i14++;
                        iArr2 = iArr2;
                        i12 = i12;
                        objArr2 = objArr2;
                    }
                    iArr = iArr2;
                    objArr = objArr2;
                    if (i13 != i12) {
                        break;
                    }
                } else {
                    iArr = iArr2;
                    objArr = objArr2;
                }
                if (i11 == length) {
                    break;
                }
                i11++;
                iArr2 = iArr;
                objArr2 = objArr;
            }
        }
        if (!xVar.a(0)) {
            int i17 = wVar.f56783b;
            if (i17 < 0) {
                z.a.d("Index must be between 0 and size");
                throw null;
            }
            wVar.b(i17 + 1);
            int[] iArr3 = wVar.f56782a;
            int i18 = wVar.f56783b;
            if (i18 != 0) {
                ry.l.H(1, 0, iArr3, iArr3, i18);
            }
            iArr3[0] = 0;
            wVar.f56783b++;
        }
        if (!xVar.a(n0Var.f3619a)) {
            wVar.a(n0Var.f3619a);
        }
        int i19 = wVar.f56783b;
        if (i19 != 0) {
            int[] iArr4 = wVar.f56782a;
            kotlin.jvm.internal.m.f(iArr4, "<this>");
            Arrays.sort(iArr4, 0, i19);
        }
        return new r2(wVar, xVar2, n0Var.f3619a, b0.f3441d);
    }
}
