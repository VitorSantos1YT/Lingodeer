package n4;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import com.lingodeer.R;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f43211a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CharSequence f43215e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CharSequence f43216f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public PendingIntent f43217g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public IconCompat f43218h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f43219i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f43220j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ae.d f43222l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Bundle f43223n;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f43226q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f43227r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Notification f43228s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ArrayList f43229t;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f43212b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f43213c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f43214d = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f43221k = true;
    public boolean m = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f43224o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f43225p = 0;

    public p(Context context, String str) {
        Notification notification = new Notification();
        this.f43228s = notification;
        this.f43211a = context;
        this.f43226q = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.f43220j = 0;
        this.f43229t = new ArrayList();
        this.f43227r = true;
    }

    public static CharSequence b(CharSequence charSequence) {
        return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
    }

    public final Notification a() {
        Bundle bundle;
        dm.c cVar = new dm.c(this);
        p pVar = (p) cVar.f23492d;
        ae.d dVar = pVar.f43222l;
        if (dVar != null) {
            dVar.c(cVar);
        }
        Notification.Builder builder = (Notification.Builder) cVar.f23491c;
        Notification notificationBuild = Build.VERSION.SDK_INT >= 26 ? builder.build() : builder.build();
        if (dVar != null) {
            pVar.f43222l.getClass();
        }
        if (dVar != null && (bundle = notificationBuild.extras) != null) {
            CharSequence charSequence = (CharSequence) dVar.f670b;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", dVar.h());
        }
        return notificationBuild;
    }

    public final void c(boolean z11) {
        Notification notification = this.f43228s;
        if (z11) {
            notification.flags |= 16;
        } else {
            notification.flags &= -17;
        }
    }

    public final void d(Bitmap bitmap) {
        IconCompat iconCompat;
        if (bitmap == null) {
            iconCompat = null;
        } else {
            if (Build.VERSION.SDK_INT < 27) {
                Resources resources = this.f43211a.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
                if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                    double dMin = Math.min(((double) dimensionPixelSize) / ((double) Math.max(1, bitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) Math.max(1, bitmap.getHeight())));
                    bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * dMin), (int) Math.ceil(((double) bitmap.getHeight()) * dMin), true);
                }
            }
            PorterDuff.Mode mode = IconCompat.f1399k;
            bitmap.getClass();
            IconCompat iconCompat2 = new IconCompat(1);
            iconCompat2.f1401b = bitmap;
            iconCompat = iconCompat2;
        }
        this.f43218h = iconCompat;
    }

    public final void e(ae.d dVar) {
        if (this.f43222l != dVar) {
            this.f43222l = dVar;
            if (((p) dVar.f669a) != this) {
                dVar.f669a = this;
                e(dVar);
            }
        }
    }
}
