package com.lingodeer.course.smarttips.data.model;

import c00.a;
import e00.g;
import f00.d;
import g00.d1;
import g00.e0;
import g00.f1;
import g00.m0;
import g00.o1;
import kotlin.jvm.internal.m;
import kotlinx.serialization.UnknownFieldException;
import qx.b;
import qy.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
@c
public final /* synthetic */ class Style$$serializer implements e0 {
    public static final int $stable;
    public static final Style$$serializer INSTANCE;
    private static final g descriptor;

    static {
        Style$$serializer style$$serializer = new Style$$serializer();
        INSTANCE = style$$serializer;
        $stable = 8;
        f1 f1Var = new f1("com.lingodeer.course.smarttips.data.model.Style", style$$serializer, 3);
        f1Var.k("from", true);
        f1Var.k("to", true);
        f1Var.k("attr", true);
        descriptor = f1Var;
    }

    private Style$$serializer() {
    }

    @Override // g00.e0
    public final a[] childSerializers() {
        a aVarS = b.s(Attr$$serializer.INSTANCE);
        m0 m0Var = m0.f28434a;
        return new a[]{m0Var, m0Var, aVarS};
    }

    @Override // c00.a
    public final Style deserialize(f00.c decoder) {
        m.f(decoder, "decoder");
        g gVar = descriptor;
        f00.a aVarD = decoder.d(gVar);
        int i11 = 0;
        int iP = 0;
        int iP2 = 0;
        Attr attr = null;
        boolean z11 = true;
        while (z11) {
            int iN = aVarD.n(gVar);
            if (iN == -1) {
                z11 = false;
            } else if (iN == 0) {
                iP = aVarD.p(gVar, 0);
                i11 |= 1;
            } else if (iN == 1) {
                iP2 = aVarD.p(gVar, 1);
                i11 |= 2;
            } else {
                if (iN != 2) {
                    throw new UnknownFieldException(iN);
                }
                attr = (Attr) aVarD.s(gVar, 2, Attr$$serializer.INSTANCE, attr);
                i11 |= 4;
            }
        }
        aVarD.c(gVar);
        return new Style(i11, iP, iP2, attr, (o1) null);
    }

    @Override // c00.a
    public final g getDescriptor() {
        return descriptor;
    }

    @Override // c00.a
    public final void serialize(d encoder, Style value) {
        m.f(encoder, "encoder");
        m.f(value, "value");
        g gVar = descriptor;
        f00.b bVarD = encoder.d(gVar);
        Style.write$Self$course_release(value, bVarD, gVar);
        bVarD.c(gVar);
    }

    @Override // g00.e0
    public a[] typeParametersSerializers() {
        return d1.f28375b;
    }
}
