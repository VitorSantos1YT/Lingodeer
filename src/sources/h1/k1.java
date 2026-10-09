package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class k1 extends kotlin.jvm.internal.n implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r7 f30516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f30517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f30518c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t1.d f30519d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j3.y0 f30520e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f30521f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ j0.t1 f30522t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(r7 r7Var, boolean z11, boolean z12, t1.d dVar, j3.y0 y0Var, float f5, j0.t1 t1Var) {
        super(2);
        this.f30516a = r7Var;
        this.f30517b = z11;
        this.f30518c = z12;
        this.f30519d = dVar;
        this.f30520e = y0Var;
        this.f30521f = f5;
        this.f30522t = t1Var;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:12:0x0028 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:13:0x002a  */
    /* JADX WARN: Code duplicated, block: B:14:0x002d  */
    /* JADX WARN: Code duplicated, block: B:16:0x0032  */
    /* JADX WARN: Code duplicated, block: B:17:0x0035 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0037  */
    /* JADX WARN: Code duplicated, block: B:19:0x003a  */
    /* JADX WARN: Code duplicated, block: B:21:0x003e  */
    /* JADX WARN: Code duplicated, block: B:23:0x0042 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x0044  */
    /* JADX WARN: Code duplicated, block: B:25:0x0047  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        r7 r7Var;
        boolean z11;
        boolean z12;
        long j11;
        long j12;
        long j13;
        l1.n nVar = (l1.n) obj;
        if ((((Number) obj2).intValue() & 3) == 2) {
            l1.s sVar = (l1.s) nVar;
            if (sVar.F()) {
                sVar.W();
            } else {
                r7Var = this.f30516a;
                z11 = this.f30517b;
                z12 = this.f30518c;
                if (!z11) {
                    j11 = r7Var.f30986f;
                } else if (z12) {
                    j11 = r7Var.f30991k;
                } else {
                    j11 = r7Var.f30982b;
                }
                long j14 = j11;
                if (!z11) {
                    j12 = r7Var.f30987g;
                } else if (z12) {
                    j12 = r7Var.f30992l;
                } else {
                    j12 = r7Var.f30983c;
                }
                if (!z11) {
                    j13 = r7Var.f30988h;
                } else if (z12) {
                    j13 = r7Var.m;
                } else {
                    j13 = r7Var.f30984d;
                }
                long j15 = j13;
                m1.c(this.f30519d, this.f30520e, j14, j12, j15, this.f30521f, this.f30522t, nVar, 0);
            }
        } else {
            r7Var = this.f30516a;
            z11 = this.f30517b;
            z12 = this.f30518c;
            if (!z11) {
                j11 = r7Var.f30986f;
            } else if (z12) {
                j11 = r7Var.f30982b;
            } else {
                j11 = r7Var.f30991k;
            }
            long j16 = j11;
            if (!z11) {
                j12 = r7Var.f30987g;
            } else if (z12) {
                j12 = r7Var.f30983c;
            } else {
                j12 = r7Var.f30992l;
            }
            if (!z11) {
                j13 = r7Var.f30988h;
            } else if (z12) {
                j13 = r7Var.f30984d;
            } else {
                j13 = r7Var.m;
            }
            long j17 = j13;
            m1.c(this.f30519d, this.f30520e, j16, j12, j17, this.f30521f, this.f30522t, nVar, 0);
        }
        return qy.b0.f48488a;
    }
}
