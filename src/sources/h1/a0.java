package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends kotlin.jvm.internal.n implements fz.c {
    public final /* synthetic */ j0.h H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w2.g1 f29951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f29952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w2.g1 f29953c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j0.f f29954d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f29955e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ w2.g1 f29956f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ w2.s0 f29957t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(w2.g1 g1Var, int i11, w2.g1 g1Var2, j0.f fVar, long j11, w2.g1 g1Var3, w2.s0 s0Var, j0.h hVar, int i12) {
        super(1);
        this.f29951a = g1Var;
        this.f29952b = i11;
        this.f29953c = g1Var2;
        this.f29954d = fVar;
        this.f29955e = j11;
        this.f29956f = g1Var3;
        this.f29957t = s0Var;
        this.H = hVar;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        int iH;
        int iH2;
        w2.f1 f1Var = (w2.f1) obj;
        w2.g1 g1Var = this.f29951a;
        int i11 = g1Var.f54502b;
        int i12 = this.f29952b;
        int i13 = 0;
        w2.f1.k(f1Var, g1Var, 0, (i12 - i11) / 2);
        j0.e eVar = j0.i.f35307e;
        j0.f fVar = this.f29954d;
        boolean zA = kotlin.jvm.internal.m.a(fVar, eVar);
        w2.g1 g1Var2 = this.f29956f;
        w2.g1 g1Var3 = this.f29953c;
        long j11 = this.f29955e;
        if (zA) {
            int iH3 = v3.a.h(j11);
            int i14 = g1Var3.f54501a;
            iH = (iH3 - i14) / 2;
            int i15 = g1Var.f54501a;
            if (iH < i15) {
                iH2 = i15 - iH;
            } else if (i14 + iH > v3.a.h(j11) - g1Var2.f54501a) {
                iH2 = (v3.a.h(j11) - g1Var2.f54501a) - (g1Var3.f54501a + iH);
            }
            iH += iH2;
        } else {
            iH = kotlin.jvm.internal.m.a(fVar, j0.i.f35304b) ? (v3.a.h(j11) - g1Var3.f54501a) - g1Var2.f54501a : Math.max(this.f29957t.n0(e0.f30187b), g1Var.f54501a);
        }
        j0.h hVar = this.H;
        if (kotlin.jvm.internal.m.a(hVar, eVar)) {
            i13 = (i12 - g1Var3.f54502b) / 2;
        } else if (kotlin.jvm.internal.m.a(hVar, j0.i.f35306d)) {
            i13 = i12 - g1Var3.f54502b;
        }
        w2.f1.k(f1Var, g1Var3, iH, i13);
        w2.f1.k(f1Var, g1Var2, v3.a.h(j11) - g1Var2.f54501a, (i12 - g1Var2.f54502b) / 2);
        return qy.b0.f48488a;
    }
}
