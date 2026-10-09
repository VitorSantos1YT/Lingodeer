package n5;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class u extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public kotlin.jvm.internal.w f43389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f43390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v f43391c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f43392d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(v vVar, xy.c cVar) {
        super(cVar);
        this.f43391c = vVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f43390b = obj;
        this.f43392d |= Integer.MIN_VALUE;
        return this.f43391c.j(null, false, this);
    }
}
