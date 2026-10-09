package androidx.appcompat.app;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import l.f0;
import l.g0;
import l.q;
import p.c;
import pb.j;
import v4.e;
import y.f;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f794a = new j(new q(0));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f795b = -100;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static e f796c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static e f797d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Boolean f798e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f799f = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final f f800t = new f(0);
    public static final Object H = new Object();
    public static final Object K = new Object();

    public static boolean b(Context context) {
        if (f798e == null) {
            try {
                int i11 = g0.f38982a;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) g0.class), f0.a() | 128).metaData;
                if (bundle != null) {
                    f798e = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                f798e = Boolean.FALSE;
            }
        }
        return f798e.booleanValue();
    }

    public static void f(b bVar) {
        synchronized (H) {
            try {
                f fVar = f800t;
                fVar.getClass();
                y.a aVar = new y.a(fVar);
                while (aVar.hasNext()) {
                    a aVar2 = (a) ((WeakReference) aVar.next()).get();
                    if (aVar2 == bVar || aVar2 == null) {
                        aVar.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void l(int i11) {
        if ((i11 == -1 || i11 == 0 || i11 == 1 || i11 == 2 || i11 == 3) && f795b != i11) {
            f795b = i11;
            synchronized (H) {
                try {
                    f fVar = f800t;
                    fVar.getClass();
                    y.a aVar = new y.a(fVar);
                    while (aVar.hasNext()) {
                        a aVar2 = (a) ((WeakReference) aVar.next()).get();
                        if (aVar2 != null) {
                            ((b) aVar2).o(true, true);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public abstract void a();

    public abstract void d();

    public abstract void e();

    public abstract boolean g(int i11);

    public abstract void h(int i11);

    public abstract void j(View view);

    public abstract void k(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void m(CharSequence charSequence);

    public abstract c n(p.b bVar);
}
