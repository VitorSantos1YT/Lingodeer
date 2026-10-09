package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Base64;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class FcmBroadcastProcessor {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f20465c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static WithinAppServiceConnection f20466d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f20467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s.a f20468b = new s.a(1);

    public FcmBroadcastProcessor(Context context) {
        this.f20467a = context;
    }

    public static Task a(Context context, Intent intent, boolean z11) {
        WithinAppServiceConnection withinAppServiceConnection;
        synchronized (f20465c) {
            try {
                if (f20466d == null) {
                    f20466d = new WithinAppServiceConnection(context);
                }
                withinAppServiceConnection = f20466d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (!z11) {
            return withinAppServiceConnection.b(intent).continueWith(new s.a(1), new a(2));
        }
        if (ServiceStarter.a().c(context)) {
            synchronized (WakeLockHolder.f20559b) {
                try {
                    WakeLockHolder.a(context);
                    boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                    if (!booleanExtra) {
                        WakeLockHolder.f20560c.a(WakeLockHolder.f20558a);
                    }
                    withinAppServiceConnection.b(intent).addOnCompleteListener(new k(intent, 1));
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        } else {
            withinAppServiceConnection.b(intent);
        }
        return Tasks.forResult(-1);
    }

    public final Task b(final Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        boolean zA = PlatformVersion.a();
        final Context context = this.f20467a;
        boolean z11 = zA && context.getApplicationInfo().targetSdkVersion >= 26;
        final boolean z12 = (intent.getFlags() & 268435456) != 0;
        if (z11 && !z12) {
            return a(context, intent, z12);
        }
        Callable callable = new Callable() { // from class: com.google.firebase.messaging.c
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String str;
                ServiceInfo serviceInfo;
                String str2;
                int i11;
                Context context2 = context;
                Intent intent2 = intent;
                ServiceStarter serviceStarterA = ServiceStarter.a();
                serviceStarterA.f20515d.offer(intent2);
                Intent intent3 = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent3.setPackage(context2.getPackageName());
                synchronized (serviceStarterA) {
                    try {
                        str = serviceStarterA.f20512a;
                        if (str == null) {
                            ResolveInfo resolveInfoResolveService = context2.getPackageManager().resolveService(intent3, 0);
                            if (resolveInfoResolveService == null || (serviceInfo = resolveInfoResolveService.serviceInfo) == null || !context2.getPackageName().equals(serviceInfo.packageName) || (str2 = serviceInfo.name) == null) {
                                str = null;
                            } else {
                                if (str2.startsWith(".")) {
                                    serviceStarterA.f20512a = context2.getPackageName() + serviceInfo.name;
                                } else {
                                    serviceStarterA.f20512a = serviceInfo.name;
                                }
                                str = serviceStarterA.f20512a;
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (str != null) {
                    intent3.setClassName(context2.getPackageName(), str);
                }
                try {
                    i11 = (serviceStarterA.c(context2) ? WakeLockHolder.c(context2, intent3) : context2.startService(intent3)) == null ? 404 : -1;
                } catch (IllegalStateException e8) {
                    e8.toString();
                    i11 = 402;
                } catch (SecurityException unused) {
                    i11 = 401;
                }
                return Integer.valueOf(i11);
            }
        };
        s.a aVar = this.f20468b;
        return Tasks.call(aVar, callable).continueWithTask(aVar, new Continuation() { // from class: com.google.firebase.messaging.d
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return (PlatformVersion.a() && ((Integer) task.getResult()).intValue() == 402) ? FcmBroadcastProcessor.a(context, intent, z12).continueWith(new s.a(1), new a(1)) : task;
            }
        });
    }
}
