package fr;

/* JADX INFO: loaded from: classes3.dex */
public final class r1 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f27807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f27808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o1 f27809c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public uz.j f27810d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f27811e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(o1 o1Var, vy.d dVar) {
        super(dVar);
        this.f27809c = o1Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f27807a = obj;
        this.f27808b |= Integer.MIN_VALUE;
        return this.f27809c.emit(null, this);
    }
}
