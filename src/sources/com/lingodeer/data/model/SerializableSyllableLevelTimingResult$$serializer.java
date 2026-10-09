package com.lingodeer.data.model;

import androidx.lifecycle.livedata.HeRS.DytezVyM;
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
public final /* synthetic */ class SerializableSyllableLevelTimingResult$$serializer implements e0 {
    public static final SerializableSyllableLevelTimingResult$$serializer INSTANCE;
    private static final g descriptor;

    private SerializableSyllableLevelTimingResult$$serializer() {
    }

    @Override // g00.e0
    public final a[] childSerializers() {
        t1 t1Var = t1.f28468a;
        return new a[]{t1Var, v.f28479a, t1Var};
    }

    @Override // c00.a
    public final SerializableSyllableLevelTimingResult deserialize(f00.c decoder) {
        m.f(decoder, "decoder");
        g gVar = descriptor;
        f00.a aVarD = decoder.d(gVar);
        int i11 = 0;
        String strK = null;
        String strK2 = null;
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
            } else {
                if (iN != 2) {
                    throw new UnknownFieldException(iN);
                }
                strK2 = aVarD.k(gVar, 2);
                i11 |= 4;
            }
        }
        aVarD.c(gVar);
        return new SerializableSyllableLevelTimingResult(i11, strK, dE, strK2, null);
    }

    @Override // c00.a
    public final g getDescriptor() {
        return descriptor;
    }

    @Override // c00.a
    public final void serialize(d encoder, SerializableSyllableLevelTimingResult value) {
        m.f(encoder, "encoder");
        m.f(value, "value");
        g gVar = descriptor;
        b bVarD = encoder.d(gVar);
        SerializableSyllableLevelTimingResult.write$Self$data_release(value, bVarD, gVar);
        bVarD.c(gVar);
    }

    @Override // g00.e0
    public a[] typeParametersSerializers() {
        return d1.f28375b;
    }

    static {
        SerializableSyllableLevelTimingResult$$serializer serializableSyllableLevelTimingResult$$serializer = new SerializableSyllableLevelTimingResult$$serializer();
        INSTANCE = serializableSyllableLevelTimingResult$$serializer;
        f1 f1Var = new f1("com.lingodeer.data.model.SerializableSyllableLevelTimingResult", serializableSyllableLevelTimingResult$$serializer, 3);
        f1Var.k("syllable", false);
        f1Var.k(DytezVyM.BifVTTppHmtUjwv, false);
        f1Var.k("grapheme", false);
        descriptor = f1Var;
    }
}
