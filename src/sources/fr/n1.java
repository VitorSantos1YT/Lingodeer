package fr;

/* JADX INFO: loaded from: classes3.dex */
public final class n1 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f27718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f27719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o1 f27720c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public uz.j f27721d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f27722e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(o1 o1Var, vy.d dVar) {
        super(dVar);
        this.f27720c = o1Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f27718a = obj;
        this.f27719b |= Integer.MIN_VALUE;
        return this.f27720c.emit(null, this);
    }
}
