package gp;

/* JADX INFO: loaded from: classes3.dex */
public final class x0 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f29542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f29543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ bh.e0 f29544c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public uz.j f29545d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f29546e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(bh.e0 e0Var, vy.d dVar) {
        super(dVar);
        this.f29544c = e0Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f29542a = obj;
        this.f29543b |= Integer.MIN_VALUE;
        return this.f29544c.emit(null, this);
    }
}
