package l1;

import com.google.zxing.aztec.detector.zTGP.gkbGsXmgaxRjJ;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m2 f39340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f39341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f39342c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object[] f39343d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f39344e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f39345f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f39346g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f39347h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f39348i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p0 f39349j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f39350k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f39351l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f39352n;

    public l2(m2 m2Var) {
        this.f39340a = m2Var;
        this.f39341b = m2Var.f39358a;
        int i11 = m2Var.f39359b;
        this.f39342c = i11;
        this.f39343d = m2Var.f39360c;
        this.f39344e = m2Var.f39361d;
        this.f39347h = i11;
        this.f39348i = -1;
        this.f39349j = new p0(0, false);
    }

    public final b a(int i11) {
        ArrayList arrayList = this.f39340a.K;
        int iE = o2.e(arrayList, i11, this.f39342c);
        if (iE >= 0) {
            return (b) arrayList.get(iE);
        }
        b bVar = new b(i11);
        arrayList.add(-(iE + 1), bVar);
        return bVar;
    }

    public final Object b(int[] iArr, int i11) {
        int i12 = i11 * 5;
        int i13 = iArr[i12 + 1];
        if ((268435456 & i13) != 0) {
            return this.f39343d[i12 >= iArr.length ? iArr.length : iArr[i12 + 4] + Integer.bitCount(i13 >> 29)];
        }
        return m.f39353a;
    }

    public final void c() {
        this.f39345f = true;
        m2 m2Var = this.f39340a;
        m2Var.getClass();
        if (this.f39340a != m2Var || m2Var.f39362e <= 0) {
            u.a(gkbGsXmgaxRjJ.fKIFfvXtwl);
        }
        m2Var.f39362e--;
        this.f39343d = new Object[0];
    }

    public final boolean d(int i11) {
        return (this.f39341b[(i11 * 5) + 1] & 67108864) != 0;
    }

    public final void e() {
        if (this.f39350k == 0) {
            if (!(this.f39346g == this.f39347h)) {
                u.a("endGroup() not called at the end of a group");
            }
            int i11 = (this.f39348i * 5) + 2;
            int[] iArr = this.f39341b;
            int i12 = iArr[i11];
            this.f39348i = i12;
            int i13 = this.f39342c;
            this.f39347h = i12 < 0 ? i13 : o2.a(iArr, i12) + i12;
            int iC = this.f39349j.c();
            if (iC < 0) {
                this.f39351l = 0;
                this.m = 0;
            } else {
                this.f39351l = iC;
                this.m = i12 >= i13 - 1 ? this.f39344e : iArr[((i12 + 1) * 5) + 4];
            }
        }
    }

    public final Object f() {
        int i11 = this.f39346g;
        if (i11 < this.f39347h) {
            return b(this.f39341b, i11);
        }
        return 0;
    }

    public final int g() {
        int i11 = this.f39346g;
        if (i11 >= this.f39347h) {
            return 0;
        }
        return this.f39341b[i11 * 5];
    }

    public final Object h(int i11, int i12) {
        int[] iArr = this.f39341b;
        int iC = o2.c(iArr, i11);
        int i13 = i11 + 1;
        int i14 = iC + i12;
        return i14 < (i13 < this.f39342c ? iArr[(i13 * 5) + 4] : this.f39344e) ? this.f39343d[i14] : m.f39353a;
    }

    public final int i(int i11) {
        return this.f39341b[i11 * 5];
    }

    public final boolean j(int i11) {
        return (this.f39341b[(i11 * 5) + 1] & 134217728) != 0;
    }

    public final boolean k(int i11) {
        return (this.f39341b[(i11 * 5) + 1] & 536870912) != 0;
    }

    public final boolean l(int i11) {
        return (this.f39341b[(i11 * 5) + 1] & 1073741824) != 0;
    }

    public final Object m() {
        int i11;
        if (this.f39350k > 0 || (i11 = this.f39351l) >= this.m) {
            this.f39352n = false;
            return m.f39353a;
        }
        this.f39352n = true;
        Object[] objArr = this.f39343d;
        this.f39351l = i11 + 1;
        return objArr[i11];
    }

    public final Object n(int i11) {
        int i12 = i11 * 5;
        int[] iArr = this.f39341b;
        int i13 = iArr[i12 + 1] & 1073741824;
        if (i13 != 0) {
            return i13 != 0 ? this.f39343d[iArr[i12 + 4]] : m.f39353a;
        }
        return null;
    }

    public final int o(int i11) {
        return this.f39341b[(i11 * 5) + 1] & 67108863;
    }

    public final Object p(int[] iArr, int i11) {
        int i12 = i11 * 5;
        int i13 = iArr[i12 + 1];
        if ((536870912 & i13) == 0) {
            return null;
        }
        return this.f39343d[Integer.bitCount(i13 >> 30) + iArr[i12 + 4]];
    }

    public final int q(int i11) {
        return this.f39341b[(i11 * 5) + 2];
    }

    public final void r(int i11) {
        if (!(this.f39350k == 0)) {
            u.a("Cannot reposition while in an empty region");
        }
        this.f39346g = i11;
        int[] iArr = this.f39341b;
        int i12 = this.f39342c;
        int i13 = i11 < i12 ? iArr[(i11 * 5) + 2] : -1;
        if (i13 != this.f39348i) {
            this.f39348i = i13;
            if (i13 < 0) {
                this.f39347h = i12;
            } else {
                this.f39347h = o2.a(iArr, i13) + i13;
            }
            this.f39351l = 0;
            this.m = 0;
        }
    }

    public final int s() {
        if (!(this.f39350k == 0)) {
            u.a("Cannot skip while in an empty region");
        }
        int i11 = this.f39346g;
        int[] iArr = this.f39341b;
        int i12 = (iArr[(i11 * 5) + 1] & 1073741824) == 0 ? iArr[(i11 * 5) + 1] & 67108863 : 1;
        this.f39346g = o2.a(iArr, i11) + i11;
        return i12;
    }

    public final void t() {
        if (!(this.f39350k == 0)) {
            u.a("Cannot skip the enclosing group while in an empty region");
        }
        this.f39346g = this.f39347h;
        this.f39351l = 0;
        this.m = 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SlotReader(current=");
        sb2.append(this.f39346g);
        sb2.append(", key=");
        sb2.append(g());
        sb2.append(", parent=");
        sb2.append(this.f39348i);
        sb2.append(", end=");
        return ep.a.j(sb2, this.f39347h, ')');
    }

    public final void u() {
        if (this.f39350k <= 0) {
            int i11 = this.f39348i;
            int i12 = this.f39346g;
            int[] iArr = this.f39341b;
            if (!(iArr[(i12 * 5) + 2] == i11)) {
                r1.a("Invalid slot table detected");
            }
            int i13 = this.f39351l;
            int i14 = this.m;
            p0 p0Var = this.f39349j;
            if (i13 == 0 && i14 == 0) {
                p0Var.d(-1);
            } else {
                p0Var.d(i13);
            }
            this.f39348i = i12;
            this.f39347h = o2.a(iArr, i12) + i12;
            int i15 = i12 + 1;
            this.f39346g = i15;
            this.f39351l = o2.c(iArr, i12);
            this.m = i12 >= this.f39342c - 1 ? this.f39344e : iArr[(i15 * 5) + 4];
        }
    }
}
