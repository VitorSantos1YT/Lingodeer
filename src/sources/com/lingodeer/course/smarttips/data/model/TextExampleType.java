package com.lingodeer.course.smarttips.data.model;

import a.ar.MFeWs;
import c00.a;
import c00.e;
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
public final class TextExampleType {
    private final String background;
    private final TextExampleElement element;
    private final String type;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        private Companion() {
        }

        public final a serializer() {
            return TextExampleType$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public /* synthetic */ TextExampleType(int i11, String str, String str2, TextExampleElement textExampleElement, o1 o1Var) {
        if (7 != (i11 & 7)) {
            d1.k(i11, 7, TextExampleType$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.type = str;
        this.background = str2;
        this.element = textExampleElement;
    }

    public static /* synthetic */ TextExampleType copy$default(TextExampleType textExampleType, String str, String str2, TextExampleElement textExampleElement, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = textExampleType.type;
        }
        if ((i11 & 2) != 0) {
            str2 = textExampleType.background;
        }
        if ((i11 & 4) != 0) {
            textExampleElement = textExampleType.element;
        }
        return textExampleType.copy(str, str2, textExampleElement);
    }

    public static final /* synthetic */ void write$Self$course_release(TextExampleType textExampleType, b bVar, g gVar) {
        bVar.w(gVar, 0, textExampleType.type);
        bVar.x(gVar, 1, t1.f28468a, textExampleType.background);
        bVar.A(gVar, 2, TextExampleElement$$serializer.INSTANCE, textExampleType.element);
    }

    public final String component1() {
        return this.type;
    }

    public final String component2() {
        return this.background;
    }

    public final TextExampleElement component3() {
        return this.element;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextExampleType)) {
            return false;
        }
        TextExampleType textExampleType = (TextExampleType) obj;
        return m.a(this.type, textExampleType.type) && m.a(this.background, textExampleType.background) && m.a(this.element, textExampleType.element);
    }

    public final String getBackground() {
        return this.background;
    }

    public final TextExampleElement getElement() {
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
        TextExampleElement textExampleElement = this.element;
        StringBuilder sbS = defpackage.e.s("TextExampleType(type=", str, ", background=", str2, ", element=");
        sbS.append(textExampleElement);
        sbS.append(")");
        return sbS.toString();
    }

    public TextExampleType(String type, String str, TextExampleElement element) {
        m.f(type, "type");
        m.f(element, "element");
        this.type = type;
        this.background = str;
        this.element = element;
    }

    public final TextExampleType copy(String type, String str, TextExampleElement textExampleElement) {
        m.f(type, "type");
        m.f(textExampleElement, MFeWs.KUfy);
        return new TextExampleType(type, str, textExampleElement);
    }
}
