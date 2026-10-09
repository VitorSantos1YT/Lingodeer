package com.lingodeer.data.model.speech;

import bw.ORXQ.ADSb;
import c00.a;
import e00.g;
import f00.b;
import f00.d;
import g00.d1;
import g00.e0;
import g00.f1;
import g00.m0;
import g00.r0;
import g00.t1;
import g00.v;
import java.util.List;
import kotlin.jvm.internal.m;
import kotlinx.serialization.UnknownFieldException;
import okhttp3.internal.platform.ZjS.OYAvlbfUyD;
import qy.c;
import qy.h;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
@c
public final /* synthetic */ class SpeechRecognitionResult$$serializer implements e0 {
    public static final SpeechRecognitionResult$$serializer INSTANCE;
    private static final g descriptor;

    private SpeechRecognitionResult$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // g00.e0
    public final a[] childSerializers() {
        h[] hVarArr = SpeechRecognitionResult.$childSerializers;
        t1 t1Var = t1.f28468a;
        r0 r0Var = r0.f28455a;
        return new a[]{t1Var, t1Var, r0Var, r0Var, m0.f28434a, t1Var, v.f28479a, hVarArr[7].getValue()};
    }

    @Override // c00.a
    public final SpeechRecognitionResult deserialize(f00.c decoder) {
        m.f(decoder, "decoder");
        g gVar = descriptor;
        f00.a aVarD = decoder.d(gVar);
        h[] hVarArr = SpeechRecognitionResult.$childSerializers;
        List list = null;
        int i11 = 0;
        int iP = 0;
        String strK = null;
        String strK2 = null;
        String strK3 = null;
        long jD = 0;
        long jD2 = 0;
        double dE = 0.0d;
        boolean z11 = true;
        while (z11) {
            int iN = aVarD.n(gVar);
            switch (iN) {
                case -1:
                    z11 = false;
                    break;
                case 0:
                    strK = aVarD.k(gVar, 0);
                    i11 |= 1;
                    break;
                case 1:
                    strK2 = aVarD.k(gVar, 1);
                    i11 |= 2;
                    break;
                case 2:
                    jD = aVarD.D(gVar, 2);
                    i11 |= 4;
                    break;
                case 3:
                    jD2 = aVarD.D(gVar, 3);
                    i11 |= 8;
                    break;
                case 4:
                    iP = aVarD.p(gVar, 4);
                    i11 |= 16;
                    break;
                case 5:
                    strK3 = aVarD.k(gVar, 5);
                    i11 |= 32;
                    break;
                case 6:
                    dE = aVarD.e(gVar, 6);
                    i11 |= 64;
                    break;
                case 7:
                    list = (List) aVarD.t(gVar, 7, (a) hVarArr[7].getValue(), list);
                    i11 |= 128;
                    break;
                default:
                    throw new UnknownFieldException(iN);
            }
        }
        aVarD.c(gVar);
        return new SpeechRecognitionResult(i11, strK, strK2, jD, jD2, iP, strK3, dE, list, null);
    }

    @Override // c00.a
    public final g getDescriptor() {
        return descriptor;
    }

    @Override // c00.a
    public final void serialize(d encoder, SpeechRecognitionResult value) {
        m.f(encoder, "encoder");
        m.f(value, "value");
        g gVar = descriptor;
        b bVarD = encoder.d(gVar);
        SpeechRecognitionResult.write$Self$data_release(value, bVarD, gVar);
        bVarD.c(gVar);
    }

    @Override // g00.e0
    public a[] typeParametersSerializers() {
        return d1.f28375b;
    }

    static {
        SpeechRecognitionResult$$serializer speechRecognitionResult$$serializer = new SpeechRecognitionResult$$serializer();
        INSTANCE = speechRecognitionResult$$serializer;
        f1 f1Var = new f1("com.lingodeer.data.model.speech.SpeechRecognitionResult", speechRecognitionResult$$serializer, 8);
        f1Var.k("Id", false);
        f1Var.k("RecognitionStatus", false);
        f1Var.k("Offset", false);
        f1Var.k(OYAvlbfUyD.lTSFbNEsloS, false);
        f1Var.k("Channel", false);
        f1Var.k("DisplayText", false);
        f1Var.k("SNR", false);
        f1Var.k(ADSb.SweJdBuTVDzQ, false);
        descriptor = f1Var;
    }
}
