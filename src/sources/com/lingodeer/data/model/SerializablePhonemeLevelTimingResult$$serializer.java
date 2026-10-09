package com.lingodeer.data.model;

import c00.a;
import e00.g;
import f00.b;
import f00.d;
import g00.d1;
import g00.e0;
import g00.f1;
import g00.t1;
import g00.v;
import kotlin.jvm.internal.m;
import kotlinx.serialization.UnknownFieldException;
import qy.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
@c
public final /* synthetic */ class SerializablePhonemeLevelTimingResult$$serializer implements e0 {
    public static final SerializablePhonemeLevelTimingResult$$serializer INSTANCE;
    private static final g descriptor;

    static {
        SerializablePhonemeLevelTimingResult$$serializer serializablePhonemeLevelTimingResult$$serializer = new SerializablePhonemeLevelTimingResult$$serializer();
        INSTANCE = serializablePhonemeLevelTimingResult$$serializer;
        f1 f1Var = new f1("com.lingodeer.data.model.SerializablePhonemeLevelTimingResult", serializablePhonemeLevelTimingResult$$serializer, 2);
        f1Var.k("phoneme", false);
        f1Var.k("accuracyScore", false);
        descriptor = f1Var;
    }

    private SerializablePhonemeLevelTimingResult$$serializer() {
    }

    @Override // g00.e0
    public final a[] childSerializers() {
        return new a[]{t1.f28468a, v.f28479a};
    }

    @Override // c00.a
    public final SerializablePhonemeLevelTimingResult deserialize(f00.c decoder) {
        m.f(decoder, "decoder");
        g gVar = descriptor;
        f00.a aVarD = decoder.d(gVar);
        int i11 = 0;
        String strK = null;
        double dE = 0.0d;
        boolean z11 = true;
        while (z11) {
            int iN = aVarD.n(gVar);
            if (iN == -1) {
                z11 = false;
            } else if (iN == 0) {
                strK = aVarD.k(gVar, 0);
                i11 |= 1;
            } else {
                if (iN != 1) {
                    throw new UnknownFieldException(iN);
                }
                dE = aVarD.e(gVar, 1);
                i11 |= 2;
            }
        }
        aVarD.c(gVar);
        return new SerializablePhonemeLevelTimingResult(i11, strK, dE, null);
    }

    @Override // c00.a
    public final g getDescriptor() {
        return descriptor;
    }

    @Override // c00.a
    public final void serialize(d encoder, SerializablePhonemeLevelTimingResult value) {
        m.f(encoder, "encoder");
        m.f(value, "value");
        g gVar = descriptor;
        b bVarD = encoder.d(gVar);
        SerializablePhonemeLevelTimingResult.write$Self$data_release(value, bVarD, gVar);
        bVarD.c(gVar);
    }

    @Override // g00.e0
    public a[] typeParametersSerializers() {
        return d1.f28375b;
    }
}
