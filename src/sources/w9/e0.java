package w9;

import qp.m4;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public m4 f54795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f54796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g0 f54797c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f54798d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(g0 g0Var, xy.c cVar) {
        super(cVar);
        this.f54797c = g0Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f54796b = obj;
        this.f54798d |= Integer.MIN_VALUE;
        return this.f54797c.f(this);
    }
}
