package kr;

/* JADX INFO: loaded from: classes3.dex */
public final class z extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f38621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f38622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ bh.q f38623c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public uz.j f38624d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f38625e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f38626f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(bh.q qVar, vy.d dVar) {
        super(dVar);
        this.f38623c = qVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f38621a = obj;
        this.f38622b |= Integer.MIN_VALUE;
        return this.f38623c.emit(null, this);
    }
}
