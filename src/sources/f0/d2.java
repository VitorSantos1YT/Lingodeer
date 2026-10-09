package f0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d2 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public kotlin.jvm.internal.x f26236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f26237b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i2 f26238c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f26239d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(i2 i2Var, xy.c cVar) {
        super(cVar);
        this.f26238c = i2Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f26237b = obj;
        this.f26239d |= Integer.MIN_VALUE;
        return this.f26238c.a(0L, this);
    }
}
