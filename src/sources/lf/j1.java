package lf;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Parcel;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.autofill.AutofillManager;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.adjust.sdk.Constants;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.facebook.FacebookException;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import lt.AJC.PQgum;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f40043a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static long f40044b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static long f40045c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static long f40046d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static String f40047e = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static String f40048f = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static String f40049g = "NoCarrier";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static String f40050h = "";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static Locale f40051i;

    public static final ArrayList A(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i11 = 0; i11 < length; i11++) {
            arrayList.add(jSONArray.getString(i11));
        }
        return arrayList;
    }

    public static final HashMap B(String str) {
        if (str.length() == 0) {
            return new HashMap();
        }
        try {
            HashMap map = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String key = itKeys.next();
                kotlin.jvm.internal.m.e(key, "key");
                String string = jSONObject.getString(key);
                kotlin.jvm.internal.m.e(string, "jsonObject.getString(key)");
                map.put(key, string);
            }
            return map;
        } catch (JSONException unused) {
            return new HashMap();
        }
    }

    public static final String C(Map map) {
        kotlin.jvm.internal.m.f(map, "map");
        boolean zIsEmpty = map.isEmpty();
        String string = BuildConfig.VERSION_NAME;
        if (zIsEmpty) {
            return BuildConfig.VERSION_NAME;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : map.entrySet()) {
                jSONObject.put((String) entry.getKey(), (String) entry.getValue());
            }
            string = jSONObject.toString();
        } catch (JSONException unused) {
        }
        kotlin.jvm.internal.m.e(string, "{\n      try {\n        va…\n        \"\"\n      }\n    }");
        return string;
    }

    public static final boolean D(Context context) {
        AutofillManager autofillManagerE;
        return Build.VERSION.SDK_INT >= 26 && (autofillManagerE = se.n.e(context.getSystemService(se.n.j()))) != null && autofillManagerE.isAutofillSupported() && autofillManagerE.isEnabled();
    }

    public static final Bundle E(String str) {
        Bundle bundle = new Bundle();
        if (!y(str)) {
            if (str == null) {
                throw new IllegalStateException("Required value was null.");
            }
            for (String str2 : (String[]) oz.q.W0(str, new String[]{"&"}, 0, 6).toArray(new String[0])) {
                String[] strArr = (String[]) oz.q.W0(str2, new String[]{"="}, 0, 6).toArray(new String[0]);
                try {
                    if (strArr.length == 2) {
                        bundle.putString(URLDecoder.decode(strArr[0], Constants.ENCODING), URLDecoder.decode(strArr[1], Constants.ENCODING));
                    } else if (strArr.length == 1) {
                        bundle.putString(URLDecoder.decode(strArr[0], Constants.ENCODING), BuildConfig.VERSION_NAME);
                    }
                } catch (UnsupportedEncodingException unused) {
                    re.s sVar = re.s.f49201a;
                }
            }
        }
        return bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void F(Bundle bundle, JSONArray jSONArray) {
        kotlin.jvm.internal.m.f(bundle, "bundle");
        if (jSONArray instanceof boolean[]) {
            bundle.putBooleanArray("media", (boolean[]) jSONArray);
            return;
        }
        if (jSONArray instanceof double[]) {
            bundle.putDoubleArray("media", (double[]) jSONArray);
            return;
        }
        if (jSONArray instanceof int[]) {
            bundle.putIntArray("media", (int[]) jSONArray);
        } else if (jSONArray instanceof long[]) {
            bundle.putLongArray("media", (long[]) jSONArray);
        } else {
            bundle.putString("media", jSONArray.toString());
        }
    }

    public static final void G(String str, String str2, Bundle bundle) {
        if (y(str2)) {
            return;
        }
        bundle.putString(str, str2);
    }

    public static final HashMap H(Parcel parcel) {
        int i11 = parcel.readInt();
        if (i11 < 0) {
            return null;
        }
        HashMap map = new HashMap();
        for (int i12 = 0; i12 < i11; i12++) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (string != null && string2 != null) {
                map.put(string, string2);
            }
        }
        return map;
    }

    public static final String I(InputStream inputStream) {
        BufferedInputStream bufferedInputStream;
        Throwable th2;
        InputStreamReader inputStreamReader;
        try {
            bufferedInputStream = new BufferedInputStream(inputStream);
            try {
                inputStreamReader = new InputStreamReader(bufferedInputStream);
                try {
                    StringBuilder sb2 = new StringBuilder();
                    char[] cArr = new char[2048];
                    while (true) {
                        int i11 = inputStreamReader.read(cArr);
                        if (i11 == -1) {
                            String string = sb2.toString();
                            kotlin.jvm.internal.m.e(string, "{\n      bufferedInputStr…gBuilder.toString()\n    }");
                            d(bufferedInputStream);
                            d(inputStreamReader);
                            return string;
                        }
                        sb2.append(cArr, 0, i11);
                    }
                } catch (Throwable th3) {
                    th2 = th3;
                    d(bufferedInputStream);
                    d(inputStreamReader);
                    throw th2;
                }
            } catch (Throwable th4) {
                th2 = th4;
                inputStreamReader = null;
            }
        } catch (Throwable th5) {
            bufferedInputStream = null;
            th2 = th5;
            inputStreamReader = null;
        }
    }

    public static final void J(JSONObject jSONObject, Context context) throws JSONException {
        Locale locale;
        int i11;
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("a2");
        int i12 = 0;
        if (f40044b == -1 || System.currentTimeMillis() - f40044b >= 1800000) {
            f40044b = System.currentTimeMillis();
            try {
                TimeZone timeZone = TimeZone.getDefault();
                String displayName = timeZone.getDisplayName(timeZone.inDaylightTime(new Date()), 0);
                kotlin.jvm.internal.m.e(displayName, "tz.getDisplayName(tz.inD…(Date()), TimeZone.SHORT)");
                f40047e = displayName;
                String id2 = timeZone.getID();
                kotlin.jvm.internal.m.e(id2, "tz.id");
                f40048f = id2;
            } catch (AssertionError | Exception unused) {
            }
            if (f40049g.equals("NoCarrier")) {
                try {
                    Object systemService = context.getSystemService("phone");
                    kotlin.jvm.internal.m.d(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
                    String networkOperatorName = ((TelephonyManager) systemService).getNetworkOperatorName();
                    kotlin.jvm.internal.m.e(networkOperatorName, "telephonyManager.networkOperatorName");
                    f40049g = networkOperatorName;
                } catch (Exception unused2) {
                }
            }
            try {
                if ("mounted".equals(Environment.getExternalStorageState())) {
                    StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                    f40045c = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
                }
                f40045c = Math.round(f40045c / 1.073741824E9d);
            } catch (Exception unused3) {
            }
            try {
                if ("mounted".equals(Environment.getExternalStorageState())) {
                    StatFs statFs2 = new StatFs(Environment.getExternalStorageDirectory().getPath());
                    f40046d = ((long) statFs2.getAvailableBlocks()) * ((long) statFs2.getBlockSize());
                }
                f40046d = Math.round(f40046d / 1.073741824E9d);
            } catch (Exception unused4) {
            }
        }
        String packageName = context.getPackageName();
        int i13 = -1;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            if (packageInfo == null) {
                return;
            }
            i13 = packageInfo.versionCode;
            f40050h = packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException unused5) {
        }
        jSONArray.put(packageName);
        jSONArray.put(i13);
        jSONArray.put(f40050h);
        jSONArray.put(Build.VERSION.RELEASE);
        jSONArray.put(Build.MODEL);
        try {
            locale = context.getResources().getConfiguration().locale;
        } catch (Exception unused6) {
            locale = Locale.getDefault();
        }
        f40051i = locale;
        StringBuilder sb2 = new StringBuilder();
        Locale locale2 = f40051i;
        String language = locale2 != null ? locale2.getLanguage() : null;
        String str = BuildConfig.VERSION_NAME;
        if (language == null) {
            language = BuildConfig.VERSION_NAME;
        }
        sb2.append(language);
        sb2.append('_');
        Locale locale3 = f40051i;
        String country = locale3 != null ? locale3.getCountry() : null;
        if (country != null) {
            str = country;
        }
        sb2.append(str);
        jSONArray.put(sb2.toString());
        jSONArray.put(f40047e);
        jSONArray.put(f40049g);
        double d5 = 0.0d;
        try {
            Object systemService2 = context.getSystemService("display");
            DisplayManager displayManager = systemService2 instanceof DisplayManager ? (DisplayManager) systemService2 : null;
            Display display = displayManager != null ? displayManager.getDisplay(0) : null;
            if (display != null) {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                display.getMetrics(displayMetrics);
                int i14 = displayMetrics.widthPixels;
                try {
                    i12 = displayMetrics.heightPixels;
                    d5 = displayMetrics.density;
                } catch (Exception unused7) {
                }
                i11 = i12;
                i12 = i14;
            } else {
                i11 = 0;
            }
        } catch (Exception unused8) {
        }
        jSONArray.put(i12);
        jSONArray.put(i11);
        jSONArray.put(new DecimalFormat("#.##").format(d5));
        int i15 = f40043a;
        if (i15 <= 0) {
            try {
                File[] fileArrListFiles = new File("/sys/devices/system/cpu/").listFiles(new j0(2));
                if (fileArrListFiles != null) {
                    f40043a = fileArrListFiles.length;
                }
            } catch (Exception unused9) {
            }
            if (f40043a <= 0) {
                f40043a = Math.max(Runtime.getRuntime().availableProcessors(), 1);
            }
            i15 = f40043a;
        }
        jSONArray.put(i15);
        jSONArray.put(f40045c);
        jSONArray.put(f40046d);
        jSONArray.put(f40048f);
        jSONObject.put("extinfo", jSONArray.toString());
    }

    public static final String K(String str) {
        if (str == null) {
            return null;
        }
        byte[] bytes = str.getBytes(oz.a.f46133a);
        kotlin.jvm.internal.m.e(bytes, "this as java.lang.String).getBytes(charset)");
        try {
            MessageDigest hash = MessageDigest.getInstance("SHA-256");
            kotlin.jvm.internal.m.e(hash, "hash");
            hash.update(bytes);
            byte[] digest = hash.digest();
            StringBuilder sb2 = new StringBuilder();
            kotlin.jvm.internal.m.e(digest, "digest");
            for (byte b3 : digest) {
                sb2.append(Integer.toHexString((b3 >> 4) & 15));
                sb2.append(Integer.toHexString(b3 & 15));
            }
            String string = sb2.toString();
            kotlin.jvm.internal.m.e(string, "builder.toString()");
            return string;
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public static final void L(Parcel parcel, Map map) {
        if (map == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            parcel.writeString(str);
            parcel.writeString(str2);
        }
    }

    public static final Uri a(String str, String str2, Bundle bundle) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme(Constants.SCHEME);
        builder.authority(str);
        builder.path(str2);
        if (bundle != null) {
            for (String str3 : bundle.keySet()) {
                Object obj = bundle.get(str3);
                if (obj instanceof String) {
                    builder.appendQueryParameter(str3, (String) obj);
                }
            }
        }
        Uri uriBuild = builder.build();
        kotlin.jvm.internal.m.e(uriBuild, "builder.build()");
        return uriBuild;
    }

    public static void b(Context context, String str) {
        CookieSyncManager.createInstance(context).sync();
        CookieManager cookieManager = CookieManager.getInstance();
        String cookie = cookieManager.getCookie(str);
        if (cookie == null) {
            return;
        }
        for (String str2 : (String[]) oz.q.W0(cookie, new String[]{";"}, 0, 6).toArray(new String[0])) {
            String[] strArr = (String[]) oz.q.W0(str2, new String[]{"="}, 0, 6).toArray(new String[0]);
            if (strArr.length > 0) {
                StringBuilder sb2 = new StringBuilder();
                String str3 = strArr[0];
                int length = str3.length() - 1;
                int i11 = 0;
                boolean z11 = false;
                while (i11 <= length) {
                    boolean z12 = kotlin.jvm.internal.m.h(str3.charAt(!z11 ? i11 : length), 32) <= 0;
                    if (z11) {
                        if (!z12) {
                            break;
                        } else {
                            length--;
                        }
                    } else if (z12) {
                        i11++;
                    } else {
                        z11 = true;
                    }
                }
                sb2.append(str3.subSequence(i11, length + 1).toString());
                sb2.append("=;expires=Sat, 1 Jan 2000 00:00:01 UTC;");
                cookieManager.setCookie(str, sb2.toString());
            }
        }
        cookieManager.removeExpiredCookie();
    }

    public static final void c(Context context) {
        try {
            b(context, "facebook.com");
            b(context, ".facebook.com");
            b(context, "https://facebook.com");
            b(context, "https://.facebook.com");
        } catch (Exception unused) {
        }
    }

    public static final void d(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static final String e(String str) {
        return y(str) ? BuildConfig.VERSION_NAME : str;
    }

    public static final HashSet f(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        HashSet hashSet = new HashSet();
        int length = jSONArray.length();
        for (int i11 = 0; i11 < length; i11++) {
            String string = jSONArray.getString(i11);
            kotlin.jvm.internal.m.e(string, "jsonArray.getString(i)");
            hashSet.add(string);
        }
        return hashSet;
    }

    public static final ArrayList g(JSONArray jSONArray) {
        try {
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i11 = 0; i11 < length; i11++) {
                String string = jSONArray.getString(i11);
                kotlin.jvm.internal.m.e(string, "jsonArray.getString(i)");
                arrayList.add(string);
            }
            return arrayList;
        } catch (JSONException unused) {
            return new ArrayList();
        }
    }

    public static final HashMap h(JSONObject jsonObject) {
        kotlin.jvm.internal.m.f(jsonObject, "jsonObject");
        HashMap map = new HashMap();
        JSONArray jSONArrayNames = jsonObject.names();
        if (jSONArrayNames != null) {
            int length = jSONArrayNames.length();
            for (int i11 = 0; i11 < length; i11++) {
                try {
                    String string = jSONArrayNames.getString(i11);
                    kotlin.jvm.internal.m.e(string, "keys.getString(i)");
                    Object value = jsonObject.get(string);
                    if (value instanceof JSONObject) {
                        value = h((JSONObject) value);
                    }
                    kotlin.jvm.internal.m.e(value, "value");
                    map.put(string, value);
                } catch (JSONException unused) {
                }
            }
        }
        return map;
    }

    public static final HashMap i(JSONObject jSONObject) {
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String key = itKeys.next();
            String strOptString = jSONObject.optString(key);
            if (strOptString != null) {
                kotlin.jvm.internal.m.e(key, "key");
                map.put(key, strOptString);
            }
        }
        return map;
    }

    public static final int j(InputStream inputStream, OutputStream outputStream) throws Throwable {
        BufferedInputStream bufferedInputStream = null;
        try {
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(inputStream);
            try {
                byte[] bArr = new byte[OSSConstants.DEFAULT_BUFFER_SIZE];
                int i11 = 0;
                while (true) {
                    int i12 = bufferedInputStream2.read(bArr);
                    if (i12 == -1) {
                        break;
                    }
                    outputStream.write(bArr, 0, i12);
                    i11 += i12;
                }
                bufferedInputStream2.close();
                if (inputStream != null) {
                    inputStream.close();
                }
                return i11;
            } catch (Throwable th2) {
                th = th2;
                bufferedInputStream = bufferedInputStream2;
                if (bufferedInputStream != null) {
                    bufferedInputStream.close();
                }
                if (inputStream != null) {
                    inputStream.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static final void k(URLConnection uRLConnection) {
        if (uRLConnection == null || !(uRLConnection instanceof HttpURLConnection)) {
            return;
        }
        ((HttpURLConnection) uRLConnection).disconnect();
    }

    public static final String l(Context context) {
        if (context == null) {
            return "null";
        }
        return context == context.getApplicationContext() ? "unknown" : context.getClass().getSimpleName();
    }

    public static final String m(Context context) {
        try {
            re.s sVar = re.s.f49201a;
            v0.m();
            String str = re.s.f49205e;
            if (str != null) {
                return str;
            }
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            int i11 = applicationInfo.labelRes;
            if (i11 == 0) {
                return applicationInfo.nonLocalizedLabel.toString();
            }
            String string = context.getString(i11);
            kotlin.jvm.internal.m.e(string, "context.getString(stringId)");
            return string;
        } catch (Exception unused) {
            return BuildConfig.VERSION_NAME;
        }
    }

    public static final Date n(Bundle bundle, String str, Date date) {
        long jLongValue;
        if (bundle == null) {
            return null;
        }
        Object obj = bundle.get(str);
        if (obj instanceof Long) {
            jLongValue = ((Number) obj).longValue();
        } else {
            if (!(obj instanceof String)) {
                return null;
            }
            try {
                jLongValue = Long.parseLong((String) obj);
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        if (jLongValue == 0) {
            return new Date(Long.MAX_VALUE);
        }
        return new Date((jLongValue * 1000) + date.getTime());
    }

    public static final JSONObject o() {
        if (qf.a.b(j1.class)) {
            return null;
        }
        try {
            String string = re.s.a().getSharedPreferences("com.facebook.sdk.DataProcessingOptions", 0).getString("data_processing_options", null);
            if (string != null) {
                try {
                    return new JSONObject(string);
                } catch (JSONException unused) {
                }
            }
            return null;
        } catch (Throwable th2) {
            qf.a.a(j1.class, th2);
            return null;
        }
    }

    public static final void p(final String accessToken, final i1 i1Var) {
        String str;
        kotlin.jvm.internal.m.f(accessToken, "accessToken");
        ConcurrentHashMap concurrentHashMap = d1.f39993a;
        JSONObject jSONObject = (JSONObject) d1.f39993a.get(accessToken);
        if (jSONObject != null) {
            i1Var.b(jSONObject);
            return;
        }
        re.u uVar = new re.u() { // from class: lf.h1
            @Override // re.u
            public final void a(re.b0 b0Var) {
                String accessToken2 = accessToken;
                kotlin.jvm.internal.m.f(accessToken2, "$accessToken");
                JSONObject jSONObject2 = b0Var.f49126d;
                re.r rVar = b0Var.f49125c;
                i1 i1Var2 = i1Var;
                if (rVar != null) {
                    i1Var2.c(rVar.K);
                } else {
                    if (jSONObject2 == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    d1.f39993a.put(accessToken2, jSONObject2);
                    i1Var2.b(jSONObject2);
                }
            }
        };
        Bundle bundle = new Bundle();
        Date date = re.b.N;
        re.b bVarX = ns.o.x();
        if (bVarX == null || (str = bVarX.M) == null) {
            str = "facebook";
        }
        bundle.putString("fields", str.equals("instagram") ? "id,name,profile_picture" : "id,name,first_name,middle_name,last_name");
        bundle.putString("access_token", accessToken);
        re.y yVar = new re.y(null, "me", null, null, new nf.a(null, 2));
        yVar.f49231d = bundle;
        yVar.k(re.c0.GET);
        yVar.j(uVar);
        yVar.d();
    }

    public static final Method q(Class cls, String str, Class... parameterTypes) {
        kotlin.jvm.internal.m.f(parameterTypes, "parameterTypes");
        try {
            return cls.getMethod(str, (Class[]) Arrays.copyOf(parameterTypes, parameterTypes.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public static final Method r(String str, String str2, Class... clsArr) {
        try {
            return q(Class.forName(str), str2, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static final Object s(JSONObject jSONObject, String str, String str2) {
        Object objOpt = jSONObject.opt(str);
        if (objOpt != null && (objOpt instanceof String)) {
            objOpt = new JSONTokener((String) objOpt).nextValue();
        }
        if (objOpt == null || (objOpt instanceof JSONObject) || (objOpt instanceof JSONArray)) {
            return objOpt;
        }
        if (str2 == null) {
            throw new FacebookException("Got an unexpected non-JSON object.");
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.putOpt(str2, objOpt);
        return jSONObject2;
    }

    public static final Object t(Object obj, Method method, Object... objArr) {
        try {
            return method.invoke(obj, Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public static final boolean u() {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(String.format("fb%s://applinks", Arrays.copyOf(new Object[]{re.s.b()}, 1))));
            Context contextA = re.s.a();
            PackageManager packageManager = contextA.getPackageManager();
            String packageName = contextA.getPackageName();
            List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            kotlin.jvm.internal.m.e(listQueryIntentActivities, "packageManager.queryInte…nager.MATCH_DEFAULT_ONLY)");
            Iterator<ResolveInfo> it = listQueryIntentActivities.iterator();
            while (it.hasNext()) {
                if (kotlin.jvm.internal.m.a(packageName, it.next().activityInfo.packageName)) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static final boolean w() {
        if (!qf.a.b(j1.class)) {
            try {
                JSONObject jSONObjectO = o();
                if (jSONObjectO != null) {
                    try {
                        JSONArray jSONArray = jSONObjectO.getJSONArray("data_processing_options");
                        int length = jSONArray.length();
                        for (int i11 = 0; i11 < length; i11++) {
                            String string = jSONArray.getString(i11);
                            kotlin.jvm.internal.m.e(string, "options.getString(i)");
                            String lowerCase = string.toLowerCase();
                            kotlin.jvm.internal.m.e(lowerCase, "this as java.lang.String).toLowerCase()");
                            if (lowerCase.equals("ldu")) {
                                return true;
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
            } catch (Throwable th2) {
                qf.a.a(j1.class, th2);
                return false;
            }
        }
        return false;
    }

    public static boolean x(Context context) {
        Method methodR = r("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", Context.class);
        if (methodR != null) {
            Object objT = t(null, methodR, context);
            if ((objT instanceof Integer) && objT.equals(0)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean y(String str) {
        return str == null || str.length() == 0;
    }

    public static final boolean z(Uri uri) {
        if (uri != null) {
            return "http".equalsIgnoreCase(uri.getScheme()) || Constants.SCHEME.equalsIgnoreCase(uri.getScheme()) || "fbstaging".equalsIgnoreCase(uri.getScheme());
        }
        return false;
    }

    public static final boolean v(Context context) {
        kotlin.jvm.internal.m.f(context, "context");
        if (Build.VERSION.SDK_INT >= 27) {
            return context.getPackageManager().hasSystemFeature("android.hardware.type.pc");
        }
        String DEVICE = Build.DEVICE;
        if (DEVICE == null) {
            return false;
        }
        kotlin.jvm.internal.m.e(DEVICE, "DEVICE");
        Pattern patternCompile = Pattern.compile(".+_cheets|cheets_.+");
        kotlin.jvm.internal.m.e(patternCompile, PQgum.LcqukDnpiigWkpu);
        return patternCompile.matcher(DEVICE).matches();
    }
}
