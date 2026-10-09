package com.google.firebase.sessions.settings;

import c00.a;
import e00.g;
import f00.d;
import g00.d1;
import g00.e0;
import g00.f1;
import g00.m0;
import g00.r0;
import g00.v;
import kotlin.jvm.internal.m;
import kotlinx.serialization.UnknownFieldException;
import qx.b;
import qy.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@c
public /* synthetic */ class SessionConfigs$$serializer implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SessionConfigs$$serializer f21089a;
    private static final g descriptor;

    static {
        SessionConfigs$$serializer sessionConfigs$$serializer = new SessionConfigs$$serializer();
        f21089a = sessionConfigs$$serializer;
        f1 f1Var = new f1("com.google.firebase.sessions.settings.SessionConfigs", sessionConfigs$$serializer, 5);
        f1Var.k("sessionsEnabled", false);
        f1Var.k("sessionSamplingRate", false);
        f1Var.k("sessionTimeoutSeconds", false);
        f1Var.k("cacheDurationSeconds", false);
        f1Var.k("cacheUpdatedTimeSeconds", false);
        descriptor = f1Var;
    }

    private SessionConfigs$$serializer() {
    }

    @Override // g00.e0
    public final a[] childSerializers() {
        a aVarS = b.s(g00.g.f28401a);
        a aVarS2 = b.s(v.f28479a);
        m0 m0Var = m0.f28434a;
        return new a[]{aVarS, aVarS2, b.s(m0Var), b.s(m0Var), b.s(r0.f28455a)};
    }

    @Override // c00.a
    public final Object deserialize(f00.c cVar) {
        g gVar = descriptor;
        f00.a aVarD = cVar.d(gVar);
        int i11 = 0;
        Boolean bool = null;
        Double d5 = null;
        Integer num = null;
        Integer num2 = null;
        Long l9 = null;
        boolean z11 = true;
        while (z11) {
            int iN = aVarD.n(gVar);
            if (iN == -1) {
                z11 = false;
            } else if (iN == 0) {
                bool = (Boolean) aVarD.s(gVar, 0, g00.g.f28401a, bool);
                i11 |= 1;
            } else if (iN == 1) {
                d5 = (Double) aVarD.s(gVar, 1, v.f28479a, d5);
                i11 |= 2;
            } else if (iN == 2) {
                num = (Integer) aVarD.s(gVar, 2, m0.f28434a, num);
                i11 |= 4;
            } else if (iN == 3) {
                num2 = (Integer) aVarD.s(gVar, 3, m0.f28434a, num2);
                i11 |= 8;
            } else {
                if (iN != 4) {
                    throw new UnknownFieldException(iN);
                }
                l9 = (Long) aVarD.s(gVar, 4, r0.f28455a, l9);
                i11 |= 16;
            }
        }
        aVarD.c(gVar);
        return new SessionConfigs(i11, bool, d5, num, num2, l9);
    }

    @Override // c00.a
    public final g getDescriptor() {
        return descriptor;
    }

    @Override // c00.a
    public final void serialize(d dVar, Object obj) {
        SessionConfigs value = (SessionConfigs) obj;
        m.f(value, "value");
        g gVar = descriptor;
        f00.b bVarD = dVar.d(gVar);
        SessionConfigs.Companion companion = SessionConfigs.Companion;
        bVarD.x(gVar, 0, g00.g.f28401a, value.f21084a);
        bVarD.x(gVar, 1, v.f28479a, value.f21085b);
        m0 m0Var = m0.f28434a;
        bVarD.x(gVar, 2, m0Var, value.f21086c);
        bVarD.x(gVar, 3, m0Var, value.f21087d);
        bVarD.x(gVar, 4, r0.f28455a, value.f21088e);
        bVarD.c(gVar);
    }

    @Override // g00.e0
    public final a[] typeParametersSerializers() {
        return d1.f28375b;
    }
}
