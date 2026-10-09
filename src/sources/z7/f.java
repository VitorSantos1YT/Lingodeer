package z7;

import b7.f0;
import b7.w;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableListIterator;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import y6.d0;
import y6.o;
import y6.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImmutableList f59024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f59025b;

    public f(int i11, ImmutableList immutableList) {
        this.f59025b = i11;
        this.f59024a = immutableList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static f b(int i11, w wVar) {
        String str;
        a gVar;
        String str2;
        ImmutableList.Builder builder = new ImmutableList.Builder();
        int i12 = wVar.f4041c;
        int iA = -2;
        while (wVar.a() > 8) {
            int iL = wVar.l();
            int iL2 = wVar.f4040b + wVar.l();
            wVar.H(iL2);
            if (iL != 1414744396) {
                d dVar = null;
                switch (iL) {
                    case 1718776947:
                        if (iA != 2) {
                            if (iA == 1) {
                                int iP = wVar.p();
                                if (iP == 1) {
                                    str = "audio/raw";
                                } else if (iP == 85) {
                                    str = "audio/mpeg";
                                } else if (iP == 255) {
                                    str = "audio/mp4a-latm";
                                } else if (iP != 8192) {
                                    str = iP != 8193 ? null : "audio/vnd.dts";
                                } else {
                                    str = "audio/ac3";
                                }
                                if (str != null) {
                                    int iP2 = wVar.p();
                                    int iL3 = wVar.l();
                                    wVar.J(6);
                                    int iP3 = wVar.p();
                                    String str3 = f0.f3975a;
                                    int iW = f0.w(iP3, ByteOrder.LITTLE_ENDIAN);
                                    int iP4 = wVar.a() > 0 ? wVar.p() : 0;
                                    o oVar = new o();
                                    oVar.m = d0.o(str);
                                    oVar.E = iP2;
                                    oVar.F = iL3;
                                    if (str.equals("audio/raw") && iW != 0) {
                                        oVar.G = iW;
                                    }
                                    if (str.equals("audio/mp4a-latm") && iP4 > 0) {
                                        byte[] bArr = new byte[iP4];
                                        wVar.h(bArr, 0, iP4);
                                        oVar.f57267p = ImmutableList.u(bArr);
                                    }
                                    gVar = new g(new p(oVar));
                                } else {
                                    defpackage.e.y(iP, "Ignoring track with unsupported format tag ");
                                }
                            } else {
                                b7.a.B("Ignoring strf box for unsupported track type: " + f0.A(iA));
                            }
                            gVar = dVar;
                            break;
                        } else {
                            wVar.J(4);
                            int iL4 = wVar.l();
                            int iL5 = wVar.l();
                            wVar.J(4);
                            int iL6 = wVar.l();
                            switch (iL6) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str2 = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str2 = "video/avc";
                                    break;
                                case 842289229:
                                    str2 = "video/mp42";
                                    break;
                                case 859066445:
                                    str2 = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str2 = "video/mjpeg";
                                    break;
                                default:
                                    str2 = null;
                                    break;
                            }
                            if (str2 != null) {
                                o oVar2 = new o();
                                oVar2.f57271t = iL4;
                                oVar2.f57272u = iL5;
                                oVar2.m = d0.o(str2);
                                gVar = new g(new p(oVar2));
                            } else {
                                defpackage.e.y(iL6, "Ignoring track with unsupported compression ");
                                gVar = dVar;
                            }
                        }
                        break;
                    case 1751742049:
                        int iL7 = wVar.l();
                        wVar.J(8);
                        int iL8 = wVar.l();
                        int iL9 = wVar.l();
                        wVar.J(4);
                        wVar.l();
                        wVar.J(12);
                        gVar = new c(iL7, iL8, iL9);
                        break;
                    case 1752331379:
                        int iL10 = wVar.l();
                        wVar.J(12);
                        wVar.l();
                        int iL11 = wVar.l();
                        int iL12 = wVar.l();
                        wVar.J(4);
                        int iL13 = wVar.l();
                        int iL14 = wVar.l();
                        wVar.J(4);
                        dVar = new d(iL10, iL11, iL12, iL13, iL14, wVar.l());
                        gVar = dVar;
                        break;
                    case 1852994675:
                        gVar = new h(wVar.u(wVar.a(), StandardCharsets.UTF_8));
                        break;
                    default:
                        gVar = dVar;
                        break;
                }
            } else {
                gVar = b(wVar.l(), wVar);
            }
            if (gVar != null) {
                if (gVar.getType() == 1752331379) {
                    iA = ((d) gVar).a();
                }
                builder.h(gVar);
            }
            wVar.I(iL2);
            wVar.H(i12);
        }
        return new f(i11, builder.j());
    }

    public final a a(Class cls) {
        UnmodifiableListIterator unmodifiableListIteratorListIterator = this.f59024a.listIterator(0);
        while (unmodifiableListIteratorListIterator.hasNext()) {
            a aVar = (a) unmodifiableListIteratorListIterator.next();
            if (aVar.getClass() == cls) {
                return aVar;
            }
        }
        return null;
    }

    @Override // z7.a
    public final int getType() {
        return this.f59025b;
    }
}
