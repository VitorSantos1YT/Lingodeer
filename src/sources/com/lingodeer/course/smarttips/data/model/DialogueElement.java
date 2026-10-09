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
public final class DialogueElement {
    private final String audio;
    private final boolean isPlayingAudio;
    private final String position;
    private final Element subtext;
    private final Element text;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        private Companion() {
        }

        public final a serializer() {
            return DialogueElement$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public /* synthetic */ DialogueElement(int i11, Element element, Element element2, String str, String str2, boolean z11, o1 o1Var) {
        if (15 != (i11 & 15)) {
            d1.k(i11, 15, DialogueElement$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.text = element;
        this.subtext = element2;
        this.position = str;
        this.audio = str2;
        if ((i11 & 16) == 0) {
            this.isPlayingAudio = false;
        } else {
            this.isPlayingAudio = z11;
        }
    }

    public static /* synthetic */ DialogueElement copy$default(DialogueElement dialogueElement, Element element, Element element2, String str, String str2, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            element = dialogueElement.text;
        }
        if ((i11 & 2) != 0) {
            element2 = dialogueElement.subtext;
        }
        if ((i11 & 4) != 0) {
            str = dialogueElement.position;
        }
        if ((i11 & 8) != 0) {
            str2 = dialogueElement.audio;
        }
        if ((i11 & 16) != 0) {
            z11 = dialogueElement.isPlayingAudio;
        }
        boolean z12 = z11;
        String str3 = str;
        return dialogueElement.copy(element, element2, str3, str2, z12);
    }

    public static final /* synthetic */ void write$Self$course_release(DialogueElement dialogueElement, b bVar, g gVar) {
        Element$$serializer element$$serializer = Element$$serializer.INSTANCE;
        bVar.A(gVar, 0, element$$serializer, dialogueElement.text);
        bVar.A(gVar, 1, element$$serializer, dialogueElement.subtext);
        bVar.w(gVar, 2, dialogueElement.position);
        bVar.w(gVar, 3, dialogueElement.audio);
        if (bVar.G(gVar) || dialogueElement.isPlayingAudio) {
            bVar.B(gVar, 4, dialogueElement.isPlayingAudio);
        }
    }

    public final Element component1() {
        return this.text;
    }

    public final Element component2() {
        return this.subtext;
    }

    public final String component3() {
        return this.position;
    }

    public final String component4() {
        return this.audio;
    }

    public final boolean component5() {
        return this.isPlayingAudio;
    }

    public final DialogueElement copy(Element text, Element subtext, String position, String audio, boolean z11) {
        m.f(text, "text");
        m.f(subtext, "subtext");
        m.f(position, "position");
        m.f(audio, "audio");
        return new DialogueElement(text, subtext, position, audio, z11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DialogueElement)) {
            return false;
        }
        DialogueElement dialogueElement = (DialogueElement) obj;
        return m.a(this.text, dialogueElement.text) && m.a(this.subtext, dialogueElement.subtext) && m.a(this.position, dialogueElement.position) && m.a(this.audio, dialogueElement.audio) && this.isPlayingAudio == dialogueElement.isPlayingAudio;
    }

    public final String getAudio() {
        return this.audio;
    }

    public final String getPosition() {
        return this.position;
    }

    public final Element getSubtext() {
        return this.subtext;
    }

    public final Element getText() {
        return this.text;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isPlayingAudio) + defpackage.e.d(defpackage.e.d((this.subtext.hashCode() + (this.text.hashCode() * 31)) * 31, 31, this.position), 31, this.audio);
    }

    public final boolean isPlayingAudio() {
        return this.isPlayingAudio;
    }

    public String toString() {
        Element element = this.text;
        Element element2 = this.subtext;
        String str = this.position;
        String str2 = this.audio;
        boolean z11 = this.isPlayingAudio;
        StringBuilder sb2 = new StringBuilder("DialogueElement(text=");
        sb2.append(element);
        sb2.append(", subtext=");
        sb2.append(element2);
        sb2.append(", position=");
        d.w(sb2, str, ", audio=", str2, ", isPlayingAudio=");
        return p0.p(sb2, z11, ")");
    }

    public DialogueElement(Element text, Element subtext, String position, String audio, boolean z11) {
        m.f(text, "text");
        m.f(subtext, "subtext");
        m.f(position, "position");
        m.f(audio, "audio");
        this.text = text;
        this.subtext = subtext;
        this.position = position;
        this.audio = audio;
        this.isPlayingAudio = z11;
    }

    public /* synthetic */ DialogueElement(Element element, Element element2, String str, String str2, boolean z11, int i11, f fVar) {
        this(element, element2, str, str2, (i11 & 16) != 0 ? false : z11);
    }
}
