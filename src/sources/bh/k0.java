package bh;

/* JADX INFO: loaded from: classes3.dex */
public final class k0 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f4262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l0 f4264c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public uz.j f4265d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4266e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(l0 l0Var, vy.d dVar) {
        super(dVar);
        this.f4264c = l0Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f4262a = obj;
        this.f4263b |= Integer.MIN_VALUE;
        return this.f4264c.emit(null, this);
    }
}
