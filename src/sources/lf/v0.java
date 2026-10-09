package lf;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Looper;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.facebook.FacebookException;
import com.facebook.FacebookSdkNotInitializedException;
import fr.p3;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static o0 f40126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f40127b = 0;

    /* JADX WARN: Code duplicated, block: B:101:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:113:0x015e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0076  */
    /* JADX WARN: Code duplicated, block: B:39:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d0 A[Catch: all -> 0x00e3, Exception -> 0x00e7, TryCatch #8 {Exception -> 0x00e7, all -> 0x00e3, blocks: (B:40:0x00c2, B:42:0x00d0, B:44:0x00d4, B:51:0x00ec, B:53:0x0106, B:55:0x0113, B:62:0x0132, B:64:0x0138, B:67:0x0144, B:69:0x0148, B:70:0x0151, B:58:0x011d, B:60:0x012a, B:92:0x01b4, B:93:0x01bb), top: B:114:0x00c2 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x0106 A[Catch: all -> 0x00e3, Exception -> 0x00e7, TryCatch #8 {Exception -> 0x00e7, all -> 0x00e3, blocks: (B:40:0x00c2, B:42:0x00d0, B:44:0x00d4, B:51:0x00ec, B:53:0x0106, B:55:0x0113, B:62:0x0132, B:64:0x0138, B:67:0x0144, B:69:0x0148, B:70:0x0151, B:58:0x011d, B:60:0x012a, B:92:0x01b4, B:93:0x01bb), top: B:114:0x00c2 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x0113 A[Catch: all -> 0x00e3, Exception -> 0x00e7, TryCatch #8 {Exception -> 0x00e7, all -> 0x00e3, blocks: (B:40:0x00c2, B:42:0x00d0, B:44:0x00d4, B:51:0x00ec, B:53:0x0106, B:55:0x0113, B:62:0x0132, B:64:0x0138, B:67:0x0144, B:69:0x0148, B:70:0x0151, B:58:0x011d, B:60:0x012a, B:92:0x01b4, B:93:0x01bb), top: B:114:0x00c2 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x011b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x011d A[Catch: all -> 0x00e3, Exception -> 0x00e7, TryCatch #8 {Exception -> 0x00e7, all -> 0x00e3, blocks: (B:40:0x00c2, B:42:0x00d0, B:44:0x00d4, B:51:0x00ec, B:53:0x0106, B:55:0x0113, B:62:0x0132, B:64:0x0138, B:67:0x0144, B:69:0x0148, B:70:0x0151, B:58:0x011d, B:60:0x012a, B:92:0x01b4, B:93:0x01bb), top: B:114:0x00c2 }] */
    /* JADX WARN: Code duplicated, block: B:5:0x000e  */
    /* JADX WARN: Code duplicated, block: B:60:0x012a A[Catch: all -> 0x00e3, Exception -> 0x00e7, TryCatch #8 {Exception -> 0x00e7, all -> 0x00e3, blocks: (B:40:0x00c2, B:42:0x00d0, B:44:0x00d4, B:51:0x00ec, B:53:0x0106, B:55:0x0113, B:62:0x0132, B:64:0x0138, B:67:0x0144, B:69:0x0148, B:70:0x0151, B:58:0x011d, B:60:0x012a, B:92:0x01b4, B:93:0x01bb), top: B:114:0x00c2 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0138 A[Catch: all -> 0x00e3, Exception -> 0x00e7, TryCatch #8 {Exception -> 0x00e7, all -> 0x00e3, blocks: (B:40:0x00c2, B:42:0x00d0, B:44:0x00d4, B:51:0x00ec, B:53:0x0106, B:55:0x0113, B:62:0x0132, B:64:0x0138, B:67:0x0144, B:69:0x0148, B:70:0x0151, B:58:0x011d, B:60:0x012a, B:92:0x01b4, B:93:0x01bb), top: B:114:0x00c2 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0141  */
    /* JADX WARN: Code duplicated, block: B:67:0x0144 A[Catch: all -> 0x00e3, Exception -> 0x00e7, TryCatch #8 {Exception -> 0x00e7, all -> 0x00e3, blocks: (B:40:0x00c2, B:42:0x00d0, B:44:0x00d4, B:51:0x00ec, B:53:0x0106, B:55:0x0113, B:62:0x0132, B:64:0x0138, B:67:0x0144, B:69:0x0148, B:70:0x0151, B:58:0x011d, B:60:0x012a, B:92:0x01b4, B:93:0x01bb), top: B:114:0x00c2 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x0148 A[Catch: all -> 0x00e3, Exception -> 0x00e7, TryCatch #8 {Exception -> 0x00e7, all -> 0x00e3, blocks: (B:40:0x00c2, B:42:0x00d0, B:44:0x00d4, B:51:0x00ec, B:53:0x0106, B:55:0x0113, B:62:0x0132, B:64:0x0138, B:67:0x0144, B:69:0x0148, B:70:0x0151, B:58:0x011d, B:60:0x012a, B:92:0x01b4, B:93:0x01bb), top: B:114:0x00c2 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0151 A[Catch: all -> 0x00e3, Exception -> 0x00e7, TRY_LEAVE, TryCatch #8 {Exception -> 0x00e7, all -> 0x00e3, blocks: (B:40:0x00c2, B:42:0x00d0, B:44:0x00d4, B:51:0x00ec, B:53:0x0106, B:55:0x0113, B:62:0x0132, B:64:0x0138, B:67:0x0144, B:69:0x0148, B:70:0x0151, B:58:0x011d, B:60:0x012a, B:92:0x01b4, B:93:0x01bb), top: B:114:0x00c2 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0164  */
    /* JADX WARN: Code duplicated, block: B:75:0x0165 A[Catch: all -> 0x0192, Exception -> 0x0196, TryCatch #9 {Exception -> 0x0196, all -> 0x0192, blocks: (B:72:0x015e, B:75:0x0165, B:78:0x017b, B:80:0x0181, B:88:0x01a6), top: B:113:0x015e }] */
    /* JADX WARN: Code duplicated, block: B:90:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:92:0x01b4 A[Catch: all -> 0x00e3, Exception -> 0x00e7, TRY_ENTER, TryCatch #8 {Exception -> 0x00e7, all -> 0x00e3, blocks: (B:40:0x00c2, B:42:0x00d0, B:44:0x00d4, B:51:0x00ec, B:53:0x0106, B:55:0x0113, B:62:0x0132, B:64:0x0138, B:67:0x0144, B:69:0x0148, B:70:0x0151, B:58:0x011d, B:60:0x012a, B:92:0x01b4, B:93:0x01bb), top: B:114:0x00c2 }] */
    public static d a(Context context) throws Throwable {
        d dVar;
        Exception exc;
        Cursor cursor;
        Throwable th2;
        d dVar2;
        String[] strArr;
        ProviderInfo providerInfoResolveContentProvider;
        ProviderInfo providerInfoResolveContentProvider2;
        Uri uri;
        String str;
        Uri uri2;
        PackageManager packageManager;
        String installerPackageName;
        Cursor cursorQuery;
        int columnIndex;
        int columnIndex2;
        String str2;
        Method methodR;
        Object objT;
        Cursor cursor2 = null;
        try {
            if (!h(context) || (methodR = j1.r("com.google.android.gms.ads.identifier.AdvertisingIdClient", "getAdvertisingIdInfo", Context.class)) == null || (objT = j1.t(null, methodR, context)) == null) {
                dVar = null;
            } else {
                Method methodQ = j1.q(objT.getClass(), "getId", new Class[0]);
                Method methodQ2 = j1.q(objT.getClass(), "isLimitAdTrackingEnabled", new Class[0]);
                if (methodQ == null || methodQ2 == null) {
                    dVar = null;
                } else {
                    dVar = new d();
                    dVar.f39985a = (String) j1.t(objT, methodQ, new Object[0]);
                    Boolean bool = (Boolean) j1.t(objT, methodQ2, new Object[0]);
                    dVar.f39989e = bool != null ? bool.booleanValue() : false;
                }
            }
        } catch (Exception unused) {
            re.s sVar = re.s.f49201a;
        }
        if (dVar == null) {
            if (h(context)) {
                c cVar = new c();
                Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                intent.setPackage("com.google.android.gms");
                try {
                    if (context.bindService(intent, cVar, 1)) {
                        try {
                            try {
                                b bVar = new b(cVar.a());
                                d dVar3 = new d();
                                dVar3.f39985a = bVar.g();
                                dVar3.f39989e = bVar.h();
                                context.unbindService(cVar);
                                dVar = dVar3;
                            } catch (Exception unused2) {
                                re.s sVar2 = re.s.f49201a;
                                context.unbindService(cVar);
                                dVar = null;
                                if (dVar == null) {
                                    dVar = new d();
                                }
                                if (!kotlin.jvm.internal.m.a(Looper.myLooper(), Looper.getMainLooper())) {
                                    throw new FacebookException("getAttributionIdentifiers cannot be called on the main thread.");
                                }
                                dVar2 = d.f39984f;
                                if (dVar2 == null) {
                                }
                                strArr = new String[]{"aid", "androidid", "limit_tracking"};
                                providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.facebook.katana.provider.AttributionIdProvider", 0);
                                providerInfoResolveContentProvider2 = context.getPackageManager().resolveContentProvider("com.facebook.wakizashi.provider.AttributionIdProvider", 0);
                                if (providerInfoResolveContentProvider != null) {
                                    str2 = providerInfoResolveContentProvider.packageName;
                                    kotlin.jvm.internal.m.e(str2, "contentProviderInfo.packageName");
                                    if (s.a(context, str2)) {
                                        uri2 = Uri.parse("content://com.facebook.katana.provider.AttributionIdProvider");
                                    } else {
                                        if (providerInfoResolveContentProvider2 != null) {
                                            str = providerInfoResolveContentProvider2.packageName;
                                            kotlin.jvm.internal.m.e(str, "wakizashiProviderInfo.packageName");
                                            if (s.a(context, str)) {
                                                uri2 = Uri.parse("content://com.facebook.wakizashi.provider.AttributionIdProvider");
                                            }
                                        }
                                        uri = null;
                                    }
                                    uri = uri2;
                                } else {
                                    if (providerInfoResolveContentProvider2 != null) {
                                        str = providerInfoResolveContentProvider2.packageName;
                                        kotlin.jvm.internal.m.e(str, "wakizashiProviderInfo.packageName");
                                        if (s.a(context, str)) {
                                            uri2 = Uri.parse("content://com.facebook.wakizashi.provider.AttributionIdProvider");
                                            uri = uri2;
                                        }
                                    }
                                    uri = null;
                                }
                                packageManager = context.getPackageManager();
                                if (packageManager != null) {
                                    installerPackageName = packageManager.getInstallerPackageName(context.getPackageName());
                                } else {
                                    installerPackageName = null;
                                }
                                if (installerPackageName != null) {
                                    dVar.f39988d = installerPackageName;
                                }
                                if (uri == null) {
                                    dVar.f39986b = System.currentTimeMillis();
                                    d.f39984f = dVar;
                                } else {
                                    cursorQuery = context.getContentResolver().query(uri, strArr, null, null, null);
                                    if (cursorQuery != null) {
                                        try {
                                            if (!cursorQuery.moveToFirst()) {
                                                int columnIndex3 = cursorQuery.getColumnIndex("aid");
                                                columnIndex = cursorQuery.getColumnIndex("androidid");
                                                columnIndex2 = cursorQuery.getColumnIndex("limit_tracking");
                                                dVar.f39987c = cursorQuery.getString(columnIndex3);
                                                if (columnIndex > 0) {
                                                    dVar.f39985a = cursorQuery.getString(columnIndex);
                                                    dVar.f39989e = Boolean.parseBoolean(cursorQuery.getString(columnIndex2));
                                                }
                                                cursorQuery.close();
                                                dVar.f39986b = System.currentTimeMillis();
                                                d.f39984f = dVar;
                                                return dVar;
                                            }
                                        } catch (Exception e8) {
                                            cursor = cursorQuery;
                                            exc = e8;
                                            try {
                                                exc.toString();
                                                re.s sVar3 = re.s.f49201a;
                                                if (cursor != null) {
                                                    cursor.close();
                                                }
                                                return null;
                                            } catch (Throwable th3) {
                                                th2 = th3;
                                                cursor2 = cursor;
                                                if (cursor2 != null) {
                                                    throw th2;
                                                }
                                                cursor2.close();
                                                throw th2;
                                            }
                                        } catch (Throwable th4) {
                                            th = th4;
                                            cursor2 = cursorQuery;
                                            th2 = th;
                                            if (cursor2 != null) {
                                                throw th2;
                                            }
                                            cursor2.close();
                                            throw th2;
                                        }
                                    }
                                    dVar.f39986b = System.currentTimeMillis();
                                    d.f39984f = dVar;
                                    if (cursorQuery != null) {
                                        cursorQuery.close();
                                    }
                                }
                                return dVar;
                            }
                        } catch (Throwable th5) {
                            context.unbindService(cVar);
                            throw th5;
                        }
                    } else {
                        dVar = null;
                    }
                } catch (SecurityException unused3) {
                }
            } else {
                dVar = null;
            }
            if (dVar == null) {
                dVar = new d();
            }
        }
        try {
            if (!kotlin.jvm.internal.m.a(Looper.myLooper(), Looper.getMainLooper())) {
                throw new FacebookException("getAttributionIdentifiers cannot be called on the main thread.");
            }
            dVar2 = d.f39984f;
            if (dVar2 == null && System.currentTimeMillis() - dVar2.f39986b < 3600000) {
                return dVar2;
            }
            strArr = new String[]{"aid", "androidid", "limit_tracking"};
            providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.facebook.katana.provider.AttributionIdProvider", 0);
            providerInfoResolveContentProvider2 = context.getPackageManager().resolveContentProvider("com.facebook.wakizashi.provider.AttributionIdProvider", 0);
            if (providerInfoResolveContentProvider != null) {
                str2 = providerInfoResolveContentProvider.packageName;
                kotlin.jvm.internal.m.e(str2, "contentProviderInfo.packageName");
                if (s.a(context, str2)) {
                    uri2 = Uri.parse("content://com.facebook.katana.provider.AttributionIdProvider");
                } else {
                    if (providerInfoResolveContentProvider2 != null) {
                        str = providerInfoResolveContentProvider2.packageName;
                        kotlin.jvm.internal.m.e(str, "wakizashiProviderInfo.packageName");
                        if (s.a(context, str)) {
                            uri2 = Uri.parse("content://com.facebook.wakizashi.provider.AttributionIdProvider");
                        }
                    }
                    uri = null;
                }
                uri = uri2;
            } else {
                if (providerInfoResolveContentProvider2 != null) {
                    str = providerInfoResolveContentProvider2.packageName;
                    kotlin.jvm.internal.m.e(str, "wakizashiProviderInfo.packageName");
                    if (s.a(context, str)) {
                        uri2 = Uri.parse("content://com.facebook.wakizashi.provider.AttributionIdProvider");
                        uri = uri2;
                    }
                }
                uri = null;
            }
            packageManager = context.getPackageManager();
            if (packageManager != null) {
                installerPackageName = packageManager.getInstallerPackageName(context.getPackageName());
            } else {
                installerPackageName = null;
            }
            if (installerPackageName != null) {
                dVar.f39988d = installerPackageName;
            }
            if (uri == null) {
                dVar.f39986b = System.currentTimeMillis();
                d.f39984f = dVar;
            } else {
                cursorQuery = context.getContentResolver().query(uri, strArr, null, null, null);
                if (cursorQuery != null) {
                    if (!cursorQuery.moveToFirst()) {
                        int columnIndex4 = cursorQuery.getColumnIndex("aid");
                        columnIndex = cursorQuery.getColumnIndex("androidid");
                        columnIndex2 = cursorQuery.getColumnIndex("limit_tracking");
                        dVar.f39987c = cursorQuery.getString(columnIndex4);
                        if (columnIndex > 0 && columnIndex2 > 0 && dVar.a() == null) {
                            dVar.f39985a = cursorQuery.getString(columnIndex);
                            dVar.f39989e = Boolean.parseBoolean(cursorQuery.getString(columnIndex2));
                        }
                        cursorQuery.close();
                        dVar.f39986b = System.currentTimeMillis();
                        d.f39984f = dVar;
                        return dVar;
                    }
                }
                dVar.f39986b = System.currentTimeMillis();
                d.f39984f = dVar;
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            }
            return dVar;
        } catch (Exception e10) {
            exc = e10;
            cursor = null;
        } catch (Throwable th6) {
            th = th6;
        }
    }

    public static final synchronized o0 b() {
        o0 o0Var;
        try {
            if (f40126a == null) {
                f40126a = new o0("v0", new ay.k0(19));
            }
            o0Var = f40126a;
            if (o0Var == null) {
                kotlin.jvm.internal.m.n("imageCache");
                throw null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return o0Var;
    }

    public static final BufferedInputStream c(Uri uri) {
        if (g(uri)) {
            try {
                o0 o0VarB = b();
                String string = uri.toString();
                kotlin.jvm.internal.m.e(string, "uri.toString()");
                AtomicLong atomicLong = o0.f40082g;
                return o0VarB.a(string, null);
            } catch (IOException e8) {
                p3 p3Var = y0.f40132d;
                p3.t(re.d0.CACHE, "v0", e8.toString());
            }
        }
        return null;
    }

    public static final boolean d(Context context, String redirectURI) {
        List<ResolveInfo> listQueryIntentActivities;
        kotlin.jvm.internal.m.f(redirectURI, "redirectURI");
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.addCategory("android.intent.category.BROWSABLE");
            intent.setData(Uri.parse(redirectURI));
            listQueryIntentActivities = packageManager.queryIntentActivities(intent, 64);
        } else {
            listQueryIntentActivities = null;
        }
        if (listQueryIntentActivities != null) {
            Iterator<ResolveInfo> it = listQueryIntentActivities.iterator();
            boolean z11 = false;
            while (it.hasNext()) {
                ActivityInfo activityInfo = it.next().activityInfo;
                if (kotlin.jvm.internal.m.a(activityInfo.name, "com.facebook.CustomTabActivity") && kotlin.jvm.internal.m.a(activityInfo.packageName, context.getPackageName())) {
                    z11 = true;
                }
            }
            return z11;
        }
        return false;
    }

    public static final void e(Context context, boolean z11) {
        ActivityInfo activityInfo;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            try {
                activityInfo = packageManager.getActivityInfo(new ComponentName(context, "com.facebook.FacebookActivity"), 1);
            } catch (PackageManager.NameNotFoundException unused) {
                activityInfo = null;
            }
        } else {
            activityInfo = null;
        }
        if (activityInfo == null && z11) {
            throw new IllegalStateException("FacebookActivity is not declared in the AndroidManifest.xml. If you are using the facebook-common module or dependent modules please add com.facebook.FacebookActivity to your AndroidManifest.xml file. See https://developers.facebook.com/docs/android/getting-started for more info.");
        }
    }

    public static final InputStream f(HttpURLConnection httpURLConnection) throws IOException {
        if (httpURLConnection.getResponseCode() != 200) {
            return null;
        }
        Uri uri = Uri.parse(httpURLConnection.getURL().toString());
        InputStream inputStream = httpURLConnection.getInputStream();
        try {
            if (g(uri)) {
                o0 o0VarB = b();
                String string = uri.toString();
                kotlin.jvm.internal.m.e(string, "uri.toString()");
                u0 u0Var = new u0(inputStream, OSSConstants.DEFAULT_BUFFER_SIZE);
                u0Var.f40125a = httpURLConnection;
                return new l0(u0Var, o0VarB.b(string, null));
            }
        } catch (IOException unused) {
        }
        return inputStream;
    }

    public static boolean g(Uri uri) {
        String host;
        if (uri != null && (host = uri.getHost()) != null) {
            if (host.equals("fbcdn.net") || oz.x.k0(host, ".fbcdn.net", false)) {
                return true;
            }
            if (oz.x.s0(host, "fbcdn", false) && oz.x.k0(host, ".akamaihd.net", false)) {
                return true;
            }
        }
        return false;
    }

    public static boolean h(Context context) {
        Method methodR = j1.r("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", Context.class);
        if (methodR != null) {
            Object objT = j1.t(null, methodR, context);
            if ((objT instanceof Integer) && objT.equals(0)) {
                return true;
            }
        }
        return false;
    }

    public static final void i(String arg, String str) {
        kotlin.jvm.internal.m.f(arg, "arg");
        if (arg.length() <= 0) {
            throw new IllegalArgumentException(ep.a.g("Argument '", str, "' cannot be empty").toString());
        }
    }

    public static final void j(re.a0 container) {
        kotlin.jvm.internal.m.f(container, "container");
        Iterator it = container.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                throw new NullPointerException("Container 'requests' cannot contain null values");
            }
        }
        if (container.isEmpty()) {
            throw new IllegalArgumentException("Container 'requests' cannot be empty".toString());
        }
    }

    public static final void k(String str, String str2) {
        if (str == null || str.length() <= 0) {
            throw new IllegalArgumentException(ep.a.g("Argument '", str2, "' cannot be null or empty").toString());
        }
    }

    public static JSONObject l(BufferedInputStream bufferedInputStream) throws IOException {
        if (bufferedInputStream.read() != 0) {
            return null;
        }
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < 3; i13++) {
            int i14 = bufferedInputStream.read();
            if (i14 == -1) {
                p3 p3Var = y0.f40132d;
                re.d0 d0Var = re.d0.CACHE;
                AtomicLong atomicLong = o0.f40082g;
                p3.r(d0Var, "o0", "readHeader: stream.read returned -1 while reading header size");
                return null;
            }
            i12 = (i12 << 8) + (i14 & 255);
        }
        byte[] bArr = new byte[i12];
        while (i11 < i12) {
            int i15 = bufferedInputStream.read(bArr, i11, i12 - i11);
            if (i15 < 1) {
                p3 p3Var2 = y0.f40132d;
                re.d0 d0Var2 = re.d0.CACHE;
                AtomicLong atomicLong2 = o0.f40082g;
                p3.r(d0Var2, "o0", "readHeader: stream.read stopped at " + Integer.valueOf(i11) + " when expected " + i12);
                return null;
            }
            i11 += i15;
        }
        try {
            Object objNextValue = new JSONTokener(new String(bArr, oz.a.f46133a)).nextValue();
            if (objNextValue instanceof JSONObject) {
                return (JSONObject) objNextValue;
            }
            p3 p3Var3 = y0.f40132d;
            re.d0 d0Var3 = re.d0.CACHE;
            AtomicLong atomicLong3 = o0.f40082g;
            p3.r(d0Var3, "o0", "readHeader: expected JSONObject, got " + objNextValue.getClass().getCanonicalName());
            return null;
        } catch (JSONException e8) {
            throw new IOException(e8.getMessage());
        }
    }

    public static final void m() {
        if (!re.s.f49215p.get()) {
            throw new FacebookSdkNotInitializedException("The SDK has not been initialized, make sure to call FacebookSdk.sdkInitialize() first.");
        }
    }
}
