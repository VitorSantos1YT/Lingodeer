package wb;

import rt.zc;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f54921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f54922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zc f54923c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(zc zcVar, vy.d dVar) {
        super(dVar);
        this.f54923c = zcVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f54921a = obj;
        this.f54922b |= Integer.MIN_VALUE;
        return this.f54923c.emit(null, this);
    }
}
