package com.google.firebase.messaging;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.cloudmessaging.Rpc;
import com.google.android.gms.cloudmessaging.zzv;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.events.Event;
import com.google.firebase.events.EventHandler;
import com.google.firebase.events.Subscriber;
import com.google.firebase.iid.internal.FirebaseInstanceIdInternal;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import l0.Eeqr.HOBXIlHxIkMBEA;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class FirebaseMessaging {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static Store f20471l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static ScheduledThreadPoolExecutor f20472n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FirebaseApp f20473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FirebaseInstanceIdInternal f20474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f20475c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final GmsRpc f20476d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final RequestDeduplicator f20477e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AutoInit f20478f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f20479g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ThreadPoolExecutor f20480h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Metadata f20481i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f20482j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final long f20470k = TimeUnit.HOURS.toSeconds(8);
    public static Provider m = new f();

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class AutoInit {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Subscriber f20483a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f20484b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Boolean f20485c;

        public AutoInit(Subscriber subscriber) {
            this.f20483a = subscriber;
        }

        public final synchronized boolean a() {
            try {
                synchronized (this) {
                    try {
                        if (!this.f20484b) {
                            Boolean boolB = b();
                            this.f20485c = boolB;
                            if (boolB == null) {
                                this.f20483a.a(new EventHandler() { // from class: com.google.firebase.messaging.j
                                    @Override // com.google.firebase.events.EventHandler
                                    public final void a(Event event) {
                                        FirebaseMessaging.AutoInit autoInit = this.f20590a;
                                        if (autoInit.a()) {
                                            FirebaseMessaging firebaseMessaging = FirebaseMessaging.this;
                                            Store store = FirebaseMessaging.f20471l;
                                            firebaseMessaging.i();
                                        }
                                    }
                                });
                            }
                            this.f20484b = true;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return bool != null ? bool.booleanValue() : FirebaseMessaging.this.f20473a.k();
            } catch (Throwable th3) {
                throw th3;
            }
            Boolean bool = this.f20485c;
            return bool != null ? bool.booleanValue() : FirebaseMessaging.this.f20473a.k();
        }

        public final Boolean b() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            String str = HOBXIlHxIkMBEA.Fql;
            FirebaseApp firebaseApp = FirebaseMessaging.this.f20473a;
            firebaseApp.b();
            Context context = firebaseApp.f17714a;
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey(str)) {
                    return null;
                }
                return Boolean.valueOf(applicationInfo.metaData.getBoolean(str));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }
    }

    public FirebaseMessaging(FirebaseApp firebaseApp, FirebaseInstanceIdInternal firebaseInstanceIdInternal, Provider provider, Provider provider2, FirebaseInstallationsApi firebaseInstallationsApi, Provider provider3, Subscriber subscriber) {
        firebaseApp.b();
        Context context = firebaseApp.f17714a;
        final Metadata metadata = new Metadata(context);
        final GmsRpc gmsRpc = new GmsRpc(firebaseApp, metadata, provider, provider2, firebaseInstallationsApi);
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new NamedThreadFactory("Firebase-Messaging-Task"));
        final int i11 = 1;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("Firebase-Messaging-Init"));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory("Firebase-Messaging-File-Io"));
        final int i12 = 0;
        this.f20482j = false;
        m = provider3;
        this.f20473a = firebaseApp;
        this.f20474b = firebaseInstanceIdInternal;
        this.f20478f = new AutoInit(subscriber);
        firebaseApp.b();
        final Context context2 = firebaseApp.f17714a;
        this.f20475c = context2;
        FcmLifecycleCallbacks fcmLifecycleCallbacks = new FcmLifecycleCallbacks();
        this.f20481i = metadata;
        this.f20476d = gmsRpc;
        this.f20477e = new RequestDeduplicator(executorServiceNewSingleThreadExecutor);
        this.f20479g = scheduledThreadPoolExecutor;
        this.f20480h = threadPoolExecutor;
        firebaseApp.b();
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(fcmLifecycleCallbacks);
        } else {
            Objects.toString(context);
        }
        if (firebaseInstanceIdInternal != null) {
            firebaseInstanceIdInternal.c();
        }
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: com.google.firebase.messaging.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FirebaseMessaging f20584b;

            {
                this.f20584b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Task taskForException;
                switch (i12) {
                    case 0:
                        FirebaseMessaging firebaseMessaging = this.f20584b;
                        if (firebaseMessaging.f20478f.a()) {
                            firebaseMessaging.i();
                        }
                        break;
                    default:
                        FirebaseMessaging firebaseMessaging2 = this.f20584b;
                        final Context context3 = firebaseMessaging2.f20475c;
                        ProxyNotificationInitializer.a(context3);
                        GmsRpc gmsRpc2 = firebaseMessaging2.f20476d;
                        final boolean zH = firebaseMessaging2.h();
                        if (Build.VERSION.SDK_INT >= 29) {
                            SharedPreferences sharedPreferencesA = ProxyNotificationPreferences.a(context3);
                            if (!sharedPreferencesA.contains("proxy_retention") || sharedPreferencesA.getBoolean("proxy_retention", false) != zH) {
                                Rpc rpc = gmsRpc2.f20490c;
                                if (rpc.f8572c.a() >= 241100000) {
                                    Bundle bundle = new Bundle();
                                    bundle.putBoolean("proxy_retention", zH);
                                    taskForException = zzv.a(rpc.f8571b).b(4, bundle);
                                } else {
                                    taskForException = Tasks.forException(new IOException("SERVICE_NOT_AVAILABLE"));
                                }
                                taskForException.addOnSuccessListener(new s.a(1), new OnSuccessListener() { // from class: com.google.firebase.messaging.l
                                    @Override // com.google.android.gms.tasks.OnSuccessListener
                                    public final void onSuccess(Object obj) {
                                        SharedPreferences.Editor editorEdit = ProxyNotificationPreferences.a(context3).edit();
                                        editorEdit.putBoolean("proxy_retention", zH);
                                        editorEdit.apply();
                                    }
                                });
                            }
                        }
                        if (firebaseMessaging2.h()) {
                            firebaseMessaging2.g();
                        }
                        break;
                }
            }
        });
        final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("Firebase-Messaging-Topics-Io"));
        int i13 = TopicsSubscriber.f20541j;
        Tasks.call(scheduledThreadPoolExecutor2, new Callable() { // from class: com.google.firebase.messaging.o
            @Override // java.util.concurrent.Callable
            public final Object call() {
                TopicsStore topicsStore;
                Context context3 = context2;
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor3 = scheduledThreadPoolExecutor2;
                FirebaseMessaging firebaseMessaging = this;
                Metadata metadata2 = metadata;
                GmsRpc gmsRpc2 = gmsRpc;
                int i14 = TopicsSubscriber.f20541j;
                synchronized (TopicsStore.class) {
                    try {
                        WeakReference weakReference = TopicsStore.f20537c;
                        topicsStore = weakReference != null ? (TopicsStore) weakReference.get() : null;
                        if (topicsStore == null) {
                            SharedPreferences sharedPreferences = context3.getSharedPreferences("com.google.android.gms.appid", 0);
                            TopicsStore topicsStore2 = new TopicsStore(sharedPreferences, scheduledThreadPoolExecutor3);
                            synchronized (topicsStore2) {
                                topicsStore2.f20538a = SharedPreferencesQueue.a(sharedPreferences, scheduledThreadPoolExecutor3);
                            }
                            TopicsStore.f20537c = new WeakReference(topicsStore2);
                            topicsStore = topicsStore2;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return new TopicsSubscriber(firebaseMessaging, metadata2, topicsStore, gmsRpc2, context3, scheduledThreadPoolExecutor3);
            }
        }).addOnSuccessListener(scheduledThreadPoolExecutor, new h(this, i12));
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: com.google.firebase.messaging.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FirebaseMessaging f20584b;

            {
                this.f20584b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Task taskForException;
                switch (i11) {
                    case 0:
                        FirebaseMessaging firebaseMessaging = this.f20584b;
                        if (firebaseMessaging.f20478f.a()) {
                            firebaseMessaging.i();
                        }
                        break;
                    default:
                        FirebaseMessaging firebaseMessaging2 = this.f20584b;
                        final Context context3 = firebaseMessaging2.f20475c;
                        ProxyNotificationInitializer.a(context3);
                        GmsRpc gmsRpc2 = firebaseMessaging2.f20476d;
                        final boolean zH = firebaseMessaging2.h();
                        if (Build.VERSION.SDK_INT >= 29) {
                            SharedPreferences sharedPreferencesA = ProxyNotificationPreferences.a(context3);
                            if (!sharedPreferencesA.contains("proxy_retention") || sharedPreferencesA.getBoolean("proxy_retention", false) != zH) {
                                Rpc rpc = gmsRpc2.f20490c;
                                if (rpc.f8572c.a() >= 241100000) {
                                    Bundle bundle = new Bundle();
                                    bundle.putBoolean("proxy_retention", zH);
                                    taskForException = zzv.a(rpc.f8571b).b(4, bundle);
                                } else {
                                    taskForException = Tasks.forException(new IOException("SERVICE_NOT_AVAILABLE"));
                                }
                                taskForException.addOnSuccessListener(new s.a(1), new OnSuccessListener() { // from class: com.google.firebase.messaging.l
                                    @Override // com.google.android.gms.tasks.OnSuccessListener
                                    public final void onSuccess(Object obj) {
                                        SharedPreferences.Editor editorEdit = ProxyNotificationPreferences.a(context3).edit();
                                        editorEdit.putBoolean("proxy_retention", zH);
                                        editorEdit.apply();
                                    }
                                });
                            }
                        }
                        if (firebaseMessaging2.h()) {
                            firebaseMessaging2.g();
                        }
                        break;
                }
            }
        });
    }

    public static void b(Runnable runnable, long j11) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (f20472n == null) {
                    f20472n = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("TAG"));
                }
                f20472n.schedule(runnable, j11, TimeUnit.SECONDS);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static synchronized FirebaseMessaging c() {
        return getInstance(FirebaseApp.e());
    }

    public static synchronized Store d(Context context) {
        try {
            if (f20471l == null) {
                f20471l = new Store(context);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f20471l;
    }

    public static synchronized FirebaseMessaging getInstance(FirebaseApp firebaseApp) {
        FirebaseMessaging firebaseMessaging;
        firebaseMessaging = (FirebaseMessaging) firebaseApp.c(FirebaseMessaging.class);
        Preconditions.h(firebaseMessaging, "Firebase Messaging component is not present");
        return firebaseMessaging;
    }

    public final String a() throws IOException {
        Task taskContinueWithTask;
        FirebaseInstanceIdInternal firebaseInstanceIdInternal = this.f20474b;
        if (firebaseInstanceIdInternal != null) {
            try {
                return (String) Tasks.await(firebaseInstanceIdInternal.b());
            } catch (InterruptedException | ExecutionException e8) {
                throw new IOException(e8);
            }
        }
        final Store.Token tokenF = f();
        if (!k(tokenF)) {
            return tokenF.f20524a;
        }
        final String strB = Metadata.b(this.f20473a);
        RequestDeduplicator requestDeduplicator = this.f20477e;
        synchronized (requestDeduplicator) {
            taskContinueWithTask = (Task) requestDeduplicator.f20510b.get(strB);
            if (taskContinueWithTask == null) {
                GmsRpc gmsRpc = this.f20476d;
                taskContinueWithTask = gmsRpc.a(gmsRpc.c(Metadata.b(gmsRpc.f20488a), "*", new Bundle())).onSuccessTask(this.f20480h, new SuccessContinuation() { // from class: com.google.firebase.messaging.i
                    @Override // com.google.android.gms.tasks.SuccessContinuation
                    public final Task then(Object obj) {
                        String string;
                        FirebaseMessaging firebaseMessaging = this.f20587a;
                        String str = strB;
                        Store.Token token = tokenF;
                        String str2 = (String) obj;
                        Store storeD = FirebaseMessaging.d(firebaseMessaging.f20475c);
                        FirebaseApp firebaseApp = firebaseMessaging.f20473a;
                        firebaseApp.b();
                        String strG = "[DEFAULT]".equals(firebaseApp.f17715b) ? com.tbruyelle.rxpermissions3.BuildConfig.VERSION_NAME : firebaseApp.g();
                        String strA = firebaseMessaging.f20481i.a();
                        synchronized (storeD) {
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            int i11 = Store.Token.f20523e;
                            try {
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("token", str2);
                                jSONObject.put("appVersion", strA);
                                jSONObject.put("timestamp", jCurrentTimeMillis);
                                string = jSONObject.toString();
                            } catch (JSONException e10) {
                                e10.toString();
                                string = null;
                            }
                            if (string != null) {
                                SharedPreferences.Editor editorEdit = storeD.f20521a.edit();
                                editorEdit.putString(strG + "|T|" + str + "|*", string);
                                editorEdit.commit();
                            }
                        }
                        if (token == null || !str2.equals(token.f20524a)) {
                            FirebaseApp firebaseApp2 = firebaseMessaging.f20473a;
                            firebaseApp2.b();
                            if ("[DEFAULT]".equals(firebaseApp2.f17715b)) {
                                if (Log.isLoggable("FirebaseMessaging", 3)) {
                                    firebaseApp2.b();
                                }
                                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                                intent.putExtra("token", str2);
                                new FcmBroadcastProcessor(firebaseMessaging.f20475c).b(intent);
                            }
                        }
                        return Tasks.forResult(str2);
                    }
                }).continueWithTask(requestDeduplicator.f20509a, new m(requestDeduplicator, strB));
                requestDeduplicator.f20510b.put(strB, taskContinueWithTask);
            }
        }
        try {
            return (String) Tasks.await(taskContinueWithTask);
        } catch (InterruptedException | ExecutionException e10) {
            throw new IOException(e10);
        }
    }

    public final Task e() {
        FirebaseInstanceIdInternal firebaseInstanceIdInternal = this.f20474b;
        if (firebaseInstanceIdInternal != null) {
            return firebaseInstanceIdInternal.b();
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f20479g.execute(new e(1, this, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public final Store.Token f() {
        Store.Token tokenA;
        Store storeD = d(this.f20475c);
        FirebaseApp firebaseApp = this.f20473a;
        firebaseApp.b();
        String strG = "[DEFAULT]".equals(firebaseApp.f17715b) ? com.tbruyelle.rxpermissions3.BuildConfig.VERSION_NAME : firebaseApp.g();
        String strB = Metadata.b(this.f20473a);
        synchronized (storeD) {
            tokenA = Store.Token.a(storeD.f20521a.getString(strG + "|T|" + strB + "|*", null));
        }
        return tokenA;
    }

    public final void g() {
        Rpc rpc = this.f20476d.f20490c;
        (rpc.f8572c.a() >= 241100000 ? zzv.a(rpc.f8571b).c(5, Bundle.EMPTY).continueWith(Rpc.f8568j, new Continuation() { // from class: com.google.android.gms.cloudmessaging.zzab
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                Intent intent = (Intent) ((Bundle) task.getResult()).getParcelable("notification_data");
                if (intent != null) {
                    return new CloudMessage(intent);
                }
                return null;
            }
        }) : Tasks.forException(new IOException("SERVICE_NOT_AVAILABLE"))).addOnSuccessListener(this.f20479g, new h(this, 1));
    }

    public final boolean h() {
        Context context = this.f20475c;
        ProxyNotificationInitializer.a(context);
        if (!ProxyNotificationInitializer.b(context)) {
            return false;
        }
        if (this.f20473a.c(AnalyticsConnector.class) != null) {
            return true;
        }
        return MessagingAnalytics.a() && m != null;
    }

    public final void i() {
        FirebaseInstanceIdInternal firebaseInstanceIdInternal = this.f20474b;
        if (firebaseInstanceIdInternal != null) {
            firebaseInstanceIdInternal.a();
        } else if (k(f())) {
            synchronized (this) {
                if (!this.f20482j) {
                    j(0L);
                }
            }
        }
    }

    public final synchronized void j(long j11) {
        b(new SyncTask(this, Math.min(Math.max(30L, 2 * j11), f20470k)), j11);
        this.f20482j = true;
    }

    public final boolean k(Store.Token token) {
        if (token != null) {
            return System.currentTimeMillis() > token.f20526c + Store.Token.f20522d || !this.f20481i.a().equals(token.f20525b);
        }
        return true;
    }
}
