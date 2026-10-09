package nm;

import xy.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f43847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f43848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f43849c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, c cVar) {
        super(cVar);
        this.f43848b = bVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f43847a = obj;
        this.f43849c |= Integer.MIN_VALUE;
        return this.f43848b.j(this);
    }
}
