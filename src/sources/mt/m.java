package mt;

import h1.e8;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class m implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fz.c f41634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f41635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ rz.b0 f41636c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e8 f41637d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fz.a f41638e;

    public m(fz.c cVar, String str, rz.b0 b0Var, e8 e8Var, fz.a aVar) {
        this.f41634a = cVar;
        this.f41635b = str;
        this.f41636c = b0Var;
        this.f41637d = e8Var;
        this.f41638e = aVar;
    }

    @Override // fz.a
    public final Object invoke() {
        this.f41634a.invoke(this.f41635b);
        e8 e8Var = this.f41637d;
        rz.e0.B(this.f41636c, null, null, new h1.o5(e8Var, null, 6), 3).invokeOnCompletion(new av.r(7, e8Var, this.f41638e));
        return qy.b0.f48488a;
    }
}
