package q6;

import a0.p1;
import com.yalantis.ucrop.view.CropImageView;
import gb.r;
import pt.ImS.aYZzTH;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f47485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f47486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f47487c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f47488d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i f47489e;

    /* JADX WARN: Type inference failed for: r5v3, types: [q6.a] */
    public final qy.l a(float f5) {
        float fK = hz.b.k(f5, this.f47487c, this.f47488d);
        float f11 = this.f47488d;
        float f12 = this.f47487c;
        float f13 = (fK - f12) / (f11 - f12);
        i iVar = this.f47489e;
        final p1 p1Var = iVar.f47490a;
        final float f14 = f13 * this.f47486b;
        p1Var.getClass();
        final c c11 = this.f47485a;
        kotlin.jvm.internal.m.f(c11, "c");
        float[] fArr = c11.f47478a;
        final float fA = n.a(fArr[0] - p1Var.f166a, fArr[1] - p1Var.f167b);
        ?? r9 = new Object() { // from class: q6.a
            public final float a(float f15) {
                c c12 = c11;
                kotlin.jvm.internal.m.f(c12, "$c");
                p1 this$0 = p1Var;
                kotlin.jvm.internal.m.f(this$0, "this$0");
                long jC = c12.c(f15);
                return Math.abs(n.d(n.a(r.y(jC) - this$0.f166a, r.z(jC) - this$0.f167b) - fA, n.f47510c) - f14);
            }
        };
        float f15 = 0.0f;
        float f16 = 1.0f;
        while (f16 - f15 > 1.0E-5f) {
            float f17 = 2;
            float f18 = 3;
            float f19 = ((f17 * f15) + f16) / f18;
            float f21 = ((f17 * f16) + f15) / f18;
            if (r9.a(f19) < r9.a(f21)) {
                f16 = f21;
            } else {
                f15 = f19;
            }
        }
        float f22 = (f15 + f16) / 2;
        if (CropImageView.DEFAULT_ASPECT_RATIO > f22 || f22 > 1.0f) {
            throw new IllegalArgumentException("Cubic cut point is expected to be between 0 and 1");
        }
        qy.l lVarD = c11.d(f22);
        return new qy.l(new h(iVar, (c) lVarD.f48495a, this.f47487c, fK), new h(iVar, (c) lVarD.f48496b, fK, this.f47488d));
    }

    public final String toString() {
        return "MeasuredCubic(outlineProgress=[" + this.f47487c + " .. " + this.f47488d + "], size=" + this.f47486b + ", cubic=" + this.f47485a + ')';
    }

    public h(i iVar, c cVar, float f5, float f11) {
        kotlin.jvm.internal.m.f(cVar, aYZzTH.MHqDcyFzUhjCIJ);
        this.f47489e = iVar;
        this.f47485a = cVar;
        if (f11 >= f5) {
            this.f47486b = iVar.f47490a.c(cVar);
            this.f47487c = f5;
            this.f47488d = f11;
            return;
        }
        throw new IllegalArgumentException("endOutlineProgress is expected to be equal or greater than startOutlineProgress");
    }
}
