package za;

import android.app.Activity;
import android.graphics.Rect;
import com.lingo.lingoskill.ruskill.ui.learn.mr.OCBJEWZHh;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.jvm.internal.z;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f59062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f59063b;

    public /* synthetic */ d(e eVar, int i11) {
        this.f59062a = i11;
        this.f59063b = eVar;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x008e  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:66:0x01d9  */
    @Override // fz.a
    public final Object invoke() throws NoSuchMethodException, ClassNotFoundException {
        boolean z11;
        boolean z12;
        boolean z13;
        Class clsH;
        switch (this.f59062a) {
            case 0:
                e eVar = this.f59063b;
                Class<?> clsLoadClass = ((ClassLoader) eVar.f59066c.f52461b).loadClass("androidx.window.extensions.WindowExtensions");
                kotlin.jvm.internal.m.e(clsLoadClass, "loadClass(...)");
                Method method = clsLoadClass.getMethod("getWindowLayoutComponent", null);
                Class clsB = eVar.b();
                kotlin.jvm.internal.m.c(method);
                return Boolean.valueOf(Modifier.isPublic(method.getModifiers()) && method.getReturnType().equals(clsB));
            case 1:
                Class<?> clsLoadClass2 = this.f59063b.f59064a.loadClass("androidx.window.extensions.layout.FoldingFeature");
                kotlin.jvm.internal.m.e(clsLoadClass2, "loadClass(...)");
                Method method2 = clsLoadClass2.getMethod("getBounds", null);
                Method method3 = clsLoadClass2.getMethod("getType", null);
                Method method4 = clsLoadClass2.getMethod("getState", null);
                kotlin.jvm.internal.m.c(method2);
                if (ff.h.m(method2, qx.b.p(z.a(Rect.class))) && Modifier.isPublic(method2.getModifiers())) {
                    kotlin.jvm.internal.m.c(method3);
                    Class cls = Integer.TYPE;
                    if (ff.h.m(method3, qx.b.p(z.a(cls))) && Modifier.isPublic(method3.getModifiers())) {
                        kotlin.jvm.internal.m.c(method4);
                        if (ff.h.m(method4, qx.b.p(z.a(cls))) && Modifier.isPublic(method4.getModifiers())) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                    } else {
                        z11 = false;
                    }
                } else {
                    z11 = false;
                }
                return Boolean.valueOf(z11);
            case 2:
                ClassLoader classLoader = this.f59063b.f59064a;
                Class<?> clsLoadClass3 = classLoader.loadClass("androidx.window.extensions.layout.SupportedWindowFeatures");
                kotlin.jvm.internal.m.e(clsLoadClass3, "loadClass(...)");
                Method method5 = clsLoadClass3.getMethod("getDisplayFoldFeatures", null);
                Type genericReturnType = method5.getGenericReturnType();
                kotlin.jvm.internal.m.d(genericReturnType, "null cannot be cast to non-null type java.lang.reflect.ParameterizedType");
                boolean z14 = false;
                Type type = ((ParameterizedType) genericReturnType).getActualTypeArguments()[0];
                kotlin.jvm.internal.m.d(type, "null cannot be cast to non-null type java.lang.Class<*>");
                Class cls2 = (Class) type;
                if (Modifier.isPublic(method5.getModifiers()) && method5.getReturnType().equals(List.class)) {
                    Class<?> clsLoadClass4 = classLoader.loadClass(OCBJEWZHh.fKRiuL);
                    kotlin.jvm.internal.m.e(clsLoadClass4, "loadClass(...)");
                    if (cls2.equals(clsLoadClass4)) {
                        z14 = true;
                    }
                }
                return Boolean.valueOf(z14);
            case 3:
                Class<?> clsLoadClass5 = this.f59063b.f59064a.loadClass("androidx.window.extensions.layout.DisplayFoldFeature");
                kotlin.jvm.internal.m.e(clsLoadClass5, "loadClass(...)");
                Method method6 = clsLoadClass5.getMethod("getType", null);
                Class cls3 = Integer.TYPE;
                Method method7 = clsLoadClass5.getMethod("hasProperty", cls3);
                Method method8 = clsLoadClass5.getMethod("hasProperties", int[].class);
                kotlin.jvm.internal.m.c(method6);
                if (Modifier.isPublic(method6.getModifiers()) && ff.h.m(method6, cls3)) {
                    kotlin.jvm.internal.m.c(method7);
                    if (Modifier.isPublic(method7.getModifiers())) {
                        Class cls4 = Boolean.TYPE;
                        if (ff.h.m(method7, cls4)) {
                            kotlin.jvm.internal.m.c(method8);
                            if (Modifier.isPublic(method8.getModifiers()) && ff.h.m(method8, cls4)) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                        } else {
                            z12 = false;
                        }
                    } else {
                        z12 = false;
                    }
                } else {
                    z12 = false;
                }
                return Boolean.valueOf(z12);
            case 4:
                e eVar2 = this.f59063b;
                Method method9 = eVar2.b().getMethod("getSupportedWindowFeatures", null);
                kotlin.jvm.internal.m.c(method9);
                if (Modifier.isPublic(method9.getModifiers())) {
                    Class<?> clsLoadClass6 = eVar2.f59064a.loadClass("androidx.window.extensions.layout.SupportedWindowFeatures");
                    kotlin.jvm.internal.m.e(clsLoadClass6, "loadClass(...)");
                    if (method9.getReturnType().equals(clsLoadClass6)) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                } else {
                    z13 = false;
                }
                return Boolean.valueOf(z13);
            case 5:
                e eVar3 = this.f59063b;
                t7.d dVar = eVar3.f59065b;
                dVar.getClass();
                try {
                    clsH = dVar.h();
                    break;
                } catch (ClassNotFoundException unused) {
                    clsH = null;
                }
                boolean z15 = false;
                if (clsH != null) {
                    Class clsB2 = eVar3.b();
                    Method method10 = clsB2.getMethod("addWindowLayoutInfoListener", Activity.class, clsH);
                    Method method11 = clsB2.getMethod("removeWindowLayoutInfoListener", clsH);
                    kotlin.jvm.internal.m.c(method10);
                    if (Modifier.isPublic(method10.getModifiers())) {
                        kotlin.jvm.internal.m.c(method11);
                        if (Modifier.isPublic(method11.getModifiers())) {
                            z15 = true;
                        }
                    }
                }
                return Boolean.valueOf(z15);
            default:
                return Boolean.valueOf(e.e(this.f59063b));
        }
    }
}
