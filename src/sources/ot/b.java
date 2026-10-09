package ot;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f45742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f45743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ gp.g1 f45744c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(gp.g1 g1Var, vy.d dVar) {
        super(dVar);
        this.f45744c = g1Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f45742a = obj;
        this.f45743b |= Integer.MIN_VALUE;
        return this.f45744c.emit(null, this);
    }
}
