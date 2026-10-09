package com.lingodeer.course.smarttips.data.model;

import c00.a;
import e00.g;
import f00.d;
import g00.d1;
import g00.e0;
import g00.f1;
import g00.t1;
import kotlin.jvm.internal.m;
import kotlinx.serialization.UnknownFieldException;
import qx.b;
import qy.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
@c
public final /* synthetic */ class TextExampleType$$serializer implements e0 {
    public static final int $stable;
    public static final TextExampleType$$serializer INSTANCE;
    private static final g descriptor;

    static {
        TextExampleType$$serializer textExampleType$$serializer = new TextExampleType$$serializer();
        INSTANCE = textExampleType$$serializer;
        $stable = 8;
        f1 f1Var = new f1("com.lingodeer.course.smarttips.data.model.TextExampleType", textExampleType$$serializer, 3);
        f1Var.k("type", false);
        f1Var.k("background", false);
        f1Var.k("element", false);
        descriptor = f1Var;
    }

    private TextExampleType$$serializer() {
    }

    @Override // g00.e0
    public final a[] childSerializers() {
        t1 t1Var = t1.f28468a;
        return new a[]{t1Var, b.s(t1Var), TextExampleElement$$serializer.INSTANCE};
    }

    @Override // c00.a
    public final TextExampleType deserialize(f00.c decoder) {
        m.f(decoder, "decoder");
        g gVar = descriptor;
        f00.a aVarD = decoder.d(gVar);
        int i11 = 0;
        String strK = null;
        String str = null;
        TextExampleElement textExampleElement = null;
        boolean z11 = true;
        while (z11) {
            int iN = aVarD.n(gVar);
            if (iN == -1) {
                z11 = false;
            } else if (iN == 0) {
                strK = aVarD.k(gVar, 0);
                i11 |= 1;
            } else if (iN == 1) {
                str = (String) aVarD.s(gVar, 1, t1.f28468a, str);
                i11 |= 2;
            } else {
                if (iN != 2) {
                    throw new UnknownFieldException(iN);
                }
                textExampleElement = (TextExampleElement) aVarD.t(gVar, 2, TextExampleElement$$serializer.INSTANCE, textExampleElement);
                i11 |= 4;
            }
        }
        aVarD.c(gVar);
        return new TextExampleType(i11, strK, str, textExampleElement, null);
    }

    @Override // c00.a
    public final g getDescriptor() {
        return descriptor;
    }

    @Override // c00.a
    public final void serialize(d encoder, TextExampleType value) {
        m.f(encoder, "encoder");
        m.f(value, "value");
        g gVar = descriptor;
        f00.b bVarD = encoder.d(gVar);
        TextExampleType.write$Self$course_release(value, bVarD, gVar);
        bVarD.c(gVar);
    }

    @Override // g00.e0
    public a[] typeParametersSerializers() {
        return d1.f28375b;
    }
}
