package com.google.android.gms.measurement.internal;

import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import com.google.android.gms.common.internal.Preconditions;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzln implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final URL f13348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f13349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zzll f13350c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f13351d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f13352e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zzlo f13353f;

    public zzln(zzlo zzloVar, String str, URL url, byte[] bArr, HashMap map, zzll zzllVar) {
        Objects.requireNonNull(zzloVar);
        this.f13353f = zzloVar;
        Preconditions.d(str);
        this.f13348a = url;
        this.f13349b = bArr;
        this.f13350c = zzllVar;
        this.f13351d = str;
        this.f13352e = map;
    }

    public final void a(final int i11, final IOException iOException, final byte[] bArr, final Map map) {
        zzhz zzhzVar = this.f13353f.f13202a.f13100g;
        zzic.m(zzhzVar);
        zzhzVar.p(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzlm
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzln zzlnVar = this.f13343a;
                zzlnVar.f13350c.a(zzlnVar.f13351d, i11, iOException, bArr, map);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:77:0x0143  */
    /* JADX WARN: Code duplicated, block: B:87:0x0164  */
    /* JADX WARN: Code duplicated, block: B:95:0x014f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x012e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [com.google.android.gms.measurement.internal.zzln] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.Map] */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Throwable th2;
        HttpURLConnection httpURLConnection;
        ?? r9;
        IOException e8;
        ?? r11;
        InputStream inputStream;
        String str = this.f13351d;
        zzlo zzloVar = this.f13353f;
        zzic zzicVar = zzloVar.f13202a;
        zzic zzicVar2 = zzloVar.f13202a;
        zzhz zzhzVar = zzicVar.f13100g;
        zzic.m(zzhzVar);
        zzhzVar.k();
        int i11 = 0;
        ?? r12 = 0;
        ?? r13 = 0;
        try {
            URLConnection uRLConnectionOpenConnection = this.f13348a.openConnection();
            if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
                throw new IOException("Failed to obtain HTTP connection");
            }
            httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            httpURLConnection.setDefaultUseCaches(false);
            zzicVar2.getClass();
            httpURLConnection.setConnectTimeout(60000);
            httpURLConnection.setReadTimeout(61000);
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setDoInput(true);
            try {
                try {
                    Map map = this.f13352e;
                    if (map != null) {
                        for (Map.Entry entry : map.entrySet()) {
                            httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                        }
                    }
                    byte[] byteArray = this.f13349b;
                    if (byteArray != null) {
                        try {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                            gZIPOutputStream.write(byteArray);
                            gZIPOutputStream.close();
                            byteArrayOutputStream.close();
                            byteArray = byteArrayOutputStream.toByteArray();
                            zzgu zzguVar = zzicVar2.f13099f;
                            zzic.m(zzguVar);
                            zzgs zzgsVar = zzguVar.f12949n;
                            int length = byteArray.length;
                            zzgsVar.b(Integer.valueOf(length), "Uploading data. size");
                            httpURLConnection.setDoOutput(true);
                            httpURLConnection.addRequestProperty(HttpHeaders.CONTENT_ENCODING, "gzip");
                            httpURLConnection.setFixedLengthStreamingMode(length);
                            httpURLConnection.connect();
                            OutputStream outputStream = httpURLConnection.getOutputStream();
                            try {
                                outputStream.write(byteArray);
                                outputStream.close();
                            } catch (IOException e10) {
                                e8 = e10;
                                r12 = 0;
                                r11 = outputStream;
                                if (r11 != 0) {
                                    try {
                                        r11.close();
                                    } catch (IOException e11) {
                                        zzgu zzguVar2 = zzicVar2.f13099f;
                                        zzic.m(zzguVar2);
                                        zzguVar2.f12942f.c(zzgu.o(str), e11, "Error closing HTTP compressed POST connection output stream. appId");
                                    }
                                }
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                a(i11, e8, null, r12);
                            } catch (Throwable th3) {
                                th2 = th3;
                                r13 = 0;
                                r9 = outputStream;
                                if (r9 != 0) {
                                    try {
                                        r9.close();
                                    } catch (IOException e12) {
                                        zzgu zzguVar3 = zzicVar2.f13099f;
                                        zzic.m(zzguVar3);
                                        zzguVar3.f12942f.c(zzgu.o(str), e12, "Error closing HTTP compressed POST connection output stream. appId");
                                    }
                                }
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                a(i11, null, null, r13);
                                throw th2;
                            }
                        } catch (IOException e13) {
                            zzgu zzguVar4 = zzicVar2.f13099f;
                            zzic.m(zzguVar4);
                            zzguVar4.f12942f.b(e13, "Failed to gzip post request content");
                            throw e13;
                        }
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    try {
                        try {
                            Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                            try {
                                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                                inputStream = httpURLConnection.getInputStream();
                                try {
                                    byte[] bArr = new byte[1024];
                                    while (true) {
                                        int i12 = inputStream.read(bArr);
                                        if (i12 <= 0) {
                                            byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
                                            inputStream.close();
                                            httpURLConnection.disconnect();
                                            a(responseCode, null, byteArray2, headerFields);
                                            return;
                                        }
                                        byteArrayOutputStream2.write(bArr, 0, i12);
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    if (inputStream != null) {
                                        inputStream.close();
                                    }
                                    throw th;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                inputStream = null;
                            }
                        } catch (IOException e14) {
                            r12 = byteArray;
                            e8 = e14;
                            i11 = responseCode;
                            r11 = 0;
                            if (r11 != 0) {
                                r11.close();
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            a(i11, e8, null, r12);
                        } catch (Throwable th6) {
                            r13 = byteArray;
                            th2 = th6;
                            i11 = responseCode;
                            r9 = 0;
                            if (r9 != 0) {
                                r9.close();
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            a(i11, null, null, r13);
                            throw th2;
                        }
                    } catch (IOException e15) {
                        e8 = e15;
                        i11 = responseCode;
                        r11 = r12;
                        if (r11 != 0) {
                            r11.close();
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        a(i11, e8, null, r12);
                    } catch (Throwable th7) {
                        th2 = th7;
                        i11 = responseCode;
                        r9 = r12;
                        if (r9 != 0) {
                            r9.close();
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        a(i11, null, null, r13);
                        throw th2;
                    }
                } catch (Throwable th8) {
                    th2 = th8;
                }
            } catch (IOException e16) {
                e8 = e16;
            }
        } catch (IOException e17) {
            e8 = e17;
            httpURLConnection = null;
            r11 = 0;
            r12 = 0;
        } catch (Throwable th9) {
            th2 = th9;
            httpURLConnection = null;
            r9 = 0;
            r13 = 0;
        }
    }
}
