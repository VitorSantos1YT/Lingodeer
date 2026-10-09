package re;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.util.Pair;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import com.facebook.FacebookException;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import fr.p3;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import lf.j1;
import lf.v0;
import lf.y0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import r.k2;
import rt.m5;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class v implements s8.g, u9.c, qe.a, ew.c, tx.a, wd.a, x7.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49222a;

    public /* synthetic */ v(int i11) {
        this.f49222a = i11;
    }

    public static boolean A(Object obj) {
        return (obj instanceof String) || (obj instanceof Boolean) || (obj instanceof Number) || (obj instanceof Date);
    }

    public static y B(b bVar, String str, u uVar) {
        return new y(bVar, str, null, null, uVar);
    }

    public static y C(b bVar, String str, JSONObject jSONObject, u uVar) {
        y yVar = new y(bVar, str, null, c0.POST, uVar);
        yVar.f49230c = jSONObject;
        return yVar;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002a  */
    public static void D(JSONObject jSONObject, String str, w wVar) {
        String strGroup;
        boolean z11;
        Matcher matcher = y.f49226k.matcher(str);
        if (matcher.matches()) {
            strGroup = matcher.group(1);
            kotlin.jvm.internal.m.e(strGroup, "matcher.group(1)");
        } else {
            strGroup = str;
        }
        if (oz.x.s0(strGroup, "me/", false) || oz.x.s0(strGroup, "/me/", false)) {
            int iI0 = oz.q.I0(str, ":", 0, false, 6);
            int iI1 = oz.q.I0(str, "?", 0, false, 6);
            if (iI0 <= 3 || (iI1 != -1 && iI0 >= iI1)) {
                z11 = false;
            } else {
                z11 = true;
            }
        } else {
            z11 = false;
        }
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String key = itKeys.next();
            Object value = jSONObject.opt(key);
            boolean z12 = z11 && oz.x.l0(key, "image", true);
            kotlin.jvm.internal.m.e(key, "key");
            kotlin.jvm.internal.m.e(value, "value");
            E(key, value, wVar, z12);
        }
    }

    public static void E(String str, Object obj, w wVar, boolean z11) {
        Class<?> cls = obj.getClass();
        if (!JSONObject.class.isAssignableFrom(cls)) {
            if (JSONArray.class.isAssignableFrom(cls)) {
                JSONArray jSONArray = (JSONArray) obj;
                int length = jSONArray.length();
                for (int i11 = 0; i11 < length; i11++) {
                    String str2 = String.format(Locale.ROOT, "%s[%d]", Arrays.copyOf(new Object[]{str, Integer.valueOf(i11)}, 2));
                    Object objOpt = jSONArray.opt(i11);
                    kotlin.jvm.internal.m.e(objOpt, "jsonArray.opt(i)");
                    E(str2, objOpt, wVar, z11);
                }
                return;
            }
            if (String.class.isAssignableFrom(cls) || Number.class.isAssignableFrom(cls) || Boolean.class.isAssignableFrom(cls)) {
                wVar.a(str, obj.toString());
                return;
            }
            if (!Date.class.isAssignableFrom(cls)) {
                String str3 = y.f49225j;
                s sVar = s.f49201a;
                return;
            } else {
                String str4 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date) obj);
                kotlin.jvm.internal.m.e(str4, "iso8601DateFormat.format(date)");
                wVar.a(str, str4);
                return;
            }
        }
        JSONObject jSONObject = (JSONObject) obj;
        if (z11) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                String str5 = String.format("%s[%s]", Arrays.copyOf(new Object[]{str, next}, 2));
                Object objOpt2 = jSONObject.opt(next);
                kotlin.jvm.internal.m.e(objOpt2, "jsonObject.opt(propertyName)");
                E(str5, objOpt2, wVar, z11);
            }
            return;
        }
        if (jSONObject.has("id")) {
            String strOptString = jSONObject.optString("id");
            kotlin.jvm.internal.m.e(strOptString, "jsonObject.optString(\"id\")");
            E(str, strOptString, wVar, z11);
        } else if (jSONObject.has("url")) {
            String strOptString2 = jSONObject.optString("url");
            kotlin.jvm.internal.m.e(strOptString2, "jsonObject.optString(\"url\")");
            E(str, strOptString2, wVar, z11);
        } else if (jSONObject.has("fbsdk:create_object")) {
            String string = jSONObject.toString();
            kotlin.jvm.internal.m.e(string, "jsonObject.toString()");
            E(str, string, wVar, z11);
        }
    }

    public static void F(a0 a0Var, y0 y0Var, int i11, URL url, FilterOutputStream filterOutputStream, boolean z11) throws Throwable {
        String strB;
        k2 k2Var = new k2();
        k2Var.f48597c = filterOutputStream;
        k2Var.f48598d = y0Var;
        k2Var.f48595a = true;
        k2Var.f48596b = z11;
        if (i11 == 1) {
            y yVar = (y) a0Var.f49113c.get(0);
            HashMap map = new HashMap();
            for (String key : yVar.f49231d.keySet()) {
                Object obj = yVar.f49231d.get(key);
                if (z(obj)) {
                    kotlin.jvm.internal.m.e(key, "key");
                    map.put(key, new t(yVar, obj));
                }
            }
            y0Var.b();
            Bundle bundle = yVar.f49231d;
            for (String key2 : bundle.keySet()) {
                Object obj2 = bundle.get(key2);
                if (A(obj2)) {
                    kotlin.jvm.internal.m.e(key2, "key");
                    k2Var.g(key2, obj2, yVar);
                }
            }
            y0Var.b();
            H(map, k2Var);
            JSONObject jSONObject = yVar.f49230c;
            if (jSONObject != null) {
                String path = url.getPath();
                kotlin.jvm.internal.m.e(path, "url.path");
                D(jSONObject, path, k2Var);
                return;
            }
            return;
        }
        a0Var.getClass();
        Iterator<E> it = a0Var.iterator();
        while (true) {
            if (it.hasNext()) {
                b bVar = ((y) it.next()).f49228a;
                if (bVar != null) {
                    strB = bVar.H;
                    break;
                }
            } else {
                String str = y.f49225j;
                strB = s.b();
                break;
            }
        }
        if (strB.length() == 0) {
            throw new FacebookException("App ID was not specified at the request or Settings.");
        }
        k2Var.a("batch_app_id", strB);
        HashMap map2 = new HashMap();
        JSONArray jSONArray = new JSONArray();
        Iterator it2 = a0Var.iterator();
        while (it2.hasNext()) {
            y yVar2 = (y) it2.next();
            yVar2.getClass();
            String str2 = y.f49225j;
            JSONObject jSONObject2 = new JSONObject();
            String strH = yVar2.h(String.format("https://graph.%s", Arrays.copyOf(new Object[]{s.f()}, 1)));
            yVar2.a();
            Uri uri = Uri.parse(yVar2.b(strH, true));
            String str3 = String.format("%s?%s", Arrays.copyOf(new Object[]{uri.getPath(), uri.getQuery()}, 2));
            jSONObject2.put("relative_url", str3);
            jSONObject2.put("method", yVar2.f49235h);
            b bVar2 = yVar2.f49228a;
            if (bVar2 != null) {
                y0.f40132d.v(bVar2.f49119e);
            }
            ArrayList arrayList = new ArrayList();
            Iterator<String> it3 = yVar2.f49231d.keySet().iterator();
            while (it3.hasNext()) {
                Object obj3 = yVar2.f49231d.get(it3.next());
                if (z(obj3)) {
                    String str4 = String.format(Locale.ROOT, "%s%d", Arrays.copyOf(new Object[]{"file", Integer.valueOf(map2.size())}, 2));
                    arrayList.add(str4);
                    map2.put(str4, new t(yVar2, obj3));
                }
            }
            if (!arrayList.isEmpty()) {
                jSONObject2.put("attached_files", TextUtils.join(",", arrayList));
            }
            JSONObject jSONObject3 = yVar2.f49230c;
            if (jSONObject3 != null) {
                ArrayList arrayList2 = new ArrayList();
                D(jSONObject3, str3, new a10.f(arrayList2));
                jSONObject2.put("body", TextUtils.join("&", arrayList2));
            }
            jSONArray.put(jSONObject2);
        }
        String string = jSONArray.toString();
        kotlin.jvm.internal.m.e(string, "requestJsonArray.toString()");
        k2Var.a("batch", string);
        y0Var.b();
        H(map2, k2Var);
    }

    public static void G(a0 requests, ArrayList arrayList) {
        kotlin.jvm.internal.m.f(requests, "requests");
        ArrayList arrayList2 = requests.f49113c;
        int size = arrayList2.size();
        ArrayList arrayList3 = new ArrayList();
        for (int i11 = 0; i11 < size; i11++) {
            y yVar = (y) arrayList2.get(i11);
            if (yVar.f49234g != null) {
                arrayList3.add(new Pair(yVar.f49234g, arrayList.get(i11)));
            }
        }
        if (arrayList3.size() > 0) {
            pb.b bVar = new pb.b(2, arrayList3, requests);
            Handler handler = requests.f49111a;
            if (handler != null) {
                handler.post(bVar);
            } else {
                bVar.run();
            }
        }
    }

    public static void H(HashMap map, k2 k2Var) throws Throwable {
        for (Map.Entry entry : map.entrySet()) {
            String str = y.f49225j;
            if (z(((t) entry.getValue()).f49221b)) {
                k2Var.g((String) entry.getKey(), ((t) entry.getValue()).f49221b, ((t) entry.getValue()).f49220a);
            }
        }
    }

    public static void I(HttpURLConnection httpURLConnection, a0 requests) throws Throwable {
        boolean z11;
        Throwable th2;
        FilterOutputStream filterOutputStream;
        int i11;
        kotlin.jvm.internal.m.f(requests, "requests");
        y0 y0Var = new y0(d0.REQUESTS);
        ArrayList arrayList = requests.f49113c;
        int size = arrayList.size();
        Iterator<E> it = requests.iterator();
        loop0: while (true) {
            z11 = false;
            i11 = 0;
            if (!it.hasNext()) {
                z11 = true;
                break;
            }
            y yVar = (y) it.next();
            Iterator<String> it2 = yVar.f49231d.keySet().iterator();
            while (it2.hasNext()) {
                if (z(yVar.f49231d.get(it2.next()))) {
                    break loop0;
                }
            }
        }
        c0 c0Var = size == 1 ? ((y) arrayList.get(0)).f49235h : null;
        if (c0Var == null) {
            c0Var = c0.POST;
        }
        httpURLConnection.setRequestMethod(c0Var.name());
        if (z11) {
            httpURLConnection.setRequestProperty(HttpHeaders.CONTENT_TYPE, "application/x-www-form-urlencoded");
            httpURLConnection.setRequestProperty(HttpHeaders.CONTENT_ENCODING, "gzip");
        } else {
            httpURLConnection.setRequestProperty(HttpHeaders.CONTENT_TYPE, String.format("multipart/form-data; boundary=%s", Arrays.copyOf(new Object[]{y.f49225j}, 1)));
        }
        URL url = httpURLConnection.getURL();
        y0Var.b();
        y0Var.a(requests.f49112b, "Id");
        kotlin.jvm.internal.m.e(url, "url");
        y0Var.a(url, "URL");
        String requestMethod = httpURLConnection.getRequestMethod();
        kotlin.jvm.internal.m.e(requestMethod, "connection.requestMethod");
        y0Var.a(requestMethod, "Method");
        String requestProperty = httpURLConnection.getRequestProperty(HttpHeaders.USER_AGENT);
        kotlin.jvm.internal.m.e(requestProperty, "connection.getRequestProperty(\"User-Agent\")");
        y0Var.a(requestProperty, HttpHeaders.USER_AGENT);
        String requestProperty2 = httpURLConnection.getRequestProperty(HttpHeaders.CONTENT_TYPE);
        kotlin.jvm.internal.m.e(requestProperty2, "connection.getRequestProperty(\"Content-Type\")");
        y0Var.a(requestProperty2, HttpHeaders.CONTENT_TYPE);
        httpURLConnection.setConnectTimeout(z11);
        httpURLConnection.setReadTimeout(z11);
        c0 c0Var2 = c0.POST;
        String str = y0Var.f40135b;
        d0 d0Var = y0Var.f40134a;
        if (c0Var != c0Var2) {
            String string = y0Var.f40136c.toString();
            kotlin.jvm.internal.m.e(string, "contents.toString()");
            p3.t(d0Var, str, string);
            y0Var.f40136c = new StringBuilder();
            return;
        }
        httpURLConnection.setDoOutput(true);
        try {
            FilterOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
            bufferedOutputStream = bufferedOutputStream;
            if (z11) {
                try {
                    bufferedOutputStream = new GZIPOutputStream(bufferedOutputStream);
                } catch (Throwable th3) {
                    th2 = th3;
                    filterOutputStream = bufferedOutputStream;
                    if (filterOutputStream == null) {
                        throw th2;
                    }
                    filterOutputStream.close();
                    throw th2;
                }
            }
            ArrayList arrayList2 = requests.f49114d;
            int size2 = arrayList2.size();
            while (i11 < size2) {
                Object obj = arrayList2.get(i11);
                i11++;
            }
            Iterator<E> it3 = requests.iterator();
            while (it3.hasNext()) {
                u uVar = ((y) it3.next()).f49234g;
            }
            F(requests, y0Var, size, url, bufferedOutputStream, z11);
            bufferedOutputStream.close();
            String string2 = y0Var.f40136c.toString();
            kotlin.jvm.internal.m.e(string2, "contents.toString()");
            p3.t(d0Var, str, string2);
            y0Var.f40136c = new StringBuilder();
        } catch (Throwable th4) {
            th2 = th4;
            filterOutputStream = null;
        }
    }

    public static String[] J(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String[] strArr = applicationInfo.splitSourceDirs;
        if (strArr == null || strArr.length == 0) {
            return new String[]{applicationInfo.sourceDir};
        }
        String[] strArr2 = new String[strArr.length + 1];
        strArr2[0] = applicationInfo.sourceDir;
        System.arraycopy(strArr, 0, strArr2, 1, strArr.length);
        return strArr2;
    }

    public static HttpURLConnection K(a0 requests) throws Throwable {
        kotlin.jvm.internal.m.f(requests, "requests");
        ArrayList arrayList = requests.f49113c;
        Iterator<E> it = requests.iterator();
        while (it.hasNext()) {
            y yVar = (y) it.next();
            if (c0.GET == yVar.f49235h && j1.y(yVar.f49231d.getString("fields"))) {
                p3 p3Var = y0.f40132d;
                d0 d0Var = d0.DEVELOPER_ERRORS;
                StringBuilder sb2 = new StringBuilder("GET requests for /");
                String str = yVar.f49229b;
                if (str == null) {
                    str = BuildConfig.VERSION_NAME;
                }
                sb2.append(str);
                sb2.append(" should contain an explicit \"fields\" parameter.");
                p3.t(d0Var, "Request", sb2.toString());
            }
        }
        try {
            URL url = arrayList.size() == 1 ? new URL(((y) arrayList.get(0)).g()) : new URL(String.format("https://graph.%s", Arrays.copyOf(new Object[]{s.f()}, 1)));
            HttpURLConnection httpURLConnectionP = null;
            try {
                httpURLConnectionP = p(url);
                I(httpURLConnectionP, requests);
                return httpURLConnectionP;
            } catch (IOException e8) {
                j1.k(httpURLConnectionP);
                throw new FacebookException("could not construct request body", e8);
            } catch (JSONException e10) {
                j1.k(httpURLConnectionP);
                throw new FacebookException("could not construct request body", e10);
            }
        } catch (MalformedURLException e11) {
            throw new FacebookException("could not construct URL for request", e11);
        }
    }

    public static final float l(float f5, float[] fArr, float[] fArr2) {
        float f11;
        float f12;
        float f13;
        float f14;
        float fAbs = Math.abs(f5);
        float fSignum = Math.signum(f5);
        int iBinarySearch = Arrays.binarySearch(fArr, fAbs);
        if (iBinarySearch >= 0) {
            return fSignum * fArr2[iBinarySearch];
        }
        int i11 = -(iBinarySearch + 1);
        int i12 = i11 - 1;
        if (i12 >= fArr.length - 1) {
            float f15 = fArr[fArr.length - 1];
            return f15 == CropImageView.DEFAULT_ASPECT_RATIO ? CropImageView.DEFAULT_ASPECT_RATIO : (fArr2[fArr.length - 1] / f15) * f5;
        }
        if (i12 == -1) {
            float f16 = fArr[0];
            f13 = fArr2[0];
            f14 = f16;
            f12 = 0.0f;
            f11 = 0.0f;
        } else {
            float f17 = fArr[i12];
            float f18 = fArr[i11];
            f11 = fArr2[i12];
            f12 = f17;
            f13 = fArr2[i11];
            f14 = f18;
        }
        return (((f13 - f11) * Math.max(CropImageView.DEFAULT_ASPECT_RATIO, Math.min(1.0f, f12 == f14 ? 0.0f : (fAbs - f12) / (f14 - f12)))) + f11) * fSignum;
    }

    public static final String m(Object obj) {
        String str = y.f49225j;
        if (obj instanceof String) {
            return (String) obj;
        }
        if ((obj instanceof Boolean) || (obj instanceof Number)) {
            return obj.toString();
        }
        if (!(obj instanceof Date)) {
            throw new IllegalArgumentException("Unsupported parameter type.");
        }
        String str2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date) obj);
        kotlin.jvm.internal.m.e(str2, "iso8601DateFormat.format(value)");
        return str2;
    }

    public static void n(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static HttpURLConnection p(URL url) throws IOException {
        URLConnection uRLConnectionOpenConnection = url.openConnection();
        kotlin.jvm.internal.m.d(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
        if (y.f49227l == null) {
            y.f49227l = String.format("%s.%s", Arrays.copyOf(new Object[]{"FBAndroidSDK", "18.1.3"}, 2));
        }
        httpURLConnection.setRequestProperty(HttpHeaders.USER_AGENT, y.f49227l);
        httpURLConnection.setRequestProperty("Accept-Language", Locale.getDefault().toString());
        httpURLConnection.setChunkedStreamingMode(0);
        return httpURLConnection;
    }

    public static ArrayList r(a0 requests) {
        Exception exc;
        HttpURLConnection httpURLConnectionK;
        ArrayList arrayListS;
        kotlin.jvm.internal.m.f(requests, "requests");
        v0.j(requests);
        HttpURLConnection httpURLConnection = null;
        try {
            httpURLConnectionK = K(requests);
            exc = null;
        } catch (Exception e8) {
            exc = e8;
            httpURLConnectionK = null;
        } catch (Throwable th2) {
            th = th2;
            j1.k(httpURLConnection);
            throw th;
        }
        try {
            if (httpURLConnectionK != null) {
                arrayListS = s(httpURLConnectionK, requests);
            } else {
                ArrayList arrayListJ = qx.b.j(requests.f49113c, null, new FacebookException(exc));
                G(requests, arrayListJ);
                arrayListS = arrayListJ;
            }
            j1.k(httpURLConnectionK);
            return arrayListS;
        } catch (Throwable th3) {
            th = th3;
            httpURLConnection = httpURLConnectionK;
            j1.k(httpURLConnection);
            throw th;
        }
    }

    public static ArrayList s(HttpURLConnection httpURLConnection, a0 requests) {
        ArrayList arrayListJ;
        kotlin.jvm.internal.m.f(requests, "requests");
        InputStream errorStream = null;
        try {
            try {
                if (!s.h()) {
                    throw new FacebookException("GraphRequest can't be used when Facebook SDK isn't fully initialized");
                }
                errorStream = httpURLConnection.getResponseCode() >= 400 ? httpURLConnection.getErrorStream() : httpURLConnection.getInputStream();
                arrayListJ = qx.b.l(errorStream, httpURLConnection, requests);
                j1.d(errorStream);
                j1.k(httpURLConnection);
                int size = requests.f49113c.size();
                if (size != arrayListJ.size()) {
                    throw new FacebookException(String.format(Locale.US, "Received %d responses while expecting %d", Arrays.copyOf(new Object[]{Integer.valueOf(arrayListJ.size()), Integer.valueOf(size)}, 2)));
                }
                G(requests, arrayListJ);
                f fVarT = f.f49141f.t();
                b bVar = fVarT.f49145c;
                if (bVar != null) {
                    long time = new Date().getTime();
                    if (bVar.f49120f.a() && time - fVarT.f49147e.getTime() > 3600000 && time - bVar.f49121t.getTime() > 86400000) {
                        if (kotlin.jvm.internal.m.a(Looper.getMainLooper(), Looper.myLooper())) {
                            fVarT.a();
                        } else {
                            new Handler(Looper.getMainLooper()).post(new lf.i0(fVarT, 8));
                        }
                    }
                }
                return arrayListJ;
            } catch (FacebookException e8) {
                p3 p3Var = y0.f40132d;
                p3.s(d0.REQUESTS, "Response", "Response <Error>: %s", e8);
                arrayListJ = qx.b.j(requests, httpURLConnection, e8);
            } catch (Exception e10) {
                p3 p3Var2 = y0.f40132d;
                p3.s(d0.REQUESTS, "Response", "Response <Error>: %s", e10);
                arrayListJ = qx.b.j(requests, httpURLConnection, new FacebookException(e10));
            }
        } catch (Throwable th2) {
            j1.d(null);
            throw th2;
        }
    }

    public static qp.b t(Context context, String[] strArr, String str) {
        String[] strArrJ = J(context);
        int length = strArrJ.length;
        int i11 = 0;
        while (true) {
            ZipFile zipFile = null;
            if (i11 >= length) {
                return null;
            }
            String str2 = strArrJ[i11];
            int i12 = 0;
            while (true) {
                int i13 = i12 + 1;
                if (i12 >= 5) {
                    break;
                }
                try {
                    zipFile = new ZipFile(new File(str2), 1);
                    break;
                } catch (IOException unused) {
                    i12 = i13;
                }
            }
            if (zipFile != null) {
                int i14 = 0;
                while (true) {
                    int i15 = i14 + 1;
                    if (i14 < 5) {
                        for (String str3 : strArr) {
                            StringBuilder sb2 = new StringBuilder("lib");
                            char c11 = File.separatorChar;
                            sb2.append(c11);
                            sb2.append(str3);
                            sb2.append(c11);
                            sb2.append(str);
                            String string = sb2.toString();
                            bq.f.j("Looking for %s in APK %s...", string, str2);
                            ZipEntry entry = zipFile.getEntry(string);
                            if (entry != null) {
                                qp.b bVar = new qp.b(13);
                                bVar.f47832b = zipFile;
                                bVar.f47833c = entry;
                                return bVar;
                            }
                        }
                        i14 = i15;
                    } else {
                        try {
                            zipFile.close();
                            break;
                        } catch (IOException unused2) {
                        }
                    }
                }
            }
            i11++;
        }
    }

    public static lf.l u(Class cls) {
        if (xf.f.class.isAssignableFrom(cls)) {
            return wf.h.SHARE_DIALOG;
        }
        if (xf.l.class.isAssignableFrom(cls)) {
            return wf.h.PHOTOS;
        }
        if (xf.p.class.isAssignableFrom(cls)) {
            return wf.h.VIDEO;
        }
        if (xf.i.class.isAssignableFrom(cls)) {
            return wf.h.MULTIMEDIA;
        }
        if (xf.c.class.isAssignableFrom(cls)) {
            return wf.a.SHARE_CAMERA_EFFECT;
        }
        if (xf.m.class.isAssignableFrom(cls)) {
            return wf.l.SHARE_STORY_ASSET;
        }
        return null;
    }

    public static String[] x(Context context, String str) {
        StringBuilder sb2 = new StringBuilder("lib");
        char c11 = File.separatorChar;
        sb2.append(c11);
        sb2.append("([^\\");
        sb2.append(c11);
        sb2.append("]*)");
        sb2.append(c11);
        sb2.append(str);
        Pattern patternCompile = Pattern.compile(sb2.toString());
        HashSet hashSet = new HashSet();
        for (String str2 : J(context)) {
            try {
                Enumeration<? extends ZipEntry> enumerationEntries = new ZipFile(new File(str2), 1).entries();
                while (enumerationEntries.hasMoreElements()) {
                    Matcher matcher = patternCompile.matcher(enumerationEntries.nextElement().getName());
                    if (matcher.matches()) {
                        hashSet.add(matcher.group(1));
                    }
                }
            } catch (IOException unused) {
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    public static boolean y(x5.b bVar, Editable editable, int i11, int i12, boolean z11) {
        int iMin;
        if (editable != null && i11 >= 0 && i12 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd) {
                if (z11) {
                    int iMax = Math.max(i11, 0);
                    int length = editable.length();
                    if (selectionStart >= 0 && length >= selectionStart && iMax >= 0) {
                        loop0: while (true) {
                            boolean z12 = false;
                            while (true) {
                                if (iMax == 0) {
                                    break loop0;
                                }
                                selectionStart--;
                                if (selectionStart < 0) {
                                    if (!z12) {
                                        selectionStart = 0;
                                        break loop0;
                                    }
                                    break loop0;
                                }
                                char cCharAt = editable.charAt(selectionStart);
                                if (z12) {
                                    if (Character.isHighSurrogate(cCharAt)) {
                                        iMax--;
                                    }
                                } else if (!Character.isSurrogate(cCharAt)) {
                                    iMax--;
                                } else if (!Character.isHighSurrogate(cCharAt)) {
                                    z12 = true;
                                }
                                selectionStart = -1;
                                break loop0;
                            }
                        }
                    }
                    selectionStart = -1;
                    break loop0;
                    int iMax2 = Math.max(i12, 0);
                    iMin = editable.length();
                    if (selectionEnd >= 0 && iMin >= selectionEnd && iMax2 >= 0) {
                        loop2: while (true) {
                            boolean z13 = false;
                            while (true) {
                                if (iMax2 != 0) {
                                    if (selectionEnd >= iMin) {
                                        if (!z13) {
                                            break loop2;
                                        }
                                        break loop2;
                                    }
                                    char cCharAt2 = editable.charAt(selectionEnd);
                                    if (z13) {
                                        if (Character.isLowSurrogate(cCharAt2)) {
                                            iMax2--;
                                            selectionEnd++;
                                        }
                                    } else if (!Character.isSurrogate(cCharAt2)) {
                                        iMax2--;
                                        selectionEnd++;
                                    } else if (!Character.isLowSurrogate(cCharAt2)) {
                                        selectionEnd++;
                                        z13 = true;
                                    }
                                    iMin = -1;
                                    break loop2;
                                }
                                iMin = selectionEnd;
                                break loop2;
                            }
                        }
                    }
                    iMin = -1;
                    break loop2;
                    if (selectionStart != -1 && iMin != -1) {
                    }
                } else {
                    selectionStart = Math.max(selectionStart - i11, 0);
                    iMin = Math.min(selectionEnd + i12, editable.length());
                }
                v5.w[] wVarArr = (v5.w[]) editable.getSpans(selectionStart, iMin, v5.w.class);
                if (wVarArr != null && wVarArr.length > 0) {
                    for (v5.w wVar : wVarArr) {
                        int spanStart = editable.getSpanStart(wVar);
                        int spanEnd = editable.getSpanEnd(wVar);
                        selectionStart = Math.min(spanStart, selectionStart);
                        iMin = Math.max(spanEnd, iMin);
                    }
                    int iMax3 = Math.max(selectionStart, 0);
                    int iMin2 = Math.min(iMin, editable.length());
                    bVar.beginBatchEdit();
                    editable.delete(iMax3, iMin2);
                    bVar.endBatchEdit();
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean z(Object obj) {
        return (obj instanceof Bitmap) || (obj instanceof byte[]) || (obj instanceof Uri) || (obj instanceof ParcelFileDescriptor) || (obj instanceof x);
    }

    @Override // wd.a
    public Bitmap a(int i11, int i12, Bitmap.Config config) {
        return Bitmap.createBitmap(i11, i12, config);
    }

    @Override // qe.a
    public Object b() {
        switch (this.f49222a) {
            case 7:
                return new vd.a0();
            default:
                try {
                    return new xd.e(MessageDigest.getInstance("SHA-256"));
                } catch (NoSuchAlgorithmException e8) {
                    throw new RuntimeException(e8);
                }
        }
    }

    public void d(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // s8.g
    public long f(x7.n nVar) {
        return -1L;
    }

    @Override // ew.c
    public vv.a g(String str) throws IOException {
        URL url = new URL(str);
        m5 m5Var = new m5(6, false);
        URLConnection uRLConnectionOpenConnection = url.openConnection();
        m5Var.f50058b = uRLConnectionOpenConnection;
        if (uRLConnectionOpenConnection instanceof HttpURLConnection) {
            ((HttpURLConnection) uRLConnectionOpenConnection).setInstanceFollowRedirects(false);
        }
        return m5Var;
    }

    @Override // s8.g
    public x7.y h() {
        return new x7.q(-9223372036854775807L);
    }

    @Override // wd.a
    public Bitmap i(int i11, int i12, Bitmap.Config config) {
        return Bitmap.createBitmap(i11, i12, config);
    }

    @Override // tx.a
    public void run() {
        Object obj = qx.f.f48467b.f48468a;
        Throwable th2 = obj instanceof gy.g ? ((gy.g) obj).f29894a : null;
        if (th2 != null) {
            th2.printStackTrace();
        }
    }

    @Override // x7.o
    public x7.e0 v(int i11, int i12) {
        return new x7.l();
    }

    public int w(int i11) {
        return i11 == 7 ? 6 : 3;
    }

    @Override // wd.a
    public void j() {
    }

    @Override // x7.o
    public void o() {
    }

    @Override // wd.a
    public void c(int i11) {
    }

    @Override // s8.g
    public void k(long j11) {
    }

    @Override // x7.o
    public void q(x7.y yVar) {
    }

    @Override // u9.c
    public void e(int i11, Object obj) {
    }
}
