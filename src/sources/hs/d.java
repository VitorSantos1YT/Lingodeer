package hs;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f33708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f33709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f33710c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g gVar, xy.c cVar) {
        super(cVar);
        this.f33709b = gVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f33708a = obj;
        this.f33710c |= Integer.MIN_VALUE;
        return this.f33709b.a(0L, this);
    }
}
