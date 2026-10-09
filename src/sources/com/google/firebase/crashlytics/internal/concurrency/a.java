package com.google.firebase.crashlytics.internal.concurrency;

import a4.i;
import a4.j;
import androidx.fragment.app.d;
import b7.g;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.DefaultScheduler;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableListIterator;
import com.google.firebase.installations.InstallationTokenResult;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import com.google.firebase.remoteconfig.internal.ConfigRealtimeHttpClient;
import com.google.firebase.remoteconfig.internal.rollouts.RolloutsStateSubscriptionsHandler;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutsStateSubscriber;
import fb.m;
import fb.q;
import fz.e;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import k7.c;
import p7.b0;
import p7.h0;
import p7.x;
import rz.d0;
import rz.e0;
import rz.g1;
import rz.z;
import s7.n;
import y6.p0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Continuation, j, SynchronizationGuard.CriticalSection, OnSuccessListener, g, n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f18380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f18381c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f18382d;

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, int i11) {
        this.f18379a = i11;
        this.f18380b = obj;
        this.f18381c = obj2;
        this.f18382d = obj3;
    }

    @Override // b7.g
    public void accept(Object obj) {
        c cVar = (c) this.f18380b;
        ((h0) obj).m(cVar.f37956a, (b0) this.f18381c, (x) this.f18382d);
    }

    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
    public Object b() {
        DefaultScheduler defaultScheduler = (DefaultScheduler) this.f18380b;
        TransportContext transportContext = (TransportContext) this.f18381c;
        defaultScheduler.f8105d.W0(transportContext, (EventInternal) this.f18382d);
        defaultScheduler.f8102a.a(transportContext, 1);
        return null;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [fz.e, xy.i] */
    @Override // a4.j
    public Object c(i iVar) {
        switch (this.f18379a) {
            case 3:
                Executor executor = (Executor) this.f18380b;
                String str = (String) this.f18381c;
                fz.a aVar = (fz.a) this.f18382d;
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                q qVar = new q(atomicBoolean, 0);
                m mVar = m.INSTANCE;
                a4.n nVar = iVar.f349c;
                if (nVar != null) {
                    nVar.N(qVar, mVar);
                }
                executor.execute(new d(atomicBoolean, iVar, aVar, 7));
                return str;
            default:
                vy.i iVar2 = (vy.i) this.f18380b;
                d0 d0Var = (d0) this.f18381c;
                ?? r9 = (xy.i) this.f18382d;
                b2.a aVar2 = new b2.a((g1) iVar2.get(z.f50978b), 16);
                m mVar2 = m.INSTANCE;
                a4.n nVar2 = iVar.f349c;
                if (nVar2 != null) {
                    nVar2.N(aVar2, mVar2);
                }
                return e0.B(e0.c(iVar2), null, d0Var, new a0.e0((e) r9, iVar, (vy.d) null), 1);
        }
    }

    @Override // s7.n
    public List e(int i11, p0 p0Var, int[] iArr) {
        s7.j jVar = (s7.j) this.f18380b;
        String str = (String) this.f18381c;
        String str2 = (String) this.f18382d;
        UnmodifiableListIterator unmodifiableListIterator = ImmutableList.f16771b;
        ImmutableList.Builder builder = new ImmutableList.Builder();
        for (int i12 = 0; i12 < p0Var.f57304a; i12++) {
            builder.h(new s7.m(i11, p0Var, i12, jVar, iArr[i12], str, str2));
        }
        return builder.j();
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        RolloutsStateSubscriptionsHandler rolloutsStateSubscriptionsHandler = (RolloutsStateSubscriptionsHandler) this.f18380b;
        Task task = (Task) this.f18381c;
        RolloutsStateSubscriber rolloutsStateSubscriber = (RolloutsStateSubscriber) this.f18382d;
        try {
            ConfigContainer configContainer = (ConfigContainer) task.getResult();
            if (configContainer != null) {
                rolloutsStateSubscriptionsHandler.f20786c.execute(new og.a(rolloutsStateSubscriber, rolloutsStateSubscriptionsHandler.f20785b.a(configContainer), 0));
            }
        } catch (FirebaseRemoteConfigException unused) {
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        ConfigContainer configContainer;
        int i11 = this.f18379a;
        URL url = null;
        Object obj = this.f18382d;
        Object obj2 = this.f18381c;
        Object obj3 = this.f18380b;
        switch (i11) {
            case 0:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj3;
                AtomicBoolean atomicBoolean = (AtomicBoolean) obj2;
                CancellationTokenSource cancellationTokenSource = (CancellationTokenSource) obj;
                if (task.isSuccessful()) {
                    taskCompletionSource.trySetResult(task.getResult());
                } else if (task.getException() != null) {
                    taskCompletionSource.trySetException(task.getException());
                } else if (atomicBoolean.getAndSet(true)) {
                    cancellationTokenSource.cancel();
                }
                return Tasks.forResult(null);
            case 1:
                FirebaseRemoteConfig firebaseRemoteConfig = (FirebaseRemoteConfig) obj3;
                Task task2 = (Task) obj2;
                Task task3 = (Task) obj;
                if (!task2.isSuccessful() || task2.getResult() == null) {
                    return Tasks.forResult(Boolean.FALSE);
                }
                ConfigContainer configContainer2 = (ConfigContainer) task2.getResult();
                return (task3.isSuccessful() && (configContainer = (ConfigContainer) task3.getResult()) != null && configContainer2.f20698c.equals(configContainer.f20698c)) ? Tasks.forResult(Boolean.FALSE) : firebaseRemoteConfig.f20649e.d(configContainer2).continueWith(firebaseRemoteConfig.f20647c, new com.google.firebase.database.android.d(firebaseRemoteConfig, 4));
            default:
                ConfigRealtimeHttpClient configRealtimeHttpClient = (ConfigRealtimeHttpClient) obj3;
                Task task4 = (Task) obj2;
                Task task5 = (Task) obj;
                int[] iArr = ConfigRealtimeHttpClient.f20741r;
                if (!task4.isSuccessful()) {
                    return Tasks.forException(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation auth token for config update listener connection.", task4.getException()));
                }
                if (!task5.isSuccessful()) {
                    return Tasks.forException(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation ID for config update listener connection.", task5.getException()));
                }
                try {
                    try {
                        url = new URL(configRealtimeHttpClient.c(configRealtimeHttpClient.m));
                    } catch (IOException e8) {
                        return Tasks.forException(new FirebaseRemoteConfigClientException("Failed to open HTTP stream connection", e8));
                    }
                } catch (MalformedURLException unused) {
                }
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                configRealtimeHttpClient.i(httpURLConnection, (String) task5.getResult(), ((InstallationTokenResult) task4.getResult()).a());
                return Tasks.forResult(httpURLConnection);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ a(vy.i iVar, d0 d0Var, e eVar) {
        this.f18379a = 4;
        this.f18380b = iVar;
        this.f18381c = d0Var;
        this.f18382d = (xy.i) eVar;
    }
}
