package com.lingodeer.course.smarttips.data.model;

import c00.a;
import c00.e;
import com.bumptech.glide.d;
import com.tbruyelle.rxpermissions3.BuildConfig;
import e00.g;
import f00.b;
import g00.d1;
import g00.o1;
import hh.p0;
import java.util.List;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import qy.h;
import qy.j;
import rt.m9;
import ry.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
@e
public final class Element {
    private static final h[] $childSerializers;
    private final String alignment;
    private final List<Audio> audios;
    private final String content;
    private final List<Hint> hints;
    private final List<Style> styles;
    private final String verticalAlignment;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        private Companion() {
        }

        public final a serializer() {
            return Element$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    static {
        j jVar = j.PUBLICATION;
        $childSerializers = new h[]{null, null, null, d.u(jVar, new m9(18)), d.u(jVar, new m9(19)), d.u(jVar, new m9(20))};
    }

    public /* synthetic */ Element(int i11, String str, String str2, String str3, List list, List list2, List list3, o1 o1Var) {
        if (5 != (i11 & 5)) {
            d1.k(i11, 5, Element$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.alignment = str;
        if ((i11 & 2) == 0) {
            this.verticalAlignment = BuildConfig.VERSION_NAME;
        } else {
            this.verticalAlignment = str2;
        }
        this.content = str3;
        int i12 = i11 & 8;
        r rVar = r.f50854a;
        if (i12 == 0) {
            this.styles = rVar;
        } else {
            this.styles = list;
        }
        if ((i11 & 16) == 0) {
            this.audios = rVar;
        } else {
            this.audios = list2;
        }
        if ((i11 & 32) == 0) {
            this.hints = rVar;
        } else {
            this.hints = list3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ a _childSerializers$_anonymous_() {
        return new g00.d(Style$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ a _childSerializers$_anonymous_$0() {
        return new g00.d(Audio$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ a _childSerializers$_anonymous_$1() {
        return new g00.d(Hint$$serializer.INSTANCE, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Element copy$default(Element element, String str, String str2, String str3, List list, List list2, List list3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = element.alignment;
        }
        if ((i11 & 2) != 0) {
            str2 = element.verticalAlignment;
        }
        if ((i11 & 4) != 0) {
            str3 = element.content;
        }
        if ((i11 & 8) != 0) {
            list = element.styles;
        }
        if ((i11 & 16) != 0) {
            list2 = element.audios;
        }
        if ((i11 & 32) != 0) {
            list3 = element.hints;
        }
        List list4 = list2;
        List list5 = list3;
        return element.copy(str, str2, str3, list, list4, list5);
    }

    public static final /* synthetic */ void write$Self$course_release(Element element, b bVar, g gVar) {
        h[] hVarArr = $childSerializers;
        bVar.w(gVar, 0, element.alignment);
        if (bVar.G(gVar) || !m.a(element.verticalAlignment, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 1, element.verticalAlignment);
        }
        bVar.w(gVar, 2, element.content);
        boolean zG = bVar.G(gVar);
        r rVar = r.f50854a;
        if (zG || !m.a(element.styles, rVar)) {
            bVar.A(gVar, 3, (a) hVarArr[3].getValue(), element.styles);
        }
        if (bVar.G(gVar) || !m.a(element.audios, rVar)) {
            bVar.A(gVar, 4, (a) hVarArr[4].getValue(), element.audios);
        }
        if (!bVar.G(gVar) && m.a(element.hints, rVar)) {
            return;
        }
        bVar.A(gVar, 5, (a) hVarArr[5].getValue(), element.hints);
    }

    public final String component1() {
        return this.alignment;
    }

    public final String component2() {
        return this.verticalAlignment;
    }

    public final String component3() {
        return this.content;
    }

    public final List<Style> component4() {
        return this.styles;
    }

    public final List<Audio> component5() {
        return this.audios;
    }

    public final List<Hint> component6() {
        return this.hints;
    }

    public final Element copy(String alignment, String verticalAlignment, String content, List<Style> styles, List<Audio> audios, List<Hint> hints) {
        m.f(alignment, "alignment");
        m.f(verticalAlignment, "verticalAlignment");
        m.f(content, "content");
        m.f(styles, "styles");
        m.f(audios, "audios");
        m.f(hints, "hints");
        return new Element(alignment, verticalAlignment, content, styles, audios, hints);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Element)) {
            return false;
        }
        Element element = (Element) obj;
        return m.a(this.alignment, element.alignment) && m.a(this.verticalAlignment, element.verticalAlignment) && m.a(this.content, element.content) && m.a(this.styles, element.styles) && m.a(this.audios, element.audios) && m.a(this.hints, element.hints);
    }

    public final String getAlignment() {
        return this.alignment;
    }

    public final List<Audio> getAudios() {
        return this.audios;
    }

    public final String getContent() {
        return this.content;
    }

    public final List<Hint> getHints() {
        return this.hints;
    }

    public final List<Style> getStyles() {
        return this.styles;
    }

    public final String getVerticalAlignment() {
        return this.verticalAlignment;
    }

    public int hashCode() {
        return this.hints.hashCode() + p0.b(p0.b(defpackage.e.d(defpackage.e.d(this.alignment.hashCode() * 31, 31, this.verticalAlignment), 31, this.content), 31, this.styles), 31, this.audios);
    }

    public String toString() {
        String str = this.alignment;
        String str2 = this.verticalAlignment;
        String str3 = this.content;
        List<Style> list = this.styles;
        List<Audio> list2 = this.audios;
        List<Hint> list3 = this.hints;
        StringBuilder sbS = defpackage.e.s("Element(alignment=", str, ", verticalAlignment=", str2, ", content=");
        sbS.append(str3);
        sbS.append(", styles=");
        sbS.append(list);
        sbS.append(", audios=");
        sbS.append(list2);
        sbS.append(", hints=");
        sbS.append(list3);
        sbS.append(")");
        return sbS.toString();
    }

    public Element(String alignment, String verticalAlignment, String content, List<Style> styles, List<Audio> audios, List<Hint> hints) {
        m.f(alignment, "alignment");
        m.f(verticalAlignment, "verticalAlignment");
        m.f(content, "content");
        m.f(styles, "styles");
        m.f(audios, "audios");
        m.f(hints, "hints");
        this.alignment = alignment;
        this.verticalAlignment = verticalAlignment;
        this.content = content;
        this.styles = styles;
        this.audios = audios;
        this.hints = hints;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ Element(String str, String str2, String str3, List list, List list2, List list3, int i11, f fVar) {
        String str4 = (i11 & 2) != 0 ? BuildConfig.VERSION_NAME : str2;
        int i12 = i11 & 8;
        r rVar = r.f50854a;
        this(str, str4, str3, i12 != 0 ? rVar : list, (i11 & 16) != 0 ? rVar : list2, (i11 & 32) != 0 ? rVar : list3);
    }
}
