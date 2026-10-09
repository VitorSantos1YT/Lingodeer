package androidx.fragment.app;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 extends i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u.a f1659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f1660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j.a f1661c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i.b f1662d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k0 f1663e;

    public g0(k0 k0Var, u.a aVar, AtomicReference atomicReference, j.a aVar2, i.b bVar) {
        this.f1663e = k0Var;
        this.f1659a = aVar;
        this.f1660b = atomicReference;
        this.f1661c = aVar2;
        this.f1662d = bVar;
    }

    @Override // androidx.fragment.app.i0
    public final void a() {
        k0 k0Var = this.f1663e;
        this.f1660b.set(((i.i) this.f1659a.apply(null)).c(k0Var.generateActivityResultKey(), k0Var, this.f1661c, this.f1662d));
    }
}
