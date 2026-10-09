package g2;

import android.graphics.Path;
import android.graphics.RectF;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public interface p0 {
    static void a(p0 p0Var, f2.c cVar) {
        Path.Direction direction;
        o0 o0Var = o0.CounterClockwise;
        k kVar = (k) p0Var;
        float f5 = cVar.f26572a;
        float f11 = cVar.f26575d;
        float f12 = cVar.f26574c;
        float f13 = cVar.f26573b;
        if (Float.isNaN(f5) || Float.isNaN(f13) || Float.isNaN(f12) || Float.isNaN(f11)) {
            o.b("Invalid rectangle, make sure no value is NaN");
        }
        if (kVar.f28576b == null) {
            kVar.f28576b = new RectF();
        }
        RectF rectF = kVar.f28576b;
        kotlin.jvm.internal.m.c(rectF);
        rectF.set(f5, f13, f12, f11);
        Path path = kVar.f28575a;
        RectF rectF2 = kVar.f28576b;
        kotlin.jvm.internal.m.c(rectF2);
        int i11 = n.f28586a[o0Var.ordinal()];
        if (i11 == 1) {
            direction = Path.Direction.CCW;
        } else {
            if (i11 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            direction = Path.Direction.CW;
        }
        path.addRect(rectF2, direction);
    }

    static void b(k kVar, p0 p0Var) {
        Path path = kVar.f28575a;
        if (!(p0Var instanceof k)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        path.addPath(((k) p0Var).f28575a, Float.intBitsToFloat((int) 0), Float.intBitsToFloat((int) 0));
    }

    static void c(p0 p0Var, f2.d dVar) {
        Path.Direction direction;
        o0 o0Var = o0.CounterClockwise;
        k kVar = (k) p0Var;
        if (kVar.f28576b == null) {
            kVar.f28576b = new RectF();
        }
        RectF rectF = kVar.f28576b;
        kotlin.jvm.internal.m.c(rectF);
        float f5 = dVar.f26576a;
        long j11 = dVar.f26583h;
        long j12 = dVar.f26582g;
        long j13 = dVar.f26581f;
        long j14 = dVar.f26580e;
        rectF.set(f5, dVar.f26577b, dVar.f26578c, dVar.f26579d);
        if (kVar.f28577c == null) {
            kVar.f28577c = new float[8];
        }
        float[] fArr = kVar.f28577c;
        kotlin.jvm.internal.m.c(fArr);
        fArr[0] = Float.intBitsToFloat((int) (j14 >> 32));
        fArr[1] = Float.intBitsToFloat((int) (j14 & 4294967295L));
        fArr[2] = Float.intBitsToFloat((int) (j13 >> 32));
        fArr[3] = Float.intBitsToFloat((int) (j13 & 4294967295L));
        fArr[4] = Float.intBitsToFloat((int) (j12 >> 32));
        fArr[5] = Float.intBitsToFloat((int) (j12 & 4294967295L));
        fArr[6] = Float.intBitsToFloat((int) (j11 >> 32));
        fArr[7] = Float.intBitsToFloat((int) (j11 & 4294967295L));
        Path path = kVar.f28575a;
        RectF rectF2 = kVar.f28576b;
        kotlin.jvm.internal.m.c(rectF2);
        float[] fArr2 = kVar.f28577c;
        kotlin.jvm.internal.m.c(fArr2);
        int i11 = n.f28586a[o0Var.ordinal()];
        if (i11 == 1) {
            direction = Path.Direction.CCW;
        } else {
            if (i11 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            direction = Path.Direction.CW;
        }
        path.addRoundRect(rectF2, fArr2, direction);
    }
}
