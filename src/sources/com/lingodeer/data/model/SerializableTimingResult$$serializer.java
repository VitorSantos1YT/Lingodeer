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
import java.util.List;
import kotlin.jvm.internal.m;
import kotlinx.serialization.UnknownFieldException;
import qy.c;
import qy.h;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
@c
public final /* synthetic */ class SerializableTimingResult$$serializer implements e0 {
    public static final SerializableTimingResult$$serializer INSTANCE;
    private static final g descriptor;

    static {
        SerializableTimingResult$$serializer serializableTimingResult$$serializer = new SerializableTimingResult$$serializer();
        INSTANCE = serializableTimingResult$$serializer;
        f1 f1Var = new f1("com.lingodeer.data.model.SerializableTimingResult", serializableTimingResult$$serializer, 5);
        f1Var.k("word", false);
        f1Var.k("accuracyScore", false);
        f1Var.k("errorType", false);
        f1Var.k("phonemes", false);
        f1Var.k("syllables", false);
        descriptor = f1Var;
    }

    private SerializableTimingResult$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // g00.e0
    public final a[] childSerializers() {
        h[] hVarArr = SerializableTimingResult.$childSerializers;
        t1 t1Var = t1.f28468a;
        return new a[]{t1Var, v.f28479a, t1Var, hVarArr[3].getValue(), hVarArr[4].getValue()};
    }

    @Override // c00.a
    public final SerializableTimingResult deserialize(f00.c decoder) {
        m.f(decoder, "decoder");
        g gVar = descriptor;
        f00.a aVarD = decoder.d(gVar);
        h[] hVarArr = SerializableTimingResult.$childSerializers;
        int i11 = 0;
        String strK = null;
        String strK2 = null;
        List list = null;
        List list2 = null;
        double dE = 0.0d;
        boolean z11 = true;
        while (z11) {
            int iN = aVarD.n(gVar);
            if (iN == -1) {
                z11 = false;
            } else if (iN == 0) {
                strK = aVarD.k(gVar, 0);
                i11 |= 1;
            } else if (iN == 1) {
                dE = aVarD.e(gVar, 1);
                i11 |= 2;
            } else if (iN == 2) {
                strK2 = aVarD.k(gVar, 2);
                i11 |= 4;
            } else if (iN == 3) {
                list = (List) aVarD.t(gVar, 3, (a) hVarArr[3].getValue(), list);
                i11 |= 8;
            } else {
                if (iN != 4) {
                    throw new UnknownFieldException(iN);
                }
                list2 = (List) aVarD.t(gVar, 4, (a) hVarArr[4].getValue(), list2);
                i11 |= 16;
            }
        }
        aVarD.c(gVar);
        return new SerializableTimingResult(i11, strK, dE, strK2, list, list2, null);
    }

    @Override // c00.a
    public final g getDescriptor() {
        return descriptor;
    }

    @Override // c00.a
    public final void serialize(d encoder, SerializableTimingResult value) {
        m.f(encoder, "encoder");
        m.f(value, "value");
        g gVar = descriptor;
        b bVarD = encoder.d(gVar);
        SerializableTimingResult.write$Self$data_release(value, bVarD, gVar);
        bVarD.c(gVar);
    }

    @Override // g00.e0
    public a[] typeParametersSerializers() {
        return d1.f28375b;
    }
}
