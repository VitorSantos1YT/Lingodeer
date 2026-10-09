package com.lingodeer.data.model;

import c00.a;
import e00.g;
import f00.b;
import g00.d0;
import g00.d1;
import g00.e0;
import g00.f1;
import g00.t1;
import kotlin.jvm.internal.m;
import kotlinx.serialization.UnknownFieldException;
import ks.d;
import qy.c;
import qy.h;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
@c
public final /* synthetic */ class AchievementLanguage$$serializer implements e0 {
    public static final AchievementLanguage$$serializer INSTANCE;
    private static final g descriptor;

    static {
        AchievementLanguage$$serializer achievementLanguage$$serializer = new AchievementLanguage$$serializer();
        INSTANCE = achievementLanguage$$serializer;
        f1 f1Var = new f1("com.lingodeer.data.model.AchievementLanguage", achievementLanguage$$serializer, 4);
        f1Var.k("id", false);
        f1Var.k("language", false);
        f1Var.k("isActive", false);
        f1Var.k("progress", false);
        descriptor = f1Var;
    }

    private AchievementLanguage$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // g00.e0
    public final a[] childSerializers() {
        return new a[]{t1.f28468a, AchievementLanguage.$childSerializers[1].getValue(), g00.g.f28401a, d0.f28372a};
    }

    @Override // c00.a
    public final AchievementLanguage deserialize(f00.c decoder) {
        m.f(decoder, "decoder");
        g gVar = descriptor;
        f00.a aVarD = decoder.d(gVar);
        h[] hVarArr = AchievementLanguage.$childSerializers;
        int i11 = 0;
        boolean zW = false;
        String strK = null;
        d dVar = null;
        float fV = 0.0f;
        boolean z11 = true;
        while (z11) {
            int iN = aVarD.n(gVar);
            if (iN == -1) {
                z11 = false;
            } else if (iN == 0) {
                strK = aVarD.k(gVar, 0);
                i11 |= 1;
            } else if (iN == 1) {
                dVar = (d) aVarD.t(gVar, 1, (a) hVarArr[1].getValue(), dVar);
                i11 |= 2;
            } else if (iN == 2) {
                zW = aVarD.w(gVar, 2);
                i11 |= 4;
            } else {
                if (iN != 3) {
                    throw new UnknownFieldException(iN);
                }
                fV = aVarD.v(gVar, 3);
                i11 |= 8;
            }
        }
        aVarD.c(gVar);
        return new AchievementLanguage(i11, strK, dVar, zW, fV, null);
    }

    @Override // c00.a
    public final g getDescriptor() {
        return descriptor;
    }

    @Override // c00.a
    public final void serialize(f00.d encoder, AchievementLanguage value) {
        m.f(encoder, "encoder");
        m.f(value, "value");
        g gVar = descriptor;
        b bVarD = encoder.d(gVar);
        AchievementLanguage.write$Self$data_release(value, bVarD, gVar);
        bVarD.c(gVar);
    }

    @Override // g00.e0
    public a[] typeParametersSerializers() {
        return d1.f28375b;
    }
}
