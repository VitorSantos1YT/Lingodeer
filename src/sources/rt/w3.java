package rt;

/* JADX INFO: loaded from: classes4.dex */
public final class w3 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f50570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f50571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ gp.g1 f50572c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3(gp.g1 g1Var, vy.d dVar) {
        super(dVar);
        this.f50572c = g1Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f50570a = obj;
        this.f50571b |= Integer.MIN_VALUE;
        return this.f50572c.emit(null, this);
    }
}
