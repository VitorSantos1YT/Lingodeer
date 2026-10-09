package m0;

import f0.h1;
import java.util.List;
import java.util.Map;
import rz.b0;
import w2.r0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f40588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f40589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f40590c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f40591d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final r0 f40592e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f40593f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f40594g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b0 f40595h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final v3.c f40596i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f40597j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final fz.c f40598k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final fz.c f40599l;
    public final Object m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f40600n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f40601o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f40602p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final h1 f40603q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f40604r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f40605s;

    public p(r rVar, int i11, boolean z11, float f5, r0 r0Var, float f11, boolean z12, b0 b0Var, v3.c cVar, int i12, fz.c cVar2, fz.c cVar3, List list, int i13, int i14, int i15, h1 h1Var, int i16, int i17) {
        this.f40588a = rVar;
        this.f40589b = i11;
        this.f40590c = z11;
        this.f40591d = f5;
        this.f40592e = r0Var;
        this.f40593f = f11;
        this.f40594g = z12;
        this.f40595h = b0Var;
        this.f40596i = cVar;
        this.f40597j = i12;
        this.f40598k = cVar2;
        this.f40599l = cVar3;
        this.m = list;
        this.f40600n = i13;
        this.f40601o = i14;
        this.f40602p = i15;
        this.f40603q = h1Var;
        this.f40604r = i16;
        this.f40605s = i17;
    }

    @Override // w2.r0
    public final Map a() {
        return this.f40592e.a();
    }

    @Override // w2.r0
    public final void b() {
        this.f40592e.b();
    }

    @Override // w2.r0
    public final fz.c c() {
        return this.f40592e.c();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public final p d(int i11, boolean z11) {
        r rVar;
        if (this.f40594g) {
            return null;
        }
        ?? r9 = this.m;
        if (r9.isEmpty() || (rVar = this.f40588a) == null) {
            return null;
        }
        int i12 = rVar.f40629g;
        int i13 = this.f40589b - i11;
        if (i13 < 0 || i13 >= i12) {
            return null;
        }
        q qVar = (q) ry.m.q0(r9);
        q qVar2 = (q) ry.m.z0(r9);
        if (qVar.f40622r || qVar2.f40622r) {
            return null;
        }
        int i14 = this.f40601o;
        int i15 = this.f40600n;
        h1 h1Var = this.f40603q;
        if (i11 < 0) {
            if (Math.min((se.p.X(qVar, h1Var) + qVar.f40617l) - i15, (se.p.X(qVar2, h1Var) + qVar2.f40617l) - i14) <= (-i11)) {
                return null;
            }
        } else if (Math.min(i15 - se.p.X(qVar, h1Var), i14 - se.p.X(qVar2, h1Var)) <= i11) {
            return null;
        }
        int size = r9.size();
        for (int i16 = 0; i16 < size; i16++) {
            q qVar3 = (q) r9.get(i16);
            qVar3.getClass();
            if (!qVar3.f40622r) {
                long j11 = qVar3.f40619o;
                qVar3.f40619o = (((long) ((int) (j11 >> 32))) << 32) | (((long) (((int) (j11 & 4294967295L)) + i11)) & 4294967295L);
                if (z11) {
                    int size2 = qVar3.f40610e.size();
                    for (int i17 = 0; i17 < size2; i17++) {
                        qVar3.f40613h.a(i17, qVar3.f40607b);
                    }
                }
            }
        }
        return new p(this.f40588a, i13, this.f40590c || i11 > 0, i11, this.f40592e, this.f40593f, this.f40594g, this.f40595h, this.f40596i, this.f40597j, this.f40598k, this.f40599l, r9, this.f40600n, this.f40601o, this.f40602p, this.f40603q, this.f40604r, this.f40605s);
    }

    public final long e() {
        r0 r0Var = this.f40592e;
        return (((long) r0Var.h()) << 32) | (((long) r0Var.f()) & 4294967295L);
    }

    @Override // w2.r0
    public final int f() {
        return this.f40592e.f();
    }

    @Override // w2.r0
    public final int h() {
        return this.f40592e.h();
    }
}
