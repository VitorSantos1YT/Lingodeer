package gp;

/* JADX INFO: loaded from: classes3.dex */
public final class e1 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f29366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f29367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ bh.e0 f29368c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public uz.j f29369d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f29370e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(bh.e0 e0Var, vy.d dVar) {
        super(dVar);
        this.f29368c = e0Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f29366a = obj;
        this.f29367b |= Integer.MIN_VALUE;
        return this.f29368c.emit(null, this);
    }
}
