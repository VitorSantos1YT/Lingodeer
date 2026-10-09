package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class z2 extends kotlin.jvm.internal.n implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fz.e f31392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Long f31393c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z2(fz.e eVar, Long l9, int i11) {
        super(1);
        this.f31391a = i11;
        this.f31392b = eVar;
        this.f31393c = l9;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        switch (this.f31391a) {
            case 0:
                this.f31392b.invoke((Long) obj, this.f31393c);
                break;
            default:
                this.f31392b.invoke(this.f31393c, (Long) obj);
                break;
        }
        return qy.b0.f48488a;
    }
}
