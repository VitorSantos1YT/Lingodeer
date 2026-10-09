package com.lingodeer.data.model;

import c00.a;
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
public final /* synthetic */ class Vowel$$serializer implements e0 {
    public static final Vowel$$serializer INSTANCE;
    private static final g descriptor;

    static {
        Vowel$$serializer vowel$$serializer = new Vowel$$serializer();
        INSTANCE = vowel$$serializer;
        f1 f1Var = new f1("com.lingodeer.data.model.Vowel", vowel$$serializer, 4);
        f1Var.k("ipa", false);
        f1Var.k("example1", false);
        f1Var.k("example2", false);
        f1Var.k("example3", false);
        descriptor = f1Var;
    }

    private Vowel$$serializer() {
    }

    @Override // g00.e0
    public final a[] childSerializers() {
        t1 t1Var = t1.f28468a;
        return new a[]{t1Var, t1Var, t1Var, t1Var};
    }

    @Override // c00.a
    public final Vowel deserialize(f00.c decoder) {
        m.f(decoder, "decoder");
        g gVar = descriptor;
        f00.a aVarD = decoder.d(gVar);
        int i11 = 0;
        String strK = null;
        String strK2 = null;
        String strK3 = null;
        String strK4 = null;
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
            } else {
                if (iN != 3) {
                    throw new UnknownFieldException(iN);
                }
                strK4 = aVarD.k(gVar, 3);
                i11 |= 8;
            }
        }
        aVarD.c(gVar);
        return new Vowel(i11, strK, strK2, strK3, strK4, null);
    }

    @Override // c00.a
    public final g getDescriptor() {
        return descriptor;
    }

    @Override // c00.a
    public final void serialize(d encoder, Vowel value) {
        m.f(encoder, "encoder");
        m.f(value, "value");
        g gVar = descriptor;
        b bVarD = encoder.d(gVar);
        Vowel.write$Self$data_release(value, bVarD, gVar);
        bVarD.c(gVar);
    }

    @Override // g00.e0
    public a[] typeParametersSerializers() {
        return d1.f28375b;
    }
}
