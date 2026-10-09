package com.lingodeer.syllable_ko.model;

import c00.a;
import com.lingo.lingoskill.object.HwCharacterDao;
import com.lingo.lingoskill.object.LessonDao;
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
public final /* synthetic */ class KOSyllableLessonData$$serializer implements e0 {
    public static final int $stable;
    public static final KOSyllableLessonData$$serializer INSTANCE;
    private static final g descriptor;

    static {
        KOSyllableLessonData$$serializer kOSyllableLessonData$$serializer = new KOSyllableLessonData$$serializer();
        INSTANCE = kOSyllableLessonData$$serializer;
        $stable = 8;
        f1 f1Var = new f1("com.lingodeer.syllable_ko.model.KOSyllableLessonData", kOSyllableLessonData$$serializer, 6);
        f1Var.k(LessonDao.TABLENAME, false);
        f1Var.k("Type", false);
        f1Var.k(HwCharacterDao.TABLENAME, false);
        f1Var.k("Option_1", false);
        f1Var.k("Option_2", false);
        f1Var.k("Option_3", false);
        descriptor = f1Var;
    }

    private KOSyllableLessonData$$serializer() {
    }

    @Override // g00.e0
    public final a[] childSerializers() {
        t1 t1Var = t1.f28468a;
        return new a[]{t1Var, t1Var, t1Var, t1Var, t1Var, t1Var};
    }

    @Override // c00.a
    public final KOSyllableLessonData deserialize(f00.c decoder) {
        m.f(decoder, "decoder");
        g gVar = descriptor;
        f00.a aVarD = decoder.d(gVar);
        int i11 = 0;
        String strK = null;
        String strK2 = null;
        String strK3 = null;
        String strK4 = null;
        String strK5 = null;
        String strK6 = null;
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
                    strK3 = aVarD.k(gVar, 2);
                    i11 |= 4;
                    break;
                case 3:
                    strK4 = aVarD.k(gVar, 3);
                    i11 |= 8;
                    break;
                case 4:
                    strK5 = aVarD.k(gVar, 4);
                    i11 |= 16;
                    break;
                case 5:
                    strK6 = aVarD.k(gVar, 5);
                    i11 |= 32;
                    break;
                default:
                    throw new UnknownFieldException(iN);
            }
        }
        aVarD.c(gVar);
        return new KOSyllableLessonData(i11, strK, strK2, strK3, strK4, strK5, strK6, null);
    }

    @Override // c00.a
    public final g getDescriptor() {
        return descriptor;
    }

    @Override // c00.a
    public final void serialize(d encoder, KOSyllableLessonData value) {
        m.f(encoder, "encoder");
        m.f(value, "value");
        g gVar = descriptor;
        b bVarD = encoder.d(gVar);
        KOSyllableLessonData.write$Self$syllable_ko_release(value, bVarD, gVar);
        bVarD.c(gVar);
    }

    @Override // g00.e0
    public a[] typeParametersSerializers() {
        return d1.f28375b;
    }
}
