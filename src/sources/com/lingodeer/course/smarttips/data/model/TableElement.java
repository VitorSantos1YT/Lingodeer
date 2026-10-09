package com.lingodeer.course.smarttips.data.model;

import c00.a;
import c00.e;
import com.bumptech.glide.d;
import e00.g;
import f00.b;
import g00.d1;
import g00.o1;
import g00.t1;
import java.util.List;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import qy.h;
import qy.j;
import rt.m9;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
@e
public final class TableElement {
    private final List<List<Element>> cells;
    private final String headerColor;
    private final String headerDirection;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final h[] $childSerializers = {d.u(j.PUBLICATION, new m9(21)), null, null};

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        private Companion() {
        }

        public final a serializer() {
            return TableElement$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public /* synthetic */ TableElement(int i11, List list, String str, String str2, o1 o1Var) {
        if (5 != (i11 & 5)) {
            d1.k(i11, 5, TableElement$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.cells = list;
        if ((i11 & 2) == 0) {
            this.headerColor = null;
        } else {
            this.headerColor = str;
        }
        this.headerDirection = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ a _childSerializers$_anonymous_() {
        return new g00.d(new g00.d(Element$$serializer.INSTANCE, 0), 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TableElement copy$default(TableElement tableElement, List list, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = tableElement.cells;
        }
        if ((i11 & 2) != 0) {
            str = tableElement.headerColor;
        }
        if ((i11 & 4) != 0) {
            str2 = tableElement.headerDirection;
        }
        return tableElement.copy(list, str, str2);
    }

    public static final /* synthetic */ void write$Self$course_release(TableElement tableElement, b bVar, g gVar) {
        bVar.A(gVar, 0, (a) $childSerializers[0].getValue(), tableElement.cells);
        if (bVar.G(gVar) || tableElement.headerColor != null) {
            bVar.x(gVar, 1, t1.f28468a, tableElement.headerColor);
        }
        bVar.w(gVar, 2, tableElement.headerDirection);
    }

    public final List<List<Element>> component1() {
        return this.cells;
    }

    public final String component2() {
        return this.headerColor;
    }

    public final String component3() {
        return this.headerDirection;
    }

    public final TableElement copy(List<? extends List<Element>> cells, String str, String headerDirection) {
        m.f(cells, "cells");
        m.f(headerDirection, "headerDirection");
        return new TableElement(cells, str, headerDirection);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TableElement)) {
            return false;
        }
        TableElement tableElement = (TableElement) obj;
        return m.a(this.cells, tableElement.cells) && m.a(this.headerColor, tableElement.headerColor) && m.a(this.headerDirection, tableElement.headerDirection);
    }

    public final List<List<Element>> getCells() {
        return this.cells;
    }

    public final String getHeaderColor() {
        return this.headerColor;
    }

    public final String getHeaderDirection() {
        return this.headerDirection;
    }

    public int hashCode() {
        int iHashCode = this.cells.hashCode() * 31;
        String str = this.headerColor;
        return this.headerDirection.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public String toString() {
        List<List<Element>> list = this.cells;
        String str = this.headerColor;
        String str2 = this.headerDirection;
        StringBuilder sb2 = new StringBuilder("TableElement(cells=");
        sb2.append(list);
        sb2.append(", headerColor=");
        sb2.append(str);
        sb2.append(", headerDirection=");
        return ep.a.k(sb2, str2, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TableElement(List<? extends List<Element>> cells, String str, String headerDirection) {
        m.f(cells, "cells");
        m.f(headerDirection, "headerDirection");
        this.cells = cells;
        this.headerColor = str;
        this.headerDirection = headerDirection;
    }

    public /* synthetic */ TableElement(List list, String str, String str2, int i11, f fVar) {
        this(list, (i11 & 2) != 0 ? null : str, str2);
    }
}
