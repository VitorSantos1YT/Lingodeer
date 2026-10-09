package ex;

import fr.p3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class u extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.google.firebase.inappmessaging.internal.k f26069c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p3 f26070d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ay.k0 f26071e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ay.k0 f26072f;

    public u(uw.d dVar, com.google.firebase.inappmessaging.internal.k kVar) {
        super(dVar);
        this.f26069c = kVar;
        this.f26070d = ax.d.f3263d;
        ay.k0 k0Var = ax.d.f3262c;
        this.f26071e = k0Var;
        this.f26072f = k0Var;
    }

    @Override // uw.d
    public final void e(n20.b bVar) {
        boolean z11 = bVar instanceof bx.a;
        uw.d dVar = this.f25954b;
        if (z11) {
            dVar.d(new s((bx.a) bVar, this.f26069c, this.f26070d, this.f26071e, this.f26072f));
        } else {
            dVar.d(new t(bVar, this.f26069c, this.f26070d, this.f26071e, this.f26072f));
        }
    }
}
