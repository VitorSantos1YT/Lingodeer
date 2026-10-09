package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d8 extends kotlin.jvm.internal.n implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v3.c f30150b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d8(v3.c cVar, int i11) {
        super(1);
        this.f30149a = i11;
        this.f30150b = cVar;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        switch (this.f30149a) {
            case 0:
                ((Number) obj).floatValue();
                return Float.valueOf(this.f30150b.e0(56));
            default:
                ((Number) obj).floatValue();
                return Float.valueOf(this.f30150b.e0(56));
        }
    }
}
