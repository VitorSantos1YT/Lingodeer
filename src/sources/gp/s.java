package gp;

/* JADX INFO: loaded from: classes3.dex */
public final class s extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f29491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f29492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ bh.e0 f29493c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public uz.j f29494d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f29495e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f29496f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(bh.e0 e0Var, vy.d dVar) {
        super(dVar);
        this.f29493c = e0Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f29491a = obj;
        this.f29492b |= Integer.MIN_VALUE;
        return this.f29493c.emit(null, this);
    }
}
