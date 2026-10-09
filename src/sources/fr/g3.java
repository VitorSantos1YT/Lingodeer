package fr;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class g3 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public fz.c f27539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f27540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f27541c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f27542d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i3 f27543e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f27544f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(i3 i3Var, xy.c cVar) {
        super(cVar);
        this.f27543e = i3Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f27542d = obj;
        this.f27544f |= Integer.MIN_VALUE;
        return this.f27543e.j(null, this);
    }
}
