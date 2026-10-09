package p7;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z0 f46333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f46334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f46335c;

    public c(d dVar, z0 z0Var) {
        this.f46335c = dVar;
        this.f46333a = z0Var;
    }

    @Override // p7.z0
    public final void b() {
        this.f46333a.b();
    }

    @Override // p7.z0
    public final boolean f() {
        return !this.f46335c.c() && this.f46333a.f();
    }

    @Override // p7.z0
    public final int m(long j11) {
        if (this.f46335c.c()) {
            return -3;
        }
        return this.f46333a.m(j11);
    }

    @Override // p7.z0
    public final int o(ob.e eVar, e7.d dVar, int i11) {
        d dVar2 = this.f46335c;
        if (dVar2.c()) {
            return -3;
        }
        if (this.f46334b) {
            dVar.f6652b = 4;
            return -4;
        }
        long jW = dVar2.w();
        int iO = this.f46333a.o(eVar, dVar, i11);
        if (iO != -5) {
            long j11 = dVar2.f46344f;
            if (j11 == Long.MIN_VALUE || ((iO != -4 || dVar.f25117t < j11) && !(iO == -3 && jW == Long.MIN_VALUE && !dVar.f25116f))) {
                return iO;
            }
            dVar.n();
            dVar.f6652b = 4;
            this.f46334b = true;
            return -4;
        }
        y6.p pVar = (y6.p) eVar.f44805c;
        pVar.getClass();
        int i12 = pVar.J;
        int i13 = pVar.I;
        if (i13 == 0 && i12 == 0) {
            return -5;
        }
        if (dVar2.f46343e != 0) {
            i13 = 0;
        }
        if (dVar2.f46344f != Long.MIN_VALUE) {
            i12 = 0;
        }
        y6.o oVarA = pVar.a();
        oVarA.H = i13;
        oVarA.I = i12;
        eVar.f44805c = new y6.p(oVarA);
        return -5;
    }
}
