package f7;

import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d1 extends y6.o0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f26689k = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f26690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p7.c1 f26691c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f26692d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f26693e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f26694f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f26695g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final y6.o0[] f26696h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object[] f26697i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final HashMap f26698j;

    /* JADX WARN: Illegal instructions before constructor call */
    public d1(ArrayList arrayList, p7.c1 c1Var) {
        y6.o0[] o0VarArr = new y6.o0[arrayList.size()];
        int size = arrayList.size();
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i13 < size) {
            Object obj = arrayList.get(i13);
            i13++;
            o0VarArr[i12] = ((o0) obj).a();
            i12++;
        }
        Object[] objArr = new Object[arrayList.size()];
        int size2 = arrayList.size();
        int i14 = 0;
        while (i14 < size2) {
            Object obj2 = arrayList.get(i14);
            i14++;
            objArr[i11] = ((o0) obj2).getUid();
            i11++;
        }
        this(o0VarArr, objArr, c1Var);
    }

    @Override // y6.o0
    public final int a(boolean z11) {
        if (this.f26690b != 0) {
            int iQ = 0;
            if (z11) {
                int[] iArr = this.f26691c.f46337b;
                iQ = iArr.length > 0 ? iArr[0] : -1;
            }
            do {
                y6.o0[] o0VarArr = this.f26696h;
                if (!o0VarArr[iQ].p()) {
                    return o0VarArr[iQ].a(z11) + this.f26695g[iQ];
                }
                iQ = q(iQ, z11);
            } while (iQ != -1);
        }
        return -1;
    }

    @Override // y6.o0
    public final int b(Object obj) {
        int iB;
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            Object obj2 = pair.first;
            Object obj3 = pair.second;
            Integer num = (Integer) this.f26698j.get(obj2);
            int iIntValue = num == null ? -1 : num.intValue();
            if (iIntValue != -1 && (iB = this.f26696h[iIntValue].b(obj3)) != -1) {
                return this.f26694f[iIntValue] + iB;
            }
        }
        return -1;
    }

    @Override // y6.o0
    public final int c(boolean z11) {
        int iR;
        int i11 = this.f26690b;
        if (i11 != 0) {
            if (z11) {
                int[] iArr = this.f26691c.f46337b;
                iR = iArr.length > 0 ? iArr[iArr.length - 1] : -1;
            } else {
                iR = i11 - 1;
            }
            do {
                y6.o0[] o0VarArr = this.f26696h;
                if (!o0VarArr[iR].p()) {
                    return o0VarArr[iR].c(z11) + this.f26695g[iR];
                }
                iR = r(iR, z11);
            } while (iR != -1);
        }
        return -1;
    }

    @Override // y6.o0
    public final int e(int i11, int i12, boolean z11) {
        int[] iArr = this.f26695g;
        int iC = b7.f0.c(iArr, i11 + 1, false, false);
        int i13 = iArr[iC];
        y6.o0[] o0VarArr = this.f26696h;
        int iE = o0VarArr[iC].e(i11 - i13, i12 != 2 ? i12 : 0, z11);
        if (iE != -1) {
            return i13 + iE;
        }
        int iQ = q(iC, z11);
        while (iQ != -1 && o0VarArr[iQ].p()) {
            iQ = q(iQ, z11);
        }
        if (iQ != -1) {
            return o0VarArr[iQ].a(z11) + iArr[iQ];
        }
        if (i12 == 2) {
            return a(z11);
        }
        return -1;
    }

    @Override // y6.o0
    public final y6.m0 f(int i11, y6.m0 m0Var, boolean z11) {
        int[] iArr = this.f26694f;
        int iC = b7.f0.c(iArr, i11 + 1, false, false);
        int i12 = this.f26695g[iC];
        this.f26696h[iC].f(i11 - iArr[iC], m0Var, z11);
        m0Var.f57230c += i12;
        if (z11) {
            Object obj = this.f26697i[iC];
            Object obj2 = m0Var.f57229b;
            obj2.getClass();
            m0Var.f57229b = Pair.create(obj, obj2);
        }
        return m0Var;
    }

    @Override // y6.o0
    public final y6.m0 g(Object obj, y6.m0 m0Var) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        Integer num = (Integer) this.f26698j.get(obj2);
        int iIntValue = num == null ? -1 : num.intValue();
        int i11 = this.f26695g[iIntValue];
        this.f26696h[iIntValue].g(obj3, m0Var);
        m0Var.f57230c += i11;
        m0Var.f57229b = obj;
        return m0Var;
    }

    @Override // y6.o0
    public final int h() {
        return this.f26693e;
    }

    @Override // y6.o0
    public final int k(int i11, int i12, boolean z11) {
        int[] iArr = this.f26695g;
        int iC = b7.f0.c(iArr, i11 + 1, false, false);
        int i13 = iArr[iC];
        y6.o0[] o0VarArr = this.f26696h;
        int iK = o0VarArr[iC].k(i11 - i13, i12 != 2 ? i12 : 0, z11);
        if (iK != -1) {
            return i13 + iK;
        }
        int iR = r(iC, z11);
        while (iR != -1 && o0VarArr[iR].p()) {
            iR = r(iR, z11);
        }
        if (iR != -1) {
            return o0VarArr[iR].c(z11) + iArr[iR];
        }
        if (i12 == 2) {
            return c(z11);
        }
        return -1;
    }

    @Override // y6.o0
    public final Object l(int i11) {
        int[] iArr = this.f26694f;
        int iC = b7.f0.c(iArr, i11 + 1, false, false);
        return Pair.create(this.f26697i[iC], this.f26696h[iC].l(i11 - iArr[iC]));
    }

    @Override // y6.o0
    public final y6.n0 m(int i11, y6.n0 n0Var, long j11) {
        int[] iArr = this.f26695g;
        int iC = b7.f0.c(iArr, i11 + 1, false, false);
        int i12 = iArr[iC];
        int i13 = this.f26694f[iC];
        this.f26696h[iC].m(i11 - i12, n0Var, j11);
        Object objCreate = this.f26697i[iC];
        if (!y6.n0.f57236q.equals(n0Var.f57238a)) {
            objCreate = Pair.create(objCreate, n0Var.f57238a);
        }
        n0Var.f57238a = objCreate;
        n0Var.f57250n += i13;
        n0Var.f57251o += i13;
        return n0Var;
    }

    @Override // y6.o0
    public final int o() {
        return this.f26692d;
    }

    public final int q(int i11, boolean z11) {
        if (!z11) {
            if (i11 < this.f26690b - 1) {
                return i11 + 1;
            }
            return -1;
        }
        p7.c1 c1Var = this.f26691c;
        int i12 = c1Var.f46338c[i11] + 1;
        int[] iArr = c1Var.f46337b;
        if (i12 < iArr.length) {
            return iArr[i12];
        }
        return -1;
    }

    public final int r(int i11, boolean z11) {
        if (!z11) {
            if (i11 > 0) {
                return i11 - 1;
            }
            return -1;
        }
        p7.c1 c1Var = this.f26691c;
        int i12 = c1Var.f46338c[i11] - 1;
        if (i12 >= 0) {
            return c1Var.f46337b[i12];
        }
        return -1;
    }

    public d1(y6.o0[] o0VarArr, Object[] objArr, p7.c1 c1Var) {
        this.f26691c = c1Var;
        this.f26690b = c1Var.f46337b.length;
        int length = o0VarArr.length;
        this.f26696h = o0VarArr;
        this.f26694f = new int[length];
        this.f26695g = new int[length];
        this.f26697i = objArr;
        this.f26698j = new HashMap();
        int length2 = o0VarArr.length;
        int i11 = 0;
        int iO = 0;
        int iH = 0;
        int i12 = 0;
        while (i11 < length2) {
            y6.o0 o0Var = o0VarArr[i11];
            this.f26696h[i12] = o0Var;
            this.f26695g[i12] = iO;
            this.f26694f[i12] = iH;
            iO += o0Var.o();
            iH += this.f26696h[i12].h();
            this.f26698j.put(objArr[i12], Integer.valueOf(i12));
            i11++;
            i12++;
        }
        this.f26692d = iO;
        this.f26693e = iH;
    }
}
