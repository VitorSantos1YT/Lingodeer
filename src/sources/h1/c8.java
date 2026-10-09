package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c8 extends kotlin.jvm.internal.n implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f30088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v3.c f30089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz.c f30090c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c8(boolean z11, v3.c cVar, fz.c cVar2) {
        super(1);
        this.f30088a = z11;
        this.f30089b = cVar;
        this.f30090c = cVar2;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        v3.c cVar = this.f30089b;
        fz.c cVar2 = this.f30090c;
        return new e8(this.f30088a, cVar, (f8) obj, cVar2);
    }
}
