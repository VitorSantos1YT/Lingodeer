package r4;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import gb.r;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;
import y.t0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class f48807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Constructor f48808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Method f48809c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Method f48810d;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            Class cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            cls = null;
            method = null;
            method2 = null;
        }
        f48808b = constructor;
        f48807a = cls;
        f48809c = method2;
        f48810d = method;
    }

    public static boolean a0(Object obj, ByteBuffer byteBuffer, int i11, int i12, boolean z11) {
        try {
            return ((Boolean) f48809c.invoke(obj, byteBuffer, Integer.valueOf(i11), null, Integer.valueOf(i12), Boolean.valueOf(z11))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface b0(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) f48807a, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f48810d.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // gb.r
    public final Typeface h(Context context, q4.d dVar, Resources resources, int i11) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        MappedByteBuffer map;
        try {
            objNewInstance = f48808b.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            for (q4.e eVar : dVar.f47430a) {
                int i12 = eVar.f47436f;
                File fileI = hz.b.I(context);
                if (fileI != null) {
                    try {
                        if (hz.b.q(fileI, resources, i12)) {
                            try {
                                FileInputStream fileInputStream = new FileInputStream(fileI);
                                try {
                                    FileChannel channel = fileInputStream.getChannel();
                                    map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                                    fileInputStream.close();
                                    fileI.delete();
                                } catch (Throwable th2) {
                                    try {
                                        fileInputStream.close();
                                    } catch (Throwable th3) {
                                        th2.addSuppressed(th3);
                                    }
                                    throw th2;
                                }
                            } catch (IOException unused2) {
                                map = null;
                            }
                        } else {
                            fileI.delete();
                        }
                        if (map != null && a0(objNewInstance, map, eVar.f47435e, eVar.f47432b, eVar.f47433c)) {
                        }
                    } catch (Throwable th4) {
                        fileI.delete();
                        throw th4;
                    }
                }
                map = null;
                if (map != null) {
                }
            }
            return b0(objNewInstance);
        }
        return null;
    }

    @Override // gb.r
    public final Typeface i(Context context, w4.h[] hVarArr, int i11) {
        Object objNewInstance;
        try {
            objNewInstance = f48808b.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            t0 t0Var = new t0(0);
            for (w4.h hVar : hVarArr) {
                Uri uri = hVar.f54645a;
                ByteBuffer byteBufferL = (ByteBuffer) t0Var.get(uri);
                if (byteBufferL == null) {
                    byteBufferL = hz.b.L(context, uri);
                    t0Var.put(uri, byteBufferL);
                }
                if (byteBufferL != null && a0(objNewInstance, byteBufferL, hVar.f54646b, hVar.f54647c, hVar.f54648d)) {
                }
            }
            Typeface typefaceB0 = b0(objNewInstance);
            if (typefaceB0 != null) {
                return Typeface.create(typefaceB0, i11);
            }
        }
        return null;
    }
}
