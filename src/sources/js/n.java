package js;

import gp.g1;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f36799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f36800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g1 f36801c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(g1 g1Var, vy.d dVar) {
        super(dVar);
        this.f36801c = g1Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f36799a = obj;
        this.f36800b |= Integer.MIN_VALUE;
        return this.f36801c.emit(null, this);
    }
}
