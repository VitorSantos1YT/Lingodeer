package jh;

import gp.g1;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f36347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f36348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g1 f36349c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g1 g1Var, vy.d dVar) {
        super(dVar);
        this.f36349c = g1Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f36347a = obj;
        this.f36348b |= Integer.MIN_VALUE;
        return this.f36349c.emit(null, this);
    }
}
