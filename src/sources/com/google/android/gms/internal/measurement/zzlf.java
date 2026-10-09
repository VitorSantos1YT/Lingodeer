package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import com.google.common.base.Optional;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import y.e;
import y.t0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzlf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile Optional f11690a;

    private zzlf() {
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0036 A[Catch: all -> 0x0022, TryCatch #2 {all -> 0x0022, blocks: (B:6:0x0007, B:8:0x000b, B:10:0x0019, B:20:0x0036, B:73:0x0144, B:15:0x0025, B:17:0x002d, B:22:0x003d, B:24:0x0043, B:25:0x0047, B:72:0x013f, B:74:0x0147, B:75:0x014a, B:76:0x014b, B:26:0x004b, B:28:0x004f, B:29:0x005c, B:31:0x0062, B:36:0x0073, B:38:0x0079, B:39:0x007f, B:59:0x0122, B:60:0x0125, B:68:0x0134, B:67:0x0131, B:69:0x0135, B:70:0x013a, B:71:0x013b, B:34:0x006a, B:35:0x006f), top: B:84:0x0007, inners: #4 }] */
    public static Optional a(Context context) {
        Optional optional;
        Optional optionalA;
        Optional optionalA2;
        Optional optional2 = f11690a;
        if (optional2 != null) {
            return optional2;
        }
        synchronized (zzlf.class) {
            try {
                optional = f11690a;
                if (optional == null) {
                    String str = Build.TYPE;
                    String str2 = Build.TAGS;
                    e eVar = zzlg.f11691a;
                    if (!str.equals("eng") && !str.equals("userdebug")) {
                        optionalA2 = Optional.a();
                    } else if (str2.contains("dev-keys") || str2.contains("test-keys")) {
                        if (!context.isDeviceProtectedStorage()) {
                            context = context.createDeviceProtectedStorageContext();
                        }
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            StrictMode.allowThreadDiskWrites();
                            try {
                                File file = new File(context.getDir("phenotype_hermetic", 0), "overrides.txt");
                                optionalA = file.exists() ? Optional.d(file) : Optional.a();
                            } catch (RuntimeException unused) {
                                optionalA = Optional.a();
                            }
                            if (optionalA.c()) {
                                File file2 = (File) optionalA.b();
                                try {
                                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2)));
                                    try {
                                        t0 t0Var = new t0(0);
                                        HashMap map = new HashMap();
                                        while (true) {
                                            String line = bufferedReader.readLine();
                                            if (line == null) {
                                                break;
                                            }
                                            String[] strArrSplit = line.split(" ", 3);
                                            if (strArrSplit.length != 3) {
                                                new StringBuilder(line.length() + 9);
                                            } else {
                                                String str3 = new String(strArrSplit[0]);
                                                String strDecode = Uri.decode(new String(strArrSplit[1]));
                                                String strDecode2 = (String) map.get(strArrSplit[2]);
                                                if (strDecode2 == null) {
                                                    String str4 = new String(strArrSplit[2]);
                                                    strDecode2 = Uri.decode(str4);
                                                    if (strDecode2.length() < 1024 || strDecode2 == str4) {
                                                        map.put(str4, strDecode2);
                                                    }
                                                }
                                                t0 t0Var2 = (t0) t0Var.get(str3);
                                                if (t0Var2 == null) {
                                                    t0Var2 = new t0(0);
                                                    t0Var.put(str3, t0Var2);
                                                }
                                                t0Var2.put(strDecode, strDecode2);
                                            }
                                        }
                                        new StringBuilder(file2.toString().length() + 28 + String.valueOf(context.getPackageName()).length());
                                        zzle zzleVar = new zzle(t0Var);
                                        bufferedReader.close();
                                        optionalA2 = Optional.d(zzleVar);
                                    } catch (Throwable th2) {
                                        try {
                                            bufferedReader.close();
                                        } catch (Throwable th3) {
                                            th2.addSuppressed(th3);
                                        }
                                        throw th2;
                                    }
                                } catch (IOException e8) {
                                    throw new RuntimeException(e8);
                                }
                            } else {
                                optionalA2 = Optional.a();
                            }
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        } catch (Throwable th4) {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            throw th4;
                        }
                    } else {
                        optionalA2 = Optional.a();
                    }
                    optional = optionalA2;
                    f11690a = optional;
                }
            } catch (Throwable th5) {
                throw th5;
            }
        }
        return optional;
    }
}
