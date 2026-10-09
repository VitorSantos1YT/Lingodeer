package com.lingodeer.course.smarttips.data.model;

import aj.uZCn.evRpcb;
import c00.a;
import c00.e;
import com.google.android.material.datepicker.d;
import dt.Xk.wuoM;
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
public final class ImageExampleElement {
    private final String audio;
    private final String image;
    private final String imagePosition;
    private final boolean isPlayingAudio;
    private final Element subtext;
    private final Element text;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        private Companion() {
        }

        public final a serializer() {
            return ImageExampleElement$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public /* synthetic */ ImageExampleElement(int i11, Element element, Element element2, String str, String str2, String str3, boolean z11, o1 o1Var) {
        if (23 != (i11 & 23)) {
            d1.k(i11, 23, ImageExampleElement$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.text = element;
        this.subtext = element2;
        this.audio = str;
        if ((i11 & 8) == 0) {
            this.image = null;
        } else {
            this.image = str2;
        }
        this.imagePosition = str3;
        if ((i11 & 32) == 0) {
            this.isPlayingAudio = false;
        } else {
            this.isPlayingAudio = z11;
        }
    }

    public static /* synthetic */ ImageExampleElement copy$default(ImageExampleElement imageExampleElement, Element element, Element element2, String str, String str2, String str3, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            element = imageExampleElement.text;
        }
        if ((i11 & 2) != 0) {
            element2 = imageExampleElement.subtext;
        }
        if ((i11 & 4) != 0) {
            str = imageExampleElement.audio;
        }
        if ((i11 & 8) != 0) {
            str2 = imageExampleElement.image;
        }
        if ((i11 & 16) != 0) {
            str3 = imageExampleElement.imagePosition;
        }
        if ((i11 & 32) != 0) {
            z11 = imageExampleElement.isPlayingAudio;
        }
        String str4 = str3;
        boolean z12 = z11;
        return imageExampleElement.copy(element, element2, str, str2, str4, z12);
    }

    public static final /* synthetic */ void write$Self$course_release(ImageExampleElement imageExampleElement, b bVar, g gVar) {
        Element$$serializer element$$serializer = Element$$serializer.INSTANCE;
        bVar.A(gVar, 0, element$$serializer, imageExampleElement.text);
        bVar.A(gVar, 1, element$$serializer, imageExampleElement.subtext);
        bVar.w(gVar, 2, imageExampleElement.audio);
        if (bVar.G(gVar) || imageExampleElement.image != null) {
            bVar.x(gVar, 3, t1.f28468a, imageExampleElement.image);
        }
        bVar.w(gVar, 4, imageExampleElement.imagePosition);
        if (bVar.G(gVar) || imageExampleElement.isPlayingAudio) {
            bVar.B(gVar, 5, imageExampleElement.isPlayingAudio);
        }
    }

    public final Element component1() {
        return this.text;
    }

    public final Element component2() {
        return this.subtext;
    }

    public final String component3() {
        return this.audio;
    }

    public final String component4() {
        return this.image;
    }

    public final String component5() {
        return this.imagePosition;
    }

    public final boolean component6() {
        return this.isPlayingAudio;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageExampleElement)) {
            return false;
        }
        ImageExampleElement imageExampleElement = (ImageExampleElement) obj;
        return m.a(this.text, imageExampleElement.text) && m.a(this.subtext, imageExampleElement.subtext) && m.a(this.audio, imageExampleElement.audio) && m.a(this.image, imageExampleElement.image) && m.a(this.imagePosition, imageExampleElement.imagePosition) && this.isPlayingAudio == imageExampleElement.isPlayingAudio;
    }

    public final String getAudio() {
        return this.audio;
    }

    public final String getImage() {
        return this.image;
    }

    public final String getImagePosition() {
        return this.imagePosition;
    }

    public final Element getSubtext() {
        return this.subtext;
    }

    public final Element getText() {
        return this.text;
    }

    public int hashCode() {
        int iD = defpackage.e.d((this.subtext.hashCode() + (this.text.hashCode() * 31)) * 31, 31, this.audio);
        String str = this.image;
        return Boolean.hashCode(this.isPlayingAudio) + defpackage.e.d((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.imagePosition);
    }

    public final boolean isPlayingAudio() {
        return this.isPlayingAudio;
    }

    public ImageExampleElement(Element text, Element subtext, String audio, String str, String imagePosition, boolean z11) {
        m.f(text, "text");
        m.f(subtext, "subtext");
        m.f(audio, "audio");
        m.f(imagePosition, "imagePosition");
        this.text = text;
        this.subtext = subtext;
        this.audio = audio;
        this.image = str;
        this.imagePosition = imagePosition;
        this.isPlayingAudio = z11;
    }

    public final ImageExampleElement copy(Element text, Element subtext, String audio, String str, String str2, boolean z11) {
        m.f(text, "text");
        m.f(subtext, "subtext");
        m.f(audio, "audio");
        m.f(str2, evRpcb.mxKyDapPjQnSKx);
        return new ImageExampleElement(text, subtext, audio, str, str2, z11);
    }

    public String toString() {
        Element element = this.text;
        Element element2 = this.subtext;
        String str = this.audio;
        String str2 = this.image;
        String str3 = this.imagePosition;
        boolean z11 = this.isPlayingAudio;
        StringBuilder sb2 = new StringBuilder("ImageExampleElement(text=");
        sb2.append(element);
        sb2.append(wuoM.VLxYNw);
        sb2.append(element2);
        sb2.append(", audio=");
        d.w(sb2, str, ", image=", str2, ", imagePosition=");
        sb2.append(str3);
        sb2.append(", isPlayingAudio=");
        sb2.append(z11);
        sb2.append(")");
        return sb2.toString();
    }

    public /* synthetic */ ImageExampleElement(Element element, Element element2, String str, String str2, String str3, boolean z11, int i11, f fVar) {
        this(element, element2, str, (i11 & 8) != 0 ? null : str2, str3, (i11 & 32) != 0 ? false : z11);
    }
}
