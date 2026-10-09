package a0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends kotlin.jvm.internal.n implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f82a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f83b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Object obj, int i11) {
        super(1);
        this.f82a = i11;
        this.f83b = obj;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        switch (this.f82a) {
            case 0:
                return Boolean.valueOf(kotlin.jvm.internal.m.a(obj, this.f83b));
            default:
                ld.b it = (ld.b) obj;
                kotlin.jvm.internal.m.f(it, "it");
                return this.f83b;
        }
    }
}
