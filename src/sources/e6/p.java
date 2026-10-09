package e6;

import android.os.Build;
import android.widget.RemoteViews;
import com.yalantis.ucrop.view.CropImageView;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f25009a = new p();

    public final void a(RemoteViews remoteViews, int i11, p6.g gVar) {
        kotlin.jvm.internal.m.f(remoteViews, "<this>");
        if (Build.VERSION.SDK_INT < 31) {
            throw new IllegalArgumentException(("setClipToOutline is only available on SDK 31 and higher").toString());
        }
        remoteViews.setBoolean(i11, "setClipToOutline", true);
        if (gVar instanceof p6.c) {
            remoteViews.setViewOutlinePreferredRadius(i11, ((p6.c) gVar).f46313a, 1);
        } else {
            throw new IllegalStateException(("Rounded corners should not be " + gVar.getClass().getCanonicalName()).toString());
        }
    }

    public final void b(RemoteViews remoteViews, int i11, p6.g gVar) {
        if (gVar instanceof p6.f) {
            remoteViews.setViewLayoutHeight(i11, -2.0f, 0);
            return;
        }
        if (gVar instanceof p6.d) {
            remoteViews.setViewLayoutHeight(i11, CropImageView.DEFAULT_ASPECT_RATIO, 0);
        } else if (gVar instanceof p6.c) {
            remoteViews.setViewLayoutHeight(i11, ((p6.c) gVar).f46313a, 1);
        } else {
            if (!kotlin.jvm.internal.m.a(gVar, p6.e.f46315a)) {
                throw new NoWhenBranchMatchedException();
            }
            remoteViews.setViewLayoutHeight(i11, -1.0f, 0);
        }
    }

    public final void c(RemoteViews remoteViews, int i11, p6.g gVar) {
        if (gVar instanceof p6.f) {
            remoteViews.setViewLayoutWidth(i11, -2.0f, 0);
            return;
        }
        if (gVar instanceof p6.d) {
            remoteViews.setViewLayoutWidth(i11, CropImageView.DEFAULT_ASPECT_RATIO, 0);
        } else if (gVar instanceof p6.c) {
            remoteViews.setViewLayoutWidth(i11, ((p6.c) gVar).f46313a, 1);
        } else {
            if (!kotlin.jvm.internal.m.a(gVar, p6.e.f46315a)) {
                throw new NoWhenBranchMatchedException();
            }
            remoteViews.setViewLayoutWidth(i11, -1.0f, 0);
        }
    }
}
