package za;

import android.app.Activity;
import android.content.Context;
import androidx.drawerlayout.widget.ktFt.FpIL;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.core.util.function.Consumer;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClassLoader f59064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t7.d f59065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tp.g f59066c;

    public e(ClassLoader classLoader, t7.d dVar) {
        this.f59064a = classLoader;
        this.f59065b = dVar;
        this.f59066c = new tp.g(classLoader, 6);
    }

    public static final boolean e(e eVar) throws NoSuchMethodException, ClassNotFoundException {
        Class clsB = eVar.b();
        Method method = clsB.getMethod("addWindowLayoutInfoListener", Context.class, Consumer.class);
        Method method2 = clsB.getMethod("removeWindowLayoutInfoListener", Consumer.class);
        kotlin.jvm.internal.m.c(method);
        if (!Modifier.isPublic(method.getModifiers())) {
            return false;
        }
        kotlin.jvm.internal.m.c(method2);
        return Modifier.isPublic(method2.getModifiers());
    }

    public final Class b() throws ClassNotFoundException {
        Class<?> clsLoadClass = this.f59064a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
        kotlin.jvm.internal.m.e(clsLoadClass, "loadClass(...)");
        return clsLoadClass;
    }

    public final boolean c() {
        return ff.h.U("WindowLayoutComponent#addWindowLayoutInfoListener(" + Activity.class.getName() + ", java.util.function.Consumer) is not valid", new d(this, 5));
    }

    public final boolean d() {
        if (!c()) {
            return false;
        }
        StringBuilder sb2 = new StringBuilder("WindowLayoutComponent#addWindowLayoutInfoListener(");
        sb2.append(Context.class.getName());
        sb2.append(", androidx.window.extensions.core.util.function.Consumer) is not valid");
        return ff.h.U(sb2.toString(), new d(this, 6));
    }

    public final WindowLayoutComponent a() {
        int iA;
        tp.g gVar = this.f59066c;
        gVar.getClass();
        boolean zD = false;
        try {
            kotlin.jvm.internal.m.e(((ClassLoader) gVar.f52461b).loadClass("androidx.window.extensions.WindowExtensionsProvider"), "loadClass(...)");
            if (ff.h.U("WindowExtensionsProvider#getWindowExtensions is not valid", new xa.a(gVar, 0)) && ff.h.U("WindowExtensions#getWindowLayoutComponent is not valid", new d(this, 0)) && ff.h.U("FoldingFeature class is not valid", new d(this, 1)) && (iA = ya.e.a()) >= 1) {
                if (iA == 1) {
                    zD = c();
                } else if (iA < 5) {
                    zD = d();
                } else if (d() && ff.h.U("DisplayFoldFeature is not valid", new d(this, 3))) {
                    if (ff.h.U(FpIL.sBtUTMFHplGVcq, new d(this, 2)) && ff.h.U("WindowLayoutComponent#getSupportedWindowFeatures is not valid", new d(this, 4))) {
                        zD = true;
                    }
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        if (!zD) {
            return null;
        }
        try {
            return WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
        } catch (UnsupportedOperationException unused2) {
            return null;
        }
    }
}
