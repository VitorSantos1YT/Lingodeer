package com.lingodeer.data.model.speech;

import c00.a;
import com.lingo.lingoskill.object.WordDao;
import e00.g;
import f00.b;
import f00.d;
import g00.d1;
import g00.e0;
import g00.f1;
import g00.r0;
import g00.t1;
import java.util.List;
import kotlin.jvm.internal.m;
import kotlinx.serialization.UnknownFieldException;
import qy.c;
import qy.h;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
@c
public final /* synthetic */ class Word$$serializer implements e0 {
    public static final Word$$serializer INSTANCE;
    private static final g descriptor;

    static {
        Word$$serializer word$$serializer = new Word$$serializer();
        INSTANCE = word$$serializer;
        f1 f1Var = new f1("com.lingodeer.data.model.speech.Word", word$$serializer, 5);
        f1Var.k(WordDao.TABLENAME, false);
        f1Var.k("Offset", false);
        f1Var.k("Duration", false);
        f1Var.k("PronunciationAssessment", false);
        f1Var.k("Phonemes", false);
        descriptor = f1Var;
    }

    private Word$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // g00.e0
    public final a[] childSerializers() {
        h[] hVarArr = Word.$childSerializers;
        r0 r0Var = r0.f28455a;
        return new a[]{t1.f28468a, r0Var, r0Var, WordPronunciationAssessment$$serializer.INSTANCE, hVarArr[4].getValue()};
    }

    @Override // c00.a
    public final Word deserialize(f00.c decoder) {
        m.f(decoder, "decoder");
        g gVar = descriptor;
        f00.a aVarD = decoder.d(gVar);
        h[] hVarArr = Word.$childSerializers;
        List list = null;
        int i11 = 0;
        String strK = null;
        WordPronunciationAssessment wordPronunciationAssessment = null;
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
                jD = aVarD.D(gVar, 1);
                i11 |= 2;
            } else if (iN == 2) {
                jD2 = aVarD.D(gVar, 2);
                i11 |= 4;
            } else if (iN == 3) {
                wordPronunciationAssessment = (WordPronunciationAssessment) aVarD.t(gVar, 3, WordPronunciationAssessment$$serializer.INSTANCE, wordPronunciationAssessment);
                i11 |= 8;
            } else {
                if (iN != 4) {
                    throw new UnknownFieldException(iN);
                }
                list = (List) aVarD.t(gVar, 4, (a) hVarArr[4].getValue(), list);
                i11 |= 16;
            }
        }
        aVarD.c(gVar);
        return new Word(i11, strK, jD, jD2, wordPronunciationAssessment, list, null);
    }

    @Override // c00.a
    public final g getDescriptor() {
        return descriptor;
    }

    @Override // c00.a
    public final void serialize(d encoder, Word value) {
        m.f(encoder, "encoder");
        m.f(value, "value");
        g gVar = descriptor;
        b bVarD = encoder.d(gVar);
        Word.write$Self$data_release(value, bVarD, gVar);
        bVarD.c(gVar);
    }

    @Override // g00.e0
    public a[] typeParametersSerializers() {
        return d1.f28375b;
    }
}
