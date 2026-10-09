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
public final class DividerType {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final DividerElement element;
    private final String type;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        private Companion() {
        }

        public final a serializer() {
            return DividerType$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public /* synthetic */ DividerType(int i11, String str, DividerElement dividerElement, o1 o1Var) {
        if (3 != (i11 & 3)) {
            d1.k(i11, 3, DividerType$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.type = str;
        this.element = dividerElement;
    }

    public static /* synthetic */ DividerType copy$default(DividerType dividerType, String str, DividerElement dividerElement, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = dividerType.type;
        }
        if ((i11 & 2) != 0) {
            dividerElement = dividerType.element;
        }
        return dividerType.copy(str, dividerElement);
    }

    public static final /* synthetic */ void write$Self$course_release(DividerType dividerType, b bVar, g gVar) {
        bVar.w(gVar, 0, dividerType.type);
        bVar.A(gVar, 1, DividerElement$$serializer.INSTANCE, dividerType.element);
    }

    public final String component1() {
        return this.type;
    }

    public final DividerElement component2() {
        return this.element;
    }

    public final DividerType copy(String type, DividerElement element) {
        m.f(type, "type");
        m.f(element, "element");
        return new DividerType(type, element);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DividerType)) {
            return false;
        }
        DividerType dividerType = (DividerType) obj;
        return m.a(this.type, dividerType.type) && m.a(this.element, dividerType.element);
    }

    public final DividerElement getElement() {
        return this.element;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return this.element.hashCode() + (this.type.hashCode() * 31);
    }

    public String toString() {
        return "DividerType(type=" + this.type + ", element=" + this.element + ")";
    }

    public DividerType(String type, DividerElement element) {
        m.f(type, "type");
        m.f(element, "element");
        this.type = type;
        this.element = element;
    }
}
