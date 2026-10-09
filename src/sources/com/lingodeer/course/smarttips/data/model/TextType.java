package com.lingodeer.course.smarttips.data.model;

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
public final class TextType {
    private final String background;
    private final Element element;
    private final String type;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        private Companion() {
        }

        public final a serializer() {
            return TextType$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public /* synthetic */ TextType(int i11, String str, String str2, Element element, o1 o1Var) {
        if (7 != (i11 & 7)) {
            d1.k(i11, 7, TextType$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.type = str;
        this.background = str2;
        this.element = element;
    }

    public static /* synthetic */ TextType copy$default(TextType textType, String str, String str2, Element element, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = textType.type;
        }
        if ((i11 & 2) != 0) {
            str2 = textType.background;
        }
        if ((i11 & 4) != 0) {
            element = textType.element;
        }
        return textType.copy(str, str2, element);
    }

    public static final /* synthetic */ void write$Self$course_release(TextType textType, b bVar, g gVar) {
        bVar.w(gVar, 0, textType.type);
        bVar.x(gVar, 1, t1.f28468a, textType.background);
        bVar.A(gVar, 2, Element$$serializer.INSTANCE, textType.element);
    }

    public final String component1() {
        return this.type;
    }

    public final String component2() {
        return this.background;
    }

    public final Element component3() {
        return this.element;
    }

    public final TextType copy(String type, String str, Element element) {
        m.f(type, "type");
        m.f(element, "element");
        return new TextType(type, str, element);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextType)) {
            return false;
        }
        TextType textType = (TextType) obj;
        return m.a(this.type, textType.type) && m.a(this.background, textType.background) && m.a(this.element, textType.element);
    }

    public final String getBackground() {
        return this.background;
    }

    public final Element getElement() {
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
        Element element = this.element;
        StringBuilder sbS = defpackage.e.s("TextType(type=", str, ", background=", str2, ", element=");
        sbS.append(element);
        sbS.append(")");
        return sbS.toString();
    }

    public TextType(String type, String str, Element element) {
        m.f(type, "type");
        m.f(element, "element");
        this.type = type;
        this.background = str;
        this.element = element;
    }
}
