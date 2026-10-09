package com.google.firebase.crashlytics.internal.common;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Debug;
import android.text.TextUtils;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import lt.AJC.PQgum;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class CommonUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f18250a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Architecture {
        private static final /* synthetic */ Architecture[] $VALUES;
        public static final Architecture ARM64;
        public static final Architecture ARMV6;
        public static final Architecture ARMV7;
        public static final Architecture ARMV7S;
        public static final Architecture ARM_UNKNOWN;
        public static final Architecture PPC;
        public static final Architecture PPC64;
        public static final Architecture UNKNOWN;
        public static final Architecture X86_32;
        public static final Architecture X86_64;
        private static final Map<String, Architecture> matcher;

        public static Architecture a() {
            String str = Build.CPU_ABI;
            if (TextUtils.isEmpty(str)) {
                return UNKNOWN;
            }
            Architecture architecture = matcher.get(str.toLowerCase(Locale.US));
            return architecture == null ? UNKNOWN : architecture;
        }

        public static Architecture valueOf(String str) {
            return (Architecture) Enum.valueOf(Architecture.class, str);
        }

        public static Architecture[] values() {
            return (Architecture[]) $VALUES.clone();
        }

        static {
            Architecture architecture = new Architecture("X86_32", 0);
            X86_32 = architecture;
            Architecture architecture2 = new Architecture(PQgum.nUjGRBgAQy, 1);
            X86_64 = architecture2;
            Architecture architecture3 = new Architecture("ARM_UNKNOWN", 2);
            ARM_UNKNOWN = architecture3;
            Architecture architecture4 = new Architecture("PPC", 3);
            PPC = architecture4;
            Architecture architecture5 = new Architecture("PPC64", 4);
            PPC64 = architecture5;
            Architecture architecture6 = new Architecture("ARMV6", 5);
            ARMV6 = architecture6;
            Architecture architecture7 = new Architecture("ARMV7", 6);
            ARMV7 = architecture7;
            Architecture architecture8 = new Architecture("UNKNOWN", 7);
            UNKNOWN = architecture8;
            Architecture architecture9 = new Architecture("ARMV7S", 8);
            ARMV7S = architecture9;
            Architecture architecture10 = new Architecture("ARM64", 9);
            ARM64 = architecture10;
            $VALUES = new Architecture[]{architecture, architecture2, architecture3, architecture4, architecture5, architecture6, architecture7, architecture8, architecture9, architecture10};
            HashMap map = new HashMap(4);
            matcher = map;
            map.put("armeabi-v7a", architecture7);
            map.put("armeabi", architecture6);
            map.put("arm64-v8a", architecture10);
            map.put("x86", architecture);
        }
    }

    public static synchronized long a(Context context) {
        ActivityManager.MemoryInfo memoryInfo;
        memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        return memoryInfo.totalMem;
    }

    public static void b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    public static int c() {
        boolean zF = f();
        ?? r9 = zF;
        if (g()) {
            r9 = (zF ? 1 : 0) | 2;
        }
        return (Debug.isDebuggerConnected() || Debug.waitingForDebugger()) ? r9 | 4 : r9;
    }

    public static int d(Context context, String str, String str2) {
        String packageName;
        Resources resources = context.getResources();
        int i11 = context.getApplicationContext().getApplicationInfo().icon;
        if (i11 > 0) {
            try {
                packageName = context.getResources().getResourcePackageName(i11);
                if ("android".equals(packageName)) {
                    packageName = context.getPackageName();
                }
            } catch (Resources.NotFoundException unused) {
                packageName = context.getPackageName();
            }
        } else {
            packageName = context.getPackageName();
        }
        return resources.getIdentifier(str, str2, packageName);
    }

    public static String e(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i11 = 0; i11 < bArr.length; i11++) {
            byte b3 = bArr[i11];
            int i12 = i11 * 2;
            char[] cArr2 = f18250a;
            cArr[i12] = cArr2[(b3 & 255) >>> 4];
            cArr[i12 + 1] = cArr2[b3 & 15];
        }
        return new String(cArr);
    }

    public static boolean f() {
        if (Build.PRODUCT.contains("sdk")) {
            return true;
        }
        String str = Build.HARDWARE;
        return str.contains("goldfish") || str.contains("ranchu");
    }

    public static boolean g() {
        boolean zF = f();
        String str = Build.TAGS;
        if ((zF || str == null || !str.contains("test-keys")) && !com.google.android.material.datepicker.d.D("/system/app/Superuser.apk")) {
            return !zF && new File("/system/xbin/su").exists();
        }
        return true;
    }

    public static String h(String str) {
        byte[] bytes = str.getBytes();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(bytes);
            return e(messageDigest.digest());
        } catch (NoSuchAlgorithmException unused) {
            return BuildConfig.VERSION_NAME;
        }
    }

    public static String i(FileInputStream fileInputStream) {
        Scanner scannerUseDelimiter = new Scanner(fileInputStream).useDelimiter("\\A");
        try {
            String next = scannerUseDelimiter.hasNext() ? scannerUseDelimiter.next() : BuildConfig.VERSION_NAME;
            scannerUseDelimiter.close();
            return next;
        } catch (Throwable th2) {
            if (scannerUseDelimiter != null) {
                try {
                    scannerUseDelimiter.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }
}
