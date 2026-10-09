package bh;

/* JADX INFO: loaded from: classes3.dex */
public final class r0 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f4346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4347b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l0 f4348c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public uz.j f4349d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4350e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(l0 l0Var, vy.d dVar) {
        super(dVar);
        this.f4348c = l0Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f4346a = obj;
        this.f4347b |= Integer.MIN_VALUE;
        return this.f4348c.emit(null, this);
    }
}
