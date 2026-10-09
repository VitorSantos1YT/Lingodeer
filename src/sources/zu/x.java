package zu;

import rt.zc;

/* JADX INFO: loaded from: classes4.dex */
public final class x extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f59572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f59573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zc f59574c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(zc zcVar, vy.d dVar) {
        super(dVar);
        this.f59574c = zcVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f59572a = obj;
        this.f59573b |= Integer.MIN_VALUE;
        return this.f59574c.emit(null, this);
    }
}
