package z4;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class o1 extends n1 {
    public o1(v1 v1Var, WindowInsets windowInsets) {
        super(v1Var, windowInsets);
    }

    @Override // z4.s1
    public v1 a() {
        return v1.h(null, this.f58867c.consumeDisplayCutout());
    }

    @Override // z4.m1, z4.s1
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o1)) {
            return false;
        }
        o1 o1Var = (o1) obj;
        return Objects.equals(this.f58867c, o1Var.f58867c) && Objects.equals(this.f58871g, o1Var.f58871g) && m1.C(this.f58872h, o1Var.f58872h);
    }

    @Override // z4.s1
    public j f() {
        DisplayCutout displayCutout = this.f58867c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new j(displayCutout);
    }

    @Override // z4.s1
    public int hashCode() {
        return this.f58867c.hashCode();
    }

    public o1(v1 v1Var, o1 o1Var) {
        super(v1Var, o1Var);
    }
}
