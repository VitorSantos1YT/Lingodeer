package com.lingodeer.course.smarttips.data.model;

import c00.a;
import c00.e;
import e00.g;
import f00.b;
import g00.o1;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import w4.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
@e
public final class Style {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final Attr attr;
    private final int from;

    /* JADX INFO: renamed from: to, reason: collision with root package name */
    private final int f22256to;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        private Companion() {
        }

        public final a serializer() {
            return Style$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public Style() {
        this(0, 0, (Attr) null, 7, (f) null);
    }

    public static /* synthetic */ Style copy$default(Style style, int i11, int i12, Attr attr, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = style.from;
        }
        if ((i13 & 2) != 0) {
            i12 = style.f22256to;
        }
        if ((i13 & 4) != 0) {
            attr = style.attr;
        }
        return style.copy(i11, i12, attr);
    }

    public static final /* synthetic */ void write$Self$course_release(Style style, b bVar, g gVar) {
        if (bVar.G(gVar) || style.from != 0) {
            bVar.g(0, style.from, gVar);
        }
        if (bVar.G(gVar) || style.f22256to != 0) {
            bVar.g(1, style.f22256to, gVar);
        }
        if (!bVar.G(gVar) && style.attr == null) {
            return;
        }
        bVar.x(gVar, 2, Attr$$serializer.INSTANCE, style.attr);
    }

    public final int component1() {
        return this.from;
    }

    public final int component2() {
        return this.f22256to;
    }

    public final Attr component3() {
        return this.attr;
    }

    public final Style copy(int i11, int i12, Attr attr) {
        return new Style(i11, i12, attr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Style)) {
            return false;
        }
        Style style = (Style) obj;
        return this.from == style.from && this.f22256to == style.f22256to && m.a(this.attr, style.attr);
    }

    public final Attr getAttr() {
        return this.attr;
    }

    public final int getFrom() {
        return this.from;
    }

    public final int getTo() {
        return this.f22256to;
    }

    public int hashCode() {
        int iB = defpackage.e.b(this.f22256to, Integer.hashCode(this.from) * 31, 31);
        Attr attr = this.attr;
        return iB + (attr == null ? 0 : attr.hashCode());
    }

    public String toString() {
        int i11 = this.from;
        int i12 = this.f22256to;
        Attr attr = this.attr;
        StringBuilder sbK = c.k("Style(from=", i11, ", to=", i12, ", attr=");
        sbK.append(attr);
        sbK.append(")");
        return sbK.toString();
    }

    public /* synthetic */ Style(int i11, int i12, int i13, Attr attr, o1 o1Var) {
        if ((i11 & 1) == 0) {
            this.from = 0;
        } else {
            this.from = i12;
        }
        if ((i11 & 2) == 0) {
            this.f22256to = 0;
        } else {
            this.f22256to = i13;
        }
        if ((i11 & 4) == 0) {
            this.attr = null;
        } else {
            this.attr = attr;
        }
    }

    public Style(int i11, int i12, Attr attr) {
        this.from = i11;
        this.f22256to = i12;
        this.attr = attr;
    }

    public /* synthetic */ Style(int i11, int i12, Attr attr, int i13, f fVar) {
        this((i13 & 1) != 0 ? 0 : i11, (i13 & 2) != 0 ? 0 : i12, (i13 & 4) != 0 ? null : attr);
    }
}
