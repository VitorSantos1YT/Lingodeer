package xv;

import android.os.SystemClock;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import com.liulishuo.filedownloader.exception.FileDownloadGiveUpRetryException;
import com.liulishuo.filedownloader.exception.FileDownloadNetworkPolicyException;
import hh.p0;
import java.io.BufferedOutputStream;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import nv.p;
import okhttp3.internal.platform.ZjS.OYAvlbfUyD;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f56617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f56618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f56619c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g f56620d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final vv.a f56621e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f56622f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f56623g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f56624h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f56625i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f56626j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f56627k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public xq.c f56628l;
    public volatile boolean m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public volatile long f56630o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public volatile long f56631p = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final wv.a f56629n = c.f56595a.b();

    public i(vv.a aVar, b bVar, g gVar, int i11, int i12, boolean z11, f fVar, String str) {
        this.f56617a = fVar;
        this.f56626j = str;
        this.f56621e = aVar;
        this.f56622f = z11;
        this.f56620d = gVar;
        this.f56619c = i12;
        this.f56618b = i11;
        this.f56623g = bVar.f56589a;
        this.f56624h = bVar.f56591c;
        this.f56627k = bVar.f56590b;
        this.f56625i = bVar.f56592d;
    }

    public final void b() {
        SystemClock.uptimeMillis();
        try {
            xq.c cVar = this.f56628l;
            ((BufferedOutputStream) cVar.f56174b).flush();
            ((FileDescriptor) cVar.f56175c).sync();
            int i11 = this.f56619c;
            if (i11 >= 0) {
                int i12 = this.f56618b;
                this.f56629n.g(this.f56627k, i12, i11);
            } else {
                f fVar = this.f56617a;
                wv.a aVar = fVar.f56601f;
                bw.c cVar2 = fVar.f56597b;
                aVar.n(cVar2.f6390a, cVar2.f6396t.get());
            }
        } catch (IOException unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x008b  */
    public final void a() throws Throwable {
        long j11;
        Throwable th2;
        xq.c cVarA;
        String strI;
        long j12;
        if (this.m) {
            return;
        }
        vv.a aVar = this.f56621e;
        int i11 = ew.f.f25949a;
        String strK = aVar.k(HttpHeaders.CONTENT_LENGTH);
        long j13 = -1;
        if (strK == null) {
            j11 = -1;
        } else {
            try {
                j11 = Long.parseLong(strK);
            } catch (NumberFormatException unused) {
                j11 = -1;
            }
        }
        String strK2 = aVar.k("Transfer-Encoding");
        long j14 = 0;
        if (j11 < 0) {
            if ((strK2 == null || !strK2.equals("chunked")) && !ew.d.f25940a.f25943c) {
                throw new FileDownloadGiveUpRetryException("can't know the size of the download file, and its Transfer-Encoding is not Chunked either.\nyou can ignore such exception by add http.lenient=true to the filedownloader.properties");
            }
            j11 = -1;
        }
        int i12 = 6;
        int i13 = 0;
        if (j11 == -1) {
            String strK3 = this.f56621e.k("Content-Range");
            if (strK3 == null || strK3.length() == 0) {
                j12 = -1;
            } else {
                try {
                    Matcher matcher = Pattern.compile("bytes (\\d+)-(\\d+)/\\d+").matcher(strK3);
                    if (matcher.find()) {
                        j12 = (Long.parseLong(matcher.group(2)) - Long.parseLong(matcher.group(1))) + 1;
                    } else {
                        j12 = -1;
                    }
                } catch (Exception e8) {
                    o00.a.B(6, ew.f.class, e8, "parse content length from content range error", new Object[0]);
                }
            }
            j11 = j12 < 0 ? -1L : j12;
        }
        if (j11 == 0) {
            int i14 = this.f56618b;
            int i15 = this.f56619c;
            Locale locale = Locale.ENGLISH;
            throw new FileDownloadGiveUpRetryException(p0.l("there isn't any content need to download on ", i14, "-", i15, " with the content-length is 0"));
        }
        long j15 = this.f56625i;
        if (j15 > 0 && j11 != j15) {
            long j16 = this.f56624h;
            if (j16 == -1) {
                long j17 = this.f56627k;
                Locale locale2 = Locale.ENGLISH;
                strI = p.m(j17, "range[", "-)");
            } else {
                long j18 = this.f56627k;
                Locale locale3 = Locale.ENGLISH;
                strI = defpackage.e.i(j16, ")", w4.c.j(j18, "range[", "-"));
            }
            long j19 = this.f56625i;
            int i16 = this.f56618b;
            int i17 = this.f56619c;
            Locale locale4 = Locale.ENGLISH;
            StringBuilder sbM = com.google.android.material.datepicker.d.m(j19, "require ", strI, " with contentLength(");
            ep.a.y(j11, "), but the backend response contentLength is ", " on downloadId[", sbM);
            sbM.append(i16);
            sbM.append("]-connectionIndex[");
            sbM.append(i17);
            sbM.append("], please ask your backend dev to fix such problem.");
            throw new FileDownloadGiveUpRetryException(sbM.toString());
        }
        long j21 = this.f56627k;
        InputStream inputStream = null;
        try {
            c.f56595a.f().getClass();
            cVarA = ew.f.a(this.f56626j);
            try {
                this.f56628l = cVarA;
                ((RandomAccessFile) cVarA.f56176d).seek(this.f56627k);
                InputStream inputStreamE = this.f56621e.e();
                try {
                    byte[] bArr = new byte[4096];
                    if (this.m) {
                        if (inputStreamE != null) {
                            try {
                                inputStreamE.close();
                            } catch (IOException e10) {
                                e10.printStackTrace();
                            }
                        }
                        try {
                            b();
                        } finally {
                            try {
                                cVarA.o();
                            } catch (IOException e11) {
                                e11.printStackTrace();
                            }
                        }
                    } else {
                        while (true) {
                            int i18 = inputStreamE.read(bArr);
                            long j22 = j13;
                            if (i18 == -1) {
                                try {
                                    inputStreamE.close();
                                } catch (IOException e12) {
                                    e12.printStackTrace();
                                }
                                try {
                                    b();
                                    try {
                                        cVarA.o();
                                    } catch (IOException e13) {
                                        e13.printStackTrace();
                                    }
                                    long j23 = this.f56627k - j21;
                                    if (j11 != j22 && j11 != j23) {
                                        long j24 = this.f56623g;
                                        long j25 = this.f56624h;
                                        long j26 = this.f56627k;
                                        Locale locale5 = Locale.ENGLISH;
                                        StringBuilder sbJ = w4.c.j(j23, "fetched length[", "] != content length[");
                                        sbJ.append(j11);
                                        ep.a.y(j24, OYAvlbfUyD.bvonSBeV, ", ", sbJ);
                                        sbJ.append(j25);
                                        ep.a.y(j26, ") offset[", "] fetch begin offset[", sbJ);
                                        throw new FileDownloadGiveUpRetryException(defpackage.e.i(j21, "]", sbJ));
                                    }
                                    f fVar = this.f56617a;
                                    g gVar = this.f56620d;
                                    long j27 = this.f56623g;
                                    long j28 = this.f56624h;
                                    if (fVar.U) {
                                        return;
                                    }
                                    if (!fVar.P) {
                                        synchronized (fVar.N) {
                                            fVar.N.remove(gVar);
                                        }
                                        return;
                                    } else {
                                        if (j27 == j14 || j28 == fVar.f56597b.H) {
                                            return;
                                        }
                                        o00.a.B(i12, fVar, null, "the single task not completed corrected(%d, %d != %d) for task(%d)", Long.valueOf(j27), Long.valueOf(j28), Long.valueOf(fVar.f56597b.H), Integer.valueOf(fVar.f56597b.f6390a));
                                        return;
                                    }
                                } catch (Throwable th3) {
                                    try {
                                        cVarA.o();
                                        throw th3;
                                    } catch (IOException e14) {
                                        e14.printStackTrace();
                                        throw th3;
                                    }
                                }
                            }
                            ((BufferedOutputStream) cVarA.f56174b).write(bArr, i13, i18);
                            long j29 = i18;
                            this.f56627k += j29;
                            this.f56617a.k(j29);
                            long jElapsedRealtime = SystemClock.elapsedRealtime();
                            long j30 = j21;
                            long j31 = this.f56627k - this.f56630o;
                            long j32 = jElapsedRealtime - this.f56631p;
                            long j33 = j11;
                            if (j31 > ew.f.f25949a && j32 > ew.f.f25950b) {
                                b();
                                this.f56630o = this.f56627k;
                                this.f56631p = jElapsedRealtime;
                            }
                            if (this.m) {
                                try {
                                    inputStreamE.close();
                                } catch (IOException e15) {
                                    e15.printStackTrace();
                                }
                                try {
                                    b();
                                    break;
                                } finally {
                                    try {
                                        cVarA.o();
                                    } catch (IOException e16) {
                                        e16.printStackTrace();
                                    }
                                }
                            }
                            if (this.f56622f && ew.f.g()) {
                                throw new FileDownloadNetworkPolicyException();
                            }
                            j13 = j22;
                            j21 = j30;
                            j11 = j33;
                            i12 = 6;
                            j14 = 0;
                            i13 = 0;
                        }
                    }
                } catch (Throwable th4) {
                    th2 = th4;
                    inputStream = inputStreamE;
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException e17) {
                            e17.printStackTrace();
                        }
                    }
                    if (cVarA != null) {
                        try {
                            b();
                        } catch (Throwable th5) {
                            try {
                                cVarA.o();
                                throw th5;
                            } catch (IOException e18) {
                                e18.printStackTrace();
                                throw th5;
                            }
                        }
                    }
                    if (cVarA == null) {
                        throw th2;
                    }
                    try {
                        cVarA.o();
                        throw th2;
                    } catch (IOException e19) {
                        e19.printStackTrace();
                        throw th2;
                    }
                }
            } catch (Throwable th6) {
                th2 = th6;
            }
        } catch (Throwable th7) {
            th2 = th7;
            cVarA = null;
        }
    }
}
