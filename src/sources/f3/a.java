package f3;

import v3.k;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f26586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k f26587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f26588c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f26589d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f26590e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d f26591f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f26592t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, xy.c cVar) {
        super(cVar);
        this.f26591f = dVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f26590e = obj;
        this.f26592t |= Integer.MIN_VALUE;
        return d.a(this.f26591f, null, null, this);
    }
}
