package qa;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class x extends w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y.e f47687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f47688b;

    public x(y yVar, y.e eVar) {
        this.f47688b = yVar;
        this.f47687a = eVar;
    }

    @Override // qa.w, qa.t
    public final void c(v vVar) {
        ((ArrayList) this.f47687a.get(this.f47688b.f47690b)).remove(vVar);
        vVar.E(this);
    }
}
