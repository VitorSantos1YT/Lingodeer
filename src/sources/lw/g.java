package lw;

import com.google.common.base.Preconditions;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class g extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f40387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rw.h f40388b;

    public g(d dVar, rw.h hVar) {
        this.f40387a = dVar;
        Preconditions.k(hVar, "interceptor");
        this.f40388b = hVar;
    }

    @Override // lw.d
    public final String e() {
        return this.f40387a.e();
    }

    @Override // lw.d
    public final f f(e1 e1Var, c cVar) {
        rw.h hVar = this.f40388b;
        hVar.getClass();
        return new rw.g(hVar, this.f40387a.f(e1Var, cVar));
    }
}
