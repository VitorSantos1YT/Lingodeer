package l2;

import com.google.type.bACG.scNRoQgKSYX;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class u extends b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f39686c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f39687d;

    public u(float f5, float f11) {
        super(3);
        this.f39686c = f5;
        this.f39687d = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return Float.compare(this.f39686c, uVar.f39686c) == 0 && Float.compare(this.f39687d, uVar.f39687d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f39687d) + (Float.hashCode(this.f39686c) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelativeLineTo(dx=");
        sb2.append(this.f39686c);
        sb2.append(scNRoQgKSYX.yzcyJ);
        return defpackage.e.o(sb2, this.f39687d, ')');
    }
}
