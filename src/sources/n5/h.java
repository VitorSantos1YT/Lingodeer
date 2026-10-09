package n5;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends xy.c {
    public int H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f43275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f43276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f43277c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public kotlin.jvm.internal.y f43278d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public v f43279e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f43280f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ i f43281t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, xy.c cVar) {
        super(cVar);
        this.f43281t = iVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f43280f = obj;
        this.H |= Integer.MIN_VALUE;
        return this.f43281t.a(null, this);
    }
}
