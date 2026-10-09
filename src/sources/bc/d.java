package bc;

import gc.l;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends xy.c {
    public /* synthetic */ Object H;
    public final /* synthetic */ g K;
    public int L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g f4093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public vb.b f4094b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public gc.i f4095c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f4096d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public l f4097e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public vb.c f4098f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f4099t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g gVar, xy.c cVar) {
        super(cVar);
        this.K = gVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.H = obj;
        this.L |= Integer.MIN_VALUE;
        return this.K.c(null, null, null, null, null, this);
    }
}
