package rt;

/* JADX INFO: loaded from: classes4.dex */
public final class od extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f50217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f50218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zc f50219c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public od(zc zcVar, vy.d dVar) {
        super(dVar);
        this.f50219c = zcVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f50217a = obj;
        this.f50218b |= Integer.MIN_VALUE;
        return this.f50219c.emit(null, this);
    }
}
