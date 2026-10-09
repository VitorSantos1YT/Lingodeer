package rt;

/* JADX INFO: loaded from: classes4.dex */
public final class y3 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f50677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f50678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ bh.q f50679c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y3(bh.q qVar, vy.d dVar) {
        super(dVar);
        this.f50679c = qVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f50677a = obj;
        this.f50678b |= Integer.MIN_VALUE;
        return this.f50679c.emit(null, this);
    }
}
