package gq;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class n extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f29611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f29612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f29613c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f29614d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u f29615e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f29616f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(u uVar, xy.c cVar) {
        super(cVar);
        this.f29615e = uVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f29614d = obj;
        this.f29616f |= Integer.MIN_VALUE;
        return u.a(this.f29615e, 0L, 0, this);
    }
}
