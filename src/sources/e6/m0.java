package e6;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o0 f24976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Class f24977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f24978c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o0 f24979d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f24980e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(o0 o0Var, xy.c cVar) {
        super(cVar);
        this.f24979d = o0Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f24978c = obj;
        this.f24980e |= Integer.MIN_VALUE;
        return this.f24979d.a(null, this);
    }
}
