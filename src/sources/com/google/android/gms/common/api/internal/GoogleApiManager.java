package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseIntArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.GmsClientSupervisor;
import com.google.android.gms.common.internal.RootTelemetryConfigManager;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.InstantApps;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.e;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import y.f;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class GoogleApiManager implements Handler.Callback {
    public static final Status R = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);
    public static final Status S = new Status(4, "The user must be signed in to make this API call.", null, null);
    public static final Object T = new Object();
    public static GoogleApiManager U;
    public final com.google.android.gms.internal.base.zao P;
    public volatile boolean Q;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TelemetryData f8734c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.google.android.gms.common.internal.service.zat f8735d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f8736e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final GoogleApiAvailability f8737f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final com.google.android.gms.common.internal.zao f8738t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f8732a = 10000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f8733b = false;
    public final AtomicInteger H = new AtomicInteger(1);
    public final AtomicInteger K = new AtomicInteger(0);
    public final ConcurrentHashMap L = new ConcurrentHashMap(5, 0.75f, 1);
    public zaab M = null;
    public final f N = new f(0);
    public final f O = new f(0);

    public GoogleApiManager(Context context, Looper looper, GoogleApiAvailability googleApiAvailability) {
        this.Q = true;
        this.f8736e = context;
        com.google.android.gms.internal.base.zao zaoVar = new com.google.android.gms.internal.base.zao(looper, this);
        Looper.getMainLooper();
        this.P = zaoVar;
        this.f8737f = googleApiAvailability;
        this.f8738t = new com.google.android.gms.common.internal.zao(googleApiAvailability);
        PackageManager packageManager = context.getPackageManager();
        if (DeviceProperties.f9121d == null) {
            DeviceProperties.f9121d = Boolean.valueOf(PlatformVersion.a() && packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (DeviceProperties.f9121d.booleanValue()) {
            this.Q = false;
        }
        zaoVar.sendMessage(zaoVar.obtainMessage(6));
    }

    public static Status c(ApiKey apiKey, ConnectionResult connectionResult) {
        String str = apiKey.f8712b.f8663c;
        String strValueOf = String.valueOf(connectionResult);
        return new Status(17, e.p(new StringBuilder(String.valueOf(str).length() + 63 + strValueOf.length()), "API: ", str, " is not available on this device. Connection failed with: ", strValueOf), connectionResult.f8632c, connectionResult);
    }

    public static GoogleApiManager d(Context context) {
        GoogleApiManager googleApiManager;
        HandlerThread handlerThread;
        synchronized (T) {
            if (U == null) {
                synchronized (GmsClientSupervisor.f8926a) {
                    try {
                        handlerThread = GmsClientSupervisor.f8928c;
                        if (handlerThread == null) {
                            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                            GmsClientSupervisor.f8928c = handlerThread2;
                            handlerThread2.start();
                            handlerThread = GmsClientSupervisor.f8928c;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                U = new GoogleApiManager(context.getApplicationContext(), handlerThread.getLooper(), GoogleApiAvailability.f8643e);
            }
            googleApiManager = U;
        }
        return googleApiManager;
    }

    public final zabk a(GoogleApi googleApi) {
        ApiKey apiKey = googleApi.f8681f;
        ConcurrentHashMap concurrentHashMap = this.L;
        zabk zabkVar = (zabk) concurrentHashMap.get(apiKey);
        if (zabkVar == null) {
            zabkVar = new zabk(this, googleApi);
            concurrentHashMap.put(apiKey, zabkVar);
        }
        if (zabkVar.f8779b.p()) {
            this.O.add(apiKey);
        }
        zabkVar.s();
        return zabkVar;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0044  */
    public final void b(TaskCompletionSource taskCompletionSource, int i11, GoogleApi googleApi) {
        zaby zabyVar;
        GoogleApiManager googleApiManager;
        if (i11 != 0) {
            ApiKey apiKey = googleApi.f8681f;
            if (f()) {
                RootTelemetryConfiguration rootTelemetryConfiguration = RootTelemetryConfigManager.a().f8947a;
                boolean z11 = true;
                if (rootTelemetryConfiguration != null) {
                    if (rootTelemetryConfiguration.f8949b) {
                        boolean z12 = rootTelemetryConfiguration.f8950c;
                        zabk zabkVar = (zabk) this.L.get(apiKey);
                        if (zabkVar != null) {
                            Object obj = zabkVar.f8779b;
                            if (obj instanceof BaseGmsClient) {
                                BaseGmsClient baseGmsClient = (BaseGmsClient) obj;
                                if (baseGmsClient.Y == null || baseGmsClient.g()) {
                                    z11 = z12;
                                } else {
                                    ConnectionTelemetryConfiguration connectionTelemetryConfigurationA = zaby.a(zabkVar, baseGmsClient, i11);
                                    if (connectionTelemetryConfigurationA != null) {
                                        zabkVar.N++;
                                        z11 = connectionTelemetryConfigurationA.f8912c;
                                    }
                                }
                            }
                        } else {
                            z11 = z12;
                        }
                    }
                    zabyVar = null;
                    googleApiManager = this;
                }
                googleApiManager = this;
                zabyVar = new zaby(googleApiManager, i11, apiKey, z11 ? System.currentTimeMillis() : 0L, z11 ? SystemClock.elapsedRealtime() : 0L);
            } else {
                zabyVar = null;
                googleApiManager = this;
            }
            if (zabyVar != null) {
                Task task = taskCompletionSource.getTask();
                final com.google.android.gms.internal.base.zao zaoVar = googleApiManager.P;
                Objects.requireNonNull(zaoVar);
                task.addOnCompleteListener(new Executor() { // from class: com.google.android.gms.common.api.internal.zabp
                    @Override // java.util.concurrent.Executor
                    public final /* synthetic */ void execute(Runnable runnable) {
                        zaoVar.post(runnable);
                    }
                }, zabyVar);
            }
        }
    }

    public final void e(zaab zaabVar) {
        synchronized (T) {
            try {
                if (this.M != zaabVar) {
                    this.M = zaabVar;
                    this.N.clear();
                }
                this.N.addAll(zaabVar.f8769e);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean f() {
        int i11;
        if (this.f8733b) {
            return false;
        }
        RootTelemetryConfiguration rootTelemetryConfiguration = RootTelemetryConfigManager.a().f8947a;
        if (rootTelemetryConfiguration != null && !rootTelemetryConfiguration.f8949b) {
            return false;
        }
        SparseIntArray sparseIntArray = this.f8738t.f8984a;
        synchronized (sparseIntArray) {
            i11 = sparseIntArray.get(203400000, -1);
        }
        return i11 == -1 || i11 == 0;
    }

    public final boolean g(ConnectionResult connectionResult, int i11) {
        PendingIntent activity;
        GoogleApiAvailability googleApiAvailability = this.f8737f;
        googleApiAvailability.getClass();
        Context context = this.f8736e;
        if (!InstantApps.a(context)) {
            boolean zD1 = connectionResult.D1();
            int i12 = connectionResult.f8631b;
            if (zD1) {
                activity = connectionResult.f8632c;
            } else {
                activity = null;
                Intent intentA = googleApiAvailability.a(i12, context, null);
                if (intentA != null) {
                    activity = PendingIntent.getActivity(context, 0, intentA, 201326592);
                }
            }
            if (activity != null) {
                int i13 = GoogleApiActivity.f8692b;
                Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
                intent.putExtra("pending_intent", activity);
                intent.putExtra("failing_client_id", i11);
                intent.putExtra("notify_manager", true);
                googleApiAvailability.g(context, i12, PendingIntent.getActivity(context, 0, intent, com.google.android.gms.internal.base.zak.f9600a | 134217728));
                googleApiAvailability.h(context, connectionResult, false);
                return true;
            }
        }
        return false;
    }

    public final void h(ConnectionResult connectionResult, int i11) {
        if (g(connectionResult, i11)) {
            return;
        }
        com.google.android.gms.internal.base.zao zaoVar = this.P;
        zaoVar.sendMessage(zaoVar.obtainMessage(5, i11, 0, connectionResult));
    }

    /* JADX WARN: Code duplicated, block: B:149:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:151:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:153:0x0335  */
    /* JADX WARN: Code duplicated, block: B:155:0x033f  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v10 com.google.android.gms.common.api.internal.zabk, still in use, count: 2, list:
          (r4v10 com.google.android.gms.common.api.internal.zabk) from 0x02ef: IGET (r4v10 com.google.android.gms.common.api.internal.zabk) A[WRAPPED] (LINE:752) com.google.android.gms.common.api.internal.zabk.t int
          (r4v10 com.google.android.gms.common.api.internal.zabk) from 0x02f5: PHI (r4 I:??) = (r4v7 com.google.android.gms.common.api.internal.zabk), (r4v10 com.google.android.gms.common.api.internal.zabk) binds: [B:147:0x02f4, B:200:0x02f5] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message r18) {
        /*
            Method dump skipped, instruction units count: 1062
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.GoogleApiManager.handleMessage(android.os.Message):boolean");
    }
}
