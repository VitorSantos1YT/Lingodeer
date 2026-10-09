package com.lingodeer.data.model;

import c00.a;
import e00.g;
import f00.d;
import g00.d1;
import g00.e0;
import g00.f1;
import g00.o1;
import g00.t1;
import kotlin.jvm.internal.m;
import kotlinx.serialization.UnknownFieldException;
import qx.b;
import qy.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
@c
public final /* synthetic */ class WordAccuracyScoreTimingResult$$serializer implements e0 {
    public static final WordAccuracyScoreTimingResult$$serializer INSTANCE;
    private static final g descriptor;

    static {
        WordAccuracyScoreTimingResult$$serializer wordAccuracyScoreTimingResult$$serializer = new WordAccuracyScoreTimingResult$$serializer();
        INSTANCE = wordAccuracyScoreTimingResult$$serializer;
        f1 f1Var = new f1("com.lingodeer.data.model.WordAccuracyScoreTimingResult", wordAccuracyScoreTimingResult$$serializer, 2);
        f1Var.k("word", false);
        f1Var.k("timingResult", true);
        descriptor = f1Var;
    }

    private WordAccuracyScoreTimingResult$$serializer() {
    }

    @Override // g00.e0
    public final a[] childSerializers() {
        return new a[]{t1.f28468a, b.s(SerializableTimingResult$$serializer.INSTANCE)};
    }

    @Override // c00.a
    public final WordAccuracyScoreTimingResult deserialize(f00.c decoder) {
        m.f(decoder, "decoder");
        g gVar = descriptor;
        f00.a aVarD = decoder.d(gVar);
        boolean z11 = true;
        int i11 = 0;
        String strK = null;
        SerializableTimingResult serializableTimingResult = null;
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
                serializableTimingResult = (SerializableTimingResult) aVarD.s(gVar, 1, SerializableTimingResult$$serializer.INSTANCE, serializableTimingResult);
                i11 |= 2;
            }
        }
        aVarD.c(gVar);
        return new WordAccuracyScoreTimingResult(i11, strK, serializableTimingResult, (o1) null);
    }

    @Override // c00.a
    public final g getDescriptor() {
        return descriptor;
    }

    @Override // c00.a
    public final void serialize(d encoder, WordAccuracyScoreTimingResult value) {
        m.f(encoder, "encoder");
        m.f(value, "value");
        g gVar = descriptor;
        f00.b bVarD = encoder.d(gVar);
        WordAccuracyScoreTimingResult.write$Self$data_release(value, bVarD, gVar);
        bVarD.c(gVar);
    }

    @Override // g00.e0
    public a[] typeParametersSerializers() {
        return d1.f28375b;
    }
}
