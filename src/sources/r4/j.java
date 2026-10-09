package r4;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class j extends h {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Class f48811f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Constructor f48812g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Method f48813h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Method f48814i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Method f48815j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Method f48816k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Method f48817l;

    public j() throws NoSuchMethodException {
        Method methodG0;
        Constructor<?> constructor;
        Method methodF0;
        Method method;
        Method method2;
        Method method3;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            methodF0 = f0(cls2);
            Class cls3 = Integer.TYPE;
            method = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method2 = cls2.getMethod("freeze", null);
            method3 = cls2.getMethod("abortCreation", null);
            methodG0 = g0(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            methodG0 = null;
            constructor = null;
            methodF0 = null;
            method = null;
            method2 = null;
            method3 = null;
        }
        this.f48811f = cls;
        this.f48812g = constructor;
        this.f48813h = methodF0;
        this.f48814i = method;
        this.f48815j = method2;
        this.f48816k = method3;
        this.f48817l = methodG0;
    }

    public static Method f0(Class cls) {
        Class cls2 = Boolean.TYPE;
        Class cls3 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls3, cls2, cls3, cls3, cls3, FontVariationAxis[].class);
    }

    public final boolean c0(Context context, Object obj, String str, int i11, int i12, int i13, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f48813h.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface d0(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.f48811f, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f48817l.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean e0(Object obj) {
        try {
            return ((Boolean) this.f48815j.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Method g0(Class cls) throws NoSuchMethodException {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // r4.h, gb.r
    public final Typeface h(Context context, q4.d dVar, Resources resources, int i11) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        if (this.f48813h == null) {
            return super.h(context, dVar, resources, i11);
        }
        try {
            objNewInstance = this.f48812g.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            q4.e[] eVarArr = dVar.f47430a;
            int length = eVarArr.length;
            int i12 = 0;
            while (i12 < length) {
                q4.e eVar = eVarArr[i12];
                Context context2 = context;
                if (c0(context2, objNewInstance, eVar.f47431a, eVar.f47435e, eVar.f47432b, eVar.f47433c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(eVar.f47434d))) {
                    i12++;
                    context = context2;
                } else {
                    try {
                        this.f48816k.invoke(objNewInstance, null);
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                    }
                }
            }
            if (e0(objNewInstance)) {
                return d0(objNewInstance);
            }
        }
        return null;
    }

    @Override // r4.h, gb.r
    public final Typeface i(Context context, w4.h[] hVarArr, int i11) throws IOException {
        Object objNewInstance;
        Typeface typefaceD0;
        boolean zBooleanValue;
        if (hVarArr.length >= 1) {
            try {
                if (this.f48813h != null) {
                    HashMap map = new HashMap();
                    for (w4.h hVar : hVarArr) {
                        if (hVar.f54649e == 0) {
                            Uri uri = hVar.f54645a;
                            if (!map.containsKey(uri)) {
                                map.put(uri, hz.b.L(context, uri));
                            }
                        }
                    }
                    Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
                    try {
                        objNewInstance = this.f48812g.newInstance(null);
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                        objNewInstance = null;
                    }
                    if (objNewInstance != null) {
                        int length = hVarArr.length;
                        int i12 = 0;
                        boolean z11 = false;
                        while (true) {
                            Method method = this.f48816k;
                            if (i12 >= length) {
                                if (!z11) {
                                    method.invoke(objNewInstance, null);
                                    break;
                                }
                                if (!e0(objNewInstance) || (typefaceD0 = d0(objNewInstance)) == null) {
                                    break;
                                    break;
                                }
                                return Typeface.create(typefaceD0, i11);
                            }
                            w4.h hVar2 = hVarArr[i12];
                            ByteBuffer byteBuffer = (ByteBuffer) mapUnmodifiableMap.get(hVar2.f54645a);
                            if (byteBuffer != null) {
                                try {
                                    zBooleanValue = ((Boolean) this.f48814i.invoke(objNewInstance, byteBuffer, Integer.valueOf(hVar2.f54646b), null, Integer.valueOf(hVar2.f54647c), Integer.valueOf(hVar2.f54648d ? 1 : 0))).booleanValue();
                                } catch (IllegalAccessException | InvocationTargetException unused2) {
                                    zBooleanValue = false;
                                }
                                if (!zBooleanValue) {
                                    method.invoke(objNewInstance, null);
                                    break;
                                }
                                z11 = true;
                            }
                            i12++;
                            z11 = z11;
                        }
                    }
                } else {
                    w4.h hVarQ = q(hVarArr, i11);
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(hVarQ.f54645a, "r", null);
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        try {
                            Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(hVarQ.f54647c).setItalic(hVarQ.f54648d).build();
                            parcelFileDescriptorOpenFileDescriptor.close();
                            return typefaceBuild;
                        } catch (Throwable th2) {
                            try {
                                parcelFileDescriptorOpenFileDescriptor.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                            throw th2;
                        }
                    }
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return null;
                    }
                }
            } catch (IOException | IllegalAccessException | InvocationTargetException unused3) {
            }
        }
        return null;
    }

    @Override // gb.r
    public final Typeface l(Context context, Resources resources, int i11, String str, int i12) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        if (this.f48813h == null) {
            return super.l(context, resources, i11, str, i12);
        }
        try {
            objNewInstance = this.f48812g.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            if (!c0(context, objNewInstance, str, 0, -1, -1, null)) {
                try {
                    this.f48816k.invoke(objNewInstance, null);
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
            } else if (e0(objNewInstance)) {
                return d0(objNewInstance);
            }
        }
        return null;
    }
}
