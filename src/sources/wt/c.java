package wt;

import rt.t6;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f55239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f55240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t6 f55241c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(t6 t6Var, vy.d dVar) {
        super(dVar);
        this.f55241c = t6Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f55239a = obj;
        this.f55240b |= Integer.MIN_VALUE;
        return this.f55241c.emit(null, this);
    }
}
