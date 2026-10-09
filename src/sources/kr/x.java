package kr;

/* JADX INFO: loaded from: classes3.dex */
public final class x extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f38608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f38609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ gp.g1 f38610c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(gp.g1 g1Var, vy.d dVar) {
        super(dVar);
        this.f38610c = g1Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f38608a = obj;
        this.f38609b |= Integer.MIN_VALUE;
        return this.f38610c.emit(null, this);
    }
}
