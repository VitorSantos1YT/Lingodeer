package h1;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class y7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l1.c3 f31359a = new l1.c3(t1.P);

    public static final g2.w0 a(k1.c0 c0Var, l1.n nVar) {
        w7 w7Var = (w7) ((l1.s) nVar).j(f31359a);
        switch (x7.f31314a[c0Var.ordinal()]) {
            case 1:
                return w7Var.f31245e;
            case 2:
                return b(w7Var.f31245e);
            case 3:
                return w7Var.f31241a;
            case 4:
                return b(w7Var.f31241a);
            case 5:
                return r0.f.f48733a;
            case 6:
                return w7Var.f31244d;
            case 7:
                float f5 = (float) 0.0d;
                return r0.e.b(w7Var.f31244d, new r0.b(f5), null, null, new r0.b(f5), 6);
            case 8:
                return b(w7Var.f31244d);
            case 9:
                return w7Var.f31243c;
            case 10:
                return g2.f0.f28556b;
            case 11:
                return w7Var.f31242b;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final r0.e b(r0.e eVar) {
        float f5 = (float) 0.0d;
        return r0.e.b(eVar, null, null, new r0.b(f5), new r0.b(f5), 3);
    }
}
