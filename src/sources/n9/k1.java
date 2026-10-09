package n9;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class k1 extends xy.c {
    public int H;
    public boolean K;
    public /* synthetic */ Object L;
    public final /* synthetic */ o9.a M;
    public int N;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o9.a f43616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f43617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public x f43618c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public x f43619d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a5.f f43620e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c1 f43621f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f43622t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(o9.a aVar, xy.c cVar) {
        super(cVar);
        this.M = aVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.L = obj;
        this.N |= Integer.MIN_VALUE;
        return o9.a.a(this.M, null, 0, 0, false, null, null, null, this);
    }
}
