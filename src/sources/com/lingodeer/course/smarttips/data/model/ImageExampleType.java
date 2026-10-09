package com.lingodeer.course.smarttips.data.model;

import c00.a;
import c00.e;
import com.google.zxing.pdf417.decoder.vBn.xTCJ;
import e00.g;
import f00.b;
import g00.d1;
import g00.o1;
import g00.t1;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
@e
public final class ImageExampleType {
    private final String background;
    private final ImageExampleElement element;
    private final String type;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        private Companion() {
        }

        public final a serializer() {
            return ImageExampleType$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public /* synthetic */ ImageExampleType(int i11, String str, String str2, ImageExampleElement imageExampleElement, o1 o1Var) {
        if (7 != (i11 & 7)) {
            d1.k(i11, 7, ImageExampleType$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.type = str;
        this.background = str2;
        this.element = imageExampleElement;
    }

    public static /* synthetic */ ImageExampleType copy$default(ImageExampleType imageExampleType, String str, String str2, ImageExampleElement imageExampleElement, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = imageExampleType.type;
        }
        if ((i11 & 2) != 0) {
            str2 = imageExampleType.background;
        }
        if ((i11 & 4) != 0) {
            imageExampleElement = imageExampleType.element;
        }
        return imageExampleType.copy(str, str2, imageExampleElement);
    }

    public static final /* synthetic */ void write$Self$course_release(ImageExampleType imageExampleType, b bVar, g gVar) {
        bVar.w(gVar, 0, imageExampleType.type);
        bVar.x(gVar, 1, t1.f28468a, imageExampleType.background);
        bVar.A(gVar, 2, ImageExampleElement$$serializer.INSTANCE, imageExampleType.element);
    }

    public final String component1() {
        return this.type;
    }

    public final String component2() {
        return this.background;
    }

    public final ImageExampleElement component3() {
        return this.element;
    }

    public final ImageExampleType copy(String type, String str, ImageExampleElement element) {
        m.f(type, "type");
        m.f(element, "element");
        return new ImageExampleType(type, str, element);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageExampleType)) {
            return false;
        }
        ImageExampleType imageExampleType = (ImageExampleType) obj;
        return m.a(this.type, imageExampleType.type) && m.a(this.background, imageExampleType.background) && m.a(this.element, imageExampleType.element);
    }

    public final String getBackground() {
        return this.background;
    }

    public final ImageExampleElement getElement() {
        return this.element;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        String str = this.background;
        return this.element.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public String toString() {
        String str = this.type;
        String str2 = this.background;
        ImageExampleElement imageExampleElement = this.element;
        StringBuilder sbS = defpackage.e.s("ImageExampleType(type=", str, ", background=", str2, ", element=");
        sbS.append(imageExampleElement);
        sbS.append(")");
        return sbS.toString();
    }

    public ImageExampleType(String str, String str2, ImageExampleElement element) {
        m.f(str, xTCJ.otcMAnn);
        m.f(element, "element");
        this.type = str;
        this.background = str2;
        this.element = element;
    }
}
