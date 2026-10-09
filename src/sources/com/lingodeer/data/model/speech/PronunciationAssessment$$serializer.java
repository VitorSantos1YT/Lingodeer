package com.lingodeer.data.model.speech;

import c00.a;
import com.google.firebase.iid.QyE.SemtNwfPgIhi;
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
public final /* synthetic */ class PronunciationAssessment$$serializer implements e0 {
    public static final PronunciationAssessment$$serializer INSTANCE;
    private static final g descriptor;

    static {
        PronunciationAssessment$$serializer pronunciationAssessment$$serializer = new PronunciationAssessment$$serializer();
        INSTANCE = pronunciationAssessment$$serializer;
        f1 f1Var = new f1("com.lingodeer.data.model.speech.PronunciationAssessment", pronunciationAssessment$$serializer, 4);
        f1Var.k("AccuracyScore", false);
        f1Var.k("FluencyScore", false);
        f1Var.k("CompletenessScore", false);
        f1Var.k("PronScore", false);
        descriptor = f1Var;
    }

    private PronunciationAssessment$$serializer() {
    }

    @Override // g00.e0
    public final a[] childSerializers() {
        v vVar = v.f28479a;
        return new a[]{vVar, vVar, vVar, vVar};
    }

    @Override // c00.a
    public final PronunciationAssessment deserialize(f00.c decoder) {
        m.f(decoder, "decoder");
        g gVar = descriptor;
        f00.a aVarD = decoder.d(gVar);
        int i11 = 0;
        double dE = 0.0d;
        double dE2 = 0.0d;
        double dE3 = 0.0d;
        double dE4 = 0.0d;
        boolean z11 = true;
        while (z11) {
            int iN = aVarD.n(gVar);
            if (iN == -1) {
                z11 = false;
            } else if (iN == 0) {
                dE = aVarD.e(gVar, 0);
                i11 |= 1;
            } else if (iN == 1) {
                dE2 = aVarD.e(gVar, 1);
                i11 |= 2;
            } else if (iN == 2) {
                dE3 = aVarD.e(gVar, 2);
                i11 |= 4;
            } else {
                if (iN != 3) {
                    throw new UnknownFieldException(iN);
                }
                dE4 = aVarD.e(gVar, 3);
                i11 |= 8;
            }
        }
        aVarD.c(gVar);
        return new PronunciationAssessment(i11, dE, dE2, dE3, dE4, null);
    }

    @Override // c00.a
    public final g getDescriptor() {
        return descriptor;
    }

    @Override // c00.a
    public final void serialize(d dVar, PronunciationAssessment value) {
        m.f(dVar, SemtNwfPgIhi.JtjmRQ);
        m.f(value, "value");
        g gVar = descriptor;
        b bVarD = dVar.d(gVar);
        PronunciationAssessment.write$Self$data_release(value, bVarD, gVar);
        bVarD.c(gVar);
    }

    @Override // g00.e0
    public a[] typeParametersSerializers() {
        return d1.f28375b;
    }
}
