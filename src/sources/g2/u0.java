package g2;

import android.graphics.Paint;
import android.graphics.Shader;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class u0 extends t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a5.f f28608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f28609b = 9205357640488583168L;

    @Override // g2.t
    public final void a(float f5, long j11, a.a aVar) {
        a5.f fVar = this.f28608a;
        if (fVar == null || !f2.e.a(this.f28609b, j11)) {
            if (f2.e.e(j11)) {
                this.f28608a = null;
                this.f28609b = 9205357640488583168L;
                fVar = null;
            } else {
                fVar = this.f28608a;
                if (fVar == null) {
                    fVar = new a5.f(11, false);
                    this.f28608a = fVar;
                }
                fVar.f378b = b(j11);
                this.f28608a = fVar;
                this.f28609b = j11;
            }
        }
        Paint paint = (Paint) aVar.f6c;
        long jC = f0.c(paint.getColor());
        long j12 = x.f28615b;
        if (!x.d(jC, j12)) {
            aVar.N(j12);
        }
        if (!kotlin.jvm.internal.m.a((Shader) aVar.f7d, fVar != null ? (Shader) fVar.f378b : null)) {
            aVar.R(fVar != null ? (Shader) fVar.f378b : null);
        }
        if (paint.getAlpha() / 255.0f == f5) {
            return;
        }
        aVar.L(f5);
    }

    public abstract Shader b(long j11);
}
