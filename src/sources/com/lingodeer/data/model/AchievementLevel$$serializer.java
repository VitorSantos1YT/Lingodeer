package com.lingodeer.data.model;

import c00.a;
import e00.g;
import f00.b;
import f00.d;
import g00.d1;
import g00.e0;
import g00.f1;
import g00.m0;
import g00.o1;
import g00.r0;
import g00.t1;
import kotlin.jvm.internal.m;
import kotlinx.serialization.UnknownFieldException;
import qy.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
@c
public final /* synthetic */ class AchievementLevel$$serializer implements e0 {
    public static final AchievementLevel$$serializer INSTANCE;
    private static final g descriptor;

    static {
        AchievementLevel$$serializer achievementLevel$$serializer = new AchievementLevel$$serializer();
        INSTANCE = achievementLevel$$serializer;
        f1 f1Var = new f1("com.lingodeer.data.model.AchievementLevel", achievementLevel$$serializer, 7);
        f1Var.k("id", false);
        f1Var.k("level", false);
        f1Var.k("isActive", false);
        f1Var.k("levelHistory", false);
        f1Var.k("earnTime", true);
        f1Var.k("earnDate", false);
        f1Var.k("currentValue", true);
        descriptor = f1Var;
    }

    private AchievementLevel$$serializer() {
    }

    @Override // g00.e0
    public final a[] childSerializers() {
        t1 t1Var = t1.f28468a;
        m0 m0Var = m0.f28434a;
        return new a[]{t1Var, m0Var, g00.g.f28401a, t1Var, r0.f28455a, t1Var, m0Var};
    }

    @Override // c00.a
    public final AchievementLevel deserialize(f00.c decoder) {
        m.f(decoder, "decoder");
        g gVar = descriptor;
        f00.a aVarD = decoder.d(gVar);
        int i11 = 0;
        int iP = 0;
        boolean zW = false;
        int iP2 = 0;
        String strK = null;
        String strK2 = null;
        String strK3 = null;
        long jD = 0;
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
                    iP = aVarD.p(gVar, 1);
                    i11 |= 2;
                    break;
                case 2:
                    zW = aVarD.w(gVar, 2);
                    i11 |= 4;
                    break;
                case 3:
                    strK2 = aVarD.k(gVar, 3);
                    i11 |= 8;
                    break;
                case 4:
                    jD = aVarD.D(gVar, 4);
                    i11 |= 16;
                    break;
                case 5:
                    strK3 = aVarD.k(gVar, 5);
                    i11 |= 32;
                    break;
                case 6:
                    iP2 = aVarD.p(gVar, 6);
                    i11 |= 64;
                    break;
                default:
                    throw new UnknownFieldException(iN);
            }
        }
        aVarD.c(gVar);
        return new AchievementLevel(i11, strK, iP, zW, strK2, jD, strK3, iP2, (o1) null);
    }

    @Override // c00.a
    public final g getDescriptor() {
        return descriptor;
    }

    @Override // c00.a
    public final void serialize(d encoder, AchievementLevel value) {
        m.f(encoder, "encoder");
        m.f(value, "value");
        g gVar = descriptor;
        b bVarD = encoder.d(gVar);
        AchievementLevel.write$Self$data_release(value, bVarD, gVar);
        bVarD.c(gVar);
    }

    @Override // g00.e0
    public a[] typeParametersSerializers() {
        return d1.f28375b;
    }
}
