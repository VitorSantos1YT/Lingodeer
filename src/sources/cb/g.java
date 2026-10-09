package cb;

import android.graphics.Rect;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ry.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f6806b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ya.i f6807a;

    public g() {
        ya.i verificationMode = ya.i.QUIET;
        kotlin.jvm.internal.m.f(verificationMode, "verificationMode");
        this.f6807a = verificationMode;
    }

    public static boolean a(SidecarDisplayFeature sidecarDisplayFeature, SidecarDisplayFeature sidecarDisplayFeature2) {
        if (kotlin.jvm.internal.m.a(sidecarDisplayFeature, sidecarDisplayFeature2)) {
            return true;
        }
        if (sidecarDisplayFeature == null || sidecarDisplayFeature2 == null || sidecarDisplayFeature.getType() != sidecarDisplayFeature2.getType()) {
            return false;
        }
        return kotlin.jvm.internal.m.a(sidecarDisplayFeature.getRect(), sidecarDisplayFeature2.getRect());
    }

    public static boolean b(List list, List list2) {
        if (list == list2) {
            return true;
        }
        if (list.size() == list2.size()) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                if (a((SidecarDisplayFeature) list.get(i11), (SidecarDisplayFeature) list2.get(i11))) {
                }
            }
            return true;
        }
        return false;
    }

    public static final boolean e(SidecarDisplayFeature require) {
        kotlin.jvm.internal.m.f(require, "$this$require");
        return require.getType() == 1 || require.getType() == 2;
    }

    public static final boolean f(SidecarDisplayFeature require) {
        kotlin.jvm.internal.m.f(require, "$this$require");
        return (require.getRect().width() == 0 && require.getRect().height() == 0) ? false : true;
    }

    public static final boolean g(SidecarDisplayFeature require) {
        kotlin.jvm.internal.m.f(require, "$this$require");
        return require.getType() != 1 || require.getRect().width() == 0 || require.getRect().height() == 0;
    }

    public static final boolean h(SidecarDisplayFeature require) {
        kotlin.jvm.internal.m.f(require, "$this$require");
        return require.getRect().left == 0 || require.getRect().top == 0;
    }

    public final ArrayList c(List list, SidecarDeviceState sidecarDeviceState) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            za.c cVarI = i((SidecarDisplayFeature) it.next(), sidecarDeviceState);
            if (cVarI != null) {
                arrayList.add(cVarI);
            }
        }
        return arrayList;
    }

    public final za.j d(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarDeviceState sidecarDeviceState) {
        if (sidecarWindowLayoutInfo == null) {
            return new za.j(r.f50854a);
        }
        SidecarDeviceState sidecarDeviceState2 = new SidecarDeviceState();
        f.d(sidecarDeviceState2, f.b(sidecarDeviceState));
        return new za.j(c(f.c(sidecarWindowLayoutInfo), sidecarDeviceState2));
    }

    public final za.c i(SidecarDisplayFeature feature, SidecarDeviceState sidecarDeviceState) {
        za.b bVar;
        za.b bVar2 = za.b.f59053f;
        kotlin.jvm.internal.m.f(feature, "feature");
        ya.i verificationMode = this.f6807a;
        kotlin.jvm.internal.m.f(verificationMode, "verificationMode");
        SidecarDisplayFeature sidecarDisplayFeature = (SidecarDisplayFeature) new ya.h(feature, verificationMode, ya.a.f57541a).B("Type must be either TYPE_FOLD or TYPE_HINGE", new b()).B("Feature bounds must not be 0", new c()).B("TYPE_FOLD must have 0 area", new d()).B("Feature be pinned to either left or top", new e()).l();
        if (sidecarDisplayFeature == null) {
            return null;
        }
        int type = sidecarDisplayFeature.getType();
        if (type == 1) {
            bVar = za.b.f59055h;
        } else {
            if (type != 2) {
                return null;
            }
            bVar = za.b.f59056i;
        }
        int iB = f.b(sidecarDeviceState);
        if (iB == 0 || iB == 1) {
            return null;
        }
        if (iB == 2) {
            bVar2 = za.b.f59054g;
        } else if (iB != 3 && iB == 4) {
            return null;
        }
        Rect rect = feature.getRect();
        kotlin.jvm.internal.m.e(rect, "getRect(...)");
        return new za.c(new ya.b(rect), bVar, bVar2);
    }
}
