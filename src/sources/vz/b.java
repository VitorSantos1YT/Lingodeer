package vz;

import kotlin.jvm.internal.c0;
import qy.b0;
import rz.a2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final vy.d[] f54328a = new vy.d[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final com.android.billingclient.api.a f54329b = new com.android.billingclient.api.a("NULL", 2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final com.android.billingclient.api.a f54330c = new com.android.billingclient.api.a("UNINITIALIZED", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final com.android.billingclient.api.a f54331d = new com.android.billingclient.api.a("DONE", 2);

    public static final Object a(fz.a aVar, fz.f fVar, uz.j jVar, vy.d dVar, uz.i[] iVarArr) {
        mi.b bVar = new mi.b(aVar, fVar, jVar, null, iVarArr);
        a2 a2Var = new a2(dVar.getContext(), dVar, 1);
        Object objO = ff.h.O(a2Var, true, a2Var, bVar);
        return objO == wy.a.COROUTINE_SUSPENDED ? objO : b0.f48488a;
    }

    public static /* synthetic */ uz.i b(l lVar, vy.i iVar, int i11, tz.a aVar, int i12) {
        if ((i12 & 1) != 0) {
            iVar = vy.j.f54321a;
        }
        if ((i12 & 2) != 0) {
            i11 = -3;
        }
        if ((i12 & 4) != 0) {
            aVar = tz.a.SUSPEND;
        }
        return lVar.b(iVar, i11, aVar);
    }

    public static final Object c(vy.i iVar, Object obj, Object obj2, fz.e eVar, vy.d frame) {
        Object objInvoke;
        Object objN = wz.b.n(iVar, obj2);
        try {
            s sVar = new s(frame, iVar);
            if (eVar == null) {
                objInvoke = ue.f.F(eVar, obj, sVar);
            } else {
                c0.d(2, eVar);
                objInvoke = eVar.invoke(obj, sVar);
            }
            wz.b.g(iVar, objN);
            if (objInvoke == wy.a.COROUTINE_SUSPENDED) {
                kotlin.jvm.internal.m.f(frame, "frame");
            }
            return objInvoke;
        } catch (Throwable th2) {
            wz.b.g(iVar, objN);
            throw th2;
        }
    }
}
