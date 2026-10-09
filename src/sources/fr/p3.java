package fr;

import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.ParcelFileDescriptor;
import androidx.datastore.core.CorruptionException;
import com.adjust.sdk.Constants;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import com.google.android.datatransport.Transformer;
import com.google.android.gms.internal.play_billing.zzji;
import com.lingo.notification.UnifiedNotificationJobService;
import com.yalantis.ucrop.view.CropImageView;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class p3 implements vt.g1, yw.b, ce.n, ce.g0, Transformer, androidx.glance.appwidget.protobuf.z, ie.f, m20.b, n5.b, re.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27778a;

    public /* synthetic */ p3(int i11) {
        this.f27778a = i11;
    }

    public static g2.j0 A(List list) {
        return new g2.j0((((long) Float.floatToRawIntBits(CropImageView.DEFAULT_ASPECT_RATIO)) << 32) | (((long) Float.floatToRawIntBits(CropImageView.DEFAULT_ASPECT_RATIO)) & 4294967295L), (((long) Float.floatToRawIntBits(CropImageView.DEFAULT_ASPECT_RATIO)) << 32) | (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) & 4294967295L), list);
    }

    public static void d(HttpURLConnection httpURLConnection, pd.h hVar, byte[] bArr) throws IOException {
        httpURLConnection.setDoOutput(true);
        if (!httpURLConnection.getRequestProperties().containsKey(HttpHeaders.CONTENT_TYPE)) {
            httpURLConnection.setRequestProperty(HttpHeaders.CONTENT_TYPE, hVar.getBodyContentType());
        }
        DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
        dataOutputStream.write(bArr);
        dataOutputStream.close();
    }

    public static ArrayList h(Map map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new pd.c((String) entry.getKey(), (String) it.next()));
                }
            }
        }
        return arrayList;
    }

    public static m00.l j(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Unexpected hex string: ".concat(str).toString());
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i11 = 0; i11 < length; i11++) {
            int i12 = i11 * 2;
            bArr[i11] = (byte) (n00.b.a(str.charAt(i12 + 1)) + (n00.b.a(str.charAt(i12)) << 4));
        }
        return new m00.l(bArr);
    }

    public static m00.l l(String str) {
        kotlin.jvm.internal.m.f(str, "<this>");
        byte[] bytes = str.getBytes(oz.a.f46133a);
        kotlin.jvm.internal.m.e(bytes, "getBytes(...)");
        m00.l lVar = new m00.l(bytes);
        lVar.f40726c = str;
        return lVar;
    }

    public static ag.c o(String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return new ag.c(httpURLConnection, 1);
    }

    public static int p(String str, String str2, boolean z11) {
        if (!z11) {
            int i11 = ew.f.f25949a;
            Locale locale = Locale.ENGLISH;
            return ew.f.i(str + "p" + str2).hashCode();
        }
        int i12 = ew.f.f25949a;
        Locale locale2 = Locale.ENGLISH;
        return ew.f.i(str + "p" + str2 + "@dir").hashCode();
    }

    public static g2.j0 q(List list) {
        return new g2.j0((((long) Float.floatToRawIntBits(CropImageView.DEFAULT_ASPECT_RATIO)) << 32) | (((long) Float.floatToRawIntBits(CropImageView.DEFAULT_ASPECT_RATIO)) & 4294967295L), (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) << 32) | (((long) Float.floatToRawIntBits(CropImageView.DEFAULT_ASPECT_RATIO)) & 4294967295L), list);
    }

    public static void r(re.d0 behavior, String tag, String string) {
        kotlin.jvm.internal.m.f(behavior, "behavior");
        kotlin.jvm.internal.m.f(tag, "tag");
        kotlin.jvm.internal.m.f(string, "string");
        t(behavior, tag, string);
    }

    public static void s(re.d0 behavior, String tag, String str, Object... objArr) {
        kotlin.jvm.internal.m.f(behavior, "behavior");
        kotlin.jvm.internal.m.f(tag, "tag");
        re.s.i(behavior);
    }

    public static void t(re.d0 behavior, String tag, String string) {
        kotlin.jvm.internal.m.f(behavior, "behavior");
        kotlin.jvm.internal.m.f(tag, "tag");
        kotlin.jvm.internal.m.f(string, "string");
        re.s.i(behavior);
    }

    public static m00.l u(byte... data) {
        kotlin.jvm.internal.m.f(data, "data");
        byte[] bArrCopyOf = Arrays.copyOf(data, data.length);
        kotlin.jvm.internal.m.e(bArrCopyOf, "copyOf(...)");
        return new m00.l(bArrCopyOf);
    }

    public static void w() {
        File[] fileArrListFiles;
        if (lf.j1.w()) {
            return;
        }
        File fileQ = ob.f.q();
        if (fileQ == null) {
            fileArrListFiles = new File[0];
        } else {
            fileArrListFiles = fileQ.listFiles(new lf.j0(5));
            if (fileArrListFiles == null) {
                fileArrListFiles = new File[0];
            }
        }
        ArrayList arrayList = new ArrayList(fileArrListFiles.length);
        for (File file : fileArrListFiles) {
            arrayList.add(o00.a.A(file));
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            if (((nf.e) obj).a()) {
                arrayList2.add(obj);
            }
        }
        List listS0 = ry.m.S0(arrayList2, new bq.h(15));
        JSONArray jSONArray = new JSONArray();
        Iterator it = hz.b.U(0, Math.min(listS0.size(), 5)).iterator();
        while (((lz.f) it).f40537c) {
            jSONArray.put(listS0.get(((ry.w) it).nextInt()));
        }
        ob.f.J("crash_reports", jSONArray, new of.b(1, listS0));
    }

    public static void x(HttpURLConnection httpURLConnection, pd.h hVar) throws IOException {
        switch (hVar.getMethod()) {
            case -1:
                byte[] postBody = hVar.getPostBody();
                if (postBody != null) {
                    httpURLConnection.setRequestMethod("POST");
                    d(httpURLConnection, hVar, postBody);
                    return;
                }
                return;
            case 0:
                httpURLConnection.setRequestMethod("GET");
                return;
            case 1:
                httpURLConnection.setRequestMethod("POST");
                byte[] body = hVar.getBody();
                if (body != null) {
                    d(httpURLConnection, hVar, body);
                    return;
                }
                return;
            case 2:
                httpURLConnection.setRequestMethod("PUT");
                byte[] body2 = hVar.getBody();
                if (body2 != null) {
                    d(httpURLConnection, hVar, body2);
                    return;
                }
                return;
            case 3:
                httpURLConnection.setRequestMethod("DELETE");
                return;
            case 4:
                httpURLConnection.setRequestMethod("HEAD");
                return;
            case 5:
                httpURLConnection.setRequestMethod("OPTIONS");
                return;
            case 6:
                httpURLConnection.setRequestMethod("TRACE");
                return;
            case 7:
                httpURLConnection.setRequestMethod("PATCH");
                byte[] body3 = hVar.getBody();
                if (body3 != null) {
                    d(httpURLConnection, hVar, body3);
                    return;
                }
                return;
            default:
                throw new IllegalStateException("Unknown method type.");
        }
    }

    @Override // com.google.android.datatransport.Transformer
    public Object apply(Object obj) {
        return ((zzji) obj).b();
    }

    @Override // re.e
    public String c() {
        return "fb_extend_sso_token";
    }

    @Override // m20.b
    public m20.a e(CharSequence charSequence, int i11, int i12) {
        char cCharAt;
        int i13 = i11 + 4;
        if (i13 >= charSequence.length() || charSequence.charAt(i11 + 1) != 'w' || charSequence.charAt(i11 + 2) != 'w' || charSequence.charAt(i11 + 3) != '.') {
            return null;
        }
        if (i11 != i12 && ((cCharAt = charSequence.charAt(i11 - 1)) == '.' || ((cCharAt >= 'A' && cCharAt <= 'Z') || ((cCharAt >= 'a' && cCharAt <= 'z') || (cCharAt >= '0' && cCharAt <= '9'))))) {
            i11 = -1;
        }
        if (i11 == -1) {
            return null;
        }
        int iN = se.k.n(charSequence, i13);
        if (iN == -1) {
            iN = -1;
        } else {
            int i14 = iN;
            while (true) {
                i14--;
                if (i14 <= i13) {
                    break;
                }
                if (charSequence.charAt(i14) != '.' || i14 <= i13) {
                }
            }
            iN = -1;
        }
        if (iN == -1) {
            return null;
        }
        return new m20.a(l20.c.WWW, i11, iN + 1);
    }

    @Override // re.e
    public String f() {
        return "oauth/access_token";
    }

    @Override // ce.g0
    public void i(MediaExtractor mediaExtractor, Object obj) throws IOException {
        mediaExtractor.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
    }

    @Override // ce.g0
    public void k(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
        mediaMetadataRetriever.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
    }

    public qd.a m(pd.h hVar, Map map) throws Throwable {
        String url = hVar.getUrl();
        HashMap map2 = new HashMap();
        map2.putAll(map);
        map2.putAll(hVar.getHeaders());
        URL url2 = new URL(url);
        HttpURLConnection httpURLConnection = (HttpURLConnection) url2.openConnection();
        httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
        int timeoutMs = hVar.getTimeoutMs();
        httpURLConnection.setConnectTimeout(timeoutMs);
        httpURLConnection.setReadTimeout(timeoutMs);
        boolean z11 = false;
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        Constants.SCHEME.equals(url2.getProtocol());
        try {
            for (String str : map2.keySet()) {
                httpURLConnection.setRequestProperty(str, (String) map2.get(str));
            }
            x(httpURLConnection, hVar);
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == -1) {
                throw new IOException("Could not retrieve response code from HttpUrlConnection.");
            }
            if (hVar.getMethod() == 4 || ((100 <= responseCode && responseCode < 200) || responseCode == 204 || responseCode == 304)) {
                qd.a aVar = new qd.a(responseCode, h(httpURLConnection.getHeaderFields()), -1, null);
                httpURLConnection.disconnect();
                return aVar;
            }
            try {
                return new qd.a(responseCode, h(httpURLConnection.getHeaderFields()), httpURLConnection.getContentLength(), new qd.e(httpURLConnection));
            } catch (Throwable th2) {
                th = th2;
                z11 = true;
                if (!z11) {
                    httpURLConnection.disconnect();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public String toString() {
        switch (this.f27778a) {
            case 2:
                return "EmptyConsumer";
            default:
                return super.toString();
        }
    }

    public synchronized void v(String accessToken) {
        kotlin.jvm.internal.m.f(accessToken, "accessToken");
        re.s.i(re.d0.INCLUDE_ACCESS_TOKENS);
        synchronized (this) {
            lf.y0.f40133e.put(accessToken, "ACCESS_TOKEN_REMOVED");
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0024  */
    /* JADX WARN: Code duplicated, block: B:20:0x0026  */
    /* JADX WARN: Code duplicated, block: B:28:0x001b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public synchronized boolean y(lf.a aVar) {
        boolean z11;
        lf.a aVar2 = null;
        if (qf.a.b(lf.a.class)) {
            if (!qf.a.b(lf.a.class)) {
                try {
                    lf.a.f39958e = aVar;
                } catch (Throwable th2) {
                    qf.a.a(lf.a.class, th2);
                }
            }
            if (aVar2 != null) {
                z11 = true;
            } else {
                z11 = false;
            }
        } else {
            try {
                aVar2 = lf.a.f39958e;
            } catch (Throwable th3) {
                qf.a.a(lf.a.class, th3);
            }
            if (!qf.a.b(lf.a.class)) {
                lf.a.f39958e = aVar;
            }
            if (aVar2 != null) {
                z11 = true;
            } else {
                z11 = false;
            }
        }
        throw th;
        return z11;
    }

    public void z(er.e notificationType, er.a aVar, UnifiedNotificationJobService unifiedNotificationJobService) {
        kotlin.jvm.internal.m.f(notificationType, "notificationType");
        er.m mVar = er.m.f25774e;
        if (mVar == null) {
            synchronized (this) {
                mVar = er.m.f25774e;
                if (mVar == null) {
                    Context applicationContext = unifiedNotificationJobService.getApplicationContext();
                    kotlin.jvm.internal.m.e(applicationContext, "getApplicationContext(...)");
                    mVar = new er.m(applicationContext);
                    er.m.f25774e = mVar;
                }
            }
        }
        try {
            ((NotificationManager) mVar.f25776b.getValue()).notify(notificationType.b(), mVar.a(notificationType, aVar));
            try {
                xt.b.d().c("jxz_receive_notification", new ar.a(aVar.f25742c, 6));
            } catch (Exception unused) {
            }
            notificationType.name();
        } catch (Exception unused2) {
            notificationType.name();
        }
    }

    public p3(w2.l1 l1Var) {
        this.f27778a = 3;
    }

    @Override // ce.n
    public void g() {
    }

    @Override // ie.f
    public void a(androidx.fragment.app.p0 p0Var) {
    }

    @Override // yw.b
    public void accept(Object obj) {
    }

    @Override // n5.b
    public Object b(CorruptionException corruptionException) throws CorruptionException {
        throw corruptionException;
    }

    @Override // ce.n
    public void n(Bitmap bitmap, wd.a aVar) {
    }
}
