package com.google.firebase.messaging;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.graphics.Bitmap;
import android.os.Process;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import n4.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
class DisplayNotification {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExecutorService f20455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FirebaseMessagingService f20456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NotificationParams f20457c;

    public DisplayNotification(FirebaseMessagingService firebaseMessagingService, NotificationParams notificationParams, ExecutorService executorService) {
        this.f20455a = executorService;
        this.f20456b = firebaseMessagingService;
        this.f20457c = notificationParams;
    }

    public final boolean a() {
        ImageDownload imageDownload;
        IconCompat iconCompat;
        if (this.f20457c.a("gcm.n.noui")) {
            return true;
        }
        FirebaseMessagingService firebaseMessagingService = this.f20456b;
        if (!((KeyguardManager) firebaseMessagingService.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            int iMyPid = Process.myPid();
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) firebaseMessagingService.getSystemService("activity")).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (runningAppProcessInfo.pid == iMyPid) {
                        if (runningAppProcessInfo.importance != 100) {
                            break;
                        }
                        return false;
                    }
                }
            }
        }
        String strH = this.f20457c.h("gcm.n.image");
        if (TextUtils.isEmpty(strH)) {
            imageDownload = null;
        } else {
            try {
                imageDownload = new ImageDownload(new URL(strH));
            } catch (MalformedURLException unused) {
                imageDownload = null;
            }
        }
        if (imageDownload != null) {
            ExecutorService executorService = this.f20455a;
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            imageDownload.f20495b = executorService.submit(new e(2, imageDownload, taskCompletionSource));
            imageDownload.f20496c = taskCompletionSource.getTask();
        }
        CommonNotificationBuilder.DisplayNotificationInfo displayNotificationInfoA = CommonNotificationBuilder.a(this.f20456b, this.f20457c);
        p pVar = displayNotificationInfoA.f20452a;
        if (imageDownload != null) {
            try {
                Task task = imageDownload.f20496c;
                Preconditions.g(task);
                Bitmap bitmap = (Bitmap) Tasks.await(task, 5L, TimeUnit.SECONDS);
                pVar.d(bitmap);
                n4.m mVar = new n4.m();
                if (bitmap == null) {
                    iconCompat = null;
                } else {
                    iconCompat = new IconCompat(1);
                    iconCompat.f1401b = bitmap;
                }
                mVar.f43207c = iconCompat;
                mVar.f43208d = null;
                mVar.f43209e = true;
                pVar.e(mVar);
            } catch (InterruptedException unused2) {
                imageDownload.close();
                Thread.currentThread().interrupt();
            } catch (ExecutionException e8) {
                Objects.toString(e8.getCause());
            } catch (TimeoutException unused3) {
                imageDownload.close();
            }
        }
        ((NotificationManager) this.f20456b.getSystemService("notification")).notify(displayNotificationInfoA.f20453b, 0, displayNotificationInfoA.f20452a.a());
        return true;
    }
}
