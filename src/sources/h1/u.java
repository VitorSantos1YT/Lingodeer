package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class u extends kotlin.jvm.internal.n implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a9.i f31131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f31132b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(a9.i iVar, float f5) {
        super(0);
        this.f31131a = iVar;
        this.f31132b = f5;
    }

    @Override // fz.a
    public final Object invoke() {
        cc ccVar;
        a9.i iVar = this.f31131a;
        Float fValueOf = (iVar == null || (ccVar = (cc) iVar.f517a) == null) ? null : Float.valueOf(ccVar.f30110a.l());
        float f5 = -this.f31132b;
        if (fValueOf == null || fValueOf.floatValue() != f5) {
            cc ccVar2 = iVar != null ? (cc) iVar.f517a : null;
            if (ccVar2 != null) {
                ccVar2.f30110a.m(f5);
            }
        }
        return qy.b0.f48488a;
    }
}
