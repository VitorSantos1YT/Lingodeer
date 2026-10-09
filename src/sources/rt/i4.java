package rt;

/* JADX INFO: loaded from: classes4.dex */
public final class i4 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f49868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f49869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j4 f49870c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i4(j4 j4Var, vy.d dVar) {
        super(dVar);
        this.f49870c = j4Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f49868a = obj;
        this.f49869b |= Integer.MIN_VALUE;
        return this.f49870c.emit(null, this);
    }
}
