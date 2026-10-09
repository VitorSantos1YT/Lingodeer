package ot;

/* JADX INFO: loaded from: classes4.dex */
public final class v extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f46017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f46018b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ bh.q f46019c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(bh.q qVar, vy.d dVar) {
        super(dVar);
        this.f46019c = qVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f46017a = obj;
        this.f46018b |= Integer.MIN_VALUE;
        return this.f46019c.emit(null, this);
    }
}
