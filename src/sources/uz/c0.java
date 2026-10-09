package uz;

import rt.t6;

/* JADX INFO: loaded from: classes4.dex */
public final class c0 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public t6 f53263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f53264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f53265c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t6 f53266d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f53267e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(t6 t6Var, vy.d dVar) {
        super(dVar);
        this.f53266d = t6Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f53264b = obj;
        this.f53265c |= Integer.MIN_VALUE;
        return this.f53266d.emit(null, this);
    }
}
