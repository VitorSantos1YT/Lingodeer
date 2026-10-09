package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import a4.j;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Trace;
import android.util.Pair;
import android.view.View;
import b7.g;
import b7.k;
import bq.r;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.appcheck.playintegrity.internal.PlayIntegrityAppCheckProvider;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.Qualified;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.inappmessaging.FirebaseInAppMessagingDisplay;
import com.google.firebase.inappmessaging.FirebaseInAppMessagingDisplayCallbacks;
import com.google.firebase.inappmessaging.model.InAppMessage;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigFetchThrottledException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import com.google.firebase.remoteconfig.internal.ConfigAutoFetch;
import com.google.firebase.remoteconfig.internal.ConfigCacheClient;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import com.google.firebase.remoteconfig.internal.ConfigRealtimeHttpClient;
import com.google.firebase.remoteconfig.internal.ConfigSharedPrefsClient;
import com.lingo.lingoskill.ui.learn.BaseAudioLessonActivity;
import com.lingodeer.data.model.INTENTS;
import com.tbruyelle.rxpermissions3.BuildConfig;
import ef.l;
import fb.m;
import fb.q;
import g7.i;
import i.h;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import lf.e0;
import lf.x0;
import p7.h0;
import p7.x;
import qy.b0;
import re.i0;
import re.s;
import rt.m5;
import y6.j0;
import y6.n;
import y6.o0;
import y6.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements SynchronizationGuard.CriticalSection, FirebaseInAppMessagingDisplay, SuccessContinuation, Continuation, j, l, tx.a, b7.l, k, BaseQuickAdapter.OnItemClickListener, ComponentFactory, g, i.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f8174c;

    public /* synthetic */ e(int i11, Object obj, Object obj2) {
        this.f8172a = i11;
        this.f8173b = obj;
        this.f8174c = obj2;
    }

    @Override // b7.l
    public void a(Object obj, n nVar) {
        i iVar = (i) ((g7.b) obj);
        iVar.k((j0) this.f8174c, new ob.l(nVar, ((g7.f) this.f8173b).f28808e));
    }

    @Override // b7.g
    public void accept(Object obj) {
        k7.c cVar = (k7.c) this.f8173b;
        ((h0) obj).F(cVar.f37956a, cVar.f37957b, (x) this.f8174c);
    }

    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
    public Object b() {
        switch (this.f8172a) {
            case 0:
                ((Uploader) this.f8173b).f8134c.u((Iterable) this.f8174c);
                break;
            default:
                Uploader uploader = (Uploader) this.f8173b;
                for (Map.Entry entry : ((HashMap) this.f8174c).entrySet()) {
                    uploader.f8140i.d(((Integer) entry.getValue()).intValue(), LogEventDropped.Reason.INVALID_PAYLOD, (String) entry.getKey());
                }
                break;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [fz.a, kotlin.jvm.internal.n] */
    @Override // a4.j
    public Object c(a4.i iVar) {
        Executor executor = (Executor) this.f8173b;
        ?? r9 = (kotlin.jvm.internal.n) this.f8174c;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        q qVar = new q(atomicBoolean, 1);
        m mVar = m.INSTANCE;
        a4.n nVar = iVar.f349c;
        if (nVar != null) {
            nVar.N(qVar, mVar);
        }
        executor.execute(new androidx.fragment.app.d(atomicBoolean, iVar, (fz.a) r9));
        return b0.f48488a;
    }

    @Override // com.google.firebase.components.ComponentFactory
    public Object d(ComponentContainer componentContainer) {
        switch (this.f8172a) {
            case 13:
                return new PlayIntegrityAppCheckProvider((FirebaseApp) componentContainer.a(FirebaseApp.class), (Executor) componentContainer.f((Qualified) this.f8173b), (Executor) componentContainer.f((Qualified) this.f8174c));
            default:
                String str = (String) this.f8173b;
                Component component = (Component) this.f8174c;
                try {
                    Trace.beginSection(str);
                    return component.f18089f.d(componentContainer);
                } finally {
                    Trace.endSection();
                }
        }
    }

    @Override // com.google.firebase.inappmessaging.FirebaseInAppMessagingDisplay
    public void displayMessage(InAppMessage inAppMessage, FirebaseInAppMessagingDisplayCallbacks firebaseInAppMessagingDisplayCallbacks) {
        com.google.firebase.inappmessaging.display.FirebaseInAppMessagingDisplay firebaseInAppMessagingDisplay = (com.google.firebase.inappmessaging.display.FirebaseInAppMessagingDisplay) this.f8173b;
        Activity activity = (Activity) this.f8174c;
        if (firebaseInAppMessagingDisplay.L == null) {
            firebaseInAppMessagingDisplay.f19719a.getClass();
            firebaseInAppMessagingDisplay.L = inAppMessage;
            firebaseInAppMessagingDisplay.M = firebaseInAppMessagingDisplayCallbacks;
            firebaseInAppMessagingDisplay.b(activity);
        }
    }

    @Override // ef.l
    public void e(File file) {
        ff.e slave = (ff.e) this.f8173b;
        ff.b bVar = (ff.b) this.f8174c;
        kotlin.jvm.internal.m.f(slave, "$slave");
        kotlin.jvm.internal.m.f(file, "file");
        slave.f27242g = bVar;
        slave.f27241f = file;
        Runnable runnable = slave.f27243h;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // i.b
    public void f(Object obj) {
        qp.b bVar = (qp.b) this.f8173b;
        m5 m5Var = (m5) this.f8174c;
        Pair pair = (Pair) obj;
        re.m mVar = (re.m) bVar.f47833c;
        int iA = lf.i.Login.a();
        Object obj2 = pair.first;
        kotlin.jvm.internal.m.e(obj2, "result.first");
        ((lf.j) mVar).a(iA, ((Number) obj2).intValue(), (Intent) pair.second);
        h hVar = (h) m5Var.f50058b;
        if (hVar != null) {
            hVar.b();
        }
        m5Var.f50058b = null;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001d  */
    public void g() {
        boolean z11;
        e0 e0Var = (e0) this.f8173b;
        String str = (String) this.f8174c;
        if (qf.a.b(ve.d.class)) {
            return;
        }
        boolean zA = false;
        if (e0Var != null) {
            try {
                if (e0Var.f40006j) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            } catch (Throwable th2) {
                qf.a.a(ve.d.class, th2);
                return;
            }
        } else {
            z11 = false;
        }
        s sVar = s.f49201a;
        i0 i0Var = i0.f49169a;
        if (!qf.a.b(i0.class)) {
            try {
                i0.f49169a.e();
                zA = i0.f49175g.a();
            } catch (Throwable th3) {
                qf.a.a(i0.class, th3);
            }
        }
        if (z11 && zA) {
            ve.d dVar = ve.d.f53979a;
            if (qf.a.b(dVar)) {
                return;
            }
            try {
                if (ve.d.f53986h) {
                    return;
                }
                ve.d.f53986h = true;
                s.d().execute(new se.c(str, 2));
            } catch (Throwable th4) {
                qf.a.a(dVar, th4);
            }
        }
    }

    public void h(cy.a aVar) {
        no.s sVar = (no.s) this.f8173b;
        String str = (String) this.f8174c;
        DatabaseReference databaseReference = sVar.f43916a;
        if (databaseReference == null) {
            kotlin.jvm.internal.m.n("mUserDb");
            throw null;
        }
        DatabaseReference databaseReferenceE = databaseReference.e(str);
        x0 x0Var = new x0(aVar, 6);
        databaseReferenceE.b(x0Var);
        ux.a aVar2 = new ux.a(new no.b(databaseReferenceE, x0Var));
        while (true) {
            rx.b bVar = (rx.b) aVar.get();
            if (bVar == ux.b.DISPOSED) {
                aVar2.dispose();
                return;
            }
            do {
                if (aVar.compareAndSet(bVar, aVar2)) {
                    if (bVar != null) {
                        bVar.dispose();
                        return;
                    }
                    return;
                }
            } while (aVar.get() == bVar);
        }
    }

    @Override // b7.k
    public void invoke(Object obj) {
        g7.a aVar = (g7.a) this.f8173b;
        x xVar = (x) this.f8174c;
        i iVar = (i) ((g7.b) obj);
        iVar.getClass();
        p7.b0 b0Var = aVar.f28787d;
        if (b0Var == null) {
            return;
        }
        p pVar = xVar.f46531c;
        pVar.getClass();
        int i11 = xVar.f46532d;
        g7.h hVar = iVar.f28829c;
        o0 o0Var = aVar.f28785b;
        b0Var.getClass();
        ij.d dVar = new ij.d(i11, 6, pVar, hVar.c(o0Var, b0Var));
        int i12 = xVar.f46530b;
        if (i12 != 0) {
            if (i12 == 1) {
                iVar.f28842q = dVar;
                return;
            } else if (i12 != 2) {
                if (i12 != 3) {
                    return;
                }
                iVar.f28843r = dVar;
                return;
            }
        }
        iVar.f28841p = dVar;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OnItemClickListener
    public void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
        List list = (List) this.f8173b;
        jp.h0 h0Var = (jp.h0) this.f8174c;
        File file = (File) list.get(i11);
        int i12 = BaseAudioLessonActivity.Q;
        Context contextRequireContext = h0Var.requireContext();
        kotlin.jvm.internal.m.e(contextRequireContext, "requireContext(...)");
        String unitName = h0Var.x().f49336a;
        String name = file.getName();
        kotlin.jvm.internal.m.e(name, "getName(...)");
        long j11 = h0Var.x().f49337b;
        kotlin.jvm.internal.m.f(unitName, "unitName");
        Intent intent = new Intent(contextRequireContext, (Class<?>) BaseAudioLessonActivity.class);
        intent.putExtra(INTENTS.EXTRA_STRING, unitName);
        intent.putExtra(INTENTS.EXTRA_STRING_2, name);
        intent.putExtra(INTENTS.EXTRA_LONG, j11);
        h0Var.startActivity(intent);
    }

    @Override // tx.a
    public void run() {
        int i11 = this.f8172a;
        Object obj = this.f8174c;
        Object obj2 = this.f8173b;
        switch (i11) {
            case 9:
                File file = (File) obj2;
                String str = (String) obj;
                if (file.length() != 0) {
                    String parent = file.getParent();
                    kotlin.jvm.internal.m.e(parent, "getParent(...)");
                    ks.b.o(parent, str);
                }
                break;
            case 17:
                File file2 = (File) obj2;
                qq.a aVar = (qq.a) obj;
                if (file2.length() != 0) {
                    String parent2 = file2.getParent();
                    kotlin.jvm.internal.m.e(parent2, "getParent(...)");
                    aVar.getClass();
                    qy.q qVar = fv.b.f28186a;
                    ks.b.o(parent2, fv.b.B(aVar.f48298b.f46986a));
                }
                break;
            case 18:
                fv.a aVar2 = (fv.a) obj2;
                rp.d dVar = (rp.d) obj;
                File file3 = new File(aVar2.f28184c);
                if (!file3.exists()) {
                    dVar.f49341f.d(aVar2, new fj.a(5, dVar, file3));
                } else {
                    dVar.a(file3);
                }
                break;
            case 23:
                File file4 = (File) obj2;
                yi.b bVar = (yi.b) obj;
                if (file4.length() != 0) {
                    String parent3 = file4.getParent();
                    kotlin.jvm.internal.m.e(parent3, "getParent(...)");
                    qy.q qVar2 = fv.b.f28186a;
                    ks.b.o(parent3, fv.b.B(bVar.f57847b.f56095a - 1));
                }
                break;
            default:
                yi.b bVar2 = (yi.b) obj2;
                HashMap map = (HashMap) obj;
                int[] iArr = r.f4959a;
                if (!bq.m.G()) {
                    bVar2.f57846a.u(BuildConfig.VERSION_NAME, true);
                } else {
                    bVar2.a(map);
                }
                break;
        }
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        ConfigCacheClient configCacheClient = (ConfigCacheClient) this.f8173b;
        ConfigContainer configContainer = (ConfigContainer) this.f8174c;
        HashMap map = ConfigCacheClient.f20689d;
        synchronized (configCacheClient) {
            configCacheClient.f20693c = Tasks.forResult(configContainer);
        }
        return Tasks.forResult(configContainer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ e(Executor executor, fz.a aVar) {
        this.f8172a = 7;
        this.f8173b = executor;
        this.f8174c = (kotlin.jvm.internal.n) aVar;
    }

    /* JADX WARN: Code duplicated, block: B:115:0x015c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:119:0x0169  */
    /* JADX WARN: Code duplicated, block: B:121:0x016c  */
    /* JADX WARN: Code duplicated, block: B:123:0x017d  */
    /* JADX WARN: Code duplicated, block: B:129:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:175:0x005e A[EXC_TOP_SPLITTER, PHI: r13
      0x005e: PHI (r13v6 java.io.InputStream) = (r13v5 java.io.InputStream), (r13v7 java.io.InputStream) binds: [B:30:0x006d, B:19:0x005c] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:181:0x0155 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:183:0x00f5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:185:0x00ea A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e9 A[Catch: all -> 0x0073, TRY_LEAVE, TryCatch #18 {all -> 0x0073, blocks: (B:11:0x003f, B:13:0x0042, B:14:0x0043, B:20:0x005e, B:27:0x0068, B:28:0x006b, B:37:0x0077, B:74:0x00e5, B:76:0x00e9, B:78:0x00ec, B:82:0x00f0, B:77:0x00ea), top: B:189:0x001b, inners: #14 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x0109  */
    /* JADX WARN: Code duplicated, block: B:95:0x010c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [com.google.firebase.remoteconfig.internal.ConfigRealtimeHttpClient] */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Integer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.Integer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.lang.Integer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v23 */
    /* JADX WARN: Type inference failed for: r15v24, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r15v41, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r15v52 */
    /* JADX WARN: Type inference failed for: r15v7, types: [com.google.android.gms.tasks.Task] */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r8v3 */
    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) throws Throwable {
        InputStream errorStream;
        ?? r11;
        ?? ValueOf;
        FirebaseRemoteConfigServerException firebaseRemoteConfigServerException;
        InputStream inputStream;
        boolean z11 = true;
        switch (this.f8172a) {
            case 4:
                ConfigFetchHandler configFetchHandler = (ConfigFetchHandler) this.f8173b;
                HashMap map = (HashMap) this.f8174c;
                int[] iArr = ConfigFetchHandler.f20710k;
                return configFetchHandler.b(task, 0L, map);
            case 5:
                ConfigFetchHandler configFetchHandler2 = (ConfigFetchHandler) this.f8173b;
                Date date = (Date) this.f8174c;
                int[] iArr2 = ConfigFetchHandler.f20710k;
                configFetchHandler2.getClass();
                if (task.isSuccessful()) {
                    ConfigSharedPrefsClient configSharedPrefsClient = configFetchHandler2.f20718h;
                    synchronized (configSharedPrefsClient.f20764b) {
                        configSharedPrefsClient.f20763a.edit().putInt("last_fetch_status", -1).putLong("last_fetch_time_in_millis", date.getTime()).apply();
                        break;
                    }
                } else {
                    Exception exception = task.getException();
                    if (exception != null) {
                        if (exception instanceof FirebaseRemoteConfigFetchThrottledException) {
                            ConfigSharedPrefsClient configSharedPrefsClient2 = configFetchHandler2.f20718h;
                            synchronized (configSharedPrefsClient2.f20764b) {
                                configSharedPrefsClient2.f20763a.edit().putInt("last_fetch_status", 2).apply();
                            }
                        } else {
                            ConfigSharedPrefsClient configSharedPrefsClient3 = configFetchHandler2.f20718h;
                            synchronized (configSharedPrefsClient3.f20764b) {
                                configSharedPrefsClient3.f20763a.edit().putInt("last_fetch_status", 1).apply();
                            }
                        }
                    }
                    break;
                }
                return task;
            default:
                ?? r9 = (ConfigRealtimeHttpClient) this.f8173b;
                ?? inputStream2 = (Task) this.f8174c;
                DefaultClock defaultClock = r9.f20756o;
                ?? r12 = 0;
                try {
                    try {
                        if (inputStream2.isSuccessful()) {
                            HttpURLConnection httpURLConnection = (HttpURLConnection) inputStream2.getResult();
                            r9.f20748f = httpURLConnection;
                            inputStream2 = httpURLConnection.getInputStream();
                            try {
                                errorStream = r9.f20748f.getErrorStream();
                                try {
                                    int responseCode = r9.f20748f.getResponseCode();
                                    ValueOf = Integer.valueOf(responseCode);
                                    if (responseCode == 200) {
                                        try {
                                            synchronized (r9) {
                                                r9.f20745c = 8;
                                            }
                                            r9.f20757p.e(0, ConfigSharedPrefsClient.f20762f);
                                            ConfigAutoFetch configAutoFetchJ = r9.j(r9.f20748f);
                                            HttpURLConnection httpURLConnection2 = configAutoFetchJ.f20678b;
                                            if (httpURLConnection2 != null) {
                                                try {
                                                    inputStream = httpURLConnection2.getInputStream();
                                                    try {
                                                        configAutoFetchJ.b(inputStream);
                                                        if (inputStream != null) {
                                                            try {
                                                                inputStream.close();
                                                                break;
                                                            } catch (IOException unused) {
                                                            }
                                                        }
                                                    } catch (IOException unused2) {
                                                        if (inputStream != null) {
                                                            inputStream.close();
                                                        }
                                                        break;
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        if (inputStream != null) {
                                                            try {
                                                                inputStream.close();
                                                                break;
                                                            } catch (IOException unused3) {
                                                            }
                                                        }
                                                        throw th;
                                                    }
                                                } catch (IOException unused4) {
                                                    inputStream = null;
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    inputStream = null;
                                                }
                                            }
                                        } catch (IOException unused5) {
                                            if (r9.f20747e) {
                                                synchronized (r9) {
                                                    r9.f20745c = 8;
                                                }
                                            }
                                            r9.b(inputStream2, errorStream);
                                            synchronized (r9) {
                                                r9.f20744b = false;
                                            }
                                            if (r9.f20747e || (ValueOf != 0 && !ConfigRealtimeHttpClient.d(ValueOf.intValue()))) {
                                                z11 = false;
                                            }
                                            if (z11) {
                                                defaultClock.getClass();
                                                r9.k(new Date(System.currentTimeMillis()));
                                            }
                                            if (!z11 || ValueOf.intValue() == 200) {
                                                r9.h();
                                            } else {
                                                String strF = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", ValueOf);
                                                if (ValueOf.intValue() == 403) {
                                                    strF = ConfigRealtimeHttpClient.f(r9.f20748f.getErrorStream());
                                                }
                                                firebaseRemoteConfigServerException = new FirebaseRemoteConfigServerException(ValueOf.intValue(), 0, strF);
                                            }
                                            r9.f20748f = null;
                                            return Tasks.forResult(null);
                                        }
                                    }
                                    r9.b(inputStream2, errorStream);
                                    synchronized (r9) {
                                        r9.f20744b = false;
                                    }
                                    z11 = !r9.f20747e && ConfigRealtimeHttpClient.d(responseCode);
                                    if (z11) {
                                        defaultClock.getClass();
                                        r9.k(new Date(System.currentTimeMillis()));
                                    }
                                    if (!z11 && responseCode != 200) {
                                        String strF2 = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", ValueOf);
                                        if (responseCode == 403) {
                                            strF2 = ConfigRealtimeHttpClient.f(r9.f20748f.getErrorStream());
                                        }
                                        firebaseRemoteConfigServerException = new FirebaseRemoteConfigServerException(responseCode, 0, strF2);
                                        r9.g(firebaseRemoteConfigServerException);
                                    } else {
                                        r9.h();
                                    }
                                } catch (IOException unused6) {
                                    ValueOf = 0;
                                } catch (Throwable th4) {
                                    th = th4;
                                    ValueOf = 0;
                                    r12 = inputStream2;
                                    r11 = ValueOf;
                                    r9.b(r12, errorStream);
                                    synchronized (r9) {
                                        r9.f20744b = false;
                                        if (r9.f20747e) {
                                            z11 = false;
                                        } else {
                                            z11 = false;
                                        }
                                        if (z11) {
                                            defaultClock.getClass();
                                            r9.k(new Date(System.currentTimeMillis()));
                                        }
                                        if (z11) {
                                            r9.h();
                                        } else {
                                            r9.h();
                                        }
                                        throw th;
                                    }
                                }
                            } catch (IOException unused7) {
                                errorStream = null;
                                inputStream2 = inputStream2;
                                ValueOf = errorStream;
                                if (r9.f20747e) {
                                    synchronized (r9) {
                                        r9.f20745c = 8;
                                    }
                                }
                                r9.b(inputStream2, errorStream);
                                synchronized (r9) {
                                    r9.f20744b = false;
                                    if (r9.f20747e) {
                                        z11 = false;
                                    } else {
                                        z11 = false;
                                    }
                                    if (z11) {
                                        defaultClock.getClass();
                                        r9.k(new Date(System.currentTimeMillis()));
                                    }
                                    if (!z11) {
                                    }
                                    r9.h();
                                    r9.f20748f = null;
                                    return Tasks.forResult(null);
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                errorStream = null;
                                ValueOf = 0;
                            }
                            r9.f20748f = null;
                            return Tasks.forResult(null);
                        }
                        throw new IOException(inputStream2.getException());
                    } catch (Throwable th6) {
                        th = th6;
                        r12 = inputStream2;
                        r11 = ValueOf;
                        r9.b(r12, errorStream);
                        synchronized (r9) {
                            r9.f20744b = false;
                        }
                        if (r9.f20747e || (r11 != 0 && !ConfigRealtimeHttpClient.d(r11.intValue()))) {
                            z11 = false;
                        }
                        if (z11) {
                            defaultClock.getClass();
                            r9.k(new Date(System.currentTimeMillis()));
                        }
                        if (z11 && r11.intValue() != 200) {
                            String strF3 = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", r11);
                            if (r11.intValue() == 403) {
                                strF3 = ConfigRealtimeHttpClient.f(r9.f20748f.getErrorStream());
                            }
                            r9.g(new FirebaseRemoteConfigServerException(r11.intValue(), 0, strF3));
                        } else {
                            r9.h();
                        }
                        throw th;
                    }
                } catch (IOException unused8) {
                    inputStream2 = 0;
                    errorStream = null;
                } catch (Throwable th7) {
                    th = th7;
                    errorStream = null;
                    r11 = 0;
                    r9.b(r12, errorStream);
                    synchronized (r9) {
                        r9.f20744b = false;
                        if (r9.f20747e) {
                            z11 = false;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            defaultClock.getClass();
                            r9.k(new Date(System.currentTimeMillis()));
                        }
                        if (z11) {
                            r9.h();
                        } else {
                            r9.h();
                        }
                        throw th;
                    }
                }
                break;
        }
    }
}
