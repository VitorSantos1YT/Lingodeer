package n4;

import android.app.Notification;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends ae.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CharSequence f43210c;

    @Override // ae.d
    public final void c(dm.c cVar) {
        new Notification.BigTextStyle((Notification.Builder) cVar.f23491c).setBigContentTitle((CharSequence) this.f670b).bigText(this.f43210c);
    }

    @Override // ae.d
    public final String h() {
        return "androidx.core.app.NotificationCompat$BigTextStyle";
    }
}
