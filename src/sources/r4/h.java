package r4;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import gb.r;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class h extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Class f48802a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Constructor f48803b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Method f48804c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Method f48805d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f48806e = false;

    public static boolean a0(Object obj, String str, int i11, boolean z11) throws NoSuchMethodException {
        b0();
        try {
            return ((Boolean) f48804c.invoke(obj, str, Integer.valueOf(i11), Boolean.valueOf(z11))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e8) {
            throw new RuntimeException(e8);
        }
    }

    public static void b0() throws NoSuchMethodException {
        Method method;
        Class<?> cls;
        Method method2;
        if (f48806e) {
            return;
        }
        f48806e = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            method = null;
            cls = null;
            method2 = null;
        }
        f48803b = constructor;
        f48802a = cls;
        f48804c = method2;
        f48805d = method;
    }

    @Override // gb.r
    public Typeface h(Context context, q4.d dVar, Resources resources, int i11) throws NoSuchMethodException {
        b0();
        try {
            Object objNewInstance = f48803b.newInstance(null);
            for (q4.e eVar : dVar.f47430a) {
                File fileI = hz.b.I(context);
                if (fileI == null) {
                    return null;
                }
                try {
                    if (!hz.b.q(fileI, resources, eVar.f47436f)) {
                        return null;
                    }
                    if (!a0(objNewInstance, fileI.getPath(), eVar.f47432b, eVar.f47433c)) {
                        return null;
                    }
                    fileI.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    fileI.delete();
                }
            }
            b0();
            try {
                Object objNewInstance2 = Array.newInstance((Class<?>) f48802a, 1);
                Array.set(objNewInstance2, 0, objNewInstance);
                return (Typeface) f48805d.invoke(null, objNewInstance2);
            } catch (IllegalAccessException | InvocationTargetException e8) {
                throw new RuntimeException(e8);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // gb.r
    public Typeface i(Context context, w4.h[] hVarArr, int i11) {
        File file;
        if (hVarArr.length >= 1) {
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(q(hVarArr, i11).f54645a, "r", null);
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    try {
                        try {
                            String str = Os.readlink("/proc/self/fd/" + parcelFileDescriptorOpenFileDescriptor.getFd());
                            file = OsConstants.S_ISREG(Os.stat(str).st_mode) ? new File(str) : null;
                        } catch (Throwable th2) {
                            try {
                                parcelFileDescriptorOpenFileDescriptor.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                            throw th2;
                        }
                    } catch (ErrnoException unused) {
                    }
                    if (file != null && file.canRead()) {
                        Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return typefaceCreateFromFile;
                    }
                    FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                    try {
                        Typeface typefaceK = k(context, fileInputStream);
                        fileInputStream.close();
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return typefaceK;
                    } catch (Throwable th4) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable th5) {
                            th4.addSuppressed(th5);
                        }
                        throw th4;
                    }
                }
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return null;
                }
            } catch (IOException unused2) {
            }
        }
        return null;
    }
}
