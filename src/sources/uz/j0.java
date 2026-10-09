package uz;

/* JADX INFO: loaded from: classes4.dex */
public final class j0 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f53320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f53321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n9.m1 f53322c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f53323d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public j f53324e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(n9.m1 m1Var, vy.d dVar) {
        super(dVar);
        this.f53322c = m1Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f53320a = obj;
        this.f53321b |= Integer.MIN_VALUE;
        return this.f53322c.emit(null, this);
    }
}
