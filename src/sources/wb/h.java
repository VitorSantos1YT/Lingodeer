package wb;

import rt.zc;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f54911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f54912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zc f54913c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(zc zcVar, vy.d dVar) {
        super(dVar);
        this.f54913c = zcVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f54911a = obj;
        this.f54912b |= Integer.MIN_VALUE;
        return this.f54913c.emit(null, this);
    }
}
