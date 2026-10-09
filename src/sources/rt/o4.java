package rt;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.Icon;
import android.media.MediaMetadata;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.lingodeer.R;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class o4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f50183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public lp.j f50184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NotificationManager f50185c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final lf.e f50186d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f50187e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final MediaSession f50188f;

    public o4(Context context) {
        this.f50183a = context;
        this.f50185c = (NotificationManager) context.getSystemService(NotificationManager.class);
        lf.e eVar = new lf.e(this, 9);
        this.f50186d = eVar;
        MediaSession mediaSession = new MediaSession(context, "CourseListenAlong");
        mediaSession.setCallback(new n4(this), new Handler(Looper.getMainLooper()));
        Bundle bundle = new Bundle();
        bundle.putString("source", "CourseListenAlong");
        mediaSession.setExtras(bundle);
        this.f50188f = mediaSession;
        if (this.f50187e) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.lingodeer.course.listen_along.PLAY");
        intentFilter.addAction("com.lingodeer.course.listen_along.PAUSE");
        o4.c.d(context, eVar, intentFilter, 4);
        this.f50187e = true;
    }

    public final Notification a(t4 t4Var, v4 v4Var) {
        Notification.Action actionBuild;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26) {
            this.f50185c.createNotificationChannel(new NotificationChannel("listen_along_media", "Listen Along", 2));
        }
        boolean z11 = v4Var == v4.PLAYING || v4Var == v4.PREPARING;
        Context context = this.f50183a;
        if (z11) {
            Icon iconCreateWithResource = Icon.createWithResource(context, R.drawable.ic_listen_along_notification_pause);
            PendingIntent broadcast = PendingIntent.getBroadcast(context, -1166479412, new Intent("com.lingodeer.course.listen_along.PAUSE").setPackage(context.getPackageName()), 201326592);
            kotlin.jvm.internal.m.e(broadcast, "getBroadcast(...)");
            actionBuild = new Notification.Action.Builder(iconCreateWithResource, "Pause", broadcast).build();
        } else {
            Icon iconCreateWithResource2 = Icon.createWithResource(context, R.drawable.ic_listen_along_notification_play);
            PendingIntent broadcast2 = PendingIntent.getBroadcast(context, -730355074, new Intent("com.lingodeer.course.listen_along.PLAY").setPackage(context.getPackageName()), 201326592);
            kotlin.jvm.internal.m.e(broadcast2, "getBroadcast(...)");
            actionBuild = new Notification.Action.Builder(iconCreateWithResource2, "Play", broadcast2).build();
        }
        kotlin.jvm.internal.m.c(actionBuild);
        Notification.Builder contentText = (i11 >= 26 ? new Notification.Builder(context, "listen_along_media") : new Notification.Builder(context)).setSmallIcon(R.drawable.ic_listen_along_notification).setContentTitle(p4.b(t4Var)).setContentText(p4.a(t4Var));
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.lingo.course.ui.CourseListenAlongActivity");
        intent.setFlags(603979776);
        Notification notificationBuild = contentText.setContentIntent(PendingIntent.getActivity(context, 1043, intent, 201326592)).setShowWhen(false).setOngoing(z11).setVisibility(1).addAction(actionBuild).setStyle(new Notification.MediaStyle().setMediaSession(this.f50188f.getSessionToken()).setShowActionsInCompactView(0)).build();
        kotlin.jvm.internal.m.e(notificationBuild, "build(...)");
        return notificationBuild;
    }

    public final void b(t4 t4Var, v4 queueState) {
        kotlin.jvm.internal.m.f(queueState, "queueState");
        MediaSession mediaSession = this.f50188f;
        mediaSession.setActive(true);
        mediaSession.setMetadata(new MediaMetadata.Builder().putString("android.media.metadata.TITLE", p4.b(t4Var)).putString("android.media.metadata.ARTIST", p4.a(t4Var)).build());
        c(queueState);
        try {
            this.f50185c.notify(1042, a(t4Var, queueState));
        } catch (Throwable th2) {
            com.bumptech.glide.e.l(th2);
        }
    }

    public final void c(v4 queueState) {
        kotlin.jvm.internal.m.f(queueState, "queueState");
        PlaybackState.Builder actions = new PlaybackState.Builder().setActions(519L);
        int i11 = m4.f50056a[queueState.ordinal()];
        int i12 = 1;
        if (i11 == 1) {
            i12 = 0;
        } else if (i11 == 2) {
            i12 = 6;
        } else if (i11 == 3) {
            i12 = 3;
        } else if (i11 == 4) {
            i12 = 2;
        } else if (i11 != 5) {
            throw new NoWhenBranchMatchedException();
        }
        this.f50188f.setPlaybackState(actions.setState(i12, -1L, 1.0f).build());
    }
}
