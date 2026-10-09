package dr;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class g extends xy.c {
    public final /* synthetic */ k H;
    public int K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Iterator f23536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f23537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f23538c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f23539d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f23540e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f23541f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f23542t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(k kVar, xy.c cVar) {
        super(cVar);
        this.H = kVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f23542t = obj;
        this.K |= Integer.MIN_VALUE;
        return k.a(this.H, null, this);
    }
}
