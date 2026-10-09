package bh;

/* JADX INFO: loaded from: classes3.dex */
public final class p0 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f4326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l0 f4328c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public uz.j f4329d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4330e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(l0 l0Var, vy.d dVar) {
        super(dVar);
        this.f4328c = l0Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f4326a = obj;
        this.f4327b |= Integer.MIN_VALUE;
        return this.f4328c.emit(null, this);
    }
}
