package vt;

import com.lingodeer.data.model.LastSyncTime;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class s0 implements r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final au.s0 f54285a;

    public s0(au.s0 s0Var) {
        this.f54285a = s0Var;
    }

    public final Object a(LastSyncTime lastSyncTime, xy.c cVar) {
        yz.f fVar = rz.o0.f50940a;
        Object objM = rz.e0.M(yz.e.f58387a, new sr.d(13, this, lastSyncTime, null), cVar);
        return objM == wy.a.COROUTINE_SUSPENDED ? objM : qy.b0.f48488a;
    }
}
