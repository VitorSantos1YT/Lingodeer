package f0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fz.c f26370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f26371b = new m(this);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d0.o1 f26372c = new d0.o1();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l1.k1 f26373d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l1.k1 f26374e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l1.k1 f26375f;

    public n(fz.c cVar) {
        this.f26370a = cVar;
        Boolean bool = Boolean.FALSE;
        this.f26373d = l1.t.B(bool);
        this.f26374e = l1.t.B(bool);
        this.f26375f = l1.t.B(bool);
    }

    @Override // f0.c2
    public final Object a(d0.l1 l1Var, fz.e eVar, xy.c cVar) {
        Object objL = rz.e0.l(new a0.e0(this, l1Var, eVar, (vy.d) null, 23), cVar);
        return objL == wy.a.COROUTINE_SUSPENDED ? objL : qy.b0.f48488a;
    }

    @Override // f0.c2
    public final boolean b() {
        return ((Boolean) this.f26373d.getValue()).booleanValue();
    }

    @Override // f0.c2
    public final float e(float f5) {
        return ((Number) this.f26370a.invoke(Float.valueOf(f5))).floatValue();
    }
}
