package f8;

import androidx.media3.common.ParserException;
import androidx.recyclerview.widget.e;
import b7.w;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;
import nv.p;
import org.xmlpull.v1.XmlPullParserException;
import r8.j;
import u8.i;
import x7.e0;
import x7.m;
import x7.n;
import x7.o;
import x7.q;
import y6.c0;
import y6.d0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o f26975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f26976c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f26977d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f26978e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public m8.a f26980g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public n f26981h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public e f26982i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public j f26983j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f26974a = new w(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f26979f = -1;

    public final void a() {
        o oVar = this.f26975b;
        oVar.getClass();
        oVar.o();
        this.f26975b.q(new q(-9223372036854775807L));
        this.f26976c = 6;
    }

    @Override // x7.m
    public final boolean c(n nVar) throws EOFException, InterruptedIOException {
        x7.j jVar = (x7.j) nVar;
        w wVar = this.f26974a;
        wVar.F(2);
        jVar.f(wVar.f4039a, 0, 2, false);
        if (wVar.C() == 65496) {
            wVar.F(2);
            jVar.f(wVar.f4039a, 0, 2, false);
            int iC = wVar.C();
            this.f26977d = iC;
            if (iC == 65504) {
                wVar.F(2);
                jVar.f(wVar.f4039a, 0, 2, false);
                jVar.b(wVar.C() - 2, false);
                wVar.F(2);
                jVar.f(wVar.f4039a, 0, 2, false);
                this.f26977d = wVar.C();
            }
            if (this.f26977d == 65505) {
                return true;
            }
        }
        return false;
    }

    @Override // x7.m
    public final void e(o oVar) {
        this.f26975b = oVar;
    }

    @Override // x7.m
    public final void f(long j11, long j12) {
        if (j11 == 0) {
            this.f26976c = 0;
            this.f26983j = null;
        } else if (this.f26976c == 5) {
            j jVar = this.f26983j;
            jVar.getClass();
            jVar.f(j11, j12);
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0100  */
    @Override // x7.m
    public final int g(n nVar, kw.b bVar) throws ParserException {
        String strR;
        e eVarA;
        m8.a aVar;
        long j11;
        int i11 = this.f26976c;
        long j12 = -1;
        w wVar = this.f26974a;
        if (i11 == 0) {
            wVar.F(2);
            nVar.readFully(wVar.f4039a, 0, 2);
            int iC = wVar.C();
            this.f26977d = iC;
            if (iC == 65498) {
                if (this.f26979f != -1) {
                    this.f26976c = 4;
                    return 0;
                }
                a();
                return 0;
            }
            if ((iC < 65488 || iC > 65497) && iC != 65281) {
                this.f26976c = 1;
            }
            return 0;
        }
        if (i11 == 1) {
            wVar.F(2);
            nVar.readFully(wVar.f4039a, 0, 2);
            this.f26978e = wVar.C() - 2;
            this.f26976c = 2;
            return 0;
        }
        if (i11 != 2) {
            if (i11 != 4) {
                if (i11 != 5) {
                    if (i11 == 6) {
                        return -1;
                    }
                    throw new IllegalStateException();
                }
                if (this.f26982i == null || nVar != this.f26981h) {
                    this.f26981h = nVar;
                    this.f26982i = new e(nVar, this.f26979f);
                }
                j jVar = this.f26983j;
                jVar.getClass();
                int iG = jVar.g(this.f26982i, bVar);
                if (iG == 1) {
                    bVar.f38845a += this.f26979f;
                }
                return iG;
            }
            long position = nVar.getPosition();
            long j13 = this.f26979f;
            if (position != j13) {
                bVar.f38845a = j13;
                return 1;
            }
            if (!nVar.f(wVar.f4039a, 0, 1, true)) {
                a();
                return 0;
            }
            nVar.r();
            if (this.f26983j == null) {
                this.f26983j = new j(i.E, 8);
            }
            e eVar = new e(nVar, this.f26979f);
            this.f26982i = eVar;
            if (!this.f26983j.c(eVar)) {
                a();
                return 0;
            }
            j jVar2 = this.f26983j;
            long j14 = this.f26979f;
            o oVar = this.f26975b;
            oVar.getClass();
            jVar2.e(new e(j14, oVar, 4));
            m8.a aVar2 = this.f26980g;
            aVar2.getClass();
            o oVar2 = this.f26975b;
            oVar2.getClass();
            e0 e0VarV = oVar2.v(1024, 4);
            y6.o oVar3 = new y6.o();
            oVar3.f57264l = d0.o("image/jpeg");
            oVar3.f57263k = new c0(aVar2);
            p.D(oVar3, e0VarV);
            this.f26976c = 5;
            return 0;
        }
        if (this.f26977d == 65505) {
            w wVar2 = new w(this.f26978e);
            nVar.readFully(wVar2.f4039a, 0, this.f26978e);
            if (this.f26980g == null && "http://ns.adobe.com/xap/1.0/".equals(wVar2.r()) && (strR = wVar2.r()) != null) {
                long length = nVar.getLength();
                if (length == -1) {
                    aVar = null;
                } else {
                    try {
                        eVarA = d.a(strR);
                    } catch (ParserException | NumberFormatException | XmlPullParserException unused) {
                        b7.a.B("Ignoring unexpected XMP metadata");
                        eVarA = null;
                    }
                    if (eVarA == null) {
                        aVar = null;
                    } else {
                        List list = (List) eVarA.f2444c;
                        if (list.size() < 2) {
                            aVar = null;
                        } else {
                            int size = list.size() - 1;
                            long j15 = -1;
                            long j16 = -1;
                            long j17 = -1;
                            long j18 = -1;
                            boolean z11 = false;
                            while (size >= 0) {
                                b bVar2 = (b) list.get(size);
                                long j19 = j12;
                                boolean zEquals = "video/mp4".equals(bVar2.f26984a) | z11;
                                if (size == 0) {
                                    length -= bVar2.f26986c;
                                    j11 = 0;
                                } else {
                                    j11 = length - bVar2.f26985b;
                                }
                                long j21 = length;
                                length = j11;
                                if (!zEquals || length == j21) {
                                    z11 = zEquals;
                                } else {
                                    j18 = j21 - length;
                                    j17 = length;
                                    z11 = false;
                                }
                                if (size == 0) {
                                    j16 = j21;
                                    j15 = length;
                                }
                                size--;
                                j12 = j19;
                            }
                            long j22 = j12;
                            if (j17 == j22 || j18 == j22 || j15 == j22 || j16 == j22) {
                                aVar = null;
                            } else {
                                aVar = new m8.a(j15, j16, eVarA.f2443b, j17, j18);
                            }
                        }
                    }
                }
                this.f26980g = aVar;
                if (aVar != null) {
                    this.f26979f = aVar.f41041d;
                }
            }
        } else {
            nVar.s(this.f26978e);
        }
        this.f26976c = 0;
        return 0;
    }

    @Override // x7.m
    public final void release() {
        j jVar = this.f26983j;
        if (jVar != null) {
            jVar.getClass();
        }
    }
}
