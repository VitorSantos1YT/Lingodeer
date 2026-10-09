package bt;

import com.lingodeer.data.model.CourseWord;
import com.lingodeer.data.model.OptionItemSelectedState;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class r3 implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CourseWord f5932b;

    public /* synthetic */ r3(CourseWord courseWord, int i11) {
        this.f5931a = i11;
        this.f5932b = courseWord;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        switch (this.f5931a) {
            case 0:
                d2.e drawWithCache = (d2.e) obj;
                kotlin.jvm.internal.m.f(drawWithCache, "$this$drawWithCache");
                CourseWord courseWord = this.f5932b;
                return courseWord.getWordType() != 1 ? drawWithCache.b(new r3(courseWord, 1)) : drawWithCache.b(new br.b(10));
            case 1:
                y2.k0 onDrawWithContent = (y2.k0) obj;
                kotlin.jvm.internal.m.f(onDrawWithContent, "$this$onDrawWithContent");
                i2.b bVar = onDrawWithContent.f56937a;
                onDrawWithContent.a();
                if (this.f5932b.getSelectedState() != OptionItemSelectedState.DEFAULT) {
                    long jC = g2.f0.c(855638016);
                    long jD = bVar.d();
                    float fE0 = onDrawWithContent.e0(10);
                    i2.d.y(onDrawWithContent, jC, 0L, jD, (((long) Float.floatToRawIntBits(fE0)) << 32) | (((long) Float.floatToRawIntBits(fE0)) & 4294967295L), null, 242);
                    float f5 = 5;
                    float f11 = 2;
                    onDrawWithContent.f0(g2.f0.e(4294912040L), (((long) Float.floatToRawIntBits(onDrawWithContent.e0(f5))) & 4294967295L) | (((long) Float.floatToRawIntBits(onDrawWithContent.e0(f5))) << 32), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (bVar.d() & 4294967295L)) - onDrawWithContent.e0(f5))) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (bVar.d() >> 32)) - onDrawWithContent.e0(f5))) << 32), (480 & 8) != 0 ? 0.0f : onDrawWithContent.e0(f11), (480 & 16) != 0 ? 0 : 1, (480 & 32) != 0 ? null : null, 3);
                    onDrawWithContent.f0(g2.f0.e(4294912040L), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (bVar.d() & 4294967295L)) - onDrawWithContent.e0(f5))) & 4294967295L) | (((long) Float.floatToRawIntBits(onDrawWithContent.e0(f5))) << 32), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (bVar.d() >> 32)) - onDrawWithContent.e0(f5))) << 32) | (((long) Float.floatToRawIntBits(onDrawWithContent.e0(f5))) & 4294967295L), (480 & 8) != 0 ? 0.0f : onDrawWithContent.e0(f11), (480 & 16) != 0 ? 0 : 1, (480 & 32) != 0 ? null : null, 3);
                }
                return qy.b0.f48488a;
            case 2:
                ot.p2 it = (ot.p2) obj;
                kotlin.jvm.internal.m.f(it, "it");
                return Integer.valueOf(it.f45945a.getWordType() == this.f5932b.getWordType() ? 0 : 1);
            case 3:
                ot.p2 it2 = (ot.p2) obj;
                kotlin.jvm.internal.m.f(it2, "it");
                CourseWord courseWord2 = this.f5932b;
                return Integer.valueOf((oz.q.K0(courseWord2.getPos()) || !kotlin.jvm.internal.m.a(it2.f45945a.getPos(), courseWord2.getPos())) ? 1 : 0);
            default:
                ot.p2 it3 = (ot.p2) obj;
                kotlin.jvm.internal.m.f(it3, "it");
                return Integer.valueOf(Math.abs(it3.f45945a.getWord().length() - this.f5932b.getWord().length()));
        }
    }
}
