package com.lingodeer.course.smarttips.data.model;

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
/* JADX INFO: loaded from: classes.dex */
@c
public final /* synthetic */ class DividerType$$serializer implements e0 {
    public static final int $stable;
    public static final DividerType$$serializer INSTANCE;
    private static final g descriptor;

    static {
        DividerType$$serializer dividerType$$serializer = new DividerType$$serializer();
        INSTANCE = dividerType$$serializer;
        $stable = 8;
        f1 f1Var = new f1("com.lingodeer.course.smarttips.data.model.DividerType", dividerType$$serializer, 2);
        f1Var.k("type", false);
        f1Var.k("element", false);
        descriptor = f1Var;
    }

    private DividerType$$serializer() {
    }

    @Override // g00.e0
    public final a[] childSerializers() {
        return new a[]{t1.f28468a, DividerElement$$serializer.INSTANCE};
    }

    @Override // c00.a
    public final DividerType deserialize(f00.c decoder) {
        m.f(decoder, "decoder");
        g gVar = descriptor;
        f00.a aVarD = decoder.d(gVar);
        boolean z11 = true;
        int i11 = 0;
        String strK = null;
        DividerElement dividerElement = null;
        while (z11) {
            int iN = aVarD.n(gVar);
            if (iN == -1) {
                z11 = false;
            } else if (iN == 0) {
                strK = aVarD.k(gVar, 0);
                i11 |= 1;
            } else {
                if (iN != 1) {
                    throw new UnknownFieldException(iN);
                }
                dividerElement = (DividerElement) aVarD.t(gVar, 1, DividerElement$$serializer.INSTANCE, dividerElement);
                i11 |= 2;
            }
        }
        aVarD.c(gVar);
        return new DividerType(i11, strK, dividerElement, null);
    }

    @Override // c00.a
    public final g getDescriptor() {
        return descriptor;
    }

    @Override // c00.a
    public final void serialize(d encoder, DividerType value) {
        m.f(encoder, "encoder");
        m.f(value, "value");
        g gVar = descriptor;
        b bVarD = encoder.d(gVar);
        DividerType.write$Self$course_release(value, bVarD, gVar);
        bVarD.c(gVar);
    }

    @Override // g00.e0
    public a[] typeParametersSerializers() {
        return d1.f28375b;
    }
}
