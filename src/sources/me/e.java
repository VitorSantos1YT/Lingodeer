package me;

import android.content.Context;
import android.graphics.Point;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import java.util.ArrayList;
import l4.f;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Integer f41127d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f41128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f41129b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public f f41130c;

    public e(ImageView imageView) {
        this.f41128a = imageView;
    }

    public final int a(int i11, int i12, int i13) {
        int i14 = i12 - i13;
        if (i14 > 0) {
            return i14;
        }
        int i15 = i11 - i13;
        if (i15 > 0) {
            return i15;
        }
        View view = this.f41128a;
        if (view.isLayoutRequested() || i12 != -2) {
            return 0;
        }
        Context context = view.getContext();
        if (f41127d == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            pe.f.c(windowManager, "Argument must not be null");
            Display defaultDisplay = windowManager.getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            f41127d = Integer.valueOf(Math.max(point.x, point.y));
        }
        return f41127d.intValue();
    }
}
