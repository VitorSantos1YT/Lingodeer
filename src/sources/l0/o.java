package l0;

import f0.h1;
import java.util.List;
import java.util.Map;
import rz.b0;
import w2.r0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class o implements r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f39146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f39147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f39148c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f39149d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final r0 f39150e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f39151f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f39152g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b0 f39153h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final v3.c f39154i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f39155j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f39156k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f39157l;
    public final int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f39158n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final h1 f39159o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f39160p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f39161q;

    public o(p pVar, int i11, boolean z11, float f5, r0 r0Var, float f11, boolean z12, b0 b0Var, v3.c cVar, long j11, List list, int i12, int i13, int i14, h1 h1Var, int i15, int i16) {
        this.f39146a = pVar;
        this.f39147b = i11;
        this.f39148c = z11;
        this.f39149d = f5;
        this.f39150e = r0Var;
        this.f39151f = f11;
        this.f39152g = z12;
        this.f39153h = b0Var;
        this.f39154i = cVar;
        this.f39155j = j11;
        this.f39156k = list;
        this.f39157l = i12;
        this.m = i13;
        this.f39158n = i14;
        this.f39159o = h1Var;
        this.f39160p = i15;
        this.f39161q = i16;
    }

    @Override // w2.r0
    public final Map a() {
        return this.f39150e.a();
    }

    @Override // w2.r0
    public final void b() {
        this.f39150e.b();
    }

    @Override // w2.r0
    public final fz.c c() {
        return this.f39150e.c();
    }

    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public final o d(int i11, boolean z11) {
        p pVar;
        if (this.f39152g) {
            return null;
        }
        ?? r15 = this.f39156k;
        if (r15.isEmpty() || (pVar = this.f39146a) == null) {
            return null;
        }
        int i12 = pVar.f39174n;
        int i13 = this.f39147b - i11;
        if (i13 < 0 || i13 >= i12) {
            return null;
        }
        p pVar2 = (p) ry.m.q0(r15);
        p pVar3 = (p) ry.m.z0(r15);
        if (pVar2.f39176p || pVar3.f39176p) {
            return null;
        }
        int i14 = this.m;
        int i15 = this.f39157l;
        if (i11 < 0) {
            if (Math.min((pVar2.f39173l + pVar2.f39174n) - i15, (pVar3.f39173l + pVar3.f39174n) - i14) <= (-i11)) {
                return null;
            }
        } else if (Math.min(i15 - pVar2.f39173l, i14 - pVar3.f39173l) <= i11) {
            return null;
        }
        int size = r15.size();
        for (int i16 = 0; i16 < size; i16++) {
            p pVar4 = (p) r15.get(i16);
            boolean z12 = pVar4.f39164c;
            int[] iArr = pVar4.f39178r;
            if (!pVar4.f39176p) {
                pVar4.f39173l += i11;
                int length = iArr.length;
                for (int i17 = 0; i17 < length; i17++) {
                    int i18 = i17 & 1;
                    if ((z12 && i18 != 0) || (!z12 && i18 == 0)) {
                        iArr[i17] = iArr[i17] + i11;
                    }
                }
                if (z11) {
                    int size2 = pVar4.f39163b.size();
                    for (int i19 = 0; i19 < size2; i19++) {
                        pVar4.f39172k.a(i19, pVar4.f39170i);
                    }
                }
            }
        }
        return new o(this.f39146a, i13, this.f39148c || i11 > 0, i11, this.f39150e, this.f39151f, this.f39152g, this.f39153h, this.f39154i, this.f39155j, r15, this.f39157l, this.m, this.f39158n, this.f39159o, this.f39160p, this.f39161q);
    }

    public final long e() {
        r0 r0Var = this.f39150e;
        return (((long) r0Var.h()) << 32) | (((long) r0Var.f()) & 4294967295L);
    }

    @Override // w2.r0
    public final int f() {
        return this.f39150e.f();
    }

    @Override // w2.r0
    public final int h() {
        return this.f39150e.h();
    }
}
