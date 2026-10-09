package ys;

import android.graphics.DashPathEffect;
import com.lingodeer.data.model.CourseUnit;
import com.lingodeer.data.model.UnitDirection;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class r2 implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f58240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f58241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CourseUnit f58242c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f58243d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f58244e;

    public /* synthetic */ r2(float f5, CourseUnit courseUnit, long j11, long j12, int i11) {
        this.f58240a = i11;
        this.f58241b = f5;
        this.f58242c = courseUnit;
        this.f58243d = j11;
        this.f58244e = j12;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x01a4  */
    @Override // fz.c
    public final Object invoke(Object obj) throws Throwable {
        xq.c cVar;
        long j11;
        long j12;
        long jFloatToRawIntBits;
        switch (this.f58240a) {
            case 0:
                float f5 = this.f58241b;
                CourseUnit courseUnit = this.f58242c;
                long j13 = this.f58243d;
                long j14 = this.f58244e;
                y2.k0 onDrawWithContent = (y2.k0) obj;
                kotlin.jvm.internal.m.f(onDrawWithContent, "$this$onDrawWithContent");
                i2.b bVar = onDrawWithContent.f56937a;
                long jR0 = bVar.r0();
                xq.c cVar2 = bVar.f34121b;
                long jH = cVar2.H();
                cVar2.x().e();
                try {
                    ((a0.b2) cVar2.f56174b).n(jR0, f5, 1.0f);
                    float f11 = 45;
                    float fE0 = onDrawWithContent.e0(f11);
                    float fE1 = onDrawWithContent.e0(f11);
                    float f12 = CropImageView.DEFAULT_ASPECT_RATIO - fE0;
                    try {
                        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(f12)) & 4294967295L) | (((long) Float.floatToRawIntBits(fE1)) << 32);
                        float f13 = 2;
                        try {
                            long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(onDrawWithContent.e0(f11))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (bVar.d() & 4294967295L)) / f13)) & 4294967295L);
                            long jFloatToRawIntBits4 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (bVar.d() >> 32)) - onDrawWithContent.e0(f11))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (bVar.d() & 4294967295L)) / f13)) & 4294967295L);
                            try {
                                long jFloatToRawIntBits5 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (bVar.d() & 4294967295L)) + fE0)) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (bVar.d() >> 32)) - onDrawWithContent.e0(f11))) << 32);
                                if (courseUnit.getPreUnit() != null) {
                                    CourseUnit preUnit = courseUnit.getPreUnit();
                                    kotlin.jvm.internal.m.c(preUnit);
                                    if (preUnit.getUnitDirection() == UnitDirection.Right) {
                                        long jFloatToRawIntBits6 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (bVar.d() >> 32)) - onDrawWithContent.e0(f11))) << 32) | (((long) Float.floatToRawIntBits(f12)) & 4294967295L);
                                        jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (bVar.d() & 4294967295L)) / f13)) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (bVar.d() >> 32)) - onDrawWithContent.e0(f11))) << 32);
                                        jFloatToRawIntBits2 = jFloatToRawIntBits6;
                                        long jFloatToRawIntBits7 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (bVar.d() & 4294967295L)) / f13)) & 4294967295L) | (((long) Float.floatToRawIntBits(onDrawWithContent.e0(f11))) << 32);
                                        j12 = jFloatToRawIntBits7;
                                        jFloatToRawIntBits5 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (bVar.d() & 4294967295L)) + fE0)) & 4294967295L) | (((long) Float.floatToRawIntBits(onDrawWithContent.e0(f11))) << 32);
                                    } else {
                                        j12 = jFloatToRawIntBits4;
                                        jFloatToRawIntBits = jFloatToRawIntBits3;
                                    }
                                } else {
                                    j12 = jFloatToRawIntBits4;
                                    jFloatToRawIntBits = jFloatToRawIntBits3;
                                }
                                float f14 = 3;
                                float f15 = 6;
                                long j15 = jFloatToRawIntBits5;
                                cVar = cVar2;
                                try {
                                    onDrawWithContent.f0(j13, jFloatToRawIntBits2, jFloatToRawIntBits, (480 & 8) != 0 ? 0.0f : onDrawWithContent.e0(f14), (480 & 16) != 0 ? 0 : 1, (480 & 32) != 0 ? null : new g2.l(new DashPathEffect(new float[]{onDrawWithContent.e0(f15), onDrawWithContent.e0(f15)}, CropImageView.DEFAULT_ASPECT_RATIO)), 3);
                                    onDrawWithContent.f0(j14, j12, j15, (480 & 8) != 0 ? 0.0f : onDrawWithContent.e0(f14), (480 & 16) != 0 ? 0 : 1, (480 & 32) != 0 ? null : new g2.l(new DashPathEffect(new float[]{onDrawWithContent.e0(f15), onDrawWithContent.e0(f15)}, CropImageView.DEFAULT_ASPECT_RATIO)), 3);
                                    cVar.x().p();
                                    cVar.T(jH);
                                    onDrawWithContent.a();
                                    return qy.b0.f48488a;
                                } catch (Throwable th2) {
                                    th = th2;
                                    j11 = jH;
                                    com.google.android.material.datepicker.d.C(cVar, j11);
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                cVar = cVar2;
                                j11 = jH;
                                com.google.android.material.datepicker.d.C(cVar, j11);
                                throw th;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            cVar = cVar2;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        j11 = jH;
                        cVar = cVar2;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    cVar = cVar2;
                    j11 = jH;
                }
                break;
            default:
                d2.e drawWithCache = (d2.e) obj;
                kotlin.jvm.internal.m.f(drawWithCache, "$this$drawWithCache");
                return drawWithCache.b(new r2(this.f58241b, this.f58242c, this.f58243d, this.f58244e, 0));
        }
    }
}
