package y9;

import w9.w;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public s f57512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public w f57513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public f f57514c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f57515d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s f57516e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f57517f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(s sVar, xy.c cVar) {
        super(cVar);
        this.f57516e = sVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f57515d = obj;
        this.f57517f |= Integer.MIN_VALUE;
        return this.f57516e.e(null, this);
    }
}
