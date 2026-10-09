package j0;

import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f35441a = CropImageView.DEFAULT_ASPECT_RATIO;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f35442b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f35443c = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y1)) {
            return false;
        }
        y1 y1Var = (y1) obj;
        return Float.compare(this.f35441a, y1Var.f35441a) == 0 && this.f35442b == y1Var.f35442b && kotlin.jvm.internal.m.a(this.f35443c, y1Var.f35443c);
    }

    public final int hashCode() {
        int iE = defpackage.e.e(Float.hashCode(this.f35441a) * 31, 31, this.f35442b);
        c cVar = this.f35443c;
        return (iE + (cVar == null ? 0 : cVar.hashCode())) * 31;
    }

    public final String toString() {
        return "RowColumnParentData(weight=" + this.f35441a + ", fill=" + this.f35442b + ", crossAxisAlignment=" + this.f35443c + ", flowLayoutData=null)";
    }
}
