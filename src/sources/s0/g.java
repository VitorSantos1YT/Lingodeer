package s0;

import com.yalantis.ucrop.view.CropImageView;
import fr.j3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f51039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f51040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f51041c;

    public g(long j11, long j12, long j13) {
        this.f51039a = j11;
        this.f51040b = j12;
        this.f51041c = j13;
        long j14 = v3.o.f53501c;
        if (v3.o.a(j11, j14)) {
            throw new IllegalArgumentException("AutoSize.StepBased: TextUnit.Unspecified is not a valid value for minFontSize. Try using other values e.g. 10.sp");
        }
        if (v3.o.a(j12, j14)) {
            throw new IllegalArgumentException("AutoSize.StepBased: TextUnit.Unspecified is not a valid value for maxFontSize. Try using other values e.g. 100.sp");
        }
        if (v3.o.a(j13, j14)) {
            throw new IllegalArgumentException("AutoSize.StepBased: TextUnit.Unspecified is not a valid value for stepSize. Try using other values e.g. 0.25.sp");
        }
        if (v3.p.a(v3.o.b(j11), v3.o.b(j12))) {
            j3.j(j11, j12);
            if (Float.compare(v3.o.c(j11), v3.o.c(j12)) > 0) {
                this.f51039a = j12;
            }
        }
        if (v3.p.a(v3.o.b(j13), 4294967296L)) {
            long jL = j3.L(4294967296L, 1.0E-4f);
            j3.j(j13, jL);
            if (Float.compare(v3.o.c(j13), v3.o.c(jL)) < 0) {
                throw new IllegalArgumentException("AutoSize.StepBased: stepSize must be greater than or equal to 0.0001f.sp");
            }
        }
        if (v3.o.c(this.f51039a) < CropImageView.DEFAULT_ASPECT_RATIO) {
            throw new IllegalArgumentException("AutoSize.StepBased: minFontSize must not be negative");
        }
        if (v3.o.c(j12) < CropImageView.DEFAULT_ASPECT_RATIO) {
            throw new IllegalArgumentException("AutoSize.StepBased: maxFontSize must not be negative");
        }
    }

    public static boolean a(j3.u0 u0Var) {
        j3.x xVar = u0Var.f35798b;
        long j11 = u0Var.f35799c;
        j3.t0 t0Var = u0Var.f35797a;
        int i11 = t0Var.f35789f;
        if (i11 == 1 || i11 == 3) {
            return ((float) ((int) (j11 >> 32))) < xVar.f35816d || xVar.f35815c || ((float) ((int) (j11 & 4294967295L))) < xVar.f35817e;
        }
        if (i11 != 4 && i11 != 5 && i11 != 2) {
            throw new IllegalArgumentException("TextOverflow type " + ((Object) ub.a.f0(t0Var.f35789f)) + " is not supported.");
        }
        int i12 = xVar.f35818f;
        if (i12 != 0) {
            if (i12 == 1) {
                return u0Var.k(0);
            }
            if (i11 == 4 || i11 == 5) {
                return ((float) ((int) (j11 >> 32))) < xVar.f35816d || xVar.f35815c || ((float) ((int) (j11 & 4294967295L))) < xVar.f35817e;
            }
            if (i11 == 2) {
                return u0Var.k(i12 - 1);
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return v3.o.a(gVar.f51039a, this.f51039a) && v3.o.a(gVar.f51040b, this.f51040b) && v3.o.a(gVar.f51041c, this.f51041c);
    }

    public final int hashCode() {
        v3.p[] pVarArr = v3.o.f53500b;
        return Long.hashCode(this.f51041c) + defpackage.e.f(this.f51040b, Long.hashCode(this.f51039a) * 31, 31);
    }
}
