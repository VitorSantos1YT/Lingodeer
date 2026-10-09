package fr;

/* JADX INFO: loaded from: classes3.dex */
public final class s1 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f27826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f27827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o1 f27828c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public uz.j f27829d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f27830e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(o1 o1Var, vy.d dVar) {
        super(dVar);
        this.f27828c = o1Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f27826a = obj;
        this.f27827b |= Integer.MIN_VALUE;
        return this.f27828c.emit(null, this);
    }
}
