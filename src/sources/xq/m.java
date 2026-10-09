package xq;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class m extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i f56195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f56196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f56197c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f56198d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(i iVar, xy.c cVar) {
        super(cVar);
        this.f56197c = iVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f56196b = obj;
        this.f56198d |= Integer.MIN_VALUE;
        return this.f56197c.a(this);
    }
}
