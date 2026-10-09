package uz;

/* JADX INFO: loaded from: classes4.dex */
public final class s extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f53392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f53393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n9.n1 f53394c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public n9.n1 f53395d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public j f53396e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(n9.n1 n1Var, vy.d dVar) {
        super(dVar);
        this.f53394c = n1Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f53392a = obj;
        this.f53393b |= Integer.MIN_VALUE;
        return this.f53394c.collect(null, this);
    }
}
