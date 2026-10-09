package ot;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wt.o0 f45986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vt.n0 f45987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wt.b0 f45988c;

    public s1(wt.o0 userInfoUseCase, vt.n0 envRepository, wt.b0 srsUseCase) {
        kotlin.jvm.internal.m.f(userInfoUseCase, "userInfoUseCase");
        kotlin.jvm.internal.m.f(envRepository, "envRepository");
        kotlin.jvm.internal.m.f(srsUseCase, "srsUseCase");
        this.f45986a = userInfoUseCase;
        this.f45987b = envRepository;
        this.f45988c = srsUseCase;
    }

    public final Object a(int i11, long j11, int i12, long j12, boolean z11, boolean z12, LinkedHashMap linkedHashMap, xy.c cVar) {
        yz.f fVar = rz.o0.f50940a;
        Object objM = rz.e0.M(yz.e.f58387a, new q1(i11, j11, i12, j12, z11, this, z12, linkedHashMap, null), cVar);
        return objM == wy.a.COROUTINE_SUSPENDED ? objM : qy.b0.f48488a;
    }
}
