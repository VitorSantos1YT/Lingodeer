package wc;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import hh.p0;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import lt.AJC.PQgum;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f54983a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashSet f54984b = new HashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f54985c = {80, 75, 3, 4};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f54986d = {31, -117, 8};

    public static b0 a(final String str, Callable callable, Runnable runnable) {
        h hVarA = str == null ? null : dd.h.f23381b.a(str);
        b0 b0Var = hVarA != null ? new b0(hVarA) : null;
        HashMap map = f54983a;
        if (str != null && map.containsKey(str)) {
            b0Var = (b0) map.get(str);
        }
        if (b0Var != null) {
            if (runnable != null) {
                runnable.run();
            }
            return b0Var;
        }
        b0 b0Var2 = new b0(callable, false);
        if (str != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            final int i11 = 0;
            b0Var2.b(new y() { // from class: wc.j
                @Override // wc.y
                public final void onResult(Object obj) {
                    switch (i11) {
                        case 0:
                            HashMap map2 = l.f54983a;
                            map2.remove(str);
                            atomicBoolean.set(true);
                            if (map2.size() == 0) {
                                l.k();
                            }
                            break;
                        default:
                            HashMap map3 = l.f54983a;
                            map3.remove(str);
                            atomicBoolean.set(true);
                            if (map3.size() == 0) {
                                l.k();
                            }
                            break;
                    }
                }
            });
            final int i12 = 1;
            b0Var2.a(new y() { // from class: wc.j
                @Override // wc.y
                public final void onResult(Object obj) {
                    switch (i12) {
                        case 0:
                            HashMap map2 = l.f54983a;
                            map2.remove(str);
                            atomicBoolean.set(true);
                            if (map2.size() == 0) {
                                l.k();
                            }
                            break;
                        default:
                            HashMap map3 = l.f54983a;
                            map3.remove(str);
                            atomicBoolean.set(true);
                            if (map3.size() == 0) {
                                l.k();
                            }
                            break;
                    }
                }
            });
            if (!atomicBoolean.get()) {
                map.put(str, b0Var2);
                if (map.size() == 1) {
                    k();
                }
            }
        }
        return b0Var2;
    }

    public static a0 b(Context context, String str, String str2) {
        h hVarA = str2 == null ? null : dd.h.f23381b.a(str2);
        if (hVarA != null) {
            return new a0(hVarA);
        }
        try {
            return c(context, context.getAssets().open(str), str2);
        } catch (IOException e8) {
            return new a0(e8);
        }
    }

    public static a0 c(Context context, InputStream inputStream, String str) {
        h hVarA = str == null ? null : dd.h.f23381b.a(str);
        if (hVarA != null) {
            return new a0(hVarA);
        }
        try {
            m00.d0 d0VarC = m00.b.c(m00.b.i(inputStream));
            if (j(d0VarC, f54985c).booleanValue()) {
                return h(context, new ZipInputStream(new m00.g(d0VarC, 1)), str);
            }
            if (j(d0VarC, f54986d).booleanValue()) {
                return e(m00.b.i(new GZIPInputStream(new m00.g(d0VarC, 1))), str);
            }
            String[] strArr = jd.d.f36302e;
            return d(new jd.e(d0VarC), str, true);
        } catch (IOException e8) {
            return new a0(e8);
        }
    }

    public static a0 d(jd.e eVar, String str, boolean z11) {
        try {
            h hVarA = str == null ? null : dd.h.f23381b.a(str);
            if (hVarA != null) {
                return new a0(hVarA);
            }
            h hVarA2 = id.t.a(eVar);
            if (str != null) {
                dd.h.f23381b.f23382a.q(str, hVarA2);
            }
            return new a0(hVarA2);
        } catch (Exception e8) {
            return new a0(e8);
        } finally {
            if (z11) {
                kd.k.b(eVar);
            }
        }
    }

    public static a0 e(m00.d dVar, String str) {
        m00.d0 d0VarC = m00.b.c(dVar);
        String[] strArr = jd.d.f36302e;
        return d(new jd.e(d0VarC), str, true);
    }

    public static b0 f(final int i11, Context context, final String str) {
        final WeakReference weakReference = new WeakReference(context);
        final Context applicationContext = context.getApplicationContext();
        return a(str, new Callable() { // from class: wc.k
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Context context2 = (Context) weakReference.get();
                if (context2 == null) {
                    context2 = applicationContext;
                }
                return l.g(i11, context2, str);
            }
        }, null);
    }

    public static a0 g(int i11, Context context, String str) {
        h hVarA = str == null ? null : dd.h.f23381b.a(str);
        if (hVarA != null) {
            return new a0(hVarA);
        }
        try {
            m00.d0 d0VarC = m00.b.c(m00.b.i(context.getResources().openRawResource(i11)));
            if (j(d0VarC, f54985c).booleanValue()) {
                return h(context, new ZipInputStream(new m00.g(d0VarC, 1)), str);
            }
            if (!j(d0VarC, f54986d).booleanValue()) {
                String[] strArr = jd.d.f36302e;
                return d(new jd.e(d0VarC), str, true);
            }
            try {
                return e(m00.b.i(new GZIPInputStream(new m00.g(d0VarC, 1))), str);
            } catch (IOException e8) {
                return new a0(e8);
            }
        } catch (Resources.NotFoundException e10) {
            return new a0(e10);
        }
    }

    public static a0 h(Context context, ZipInputStream zipInputStream, String str) {
        try {
            return i(context, zipInputStream, str);
        } finally {
            kd.k.b(zipInputStream);
        }
    }

    public static Boolean j(m00.d0 d0Var, byte[] bArr) {
        try {
            m00.d0 d0VarC = d0Var.c();
            for (byte b3 : bArr) {
                if (d0VarC.readByte() != b3) {
                    return Boolean.FALSE;
                }
            }
            d0VarC.close();
            return Boolean.TRUE;
        } catch (Exception unused) {
            kd.d.f38088a.getClass();
            a aVar = d.f54943a;
            return Boolean.FALSE;
        } catch (NoSuchMethodError unused2) {
            return Boolean.FALSE;
        }
    }

    public static void k() {
        ArrayList arrayList = new ArrayList(f54984b);
        if (arrayList.size() > 0) {
            throw p0.e(0, arrayList);
        }
    }

    public static String l(Context context, int i11) {
        return defpackage.e.g(i11, (context.getResources().getConfiguration().uiMode & 48) == 32 ? "_night_" : "_day_", new StringBuilder("rawRes"));
    }

    public static a0 i(Context context, ZipInputStream zipInputStream, String str) {
        h hVarA;
        x xVar;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        if (str == null) {
            hVarA = null;
        } else {
            try {
                hVarA = dd.h.f23381b.a(str);
            } catch (IOException e8) {
                return new a0(e8);
            }
        }
        if (hVarA != null) {
            return new a0(hVarA);
        }
        ZipEntry nextEntry = zipInputStream.getNextEntry();
        h hVar = null;
        while (nextEntry != null) {
            String name = nextEntry.getName();
            if (name.contains("__MACOSX")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().equalsIgnoreCase(PQgum.gNiRvNLYtU)) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().contains(".json")) {
                m00.d0 d0VarC = m00.b.c(m00.b.i(zipInputStream));
                String[] strArr = jd.d.f36302e;
                hVar = d(new jd.e(d0VarC), null, false).f54933a;
            } else if (name.contains(".png") || name.contains(".webp") || name.contains(".jpg") || name.contains(".jpeg")) {
                String[] strArrSplit = name.split("/");
                map.put(strArrSplit[strArrSplit.length - 1], BitmapFactory.decodeStream(zipInputStream));
            } else if (name.contains(".ttf") || name.contains(".otf")) {
                String[] strArrSplit2 = name.split("/");
                String str2 = strArrSplit2[strArrSplit2.length - 1];
                String str3 = str2.split("\\.")[0];
                if (context == null) {
                    return new a0(new IllegalStateException("Unable to extract font " + str3 + " please pass a non-null Context parameter"));
                }
                File file = new File(context.getCacheDir(), str2);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                        try {
                            byte[] bArr = new byte[4096];
                            while (true) {
                                int i11 = zipInputStream.read(bArr);
                                if (i11 == -1) {
                                    break;
                                }
                                fileOutputStream2.write(bArr, 0, i11);
                            }
                            fileOutputStream2.flush();
                            fileOutputStream2.close();
                            fileOutputStream.close();
                        } catch (Throwable th2) {
                            try {
                                fileOutputStream2.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                            throw th2;
                        }
                    } catch (Throwable th4) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable th5) {
                            th4.addSuppressed(th5);
                        }
                        throw th4;
                    }
                } catch (Throwable th6) {
                    kd.d.c("Unable to save font " + str3 + " to the temporary file: " + str2 + ". ", th6);
                }
                Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                if (!file.delete()) {
                    kd.d.b("Failed to delete temp font file " + file.getAbsolutePath() + ".");
                }
                map2.put(str3, typefaceCreateFromFile);
            } else {
                zipInputStream.closeEntry();
            }
            nextEntry = zipInputStream.getNextEntry();
        }
        if (hVar == null) {
            return new a0(new IllegalArgumentException("Unable to parse composition"));
        }
        for (Map.Entry entry : map.entrySet()) {
            String str4 = (String) entry.getKey();
            Iterator it = ((HashMap) hVar.c()).values().iterator();
            do {
                if (!it.hasNext()) {
                    xVar = null;
                    break;
                }
                xVar = (x) it.next();
            } while (!xVar.f55040d.equals(str4));
            if (xVar != null) {
                xVar.f55042f = kd.k.d((Bitmap) entry.getValue(), xVar.f55037a, xVar.f55038b);
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            boolean z11 = false;
            for (dd.d dVar : hVar.f54962f.values()) {
                if (dVar.f23369a.equals(entry2.getKey())) {
                    dVar.f23372d = (Typeface) entry2.getValue();
                    z11 = true;
                }
            }
            if (!z11) {
                kd.d.b("Parsed font for " + ((String) entry2.getKey()) + " however it was not found in the animation.");
            }
        }
        if (map.isEmpty()) {
            Iterator it2 = ((HashMap) hVar.c()).entrySet().iterator();
            while (it2.hasNext()) {
                x xVar2 = (x) ((Map.Entry) it2.next()).getValue();
                if (xVar2 == null) {
                    return null;
                }
                String str5 = xVar2.f55040d;
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inScaled = true;
                options.inDensity = 160;
                if (str5.startsWith("data:") && str5.indexOf("base64,") > 0) {
                    try {
                        byte[] bArrDecode = Base64.decode(str5.substring(str5.indexOf(44) + 1), 0);
                        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options);
                        if (bitmapDecodeByteArray != null) {
                            xVar2.f55042f = kd.k.d(bitmapDecodeByteArray, xVar2.f55037a, xVar2.f55038b);
                        }
                    } catch (IllegalArgumentException e10) {
                        kd.d.c("data URL did not have correct base64 format.", e10);
                        return null;
                    }
                }
            }
        }
        if (str != null) {
            dd.h.f23381b.f23382a.q(str, hVar);
        }
        return new a0(hVar);
    }
}
