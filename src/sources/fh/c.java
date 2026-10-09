package fh;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f27283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a00.a f27284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f27285c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f27286d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e f27287e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f27288f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, xy.c cVar) {
        super(cVar);
        this.f27287e = eVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f27286d = obj;
        this.f27288f |= Integer.MIN_VALUE;
        return this.f27287e.b(null, this);
    }
}
