package bh;

/* JADX INFO: loaded from: classes3.dex */
public final class v0 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f4401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l0 f4403c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public uz.j f4404d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4405e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(l0 l0Var, vy.d dVar) {
        super(dVar);
        this.f4403c = l0Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f4401a = obj;
        this.f4402b |= Integer.MIN_VALUE;
        return this.f4403c.emit(null, this);
    }
}
