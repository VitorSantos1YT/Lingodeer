package com.google.firebase.sessions;

import dt.Xk.wuoM;
import e00.g;
import f00.d;
import g00.d1;
import g00.e0;
import g00.f1;
import g00.m0;
import g00.r0;
import g00.t1;
import kotlin.jvm.internal.m;
import kotlinx.serialization.UnknownFieldException;
import qy.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@c
public /* synthetic */ class SessionDetails$$serializer implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SessionDetails$$serializer f20939a;
    private static final g descriptor;

    private SessionDetails$$serializer() {
    }

    @Override // g00.e0
    public final c00.a[] childSerializers() {
        t1 t1Var = t1.f28468a;
        return new c00.a[]{t1Var, t1Var, m0.f28434a, r0.f28455a};
    }

    @Override // c00.a
    public final Object deserialize(f00.c cVar) {
        g gVar = descriptor;
        f00.a aVarD = cVar.d(gVar);
        int i11 = 0;
        int iP = 0;
        String strK = null;
        String strK2 = null;
        long jD = 0;
        boolean z11 = true;
        while (z11) {
            int iN = aVarD.n(gVar);
            if (iN == -1) {
                z11 = false;
            } else if (iN == 0) {
                strK = aVarD.k(gVar, 0);
                i11 |= 1;
            } else if (iN == 1) {
                strK2 = aVarD.k(gVar, 1);
                i11 |= 2;
            } else if (iN == 2) {
                iP = aVarD.p(gVar, 2);
                i11 |= 4;
            } else {
                if (iN != 3) {
                    throw new UnknownFieldException(iN);
                }
                jD = aVarD.D(gVar, 3);
                i11 |= 8;
            }
        }
        aVarD.c(gVar);
        return new SessionDetails(jD, strK, strK2, i11, iP);
    }

    @Override // c00.a
    public final g getDescriptor() {
        return descriptor;
    }

    @Override // c00.a
    public final void serialize(d dVar, Object obj) {
        SessionDetails value = (SessionDetails) obj;
        m.f(value, "value");
        g gVar = descriptor;
        f00.b bVarD = dVar.d(gVar);
        bVarD.w(gVar, 0, value.f20935a);
        bVarD.w(gVar, 1, value.f20936b);
        bVarD.g(2, value.f20937c, gVar);
        bVarD.v(gVar, 3, value.f20938d);
        bVarD.c(gVar);
    }

    @Override // g00.e0
    public final c00.a[] typeParametersSerializers() {
        return d1.f28375b;
    }

    static {
        SessionDetails$$serializer sessionDetails$$serializer = new SessionDetails$$serializer();
        f20939a = sessionDetails$$serializer;
        f1 f1Var = new f1("com.google.firebase.sessions.SessionDetails", sessionDetails$$serializer, 4);
        f1Var.k("sessionId", false);
        f1Var.k(wuoM.yceMOPVkSb, false);
        f1Var.k("sessionIndex", false);
        f1Var.k("sessionStartTimestampUs", false);
        descriptor = f1Var;
    }
}
