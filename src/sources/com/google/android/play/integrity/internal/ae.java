package com.google.android.play.integrity.internal;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class ae {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final HashMap f16226o = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f16227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f16228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f16229c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f16233g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Intent f16234h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final z f16235i;
    public ServiceConnection m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public IInterface f16239n;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f16230d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashSet f16231e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f16232f = new Object();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final u f16237k = new IBinder.DeathRecipient() { // from class: com.google.android.play.integrity.internal.u
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            ae aeVar = this.f16267a;
            int i11 = 0;
            aeVar.f16228b.b("reportBinderDeath", new Object[0]);
            y yVar = (y) aeVar.f16236j.get();
            if (yVar != null) {
                aeVar.f16228b.b("calling onBinderDied", new Object[0]);
                yVar.a();
            } else {
                aeVar.f16228b.b("%s : Binder has died.", aeVar.f16229c);
                ArrayList arrayList = aeVar.f16230d;
                int size = arrayList.size();
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    ((t) obj).a(new RemoteException(String.valueOf(aeVar.f16229c).concat(" : Binder has died.")));
                }
                aeVar.f16230d.clear();
            }
            synchronized (aeVar.f16232f) {
                aeVar.e();
            }
        }
    };

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AtomicInteger f16238l = new AtomicInteger(0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final WeakReference f16236j = new WeakReference(null);

    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.android.play.integrity.internal.u] */
    public ae(Context context, s sVar, String str, Intent intent, z zVar) {
        this.f16227a = context;
        this.f16228b = sVar;
        this.f16229c = str;
        this.f16234h = intent;
        this.f16235i = zVar;
    }

    public static /* bridge */ /* synthetic */ void b(ae aeVar, t tVar) {
        IInterface iInterface = aeVar.f16239n;
        s sVar = aeVar.f16228b;
        ArrayList arrayList = aeVar.f16230d;
        int i11 = 0;
        if (iInterface != null || aeVar.f16233g) {
            if (!aeVar.f16233g) {
                tVar.run();
                return;
            } else {
                sVar.b("Waiting to bind to the service.", new Object[0]);
                arrayList.add(tVar);
                return;
            }
        }
        sVar.b("Initiate binding to the service.", new Object[0]);
        arrayList.add(tVar);
        ad adVar = new ad(aeVar);
        aeVar.m = adVar;
        aeVar.f16233g = true;
        if (aeVar.f16227a.bindService(aeVar.f16234h, adVar, 1)) {
            return;
        }
        sVar.b("Failed to bind to the service.", new Object[0]);
        aeVar.f16233g = false;
        int size = arrayList.size();
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((t) obj).a(new af());
        }
        arrayList.clear();
    }

    public final Handler a() {
        Handler handler;
        HashMap map = f16226o;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f16229c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f16229c, 10);
                    handlerThread.start();
                    map.put(this.f16229c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f16229c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    public final void c(t tVar, TaskCompletionSource taskCompletionSource) {
        a().post(new w(this, tVar.c(), taskCompletionSource, tVar));
    }

    public final void d(TaskCompletionSource taskCompletionSource) {
        synchronized (this.f16232f) {
            this.f16231e.remove(taskCompletionSource);
        }
        a().post(new x(this));
    }

    public final void e() {
        HashSet hashSet = this.f16231e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((TaskCompletionSource) it.next()).trySetException(new RemoteException(String.valueOf(this.f16229c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
