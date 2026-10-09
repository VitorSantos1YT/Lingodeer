package bh;

/* JADX INFO: loaded from: classes3.dex */
public final class w0 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f4412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l0 f4414c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public uz.j f4415d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4416e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(l0 l0Var, vy.d dVar) {
        super(dVar);
        this.f4414c = l0Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f4412a = obj;
        this.f4413b |= Integer.MIN_VALUE;
        return this.f4414c.emit(null, this);
    }
}
