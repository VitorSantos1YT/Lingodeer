package com.lingo.lingoskill.object;

import c00.e;
import e00.g;
import f00.b;
import g00.d1;
import g00.o1;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@e
public final class AreaAndAge {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final int age;
    private final String area;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        private Companion() {
        }

        public final c00.a serializer() {
            return AreaAndAge$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public /* synthetic */ AreaAndAge(int i11, String str, int i12, o1 o1Var) {
        if (3 != (i11 & 3)) {
            d1.k(i11, 3, AreaAndAge$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.area = str;
        this.age = i12;
    }

    public static /* synthetic */ AreaAndAge copy$default(AreaAndAge areaAndAge, String str, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = areaAndAge.area;
        }
        if ((i12 & 2) != 0) {
            i11 = areaAndAge.age;
        }
        return areaAndAge.copy(str, i11);
    }

    public static final /* synthetic */ void write$Self$app_release(AreaAndAge areaAndAge, b bVar, g gVar) {
        bVar.w(gVar, 0, areaAndAge.area);
        bVar.g(1, areaAndAge.age, gVar);
    }

    public final String component1() {
        return this.area;
    }

    public final int component2() {
        return this.age;
    }

    public final AreaAndAge copy(String area, int i11) {
        m.f(area, "area");
        return new AreaAndAge(area, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AreaAndAge)) {
            return false;
        }
        AreaAndAge areaAndAge = (AreaAndAge) obj;
        return m.a(this.area, areaAndAge.area) && this.age == areaAndAge.age;
    }

    public final int getAge() {
        return this.age;
    }

    public final String getArea() {
        return this.area;
    }

    public int hashCode() {
        return Integer.hashCode(this.age) + (this.area.hashCode() * 31);
    }

    public String toString() {
        return "AreaAndAge(area=" + this.area + ", age=" + this.age + ")";
    }

    public AreaAndAge(String area, int i11) {
        m.f(area, "area");
        this.area = area;
        this.age = i11;
    }
}
