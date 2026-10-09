package hx;

import uw.k;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class i extends com.bumptech.glide.d implements bx.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f33855a;

    public i(Object obj) {
        this.f33855a = obj;
    }

    @Override // com.bumptech.glide.d
    public final void K(k kVar) {
        j jVar = new j(kVar, this.f33855a);
        kVar.b(jVar);
        jVar.run();
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f33855a;
    }
}
