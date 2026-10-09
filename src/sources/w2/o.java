package w2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends kotlin.jvm.internal.n implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p[] f54553b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(p[] pVarArr, int i11) {
        super(2);
        this.f54552a = i11;
        this.f54553b = pVarArr;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f54552a) {
            case 0:
                return Float.valueOf(a0.d((f1) obj, true, this.f54553b, ((Number) obj2).floatValue()));
            default:
                return Float.valueOf(a0.d((f1) obj, false, this.f54553b, ((Number) obj2).floatValue()));
        }
    }
}
