package mv;

import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class w extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public kv.l0 f42280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Uri f42281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f42282c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f42283d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y f42284e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f42285f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(y yVar, xy.c cVar) {
        super(cVar);
        this.f42284e = yVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f42283d = obj;
        this.f42285f |= Integer.MIN_VALUE;
        return y.a(this.f42284e, null, this);
    }
}
