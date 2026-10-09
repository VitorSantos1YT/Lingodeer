package com.google.android.gms.dynamite;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import l0.Eeqr.HOBXIlHxIkMBEA;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class DynamiteModule {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final VersionPolicy f9195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final VersionPolicy f9196c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final VersionPolicy f9197d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Boolean f9198e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static String f9199f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static boolean f9200g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f9201h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static Boolean f9202i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final ThreadLocal f9203j = new ThreadLocal();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final ThreadLocal f9204k = new zze();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final VersionPolicy.IVersions f9205l = new zzf();
    public static zzp m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static zzq f9206n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f9207a;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class LoadingException extends Exception {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface VersionPolicy {

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public interface IVersions {
            int a(Context context, String str, boolean z11);

            int b(Context context, String str);
        }

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public static class SelectionResult {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f9208a = 0;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f9209b = 0;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f9210c = 0;
        }

        SelectionResult a(Context context, String str, IVersions iVersions);
    }

    static {
        new zzg();
        f9195b = new zzh();
        new zzi();
        f9196c = new zzj();
        f9197d = new zzk();
        new zzl();
        new zzm();
        new zzc();
    }

    public DynamiteModule(Context context) {
        this.f9207a = context;
    }

    public static int a(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb2 = new StringBuilder(str.length() + 61);
            sb2.append("com.google.android.gms.dynamite.descriptors.");
            sb2.append(str);
            sb2.append(".ModuleDescriptor");
            Class<?> clsLoadClass = classLoader.loadClass(sb2.toString());
            Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (Objects.a(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            new StringBuilder(String.valueOf(declaredField.get(null)).length() + 50 + str.length() + 1);
            return 0;
        } catch (ClassNotFoundException unused) {
            new StringBuilder(str.length() + 45);
            return 0;
        } catch (Exception e8) {
            "Failed to load module descriptor class: ".concat(String.valueOf(e8.getMessage()));
            return 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01dc A[Catch: all -> 0x011f, LoadingException -> 0x0122, RemoteException -> 0x0125, TryCatch #8 {RemoteException -> 0x0125, LoadingException -> 0x0122, all -> 0x011f, blocks: (B:36:0x00bc, B:42:0x00c8, B:44:0x00cf, B:45:0x00e5, B:49:0x00eb, B:51:0x00f3, B:53:0x00f7, B:54:0x0105, B:61:0x0110, B:69:0x0136, B:71:0x013e, B:72:0x0145, B:73:0x014c, B:68:0x0128, B:76:0x014f, B:77:0x0150, B:78:0x0157, B:79:0x0158, B:80:0x015f, B:83:0x0162, B:84:0x0163, B:86:0x017d, B:88:0x0190, B:90:0x0198, B:96:0x01c6, B:98:0x01cc, B:99:0x01d4, B:100:0x01db, B:91:0x01a9, B:92:0x01b0, B:94:0x01b3, B:95:0x01bd, B:101:0x01dc, B:102:0x01e3, B:103:0x01e4, B:104:0x01eb, B:110:0x01f7, B:46:0x00e6, B:47:0x00e8, B:37:0x00bd, B:39:0x00c3, B:40:0x00c5, B:107:0x01ee, B:108:0x01f5, B:55:0x0106, B:59:0x010d), top: B:160:0x00bc, inners: #0, #5, #7 }] */
    /* JADX WARN: Code duplicated, block: B:103:0x01e4 A[Catch: all -> 0x011f, LoadingException -> 0x0122, RemoteException -> 0x0125, TryCatch #8 {RemoteException -> 0x0125, LoadingException -> 0x0122, all -> 0x011f, blocks: (B:36:0x00bc, B:42:0x00c8, B:44:0x00cf, B:45:0x00e5, B:49:0x00eb, B:51:0x00f3, B:53:0x00f7, B:54:0x0105, B:61:0x0110, B:69:0x0136, B:71:0x013e, B:72:0x0145, B:73:0x014c, B:68:0x0128, B:76:0x014f, B:77:0x0150, B:78:0x0157, B:79:0x0158, B:80:0x015f, B:83:0x0162, B:84:0x0163, B:86:0x017d, B:88:0x0190, B:90:0x0198, B:96:0x01c6, B:98:0x01cc, B:99:0x01d4, B:100:0x01db, B:91:0x01a9, B:92:0x01b0, B:94:0x01b3, B:95:0x01bd, B:101:0x01dc, B:102:0x01e3, B:103:0x01e4, B:104:0x01eb, B:110:0x01f7, B:46:0x00e6, B:47:0x00e8, B:37:0x00bd, B:39:0x00c3, B:40:0x00c5, B:107:0x01ee, B:108:0x01f5, B:55:0x0106, B:59:0x010d), top: B:160:0x00bc, inners: #0, #5, #7 }] */
    /* JADX WARN: Code duplicated, block: B:107:0x01ee A[Catch: all -> 0x01ec, TRY_ENTER, TryCatch #5 {, blocks: (B:37:0x00bd, B:39:0x00c3, B:40:0x00c5, B:107:0x01ee, B:108:0x01f5), top: B:157:0x00bd, outer: #8 }] */
    /* JADX WARN: Code duplicated, block: B:125:0x023e  */
    /* JADX WARN: Code duplicated, block: B:126:0x0244  */
    /* JADX WARN: Code duplicated, block: B:129:0x024d  */
    /* JADX WARN: Code duplicated, block: B:134:0x025e A[Catch: all -> 0x0089, TryCatch #4 {all -> 0x0089, blocks: (B:7:0x003a, B:11:0x0082, B:18:0x008e, B:22:0x0095, B:34:0x00b8, B:111:0x01f8, B:112:0x01ff, B:115:0x0202, B:116:0x0203, B:117:0x020a, B:134:0x025e, B:135:0x027c, B:118:0x020b, B:120:0x0222, B:122:0x0230, B:132:0x0256, B:133:0x025d, B:136:0x027d, B:137:0x02c4), top: B:156:0x003a, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:151:0x00e6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:155:0x00b8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:157:0x00bd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0095 A[Catch: all -> 0x0089, TRY_LEAVE, TryCatch #4 {all -> 0x0089, blocks: (B:7:0x003a, B:11:0x0082, B:18:0x008e, B:22:0x0095, B:34:0x00b8, B:111:0x01f8, B:112:0x01ff, B:115:0x0202, B:116:0x0203, B:117:0x020a, B:134:0x025e, B:135:0x027c, B:118:0x020b, B:120:0x0222, B:122:0x0230, B:132:0x0256, B:133:0x025d, B:136:0x027d, B:137:0x02c4), top: B:156:0x003a, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:26:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c3 A[Catch: all -> 0x01ec, TryCatch #5 {, blocks: (B:37:0x00bd, B:39:0x00c3, B:40:0x00c5, B:107:0x01ee, B:108:0x01f5), top: B:157:0x00bd, outer: #8 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00c8 A[Catch: all -> 0x011f, LoadingException -> 0x0122, RemoteException -> 0x0125, TRY_ENTER, TryCatch #8 {RemoteException -> 0x0125, LoadingException -> 0x0122, all -> 0x011f, blocks: (B:36:0x00bc, B:42:0x00c8, B:44:0x00cf, B:45:0x00e5, B:49:0x00eb, B:51:0x00f3, B:53:0x00f7, B:54:0x0105, B:61:0x0110, B:69:0x0136, B:71:0x013e, B:72:0x0145, B:73:0x014c, B:68:0x0128, B:76:0x014f, B:77:0x0150, B:78:0x0157, B:79:0x0158, B:80:0x015f, B:83:0x0162, B:84:0x0163, B:86:0x017d, B:88:0x0190, B:90:0x0198, B:96:0x01c6, B:98:0x01cc, B:99:0x01d4, B:100:0x01db, B:91:0x01a9, B:92:0x01b0, B:94:0x01b3, B:95:0x01bd, B:101:0x01dc, B:102:0x01e3, B:103:0x01e4, B:104:0x01eb, B:110:0x01f7, B:46:0x00e6, B:47:0x00e8, B:37:0x00bd, B:39:0x00c3, B:40:0x00c5, B:107:0x01ee, B:108:0x01f5, B:55:0x0106, B:59:0x010d), top: B:160:0x00bc, inners: #0, #5, #7 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00cf A[Catch: all -> 0x011f, LoadingException -> 0x0122, RemoteException -> 0x0125, TryCatch #8 {RemoteException -> 0x0125, LoadingException -> 0x0122, all -> 0x011f, blocks: (B:36:0x00bc, B:42:0x00c8, B:44:0x00cf, B:45:0x00e5, B:49:0x00eb, B:51:0x00f3, B:53:0x00f7, B:54:0x0105, B:61:0x0110, B:69:0x0136, B:71:0x013e, B:72:0x0145, B:73:0x014c, B:68:0x0128, B:76:0x014f, B:77:0x0150, B:78:0x0157, B:79:0x0158, B:80:0x015f, B:83:0x0162, B:84:0x0163, B:86:0x017d, B:88:0x0190, B:90:0x0198, B:96:0x01c6, B:98:0x01cc, B:99:0x01d4, B:100:0x01db, B:91:0x01a9, B:92:0x01b0, B:94:0x01b3, B:95:0x01bd, B:101:0x01dc, B:102:0x01e3, B:103:0x01e4, B:104:0x01eb, B:110:0x01f7, B:46:0x00e6, B:47:0x00e8, B:37:0x00bd, B:39:0x00c3, B:40:0x00c5, B:107:0x01ee, B:108:0x01f5, B:55:0x0106, B:59:0x010d), top: B:160:0x00bc, inners: #0, #5, #7 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00eb A[Catch: all -> 0x011f, LoadingException -> 0x0122, RemoteException -> 0x0125, TRY_ENTER, TryCatch #8 {RemoteException -> 0x0125, LoadingException -> 0x0122, all -> 0x011f, blocks: (B:36:0x00bc, B:42:0x00c8, B:44:0x00cf, B:45:0x00e5, B:49:0x00eb, B:51:0x00f3, B:53:0x00f7, B:54:0x0105, B:61:0x0110, B:69:0x0136, B:71:0x013e, B:72:0x0145, B:73:0x014c, B:68:0x0128, B:76:0x014f, B:77:0x0150, B:78:0x0157, B:79:0x0158, B:80:0x015f, B:83:0x0162, B:84:0x0163, B:86:0x017d, B:88:0x0190, B:90:0x0198, B:96:0x01c6, B:98:0x01cc, B:99:0x01d4, B:100:0x01db, B:91:0x01a9, B:92:0x01b0, B:94:0x01b3, B:95:0x01bd, B:101:0x01dc, B:102:0x01e3, B:103:0x01e4, B:104:0x01eb, B:110:0x01f7, B:46:0x00e6, B:47:0x00e8, B:37:0x00bd, B:39:0x00c3, B:40:0x00c5, B:107:0x01ee, B:108:0x01f5, B:55:0x0106, B:59:0x010d), top: B:160:0x00bc, inners: #0, #5, #7 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x0158 A[Catch: all -> 0x011f, LoadingException -> 0x0122, RemoteException -> 0x0125, TryCatch #8 {RemoteException -> 0x0125, LoadingException -> 0x0122, all -> 0x011f, blocks: (B:36:0x00bc, B:42:0x00c8, B:44:0x00cf, B:45:0x00e5, B:49:0x00eb, B:51:0x00f3, B:53:0x00f7, B:54:0x0105, B:61:0x0110, B:69:0x0136, B:71:0x013e, B:72:0x0145, B:73:0x014c, B:68:0x0128, B:76:0x014f, B:77:0x0150, B:78:0x0157, B:79:0x0158, B:80:0x015f, B:83:0x0162, B:84:0x0163, B:86:0x017d, B:88:0x0190, B:90:0x0198, B:96:0x01c6, B:98:0x01cc, B:99:0x01d4, B:100:0x01db, B:91:0x01a9, B:92:0x01b0, B:94:0x01b3, B:95:0x01bd, B:101:0x01dc, B:102:0x01e3, B:103:0x01e4, B:104:0x01eb, B:110:0x01f7, B:46:0x00e6, B:47:0x00e8, B:37:0x00bd, B:39:0x00c3, B:40:0x00c5, B:107:0x01ee, B:108:0x01f5, B:55:0x0106, B:59:0x010d), top: B:160:0x00bc, inners: #0, #5, #7 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x0163 A[Catch: all -> 0x011f, LoadingException -> 0x0122, RemoteException -> 0x0125, TryCatch #8 {RemoteException -> 0x0125, LoadingException -> 0x0122, all -> 0x011f, blocks: (B:36:0x00bc, B:42:0x00c8, B:44:0x00cf, B:45:0x00e5, B:49:0x00eb, B:51:0x00f3, B:53:0x00f7, B:54:0x0105, B:61:0x0110, B:69:0x0136, B:71:0x013e, B:72:0x0145, B:73:0x014c, B:68:0x0128, B:76:0x014f, B:77:0x0150, B:78:0x0157, B:79:0x0158, B:80:0x015f, B:83:0x0162, B:84:0x0163, B:86:0x017d, B:88:0x0190, B:90:0x0198, B:96:0x01c6, B:98:0x01cc, B:99:0x01d4, B:100:0x01db, B:91:0x01a9, B:92:0x01b0, B:94:0x01b3, B:95:0x01bd, B:101:0x01dc, B:102:0x01e3, B:103:0x01e4, B:104:0x01eb, B:110:0x01f7, B:46:0x00e6, B:47:0x00e8, B:37:0x00bd, B:39:0x00c3, B:40:0x00c5, B:107:0x01ee, B:108:0x01f5, B:55:0x0106, B:59:0x010d), top: B:160:0x00bc, inners: #0, #5, #7 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x017d A[Catch: all -> 0x011f, LoadingException -> 0x0122, RemoteException -> 0x0125, TryCatch #8 {RemoteException -> 0x0125, LoadingException -> 0x0122, all -> 0x011f, blocks: (B:36:0x00bc, B:42:0x00c8, B:44:0x00cf, B:45:0x00e5, B:49:0x00eb, B:51:0x00f3, B:53:0x00f7, B:54:0x0105, B:61:0x0110, B:69:0x0136, B:71:0x013e, B:72:0x0145, B:73:0x014c, B:68:0x0128, B:76:0x014f, B:77:0x0150, B:78:0x0157, B:79:0x0158, B:80:0x015f, B:83:0x0162, B:84:0x0163, B:86:0x017d, B:88:0x0190, B:90:0x0198, B:96:0x01c6, B:98:0x01cc, B:99:0x01d4, B:100:0x01db, B:91:0x01a9, B:92:0x01b0, B:94:0x01b3, B:95:0x01bd, B:101:0x01dc, B:102:0x01e3, B:103:0x01e4, B:104:0x01eb, B:110:0x01f7, B:46:0x00e6, B:47:0x00e8, B:37:0x00bd, B:39:0x00c3, B:40:0x00c5, B:107:0x01ee, B:108:0x01f5, B:55:0x0106, B:59:0x010d), top: B:160:0x00bc, inners: #0, #5, #7 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x0190 A[Catch: all -> 0x011f, LoadingException -> 0x0122, RemoteException -> 0x0125, TryCatch #8 {RemoteException -> 0x0125, LoadingException -> 0x0122, all -> 0x011f, blocks: (B:36:0x00bc, B:42:0x00c8, B:44:0x00cf, B:45:0x00e5, B:49:0x00eb, B:51:0x00f3, B:53:0x00f7, B:54:0x0105, B:61:0x0110, B:69:0x0136, B:71:0x013e, B:72:0x0145, B:73:0x014c, B:68:0x0128, B:76:0x014f, B:77:0x0150, B:78:0x0157, B:79:0x0158, B:80:0x015f, B:83:0x0162, B:84:0x0163, B:86:0x017d, B:88:0x0190, B:90:0x0198, B:96:0x01c6, B:98:0x01cc, B:99:0x01d4, B:100:0x01db, B:91:0x01a9, B:92:0x01b0, B:94:0x01b3, B:95:0x01bd, B:101:0x01dc, B:102:0x01e3, B:103:0x01e4, B:104:0x01eb, B:110:0x01f7, B:46:0x00e6, B:47:0x00e8, B:37:0x00bd, B:39:0x00c3, B:40:0x00c5, B:107:0x01ee, B:108:0x01f5, B:55:0x0106, B:59:0x010d), top: B:160:0x00bc, inners: #0, #5, #7 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x0198 A[Catch: all -> 0x011f, LoadingException -> 0x0122, RemoteException -> 0x0125, TryCatch #8 {RemoteException -> 0x0125, LoadingException -> 0x0122, all -> 0x011f, blocks: (B:36:0x00bc, B:42:0x00c8, B:44:0x00cf, B:45:0x00e5, B:49:0x00eb, B:51:0x00f3, B:53:0x00f7, B:54:0x0105, B:61:0x0110, B:69:0x0136, B:71:0x013e, B:72:0x0145, B:73:0x014c, B:68:0x0128, B:76:0x014f, B:77:0x0150, B:78:0x0157, B:79:0x0158, B:80:0x015f, B:83:0x0162, B:84:0x0163, B:86:0x017d, B:88:0x0190, B:90:0x0198, B:96:0x01c6, B:98:0x01cc, B:99:0x01d4, B:100:0x01db, B:91:0x01a9, B:92:0x01b0, B:94:0x01b3, B:95:0x01bd, B:101:0x01dc, B:102:0x01e3, B:103:0x01e4, B:104:0x01eb, B:110:0x01f7, B:46:0x00e6, B:47:0x00e8, B:37:0x00bd, B:39:0x00c3, B:40:0x00c5, B:107:0x01ee, B:108:0x01f5, B:55:0x0106, B:59:0x010d), top: B:160:0x00bc, inners: #0, #5, #7 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x01a9 A[Catch: all -> 0x011f, LoadingException -> 0x0122, RemoteException -> 0x0125, TryCatch #8 {RemoteException -> 0x0125, LoadingException -> 0x0122, all -> 0x011f, blocks: (B:36:0x00bc, B:42:0x00c8, B:44:0x00cf, B:45:0x00e5, B:49:0x00eb, B:51:0x00f3, B:53:0x00f7, B:54:0x0105, B:61:0x0110, B:69:0x0136, B:71:0x013e, B:72:0x0145, B:73:0x014c, B:68:0x0128, B:76:0x014f, B:77:0x0150, B:78:0x0157, B:79:0x0158, B:80:0x015f, B:83:0x0162, B:84:0x0163, B:86:0x017d, B:88:0x0190, B:90:0x0198, B:96:0x01c6, B:98:0x01cc, B:99:0x01d4, B:100:0x01db, B:91:0x01a9, B:92:0x01b0, B:94:0x01b3, B:95:0x01bd, B:101:0x01dc, B:102:0x01e3, B:103:0x01e4, B:104:0x01eb, B:110:0x01f7, B:46:0x00e6, B:47:0x00e8, B:37:0x00bd, B:39:0x00c3, B:40:0x00c5, B:107:0x01ee, B:108:0x01f5, B:55:0x0106, B:59:0x010d), top: B:160:0x00bc, inners: #0, #5, #7 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x01b1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:94:0x01b3 A[Catch: all -> 0x011f, LoadingException -> 0x0122, RemoteException -> 0x0125, TryCatch #8 {RemoteException -> 0x0125, LoadingException -> 0x0122, all -> 0x011f, blocks: (B:36:0x00bc, B:42:0x00c8, B:44:0x00cf, B:45:0x00e5, B:49:0x00eb, B:51:0x00f3, B:53:0x00f7, B:54:0x0105, B:61:0x0110, B:69:0x0136, B:71:0x013e, B:72:0x0145, B:73:0x014c, B:68:0x0128, B:76:0x014f, B:77:0x0150, B:78:0x0157, B:79:0x0158, B:80:0x015f, B:83:0x0162, B:84:0x0163, B:86:0x017d, B:88:0x0190, B:90:0x0198, B:96:0x01c6, B:98:0x01cc, B:99:0x01d4, B:100:0x01db, B:91:0x01a9, B:92:0x01b0, B:94:0x01b3, B:95:0x01bd, B:101:0x01dc, B:102:0x01e3, B:103:0x01e4, B:104:0x01eb, B:110:0x01f7, B:46:0x00e6, B:47:0x00e8, B:37:0x00bd, B:39:0x00c3, B:40:0x00c5, B:107:0x01ee, B:108:0x01f5, B:55:0x0106, B:59:0x010d), top: B:160:0x00bc, inners: #0, #5, #7 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x01bd A[Catch: all -> 0x011f, LoadingException -> 0x0122, RemoteException -> 0x0125, TryCatch #8 {RemoteException -> 0x0125, LoadingException -> 0x0122, all -> 0x011f, blocks: (B:36:0x00bc, B:42:0x00c8, B:44:0x00cf, B:45:0x00e5, B:49:0x00eb, B:51:0x00f3, B:53:0x00f7, B:54:0x0105, B:61:0x0110, B:69:0x0136, B:71:0x013e, B:72:0x0145, B:73:0x014c, B:68:0x0128, B:76:0x014f, B:77:0x0150, B:78:0x0157, B:79:0x0158, B:80:0x015f, B:83:0x0162, B:84:0x0163, B:86:0x017d, B:88:0x0190, B:90:0x0198, B:96:0x01c6, B:98:0x01cc, B:99:0x01d4, B:100:0x01db, B:91:0x01a9, B:92:0x01b0, B:94:0x01b3, B:95:0x01bd, B:101:0x01dc, B:102:0x01e3, B:103:0x01e4, B:104:0x01eb, B:110:0x01f7, B:46:0x00e6, B:47:0x00e8, B:37:0x00bd, B:39:0x00c3, B:40:0x00c5, B:107:0x01ee, B:108:0x01f5, B:55:0x0106, B:59:0x010d), top: B:160:0x00bc, inners: #0, #5, #7 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x01cc A[Catch: all -> 0x011f, LoadingException -> 0x0122, RemoteException -> 0x0125, TryCatch #8 {RemoteException -> 0x0125, LoadingException -> 0x0122, all -> 0x011f, blocks: (B:36:0x00bc, B:42:0x00c8, B:44:0x00cf, B:45:0x00e5, B:49:0x00eb, B:51:0x00f3, B:53:0x00f7, B:54:0x0105, B:61:0x0110, B:69:0x0136, B:71:0x013e, B:72:0x0145, B:73:0x014c, B:68:0x0128, B:76:0x014f, B:77:0x0150, B:78:0x0157, B:79:0x0158, B:80:0x015f, B:83:0x0162, B:84:0x0163, B:86:0x017d, B:88:0x0190, B:90:0x0198, B:96:0x01c6, B:98:0x01cc, B:99:0x01d4, B:100:0x01db, B:91:0x01a9, B:92:0x01b0, B:94:0x01b3, B:95:0x01bd, B:101:0x01dc, B:102:0x01e3, B:103:0x01e4, B:104:0x01eb, B:110:0x01f7, B:46:0x00e6, B:47:0x00e8, B:37:0x00bd, B:39:0x00c3, B:40:0x00c5, B:107:0x01ee, B:108:0x01f5, B:55:0x0106, B:59:0x010d), top: B:160:0x00bc, inners: #0, #5, #7 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x01d4 A[Catch: all -> 0x011f, LoadingException -> 0x0122, RemoteException -> 0x0125, TryCatch #8 {RemoteException -> 0x0125, LoadingException -> 0x0122, all -> 0x011f, blocks: (B:36:0x00bc, B:42:0x00c8, B:44:0x00cf, B:45:0x00e5, B:49:0x00eb, B:51:0x00f3, B:53:0x00f7, B:54:0x0105, B:61:0x0110, B:69:0x0136, B:71:0x013e, B:72:0x0145, B:73:0x014c, B:68:0x0128, B:76:0x014f, B:77:0x0150, B:78:0x0157, B:79:0x0158, B:80:0x015f, B:83:0x0162, B:84:0x0163, B:86:0x017d, B:88:0x0190, B:90:0x0198, B:96:0x01c6, B:98:0x01cc, B:99:0x01d4, B:100:0x01db, B:91:0x01a9, B:92:0x01b0, B:94:0x01b3, B:95:0x01bd, B:101:0x01dc, B:102:0x01e3, B:103:0x01e4, B:104:0x01eb, B:110:0x01f7, B:46:0x00e6, B:47:0x00e8, B:37:0x00bd, B:39:0x00c3, B:40:0x00c5, B:107:0x01ee, B:108:0x01f5, B:55:0x0106, B:59:0x010d), top: B:160:0x00bc, inners: #0, #5, #7 }] */
    public static DynamiteModule c(Context context, VersionPolicy versionPolicy, String str) throws Throwable {
        long j11;
        DynamiteModule dynamiteModule;
        Cursor cursor;
        int i11;
        Boolean bool;
        zzp zzpVarH;
        int i12;
        IObjectWrapper iObjectWrapperJ;
        Object objJ;
        zzn zznVar;
        zzq zzqVar;
        zzn zznVar2;
        boolean z11;
        Cursor cursor2;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new LoadingException("null application Context");
        }
        ThreadLocal threadLocal = f9203j;
        zzn zznVar3 = (zzn) threadLocal.get();
        zzn zznVar4 = new zzn();
        threadLocal.set(zznVar4);
        ThreadLocal threadLocal2 = f9204k;
        Long l9 = (Long) threadLocal2.get();
        long jLongValue = l9.longValue();
        try {
            j11 = jLongValue;
            try {
                threadLocal2.set(Long.valueOf(SystemClock.uptimeMillis()));
                VersionPolicy.SelectionResult selectionResultA = versionPolicy.a(context, str, f9205l);
                new StringBuilder(str.length() + 26 + String.valueOf(selectionResultA.f9208a).length() + 19 + str.length() + 1 + String.valueOf(selectionResultA.f9209b).length());
                int i13 = selectionResultA.f9210c;
                if (i13 != 0) {
                    if (i13 != -1) {
                        if (i13 == 1 || selectionResultA.f9209b != 0) {
                            if (i13 == -1) {
                                "Selected local version of ".concat(str);
                                DynamiteModule dynamiteModule2 = new DynamiteModule(applicationContext);
                                if (j11 == 0) {
                                    threadLocal2.remove();
                                } else {
                                    threadLocal2.set(l9);
                                }
                                cursor2 = zznVar4.f9213a;
                                if (cursor2 != null) {
                                    cursor2.close();
                                }
                                threadLocal.set(zznVar3);
                                return dynamiteModule2;
                            }
                            if (i13 == 1) {
                                StringBuilder sb2 = new StringBuilder(String.valueOf(i13).length() + 36);
                                sb2.append("VersionPolicy returned invalid code:");
                                sb2.append(i13);
                                throw new LoadingException(sb2.toString());
                            }
                            try {
                                i11 = selectionResultA.f9209b;
                                try {
                                    synchronized (DynamiteModule.class) {
                                        if (e(context)) {
                                            throw new LoadingException("Remote loading disabled");
                                        }
                                        bool = f9198e;
                                    }
                                    if (bool != null) {
                                        throw new LoadingException("Failed to determine which loading route to use.");
                                    }
                                    if (bool.booleanValue()) {
                                        new StringBuilder(str.length() + 40 + String.valueOf(i11).length());
                                        synchronized (DynamiteModule.class) {
                                            zzqVar = f9206n;
                                        }
                                        if (zzqVar != null) {
                                            throw new LoadingException("DynamiteLoaderV2 was not cached.");
                                        }
                                        zznVar2 = (zzn) threadLocal.get();
                                        if (zznVar2 != null || zznVar2.f9213a == null) {
                                            throw new LoadingException("No result cursor");
                                        }
                                        Context applicationContext2 = context.getApplicationContext();
                                        Cursor cursor3 = zznVar2.f9213a;
                                        new ObjectWrapper(null);
                                        synchronized (DynamiteModule.class) {
                                            z11 = f9201h >= 2;
                                        }
                                        Context context2 = (Context) ObjectWrapper.j(z11 ? zzqVar.h1(new ObjectWrapper(applicationContext2), str, i11, new ObjectWrapper(cursor3)) : zzqVar.j(new ObjectWrapper(applicationContext2), str, i11, new ObjectWrapper(cursor3)));
                                        if (context2 == null) {
                                            throw new LoadingException("Failed to get module context");
                                        }
                                        dynamiteModule = new DynamiteModule(context2);
                                    } else {
                                        new StringBuilder(str.length() + 40 + String.valueOf(i11).length());
                                        zzpVarH = h(context);
                                        if (zzpVarH != null) {
                                            throw new LoadingException("Failed to create IDynamiteLoader.");
                                        }
                                        Parcel parcelG = zzpVarH.g(zzpVarH.h(), 6);
                                        i12 = parcelG.readInt();
                                        parcelG.recycle();
                                        if (i12 >= 3) {
                                            zznVar = (zzn) threadLocal.get();
                                            if (zznVar != null) {
                                                throw new LoadingException("No cached result cursor holder");
                                            }
                                            iObjectWrapperJ = zzpVarH.j1(new ObjectWrapper(context), str, i11, new ObjectWrapper(zznVar.f9213a));
                                        } else if (i12 == 2) {
                                            iObjectWrapperJ = zzpVarH.h1(new ObjectWrapper(context), str, i11);
                                        } else {
                                            iObjectWrapperJ = zzpVarH.j(new ObjectWrapper(context), str, i11);
                                        }
                                        objJ = ObjectWrapper.j(iObjectWrapperJ);
                                        if (objJ != null) {
                                            throw new LoadingException("Failed to load remote module.");
                                        }
                                        dynamiteModule = new DynamiteModule((Context) objJ);
                                    }
                                    if (j11 == 0) {
                                        f9204k.remove();
                                    } else {
                                        f9204k.set(l9);
                                    }
                                    cursor = zznVar4.f9213a;
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    f9203j.set(zznVar3);
                                    return dynamiteModule;
                                } catch (RemoteException e8) {
                                    throw new LoadingException("Failed to load remote module.", e8);
                                } catch (LoadingException e10) {
                                    throw e10;
                                } catch (Throwable th2) {
                                    throw new LoadingException("Failed to load remote module.", th2);
                                }
                            } catch (LoadingException e11) {
                                new StringBuilder(String.valueOf(e11.getMessage()).length() + 30);
                                int i14 = selectionResultA.f9208a;
                                if (i14 == 0 || versionPolicy.a(context, str, new zzo(i14)).f9210c != -1) {
                                    throw new LoadingException("Remote load failed. No local fallback found.", e11);
                                }
                                "Selected local version of ".concat(str);
                                dynamiteModule = new DynamiteModule(applicationContext);
                            }
                        }
                    } else if (selectionResultA.f9208a != 0) {
                        i13 = -1;
                        if (i13 == 1) {
                        }
                        if (i13 == -1) {
                            "Selected local version of ".concat(str);
                            DynamiteModule dynamiteModule3 = new DynamiteModule(applicationContext);
                            if (j11 == 0) {
                                threadLocal2.remove();
                            } else {
                                threadLocal2.set(l9);
                            }
                            cursor2 = zznVar4.f9213a;
                            if (cursor2 != null) {
                                cursor2.close();
                            }
                            threadLocal.set(zznVar3);
                            return dynamiteModule3;
                        }
                        if (i13 == 1) {
                            StringBuilder sb3 = new StringBuilder(String.valueOf(i13).length() + 36);
                            sb3.append("VersionPolicy returned invalid code:");
                            sb3.append(i13);
                            throw new LoadingException(sb3.toString());
                        }
                        i11 = selectionResultA.f9209b;
                        synchronized (DynamiteModule.class) {
                            if (e(context)) {
                                throw new LoadingException("Remote loading disabled");
                            }
                            bool = f9198e;
                            if (bool != null) {
                                throw new LoadingException("Failed to determine which loading route to use.");
                            }
                            if (bool.booleanValue()) {
                                new StringBuilder(str.length() + 40 + String.valueOf(i11).length());
                                synchronized (DynamiteModule.class) {
                                    zzqVar = f9206n;
                                    if (zzqVar != null) {
                                        throw new LoadingException("DynamiteLoaderV2 was not cached.");
                                    }
                                    zznVar2 = (zzn) threadLocal.get();
                                    if (zznVar2 != null) {
                                    }
                                    throw new LoadingException("No result cursor");
                                }
                            }
                            new StringBuilder(str.length() + 40 + String.valueOf(i11).length());
                            zzpVarH = h(context);
                            if (zzpVarH != null) {
                                throw new LoadingException("Failed to create IDynamiteLoader.");
                            }
                            Parcel parcelG2 = zzpVarH.g(zzpVarH.h(), 6);
                            i12 = parcelG2.readInt();
                            parcelG2.recycle();
                            if (i12 >= 3) {
                                zznVar = (zzn) threadLocal.get();
                                if (zznVar != null) {
                                    throw new LoadingException("No cached result cursor holder");
                                }
                                iObjectWrapperJ = zzpVarH.j1(new ObjectWrapper(context), str, i11, new ObjectWrapper(zznVar.f9213a));
                            } else if (i12 == 2) {
                                iObjectWrapperJ = zzpVarH.h1(new ObjectWrapper(context), str, i11);
                            } else {
                                iObjectWrapperJ = zzpVarH.j(new ObjectWrapper(context), str, i11);
                            }
                            objJ = ObjectWrapper.j(iObjectWrapperJ);
                            if (objJ != null) {
                                throw new LoadingException("Failed to load remote module.");
                            }
                            dynamiteModule = new DynamiteModule((Context) objJ);
                            if (j11 == 0) {
                                f9204k.remove();
                            } else {
                                f9204k.set(l9);
                            }
                            cursor = zznVar4.f9213a;
                            if (cursor != null) {
                                cursor.close();
                            }
                            f9203j.set(zznVar3);
                            return dynamiteModule;
                        }
                    }
                }
                int i15 = selectionResultA.f9208a;
                int i16 = selectionResultA.f9209b;
                StringBuilder sb4 = new StringBuilder(str.length() + 46 + String.valueOf(i15).length() + 23 + String.valueOf(i16).length() + 1);
                sb4.append("No acceptable module ");
                sb4.append(str);
                sb4.append(" found. Local version is ");
                sb4.append(i15);
                sb4.append(" and remote version is ");
                sb4.append(i16);
                sb4.append(".");
                throw new LoadingException(sb4.toString());
            } catch (Throwable th3) {
                th = th3;
                if (j11 == 0) {
                    f9204k.remove();
                } else {
                    f9204k.set(l9);
                }
                Cursor cursor4 = zznVar4.f9213a;
                if (cursor4 != null) {
                    cursor4.close();
                }
                f9203j.set(zznVar3);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            j11 = jLongValue;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x016d  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b0 A[Catch: all -> 0x0037, TryCatch #10 {all -> 0x0037, blocks: (B:9:0x0027, B:11:0x0033, B:51:0x00b9, B:16:0x003c, B:18:0x0043, B:20:0x0049, B:25:0x0050, B:27:0x0054, B:30:0x005d, B:32:0x0065, B:35:0x006c, B:42:0x0098, B:43:0x00a0, B:38:0x0073, B:40:0x0079, B:41:0x008a, B:46:0x00a3, B:49:0x00a6, B:50:0x00b0, B:17:0x003f), top: B:144:0x0027, inners: #13 }] */
    public static int d(Context context, String str, boolean z11) {
        Throwable th2;
        RemoteException remoteException;
        int i11;
        Cursor cursor;
        try {
            synchronized (DynamiteModule.class) {
                Boolean bool = f9198e;
                boolean z12 = true;
                Cursor cursor2 = null;
                if (bool == null) {
                    try {
                        Field declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                        synchronized (declaredField.getDeclaringClass()) {
                            try {
                                ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                                if (classLoader == ClassLoader.getSystemClassLoader()) {
                                    bool = Boolean.FALSE;
                                } else if (classLoader != null) {
                                    try {
                                        g(classLoader);
                                    } catch (LoadingException unused) {
                                    }
                                    bool = Boolean.TRUE;
                                } else {
                                    if (!e(context)) {
                                        return 0;
                                    }
                                    if (f9200g) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        bool = Boolean.FALSE;
                                    } else {
                                        Boolean bool2 = Boolean.TRUE;
                                        if (bool2.equals(null)) {
                                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                                            bool = Boolean.FALSE;
                                        } else {
                                            try {
                                                int iF = f(context, str, z11, true);
                                                String str2 = f9199f;
                                                if (str2 != null && !str2.isEmpty()) {
                                                    ClassLoader classLoaderA = zzb.a();
                                                    if (classLoaderA == null) {
                                                        if (Build.VERSION.SDK_INT >= 29) {
                                                            a.b();
                                                            String str3 = f9199f;
                                                            Preconditions.g(str3);
                                                            classLoaderA = a.a(ClassLoader.getSystemClassLoader(), str3);
                                                        } else {
                                                            String str4 = f9199f;
                                                            Preconditions.g(str4);
                                                            classLoaderA = new zzd(str4, ClassLoader.getSystemClassLoader());
                                                        }
                                                    }
                                                    g(classLoaderA);
                                                    declaredField.set(null, classLoaderA);
                                                    f9198e = bool2;
                                                    return iF;
                                                }
                                                return iF;
                                            } catch (LoadingException unused2) {
                                                declaredField.set(null, ClassLoader.getSystemClassLoader());
                                                bool = Boolean.FALSE;
                                            }
                                        }
                                    }
                                }
                                f9198e = bool;
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e8) {
                        new StringBuilder(e8.toString().length() + 30);
                        bool = Boolean.FALSE;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return f(context, str, z11, false);
                    } catch (LoadingException e10) {
                        new StringBuilder(String.valueOf(e10.getMessage()).length() + 42);
                        return 0;
                    }
                }
                zzp zzpVarH = h(context);
                try {
                    if (zzpVarH == null) {
                        return 0;
                    }
                    try {
                        Parcel parcelG = zzpVarH.g(zzpVarH.h(), 6);
                        int i12 = parcelG.readInt();
                        parcelG.recycle();
                        if (i12 >= 3) {
                            ThreadLocal threadLocal = f9203j;
                            zzn zznVar = (zzn) threadLocal.get();
                            if (zznVar != null && (cursor = zznVar.f9213a) != null) {
                                return cursor.getInt(0);
                            }
                            Cursor cursor3 = (Cursor) ObjectWrapper.j(zzpVarH.i1(new ObjectWrapper(context), str, z11, ((Long) f9204k.get()).longValue()));
                            if (cursor3 != null) {
                                try {
                                    if (cursor3.moveToFirst()) {
                                        i11 = cursor3.getInt(0);
                                        if (i11 > 0) {
                                            zzn zznVar2 = (zzn) threadLocal.get();
                                            if (zznVar2 == null || zznVar2.f9213a != null) {
                                                z12 = false;
                                            } else {
                                                zznVar2.f9213a = cursor3;
                                            }
                                            cursor2 = z12 ? null : cursor3;
                                        }
                                        if (cursor2 != null) {
                                            cursor2.close();
                                        }
                                    }
                                } catch (RemoteException e11) {
                                    remoteException = e11;
                                    cursor2 = cursor3;
                                    new StringBuilder(String.valueOf(remoteException.getMessage()).length() + 42);
                                    if (cursor2 == null) {
                                        return 0;
                                    }
                                    cursor2.close();
                                    return 0;
                                } catch (Throwable th4) {
                                    th2 = th4;
                                    cursor2 = cursor3;
                                    if (cursor2 == null) {
                                        throw th2;
                                    }
                                    cursor2.close();
                                    throw th2;
                                }
                            }
                            if (cursor3 == null) {
                                return 0;
                            }
                            cursor3.close();
                            return 0;
                        }
                        if (i12 == 2) {
                            ObjectWrapper objectWrapper = new ObjectWrapper(context);
                            Parcel parcelH = zzpVarH.h();
                            com.google.android.gms.internal.common.zzc.b(parcelH, objectWrapper);
                            parcelH.writeString(str);
                            parcelH.writeInt(z11 ? 1 : 0);
                            Parcel parcelG2 = zzpVarH.g(parcelH, 5);
                            i11 = parcelG2.readInt();
                            parcelG2.recycle();
                        } else {
                            ObjectWrapper objectWrapper2 = new ObjectWrapper(context);
                            Parcel parcelH2 = zzpVarH.h();
                            com.google.android.gms.internal.common.zzc.b(parcelH2, objectWrapper2);
                            parcelH2.writeString(str);
                            parcelH2.writeInt(z11 ? 1 : 0);
                            Parcel parcelG3 = zzpVarH.g(parcelH2, 3);
                            i11 = parcelG3.readInt();
                            parcelG3.recycle();
                        }
                        return i11;
                    } catch (RemoteException e12) {
                        remoteException = e12;
                    }
                } catch (Throwable th5) {
                    th2 = th5;
                }
            }
        } catch (Throwable th6) {
            try {
                Preconditions.g(context);
                throw th6;
            } catch (Exception unused3) {
                throw th6;
            }
        }
    }

    public static boolean e(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(f9202i)) {
            return true;
        }
        boolean z11 = false;
        if (f9202i == null) {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", Build.VERSION.SDK_INT >= 29 ? 268435456 : 0);
            if (GoogleApiAvailabilityLight.f8646b.c(context, 10000000) == 0 && providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                z11 = true;
            }
            f9202i = Boolean.valueOf(z11);
            if (z11 && (applicationInfo = providerInfoResolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                f9200g = true;
            }
        }
        return z11;
    }

    public static void g(ClassLoader classLoader) throws LoadingException {
        try {
            zzq zzqVar = null;
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder != null) {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                zzqVar = iInterfaceQueryLocalInterface instanceof zzq ? (zzq) iInterfaceQueryLocalInterface : new zzq(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
            }
            f9206n = zzqVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e8) {
            throw new LoadingException("Failed to instantiate dynamite loader", e8);
        }
    }

    public static zzp h(Context context) {
        zzp zzpVar;
        synchronized (DynamiteModule.class) {
            zzp zzpVar2 = m;
            if (zzpVar2 != null) {
                return zzpVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    zzpVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    zzpVar = iInterfaceQueryLocalInterface instanceof zzp ? (zzp) iInterfaceQueryLocalInterface : new zzp(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
                }
                if (zzpVar != null) {
                    m = zzpVar;
                    return zzpVar;
                }
            } catch (Exception e8) {
                new StringBuilder(String.valueOf(e8.getMessage()).length() + 45);
            }
            return null;
        }
    }

    public final IBinder b(String str) throws LoadingException {
        try {
            return (IBinder) this.f9207a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e8) {
            throw new LoadingException("Failed to instantiate module class: ".concat(str), e8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:85:0x013b A[PHI: r3
      0x013b: PHI (r3v4 boolean) = (r3v3 boolean), (r3v6 boolean) binds: [B:58:0x00f2, B:83:0x0138] A[DONT_GENERATE, DONT_INLINE]] */
    public static int f(Context context, String str, boolean z11, boolean z12) throws Throwable {
        Exception exc;
        Throwable th2;
        MatrixCursor matrixCursor;
        boolean z13;
        MatrixCursor matrixCursor2 = null;
        try {
            try {
                boolean z14 = true;
                Uri uriBuild = new Uri.Builder().scheme("content").authority(HOBXIlHxIkMBEA.CeldmO).path(true != z11 ? "api" : "api_force_staging").appendPath(str).appendQueryParameter("requestStartUptime", String.valueOf(((Long) f9204k.get()).longValue())).build();
                ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(uriBuild);
                boolean z15 = false;
                if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                    matrixCursor = null;
                } else {
                    try {
                        Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uriBuild, null, null, null, null);
                        if (cursorQuery == null) {
                            contentProviderClientAcquireUnstableContentProviderClient.release();
                            matrixCursor = null;
                        } else {
                            try {
                                int count = cursorQuery.getCount();
                                int columnCount = cursorQuery.getColumnCount();
                                matrixCursor = new MatrixCursor(cursorQuery.getColumnNames(), count);
                                for (int i11 = 0; i11 < count; i11++) {
                                    if (!cursorQuery.moveToPosition(i11)) {
                                        throw new RemoteException("Cursor read incomplete (ContentProvider dead?)");
                                    }
                                    Object[] objArr = new Object[columnCount];
                                    for (int i12 = 0; i12 < columnCount; i12++) {
                                        int type = cursorQuery.getType(i12);
                                        if (type == 0) {
                                            objArr[i12] = null;
                                        } else if (type == 1) {
                                            objArr[i12] = Long.valueOf(cursorQuery.getLong(i12));
                                        } else if (type == 2) {
                                            objArr[i12] = Double.valueOf(cursorQuery.getDouble(i12));
                                        } else if (type == 3) {
                                            objArr[i12] = cursorQuery.getString(i12);
                                        } else {
                                            if (type != 4) {
                                                throw new RemoteException("Unknown column type");
                                            }
                                            objArr[i12] = cursorQuery.getBlob(i12);
                                        }
                                    }
                                    matrixCursor.addRow(objArr);
                                }
                                cursorQuery.close();
                                contentProviderClientAcquireUnstableContentProviderClient.release();
                            } catch (Throwable th3) {
                                try {
                                    cursorQuery.close();
                                    throw th3;
                                } catch (Throwable th4) {
                                    th3.addSuppressed(th4);
                                    throw th3;
                                }
                            }
                        }
                    } catch (RemoteException unused) {
                    } catch (Throwable th5) {
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        throw th5;
                    }
                }
                if (matrixCursor != null) {
                    try {
                        if (matrixCursor.moveToFirst()) {
                            int i13 = matrixCursor.getInt(0);
                            if (i13 > 0) {
                                synchronized (DynamiteModule.class) {
                                    try {
                                        f9199f = matrixCursor.getString(2);
                                        int columnIndex = matrixCursor.getColumnIndex("loaderVersion");
                                        if (columnIndex >= 0) {
                                            f9201h = matrixCursor.getInt(columnIndex);
                                        }
                                        int columnIndex2 = matrixCursor.getColumnIndex("disableStandaloneDynamiteLoader2");
                                        if (columnIndex2 >= 0) {
                                            z13 = matrixCursor.getInt(columnIndex2) != 0;
                                            f9200g = z13;
                                        } else {
                                            z13 = false;
                                        }
                                    } catch (Throwable th6) {
                                        throw th6;
                                    }
                                }
                                zzn zznVar = (zzn) f9203j.get();
                                if (zznVar == null || zznVar.f9213a != null) {
                                    z14 = false;
                                } else {
                                    zznVar.f9213a = matrixCursor;
                                }
                                z15 = z13;
                                matrixCursor2 = z14 ? null : matrixCursor;
                            }
                            if (z12 && z15) {
                                throw new LoadingException("forcing fallback to container DynamiteLoader impl");
                            }
                            if (matrixCursor2 != null) {
                                matrixCursor2.close();
                            }
                            return i13;
                        }
                    } catch (Exception e8) {
                        exc = e8;
                        if (exc instanceof LoadingException) {
                            throw exc;
                        }
                        String message = exc.getMessage();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 25);
                        sb2.append("V2 version check failed: ");
                        sb2.append(message);
                        throw new LoadingException(sb2.toString(), exc);
                    } catch (Throwable th7) {
                        th2 = th7;
                        matrixCursor2 = matrixCursor;
                        if (matrixCursor2 == null) {
                            throw th2;
                        }
                        matrixCursor2.close();
                        throw th2;
                    }
                }
                throw new LoadingException("Failed to connect to dynamite module ContentResolver.");
            } catch (Throwable th8) {
                th2 = th8;
            }
        } catch (Exception e10) {
            exc = e10;
        }
    }
}
