package fr;

/* JADX INFO: loaded from: classes3.dex */
public final class q1 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f27790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f27791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o1 f27792c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public uz.j f27793d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f27794e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(o1 o1Var, vy.d dVar) {
        super(dVar);
        this.f27792c = o1Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f27790a = obj;
        this.f27791b |= Integer.MIN_VALUE;
        return this.f27792c.emit(null, this);
    }
}
