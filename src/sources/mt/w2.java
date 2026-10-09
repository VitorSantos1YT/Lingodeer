package mt;

import rt.fb;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class w2 implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ rt.b4 f42012b;

    public /* synthetic */ w2(rt.b4 b4Var, int i11) {
        this.f42011a = i11;
        this.f42012b = b4Var;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        switch (this.f42011a) {
            case 0:
                l1.j0 DisposableEffect = (l1.j0) obj;
                kotlin.jvm.internal.m.f(DisposableEffect, "$this$DisposableEffect");
                return new bt.j1(this.f42012b, 7);
            default:
                this.f42012b.Q.k((fb) obj);
                return qy.b0.f48488a;
        }
    }
}
