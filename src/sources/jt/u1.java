package jt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class u1 extends xy.i implements fz.g {
    public final /* synthetic */ ns.l H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f37203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ String f37204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ String f37205c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ String f37206d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fr.o0 f37207e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f37208f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f37209t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(fr.o0 o0Var, l1.b1 b1Var, boolean z11, ns.l lVar, vy.d dVar) {
        super(4, dVar);
        this.f37207e = o0Var;
        this.f37208f = b1Var;
        this.f37209t = z11;
        this.H = lVar;
    }

    @Override // fz.g
    public final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean z11 = this.f37209t;
        ns.l lVar = this.H;
        u1 u1Var = new u1(this.f37207e, this.f37208f, z11, lVar, (vy.d) obj4);
        u1Var.f37204b = (String) obj;
        u1Var.f37205c = (String) obj2;
        u1Var.f37206d = (String) obj3;
        return u1Var.invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        String str = this.f37204b;
        String str2 = this.f37205c;
        String str3 = this.f37206d;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f37203a;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(obj);
            return obj;
        }
        com.bumptech.glide.e.F(obj);
        fr.o0 o0Var = this.f37207e;
        int i12 = o0Var.f27733a.keyLanguage;
        boolean zBooleanValue = ((Boolean) this.f37208f.getValue()).booleanValue();
        boolean zC = o0Var.c();
        t1 t1Var = new t1(this.H, str, str3, str2, (vy.d) null);
        this.f37204b = null;
        this.f37205c = null;
        this.f37206d = null;
        this.f37203a = 1;
        Object objInvoke = (ry.l.D(new Integer[]{12, 1}, Integer.valueOf(i12)) && zBooleanValue && zC && !this.f37209t) ? t1Var.invoke(this) : ns.h.f43975c;
        return objInvoke == aVar ? aVar : objInvoke;
    }
}
