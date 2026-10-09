package e6;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f24921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f24922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c6.i f24923c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f24924d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l f24925e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f24926f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(l lVar, xy.c cVar) {
        super(cVar);
        this.f24925e = lVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f24924d = obj;
        this.f24926f |= Integer.MIN_VALUE;
        return this.f24925e.b(null, null, this);
    }
}
