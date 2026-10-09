package w2;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 implements r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r0 f54522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m0 f54523c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f54524d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r0 f54525e;

    public /* synthetic */ i0(r0 r0Var, m0 m0Var, int i11, r0 r0Var2, int i12) {
        this.f54521a = i12;
        this.f54523c = m0Var;
        this.f54524d = i11;
        this.f54525e = r0Var2;
        this.f54522b = r0Var;
    }

    @Override // w2.r0
    public final Map a() {
        switch (this.f54521a) {
            case 0:
                break;
        }
        return this.f54522b.a();
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0098 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x009a A[LOOP:0: B:11:0x0035->B:32:0x009a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:36:0x009d A[SYNTHETIC] */
    @Override // w2.r0
    public final void b() {
        int i11;
        switch (this.f54521a) {
            case 0:
                int i12 = this.f54524d;
                m0 m0Var = this.f54523c;
                m0Var.f54546e = i12;
                this.f54525e.b();
                n1.e eVar = m0Var.O;
                y.i0 i0Var = m0Var.N;
                long[] jArr = i0Var.f56713a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i13 = 0;
                    while (true) {
                        long j11 = jArr[i13];
                        if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i14 = 8;
                            int i15 = 8 - ((~(i13 - length)) >>> 31);
                            int i16 = 0;
                            while (i16 < i15) {
                                if ((255 & j11) < 128) {
                                    int i17 = (i13 << 3) + i16;
                                    Object obj = i0Var.f56714b[i17];
                                    n1 n1Var = (n1) i0Var.f56715c[i17];
                                    int iJ = eVar.j(obj);
                                    i11 = i14;
                                    if (iJ < 0 || iJ >= m0Var.f54546e) {
                                        if (iJ >= 0) {
                                            Object[] objArr = eVar.f43112a;
                                            Object obj2 = objArr[iJ];
                                            objArr[iJ] = a0.f54472b;
                                        }
                                        if (m0Var.L.b(obj)) {
                                            n1Var.dispose();
                                        }
                                        i0Var.l(i17);
                                    }
                                } else {
                                    i11 = i14;
                                }
                                j11 >>= i11;
                                i16++;
                                i14 = i11;
                            }
                            if (i15 == i14) {
                                if (i13 != length) {
                                    i13++;
                                }
                            }
                        } else if (i13 != length) {
                            i13++;
                        }
                    }
                }
                m0Var.f(m0Var.f54545d);
                break;
            default:
                int i18 = this.f54524d;
                m0 m0Var2 = this.f54523c;
                m0Var2.f54545d = i18;
                this.f54525e.b();
                if (m0Var2.f54542a.K == null) {
                    m0Var2.f(m0Var2.f54545d);
                }
                break;
        }
    }

    @Override // w2.r0
    public final fz.c c() {
        switch (this.f54521a) {
            case 0:
                break;
        }
        return this.f54522b.c();
    }

    @Override // w2.r0
    public final int f() {
        switch (this.f54521a) {
            case 0:
                break;
        }
        return this.f54522b.f();
    }

    @Override // w2.r0
    public final int h() {
        switch (this.f54521a) {
            case 0:
                break;
        }
        return this.f54522b.h();
    }
}
