package bh;

/* JADX INFO: loaded from: classes3.dex */
public final class s0 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f4355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l0 f4357c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public uz.j f4358d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4359e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(l0 l0Var, vy.d dVar) {
        super(dVar);
        this.f4357c = l0Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f4355a = obj;
        this.f4356b |= Integer.MIN_VALUE;
        return this.f4357c.emit(null, this);
    }
}
