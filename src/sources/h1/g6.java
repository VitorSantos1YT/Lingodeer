package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g6 extends kotlin.jvm.internal.t implements mz.g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f30277b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g6(int i11, int i12, Class cls, Object obj, String str, String str2) {
        super(obj, cls, str, str2, i11);
        this.f30277b = i12;
    }

    @Override // kotlin.jvm.internal.c
    public final mz.b computeReflected() {
        kotlin.jvm.internal.z.f38362a.getClass();
        return this;
    }

    @Override // mz.g
    public final Object get() {
        switch (this.f30277b) {
            case 0:
                return ((l1.b3) this.receiver).getValue();
            case 1:
                return ((l1.b3) this.receiver).getValue();
            case 2:
                return ((l1.b3) this.receiver).getValue();
            case 3:
                return ((l1.b3) this.receiver).getValue();
            case 4:
                return ((l1.b3) this.receiver).getValue();
            default:
                return this.receiver.getClass().getSimpleName();
        }
    }

    @Override // fz.a
    public final Object invoke() {
        return get();
    }
}
