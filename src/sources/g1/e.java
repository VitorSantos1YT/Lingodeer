package g1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f28519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f28520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f28521c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f28522d;

    public e(float f5, float f11, float f12, float f13) {
        this.f28519a = f5;
        this.f28520b = f11;
        this.f28521c = f12;
        this.f28522d = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f28519a == eVar.f28519a && this.f28520b == eVar.f28520b && this.f28521c == eVar.f28521c && this.f28522d == eVar.f28522d;
    }

    public final int hashCode() {
        return Float.hashCode(this.f28522d) + defpackage.e.a(defpackage.e.a(Float.hashCode(this.f28519a) * 31, this.f28520b, 31), this.f28521c, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RippleAlpha(draggedAlpha=");
        sb2.append(this.f28519a);
        sb2.append(", focusedAlpha=");
        sb2.append(this.f28520b);
        sb2.append(", hoveredAlpha=");
        sb2.append(this.f28521c);
        sb2.append(", pressedAlpha=");
        return defpackage.e.o(sb2, this.f28522d, ')');
    }
}
