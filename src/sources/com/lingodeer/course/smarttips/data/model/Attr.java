package com.lingodeer.course.smarttips.data.model;

import c00.a;
import c00.e;
import e00.g;
import f00.b;
import g00.o1;
import g00.t1;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
@e
public final class Attr {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String fontSize;
    private final String fontWeight;
    private final String textColor;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        private Companion() {
        }

        public final a serializer() {
            return Attr$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public Attr() {
        this((String) null, (String) null, (String) null, 7, (f) null);
    }

    public static /* synthetic */ Attr copy$default(Attr attr, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = attr.fontSize;
        }
        if ((i11 & 2) != 0) {
            str2 = attr.fontWeight;
        }
        if ((i11 & 4) != 0) {
            str3 = attr.textColor;
        }
        return attr.copy(str, str2, str3);
    }

    public static final /* synthetic */ void write$Self$course_release(Attr attr, b bVar, g gVar) {
        if (bVar.G(gVar) || attr.fontSize != null) {
            bVar.x(gVar, 0, t1.f28468a, attr.fontSize);
        }
        if (bVar.G(gVar) || attr.fontWeight != null) {
            bVar.x(gVar, 1, t1.f28468a, attr.fontWeight);
        }
        if (!bVar.G(gVar) && attr.textColor == null) {
            return;
        }
        bVar.x(gVar, 2, t1.f28468a, attr.textColor);
    }

    public final String component1() {
        return this.fontSize;
    }

    public final String component2() {
        return this.fontWeight;
    }

    public final String component3() {
        return this.textColor;
    }

    public final Attr copy(String str, String str2, String str3) {
        return new Attr(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Attr)) {
            return false;
        }
        Attr attr = (Attr) obj;
        return m.a(this.fontSize, attr.fontSize) && m.a(this.fontWeight, attr.fontWeight) && m.a(this.textColor, attr.textColor);
    }

    public final String getFontSize() {
        return this.fontSize;
    }

    public final String getFontWeight() {
        return this.fontWeight;
    }

    public final String getTextColor() {
        return this.textColor;
    }

    public int hashCode() {
        String str = this.fontSize;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.fontWeight;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.textColor;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        String str = this.fontSize;
        String str2 = this.fontWeight;
        return ep.a.k(defpackage.e.s("Attr(fontSize=", str, ", fontWeight=", str2, ", textColor="), this.textColor, ")");
    }

    public /* synthetic */ Attr(int i11, String str, String str2, String str3, o1 o1Var) {
        if ((i11 & 1) == 0) {
            this.fontSize = null;
        } else {
            this.fontSize = str;
        }
        if ((i11 & 2) == 0) {
            this.fontWeight = null;
        } else {
            this.fontWeight = str2;
        }
        if ((i11 & 4) == 0) {
            this.textColor = null;
        } else {
            this.textColor = str3;
        }
    }

    public Attr(String str, String str2, String str3) {
        this.fontSize = str;
        this.fontWeight = str2;
        this.textColor = str3;
    }

    public /* synthetic */ Attr(String str, String str2, String str3, int i11, f fVar) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3);
    }
}
