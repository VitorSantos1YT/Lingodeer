package no;

import gp.g1;

/* JADX INFO: loaded from: classes3.dex */
public final class o extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f43904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f43905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g1 f43906c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(g1 g1Var, vy.d dVar) {
        super(dVar);
        this.f43906c = g1Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f43904a = obj;
        this.f43905b |= Integer.MIN_VALUE;
        return this.f43906c.emit(null, this);
    }
}
