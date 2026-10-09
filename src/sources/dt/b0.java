package dt;

import android.webkit.WebView;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b0 implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f23654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f23655c;

    public /* synthetic */ b0(int i11, long j11, boolean z11) {
        this.f23653a = i11;
        this.f23655c = j11;
        this.f23654b = z11;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        switch (this.f23653a) {
            case 0:
                WebView webView = (WebView) obj;
                kotlin.jvm.internal.m.f(webView, "webView");
                webView.setBackgroundColor(g2.f0.E(this.f23655c));
                if (this.f23654b) {
                    if (se.k.s("ALGORITHMIC_DARKENING")) {
                        va.a.b(webView.getSettings());
                    }
                    if (se.k.s("FORCE_DARK")) {
                        va.a.c(webView.getSettings());
                    }
                }
                return qy.b0.f48488a;
            case 1:
                d2.e drawWithCache = (d2.e) obj;
                kotlin.jvm.internal.m.f(drawWithCache, "$this$drawWithCache");
                final float density = drawWithCache.getDensity() * 2;
                final long j11 = this.f23655c;
                final boolean z11 = this.f23654b;
                return drawWithCache.a(new fz.c() { // from class: dt.t3
                    @Override // fz.c
                    public final Object invoke(Object obj2) {
                        i2.d onDrawBehind = (i2.d) obj2;
                        kotlin.jvm.internal.m.f(onDrawBehind, "$this$onDrawBehind");
                        boolean z12 = z11;
                        onDrawBehind.f0(j11, (((long) Float.floatToRawIntBits(z12 ? onDrawBehind.e0(2) + CropImageView.DEFAULT_ASPECT_RATIO : Float.intBitsToFloat((int) (onDrawBehind.d() >> 32)) * 0.07f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (onDrawBehind.d() & 4294967295L)))) & 4294967295L), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (onDrawBehind.d() & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(z12 ? Float.intBitsToFloat((int) (onDrawBehind.d() >> 32)) - onDrawBehind.e0(2) : Float.intBitsToFloat((int) (onDrawBehind.d() >> 32)) * 0.93f)) << 32), (480 & 8) != 0 ? 0.0f : density, (480 & 16) != 0 ? 0 : 1, (480 & 32) != 0 ? null : null, 3);
                        return qy.b0.f48488a;
                    }
                });
            case 2:
                WebView webView2 = (WebView) obj;
                kotlin.jvm.internal.m.f(webView2, "webView");
                webView2.setBackgroundColor(g2.f0.E(this.f23655c));
                if (this.f23654b) {
                    if (se.k.s("ALGORITHMIC_DARKENING")) {
                        va.a.b(webView2.getSettings());
                    }
                    if (se.k.s("FORCE_DARK")) {
                        va.a.c(webView2.getSettings());
                    }
                }
                return qy.b0.f48488a;
            default:
                long j12 = this.f23655c;
                i2.d drawBehind = (i2.d) obj;
                kotlin.jvm.internal.m.f(drawBehind, "$this$drawBehind");
                long jR0 = drawBehind.r0();
                xq.c cVarJ0 = drawBehind.j0();
                long jH = cVarJ0.H();
                cVarJ0.x().e();
                try {
                    ((a0.b2) cVarJ0.f56174b).m(jR0, 45.0f);
                    float fE0 = drawBehind.e0(4);
                    float f5 = fE0 + CropImageView.DEFAULT_ASPECT_RATIO;
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (drawBehind.d() >> 32)) - fE0;
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (drawBehind.d() & 4294967295L)) - fE0;
                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L);
                    long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fIntBitsToFloat2 - f5)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat - f5) << 32);
                    float f11 = 12;
                    i2.d.y(drawBehind, j12, jFloatToRawIntBits, jFloatToRawIntBits2, (((long) Float.floatToRawIntBits(drawBehind.e0(f11))) << 32) | (((long) Float.floatToRawIntBits(drawBehind.e0(f11))) & 4294967295L), null, 240);
                    if (this.f23654b) {
                        float f12 = f5 - fE0;
                        float f13 = 16;
                        i2.d.y(drawBehind, j12, (((long) Float.floatToRawIntBits(f12)) << 32) | (((long) Float.floatToRawIntBits(f12)) & 4294967295L), drawBehind.d(), (((long) Float.floatToRawIntBits(drawBehind.e0(f13))) << 32) | (((long) Float.floatToRawIntBits(drawBehind.e0(f13))) & 4294967295L), new i2.h(drawBehind.e0(2), CropImageView.DEFAULT_ASPECT_RATIO, 0, 0, null, 30), 224);
                        break;
                    }
                    return qy.b0.f48488a;
                } finally {
                    com.google.android.material.datepicker.d.C(cVarJ0, jH);
                }
        }
    }

    public /* synthetic */ b0(long j11, boolean z11) {
        this.f23653a = 1;
        this.f23654b = z11;
        this.f23655c = j11;
    }
}
