package com.lingodeer.data.model.speech;

import c00.a;
import e00.g;
import f00.b;
import f00.d;
import g00.d1;
import g00.e0;
import g00.f1;
import g00.v;
import kotlin.jvm.internal.m;
import kotlinx.serialization.UnknownFieldException;
import qy.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
@c
public final /* synthetic */ class PhonemePronunciationAssessment$$serializer implements e0 {
    public static final PhonemePronunciationAssessment$$serializer INSTANCE;
    private static final g descriptor;

    static {
        PhonemePronunciationAssessment$$serializer phonemePronunciationAssessment$$serializer = new PhonemePronunciationAssessment$$serializer();
        INSTANCE = phonemePronunciationAssessment$$serializer;
        f1 f1Var = new f1("com.lingodeer.data.model.speech.PhonemePronunciationAssessment", phonemePronunciationAssessment$$serializer, 1);
        f1Var.k("AccuracyScore", false);
        descriptor = f1Var;
    }

    private PhonemePronunciationAssessment$$serializer() {
    }

    @Override // g00.e0
    public final a[] childSerializers() {
        return new a[]{v.f28479a};
    }

    @Override // c00.a
    public final PhonemePronunciationAssessment deserialize(f00.c decoder) {
        m.f(decoder, "decoder");
        g gVar = descriptor;
        f00.a aVarD = decoder.d(gVar);
        double dE = 0.0d;
        boolean z11 = true;
        int i11 = 0;
        while (z11) {
            int iN = aVarD.n(gVar);
            if (iN == -1) {
                z11 = false;
            } else {
                if (iN != 0) {
                    throw new UnknownFieldException(iN);
                }
                dE = aVarD.e(gVar, 0);
                i11 = 1;
            }
        }
        aVarD.c(gVar);
        return new PhonemePronunciationAssessment(i11, dE, null);
    }

    @Override // c00.a
    public final g getDescriptor() {
        return descriptor;
    }

    @Override // c00.a
    public final void serialize(d encoder, PhonemePronunciationAssessment value) {
        m.f(encoder, "encoder");
        m.f(value, "value");
        g gVar = descriptor;
        b bVarD = encoder.d(gVar);
        bVarD.q(gVar, 0, value.AccuracyScore);
        bVarD.c(gVar);
    }

    @Override // g00.e0
    public a[] typeParametersSerializers() {
        return d1.f28375b;
    }
}
