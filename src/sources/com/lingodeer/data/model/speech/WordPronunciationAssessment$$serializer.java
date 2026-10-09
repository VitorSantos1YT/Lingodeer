package com.lingodeer.data.model.speech;

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
public final /* synthetic */ class WordPronunciationAssessment$$serializer implements e0 {
    public static final WordPronunciationAssessment$$serializer INSTANCE;
    private static final g descriptor;

    static {
        WordPronunciationAssessment$$serializer wordPronunciationAssessment$$serializer = new WordPronunciationAssessment$$serializer();
        INSTANCE = wordPronunciationAssessment$$serializer;
        f1 f1Var = new f1("com.lingodeer.data.model.speech.WordPronunciationAssessment", wordPronunciationAssessment$$serializer, 2);
        f1Var.k("AccuracyScore", false);
        f1Var.k("ErrorType", false);
        descriptor = f1Var;
    }

    private WordPronunciationAssessment$$serializer() {
    }

    @Override // g00.e0
    public final a[] childSerializers() {
        return new a[]{v.f28479a, t1.f28468a};
    }

    @Override // c00.a
    public final WordPronunciationAssessment deserialize(f00.c decoder) {
        m.f(decoder, "decoder");
        g gVar = descriptor;
        f00.a aVarD = decoder.d(gVar);
        int i11 = 0;
        double dE = 0.0d;
        String strK = null;
        boolean z11 = true;
        while (z11) {
            int iN = aVarD.n(gVar);
            if (iN == -1) {
                z11 = false;
            } else if (iN == 0) {
                dE = aVarD.e(gVar, 0);
                i11 |= 1;
            } else {
                if (iN != 1) {
                    throw new UnknownFieldException(iN);
                }
                strK = aVarD.k(gVar, 1);
                i11 |= 2;
            }
        }
        aVarD.c(gVar);
        return new WordPronunciationAssessment(i11, dE, strK, null);
    }

    @Override // c00.a
    public final g getDescriptor() {
        return descriptor;
    }

    @Override // c00.a
    public final void serialize(d encoder, WordPronunciationAssessment value) {
        m.f(encoder, "encoder");
        m.f(value, "value");
        g gVar = descriptor;
        b bVarD = encoder.d(gVar);
        WordPronunciationAssessment.write$Self$data_release(value, bVarD, gVar);
        bVarD.c(gVar);
    }

    @Override // g00.e0
    public a[] typeParametersSerializers() {
        return d1.f28375b;
    }
}
