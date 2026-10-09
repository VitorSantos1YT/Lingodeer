package com.lingodeer.syllable_ko.model;

import c00.a;
import com.lingo.lingoskill.object.LessonDao;
import com.lingo.lingoskill.object.WordDao;
import e00.g;
import f00.b;
import f00.d;
import g00.d1;
import g00.e0;
import g00.f1;
import g00.t1;
import kotlin.jvm.internal.m;
import kotlinx.serialization.UnknownFieldException;
import qy.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
@c
public final /* synthetic */ class KOSyllableSoundChangeLessonData$$serializer implements e0 {
    public static final int $stable;
    public static final KOSyllableSoundChangeLessonData$$serializer INSTANCE;
    private static final g descriptor;

    static {
        KOSyllableSoundChangeLessonData$$serializer kOSyllableSoundChangeLessonData$$serializer = new KOSyllableSoundChangeLessonData$$serializer();
        INSTANCE = kOSyllableSoundChangeLessonData$$serializer;
        $stable = 8;
        f1 f1Var = new f1("com.lingodeer.syllable_ko.model.KOSyllableSoundChangeLessonData", kOSyllableSoundChangeLessonData$$serializer, 5);
        f1Var.k(LessonDao.TABLENAME, false);
        f1Var.k("Type", false);
        f1Var.k(WordDao.TABLENAME, false);
        f1Var.k("Pronunciation", false);
        f1Var.k("Romanization", false);
        descriptor = f1Var;
    }

    private KOSyllableSoundChangeLessonData$$serializer() {
    }

    @Override // g00.e0
    public final a[] childSerializers() {
        t1 t1Var = t1.f28468a;
        return new a[]{t1Var, t1Var, t1Var, t1Var, t1Var};
    }

    @Override // c00.a
    public final KOSyllableSoundChangeLessonData deserialize(f00.c decoder) {
        m.f(decoder, "decoder");
        g gVar = descriptor;
        f00.a aVarD = decoder.d(gVar);
        int i11 = 0;
        String strK = null;
        String strK2 = null;
        String strK3 = null;
        String strK4 = null;
        String strK5 = null;
        boolean z11 = true;
        while (z11) {
            int iN = aVarD.n(gVar);
            if (iN == -1) {
                z11 = false;
            } else if (iN == 0) {
                strK = aVarD.k(gVar, 0);
                i11 |= 1;
            } else if (iN == 1) {
                strK2 = aVarD.k(gVar, 1);
                i11 |= 2;
            } else if (iN == 2) {
                strK3 = aVarD.k(gVar, 2);
                i11 |= 4;
            } else if (iN == 3) {
                strK4 = aVarD.k(gVar, 3);
                i11 |= 8;
            } else {
                if (iN != 4) {
                    throw new UnknownFieldException(iN);
                }
                strK5 = aVarD.k(gVar, 4);
                i11 |= 16;
            }
        }
        aVarD.c(gVar);
        return new KOSyllableSoundChangeLessonData(i11, strK, strK2, strK3, strK4, strK5, null);
    }

    @Override // c00.a
    public final g getDescriptor() {
        return descriptor;
    }

    @Override // c00.a
    public final void serialize(d encoder, KOSyllableSoundChangeLessonData value) {
        m.f(encoder, "encoder");
        m.f(value, "value");
        g gVar = descriptor;
        b bVarD = encoder.d(gVar);
        KOSyllableSoundChangeLessonData.write$Self$syllable_ko_release(value, bVarD, gVar);
        bVarD.c(gVar);
    }

    @Override // g00.e0
    public a[] typeParametersSerializers() {
        return d1.f28375b;
    }
}
