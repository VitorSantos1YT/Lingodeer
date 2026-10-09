package uz;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public vz.o f53249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f53250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ gp.r f53251c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f53252d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(gp.r rVar, vy.d dVar) {
        super(dVar);
        this.f53251c = rVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f53250b = obj;
        this.f53252d |= Integer.MIN_VALUE;
        return this.f53251c.collect(null, this);
    }
}
