package uz;

/* JADX INFO: loaded from: classes4.dex */
public final class y extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f53437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f53438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n9.n1 f53439c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public n9.m1 f53440d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(n9.n1 n1Var, vy.d dVar) {
        super(dVar);
        this.f53439c = n1Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f53437a = obj;
        this.f53438b |= Integer.MIN_VALUE;
        return this.f53439c.collect(null, this);
    }
}
