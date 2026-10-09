package com.google.android.gms.common.util;

import android.app.Application;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.common.zzi;
import com.google.android.gms.internal.common.zzj;
import com.google.android.gms.internal.common.zzx;
import com.google.android.gms.internal.common.zzy;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class ProcessUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f9125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f9126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Boolean f9127c;

    private ProcessUtils() {
    }

    public static String a() throws Throwable {
        BufferedReader bufferedReader;
        if (f9125a == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                f9125a = Application.getProcessName();
            } else {
                int iMyPid = f9126b;
                if (iMyPid == 0) {
                    iMyPid = Process.myPid();
                    f9126b = iMyPid;
                }
                String strTrim = null;
                strTrim = null;
                strTrim = null;
                BufferedReader bufferedReader2 = null;
                strTrim = null;
                try {
                    if (iMyPid > 0) {
                        try {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(iMyPid).length() + 14);
                            sb2.append("/proc/");
                            sb2.append(iMyPid);
                            sb2.append("/cmdline");
                            String string = sb2.toString();
                            StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                            try {
                                bufferedReader = new BufferedReader(new FileReader(string));
                                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                                try {
                                    String line = bufferedReader.readLine();
                                    Preconditions.g(line);
                                    strTrim = line.trim();
                                    bufferedReader.close();
                                } catch (IOException unused) {
                                    if (bufferedReader != null) {
                                        bufferedReader.close();
                                    }
                                    f9125a = strTrim;
                                    return f9125a;
                                } catch (Throwable th2) {
                                    th = th2;
                                    bufferedReader2 = bufferedReader;
                                    if (bufferedReader2 != null) {
                                        try {
                                            bufferedReader2.close();
                                        } catch (IOException unused2) {
                                        }
                                    }
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                                throw th3;
                            }
                        } catch (IOException unused3) {
                            bufferedReader = null;
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    }
                } catch (IOException unused4) {
                }
                f9125a = strTrim;
            }
        }
        return f9125a;
    }

    public static boolean b() {
        Boolean boolValueOf = f9127c;
        if (boolValueOf == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                boolValueOf = Boolean.valueOf(Process.isIsolated());
            } else {
                try {
                    Object objA = zzj.a(Process.class, "isIsolated", new zzi[0]);
                    Object[] objArr = new Object[0];
                    if (objA == null) {
                        throw new zzy(zzx.a("expected a non-null reference", objArr));
                    }
                    boolValueOf = (Boolean) objA;
                } catch (ReflectiveOperationException unused) {
                    boolValueOf = Boolean.FALSE;
                }
            }
            f9127c = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }
}
