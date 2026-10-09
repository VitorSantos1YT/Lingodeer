package r3;

import android.text.TextPaint;
import com.yalantis.ucrop.view.CropImageView;
import g2.t;
import g2.v;
import g2.v0;
import j3.f0;
import j3.h0;
import j3.q;
import j3.x;
import j3.y0;
import j3.z;
import java.util.ArrayList;
import u3.l;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f48788a = new j(false);

    public static final boolean a(y0 y0Var) {
        f0 f0Var;
        h0 h0Var = y0Var.f35829c;
        q qVar = (h0Var == null || (f0Var = h0Var.f35704b) == null) ? null : new q(f0Var.f35695b);
        boolean z11 = false;
        if (qVar != null && qVar.f35769a == 1) {
            z11 = true;
        }
        return !z11;
    }

    public static final void b(x xVar, v vVar, t tVar, float f5, v0 v0Var, l lVar, i2.e eVar) {
        ArrayList arrayList = xVar.f35820h;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            z zVar = (z) arrayList.get(i11);
            zVar.f35830a.g(vVar, tVar, f5, v0Var, lVar, eVar);
            vVar.n(CropImageView.DEFAULT_ASPECT_RATIO, zVar.f35830a.b());
        }
    }

    public static final void c(TextPaint textPaint, float f5) {
        if (Float.isNaN(f5)) {
            return;
        }
        if (f5 < CropImageView.DEFAULT_ASPECT_RATIO) {
            f5 = 0.0f;
        }
        if (f5 > 1.0f) {
            f5 = 1.0f;
        }
        textPaint.setAlpha(Math.round(f5 * 255));
    }
}
