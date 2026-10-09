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
import su.Mbl.tcppUUQxZjFdy;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
@c
public final /* synthetic */ class ImageExampleElement$$serializer implements e0 {
    public static final int $stable;
    public static final ImageExampleElement$$serializer INSTANCE;
    private static final g descriptor;

    static {
        ImageExampleElement$$serializer imageExampleElement$$serializer = new ImageExampleElement$$serializer();
        INSTANCE = imageExampleElement$$serializer;
        $stable = 8;
        f1 f1Var = new f1("com.lingodeer.course.smarttips.data.model.ImageExampleElement", imageExampleElement$$serializer, 6);
        f1Var.k("text", false);
        f1Var.k("subtext", false);
        f1Var.k("audio", false);
        f1Var.k("image", true);
        f1Var.k("imagePosition", false);
        f1Var.k("isPlayingAudio", true);
        descriptor = f1Var;
    }

    private ImageExampleElement$$serializer() {
    }

    @Override // g00.e0
    public final a[] childSerializers() {
        t1 t1Var = t1.f28468a;
        a aVarS = b.s(t1Var);
        Element$$serializer element$$serializer = Element$$serializer.INSTANCE;
        return new a[]{element$$serializer, element$$serializer, t1Var, aVarS, t1Var, g00.g.f28401a};
    }

    @Override // c00.a
    public final ImageExampleElement deserialize(f00.c cVar) {
        m.f(cVar, tcppUUQxZjFdy.cYfvzqi);
        g gVar = descriptor;
        f00.a aVarD = cVar.d(gVar);
        int i11 = 0;
        boolean zW = false;
        Element element = null;
        Element element2 = null;
        String strK = null;
        String str = null;
        String strK2 = null;
        boolean z11 = true;
        while (z11) {
            int iN = aVarD.n(gVar);
            switch (iN) {
                case -1:
                    z11 = false;
                    break;
                case 0:
                    element = (Element) aVarD.t(gVar, 0, Element$$serializer.INSTANCE, element);
                    i11 |= 1;
                    break;
                case 1:
                    element2 = (Element) aVarD.t(gVar, 1, Element$$serializer.INSTANCE, element2);
                    i11 |= 2;
                    break;
                case 2:
                    strK = aVarD.k(gVar, 2);
                    i11 |= 4;
                    break;
                case 3:
                    str = (String) aVarD.s(gVar, 3, t1.f28468a, str);
                    i11 |= 8;
                    break;
                case 4:
                    strK2 = aVarD.k(gVar, 4);
                    i11 |= 16;
                    break;
                case 5:
                    zW = aVarD.w(gVar, 5);
                    i11 |= 32;
                    break;
                default:
                    throw new UnknownFieldException(iN);
            }
        }
        aVarD.c(gVar);
        return new ImageExampleElement(i11, element, element2, strK, str, strK2, zW, (o1) null);
    }

    @Override // c00.a
    public final g getDescriptor() {
        return descriptor;
    }

    @Override // c00.a
    public final void serialize(d encoder, ImageExampleElement value) {
        m.f(encoder, "encoder");
        m.f(value, "value");
        g gVar = descriptor;
        f00.b bVarD = encoder.d(gVar);
        ImageExampleElement.write$Self$course_release(value, bVarD, gVar);
        bVarD.c(gVar);
    }

    @Override // g00.e0
    public a[] typeParametersSerializers() {
        return d1.f28375b;
    }
}
