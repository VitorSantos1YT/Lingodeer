package fr;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class w3 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f27950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f27951c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x4 f27952d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f27953e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3(x4 x4Var, xy.c cVar) {
        super(cVar);
        this.f27952d = x4Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f27951c = obj;
        this.f27953e |= Integer.MIN_VALUE;
        return this.f27952d.k(0, this);
    }
}
