package com.lingodeer.course.smarttips.data.model;

import c00.a;
import e00.g;
import f00.b;
import f00.d;
import g00.d1;
import g00.e0;
import g00.f1;
import g00.o1;
import g00.t1;
import java.util.List;
import kotlin.jvm.internal.m;
import kotlinx.serialization.UnknownFieldException;
import qy.c;
import qy.h;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
@c
public final /* synthetic */ class Element$$serializer implements e0 {
    public static final int $stable;
    public static final Element$$serializer INSTANCE;
    private static final g descriptor;

    static {
        Element$$serializer element$$serializer = new Element$$serializer();
        INSTANCE = element$$serializer;
        $stable = 8;
        f1 f1Var = new f1("com.lingodeer.course.smarttips.data.model.Element", element$$serializer, 6);
        f1Var.k("alignment", false);
        f1Var.k("verticalAlignment", true);
        f1Var.k("content", false);
        f1Var.k("styles", true);
        f1Var.k("audios", true);
        f1Var.k("hints", true);
        descriptor = f1Var;
    }

    private Element$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // g00.e0
    public final a[] childSerializers() {
        h[] hVarArr = Element.$childSerializers;
        t1 t1Var = t1.f28468a;
        return new a[]{t1Var, t1Var, t1Var, hVarArr[3].getValue(), hVarArr[4].getValue(), hVarArr[5].getValue()};
    }

    @Override // c00.a
    public final Element deserialize(f00.c decoder) {
        m.f(decoder, "decoder");
        g gVar = descriptor;
        f00.a aVarD = decoder.d(gVar);
        h[] hVarArr = Element.$childSerializers;
        int i11 = 0;
        String strK = null;
        String strK2 = null;
        String strK3 = null;
        List list = null;
        List list2 = null;
        List list3 = null;
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
                    list = (List) aVarD.t(gVar, 3, (a) hVarArr[3].getValue(), list);
                    i11 |= 8;
                    break;
                case 4:
                    list2 = (List) aVarD.t(gVar, 4, (a) hVarArr[4].getValue(), list2);
                    i11 |= 16;
                    break;
                case 5:
                    list3 = (List) aVarD.t(gVar, 5, (a) hVarArr[5].getValue(), list3);
                    i11 |= 32;
                    break;
                default:
                    throw new UnknownFieldException(iN);
            }
        }
        aVarD.c(gVar);
        return new Element(i11, strK, strK2, strK3, list, list2, list3, (o1) null);
    }

    @Override // c00.a
    public final g getDescriptor() {
        return descriptor;
    }

    @Override // c00.a
    public final void serialize(d encoder, Element value) {
        m.f(encoder, "encoder");
        m.f(value, "value");
        g gVar = descriptor;
        b bVarD = encoder.d(gVar);
        Element.write$Self$course_release(value, bVarD, gVar);
        bVarD.c(gVar);
    }

    @Override // g00.e0
    public a[] typeParametersSerializers() {
        return d1.f28375b;
    }
}
