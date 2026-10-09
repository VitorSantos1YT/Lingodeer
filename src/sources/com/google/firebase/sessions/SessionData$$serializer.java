package com.google.firebase.sessions;

import e00.g;
import f00.d;
import g00.d1;
import g00.e0;
import g00.f1;
import java.util.Map;
import kotlin.jvm.internal.m;
import kotlinx.serialization.UnknownFieldException;
import qy.c;
import qy.h;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@c
public /* synthetic */ class SessionData$$serializer implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SessionData$$serializer f20932a;
    private static final g descriptor;

    static {
        SessionData$$serializer sessionData$$serializer = new SessionData$$serializer();
        f20932a = sessionData$$serializer;
        f1 f1Var = new f1("com.google.firebase.sessions.SessionData", sessionData$$serializer, 3);
        f1Var.k("sessionDetails", false);
        f1Var.k("backgroundTime", true);
        f1Var.k("processDataMap", true);
        descriptor = f1Var;
    }

    private SessionData$$serializer() {
    }

    @Override // g00.e0
    public final c00.a[] childSerializers() {
        return new c00.a[]{SessionDetails$$serializer.f20939a, qx.b.s(Time$$serializer.f21025a), qx.b.s((c00.a) SessionData.f20928d[2].getValue())};
    }

    @Override // c00.a
    public final Object deserialize(f00.c cVar) {
        g gVar = descriptor;
        f00.a aVarD = cVar.d(gVar);
        h[] hVarArr = SessionData.f20928d;
        SessionDetails sessionDetails = null;
        boolean z11 = true;
        int i11 = 0;
        Time time = null;
        Map map = null;
        while (z11) {
            int iN = aVarD.n(gVar);
            if (iN == -1) {
                z11 = false;
            } else if (iN == 0) {
                sessionDetails = (SessionDetails) aVarD.t(gVar, 0, SessionDetails$$serializer.f20939a, sessionDetails);
                i11 |= 1;
            } else if (iN == 1) {
                time = (Time) aVarD.s(gVar, 1, Time$$serializer.f21025a, time);
                i11 |= 2;
            } else {
                if (iN != 2) {
                    throw new UnknownFieldException(iN);
                }
                map = (Map) aVarD.s(gVar, 2, (c00.a) hVarArr[2].getValue(), map);
                i11 |= 4;
            }
        }
        aVarD.c(gVar);
        return new SessionData(i11, sessionDetails, time, map);
    }

    @Override // c00.a
    public final g getDescriptor() {
        return descriptor;
    }

    @Override // c00.a
    public final void serialize(d dVar, Object obj) {
        SessionData value = (SessionData) obj;
        m.f(value, "value");
        g gVar = descriptor;
        f00.b bVarD = dVar.d(gVar);
        h[] hVarArr = SessionData.f20928d;
        SessionDetails$$serializer sessionDetails$$serializer = SessionDetails$$serializer.f20939a;
        SessionDetails sessionDetails = value.f20929a;
        Map map = value.f20931c;
        Time time = value.f20930b;
        bVarD.A(gVar, 0, sessionDetails$$serializer, sessionDetails);
        if (bVarD.G(gVar) || time != null) {
            bVarD.x(gVar, 1, Time$$serializer.f21025a, time);
        }
        if (bVarD.G(gVar) || map != null) {
            bVarD.x(gVar, 2, (c00.a) hVarArr[2].getValue(), map);
        }
        bVarD.c(gVar);
    }

    @Override // g00.e0
    public final c00.a[] typeParametersSerializers() {
        return d1.f28375b;
    }
}
