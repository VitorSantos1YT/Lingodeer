package js;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class f extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f36752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f36753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f36754c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f36755d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g f36756e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f36757f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, xy.c cVar) {
        super(cVar);
        this.f36756e = gVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f36755d = obj;
        this.f36757f |= Integer.MIN_VALUE;
        return g.b(this.f36756e, null, this);
    }
}
