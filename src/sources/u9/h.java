package u9;

import a4.n;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.os.Build;
import java.io.File;
import java.io.IOException;
import re.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f52875a = new n();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f52876b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static q f52877c = null;

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? f.a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static q b() {
        q qVar = new q(5);
        f52877c = qVar;
        f52875a.k(qVar);
        return f52877c;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x00f4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x00a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x002c  */
    /* JADX WARN: Code duplicated, block: B:21:0x002e  */
    /* JADX WARN: Code duplicated, block: B:43:0x006f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0092  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x00ce  */
    public static void c(Context context, boolean z11) {
        int i11;
        boolean z12;
        int i12;
        File file;
        boolean z13;
        File file2;
        long length;
        boolean z14;
        File file3;
        g gVarA;
        g gVar;
        int i13;
        AssetFileDescriptor assetFileDescriptorOpenFd;
        if (z11 || f52877c == null) {
            synchronized (f52876b) {
                if (z11) {
                    i11 = 0;
                    assetFileDescriptorOpenFd = context.getAssets().openFd("dexopt/baseline.prof");
                    if (assetFileDescriptorOpenFd.getLength() > 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    assetFileDescriptorOpenFd.close();
                    i12 = Build.VERSION.SDK_INT;
                    if (i12 >= 28) {
                        file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                        long length2 = file.length();
                        if (file.exists()) {
                            z13 = false;
                        } else {
                            z13 = false;
                        }
                        file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                        length = file2.length();
                        if (file2.exists()) {
                            z14 = false;
                        } else {
                            z14 = false;
                        }
                        long jA = a(context);
                        file3 = new File(context.getFilesDir(), "profileInstalled");
                        if (file3.exists()) {
                            gVarA = g.a(file3);
                        } else {
                            gVarA = null;
                        }
                        if (gVarA == null) {
                            if (!z12) {
                                i11 = 327680;
                            } else if (z13) {
                                i11 = 1;
                            } else if (z14) {
                                i11 = 2;
                            }
                        } else if (!z12) {
                            i11 = 327680;
                        } else if (z13) {
                            i11 = 1;
                        } else if (z14) {
                            i11 = 2;
                        }
                        if (z11) {
                            i11 = 2;
                        }
                        if (gVarA != null) {
                            i11 = 3;
                        }
                        gVar = new g(1, i11, jA, length);
                        if (gVarA != null) {
                            gVar.b(file3);
                        } else {
                            gVar.b(file3);
                        }
                        b();
                        return;
                    }
                    b();
                    return;
                }
                if (f52877c != null) {
                    return;
                }
                i11 = 0;
                try {
                    assetFileDescriptorOpenFd = context.getAssets().openFd("dexopt/baseline.prof");
                    try {
                        if (assetFileDescriptorOpenFd.getLength() > 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        assetFileDescriptorOpenFd.close();
                    } catch (Throwable th2) {
                        if (assetFileDescriptorOpenFd == null) {
                            throw th2;
                        }
                        try {
                            assetFileDescriptorOpenFd.close();
                            throw th2;
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                            throw th2;
                        }
                    }
                } catch (IOException unused) {
                    z12 = false;
                }
                i12 = Build.VERSION.SDK_INT;
                if (i12 >= 28 && i12 != 30) {
                    file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length3 = file.length();
                    if (file.exists() || length3 <= 0) {
                        z13 = false;
                    } else {
                        z13 = true;
                    }
                    file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    length = file2.length();
                    if (file2.exists() || length <= 0) {
                        z14 = false;
                    } else {
                        z14 = true;
                    }
                    try {
                        long jA2 = a(context);
                        file3 = new File(context.getFilesDir(), "profileInstalled");
                        if (file3.exists()) {
                            try {
                                gVarA = g.a(file3);
                            } catch (IOException unused2) {
                                b();
                                return;
                            }
                        } else {
                            gVarA = null;
                        }
                        if (gVarA == null && gVarA.f52873c == jA2 && (i13 = gVarA.f52872b) != 2) {
                            i11 = i13;
                        } else if (!z12) {
                            i11 = 327680;
                        } else if (z13) {
                            i11 = 1;
                        } else if (z14) {
                            i11 = 2;
                        }
                        if (z11 && z14 && i11 != 1) {
                            i11 = 2;
                        }
                        if (gVarA != null && gVarA.f52872b == 2 && i11 == 1 && length3 < gVarA.f52874d) {
                            i11 = 3;
                        }
                        gVar = new g(1, i11, jA2, length);
                        if (gVarA != null || !gVarA.equals(gVar)) {
                            try {
                                gVar.b(file3);
                            } catch (IOException unused3) {
                            }
                        }
                        b();
                        return;
                    } catch (PackageManager.NameNotFoundException unused4) {
                        b();
                        return;
                    }
                }
                b();
                return;
                throw th;
            }
        }
    }
}
