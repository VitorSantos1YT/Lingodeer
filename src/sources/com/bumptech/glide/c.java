package com.bumptech.glide;

import android.app.ActivityManager;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Looper;
import android.text.TextUtils;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;
import androidx.fragment.app.k1;
import ay.k0;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import re.v;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements ComponentCallbacks2 {
    public static volatile c K;
    public static volatile boolean L;
    public final ArrayList H = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vd.o f7606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wd.a f7607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xd.c f7608c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f7609d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m0.n f7610e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ie.l f7611f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final k0 f7612t;

    public c(Context context, vd.o oVar, xd.c cVar, wd.a aVar, m0.n nVar, ie.l lVar, k0 k0Var, int i11, b bVar, y.e eVar, List list, List list2, g gVar, a5.f fVar) {
        this.f7606a = oVar;
        this.f7607b = aVar;
        this.f7610e = nVar;
        this.f7608c = cVar;
        this.f7611f = lVar;
        this.f7612t = k0Var;
        bq.f fVar2 = new bq.f();
        fVar2.f4944b = this;
        fVar2.f4945c = list2;
        fVar2.f4946d = gVar;
        this.f7609d = new i(context, nVar, fVar2, new k0(22), bVar, eVar, list, oVar, fVar, i11);
    }

    public static c c(Context context) {
        GeneratedAppGlideModule generatedAppGlideModule;
        if (K == null) {
            try {
                generatedAppGlideModule = (GeneratedAppGlideModule) GeneratedAppGlideModuleImpl.class.getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext().getApplicationContext());
            } catch (ClassNotFoundException unused) {
                generatedAppGlideModule = null;
            } catch (IllegalAccessException e8) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e8);
            } catch (InstantiationException e10) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e10);
            } catch (NoSuchMethodException e11) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e11);
            } catch (InvocationTargetException e12) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e12);
            }
            synchronized (c.class) {
                if (K == null) {
                    if (L) {
                        throw new IllegalStateException("Glide has been called recursively, this is probably an internal library error!");
                    }
                    L = true;
                    try {
                        d(context, generatedAppGlideModule);
                        L = false;
                    } catch (Throwable th2) {
                        L = false;
                        throw th2;
                    }
                }
            }
        }
        return K;
    }

    public static void d(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        h hVar = new h();
        Context applicationContext = context.getApplicationContext();
        List arrayList = Collections.EMPTY_LIST;
        if (generatedAppGlideModule == null || !(generatedAppGlideModule instanceof GeneratedAppGlideModuleImpl)) {
            arrayList = new ArrayList();
            try {
                ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
                if (applicationInfo != null && applicationInfo.metaData != null) {
                    if (Log.isLoggable("ManifestParser", 2)) {
                        Objects.toString(applicationInfo.metaData);
                    }
                    for (String str : applicationInfo.metaData.keySet()) {
                        if ("GlideModule".equals(applicationInfo.metaData.get(str))) {
                            ef.e.u(str);
                            throw null;
                        }
                    }
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        List list = arrayList;
        if (generatedAppGlideModule != null && !new HashSet().isEmpty()) {
            new HashSet();
            Iterator it = list.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            Iterator it2 = list.iterator();
            if (it2.hasNext()) {
                it2.next().getClass();
                throw new ClassCastException();
            }
        }
        Iterator it3 = list.iterator();
        if (it3.hasNext()) {
            it3.next().getClass();
            throw new ClassCastException();
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.f(applicationContext, hVar);
        }
        if (hVar.f7620g == null) {
            yd.a aVar = new yd.a();
            if (yd.d.f57741c == 0) {
                yd.d.f57741c = Math.min(4, Runtime.getRuntime().availableProcessors());
            }
            int i11 = yd.d.f57741c;
            if (TextUtils.isEmpty("source")) {
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: source");
            }
            hVar.f7620g = new yd.d(new ThreadPoolExecutor(i11, i11, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new yd.b(aVar, "source", false)));
        }
        if (hVar.f7621h == null) {
            int i12 = yd.d.f57741c;
            yd.a aVar2 = new yd.a();
            if (TextUtils.isEmpty("disk-cache")) {
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: disk-cache");
            }
            hVar.f7621h = new yd.d(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new yd.b(aVar2, "disk-cache", true)));
        }
        if (hVar.f7626n == null) {
            if (yd.d.f57741c == 0) {
                yd.d.f57741c = Math.min(4, Runtime.getRuntime().availableProcessors());
            }
            int i13 = yd.d.f57741c >= 4 ? 2 : 1;
            yd.a aVar3 = new yd.a();
            if (TextUtils.isEmpty("animation")) {
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: animation");
            }
            hVar.f7626n = new yd.d(new ThreadPoolExecutor(i13, i13, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new yd.b(aVar3, "animation", true)));
        }
        if (hVar.f7623j == null) {
            xd.d dVar = new xd.d(applicationContext);
            c7.j jVar = new c7.j();
            Context context2 = dVar.f56010a;
            float f5 = dVar.f56013d;
            ActivityManager activityManager = dVar.f56011b;
            int i14 = activityManager.isLowRamDevice() ? 2097152 : 4194304;
            jVar.f6662c = i14;
            int iRound = Math.round(activityManager.getMemoryClass() * 1048576 * (activityManager.isLowRamDevice() ? 0.33f : 0.4f));
            DisplayMetrics displayMetrics = (DisplayMetrics) dVar.f56012c.f52454b;
            float f11 = displayMetrics.widthPixels * displayMetrics.heightPixels * 4;
            int iRound2 = Math.round(f11 * f5);
            int iRound3 = Math.round(f11 * 2.0f);
            int i15 = iRound - i14;
            if (iRound3 + iRound2 <= i15) {
                jVar.f6661b = iRound3;
                jVar.f6660a = iRound2;
            } else {
                float f12 = i15 / (f5 + 2.0f);
                jVar.f6661b = Math.round(f12 * 2.0f);
                jVar.f6660a = Math.round(f12 * f5);
            }
            if (Log.isLoggable("MemorySizeCalculator", 3)) {
                Formatter.formatFileSize(context2, jVar.f6661b);
                Formatter.formatFileSize(context2, jVar.f6660a);
                Formatter.formatFileSize(context2, i14);
                Formatter.formatFileSize(context2, iRound);
                activityManager.getMemoryClass();
                activityManager.isLowRamDevice();
            }
            hVar.f7623j = jVar;
        }
        if (hVar.f7624k == null) {
            hVar.f7624k = new k0(15);
        }
        if (hVar.f7617d == null) {
            int i16 = hVar.f7623j.f6660a;
            if (i16 > 0) {
                hVar.f7617d = new wd.f(i16);
            } else {
                hVar.f7617d = new v(11);
            }
        }
        if (hVar.f7618e == null) {
            hVar.f7618e = new m0.n(hVar.f7623j.f6662c);
        }
        if (hVar.f7619f == null) {
            hVar.f7619f = new xd.c(hVar.f7623j.f6661b);
        }
        if (hVar.f7622i == null) {
            hVar.f7622i = new o20.i(applicationContext, 28);
        }
        if (hVar.f7616c == null) {
            hVar.f7616c = new vd.o(hVar.f7619f, hVar.f7622i, hVar.f7621h, hVar.f7620g, new yd.d(new ThreadPoolExecutor(0, Integer.MAX_VALUE, yd.d.f57740b, TimeUnit.MILLISECONDS, new SynchronousQueue(), new yd.b(new yd.a(), "source-unlimited", false))), hVar.f7626n);
        }
        List list2 = hVar.f7627o;
        if (list2 == null) {
            hVar.f7627o = Collections.EMPTY_LIST;
        } else {
            hVar.f7627o = Collections.unmodifiableList(list2);
        }
        j jVar2 = hVar.f7615b;
        jVar2.getClass();
        c cVar = new c(applicationContext, hVar.f7616c, hVar.f7619f, hVar.f7617d, hVar.f7618e, new ie.l(), hVar.f7624k, hVar.f7625l, hVar.m, hVar.f7614a, hVar.f7627o, list, generatedAppGlideModule, new a5.f(jVar2));
        applicationContext.registerComponentCallbacks(cVar);
        K = cVar;
    }

    public static p e(Context context) {
        pe.f.c(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return c(context).f7611f.b(context);
    }

    public static p f(androidx.fragment.app.k0 k0Var) {
        Context context = k0Var.getContext();
        pe.f.c(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        ie.l lVar = c(context).f7611f;
        lVar.getClass();
        pe.f.c(k0Var.getContext(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
        char[] cArr = pe.m.f46830a;
        if (!(Looper.myLooper() == Looper.getMainLooper())) {
            return lVar.b(k0Var.getContext().getApplicationContext());
        }
        if (k0Var.getActivity() != null) {
            lVar.f34400b.a(k0Var.getActivity());
        }
        k1 childFragmentManager = k0Var.getChildFragmentManager();
        Context context2 = k0Var.getContext();
        return lVar.f34401c.A(context2, c(context2.getApplicationContext()), k0Var.getLifecycle(), childFragmentManager, k0Var.isVisible());
    }

    public final void a() {
        char[] cArr = pe.m.f46830a;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalArgumentException("You must call this method on a background thread");
        }
        this.f7606a.f53931f.a().clear();
    }

    public final void b() {
        pe.m.a();
        this.f7608c.f(0L);
        this.f7607b.j();
        m0.n nVar = this.f7610e;
        synchronized (nVar) {
            nVar.c(0);
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        b();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i11) {
        long j11;
        pe.m.a();
        synchronized (this.H) {
            try {
                ArrayList arrayList = this.H;
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj = arrayList.get(i12);
                    i12++;
                    ((p) obj).getClass();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        xd.c cVar = this.f7608c;
        cVar.getClass();
        if (i11 >= 40) {
            cVar.f(0L);
        } else if (i11 >= 20 || i11 == 15) {
            synchronized (cVar) {
                j11 = cVar.f31951a;
            }
            cVar.f(j11 / 2);
        }
        this.f7607b.c(i11);
        m0.n nVar = this.f7610e;
        synchronized (nVar) {
            try {
                if (i11 >= 40) {
                    synchronized (nVar) {
                        nVar.c(0);
                    }
                } else if (i11 >= 20 || i11 == 15) {
                    nVar.c(nVar.f40575a / 2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }
}
