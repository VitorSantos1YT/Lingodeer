package com.lingodeer.course.smarttips.data.model;

import c00.a;
import c00.e;
import com.google.android.material.datepicker.d;
import e00.g;
import f00.b;
import g00.d1;
import g00.o1;
import hh.p0;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
@e
public final class AudioExampleElement {
    private final String audio;
    private final String audioText;
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
            return AudioExampleElement$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public /* synthetic */ AudioExampleElement(int i11, Element element, Element element2, String str, String str2, boolean z11, o1 o1Var) {
        if (15 != (i11 & 15)) {
            d1.k(i11, 15, AudioExampleElement$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.text = element;
        this.subtext = element2;
        this.audioText = str;
        this.audio = str2;
        if ((i11 & 16) == 0) {
            this.isPlayingAudio = false;
        } else {
            this.isPlayingAudio = z11;
        }
    }

    public static /* synthetic */ AudioExampleElement copy$default(AudioExampleElement audioExampleElement, Element element, Element element2, String str, String str2, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            element = audioExampleElement.text;
        }
        if ((i11 & 2) != 0) {
            element2 = audioExampleElement.subtext;
        }
        if ((i11 & 4) != 0) {
            str = audioExampleElement.audioText;
        }
        if ((i11 & 8) != 0) {
            str2 = audioExampleElement.audio;
        }
        if ((i11 & 16) != 0) {
            z11 = audioExampleElement.isPlayingAudio;
        }
        boolean z12 = z11;
        String str3 = str;
        return audioExampleElement.copy(element, element2, str3, str2, z12);
    }

    public static final /* synthetic */ void write$Self$course_release(AudioExampleElement audioExampleElement, b bVar, g gVar) {
        Element$$serializer element$$serializer = Element$$serializer.INSTANCE;
        bVar.A(gVar, 0, element$$serializer, audioExampleElement.text);
        bVar.A(gVar, 1, element$$serializer, audioExampleElement.subtext);
        bVar.w(gVar, 2, audioExampleElement.audioText);
        bVar.w(gVar, 3, audioExampleElement.audio);
        if (bVar.G(gVar) || audioExampleElement.isPlayingAudio) {
            bVar.B(gVar, 4, audioExampleElement.isPlayingAudio);
        }
    }

    public final Element component1() {
        return this.text;
    }

    public final Element component2() {
        return this.subtext;
    }

    public final String component3() {
        return this.audioText;
    }

    public final String component4() {
        return this.audio;
    }

    public final boolean component5() {
        return this.isPlayingAudio;
    }

    public final AudioExampleElement copy(Element text, Element subtext, String audioText, String audio, boolean z11) {
        m.f(text, "text");
        m.f(subtext, "subtext");
        m.f(audioText, "audioText");
        m.f(audio, "audio");
        return new AudioExampleElement(text, subtext, audioText, audio, z11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioExampleElement)) {
            return false;
        }
        AudioExampleElement audioExampleElement = (AudioExampleElement) obj;
        return m.a(this.text, audioExampleElement.text) && m.a(this.subtext, audioExampleElement.subtext) && m.a(this.audioText, audioExampleElement.audioText) && m.a(this.audio, audioExampleElement.audio) && this.isPlayingAudio == audioExampleElement.isPlayingAudio;
    }

    public final String getAudio() {
        return this.audio;
    }

    public final String getAudioText() {
        return this.audioText;
    }

    public final Element getSubtext() {
        return this.subtext;
    }

    public final Element getText() {
        return this.text;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isPlayingAudio) + defpackage.e.d(defpackage.e.d((this.subtext.hashCode() + (this.text.hashCode() * 31)) * 31, 31, this.audioText), 31, this.audio);
    }

    public final boolean isPlayingAudio() {
        return this.isPlayingAudio;
    }

    public String toString() {
        Element element = this.text;
        Element element2 = this.subtext;
        String str = this.audioText;
        String str2 = this.audio;
        boolean z11 = this.isPlayingAudio;
        StringBuilder sb2 = new StringBuilder("AudioExampleElement(text=");
        sb2.append(element);
        sb2.append(", subtext=");
        sb2.append(element2);
        sb2.append(", audioText=");
        d.w(sb2, str, ", audio=", str2, ", isPlayingAudio=");
        return p0.p(sb2, z11, ")");
    }

    public AudioExampleElement(Element text, Element subtext, String audioText, String audio, boolean z11) {
        m.f(text, "text");
        m.f(subtext, "subtext");
        m.f(audioText, "audioText");
        m.f(audio, "audio");
        this.text = text;
        this.subtext = subtext;
        this.audioText = audioText;
        this.audio = audio;
        this.isPlayingAudio = z11;
    }

    public /* synthetic */ AudioExampleElement(Element element, Element element2, String str, String str2, boolean z11, int i11, f fVar) {
        this(element, element2, str, str2, (i11 & 16) != 0 ? false : z11);
    }
}
