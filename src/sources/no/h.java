package no;

import gp.g1;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f43873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f43874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g1 f43875c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(g1 g1Var, vy.d dVar) {
        super(dVar);
        this.f43875c = g1Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f43873a = obj;
        this.f43874b |= Integer.MIN_VALUE;
        return this.f43875c.emit(null, this);
    }
}
