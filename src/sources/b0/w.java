package b0;

import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class w implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ob.i f3715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j2 f3716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f3717c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s f3718d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final s f3719e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final s f3720f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f3721g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f3722h;

    public w(x xVar, j2 j2Var, Object obj, s sVar) {
        ob.i iVar = new ob.i(xVar.f3731a);
        this.f3715a = iVar;
        this.f3716b = j2Var;
        this.f3717c = obj;
        s sVar2 = (s) j2Var.f3575a.invoke(obj);
        this.f3718d = sVar2;
        this.f3719e = e.k(sVar);
        this.f3721g = j2Var.f3576b.invoke(iVar.m(sVar2, sVar));
        if (((s) iVar.f44815d) == null) {
            iVar.f44815d = sVar2.c();
        }
        s sVar3 = (s) iVar.f44815d;
        if (sVar3 == null) {
            kotlin.jvm.internal.m.n("velocityVector");
            throw null;
        }
        int iB = sVar3.b();
        long jMax = 0;
        for (int i11 = 0; i11 < iB; i11++) {
            a0.b2 b2Var = (a0.b2) iVar.f44813b;
            sVar2.getClass();
            jMax = Math.max(jMax, ((long) (Math.exp(((a0.p1) b2Var.f27b).b(sVar.a(i11)) / (((double) a0.q1.f176a) - 1.0d)) * 1000.0d)) * 1000000);
        }
        this.f3722h = jMax;
        s sVarK = e.k(this.f3715a.n(jMax, this.f3718d, sVar));
        this.f3720f = sVarK;
        int iB2 = sVarK.b();
        for (int i12 = 0; i12 < iB2; i12++) {
            s sVar4 = this.f3720f;
            float fA = sVar4.a(i12);
            this.f3715a.getClass();
            this.f3715a.getClass();
            sVar4.e(i12, hz.b.k(fA, -0.0f, CropImageView.DEFAULT_ASPECT_RATIO));
        }
    }

    @Override // b0.i
    public final boolean c() {
        return false;
    }

    @Override // b0.i
    public final long d() {
        return this.f3722h;
    }

    @Override // b0.i
    public final j2 e() {
        return this.f3716b;
    }

    @Override // b0.i
    public final s f(long j11) {
        if (g(j11)) {
            return this.f3720f;
        }
        return this.f3715a.n(j11, this.f3718d, this.f3719e);
    }

    @Override // b0.i
    public final Object h(long j11) {
        if (g(j11)) {
            return this.f3721g;
        }
        fz.c cVar = this.f3716b.f3576b;
        ob.i iVar = this.f3715a;
        s sVar = (s) iVar.f44814c;
        s sVar2 = this.f3718d;
        if (sVar == null) {
            iVar.f44814c = sVar2.c();
        }
        s sVar3 = (s) iVar.f44814c;
        if (sVar3 == null) {
            kotlin.jvm.internal.m.n("valueVector");
            throw null;
        }
        int iB = sVar3.b();
        for (int i11 = 0; i11 < iB; i11++) {
            s sVar4 = (s) iVar.f44814c;
            if (sVar4 == null) {
                kotlin.jvm.internal.m.n("valueVector");
                throw null;
            }
            a0.b2 b2Var = (a0.b2) iVar.f44813b;
            float fA = sVar2.a(i11);
            long j12 = j11 / 1000000;
            a0.o1 o1VarA = ((a0.p1) b2Var.f27b).a(this.f3719e.a(i11));
            long j13 = o1VarA.f157c;
            sVar4.e(i11, (Math.signum(o1VarA.f155a) * o1VarA.f156b * a0.b.a(j13 > 0 ? j12 / j13 : 1.0f).f10a) + fA);
        }
        s sVar5 = (s) iVar.f44814c;
        if (sVar5 != null) {
            return cVar.invoke(sVar5);
        }
        kotlin.jvm.internal.m.n("valueVector");
        throw null;
    }

    @Override // b0.i
    public final Object i() {
        return this.f3721g;
    }
}
