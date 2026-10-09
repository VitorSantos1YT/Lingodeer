package rt;

/* JADX INFO: loaded from: classes4.dex */
public final class yc extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f50725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f50726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zc f50727c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yc(zc zcVar, vy.d dVar) {
        super(dVar);
        this.f50727c = zcVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f50725a = obj;
        this.f50726b |= Integer.MIN_VALUE;
        return this.f50727c.emit(null, this);
    }
}
