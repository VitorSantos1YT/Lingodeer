package rl;

import com.google.gson.reflect.TypeToken;
import javax.crypto.SecretKey;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class g extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SecretKey f49277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SecretKey f49278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TypeToken f49279c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f49280d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h f49281e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f49282f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, xy.c cVar) {
        super(cVar);
        this.f49281e = hVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f49280d = obj;
        this.f49282f |= Integer.MIN_VALUE;
        return this.f49281e.g(null, null, null, null, this);
    }
}
