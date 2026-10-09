package e6;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public xq.c f24900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f24901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f24902c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f24903d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xq.c f24904e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f24905f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(xq.c cVar, xy.c cVar2) {
        super(cVar2);
        this.f24904e = cVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f24903d = obj;
        this.f24905f |= Integer.MIN_VALUE;
        return this.f24904e.v(null, 0, this);
    }
}
