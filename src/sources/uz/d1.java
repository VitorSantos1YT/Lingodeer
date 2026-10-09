package uz;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class d1 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f53276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ gq.f f53277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f53278c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(gq.f fVar, vy.d dVar) {
        super(dVar);
        this.f53277b = fVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f53276a = obj;
        this.f53278c |= Integer.MIN_VALUE;
        return this.f53277b.a(0, this);
    }
}
