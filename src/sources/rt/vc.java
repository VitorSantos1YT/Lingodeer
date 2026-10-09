package rt;

/* JADX INFO: loaded from: classes4.dex */
public final class vc extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f50553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f50554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ wc f50555c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vc(wc wcVar, vy.d dVar) {
        super(dVar);
        this.f50555c = wcVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f50553a = obj;
        this.f50554b |= Integer.MIN_VALUE;
        return this.f50555c.emit(null, this);
    }
}
