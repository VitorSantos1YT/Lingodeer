package uz;

/* JADX INFO: loaded from: classes4.dex */
public final class r extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f53385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f53386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n9.n1 f53387c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public n9.n1 f53388d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public j f53389e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public vz.o f53390f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(n9.n1 n1Var, vy.d dVar) {
        super(dVar);
        this.f53387c = n1Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f53385a = obj;
        this.f53386b |= Integer.MIN_VALUE;
        return this.f53387c.collect(null, this);
    }
}
