package z2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c2 extends kotlin.jvm.internal.n implements fz.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c2 f58521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c2 f58522c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f58523a;

    static {
        int i11 = 0;
        f58521b = new c2(i11, 0);
        f58522c = new c2(i11, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c2(int i11, int i12) {
        super(i11);
        this.f58523a = i12;
    }

    @Override // fz.a
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f58523a) {
            case 0:
                return null;
            default:
                return Boolean.FALSE;
        }
    }
}
