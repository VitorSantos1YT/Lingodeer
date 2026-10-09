package com.google.android.gms.cloudmessaging;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.IOException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import y.t0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class Rpc {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f8566h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static PendingIntent f8567i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final zzy f8568j = zzy.f8624a;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Pattern f8569k = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f8571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zzw f8572c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f8573d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Messenger f8575f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public zzd f8576g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t0 f8570a = new t0(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Messenger f8574e = new Messenger(new zzae(this, Looper.getMainLooper()));

    public Rpc(Context context) {
        this.f8571b = context;
        this.f8572c = new zzw(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f8573d = scheduledThreadPoolExecutor;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c9  */
    public final Task a(Bundle bundle) {
        final String string;
        synchronized (Rpc.class) {
            int i11 = f8566h;
            f8566h = i11 + 1;
            string = Integer.toString(i11);
        }
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        synchronized (this.f8570a) {
            this.f8570a.put(string, taskCompletionSource);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.f8572c.b() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        Context context = this.f8571b;
        synchronized (Rpc.class) {
            try {
                if (f8567i == null) {
                    Intent intent2 = new Intent();
                    intent2.setPackage("com.google.example.invalidpackage");
                    f8567i = PendingIntent.getBroadcast(context, 0, intent2, com.google.android.gms.internal.cloudmessaging.zza.f9604a);
                }
                intent.putExtra("app", f8567i);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        intent.putExtra("kid", "|ID|" + string + "|");
        if (Log.isLoggable("Rpc", 3)) {
            "Sending ".concat(String.valueOf(intent.getExtras()));
        }
        intent.putExtra("google.messenger", this.f8574e);
        if (this.f8575f != null || this.f8576g != null) {
            Message messageObtain = Message.obtain();
            messageObtain.obj = intent;
            try {
                Messenger messenger = this.f8575f;
                if (messenger != null) {
                    messenger.send(messageObtain);
                } else {
                    Messenger messenger2 = this.f8576g.f8584a;
                    messenger2.getClass();
                    messenger2.send(messageObtain);
                }
            } catch (RemoteException unused) {
                if (this.f8572c.b() == 2) {
                    this.f8571b.sendBroadcast(intent);
                } else {
                    this.f8571b.startService(intent);
                }
            }
        } else if (this.f8572c.b() == 2) {
            this.f8571b.sendBroadcast(intent);
        } else {
            this.f8571b.startService(intent);
        }
        final ScheduledFuture<?> scheduledFutureSchedule = this.f8573d.schedule(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzac
            @Override // java.lang.Runnable
            public final void run() {
                taskCompletionSource.trySetException(new IOException("TIMEOUT"));
            }
        }, 30L, TimeUnit.SECONDS);
        taskCompletionSource.getTask().addOnCompleteListener(f8568j, new OnCompleteListener() { // from class: com.google.android.gms.cloudmessaging.zzad
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                Rpc rpc = this.f8580a;
                String str = string;
                ScheduledFuture scheduledFuture = scheduledFutureSchedule;
                synchronized (rpc.f8570a) {
                    rpc.f8570a.remove(str);
                }
                scheduledFuture.cancel(false);
            }
        });
        return taskCompletionSource.getTask();
    }

    public final void b(String str, Bundle bundle) {
        synchronized (this.f8570a) {
            try {
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f8570a.remove(str);
                if (taskCompletionSource == null) {
                    return;
                }
                taskCompletionSource.setResult(bundle);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
