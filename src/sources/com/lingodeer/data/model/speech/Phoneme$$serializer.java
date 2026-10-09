package com.lingodeer.data.model.speech;

import c00.a;
import e00.g;
import f00.b;
import f00.d;
import g00.d1;
import g00.e0;
import g00.f1;
import g00.r0;
import g00.t1;
import kotlin.jvm.internal.m;
import kotlinx.serialization.UnknownFieldException;
import qy.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
@c
public final /* synthetic */ class Phoneme$$serializer implements e0 {
    public static final Phoneme$$serializer INSTANCE;
    private static final g descriptor;

    static {
        Phoneme$$serializer phoneme$$serializer = new Phoneme$$serializer();
        INSTANCE = phoneme$$serializer;
        f1 f1Var = new f1("com.lingodeer.data.model.speech.Phoneme", phoneme$$serializer, 4);
        f1Var.k("Phoneme", false);
        f1Var.k("PronunciationAssessment", false);
        f1Var.k("Offset", false);
        f1Var.k("Duration", false);
        descriptor = f1Var;
    }

    private Phoneme$$serializer() {
    }

    @Override // g00.e0
    public final a[] childSerializers() {
        r0 r0Var = r0.f28455a;
        return new a[]{t1.f28468a, PhonemePronunciationAssessment$$serializer.INSTANCE, r0Var, r0Var};
    }

    @Override // c00.a
    public final Phoneme deserialize(f00.c decoder) {
        m.f(decoder, "decoder");
        g gVar = descriptor;
        f00.a aVarD = decoder.d(gVar);
        int i11 = 0;
        String strK = null;
        PhonemePronunciationAssessment phonemePronunciationAssessment = null;
        long jD = 0;
        long jD2 = 0;
        boolean z11 = true;
        while (z11) {
            int iN = aVarD.n(gVar);
            if (iN == -1) {
                z11 = false;
            } else if (iN == 0) {
                strK = aVarD.k(gVar, 0);
                i11 |= 1;
            } else if (iN == 1) {
                phonemePronunciationAssessment = (PhonemePronunciationAssessment) aVarD.t(gVar, 1, PhonemePronunciationAssessment$$serializer.INSTANCE, phonemePronunciationAssessment);
                i11 |= 2;
            } else if (iN == 2) {
                jD = aVarD.D(gVar, 2);
                i11 |= 4;
            } else {
                if (iN != 3) {
                    throw new UnknownFieldException(iN);
                }
                jD2 = aVarD.D(gVar, 3);
                i11 |= 8;
            }
        }
        aVarD.c(gVar);
        return new Phoneme(i11, strK, phonemePronunciationAssessment, jD, jD2, null);
    }

    @Override // c00.a
    public final g getDescriptor() {
        return descriptor;
    }

    @Override // c00.a
    public final void serialize(d encoder, Phoneme value) {
        m.f(encoder, "encoder");
        m.f(value, "value");
        g gVar = descriptor;
        b bVarD = encoder.d(gVar);
        Phoneme.write$Self$data_release(value, bVarD, gVar);
        bVarD.c(gVar);
    }

    @Override // g00.e0
    public a[] typeParametersSerializers() {
        return d1.f28375b;
    }
}
