package nl;

import gp.g1;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f43838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f43839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g1 f43840c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(g1 g1Var, vy.d dVar) {
        super(dVar);
        this.f43840c = g1Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f43838a = obj;
        this.f43839b |= Integer.MIN_VALUE;
        return this.f43840c.emit(null, this);
    }
}
