package bt;

import android.content.Context;
import com.google.android.gms.measurement.zfxB.ypOOxsaJG;
import com.lingodeer.data.model.RecordingStatus;
import com.yalantis.ucrop.view.CropImageView;
import h1.ua;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d implements fz.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5291a;

    public /* synthetic */ d(int i11) {
        this.f5291a = i11;
    }

    @Override // fz.g
    public final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f5291a) {
            case 0:
                a0.r AnimatedContent = (a0.r) obj;
                RecordingStatus it = (RecordingStatus) obj2;
                int iIntValue = ((Integer) obj4).intValue();
                kotlin.jvm.internal.m.f(AnimatedContent, "$this$AnimatedContent");
                kotlin.jvm.internal.m.f(it, "it");
                s5.c(it, (l1.n) obj3, ((iIntValue >> 3) & 14) | 48);
                break;
            case 1:
                return new d1.r((vy.i) obj, (Context) obj2, (d1.u) obj3, (q3.b) obj4);
            case 2:
                String value = (String) obj2;
                int iIntValue2 = ((Integer) obj4).intValue();
                kotlin.jvm.internal.m.f((a0.r) obj, ypOOxsaJG.FjmnitxsnAIOynN);
                kotlin.jvm.internal.m.f(value, "value");
                l1.s sVar = (l1.s) ((l1.n) obj3);
                j3.y0 y0VarA = j3.y0.a((j3.y0) sVar.j(ua.f31167a), 0L, fr.j3.A(16), null, null, null, 0L, null, null, 0, 0, 0L, null, 16777213);
                ua.b(value, j0.c.C(j0.e2.e(z1.o.f58481a, 1.0f), 42, CropImageView.DEFAULT_ASPECT_RATIO, 2), ((h1.s1) sVar.j(h1.v1.f31180a)).f31036s, fr.j3.A(18), null, n3.s.L, null, 0L, new u3.k(3), fr.j3.L(8589934592L, 2), 0, false, 0, 0, y0VarA, sVar, ((iIntValue2 >> 3) & 14) | 199728, 6, 63952);
                break;
            case 3:
                a0.r AnimatedContent2 = (a0.r) obj;
                String value2 = (String) obj2;
                int iIntValue3 = ((Integer) obj4).intValue();
                kotlin.jvm.internal.m.f(AnimatedContent2, "$this$AnimatedContent");
                kotlin.jvm.internal.m.f(value2, "value");
                l1.s sVar2 = (l1.s) ((l1.n) obj3);
                j3.y0 y0VarA2 = j3.y0.a((j3.y0) sVar2.j(ua.f31167a), 0L, fr.j3.A(16), null, null, null, 0L, null, null, 0, 0, 0L, null, 16777213);
                ua.b(value2, j0.c.C(j0.e2.e(z1.o.f58481a, 1.0f), 42, CropImageView.DEFAULT_ASPECT_RATIO, 2), ((h1.s1) sVar2.j(h1.v1.f31180a)).f31036s, fr.j3.A(18), null, n3.s.L, null, 0L, new u3.k(3), fr.j3.L(8589934592L, 2), 0, false, 0, 0, y0VarA2, sVar2, ((iIntValue3 >> 3) & 14) | 199728, 6, 63952);
                break;
            default:
                a0.r AnimatedContent3 = (a0.r) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                ((Integer) obj4).getClass();
                kotlin.jvm.internal.m.f(AnimatedContent3, "$this$AnimatedContent");
                ua.b("+" + iIntValue4, null, g2.f0.e(4283810815L), fr.j3.A(18), null, n3.s.K, null, 0L, null, 0L, 0, false, 0, 0, null, (l1.n) obj3, 200064, 0, 131026);
                break;
        }
        return qy.b0.f48488a;
    }
}
