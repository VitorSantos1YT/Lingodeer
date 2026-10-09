package com.lingodeer.course.smarttips.data.model;

import c00.a;
import c00.e;
import e00.g;
import f00.b;
import g00.d1;
import g00.o1;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
@e
public final class TextExampleElement {
    private final String audio;
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
            return TextExampleElement$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public /* synthetic */ TextExampleElement(int i11, Element element, Element element2, String str, boolean z11, o1 o1Var) {
        if (7 != (i11 & 7)) {
            d1.k(i11, 7, TextExampleElement$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.text = element;
        this.subtext = element2;
        this.audio = str;
        if ((i11 & 8) == 0) {
            this.isPlayingAudio = false;
        } else {
            this.isPlayingAudio = z11;
        }
    }

    public static /* synthetic */ TextExampleElement copy$default(TextExampleElement textExampleElement, Element element, Element element2, String str, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            element = textExampleElement.text;
        }
        if ((i11 & 2) != 0) {
            element2 = textExampleElement.subtext;
        }
        if ((i11 & 4) != 0) {
            str = textExampleElement.audio;
        }
        if ((i11 & 8) != 0) {
            z11 = textExampleElement.isPlayingAudio;
        }
        return textExampleElement.copy(element, element2, str, z11);
    }

    public static final /* synthetic */ void write$Self$course_release(TextExampleElement textExampleElement, b bVar, g gVar) {
        Element$$serializer element$$serializer = Element$$serializer.INSTANCE;
        bVar.A(gVar, 0, element$$serializer, textExampleElement.text);
        bVar.A(gVar, 1, element$$serializer, textExampleElement.subtext);
        bVar.w(gVar, 2, textExampleElement.audio);
        if (bVar.G(gVar) || textExampleElement.isPlayingAudio) {
            bVar.B(gVar, 3, textExampleElement.isPlayingAudio);
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

    public final boolean component4() {
        return this.isPlayingAudio;
    }

    public final TextExampleElement copy(Element text, Element subtext, String audio, boolean z11) {
        m.f(text, "text");
        m.f(subtext, "subtext");
        m.f(audio, "audio");
        return new TextExampleElement(text, subtext, audio, z11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextExampleElement)) {
            return false;
        }
        TextExampleElement textExampleElement = (TextExampleElement) obj;
        return m.a(this.text, textExampleElement.text) && m.a(this.subtext, textExampleElement.subtext) && m.a(this.audio, textExampleElement.audio) && this.isPlayingAudio == textExampleElement.isPlayingAudio;
    }

    public final String getAudio() {
        return this.audio;
    }

    public final Element getSubtext() {
        return this.subtext;
    }

    public final Element getText() {
        return this.text;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isPlayingAudio) + defpackage.e.d((this.subtext.hashCode() + (this.text.hashCode() * 31)) * 31, 31, this.audio);
    }

    public final boolean isPlayingAudio() {
        return this.isPlayingAudio;
    }

    public String toString() {
        return "TextExampleElement(text=" + this.text + ", subtext=" + this.subtext + ", audio=" + this.audio + ", isPlayingAudio=" + this.isPlayingAudio + ")";
    }

    public TextExampleElement(Element text, Element subtext, String audio, boolean z11) {
        m.f(text, "text");
        m.f(subtext, "subtext");
        m.f(audio, "audio");
        this.text = text;
        this.subtext = subtext;
        this.audio = audio;
        this.isPlayingAudio = z11;
    }

    public /* synthetic */ TextExampleElement(Element element, Element element2, String str, boolean z11, int i11, f fVar) {
        this(element, element2, str, (i11 & 8) != 0 ? false : z11);
    }
}
