package bb;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import androidx.window.extensions.layout.FoldingFeature;
import androidx.window.extensions.layout.WindowLayoutInfo;
import b7.e0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.m;
import ns.o;
import za.j;
import za.k;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    public static za.c a(k windowMetrics, FoldingFeature oemFeature) {
        za.b bVar;
        za.b bVar2;
        m.f(windowMetrics, "windowMetrics");
        m.f(oemFeature, "oemFeature");
        int type = oemFeature.getType();
        if (type == 1) {
            bVar = za.b.f59055h;
        } else {
            if (type != 2) {
                return null;
            }
            bVar = za.b.f59056i;
        }
        int state = oemFeature.getState();
        if (state == 1) {
            bVar2 = za.b.f59053f;
        } else {
            if (state != 2) {
                return null;
            }
            bVar2 = za.b.f59054g;
        }
        Rect bounds = oemFeature.getBounds();
        m.e(bounds, "getBounds(...)");
        ya.b bVar3 = new ya.b(bounds);
        Rect rectC = windowMetrics.f59076a.c();
        if (bVar3.a() == 0 && bVar3.b() == 0) {
            return null;
        }
        if (bVar3.b() != rectC.width() && bVar3.a() != rectC.height()) {
            return null;
        }
        if (bVar3.b() < rectC.width() && bVar3.a() < rectC.height()) {
            return null;
        }
        if (bVar3.b() == rectC.width() && bVar3.a() == rectC.height()) {
            return null;
        }
        Rect bounds2 = oemFeature.getBounds();
        m.e(bounds2, "getBounds(...)");
        return new za.c(new ya.b(bounds2), bVar, bVar2);
    }

    public static j b(Context context, WindowLayoutInfo info) {
        db.f fVar = db.a.f23346h;
        db.c cVar = db.c.f23350c;
        db.e eVar = db.e.f23352c;
        m.f(info, "info");
        int i11 = Build.VERSION.SDK_INT;
        db.d dVar = i11 >= 34 ? db.e.f23351b : db.a.f23345g;
        o.b(1, 2, 4, 8, 16, 32, 64, 128);
        if (i11 >= 30) {
            if (i11 >= 34) {
                fVar = eVar;
            } else if (i11 >= 30) {
                fVar = cVar;
            }
            return c(fVar.a(context, dVar), info);
        }
        if (i11 < 29 || !(context instanceof Activity)) {
            throw new UnsupportedOperationException("Display Features are only supported after Q. Display features for non-Activity contexts are not expected to be reported on devices running Q.");
        }
        Activity activity = (Activity) context;
        if (i11 >= 34) {
            fVar = eVar;
        } else if (i11 >= 30) {
            fVar = cVar;
        }
        return c(fVar.c(activity, dVar), info);
    }

    public static j c(k windowMetrics, WindowLayoutInfo info) {
        m.f(windowMetrics, "windowMetrics");
        m.f(info, "info");
        List<FoldingFeature> displayFeatures = info.getDisplayFeatures();
        ArrayList arrayListR = e0.r("getDisplayFeatures(...)", displayFeatures);
        for (FoldingFeature foldingFeature : displayFeatures) {
            za.c cVarA = foldingFeature instanceof FoldingFeature ? a(windowMetrics, foldingFeature) : null;
            if (cVarA != null) {
                arrayListR.add(cVarA);
            }
        }
        return new j(arrayListR);
    }
}
