package fr;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class t3 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public gq.w f27861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f27862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f27863c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x4 f27864d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f27865e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3(x4 x4Var, xy.c cVar) {
        super(cVar);
        this.f27864d = x4Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f27863c = obj;
        this.f27865e |= Integer.MIN_VALUE;
        return x4.b(this.f27864d, null, false, this);
    }
}
