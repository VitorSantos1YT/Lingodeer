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
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzgy implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final URL f12961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f12962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zzgw f12963c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f12964d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f12965e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zzgz f12966f;

    public zzgy(zzgz zzgzVar, String str, URL url, byte[] bArr, Map map, zzgw zzgwVar) {
        Objects.requireNonNull(zzgzVar);
        this.f12966f = zzgzVar;
        Preconditions.d(str);
        Preconditions.g(url);
        this.f12961a = url;
        this.f12962b = bArr;
        this.f12963c = zzgwVar;
        this.f12964d = str;
        this.f12965e = map;
    }

    /* JADX WARN: Code duplicated, block: B:73:0x013c  */
    /* JADX WARN: Code duplicated, block: B:83:0x016e  */
    /* JADX WARN: Code duplicated, block: B:86:0x0127 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x0159 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x00fe: MOVE (r11 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]) (LINE:255), block:B:51:0x00fc */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x0101: MOVE (r12 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]) (LINE:258), block:B:52:0x0100 */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        HttpURLConnection httpURLConnection;
        Map map;
        IOException iOException;
        int responseCode;
        Map map2;
        Throwable th2;
        Map map3;
        Map map4;
        InputStream inputStream;
        String str = this.f12964d;
        zzgz zzgzVar = this.f12966f;
        zzic zzicVar = zzgzVar.f13202a;
        zzic zzicVar2 = zzgzVar.f13202a;
        zzhz zzhzVar = zzicVar.f13100g;
        zzic.m(zzhzVar);
        zzhzVar.k();
        int i11 = 0;
        OutputStream outputStream = null;
        try {
            URLConnection uRLConnectionOpenConnection = this.f12961a.openConnection();
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
                Map map5 = this.f12965e;
                if (map5 != null) {
                    for (Map.Entry entry : map5.entrySet()) {
                        httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                    }
                }
                byte[] bArr = this.f12962b;
                if (bArr != null) {
                    zzpk zzpkVar = zzgzVar.f13552b.f13601g;
                    zzpg.U(zzpkVar);
                    byte[] bArrQ = zzpkVar.Q(bArr);
                    zzgu zzguVar = zzicVar2.f13099f;
                    zzic.m(zzguVar);
                    zzgs zzgsVar = zzguVar.f12949n;
                    int length = bArrQ.length;
                    zzgsVar.b(Integer.valueOf(length), "Uploading data. size");
                    httpURLConnection.setDoOutput(true);
                    httpURLConnection.addRequestProperty(HttpHeaders.CONTENT_ENCODING, "gzip");
                    httpURLConnection.setFixedLengthStreamingMode(length);
                    httpURLConnection.connect();
                    OutputStream outputStream2 = httpURLConnection.getOutputStream();
                    try {
                        outputStream2.write(bArrQ);
                        outputStream2.close();
                    } catch (IOException e8) {
                        iOException = e8;
                        responseCode = 0;
                        map2 = null;
                        outputStream = outputStream2;
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (IOException e10) {
                                zzgu zzguVar2 = zzicVar2.f13099f;
                                zzic.m(zzguVar2);
                                zzguVar2.f12942f.c(zzgu.o(str), e10, "Error closing HTTP compressed POST connection output stream. appId");
                            }
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        zzhz zzhzVar2 = zzicVar2.f13100g;
                        zzic.m(zzhzVar2);
                        zzhzVar2.p(new zzgx(this.f12964d, this.f12963c, responseCode, iOException, null, map2));
                    } catch (Throwable th3) {
                        th = th3;
                        map = null;
                        outputStream = outputStream2;
                        th2 = th;
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (IOException e11) {
                                zzgu zzguVar3 = zzicVar2.f13099f;
                                zzic.m(zzguVar3);
                                zzguVar3.f12942f.c(zzgu.o(str), e11, "Error closing HTTP compressed POST connection output stream. appId");
                            }
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        zzhz zzhzVar3 = zzicVar2.f13100g;
                        zzic.m(zzhzVar3);
                        zzhzVar3.p(new zzgx(this.f12964d, this.f12963c, i11, null, null, map));
                        throw th2;
                    }
                }
                responseCode = httpURLConnection.getResponseCode();
                try {
                    try {
                        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                        try {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            inputStream = httpURLConnection.getInputStream();
                            try {
                                byte[] bArr2 = new byte[1024];
                                while (true) {
                                    int i12 = inputStream.read(bArr2);
                                    if (i12 <= 0) {
                                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                                        inputStream.close();
                                        httpURLConnection.disconnect();
                                        zzhz zzhzVar4 = zzicVar2.f13100g;
                                        zzic.m(zzhzVar4);
                                        zzhzVar4.p(new zzgx(this.f12964d, this.f12963c, responseCode, null, byteArray, headerFields));
                                        return;
                                    }
                                    byteArrayOutputStream.write(bArr2, 0, i12);
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
                    } catch (IOException e12) {
                        e = e12;
                        map2 = null;
                        iOException = e;
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        zzhz zzhzVar5 = zzicVar2.f13100g;
                        zzic.m(zzhzVar5);
                        zzhzVar5.p(new zzgx(this.f12964d, this.f12963c, responseCode, iOException, null, map2));
                    } catch (Throwable th6) {
                        th2 = th6;
                        map = null;
                        i11 = responseCode;
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        zzhz zzhzVar6 = zzicVar2.f13100g;
                        zzic.m(zzhzVar6);
                        zzhzVar6.p(new zzgx(this.f12964d, this.f12963c, i11, null, null, map));
                        throw th2;
                    }
                } catch (IOException e13) {
                    e = e13;
                    map2 = map4;
                    iOException = e;
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    zzhz zzhzVar7 = zzicVar2.f13100g;
                    zzic.m(zzhzVar7);
                    zzhzVar7.p(new zzgx(this.f12964d, this.f12963c, responseCode, iOException, null, map2));
                } catch (Throwable th7) {
                    th2 = th7;
                    i11 = responseCode;
                    map = map3;
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    zzhz zzhzVar8 = zzicVar2.f13100g;
                    zzic.m(zzhzVar8);
                    zzhzVar8.p(new zzgx(this.f12964d, this.f12963c, i11, null, null, map));
                    throw th2;
                }
            } catch (IOException e14) {
                iOException = e14;
                responseCode = 0;
                map2 = null;
            } catch (Throwable th8) {
                th = th8;
                map = null;
            }
        } catch (IOException e15) {
            iOException = e15;
            responseCode = 0;
            httpURLConnection = null;
            map2 = null;
        } catch (Throwable th9) {
            th = th9;
            httpURLConnection = null;
            map = null;
        }
    }
}
