package d0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f22811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g2.t f22812b;

    public v(float f5, g2.t tVar) {
        this.f22811a = f5;
        this.f22812b = tVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return v3.f.b(this.f22811a, vVar.f22811a) && this.f22812b.equals(vVar.f22812b);
    }

    public final int hashCode() {
        return this.f22812b.hashCode() + (Float.hashCode(this.f22811a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BorderStroke(width=");
        com.google.android.material.datepicker.d.s(this.f22811a, ", brush=", sb2);
        sb2.append(this.f22812b);
        sb2.append(')');
        return sb2.toString();
    }
}
