package fr;

/* JADX INFO: loaded from: classes3.dex */
public final class t extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f27842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f27843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u f27844c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(u uVar, vy.d dVar) {
        super(dVar);
        this.f27844c = uVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f27842a = obj;
        this.f27843b |= Integer.MIN_VALUE;
        return this.f27844c.emit(null, this);
    }
}
