package cw;

import a0.b2;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import com.lingodeer.R;
import java.lang.ref.WeakReference;
import ns.o;
import r.x2;
import uv.u;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class e extends Service {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public zv.d f22602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public u f22603b;

    /* JADX WARN: Type inference failed for: r1v1, types: [cw.f, zv.d] */
    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f22602a.h();
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        o.f44007a = this;
        try {
            ew.e eVar = ew.d.f25940a;
            int i11 = eVar.f25941a;
            if (!ew.f.f(o.f44007a)) {
                throw new IllegalAccessException("This value is used in the :filedownloader process, so set this value in your process is without effect. You can add 'process.non-separate=true' in 'filedownloader.properties' to share the main process to FileDownloadService. Or you can configure this value in 'filedownloader.properties' by 'download.min-progress-step'.");
            }
            ew.f.f25949a = i11;
            long j11 = eVar.f25942b;
            if (!ew.f.f(o.f44007a)) {
                throw new IllegalAccessException("This value is used in the :filedownloader process, so set this value in your process is without effect. You can add 'process.non-separate=true' in 'filedownloader.properties' to share the main process to FileDownloadService. Or you can configure this value in 'filedownloader.properties' by 'download.min-progress-time'.");
            }
            ew.f.f25950b = j11;
            ob.u uVar = new ob.u(4);
            if (ew.d.f25940a.f25944d) {
                this.f22602a = new d(new WeakReference(this), uVar);
            } else {
                this.f22602a = new b(new WeakReference(this), uVar);
            }
            u.a();
            u uVar2 = new u(this.f22602a);
            this.f22603b = uVar2;
            HandlerThread handlerThread = new HandlerThread("PauseAllChecker");
            uVar2.f53234a = handlerThread;
            handlerThread.start();
            Handler handler = new Handler(uVar2.f53234a.getLooper(), uVar2);
            uVar2.f53235b = handler;
            handler.sendEmptyMessageDelayed(0, 1000L);
        } catch (IllegalAccessException e8) {
            e8.printStackTrace();
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        u uVar = this.f22603b;
        uVar.f53235b.removeMessages(0);
        uVar.f53234a.quit();
        stopForeground(true);
        super.onDestroy();
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [cw.f, zv.d] */
    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i11, int i12) {
        hd.d dVar;
        this.f22602a.g();
        if (intent == null || !intent.getBooleanExtra("is_foreground", false)) {
            return 1;
        }
        x2 x2Var = xv.c.f56595a;
        hd.d dVar2 = (hd.d) x2Var.f48715t;
        if (dVar2 == null) {
            synchronized (x2Var) {
                try {
                    if (((hd.d) x2Var.f48715t) == null) {
                        if (((b2) x2Var.c().f32184b) == null) {
                            dVar = new hd.d(9);
                            dVar.f32187b = null;
                        } else {
                            dVar = new hd.d(9);
                            dVar.f32187b = null;
                        }
                        x2Var.f48715t = dVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            dVar2 = (hd.d) x2Var.f48715t;
        }
        dVar2.getClass();
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel("filedownloader_channel", "Filedownloader", 2);
            NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
            if (notificationManager == null) {
                return 1;
            }
            notificationManager.createNotificationChannel(notificationChannel);
        }
        if (((Notification) dVar2.f32187b) == null) {
            String string = getString(R.string.default_filedownloader_notification_title);
            String string2 = getString(R.string.default_filedownloader_notification_content);
            Notification.Builder builder = new Notification.Builder(this, "filedownloader_channel");
            builder.setContentTitle(string).setContentText(string2).setSmallIcon(android.R.drawable.arrow_down_float);
            dVar2.f32187b = builder.build();
        }
        n4.e.f(this, android.R.drawable.arrow_down_float, (Notification) dVar2.f32187b);
        return 1;
    }
}
