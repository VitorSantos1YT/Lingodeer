package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.internal.LibraryVersion;
import com.google.android.gms.common.internal.Preconditions;
import ep.a;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import pt.ImS.aYZzTH;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzaek {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9853a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [int] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x005a -> B:16:0x005b). Please report as a decompilation issue!!! */
    public zzaek(String str) {
        ?? r9 = 3;
        r9 = 3;
        r9 = 3;
        ?? r11 = 3;
        try {
            List listC = zzt.a().c(str);
            if (listC.size() == 1) {
                str = Integer.parseInt(str);
            } else if (listC.size() >= 3) {
                str = Integer.parseInt((String) listC.get(2)) + (Integer.parseInt((String) listC.get(1)) * 1000) + (Integer.parseInt((String) listC.get(0)) * 1000000);
            } else {
                str = -1;
                r9 = r11;
            }
        } catch (IllegalArgumentException e8) {
            boolean zIsLoggable = Log.isLoggable("LibraryVersionContainer", r9);
            r11 = zIsLoggable;
            if (zIsLoggable) {
                String.format("Version code parsing failed for: %s with exception %s.", str, e8);
                r11 = "Version code parsing failed for: %s with exception %s.";
            }
        }
        this.f9853a = str;
    }

    public final String b() {
        return a.e("X", Integer.toString(this.f9853a));
    }

    public static zzaek a() throws Throwable {
        String str;
        InputStream resourceAsStream;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        LibraryVersion libraryVersion = LibraryVersion.f8933c;
        libraryVersion.getClass();
        GmsLogger gmsLogger = LibraryVersion.f8932b;
        Preconditions.e("firebase-auth", "Please provide a valid libraryName");
        ConcurrentHashMap concurrentHashMap = libraryVersion.f8934a;
        boolean zContainsKey = concurrentHashMap.containsKey("firebase-auth");
        Object obj = aYZzTH.uxJqoNef;
        if (zContainsKey) {
            str3 = (String) concurrentHashMap.get("firebase-auth");
        } else {
            Properties properties = new Properties();
            InputStream inputStream = null;
            property = null;
            property = null;
            property = null;
            String property = null;
            InputStream inputStream2 = null;
            try {
                try {
                    resourceAsStream = LibraryVersion.class.getResourceAsStream("/firebase-auth.properties");
                    try {
                        if (resourceAsStream != null) {
                            properties.load(resourceAsStream);
                            property = properties.getProperty("version", null);
                            StringBuilder sb2 = new StringBuilder(25 + String.valueOf(property).length());
                            sb2.append("firebase-auth version is ");
                            sb2.append(property);
                            String string = sb2.toString();
                            if (Log.isLoggable(gmsLogger.f8929a, 2) && (str6 = gmsLogger.f8930b) != null) {
                                str6.concat(string);
                            }
                        } else {
                            StringBuilder sb3 = new StringBuilder(56);
                            sb3.append("Failed to get app version for libraryName: firebase-auth");
                            String string2 = sb3.toString();
                            if (Log.isLoggable(gmsLogger.f8929a, 5) && (str5 = gmsLogger.f8930b) != null) {
                                str5.concat(string2);
                            }
                        }
                    } catch (IOException unused) {
                        str = property;
                        inputStream = resourceAsStream;
                        StringBuilder sb4 = new StringBuilder(56);
                        sb4.append("Failed to get app version for libraryName: firebase-auth");
                        String string3 = sb4.toString();
                        if (Log.isLoggable(gmsLogger.f8929a, 6) && (str2 = gmsLogger.f8930b) != null) {
                            str2.concat(string3);
                        }
                        resourceAsStream = inputStream;
                        property = str;
                    } catch (Throwable th2) {
                        th = th2;
                        inputStream2 = resourceAsStream;
                        if (inputStream2 != null) {
                            try {
                                inputStream2.close();
                            } catch (IOException unused2) {
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (IOException unused3) {
                str = null;
            }
            if (resourceAsStream != null) {
                try {
                    resourceAsStream.close();
                } catch (IOException unused4) {
                }
            }
            if (property == null) {
                if (Log.isLoggable(gmsLogger.f8929a, 3) && (str4 = gmsLogger.f8930b) != null) {
                    str4.concat(".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used");
                }
                str3 = obj;
            } else {
                str3 = property;
            }
            concurrentHashMap.put("firebase-auth", str3);
        }
        if (TextUtils.isEmpty(str3) || str3.equals(obj)) {
            str3 = "-1";
        }
        return new zzaek(str3);
    }
}
