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
import kotlin.jvm.internal.m;
import kotlinx.serialization.UnknownFieldException;
import qy.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
@c
public final /* synthetic */ class AudioExampleElement$$serializer implements e0 {
    public static final int $stable;
    public static final AudioExampleElement$$serializer INSTANCE;
    private static final g descriptor;

    static {
        AudioExampleElement$$serializer audioExampleElement$$serializer = new AudioExampleElement$$serializer();
        INSTANCE = audioExampleElement$$serializer;
        $stable = 8;
        f1 f1Var = new f1("com.lingodeer.course.smarttips.data.model.AudioExampleElement", audioExampleElement$$serializer, 5);
        f1Var.k("text", false);
        f1Var.k("subtext", false);
        f1Var.k("audioText", false);
        f1Var.k("audio", false);
        f1Var.k("isPlayingAudio", true);
        descriptor = f1Var;
    }

    private AudioExampleElement$$serializer() {
    }

    @Override // g00.e0
    public final a[] childSerializers() {
        Element$$serializer element$$serializer = Element$$serializer.INSTANCE;
        t1 t1Var = t1.f28468a;
        return new a[]{element$$serializer, element$$serializer, t1Var, t1Var, g00.g.f28401a};
    }

    @Override // c00.a
    public final AudioExampleElement deserialize(f00.c decoder) {
        m.f(decoder, "decoder");
        g gVar = descriptor;
        f00.a aVarD = decoder.d(gVar);
        int i11 = 0;
        boolean zW = false;
        Element element = null;
        Element element2 = null;
        String strK = null;
        String strK2 = null;
        boolean z11 = true;
        while (z11) {
            int iN = aVarD.n(gVar);
            if (iN == -1) {
                z11 = false;
            } else if (iN == 0) {
                element = (Element) aVarD.t(gVar, 0, Element$$serializer.INSTANCE, element);
                i11 |= 1;
            } else if (iN == 1) {
                element2 = (Element) aVarD.t(gVar, 1, Element$$serializer.INSTANCE, element2);
                i11 |= 2;
            } else if (iN == 2) {
                strK = aVarD.k(gVar, 2);
                i11 |= 4;
            } else if (iN == 3) {
                strK2 = aVarD.k(gVar, 3);
                i11 |= 8;
            } else {
                if (iN != 4) {
                    throw new UnknownFieldException(iN);
                }
                zW = aVarD.w(gVar, 4);
                i11 |= 16;
            }
        }
        aVarD.c(gVar);
        return new AudioExampleElement(i11, element, element2, strK, strK2, zW, (o1) null);
    }

    @Override // c00.a
    public final g getDescriptor() {
        return descriptor;
    }

    @Override // c00.a
    public final void serialize(d encoder, AudioExampleElement value) {
        m.f(encoder, "encoder");
        m.f(value, "value");
        g gVar = descriptor;
        b bVarD = encoder.d(gVar);
        AudioExampleElement.write$Self$course_release(value, bVarD, gVar);
        bVarD.c(gVar);
    }

    @Override // g00.e0
    public a[] typeParametersSerializers() {
        return d1.f28375b;
    }
}
