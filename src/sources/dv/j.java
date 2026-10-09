package dv;

import com.google.gson.reflect.TypeToken;
import javax.crypto.SecretKey;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class j extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SecretKey f24463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SecretKey f24464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TypeToken f24465c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f24466d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l f24467e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f24468f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l lVar, xy.c cVar) {
        super(cVar);
        this.f24467e = lVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f24466d = obj;
        this.f24468f |= Integer.MIN_VALUE;
        return this.f24467e.a(null, null, null, null, this);
    }
}
