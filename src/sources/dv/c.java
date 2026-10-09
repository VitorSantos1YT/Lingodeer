package dv;

import javax.crypto.SecretKey;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class c extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SecretKey f24432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SecretKey f24433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f24434c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d f24435d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f24436e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, xy.c cVar) {
        super(cVar);
        this.f24435d = dVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f24434c = obj;
        this.f24436e |= Integer.MIN_VALUE;
        return this.f24435d.b(null, null, null, this);
    }
}
