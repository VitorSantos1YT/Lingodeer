package wt;

/* JADX INFO: loaded from: classes4.dex */
public final class p extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f55341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f55342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fr.u f55343c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(fr.u uVar, vy.d dVar) {
        super(dVar);
        this.f55343c = uVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f55341a = obj;
        this.f55342b |= Integer.MIN_VALUE;
        return this.f55343c.emit(null, this);
    }
}
