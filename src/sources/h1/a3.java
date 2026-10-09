package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a3 extends kotlin.jvm.internal.n implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f29968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f29969c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a3(String str, String str2, int i11) {
        super(1);
        this.f29967a = i11;
        this.f29968b = str;
        this.f29969c = str2;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        switch (this.f29967a) {
            case 0:
                g3.z.b((g3.b0) obj, this.f29968b + ", " + this.f29969c);
                break;
            default:
                g3.z.b((g3.b0) obj, this.f29968b + ", " + this.f29969c);
                break;
        }
        return qy.b0.f48488a;
    }
}
