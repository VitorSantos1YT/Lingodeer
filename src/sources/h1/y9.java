package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class y9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f31367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f31368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f31369c;

    public y9(float f5, float f11, float f12) {
        this.f31367a = f5;
        this.f31368b = f11;
        this.f31369c = f12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y9)) {
            return false;
        }
        y9 y9Var = (y9) obj;
        return v3.f.b(this.f31367a, y9Var.f31367a) && v3.f.b(this.f31368b, y9Var.f31368b) && v3.f.b(this.f31369c, y9Var.f31369c);
    }

    public final int hashCode() {
        return Float.hashCode(this.f31369c) + defpackage.e.a(Float.hashCode(this.f31367a) * 31, this.f31368b, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TabPosition(left=");
        float f5 = this.f31367a;
        com.google.android.material.datepicker.d.s(f5, ", right=", sb2);
        float f11 = this.f31368b;
        sb2.append((Object) v3.f.c(f5 + f11));
        sb2.append(", width=");
        sb2.append((Object) v3.f.c(f11));
        sb2.append(", contentWidth=");
        sb2.append((Object) v3.f.c(this.f31369c));
        sb2.append(')');
        return sb2.toString();
    }
}
