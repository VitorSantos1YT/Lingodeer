package rt;

import com.lingodeer.data.model.CourseUnit;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class h4 extends xy.i implements fz.f {
    public final /* synthetic */ vt.c H;
    public final /* synthetic */ vt.n0 K;
    public final /* synthetic */ int L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f49820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ uz.j f49821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f49822c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wt.m f49823d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vt.k0 f49824e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vt.j0 f49825f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ vt.h1 f49826t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h4(vy.d dVar, wt.m mVar, vt.k0 k0Var, vt.j0 j0Var, vt.h1 h1Var, vt.c cVar, vt.n0 n0Var, int i11) {
        super(3, dVar);
        this.f49823d = mVar;
        this.f49824e = k0Var;
        this.f49825f = j0Var;
        this.f49826t = h1Var;
        this.H = cVar;
        this.K = n0Var;
        this.L = i11;
    }

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        h4 h4Var = new h4((vy.d) obj3, this.f49823d, this.f49824e, this.f49825f, this.f49826t, this.H, this.K, this.L);
        h4Var.f49821b = (uz.j) obj;
        h4Var.f49822c = obj2;
        return h4Var.invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f49820a;
        qy.b0 b0Var = qy.b0.f48488a;
        if (i11 == 0) {
            com.bumptech.glide.e.F(obj);
            uz.j jVar = this.f49821b;
            CourseUnit courseUnit = (CourseUnit) this.f49822c;
            kotlin.jvm.internal.m.f(courseUnit, "courseUnit");
            uz.i iVarJ = ((fr.x4) this.f49826t).j();
            vz.i iVarB = uz.x0.B(((vt.d) this.H).f54191a, new tb(null, this.f49823d, courseUnit, 0));
            vb vbVar = new vb(this.f49824e, this.K, courseUnit, this.f49825f, null);
            this.f49821b = null;
            this.f49822c = null;
            this.f49820a = 1;
            uz.x0.s(jVar);
            Object objA = vz.b.a(uz.n0.f53370a, new uz.l0(vbVar, (vy.d) null), jVar, this, new uz.i[]{iVarJ, iVarB});
            if (objA != wy.a.COROUTINE_SUSPENDED) {
                objA = b0Var;
            }
            if (objA != wy.a.COROUTINE_SUSPENDED) {
                objA = b0Var;
            }
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(obj);
        }
        return b0Var;
    }
}
