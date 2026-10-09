package dv;

import com.google.gson.reflect.TypeToken;
import javax.crypto.SecretKey;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class t0 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SecretKey f24514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SecretKey f24515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TypeToken f24516c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f24517d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f24518e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u0 f24519f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f24520t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(u0 u0Var, vy.d dVar) {
        super(dVar);
        this.f24519f = u0Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f24518e = obj;
        this.f24520t |= Integer.MIN_VALUE;
        return this.f24519f.v(null, null, null, null, null, this);
    }
}
