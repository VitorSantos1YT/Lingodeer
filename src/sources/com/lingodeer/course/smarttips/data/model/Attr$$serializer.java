package com.lingodeer.course.smarttips.data.model;

import c00.a;
import e00.g;
import f00.d;
import g00.d1;
import g00.e0;
import g00.f1;
import g00.o1;
import g00.t1;
import kotlin.jvm.internal.m;
import kotlinx.serialization.UnknownFieldException;
import qx.b;
import qy.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
@c
public final /* synthetic */ class Attr$$serializer implements e0 {
    public static final int $stable;
    public static final Attr$$serializer INSTANCE;
    private static final g descriptor;

    static {
        Attr$$serializer attr$$serializer = new Attr$$serializer();
        INSTANCE = attr$$serializer;
        $stable = 8;
        f1 f1Var = new f1("com.lingodeer.course.smarttips.data.model.Attr", attr$$serializer, 3);
        f1Var.k("fontSize", true);
        f1Var.k("fontWeight", true);
        f1Var.k("textColor", true);
        descriptor = f1Var;
    }

    private Attr$$serializer() {
    }

    @Override // g00.e0
    public final a[] childSerializers() {
        t1 t1Var = t1.f28468a;
        return new a[]{b.s(t1Var), b.s(t1Var), b.s(t1Var)};
    }

    @Override // c00.a
    public final Attr deserialize(f00.c decoder) {
        m.f(decoder, "decoder");
        g gVar = descriptor;
        f00.a aVarD = decoder.d(gVar);
        int i11 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        boolean z11 = true;
        while (z11) {
            int iN = aVarD.n(gVar);
            if (iN == -1) {
                z11 = false;
            } else if (iN == 0) {
                str = (String) aVarD.s(gVar, 0, t1.f28468a, str);
                i11 |= 1;
            } else if (iN == 1) {
                str2 = (String) aVarD.s(gVar, 1, t1.f28468a, str2);
                i11 |= 2;
            } else {
                if (iN != 2) {
                    throw new UnknownFieldException(iN);
                }
                str3 = (String) aVarD.s(gVar, 2, t1.f28468a, str3);
                i11 |= 4;
            }
        }
        aVarD.c(gVar);
        return new Attr(i11, str, str2, str3, (o1) null);
    }

    @Override // c00.a
    public final g getDescriptor() {
        return descriptor;
    }

    @Override // c00.a
    public final void serialize(d encoder, Attr value) {
        m.f(encoder, "encoder");
        m.f(value, "value");
        g gVar = descriptor;
        f00.b bVarD = encoder.d(gVar);
        Attr.write$Self$course_release(value, bVarD, gVar);
        bVarD.c(gVar);
    }

    @Override // g00.e0
    public a[] typeParametersSerializers() {
        return d1.f28375b;
    }
}
