package nl;

import gp.g1;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f43843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f43844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g1 f43845c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(g1 g1Var, vy.d dVar) {
        super(dVar);
        this.f43845c = g1Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f43843a = obj;
        this.f43844b |= Integer.MIN_VALUE;
        return this.f43845c.emit(null, this);
    }
}
