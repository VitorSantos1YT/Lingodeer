package fr;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public kotlin.jvm.internal.u f27450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f27451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f27452c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i f27453d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f27454e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(i iVar, xy.c cVar) {
        super(cVar);
        this.f27453d = iVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f27452c = obj;
        this.f27454e |= Integer.MIN_VALUE;
        return this.f27453d.b(null, null, this);
    }
}
