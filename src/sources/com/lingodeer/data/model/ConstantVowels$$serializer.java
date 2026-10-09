package com.lingodeer.data.model;

import c00.a;
import e00.g;
import f00.b;
import f00.d;
import g00.d1;
import g00.e0;
import g00.f1;
import java.util.List;
import kotlin.jvm.internal.m;
import kotlinx.serialization.UnknownFieldException;
import qy.c;
import qy.h;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
@c
public final /* synthetic */ class ConstantVowels$$serializer implements e0 {
    public static final ConstantVowels$$serializer INSTANCE;
    private static final g descriptor;

    static {
        ConstantVowels$$serializer constantVowels$$serializer = new ConstantVowels$$serializer();
        INSTANCE = constantVowels$$serializer;
        f1 f1Var = new f1("com.lingodeer.data.model.ConstantVowels", constantVowels$$serializer, 2);
        f1Var.k("consonants", false);
        f1Var.k("vowels", false);
        descriptor = f1Var;
    }

    private ConstantVowels$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // g00.e0
    public final a[] childSerializers() {
        h[] hVarArr = ConstantVowels.$childSerializers;
        return new a[]{hVarArr[0].getValue(), hVarArr[1].getValue()};
    }

    @Override // c00.a
    public final ConstantVowels deserialize(f00.c decoder) {
        m.f(decoder, "decoder");
        g gVar = descriptor;
        f00.a aVarD = decoder.d(gVar);
        h[] hVarArr = ConstantVowels.$childSerializers;
        boolean z11 = true;
        int i11 = 0;
        List list = null;
        List list2 = null;
        while (z11) {
            int iN = aVarD.n(gVar);
            if (iN == -1) {
                z11 = false;
            } else if (iN == 0) {
                list = (List) aVarD.t(gVar, 0, (a) hVarArr[0].getValue(), list);
                i11 |= 1;
            } else {
                if (iN != 1) {
                    throw new UnknownFieldException(iN);
                }
                list2 = (List) aVarD.t(gVar, 1, (a) hVarArr[1].getValue(), list2);
                i11 |= 2;
            }
        }
        aVarD.c(gVar);
        return new ConstantVowels(i11, list, list2, null);
    }

    @Override // c00.a
    public final g getDescriptor() {
        return descriptor;
    }

    @Override // c00.a
    public final void serialize(d encoder, ConstantVowels value) {
        m.f(encoder, "encoder");
        m.f(value, "value");
        g gVar = descriptor;
        b bVarD = encoder.d(gVar);
        ConstantVowels.write$Self$data_release(value, bVarD, gVar);
        bVarD.c(gVar);
    }

    @Override // g00.e0
    public a[] typeParametersSerializers() {
        return d1.f28375b;
    }
}
