package com.google.firebase.sessions;

import e00.g;
import f00.d;
import g00.d1;
import g00.e0;
import g00.f1;
import g00.r0;
import kotlin.jvm.internal.m;
import kotlinx.serialization.UnknownFieldException;
import qy.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@c
public /* synthetic */ class Time$$serializer implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Time$$serializer f21025a;
    private static final g descriptor;

    static {
        Time$$serializer time$$serializer = new Time$$serializer();
        f21025a = time$$serializer;
        f1 f1Var = new f1("com.google.firebase.sessions.Time", time$$serializer, 3);
        f1Var.k("ms", false);
        f1Var.k("us", true);
        f1Var.k("seconds", true);
        descriptor = f1Var;
    }

    private Time$$serializer() {
    }

    @Override // g00.e0
    public final c00.a[] childSerializers() {
        r0 r0Var = r0.f28455a;
        return new c00.a[]{r0Var, r0Var, r0Var};
    }

    @Override // c00.a
    public final Object deserialize(f00.c cVar) {
        g gVar = descriptor;
        f00.a aVarD = cVar.d(gVar);
        int i11 = 0;
        long jD = 0;
        long jD2 = 0;
        long jD3 = 0;
        boolean z11 = true;
        while (z11) {
            int iN = aVarD.n(gVar);
            if (iN == -1) {
                z11 = false;
            } else if (iN == 0) {
                jD = aVarD.D(gVar, 0);
                i11 |= 1;
            } else if (iN == 1) {
                jD2 = aVarD.D(gVar, 1);
                i11 |= 2;
            } else {
                if (iN != 2) {
                    throw new UnknownFieldException(iN);
                }
                jD3 = aVarD.D(gVar, 2);
                i11 |= 4;
            }
        }
        aVarD.c(gVar);
        return new Time(i11, jD, jD2, jD3);
    }

    @Override // c00.a
    public final g getDescriptor() {
        return descriptor;
    }

    @Override // c00.a
    public final void serialize(d dVar, Object obj) {
        Time value = (Time) obj;
        m.f(value, "value");
        g gVar = descriptor;
        f00.b bVarD = dVar.d(gVar);
        long j11 = value.f21022a;
        long j12 = value.f21024c;
        long j13 = value.f21023b;
        bVarD.v(gVar, 0, j11);
        if (bVarD.G(gVar) || j13 != ((long) 1000) * j11) {
            bVarD.v(gVar, 1, j13);
        }
        if (bVarD.G(gVar) || j12 != j11 / ((long) 1000)) {
            bVarD.v(gVar, 2, j12);
        }
        bVarD.c(gVar);
    }

    @Override // g00.e0
    public final c00.a[] typeParametersSerializers() {
        return d1.f28375b;
    }
}
