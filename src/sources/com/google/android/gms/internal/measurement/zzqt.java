package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import com.google.common.base.Optional;
import com.google.common.base.Supplier;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.AbstractCollection;
import java.util.List;
import java.util.logging.Level;
import java.util.regex.Pattern;
import kotlin.jvm.internal.m;
import y.e;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzqt {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Boolean f11884d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzlk f11885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f11886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f11887c;

    public zzqt(zzlk zzlkVar, String str) {
        this.f11885a = zzlkVar;
        this.f11887c = str;
        Context context = zzlkVar.f11704b;
        Pattern pattern = zzsa.f11942a;
        zzrz zzrzVar = new zzrz(context);
        zzrzVar.a("phenotype");
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 4);
        sb2.append("/");
        sb2.append(str);
        sb2.append(".pb");
        zzrzVar.b(sb2.toString());
        this.f11886b = zzrzVar.c();
    }

    public final zzqs a() {
        String staticPackageName;
        int i11;
        zznv zznvVar;
        zznv zznvVar2;
        zzlk zzlkVar = this.f11885a;
        Context context = zzlkVar.f11704b;
        Supplier supplier = zzlkVar.f11708f;
        if (!zzky.b(context)) {
            return new zzqs(zzqv.F(), new zzqr(3, 17));
        }
        if (f11884d == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                f11884d = Boolean.valueOf(Process.isIsolated());
            } else {
                try {
                    Object objInvoke = Process.class.getMethod("isIsolated", null).invoke(Process.class, null);
                    objInvoke.getClass();
                    f11884d = (Boolean) objInvoke;
                } catch (ReflectiveOperationException unused) {
                    f11884d = Boolean.FALSE;
                }
            }
        }
        if (f11884d.booleanValue()) {
            return new zzqs(zzqv.F(), new zzqr(3, 18));
        }
        zzqn zzqnVarB = zzlkVar.f11709g.b();
        zzacr zzacrVar = zzqnVarB.f11864c;
        zzabz androidBacking = zzabz.FILE;
        e eVar = zzlg.f11691a;
        String str = this.f11887c;
        int iIndexOf = str.indexOf("#");
        if (iIndexOf >= 0) {
            staticPackageName = str.substring(0, iIndexOf);
        } else {
            if (str.contains("@")) {
                throw new IllegalArgumentException("Invalid package name: ".concat(str));
            }
            staticPackageName = str;
        }
        m.f(androidBacking, "androidBacking");
        m.f(staticPackageName, "staticPackageName");
        if (!zzqnVarB.f11869h) {
            i11 = 14;
        } else if (!zzqnVarB.f11862a || !zzqnVarB.f11863b.contains(androidBacking)) {
            i11 = 3;
        } else if (zzacrVar.d() != 0) {
            List list = zzqnVarB.f11867f;
            if (list.isEmpty() || list.contains(staticPackageName)) {
                i11 = zzqnVarB.f11868g.contains(staticPackageName) ? 6 : 0;
            } else {
                i11 = 5;
            }
        } else {
            i11 = 4;
        }
        if (i11 != 0) {
            zznvVar2 = new zznv(null, new zzqr(i11));
        } else {
            try {
                String str2 = zzqnVarB.f11866e;
                if (str2.isEmpty()) {
                    Optional optional = (Optional) zzlkVar.f11710h.get();
                    if (optional.c()) {
                        str2 = ((ApplicationInfo) optional.b()).dataDir;
                    } else {
                        zzlz.a(Level.WARNING, zzlkVar.a(), null, "Unable to get GMS application info, using defaults.", new Object[0]);
                        zznvVar = new zznv(zznd.f11758c, new zzqr(3, 7));
                        zznvVar2 = zznvVar;
                    }
                }
                String str3 = File.separator;
                String str4 = zzqnVarB.f11865d;
                StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length());
                sb2.append(str2);
                sb2.append(str3);
                sb2.append(str4);
                String string = sb2.toString();
                zzmz zzmzVar = new zzmz(zzacrVar, str);
                Uri.Builder builderScheme = new Uri.Builder().scheme("file");
                String string2 = zzmzVar.a().toString();
                StringBuilder sb3 = new StringBuilder(String.valueOf(str3).length() + string.length() + String.valueOf(str3).length() + string2.length());
                sb3.append(str3);
                sb3.append(string);
                sb3.append(str3);
                sb3.append(string2);
                Uri uriBuild = builderScheme.appendEncodedPath(sb3.toString()).build();
                StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().build());
                try {
                    try {
                        try {
                            zznv zznvVar3 = new zznv((zznd) ((zzru) supplier.get()).a(uriBuild, new zzna(zzqnVarB.f11872k.y())), new zzqr(5, 2));
                            StrictMode.setThreadPolicy(threadPolicy);
                            zznvVar2 = zznvVar3;
                        } catch (Throwable th2) {
                            StrictMode.setThreadPolicy(threadPolicy);
                            throw th2;
                        }
                    } catch (FileNotFoundException unused2) {
                        zzlz.a(Level.INFO, zzlkVar.a(), null, "Shared storage file not found for %s", str);
                        zznvVar2 = new zznv(null, new zzqr(8));
                        StrictMode.setThreadPolicy(threadPolicy);
                    }
                } catch (zzaeh e8) {
                    zzlz.a(Level.SEVERE, zzlkVar.a(), e8, "Failed to parse snapshot from shared storage for %s", str);
                    zznvVar2 = new zznv(null, new zzqr(9));
                    StrictMode.setThreadPolicy(threadPolicy);
                }
            } catch (Exception e10) {
                zzlz.a(Level.WARNING, zzlkVar.a(), e10, "Failed to read shared file for %s", str);
                zznvVar = new zznv(zznd.f11758c, new zzqr(3, 10));
                zznvVar2 = zznvVar;
            }
        }
        zzqr zzqrVar = zznvVar2.f11765b;
        zznd zzndVar = zznvVar2.f11764a;
        if (zzndVar != null) {
            return new zzqs(zzndVar, zzqrVar);
        }
        try {
            return new zzqs((zzqv) ((zzru) supplier.get()).a(this.f11886b, new zzss(zzqv.F().f())), new zzqr(4, zzqrVar.f11878c));
        } catch (IOException | RuntimeException unused3) {
            zzlz.a(Level.INFO, zzlkVar.a(), null, "Unable to retrieve flag snapshot for %s, using defaults.", str);
            return b() ? new zzqs(zznd.f11758c, new zzqr(3, 16)) : new zzqs(zzqv.F(), new zzqr(3, 11));
        }
    }

    public final boolean b() {
        zzrf zzrfVar = this.f11885a.f11709g;
        zzabz zzabzVar = zzabz.FILE;
        zzni zzniVarC = zzrfVar.c();
        return zzniVarC.A() && ((AbstractCollection) zzniVarC.F()).contains(zzabzVar);
    }
}
