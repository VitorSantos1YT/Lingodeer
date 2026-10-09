package rt;

/* JADX INFO: loaded from: classes4.dex */
public final class z1 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f50743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f50744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ bh.q f50745c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(bh.q qVar, vy.d dVar) {
        super(dVar);
        this.f50745c = qVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f50743a = obj;
        this.f50744b |= Integer.MIN_VALUE;
        return this.f50745c.emit(null, this);
    }
}
