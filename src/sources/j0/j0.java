package j0;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f35318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q0 f35319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f35320c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f35321d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f35322e;

    public j0(int i11, q0 q0Var, long j11, int i12, int i13) {
        this.f35318a = i11;
        this.f35319b = q0Var;
        this.f35320c = j11;
        this.f35321d = i12;
        this.f35322e = i13;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x003d  */
    public final h0 a(i0 i0Var, boolean z11, int i11, int i12, int i13, int i14) {
        h0 h0Var;
        w2.p0 p0Var;
        y.k kVar;
        w2.g1 g1Var;
        if (i0Var.f35312b) {
            q0 q0Var = this.f35319b;
            int i15 = p0.f35376a[q0Var.f35383a.ordinal()];
            boolean z12 = true;
            if (i15 == 1 || i15 == 2) {
                h0Var = null;
            } else {
                if (i15 != 3 && i15 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                if (z11) {
                    p0Var = q0Var.f35384b;
                    kVar = q0Var.f35388f;
                    g1Var = q0Var.f35385c;
                } else {
                    p0Var = (i11 < -1 || i12 < 0) ? null : q0Var.f35386d;
                    kVar = q0Var.f35389g;
                    g1Var = q0Var.f35387e;
                }
                if (p0Var == null) {
                    h0Var = null;
                } else {
                    kotlin.jvm.internal.m.c(kVar);
                    h0Var = new h0(p0Var, g1Var, kVar.f56725a);
                }
            }
            if (h0Var != null) {
                if (i11 < 0 || (i14 != 0 && (i13 - ((int) (h0Var.f35298b >> 32)) < 0 || i14 >= this.f35318a))) {
                    z12 = false;
                }
                h0Var.f35297a = z12;
                return h0Var;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005a, code lost:
    
        if ((((int) (r22 >> 32)) - ((int) (r5 >> 32))) < 0) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final j0.i0 b(boolean r20, int r21, long r22, y.k r24, int r25, int r26, int r27, boolean r28, boolean r29) {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.j0.b(boolean, int, long, y.k, int, int, int, boolean, boolean):j0.i0");
    }
}
