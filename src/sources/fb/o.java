package fb;

import android.app.Notification;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f27102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f27103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Notification f27104c;

    public o(int i11, Notification notification, int i12) {
        this.f27102a = i11;
        this.f27104c = notification;
        this.f27103b = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o.class != obj.getClass()) {
            return false;
        }
        o oVar = (o) obj;
        if (this.f27102a == oVar.f27102a && this.f27103b == oVar.f27103b) {
            return this.f27104c.equals(oVar.f27104c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f27104c.hashCode() + (((this.f27102a * 31) + this.f27103b) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f27102a + ", mForegroundServiceType=" + this.f27103b + ", mNotification=" + this.f27104c + '}';
    }
}
