package com.lingodeer.data.model;

import c00.a;
import e00.g;
import f00.b;
import f00.d;
import fa.EQx.nuRcCS;
import g00.d1;
import g00.e0;
import g00.f1;
import g00.m0;
import g00.o1;
import g00.r0;
import g00.t1;
import kotlin.jvm.internal.m;
import kotlinx.serialization.UnknownFieldException;
import mf.sOm.txBUGYhC;
import qy.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
@c
public final /* synthetic */ class AchievementLeaderBoard$$serializer implements e0 {
    public static final AchievementLeaderBoard$$serializer INSTANCE;
    private static final g descriptor;

    private AchievementLeaderBoard$$serializer() {
    }

    @Override // g00.e0
    public final a[] childSerializers() {
        t1 t1Var = t1.f28468a;
        return new a[]{t1Var, m0.f28434a, g00.g.f28401a, r0.f28455a, t1Var};
    }

    @Override // c00.a
    public final AchievementLeaderBoard deserialize(f00.c decoder) {
        m.f(decoder, "decoder");
        g gVar = descriptor;
        f00.a aVarD = decoder.d(gVar);
        int i11 = 0;
        int iP = 0;
        boolean zW = false;
        String strK = null;
        String strK2 = null;
        long jD = 0;
        boolean z11 = true;
        while (z11) {
            int iN = aVarD.n(gVar);
            if (iN == -1) {
                z11 = false;
            } else if (iN == 0) {
                strK = aVarD.k(gVar, 0);
                i11 |= 1;
            } else if (iN == 1) {
                iP = aVarD.p(gVar, 1);
                i11 |= 2;
            } else if (iN == 2) {
                zW = aVarD.w(gVar, 2);
                i11 |= 4;
            } else if (iN == 3) {
                jD = aVarD.D(gVar, 3);
                i11 |= 8;
            } else {
                if (iN != 4) {
                    throw new UnknownFieldException(iN);
                }
                strK2 = aVarD.k(gVar, 4);
                i11 |= 16;
            }
        }
        aVarD.c(gVar);
        return new AchievementLeaderBoard(i11, strK, iP, zW, jD, strK2, (o1) null);
    }

    @Override // c00.a
    public final g getDescriptor() {
        return descriptor;
    }

    @Override // c00.a
    public final void serialize(d encoder, AchievementLeaderBoard achievementLeaderBoard) {
        m.f(encoder, "encoder");
        m.f(achievementLeaderBoard, txBUGYhC.QcQDwk);
        g gVar = descriptor;
        b bVarD = encoder.d(gVar);
        AchievementLeaderBoard.write$Self$data_release(achievementLeaderBoard, bVarD, gVar);
        bVarD.c(gVar);
    }

    @Override // g00.e0
    public a[] typeParametersSerializers() {
        return d1.f28375b;
    }

    static {
        AchievementLeaderBoard$$serializer achievementLeaderBoard$$serializer = new AchievementLeaderBoard$$serializer();
        INSTANCE = achievementLeaderBoard$$serializer;
        f1 f1Var = new f1("com.lingodeer.data.model.AchievementLeaderBoard", achievementLeaderBoard$$serializer, 5);
        f1Var.k(nuRcCS.yXBAM, false);
        f1Var.k("count", false);
        f1Var.k("isActive", false);
        f1Var.k("earnTime", true);
        f1Var.k("earnDate", false);
        descriptor = f1Var;
    }
}
