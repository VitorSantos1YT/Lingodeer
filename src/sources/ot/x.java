package ot;

/* JADX INFO: loaded from: classes4.dex */
public final class x extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f46037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f46038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ gp.g1 f46039c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(gp.g1 g1Var, vy.d dVar) {
        super(dVar);
        this.f46039c = g1Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f46037a = obj;
        this.f46038b |= Integer.MIN_VALUE;
        return this.f46039c.emit(null, this);
    }
}
