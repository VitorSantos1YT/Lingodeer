package au;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class g0 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public k0 f2996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Iterator f2997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2998c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f2999d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k0 f3000e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f3001f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(k0 k0Var, xy.c cVar) {
        super(cVar);
        this.f3000e = k0Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f2999d = obj;
        this.f3001f |= Integer.MIN_VALUE;
        return k0.a(this.f3000e, null, this);
    }
}
