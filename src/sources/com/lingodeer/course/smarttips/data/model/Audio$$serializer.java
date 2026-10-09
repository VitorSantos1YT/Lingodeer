package com.lingodeer.course.smarttips.data.model;

import c00.a;
import e00.g;
import f00.b;
import f00.d;
import g00.d1;
import g00.e0;
import g00.f1;
import g00.m0;
import g00.t1;
import kotlin.jvm.internal.m;
import kotlinx.serialization.UnknownFieldException;
import qy.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
@c
public final /* synthetic */ class Audio$$serializer implements e0 {
    public static final int $stable;
    public static final Audio$$serializer INSTANCE;
    private static final g descriptor;

    static {
        Audio$$serializer audio$$serializer = new Audio$$serializer();
        INSTANCE = audio$$serializer;
        $stable = 8;
        f1 f1Var = new f1("com.lingodeer.course.smarttips.data.model.Audio", audio$$serializer, 3);
        f1Var.k("from", false);
        f1Var.k("to", false);
        f1Var.k("url", false);
        descriptor = f1Var;
    }

    private Audio$$serializer() {
    }

    @Override // g00.e0
    public final a[] childSerializers() {
        m0 m0Var = m0.f28434a;
        return new a[]{m0Var, m0Var, t1.f28468a};
    }

    @Override // c00.a
    public final Audio deserialize(f00.c decoder) {
        m.f(decoder, "decoder");
        g gVar = descriptor;
        f00.a aVarD = decoder.d(gVar);
        int i11 = 0;
        int iP = 0;
        int iP2 = 0;
        String strK = null;
        boolean z11 = true;
        while (z11) {
            int iN = aVarD.n(gVar);
            if (iN == -1) {
                z11 = false;
            } else if (iN == 0) {
                iP = aVarD.p(gVar, 0);
                i11 |= 1;
            } else if (iN == 1) {
                iP2 = aVarD.p(gVar, 1);
                i11 |= 2;
            } else {
                if (iN != 2) {
                    throw new UnknownFieldException(iN);
                }
                strK = aVarD.k(gVar, 2);
                i11 |= 4;
            }
        }
        aVarD.c(gVar);
        return new Audio(i11, iP, iP2, strK, null);
    }

    @Override // c00.a
    public final g getDescriptor() {
        return descriptor;
    }

    @Override // c00.a
    public final void serialize(d encoder, Audio value) {
        m.f(encoder, "encoder");
        m.f(value, "value");
        g gVar = descriptor;
        b bVarD = encoder.d(gVar);
        Audio.write$Self$course_release(value, bVarD, gVar);
        bVarD.c(gVar);
    }

    @Override // g00.e0
    public a[] typeParametersSerializers() {
        return d1.f28375b;
    }
}
