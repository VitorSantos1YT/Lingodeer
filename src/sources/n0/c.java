package n0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public kotlin.jvm.internal.y f42925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f42926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f42927c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f42928d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, xy.c cVar) {
        super(cVar);
        this.f42927c = dVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f42926b = obj;
        this.f42928d |= Integer.MIN_VALUE;
        return this.f42927c.f(this);
    }
}
