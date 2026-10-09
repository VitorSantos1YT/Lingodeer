package n4;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends ae.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public IconCompat f43207c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public IconCompat f43208d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f43209e;

    @Override // ae.d
    public final void c(dm.c cVar) {
        Bitmap bitmapA;
        Notification.Builder builder = (Notification.Builder) cVar.f23491c;
        Context context = (Context) cVar.f23490b;
        Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(builder).setBigContentTitle((CharSequence) this.f670b);
        IconCompat iconCompat = this.f43207c;
        if (iconCompat != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                l.a(bigContentTitle, iconCompat.f(context));
            } else if (iconCompat.d() == 1) {
                IconCompat iconCompat2 = this.f43207c;
                int i11 = iconCompat2.f1400a;
                if (i11 == -1) {
                    Object obj = iconCompat2.f1401b;
                    bitmapA = obj instanceof Bitmap ? (Bitmap) obj : null;
                } else if (i11 == 1) {
                    bitmapA = (Bitmap) iconCompat2.f1401b;
                } else {
                    if (i11 != 5) {
                        throw new IllegalStateException("called getBitmap() on " + iconCompat2);
                    }
                    bitmapA = IconCompat.a((Bitmap) iconCompat2.f1401b, true);
                }
                bigContentTitle = bigContentTitle.bigPicture(bitmapA);
            }
        }
        if (this.f43209e) {
            IconCompat iconCompat3 = this.f43208d;
            if (iconCompat3 == null) {
                bigContentTitle.bigLargeIcon((Bitmap) null);
            } else {
                k.a(bigContentTitle, iconCompat3.f(context));
            }
        }
        if (Build.VERSION.SDK_INT >= 31) {
            l.c(bigContentTitle, false);
            l.b(bigContentTitle, null);
        }
    }

    @Override // ae.d
    public final String h() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }
}
