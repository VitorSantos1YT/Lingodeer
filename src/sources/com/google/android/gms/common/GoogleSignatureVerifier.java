package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.common.zzah;
import com.google.android.gms.internal.common.zzai;
import com.google.android.gms.internal.common.zzal;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class GoogleSignatureVerifier {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static GoogleSignatureVerifier f8654c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f8655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile String f8656b;

    public GoogleSignatureVerifier(Context context) {
        this.f8655a = context.getApplicationContext();
    }

    public static GoogleSignatureVerifier a(Context context) {
        Preconditions.g(context);
        synchronized (GoogleSignatureVerifier.class) {
            if (f8654c == null) {
                zzd zzdVar = zzo.f9161a;
                synchronized (zzo.class) {
                    try {
                        if (zzo.f9169i == null) {
                            zzo.f9169i = context.getApplicationContext();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                f8654c = new GoogleSignatureVerifier(context);
            }
        }
        return f8654c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean c(PackageInfo packageInfo, boolean z11) {
        zzah zzahVarM;
        if (packageInfo != null) {
            if (z11 && ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName))) {
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                z11 = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
            }
            try {
                zzah zzahVar = z11 ? zzn.f9160c : zzn.f9159b;
                int i11 = Build.VERSION.SDK_INT;
                if (i11 < 28) {
                    Signature[] signatureArr = packageInfo.signatures;
                    byte[] byteArray = null;
                    if (signatureArr != null && signatureArr.length == 1) {
                        byteArray = signatureArr[0].toByteArray();
                    }
                    if (byteArray != null) {
                        zzal zzalVar = zzah.f9618b;
                        Object[] objArr = {byteArray};
                        zzai.a(1, objArr);
                        zzahVarM = zzah.o(1, objArr);
                    } else {
                        zzahVarM = zzah.m();
                    }
                } else {
                    if (i11 < 28) {
                        throw new IllegalStateException();
                    }
                    SigningInfo signingInfo = packageInfo.signingInfo;
                    if (signingInfo == null || signingInfo.hasMultipleSigners() || signingInfo.getSigningCertificateHistory() == null) {
                        zzahVarM = zzah.m();
                    } else {
                        zzal zzalVar2 = zzah.f9618b;
                        com.google.android.gms.internal.common.zzad zzadVar = new com.google.android.gms.internal.common.zzad();
                        for (Signature signature : signingInfo.getSigningCertificateHistory()) {
                            zzadVar.a(signature.toByteArray());
                        }
                        zzahVarM = zzadVar.b();
                    }
                }
                if (zzahVarM.isEmpty()) {
                    throw new IllegalArgumentException("Unable to obtain package certificate history.");
                }
                zzah zzahVarK = zzahVarM.k();
                int size = zzahVarK.size();
                int i12 = 0;
                while (i12 < size) {
                    byte[] bArr = (byte[]) zzahVarK.get(i12);
                    zzal zzalVarR = zzahVar.listIterator(0);
                    do {
                        int i13 = i12 + 1;
                        if (!zzalVarR.hasNext()) {
                            i12 = i13;
                        }
                    } while (!Arrays.equals(bArr, (byte[]) zzalVarR.next()));
                    return true;
                }
            } catch (IllegalArgumentException unused) {
                if ((z11 ? d(packageInfo, zzn.f9158a) : d(packageInfo, zzn.f9158a[0])) == null) {
                    return false;
                }
            }
        }
        return false;
    }

    public static zzj d(PackageInfo packageInfo, zzj... zzjVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null || signatureArr.length != 1) {
            return null;
        }
        zzk zzkVar = new zzk(packageInfo.signatures[0].toByteArray());
        for (int i11 = 0; i11 < zzjVarArr.length; i11++) {
            if (zzjVarArr[i11].equals(zzkVar)) {
                return zzjVarArr[i11];
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:76:0x014e  */
    public final boolean b(int i11) {
        zzy zzyVarB;
        int length;
        ApplicationInfo applicationInfo;
        String[] packagesForUid = this.f8655a.getPackageManager().getPackagesForUid(i11);
        if (packagesForUid == null || (length = packagesForUid.length) == 0) {
            zzyVarB = zzy.b("no pkgs");
        } else {
            zzyVarB = null;
            int i12 = 0;
            while (true) {
                if (i12 >= length) {
                    Preconditions.g(zzyVarB);
                    break;
                }
                String str = packagesForUid[i12];
                if (str == null) {
                    zzyVarB = zzy.b("null pkg");
                } else if (str.equals(this.f8656b)) {
                    zzyVarB = zzy.f9188c;
                } else {
                    zzd zzdVar = zzo.f9161a;
                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        zzo.a();
                        boolean zZzg = zzo.f9167g.zzg();
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        if (zZzg) {
                            zzv zzvVar = new zzv();
                            zzvVar.f9186a = str;
                            boolean zA = GooglePlayServicesUtilLight.a(this.f8655a);
                            String str2 = zzvVar.f9186a;
                            StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads2 = StrictMode.allowThreadDiskReads();
                            try {
                                Preconditions.g(zzo.f9169i);
                                try {
                                    zzo.a();
                                    Preconditions.g(zzo.f9169i);
                                    try {
                                        zzr zzrVarD0 = zzo.f9167g.D0(new zzp(str2, zA, false, new ObjectWrapper(zzo.f9169i), false, true, false));
                                        if (zzrVarD0.f9177a) {
                                            zzc.a(zzrVarD0.f9180d);
                                            zzyVarB = new zzy(true, null, null);
                                        } else {
                                            String str3 = zzrVarD0.f9178b;
                                            PackageManager.NameNotFoundException nameNotFoundException = zzz.a(zzrVarD0.f9179c) == 4 ? new PackageManager.NameNotFoundException() : null;
                                            if (str3 == null) {
                                                str3 = "error checking package certificate";
                                            }
                                            zzc.a(zzrVarD0.f9180d);
                                            zzz.a(zzrVarD0.f9179c);
                                            zzyVarB = new zzy(false, str3, nameNotFoundException);
                                        }
                                    } catch (RemoteException e8) {
                                        zzyVarB = zzy.c("module call", e8);
                                    }
                                } catch (DynamiteModule.LoadingException e10) {
                                    zzyVarB = zzy.c("module init: ".concat(String.valueOf(e10.getMessage())), e10);
                                }
                                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads2);
                            } catch (Throwable th2) {
                                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads2);
                                throw th2;
                            }
                        } else {
                            try {
                                PackageInfo packageInfo = this.f8655a.getPackageManager().getPackageInfo(str, Build.VERSION.SDK_INT >= 28 ? 134217792 : 64);
                                boolean zA2 = GooglePlayServicesUtilLight.a(this.f8655a);
                                if (packageInfo == null) {
                                    zzyVarB = zzy.b("null pkg");
                                } else {
                                    Signature[] signatureArr = packageInfo.signatures;
                                    if (signatureArr == null || signatureArr.length != 1) {
                                        zzyVarB = zzy.b("single cert required");
                                    } else {
                                        zzk zzkVar = new zzk(packageInfo.signatures[0].toByteArray());
                                        String str4 = packageInfo.packageName;
                                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads3 = StrictMode.allowThreadDiskReads();
                                        try {
                                            zzy zzyVarB2 = zzo.b(str4, zzkVar, zA2, false);
                                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads3);
                                            if (!zzyVarB2.f9189a || (applicationInfo = packageInfo.applicationInfo) == null || (applicationInfo.flags & 2) == 0) {
                                                zzyVarB = zzyVarB2;
                                            } else {
                                                StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads4 = StrictMode.allowThreadDiskReads();
                                                try {
                                                    zzy zzyVarB3 = zzo.b(str4, zzkVar, false, true);
                                                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads4);
                                                    if (zzyVarB3.f9189a) {
                                                        zzyVarB = zzy.b("debuggable release cert app rejected");
                                                    } else {
                                                        zzyVarB = zzyVarB2;
                                                    }
                                                } catch (Throwable th3) {
                                                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads4);
                                                    throw th3;
                                                }
                                            }
                                        } catch (Throwable th4) {
                                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads3);
                                            throw th4;
                                        }
                                    }
                                }
                            } catch (PackageManager.NameNotFoundException e11) {
                                zzyVarB = zzy.c("no pkg ".concat(str), e11);
                            }
                        }
                    } catch (RemoteException | DynamiteModule.LoadingException unused) {
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    } catch (Throwable th5) {
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        throw th5;
                    }
                    if (zzyVarB.f9189a) {
                        this.f8656b = str;
                    }
                }
                if (zzyVarB.f9189a) {
                    break;
                }
                i12++;
            }
        }
        if (!zzyVarB.f9189a && Log.isLoggable("GoogleCertificatesRslt", 3)) {
            if (zzyVarB.f9190b != null) {
                zzyVarB.a();
            } else {
                zzyVarB.a();
            }
        }
        return zzyVarB.f9189a;
    }
}
