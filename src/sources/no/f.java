package no;

import a0.d0;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f43866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f43867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d0 f43868c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d0 d0Var, vy.d dVar) {
        super(dVar);
        this.f43868c = d0Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f43866a = obj;
        this.f43867b |= Integer.MIN_VALUE;
        return this.f43868c.emit(null, this);
    }
}
