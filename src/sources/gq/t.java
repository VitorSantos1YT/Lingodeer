package gq;

import com.lingodeer.network.model.ApiResponse;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class t extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ApiResponse.Success f29629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f29630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u f29631c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f29632d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(u uVar, xy.c cVar) {
        super(cVar);
        this.f29631c = uVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f29630b = obj;
        this.f29632d |= Integer.MIN_VALUE;
        return this.f29631c.g(this);
    }
}
