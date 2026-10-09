package z2;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j1 implements w1.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w1.f f58593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k1 f58594b;

    public j1(w1.f fVar, k1 k1Var) {
        this.f58593a = fVar;
        this.f58594b = k1Var;
    }

    @Override // w1.e
    public final Map a() {
        return this.f58593a.a();
    }

    @Override // w1.e
    public final Object b(String str) {
        return this.f58593a.b(str);
    }

    @Override // w1.e
    public final boolean canBeSaved(Object obj) {
        return this.f58593a.canBeSaved(obj);
    }

    @Override // w1.e
    public final w1.d e(String str, fz.a aVar) {
        return this.f58593a.e(str, aVar);
    }
}
