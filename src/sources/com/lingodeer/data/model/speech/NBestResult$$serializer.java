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
import java.util.List;
import kotlin.jvm.internal.m;
import kotlinx.serialization.UnknownFieldException;
import qy.c;
import qy.h;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
@c
public final /* synthetic */ class NBestResult$$serializer implements e0 {
    public static final NBestResult$$serializer INSTANCE;
    private static final g descriptor;

    static {
        NBestResult$$serializer nBestResult$$serializer = new NBestResult$$serializer();
        INSTANCE = nBestResult$$serializer;
        f1 f1Var = new f1("com.lingodeer.data.model.speech.NBestResult", nBestResult$$serializer, 7);
        f1Var.k("Confidence", false);
        f1Var.k("Lexical", false);
        f1Var.k("ITN", false);
        f1Var.k("MaskedITN", false);
        f1Var.k("Display", false);
        f1Var.k("PronunciationAssessment", false);
        f1Var.k("Words", false);
        descriptor = f1Var;
    }

    private NBestResult$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // g00.e0
    public final a[] childSerializers() {
        h[] hVarArr = NBestResult.$childSerializers;
        t1 t1Var = t1.f28468a;
        return new a[]{v.f28479a, t1Var, t1Var, t1Var, t1Var, PronunciationAssessment$$serializer.INSTANCE, hVarArr[6].getValue()};
    }

    @Override // c00.a
    public final NBestResult deserialize(f00.c decoder) {
        m.f(decoder, "decoder");
        g gVar = descriptor;
        f00.a aVarD = decoder.d(gVar);
        h[] hVarArr = NBestResult.$childSerializers;
        PronunciationAssessment pronunciationAssessment = null;
        double dE = 0.0d;
        List list = null;
        String strK = null;
        String strK2 = null;
        String strK3 = null;
        String strK4 = null;
        int i11 = 0;
        boolean z11 = true;
        while (z11) {
            int iN = aVarD.n(gVar);
            switch (iN) {
                case -1:
                    z11 = false;
                    break;
                case 0:
                    dE = aVarD.e(gVar, 0);
                    i11 |= 1;
                    break;
                case 1:
                    strK = aVarD.k(gVar, 1);
                    i11 |= 2;
                    break;
                case 2:
                    strK2 = aVarD.k(gVar, 2);
                    i11 |= 4;
                    break;
                case 3:
                    strK3 = aVarD.k(gVar, 3);
                    i11 |= 8;
                    break;
                case 4:
                    strK4 = aVarD.k(gVar, 4);
                    i11 |= 16;
                    break;
                case 5:
                    pronunciationAssessment = (PronunciationAssessment) aVarD.t(gVar, 5, PronunciationAssessment$$serializer.INSTANCE, pronunciationAssessment);
                    i11 |= 32;
                    break;
                case 6:
                    list = (List) aVarD.t(gVar, 6, (a) hVarArr[6].getValue(), list);
                    i11 |= 64;
                    break;
                default:
                    throw new UnknownFieldException(iN);
            }
        }
        aVarD.c(gVar);
        return new NBestResult(i11, dE, strK, strK2, strK3, strK4, pronunciationAssessment, list, null);
    }

    @Override // c00.a
    public final g getDescriptor() {
        return descriptor;
    }

    @Override // c00.a
    public final void serialize(d encoder, NBestResult value) {
        m.f(encoder, "encoder");
        m.f(value, "value");
        g gVar = descriptor;
        b bVarD = encoder.d(gVar);
        NBestResult.write$Self$data_release(value, bVarD, gVar);
        bVarD.c(gVar);
    }

    @Override // g00.e0
    public a[] typeParametersSerializers() {
        return d1.f28375b;
    }
}
