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
public final class DividerElement {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String lineColor;
    private final String lineWeight;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        private Companion() {
        }

        public final a serializer() {
            return DividerElement$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public /* synthetic */ DividerElement(int i11, String str, String str2, o1 o1Var) {
        if (1 != (i11 & 1)) {
            d1.k(i11, 1, DividerElement$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.lineColor = str;
        if ((i11 & 2) == 0) {
            this.lineWeight = null;
        } else {
            this.lineWeight = str2;
        }
    }

    public static /* synthetic */ DividerElement copy$default(DividerElement dividerElement, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = dividerElement.lineColor;
        }
        if ((i11 & 2) != 0) {
            str2 = dividerElement.lineWeight;
        }
        return dividerElement.copy(str, str2);
    }

    public static final /* synthetic */ void write$Self$course_release(DividerElement dividerElement, b bVar, g gVar) {
        t1 t1Var = t1.f28468a;
        bVar.x(gVar, 0, t1Var, dividerElement.lineColor);
        if (!bVar.G(gVar) && dividerElement.lineWeight == null) {
            return;
        }
        bVar.x(gVar, 1, t1Var, dividerElement.lineWeight);
    }

    public final String component1() {
        return this.lineColor;
    }

    public final String component2() {
        return this.lineWeight;
    }

    public final DividerElement copy(String str, String str2) {
        return new DividerElement(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DividerElement)) {
            return false;
        }
        DividerElement dividerElement = (DividerElement) obj;
        return m.a(this.lineColor, dividerElement.lineColor) && m.a(this.lineWeight, dividerElement.lineWeight);
    }

    public final String getLineColor() {
        return this.lineColor;
    }

    public final String getLineWeight() {
        return this.lineWeight;
    }

    public int hashCode() {
        String str = this.lineColor;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.lineWeight;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return ep.a.h("DividerElement(lineColor=", this.lineColor, ", lineWeight=", this.lineWeight, ")");
    }

    public DividerElement(String str, String str2) {
        this.lineColor = str;
        this.lineWeight = str2;
    }

    public /* synthetic */ DividerElement(String str, String str2, int i11, f fVar) {
        this(str, (i11 & 2) != 0 ? null : str2);
    }
}
