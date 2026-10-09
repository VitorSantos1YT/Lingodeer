package gu;

import gp.g1;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f29841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f29842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g1 f29843c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(g1 g1Var, vy.d dVar) {
        super(dVar);
        this.f29843c = g1Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f29841a = obj;
        this.f29842b |= Integer.MIN_VALUE;
        return this.f29843c.emit(null, this);
    }
}
