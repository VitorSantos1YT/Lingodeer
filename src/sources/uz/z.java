package uz;

/* JADX INFO: loaded from: classes4.dex */
public final class z extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public n9.m1 f53443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f53444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f53445c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n9.m1 f53446d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f53447e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(n9.m1 m1Var, vy.d dVar) {
        super(dVar);
        this.f53446d = m1Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f53444b = obj;
        this.f53445c |= Integer.MIN_VALUE;
        return this.f53446d.emit(null, this);
    }
}
