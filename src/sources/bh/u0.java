package bh;

/* JADX INFO: loaded from: classes3.dex */
public final class u0 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f4394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l0 f4396c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public uz.j f4397d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4398e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(l0 l0Var, vy.d dVar) {
        super(dVar);
        this.f4396c = l0Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f4394a = obj;
        this.f4395b |= Integer.MIN_VALUE;
        return this.f4396c.emit(null, this);
    }
}
