package d7;

import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.HttpDataSource$HttpDataSourceException;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import b7.f0;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import com.google.common.collect.ImmutableMap;
import com.google.common.io.ByteStreams;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import ob.u;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends b {
    public final u H;
    public final u K;
    public h L;
    public HttpURLConnection M;
    public InputStream N;
    public boolean O;
    public int P;
    public long Q;
    public long R;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f23242e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f23243f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f23244t;

    public l(String str, int i11, int i12, u uVar) {
        super(true);
        this.f23244t = str;
        this.f23242e = i11;
        this.f23243f = i12;
        this.H = uVar;
        this.K = new u(5);
    }

    @Override // d7.f
    public final void close() {
        try {
            InputStream inputStream = this.N;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e8) {
                    String str = f0.f3975a;
                    throw new HttpDataSource$HttpDataSourceException(e8, 2000, 3);
                }
            }
            this.N = null;
            j();
            if (this.O) {
                this.O = false;
                e();
            }
            this.M = null;
            this.L = null;
        } catch (Throwable th2) {
            this.N = null;
            j();
            if (this.O) {
                this.O = false;
                e();
            }
            this.M = null;
            this.L = null;
            throw th2;
        }
    }

    public final void j() {
        HttpURLConnection httpURLConnection = this.M;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e8) {
                b7.a.p("Unexpected error while disconnecting", e8);
            }
        }
    }

    public final HttpURLConnection l(URL url, int i11, byte[] bArr, long j11, long j12, boolean z11, boolean z12, Map map) throws IOException {
        String string;
        String str;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f23242e);
        httpURLConnection.setReadTimeout(this.f23243f);
        HashMap map2 = new HashMap();
        u uVar = this.H;
        if (uVar != null) {
            map2.putAll(uVar.q());
        }
        map2.putAll(this.K.q());
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        Pattern pattern = n.f23248a;
        if (j11 == 0 && j12 == -1) {
            string = null;
        } else {
            StringBuilder sbJ = w4.c.j(j11, "bytes=", "-");
            if (j12 != -1) {
                sbJ.append((j11 + j12) - 1);
            }
            string = sbJ.toString();
        }
        if (string != null) {
            httpURLConnection.setRequestProperty(HttpHeaders.RANGE, string);
        }
        String str2 = this.f23244t;
        if (str2 != null) {
            httpURLConnection.setRequestProperty(HttpHeaders.USER_AGENT, str2);
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", z11 ? "gzip" : "identity");
        httpURLConnection.setInstanceFollowRedirects(z12);
        httpURLConnection.setDoOutput(bArr != null);
        int i12 = h.f23223i;
        if (i11 == 1) {
            str = "GET";
        } else if (i11 == 2) {
            str = "POST";
        } else {
            if (i11 != 3) {
                throw new IllegalStateException();
            }
            str = "HEAD";
        }
        httpURLConnection.setRequestMethod(str);
        if (bArr == null) {
            httpURLConnection.connect();
            return httpURLConnection;
        }
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        httpURLConnection.connect();
        OutputStream outputStream = httpURLConnection.getOutputStream();
        outputStream.write(bArr);
        outputStream.close();
        return httpURLConnection;
    }

    public final void o(long j11) throws IOException {
        if (j11 == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j11 > 0) {
            int iMin = (int) Math.min(j11, 4096);
            InputStream inputStream = this.N;
            String str = f0.f3975a;
            int i11 = inputStream.read(bArr, 0, iMin);
            if (Thread.currentThread().isInterrupted()) {
                throw new HttpDataSource$HttpDataSourceException(new InterruptedIOException(), 2000, 1);
            }
            if (i11 == -1) {
                throw new HttpDataSource$HttpDataSourceException();
            }
            j11 -= (long) i11;
            b(i11);
        }
    }

    @Override // d7.f
    public final Map p() {
        HttpURLConnection httpURLConnection = this.M;
        return httpURLConnection == null ? ImmutableMap.k() : new k(httpURLConnection.getHeaderFields());
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0028 A[Catch: IOException -> 0x0032, TRY_LEAVE, TryCatch #0 {IOException -> 0x0032, blocks: (B:5:0x0004, B:7:0x000d, B:10:0x0017, B:11:0x001d, B:14:0x0028), top: B:19:0x0004 }] */
    @Override // y6.h
    public final int read(byte[] bArr, int i11, int i12) throws HttpDataSource$HttpDataSourceException {
        int i13;
        if (i12 == 0) {
            return 0;
        }
        try {
            long j11 = this.Q;
            if (j11 != -1) {
                long j12 = j11 - this.R;
                if (j12 != 0) {
                    i12 = (int) Math.min(i12, j12);
                    InputStream inputStream = this.N;
                    String str = f0.f3975a;
                    i13 = inputStream.read(bArr, i11, i12);
                    if (i13 != -1) {
                        this.R += (long) i13;
                        b(i13);
                        return i13;
                    }
                }
            } else {
                InputStream inputStream2 = this.N;
                String str2 = f0.f3975a;
                i13 = inputStream2.read(bArr, i11, i12);
                if (i13 != -1) {
                    this.R += (long) i13;
                    b(i13);
                    return i13;
                }
            }
            return -1;
        } catch (IOException e8) {
            String str3 = f0.f3975a;
            throw HttpDataSource$HttpDataSourceException.a(e8, 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:38:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:39:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ef A[Catch: NumberFormatException -> 0x010e, TRY_LEAVE, TryCatch #4 {NumberFormatException -> 0x010e, blocks: (B:36:0x00c9, B:41:0x00ef), top: B:108:0x00c9 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x0126  */
    /* JADX WARN: Code duplicated, block: B:47:0x0129  */
    /* JADX WARN: Code duplicated, block: B:74:0x0181  */
    /* JADX WARN: Instruction removed from duplicated block: B:41:0x00ef, please report this as an issue */
    @Override // d7.f
    public final long u(h hVar) throws HttpDataSource$HttpDataSourceException {
        long j11;
        long jMax;
        long j12;
        Matcher matcher;
        long j13;
        this.L = hVar;
        this.R = 0L;
        this.Q = 0L;
        g();
        try {
            HttpURLConnection httpURLConnectionL = l(new URL(hVar.f23224a.toString()), hVar.f23225b, hVar.f23226c, hVar.f23228e, hVar.f23229f, (hVar.f23231h & 1) == 1, true, hVar.f23227d);
            long j14 = hVar.f23228e;
            long j15 = hVar.f23229f;
            this.M = httpURLConnectionL;
            this.P = httpURLConnectionL.getResponseCode();
            httpURLConnectionL.getResponseMessage();
            int i11 = this.P;
            long j16 = -1;
            if (i11 < 200 || i11 > 299) {
                Map<String, List<String>> headerFields = httpURLConnectionL.getHeaderFields();
                if (this.P == 416) {
                    String headerField = httpURLConnectionL.getHeaderField("Content-Range");
                    Pattern pattern = n.f23248a;
                    if (TextUtils.isEmpty(headerField)) {
                        j11 = -1;
                    } else {
                        Matcher matcher2 = n.f23249b.matcher(headerField);
                        if (matcher2.matches()) {
                            String strGroup = matcher2.group(1);
                            strGroup.getClass();
                            j11 = Long.parseLong(strGroup);
                        } else {
                            j11 = -1;
                        }
                    }
                    if (j14 == j11) {
                        this.O = true;
                        h(hVar);
                        if (j15 != -1) {
                            return j15;
                        }
                        return 0L;
                    }
                }
                InputStream errorStream = httpURLConnectionL.getErrorStream();
                try {
                    if (errorStream != null) {
                        ByteStreams.c(errorStream);
                    } else {
                        String str = f0.f3975a;
                    }
                } catch (IOException unused) {
                    String str2 = f0.f3975a;
                }
                j();
                throw new HttpDataSource$InvalidResponseCodeException(this.P, this.P == 416 ? new DataSourceException(2008) : null, headerFields);
            }
            httpURLConnectionL.getContentType();
            if (this.P != 200 || j14 == 0) {
                j14 = 0;
            }
            boolean zEqualsIgnoreCase = "gzip".equalsIgnoreCase(httpURLConnectionL.getHeaderField(HttpHeaders.CONTENT_ENCODING));
            if (zEqualsIgnoreCase || j15 != -1) {
                this.Q = j15;
            } else {
                String headerField2 = httpURLConnectionL.getHeaderField(HttpHeaders.CONTENT_LENGTH);
                String headerField3 = httpURLConnectionL.getHeaderField("Content-Range");
                Pattern pattern2 = n.f23248a;
                if (!TextUtils.isEmpty(headerField2)) {
                    try {
                        j16 = -1;
                        jMax = Long.parseLong(headerField2);
                    } catch (NumberFormatException unused2) {
                        b7.a.o("Unexpected Content-Length [" + headerField2 + "]");
                        jMax = j16;
                    }
                    if (!TextUtils.isEmpty(headerField3)) {
                        matcher = n.f23248a.matcher(headerField3);
                        if (matcher.matches()) {
                            try {
                                String strGroup2 = matcher.group(2);
                                strGroup2.getClass();
                                long j17 = Long.parseLong(strGroup2);
                                String strGroup3 = matcher.group(1);
                                strGroup3.getClass();
                                j13 = (j17 - Long.parseLong(strGroup3)) + 1;
                                if (jMax < 0) {
                                    jMax = j13;
                                } else if (jMax != j13) {
                                    b7.a.B("Inconsistent headers [" + headerField2 + "] [" + headerField3 + "]");
                                    jMax = Math.max(jMax, j13);
                                }
                            } catch (NumberFormatException unused3) {
                                b7.a.o("Unexpected Content-Range [" + headerField3 + "]");
                            }
                        }
                    }
                    if (jMax != j16) {
                        j12 = jMax - j14;
                    } else {
                        j12 = j16;
                    }
                    this.Q = j12;
                }
                jMax = j16;
                if (!TextUtils.isEmpty(headerField3)) {
                    matcher = n.f23248a.matcher(headerField3);
                    if (matcher.matches()) {
                        String strGroup4 = matcher.group(2);
                        strGroup4.getClass();
                        long j18 = Long.parseLong(strGroup4);
                        String strGroup5 = matcher.group(1);
                        strGroup5.getClass();
                        j13 = (j18 - Long.parseLong(strGroup5)) + 1;
                        if (jMax < 0) {
                            jMax = j13;
                        } else if (jMax != j13) {
                            b7.a.B("Inconsistent headers [" + headerField2 + "] [" + headerField3 + "]");
                            jMax = Math.max(jMax, j13);
                        }
                    }
                }
                if (jMax != j16) {
                    j12 = jMax - j14;
                } else {
                    j12 = j16;
                }
                this.Q = j12;
            }
            try {
                this.N = httpURLConnectionL.getInputStream();
                if (zEqualsIgnoreCase) {
                    this.N = new GZIPInputStream(this.N);
                }
                this.O = true;
                h(hVar);
                try {
                    o(j14);
                    return this.Q;
                } catch (IOException e8) {
                    j();
                    if (e8 instanceof HttpDataSource$HttpDataSourceException) {
                        throw ((HttpDataSource$HttpDataSourceException) e8);
                    }
                    throw new HttpDataSource$HttpDataSourceException(e8, 2000, 1);
                }
            } catch (IOException e10) {
                j();
                throw new HttpDataSource$HttpDataSourceException(e10, 2000, 1);
            }
        } catch (IOException e11) {
            j();
            throw HttpDataSource$HttpDataSourceException.a(e11, 1);
        }
    }

    @Override // d7.f
    public final Uri x() {
        HttpURLConnection httpURLConnection = this.M;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        h hVar = this.L;
        if (hVar != null) {
            return hVar.f23224a;
        }
        return null;
    }
}
