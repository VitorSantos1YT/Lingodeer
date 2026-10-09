package f;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f26129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d0 f26130b;

    public c0(d0 d0Var, x onBackPressedCallback) {
        kotlin.jvm.internal.m.f(onBackPressedCallback, "onBackPressedCallback");
        this.f26130b = d0Var;
        this.f26129a = onBackPressedCallback;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [fz.a, kotlin.jvm.internal.j] */
    @Override // f.b
    public final void cancel() {
        d0 d0Var = this.f26130b;
        ry.k kVar = d0Var.f26134b;
        x xVar = this.f26129a;
        kVar.remove(xVar);
        if (kotlin.jvm.internal.m.a(d0Var.f26135c, xVar)) {
            xVar.a();
            d0Var.f26135c = null;
        }
        xVar.f26173b.remove(this);
        ?? r9 = xVar.f26174c;
        if (r9 != 0) {
            r9.invoke();
        }
        xVar.f26174c = null;
    }
}
