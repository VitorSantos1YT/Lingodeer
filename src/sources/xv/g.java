package xv;

import android.os.Process;
import androidx.lifecycle.lifecycle.viewmodel.anchor.hIIS.scqhIrGXy;
import com.liulishuo.filedownloader.exception.FileDownloadGiveUpRetryException;
import java.io.IOException;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class g implements Runnable {
    public final int H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f56603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f56604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f56605c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f56606d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public i f56607e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f56608f = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f56609t;

    public g(int i11, int i12, a aVar, f fVar, boolean z11, String str) {
        this.f56609t = i11;
        this.H = i12;
        this.f56604b = fVar;
        this.f56605c = str;
        this.f56603a = aVar;
        this.f56606d = z11;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0011 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:103:0x010e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:104:0x00f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:105:? A[LOOP:1: B:65:0x00eb->B:105:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b6 A[Catch: all -> 0x005c, TryCatch #11 {all -> 0x005c, blocks: (B:3:0x0011, B:7:0x001c, B:12:0x002f, B:13:0x005b, B:25:0x0069, B:29:0x0071, B:32:0x0083, B:34:0x0091, B:43:0x009f, B:44:0x00a4, B:52:0x00ac, B:55:0x00b6, B:57:0x00ba, B:60:0x00cc, B:62:0x00d0, B:64:0x00de, B:66:0x00ed, B:68:0x00f9, B:76:0x0113, B:78:0x011d, B:79:0x0125, B:70:0x00fd, B:72:0x0107, B:80:0x0139, B:83:0x0145), top: B:90:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x00d0 A[Catch: all -> 0x005c, TryCatch #11 {all -> 0x005c, blocks: (B:3:0x0011, B:7:0x001c, B:12:0x002f, B:13:0x005b, B:25:0x0069, B:29:0x0071, B:32:0x0083, B:34:0x0091, B:43:0x009f, B:44:0x00a4, B:52:0x00ac, B:55:0x00b6, B:57:0x00ba, B:60:0x00cc, B:62:0x00d0, B:64:0x00de, B:66:0x00ed, B:68:0x00f9, B:76:0x0113, B:78:0x011d, B:79:0x0125, B:70:0x00fd, B:72:0x0107, B:80:0x0139, B:83:0x0145), top: B:90:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x00de A[Catch: all -> 0x005c, TryCatch #11 {all -> 0x005c, blocks: (B:3:0x0011, B:7:0x001c, B:12:0x002f, B:13:0x005b, B:25:0x0069, B:29:0x0071, B:32:0x0083, B:34:0x0091, B:43:0x009f, B:44:0x00a4, B:52:0x00ac, B:55:0x00b6, B:57:0x00ba, B:60:0x00cc, B:62:0x00d0, B:64:0x00de, B:66:0x00ed, B:68:0x00f9, B:76:0x0113, B:78:0x011d, B:79:0x0125, B:70:0x00fd, B:72:0x0107, B:80:0x0139, B:83:0x0145), top: B:90:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x00ed A[Catch: all -> 0x005c, TryCatch #11 {all -> 0x005c, blocks: (B:3:0x0011, B:7:0x001c, B:12:0x002f, B:13:0x005b, B:25:0x0069, B:29:0x0071, B:32:0x0083, B:34:0x0091, B:43:0x009f, B:44:0x00a4, B:52:0x00ac, B:55:0x00b6, B:57:0x00ba, B:60:0x00cc, B:62:0x00d0, B:64:0x00de, B:66:0x00ed, B:68:0x00f9, B:76:0x0113, B:78:0x011d, B:79:0x0125, B:70:0x00fd, B:72:0x0107, B:80:0x0139, B:83:0x0145), top: B:90:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x00fd A[Catch: all -> 0x005c, TryCatch #11 {all -> 0x005c, blocks: (B:3:0x0011, B:7:0x001c, B:12:0x002f, B:13:0x005b, B:25:0x0069, B:29:0x0071, B:32:0x0083, B:34:0x0091, B:43:0x009f, B:44:0x00a4, B:52:0x00ac, B:55:0x00b6, B:57:0x00ba, B:60:0x00cc, B:62:0x00d0, B:64:0x00de, B:66:0x00ed, B:68:0x00f9, B:76:0x0113, B:78:0x011d, B:79:0x0125, B:70:0x00fd, B:72:0x0107, B:80:0x0139, B:83:0x0145), top: B:90:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x0107 A[Catch: all -> 0x005c, TryCatch #11 {all -> 0x005c, blocks: (B:3:0x0011, B:7:0x001c, B:12:0x002f, B:13:0x005b, B:25:0x0069, B:29:0x0071, B:32:0x0083, B:34:0x0091, B:43:0x009f, B:44:0x00a4, B:52:0x00ac, B:55:0x00b6, B:57:0x00ba, B:60:0x00cc, B:62:0x00d0, B:64:0x00de, B:66:0x00ed, B:68:0x00f9, B:76:0x0113, B:78:0x011d, B:79:0x0125, B:70:0x00fd, B:72:0x0107, B:80:0x0139, B:83:0x0145), top: B:90:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x010e  */
    /* JADX WARN: Code duplicated, block: B:76:0x0113 A[Catch: all -> 0x005c, TryCatch #11 {all -> 0x005c, blocks: (B:3:0x0011, B:7:0x001c, B:12:0x002f, B:13:0x005b, B:25:0x0069, B:29:0x0071, B:32:0x0083, B:34:0x0091, B:43:0x009f, B:44:0x00a4, B:52:0x00ac, B:55:0x00b6, B:57:0x00ba, B:60:0x00cc, B:62:0x00d0, B:64:0x00de, B:66:0x00ed, B:68:0x00f9, B:76:0x0113, B:78:0x011d, B:79:0x0125, B:70:0x00fd, B:72:0x0107, B:80:0x0139, B:83:0x0145), top: B:90:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x011d A[Catch: all -> 0x005c, TryCatch #11 {all -> 0x005c, blocks: (B:3:0x0011, B:7:0x001c, B:12:0x002f, B:13:0x005b, B:25:0x0069, B:29:0x0071, B:32:0x0083, B:34:0x0091, B:43:0x009f, B:44:0x00a4, B:52:0x00ac, B:55:0x00b6, B:57:0x00ba, B:60:0x00cc, B:62:0x00d0, B:64:0x00de, B:66:0x00ed, B:68:0x00f9, B:76:0x0113, B:78:0x011d, B:79:0x0125, B:70:0x00fd, B:72:0x0107, B:80:0x0139, B:83:0x0145), top: B:90:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x0125 A[Catch: all -> 0x005c, TryCatch #11 {all -> 0x005c, blocks: (B:3:0x0011, B:7:0x001c, B:12:0x002f, B:13:0x005b, B:25:0x0069, B:29:0x0071, B:32:0x0083, B:34:0x0091, B:43:0x009f, B:44:0x00a4, B:52:0x00ac, B:55:0x00b6, B:57:0x00ba, B:60:0x00cc, B:62:0x00d0, B:64:0x00de, B:66:0x00ed, B:68:0x00f9, B:76:0x0113, B:78:0x011d, B:79:0x0125, B:70:0x00fd, B:72:0x0107, B:80:0x0139, B:83:0x0145), top: B:90:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x0145 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x0140 A[SYNTHETIC] */
    @Override // java.lang.Runnable
    public final void run() {
        int i11;
        wv.a aVarB;
        int i12;
        bw.c cVarR;
        long j11;
        long j12;
        a aVar;
        b bVar;
        long j13;
        ArrayList arrayListQ;
        int size;
        int i13;
        bw.a aVar2;
        Process.setThreadPriority(10);
        long j14 = this.f56603a.f56585d.f56590b;
        vv.a aVarA = null;
        boolean z11 = false;
        while (!this.f56608f) {
            try {
                try {
                    try {
                        aVarA = this.f56603a.a();
                        int i14 = aVarA.i();
                        if (i14 != 206 && i14 != 200) {
                            String str = scqhIrGXy.oGaSGv;
                            Object[] objArr = {this.f56603a.f56587f, aVarA.f(), Integer.valueOf(i14), Integer.valueOf(this.f56609t), Integer.valueOf(this.H)};
                            int i15 = ew.f.f25949a;
                            throw new SocketException(String.format(Locale.ENGLISH, str, objArr));
                        }
                        try {
                            if (this.f56608f) {
                                aVarA.l();
                                return;
                            }
                            int i16 = this.f56609t;
                            int i17 = this.H;
                            f fVar = this.f56604b;
                            boolean z12 = this.f56606d;
                            b bVar2 = this.f56603a.f56585d;
                            String str2 = this.f56605c;
                            if (bVar2 == null || str2 == null) {
                                throw new IllegalArgumentException();
                            }
                            i iVar = new i(aVarA, bVar2, this, i16, i17, z12, fVar, str2);
                            this.f56607e = iVar;
                            iVar.a();
                            if (this.f56608f) {
                                this.f56607e.m = true;
                            }
                            aVarA.l();
                        } catch (FileDownloadGiveUpRetryException e8) {
                            e = e8;
                            z11 = true;
                            if (!this.f56604b.i(e)) {
                                this.f56604b.j(e);
                                if (aVarA == null) {
                                    return;
                                }
                            } else if (z11 || this.f56607e != null) {
                                if (this.f56607e != null) {
                                    i11 = this.f56609t;
                                    aVarB = c.f56595a.b();
                                    i12 = this.H;
                                    if (i12 >= 0) {
                                        arrayListQ = ((wv.b) aVarB).f55479a.q(i11);
                                        size = arrayListQ.size();
                                        i13 = 0;
                                        while (true) {
                                            if (i13 < size) {
                                                Object obj = arrayListQ.get(i13);
                                                i13++;
                                                aVar2 = (bw.a) obj;
                                                if (aVar2.f6385b == i12) {
                                                    j11 = aVar2.f6387d;
                                                    j12 = j11;
                                                }
                                            } else {
                                                j12 = 0;
                                            }
                                        }
                                    } else {
                                        cVarR = ((wv.b) aVarB).f55479a.r(i11);
                                        if (cVarR != null) {
                                            j11 = cVarR.f6396t.get();
                                            j12 = j11;
                                        } else {
                                            j12 = 0;
                                        }
                                    }
                                    if (j12 > 0) {
                                        aVar = this.f56603a;
                                        bVar = aVar.f56585d;
                                        j13 = bVar.f56590b;
                                        if (j12 == j13) {
                                            o00.a.P(aVar, "no data download, no need to update", new Object[0]);
                                        } else {
                                            aVar.f56585d = new b(bVar.f56589a, j12, bVar.f56591c, bVar.f56592d - (j12 - j13), false);
                                        }
                                    }
                                }
                                this.f56604b.l(e);
                                if (aVarA != null) {
                                    aVarA.l();
                                }
                            } else {
                                o00.a.P(this, "it is valid to retry and connection is valid but create fetch-data-task failed, so give up directly with %s", e);
                                this.f56604b.j(e);
                                if (aVarA == null) {
                                    return;
                                }
                            }
                        } catch (IOException e10) {
                            e = e10;
                            z11 = true;
                            if (!this.f56604b.i(e)) {
                                if (z11) {
                                }
                                if (this.f56607e != null) {
                                    i11 = this.f56609t;
                                    aVarB = c.f56595a.b();
                                    i12 = this.H;
                                    if (i12 >= 0) {
                                        arrayListQ = ((wv.b) aVarB).f55479a.q(i11);
                                        size = arrayListQ.size();
                                        i13 = 0;
                                        while (true) {
                                            if (i13 < size) {
                                                Object obj2 = arrayListQ.get(i13);
                                                i13++;
                                                aVar2 = (bw.a) obj2;
                                                if (aVar2.f6385b == i12) {
                                                    j11 = aVar2.f6387d;
                                                    j12 = j11;
                                                }
                                            } else {
                                                j12 = 0;
                                            }
                                        }
                                    } else {
                                        cVarR = ((wv.b) aVarB).f55479a.r(i11);
                                        if (cVarR != null) {
                                            j11 = cVarR.f6396t.get();
                                            j12 = j11;
                                        } else {
                                            j12 = 0;
                                        }
                                    }
                                    if (j12 > 0) {
                                        aVar = this.f56603a;
                                        bVar = aVar.f56585d;
                                        j13 = bVar.f56590b;
                                        if (j12 == j13) {
                                            o00.a.P(aVar, "no data download, no need to update", new Object[0]);
                                        } else {
                                            aVar.f56585d = new b(bVar.f56589a, j12, bVar.f56591c, bVar.f56592d - (j12 - j13), false);
                                        }
                                    }
                                }
                                this.f56604b.l(e);
                                if (aVarA != null) {
                                    aVarA.l();
                                }
                            } else {
                                this.f56604b.j(e);
                                if (aVarA == null) {
                                    return;
                                }
                            }
                        } catch (IllegalAccessException e11) {
                            e = e11;
                            z11 = true;
                            if (!this.f56604b.i(e)) {
                                if (z11) {
                                }
                                if (this.f56607e != null) {
                                    i11 = this.f56609t;
                                    aVarB = c.f56595a.b();
                                    i12 = this.H;
                                    if (i12 >= 0) {
                                        arrayListQ = ((wv.b) aVarB).f55479a.q(i11);
                                        size = arrayListQ.size();
                                        i13 = 0;
                                        while (true) {
                                            if (i13 < size) {
                                                Object obj3 = arrayListQ.get(i13);
                                                i13++;
                                                aVar2 = (bw.a) obj3;
                                                if (aVar2.f6385b == i12) {
                                                    j11 = aVar2.f6387d;
                                                    j12 = j11;
                                                }
                                            } else {
                                                j12 = 0;
                                            }
                                        }
                                    } else {
                                        cVarR = ((wv.b) aVarB).f55479a.r(i11);
                                        if (cVarR != null) {
                                            j11 = cVarR.f6396t.get();
                                            j12 = j11;
                                        } else {
                                            j12 = 0;
                                        }
                                    }
                                    if (j12 > 0) {
                                        aVar = this.f56603a;
                                        bVar = aVar.f56585d;
                                        j13 = bVar.f56590b;
                                        if (j12 == j13) {
                                            o00.a.P(aVar, "no data download, no need to update", new Object[0]);
                                        } else {
                                            aVar.f56585d = new b(bVar.f56589a, j12, bVar.f56591c, bVar.f56592d - (j12 - j13), false);
                                        }
                                    }
                                }
                                this.f56604b.l(e);
                                if (aVarA != null) {
                                    aVarA.l();
                                }
                            } else {
                                this.f56604b.j(e);
                                if (aVarA == null) {
                                    return;
                                }
                            }
                        } catch (IllegalArgumentException e12) {
                            e = e12;
                            z11 = true;
                            if (!this.f56604b.i(e)) {
                                if (z11) {
                                }
                                if (this.f56607e != null) {
                                    i11 = this.f56609t;
                                    aVarB = c.f56595a.b();
                                    i12 = this.H;
                                    if (i12 >= 0) {
                                        arrayListQ = ((wv.b) aVarB).f55479a.q(i11);
                                        size = arrayListQ.size();
                                        i13 = 0;
                                        while (true) {
                                            if (i13 < size) {
                                                Object obj4 = arrayListQ.get(i13);
                                                i13++;
                                                aVar2 = (bw.a) obj4;
                                                if (aVar2.f6385b == i12) {
                                                    j11 = aVar2.f6387d;
                                                    j12 = j11;
                                                }
                                            } else {
                                                j12 = 0;
                                            }
                                        }
                                    } else {
                                        cVarR = ((wv.b) aVarB).f55479a.r(i11);
                                        if (cVarR != null) {
                                            j11 = cVarR.f6396t.get();
                                            j12 = j11;
                                        } else {
                                            j12 = 0;
                                        }
                                    }
                                    if (j12 > 0) {
                                        aVar = this.f56603a;
                                        bVar = aVar.f56585d;
                                        j13 = bVar.f56590b;
                                        if (j12 == j13) {
                                            o00.a.P(aVar, "no data download, no need to update", new Object[0]);
                                        } else {
                                            aVar.f56585d = new b(bVar.f56589a, j12, bVar.f56591c, bVar.f56592d - (j12 - j13), false);
                                        }
                                    }
                                }
                                this.f56604b.l(e);
                                if (aVarA != null) {
                                    aVarA.l();
                                }
                            } else {
                                this.f56604b.j(e);
                                if (aVarA == null) {
                                    return;
                                }
                            }
                        }
                    } catch (FileDownloadGiveUpRetryException | IOException | IllegalAccessException | IllegalArgumentException e13) {
                        e = e13;
                        z11 = false;
                    }
                } catch (Throwable th2) {
                    if (aVarA != null) {
                        aVarA.l();
                    }
                    throw th2;
                }
            } catch (FileDownloadGiveUpRetryException e14) {
                e = e14;
            } catch (IOException e15) {
                e = e15;
            } catch (IllegalAccessException e16) {
                e = e16;
            } catch (IllegalArgumentException e17) {
                e = e17;
            }
        }
        if (aVarA == null) {
            return;
        }
        aVarA.l();
    }
}
