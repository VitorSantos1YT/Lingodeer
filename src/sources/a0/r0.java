package a0;

import l1.b3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 extends kotlin.jvm.internal.n implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b3 f178b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r0(b3 b3Var, int i11) {
        super(1);
        this.f177a = i11;
        this.f178b = b3Var;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        switch (this.f177a) {
            case 0:
                ((g2.t0) obj).b(((Number) this.f178b.getValue()).floatValue());
                return qy.b0.f48488a;
            case 1:
                return new v3.j(ew.a.c(((v3.c) obj).n0(((v3.f) this.f178b.getValue()).f53489a), 0));
            default:
                ((g2.t0) obj).b(((Number) this.f178b.getValue()).floatValue());
                return qy.b0.f48488a;
        }
    }
}
