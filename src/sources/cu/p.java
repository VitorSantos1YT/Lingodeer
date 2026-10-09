package cu;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class p extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public File f22549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f22550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f22551c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f22552d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(t tVar, xy.c cVar) {
        super(cVar);
        this.f22551c = tVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f22550b = obj;
        this.f22552d |= Integer.MIN_VALUE;
        return this.f22551c.g(null, null, this);
    }
}
