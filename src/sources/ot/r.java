package ot;

/* JADX INFO: loaded from: classes4.dex */
public final class r extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f45962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f45963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ gp.g1 f45964c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(gp.g1 g1Var, vy.d dVar) {
        super(dVar);
        this.f45964c = g1Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f45962a = obj;
        this.f45963b |= Integer.MIN_VALUE;
        return this.f45964c.emit(null, this);
    }
}
