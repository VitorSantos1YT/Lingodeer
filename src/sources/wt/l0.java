package wt;

import rt.t6;

/* JADX INFO: loaded from: classes4.dex */
public final class l0 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f55306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f55307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t6 f55308c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(t6 t6Var, vy.d dVar) {
        super(dVar);
        this.f55308c = t6Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f55306a = obj;
        this.f55307b |= Integer.MIN_VALUE;
        return this.f55308c.emit(null, this);
    }
}
