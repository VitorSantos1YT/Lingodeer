package m0;

import java.util.List;
import n0.e0;
import w2.f1;
import w2.g1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class q implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f40606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f40607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f40608c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v3.m f40609d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f40610e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f40611f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f40612g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final n0.w f40613h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f40614i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f40615j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f40616k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f40617l;
    public int m = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f40618n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f40619o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f40620p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f40621q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f40622r;

    public q(int i11, Object obj, int i12, int i13, v3.m mVar, int i14, int i15, List list, long j11, Object obj2, n0.w wVar, long j12, int i16, int i17) {
        this.f40606a = i11;
        this.f40607b = obj;
        this.f40608c = i12;
        this.f40609d = mVar;
        this.f40610e = list;
        this.f40611f = j11;
        this.f40612g = obj2;
        this.f40613h = wVar;
        this.f40614i = i16;
        this.f40615j = i17;
        int size = list.size();
        int iMax = 0;
        for (int i18 = 0; i18 < size; i18++) {
            iMax = Math.max(iMax, ((g1) list.get(i18)).f54502b);
        }
        this.f40616k = iMax;
        int i19 = i13 + iMax;
        this.f40617l = i19 >= 0 ? i19 : 0;
        this.f40618n = (((long) this.f40608c) << 32) | (((long) iMax) & 4294967295L);
        this.f40619o = 0L;
        this.f40620p = -1;
        this.f40621q = -1;
    }

    @Override // n0.e0
    public final int a() {
        return this.f40610e.size();
    }

    @Override // n0.e0
    public final int b() {
        return this.f40617l;
    }

    @Override // n0.e0
    public final int c() {
        return this.f40615j;
    }

    @Override // n0.e0
    public final Object d(int i11) {
        return ((g1) this.f40610e.get(i11)).G();
    }

    @Override // n0.e0
    public final boolean e() {
        return true;
    }

    @Override // n0.e0
    public final void f() {
        this.f40622r = true;
    }

    @Override // n0.e0
    public final void g(int i11, int i12, int i13) {
        k(i11, 0, i12, i13, -1, -1);
    }

    @Override // n0.e0
    public final int getIndex() {
        return this.f40606a;
    }

    @Override // n0.e0
    public final Object getKey() {
        return this.f40607b;
    }

    @Override // n0.e0
    public final long h(int i11) {
        return this.f40619o;
    }

    @Override // n0.e0
    public final int i() {
        return this.f40614i;
    }

    public final void j(f1 f1Var) {
        if (this.m == Integer.MIN_VALUE) {
            i0.a.a("position() should be called first");
        }
        List list = this.f40610e;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            g1 g1Var = (g1) list.get(i11);
            int i12 = g1Var.f54502b;
            long j11 = this.f40619o;
            this.f40613h.a(i11, this.f40607b);
            f1.q(f1Var, g1Var, v3.j.e(j11, this.f40611f));
        }
    }

    public final void k(int i11, int i12, int i13, int i14, int i15, int i16) {
        this.m = i14;
        if (this.f40609d == v3.m.Rtl) {
            i12 = (i13 - i12) - this.f40608c;
        }
        this.f40619o = (((long) i12) << 32) | (((long) i11) & 4294967295L);
        this.f40620p = i15;
        this.f40621q = i16;
    }
}
