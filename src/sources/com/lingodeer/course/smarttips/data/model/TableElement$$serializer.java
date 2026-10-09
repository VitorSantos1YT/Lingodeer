package com.lingodeer.course.smarttips.data.model;

import c00.a;
import e00.g;
import f00.d;
import g00.d1;
import g00.e0;
import g00.f1;
import g00.o1;
import g00.t1;
import java.util.List;
import kotlin.jvm.internal.m;
import kotlinx.serialization.UnknownFieldException;
import qx.b;
import qy.c;
import qy.h;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
@c
public final /* synthetic */ class TableElement$$serializer implements e0 {
    public static final int $stable;
    public static final TableElement$$serializer INSTANCE;
    private static final g descriptor;

    static {
        TableElement$$serializer tableElement$$serializer = new TableElement$$serializer();
        INSTANCE = tableElement$$serializer;
        $stable = 8;
        f1 f1Var = new f1("com.lingodeer.course.smarttips.data.model.TableElement", tableElement$$serializer, 3);
        f1Var.k("cells", false);
        f1Var.k("headerColor", true);
        f1Var.k("headerDirection", false);
        descriptor = f1Var;
    }

    private TableElement$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // g00.e0
    public final a[] childSerializers() {
        t1 t1Var = t1.f28468a;
        return new a[]{TableElement.$childSerializers[0].getValue(), b.s(t1Var), t1Var};
    }

    @Override // c00.a
    public final TableElement deserialize(f00.c decoder) {
        m.f(decoder, "decoder");
        g gVar = descriptor;
        f00.a aVarD = decoder.d(gVar);
        h[] hVarArr = TableElement.$childSerializers;
        int i11 = 0;
        List list = null;
        String str = null;
        String strK = null;
        boolean z11 = true;
        while (z11) {
            int iN = aVarD.n(gVar);
            if (iN == -1) {
                z11 = false;
            } else if (iN == 0) {
                list = (List) aVarD.t(gVar, 0, (a) hVarArr[0].getValue(), list);
                i11 |= 1;
            } else if (iN == 1) {
                str = (String) aVarD.s(gVar, 1, t1.f28468a, str);
                i11 |= 2;
            } else {
                if (iN != 2) {
                    throw new UnknownFieldException(iN);
                }
                strK = aVarD.k(gVar, 2);
                i11 |= 4;
            }
        }
        aVarD.c(gVar);
        return new TableElement(i11, list, str, strK, (o1) null);
    }

    @Override // c00.a
    public final g getDescriptor() {
        return descriptor;
    }

    @Override // c00.a
    public final void serialize(d encoder, TableElement value) {
        m.f(encoder, "encoder");
        m.f(value, "value");
        g gVar = descriptor;
        f00.b bVarD = encoder.d(gVar);
        TableElement.write$Self$course_release(value, bVarD, gVar);
        bVarD.c(gVar);
    }

    @Override // g00.e0
    public a[] typeParametersSerializers() {
        return d1.f28375b;
    }
}
