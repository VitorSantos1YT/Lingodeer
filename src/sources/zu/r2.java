package zu;

import rt.zc;

/* JADX INFO: loaded from: classes4.dex */
public final class r2 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f59546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f59547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zc f59548c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(zc zcVar, vy.d dVar) {
        super(dVar);
        this.f59548c = zcVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f59546a = obj;
        this.f59547b |= Integer.MIN_VALUE;
        return this.f59548c.emit(null, this);
    }
}
