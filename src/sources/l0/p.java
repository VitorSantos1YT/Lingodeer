package l0;

import java.util.List;
import kotlin.KotlinNothingValueException;
import n0.e0;
import w2.f1;
import w2.g1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f39163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f39164c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z1.d f39165d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final z1.i f39166e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final v3.m f39167f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f39168g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f39169h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f39170i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f39171j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final n0.w f39172k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f39173l;
    public final int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f39174n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f39175o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f39176p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f39177q = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int[] f39178r;

    public p(int i11, List list, boolean z11, z1.d dVar, z1.i iVar, v3.m mVar, int i12, int i13, int i14, long j11, Object obj, Object obj2, n0.w wVar, long j12) {
        this.f39162a = i11;
        this.f39163b = list;
        this.f39164c = z11;
        this.f39165d = dVar;
        this.f39166e = iVar;
        this.f39167f = mVar;
        this.f39168g = i14;
        this.f39169h = j11;
        this.f39170i = obj;
        this.f39171j = obj2;
        this.f39172k = wVar;
        int size = list.size();
        int i15 = 0;
        int iMax = 0;
        for (int i16 = 0; i16 < size; i16++) {
            g1 g1Var = (g1) list.get(i16);
            boolean z12 = this.f39164c;
            i15 += z12 ? g1Var.f54502b : g1Var.f54501a;
            iMax = Math.max(iMax, !z12 ? g1Var.f54502b : g1Var.f54501a);
        }
        this.m = i15;
        int i17 = i15 + this.f39168g;
        this.f39174n = i17 >= 0 ? i17 : 0;
        this.f39175o = iMax;
        this.f39178r = new int[this.f39163b.size() * 2];
    }

    @Override // n0.e0
    public final int a() {
        return this.f39163b.size();
    }

    @Override // n0.e0
    public final int b() {
        return this.f39174n;
    }

    @Override // n0.e0
    public final int c() {
        return 1;
    }

    @Override // n0.e0
    public final Object d(int i11) {
        return ((g1) this.f39163b.get(i11)).G();
    }

    @Override // n0.e0
    public final boolean e() {
        return this.f39164c;
    }

    @Override // n0.e0
    public final void f() {
        this.f39176p = true;
    }

    @Override // n0.e0
    public final void g(int i11, int i12, int i13) {
        k(i11, i12, i13);
    }

    @Override // n0.e0
    public final int getIndex() {
        return this.f39162a;
    }

    @Override // n0.e0
    public final Object getKey() {
        return this.f39170i;
    }

    @Override // n0.e0
    public final long h(int i11) {
        if (i11 == 0 && this.f39163b.size() == 0) {
            if (this.f39164c) {
                return (4294967295L & ((long) this.f39173l)) | (((long) 0) << 32);
            }
            return (4294967295L & ((long) 0)) | (((long) this.f39173l) << 32);
        }
        int i12 = i11 * 2;
        int[] iArr = this.f39178r;
        int i13 = iArr[i12];
        return (4294967295L & ((long) iArr[i12 + 1])) | (((long) i13) << 32);
    }

    @Override // n0.e0
    public final int i() {
        return 0;
    }

    public final void j(f1 f1Var) {
        if (this.f39177q == Integer.MIN_VALUE) {
            i0.a.a("position() should be called first");
        }
        List list = this.f39163b;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            g1 g1Var = (g1) list.get(i11);
            boolean z11 = this.f39164c;
            if (z11) {
                int i12 = g1Var.f54502b;
            } else {
                int i13 = g1Var.f54501a;
            }
            long jH = h(i11);
            this.f39172k.a(i11, this.f39170i);
            long jE = v3.j.e(jH, this.f39169h);
            if (z11) {
                f1.q(f1Var, g1Var, jE);
            } else {
                f1.m(f1Var, g1Var, jE);
            }
        }
    }

    public final void k(int i11, int i12, int i13) {
        int i14;
        this.f39173l = i11;
        boolean z11 = this.f39164c;
        this.f39177q = z11 ? i13 : i12;
        List list = this.f39163b;
        int size = list.size();
        for (int i15 = 0; i15 < size; i15++) {
            g1 g1Var = (g1) list.get(i15);
            int i16 = i15 * 2;
            int[] iArr = this.f39178r;
            if (z11) {
                z1.d dVar = this.f39165d;
                if (dVar == null) {
                    i0.a.b("null horizontalAlignment when isVertical == true");
                    throw new KotlinNothingValueException();
                }
                iArr[i16] = dVar.a(g1Var.f54501a, i12, this.f39167f);
                iArr[i16 + 1] = i11;
                i14 = g1Var.f54502b;
            } else {
                iArr[i16] = i11;
                int i17 = i16 + 1;
                z1.i iVar = this.f39166e;
                if (iVar == null) {
                    i0.a.b("null verticalAlignment when isVertical == false");
                    throw new KotlinNothingValueException();
                }
                iArr[i17] = iVar.a(g1Var.f54502b, i13);
                i14 = g1Var.f54501a;
            }
            i11 += i14;
        }
    }
}
