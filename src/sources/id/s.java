package id;

import android.graphics.Color;
import android.view.animation.BaseInterpolator;
import com.google.api.Service;
import com.stkouyu.util.CommandUtil;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import fa.EQx.nuRcCS;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b1.p f34374a = b1.p.E("nm", "ind", "refId", "ty", "parent", "sw", CommandUtil.COMMAND_SH, "sc", "ks", "tt", nuRcCS.axFIzdlz, "shapes", "t", "ef", "sr", "st", "w", "h", "ip", "op", "tm", "cl", "hd", "ao", "bm");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b1.p f34375b = b1.p.E("d", "a");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b1.p f34376c = b1.p.E("ty", "nm");

    /* JADX WARN: Code duplicated, block: B:196:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:198:0x03ac  */
    public static gd.i a(jd.e eVar, wc.h hVar) {
        boolean z11;
        String str;
        boolean z12;
        float f5;
        Float f11;
        fd.x xVar;
        Float f12;
        ed.b bVar;
        ed.b bVar2;
        ed.b bVar3;
        Float fValueOf = Float.valueOf(CropImageView.DEFAULT_ASPECT_RATIO);
        Float fValueOf2 = Float.valueOf(1.0f);
        gd.h hVar2 = gd.h.NONE;
        fd.g gVar = fd.g.NORMAL;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        eVar.b();
        boolean z13 = false;
        gd.h hVar3 = hVar2;
        fd.g gVar2 = gVar;
        float fI = 0.0f;
        float fI2 = 0.0f;
        float fI3 = 0.0f;
        float fI4 = 0.0f;
        float fI5 = 0.0f;
        boolean z14 = false;
        int iC = 0;
        int iC2 = 0;
        int color = 0;
        boolean zH = false;
        ed.e eVar2 = null;
        gd.g gVar3 = null;
        String strQ = null;
        a5.j jVar = null;
        a9.i iVar = null;
        ed.a aVar = null;
        ob.l lVar = null;
        ed.b bVarW = null;
        float fI6 = 1.0f;
        long jP = 0;
        String strQ2 = null;
        String strQ3 = "UNSET";
        long jP2 = -1;
        while (eVar.f()) {
            boolean z15 = true;
            switch (eVar.y(f34374a)) {
                case 0:
                    strQ3 = eVar.q();
                    strQ2 = strQ2;
                    break;
                case 1:
                    jP = eVar.p();
                    strQ2 = strQ2;
                    fValueOf = fValueOf;
                    break;
                case 2:
                    strQ = eVar.q();
                    strQ2 = strQ2;
                    break;
                case 3:
                    fValueOf = fValueOf;
                    str = strQ2;
                    z12 = z13;
                    f5 = fI6;
                    int iP = eVar.p();
                    gVar3 = gd.g.UNKNOWN;
                    if (iP < gVar3.ordinal()) {
                        gVar3 = gd.g.values()[iP];
                    }
                    z13 = z12;
                    strQ2 = str;
                    fI6 = f5;
                    fValueOf = fValueOf;
                    break;
                case 4:
                    jP2 = eVar.p();
                    strQ2 = strQ2;
                    fValueOf = fValueOf;
                    break;
                case 5:
                    iC = (int) (kd.k.c() * eVar.p());
                    strQ2 = strQ2;
                    fValueOf = fValueOf;
                    break;
                case 6:
                    iC2 = (int) (kd.k.c() * eVar.p());
                    strQ2 = strQ2;
                    fValueOf = fValueOf;
                    break;
                case 7:
                    color = Color.parseColor(eVar.q());
                    strQ2 = strQ2;
                    fValueOf = fValueOf;
                    break;
                case 8:
                    eVar2 = c.a(eVar, hVar);
                    strQ2 = strQ2;
                    break;
                case 9:
                    fValueOf = fValueOf;
                    str = strQ2;
                    z12 = z13;
                    f5 = fI6;
                    int iP2 = eVar.p();
                    if (iP2 >= gd.h.values().length) {
                        hVar.a("Unsupported matte type: " + iP2);
                    } else {
                        hVar3 = gd.h.values()[iP2];
                        int i11 = r.f34373a[hVar3.ordinal()];
                        if (i11 == 1) {
                            hVar.a("Unsupported matte type: Luma");
                        } else if (i11 == 2) {
                            hVar.a("Unsupported matte type: Luma Inverted");
                        }
                        hVar.f54971p++;
                    }
                    z13 = z12;
                    strQ2 = str;
                    fI6 = f5;
                    fValueOf = fValueOf;
                    break;
                case 10:
                    fValueOf = fValueOf;
                    f5 = fI6;
                    eVar.a();
                    while (eVar.f()) {
                        eVar.b();
                        fd.h hVar4 = null;
                        ed.a aVar2 = null;
                        ed.a aVarY = null;
                        boolean zH2 = false;
                        while (eVar.f()) {
                            String strI = eVar.I();
                            strI.getClass();
                            switch (strI) {
                                case "o":
                                    strQ2 = strQ2;
                                    aVarY = qx.p.y(eVar, hVar);
                                    break;
                                case "pt":
                                    strQ2 = strQ2;
                                    aVar2 = new ed.a(5, q.a(eVar, hVar, kd.k.c(), z.f34386a, false));
                                    break;
                                case "inv":
                                    zH2 = eVar.h();
                                    break;
                                case "mode":
                                    String strQ4 = eVar.q();
                                    strQ4.getClass();
                                    switch (strQ4) {
                                        case "a":
                                            hVar4 = fd.h.MASK_MODE_ADD;
                                            break;
                                        case "i":
                                            hVar.a("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                                            hVar4 = fd.h.MASK_MODE_INTERSECT;
                                            break;
                                        case "n":
                                            hVar4 = fd.h.MASK_MODE_NONE;
                                            break;
                                        case "s":
                                            hVar4 = fd.h.MASK_MODE_SUBTRACT;
                                            break;
                                        default:
                                            kd.d.b("Unknown mask mode " + strI + ". Defaulting to Add.");
                                            hVar4 = fd.h.MASK_MODE_ADD;
                                            break;
                                    }
                                    break;
                                default:
                                    eVar.B();
                                    break;
                            }
                            strQ2 = strQ2;
                        }
                        eVar.d();
                        arrayList.add(new fd.i(hVar4, aVar2, aVarY, zH2));
                        strQ2 = strQ2;
                    }
                    str = strQ2;
                    z12 = false;
                    hVar.f54971p += arrayList.size();
                    eVar.c();
                    z13 = z12;
                    strQ2 = str;
                    fI6 = f5;
                    fValueOf = fValueOf;
                    break;
                case 11:
                    fValueOf = fValueOf;
                    f5 = fI6;
                    eVar.a();
                    while (eVar.f()) {
                        fd.b bVarA = g.a(eVar, hVar);
                        if (bVarA != null) {
                            arrayList2.add(bVarA);
                        }
                    }
                    eVar.c();
                    str = strQ2;
                    z12 = false;
                    z13 = z12;
                    strQ2 = str;
                    fI6 = f5;
                    fValueOf = fValueOf;
                    break;
                case 12:
                    f11 = fValueOf;
                    eVar.b();
                    while (eVar.f()) {
                        int iY = eVar.y(f34375b);
                        if (iY == 0) {
                            aVar = new ed.a(6, q.a(eVar, hVar, kd.k.c(), h.f34350a, false));
                        } else if (iY != 1) {
                            eVar.A();
                            eVar.B();
                        } else {
                            eVar.a();
                            if (eVar.f()) {
                                b1.p pVar = b.f34329a;
                                eVar.b();
                                a9.i iVar2 = null;
                                dm.c cVar = null;
                                while (eVar.f()) {
                                    int iY2 = eVar.y(b.f34329a);
                                    if (iY2 != 0) {
                                        boolean z16 = true;
                                        if (iY2 != 1) {
                                            eVar.A();
                                            eVar.B();
                                        } else {
                                            eVar.b();
                                            ed.a aVarV = null;
                                            ed.a aVarV2 = null;
                                            ed.b bVarW2 = null;
                                            ed.b bVarW3 = null;
                                            ed.a aVarY2 = null;
                                            while (eVar.f()) {
                                                int iY3 = eVar.y(b.f34331c);
                                                if (iY3 == 0) {
                                                    aVarV = qx.p.v(eVar, hVar);
                                                } else if (iY3 == z16) {
                                                    aVarV2 = qx.p.v(eVar, hVar);
                                                } else if (iY3 == 2) {
                                                    bVarW2 = qx.p.w(eVar, hVar, z16);
                                                } else if (iY3 == 3) {
                                                    bVarW3 = qx.p.w(eVar, hVar, z16);
                                                } else if (iY3 != 4) {
                                                    eVar.A();
                                                    eVar.B();
                                                } else {
                                                    aVarY2 = qx.p.y(eVar, hVar);
                                                }
                                                z16 = true;
                                            }
                                            eVar.d();
                                            iVar2 = new a9.i(aVarV, aVarV2, bVarW2, bVarW3, aVarY2);
                                        }
                                    } else {
                                        eVar.b();
                                        ed.a aVar3 = null;
                                        ed.a aVarY3 = null;
                                        ed.a aVarY4 = null;
                                        fd.x xVar2 = null;
                                        while (eVar.f()) {
                                            int iY4 = eVar.y(b.f34330b);
                                            if (iY4 != 0) {
                                                int i12 = 1;
                                                if (iY4 == 1) {
                                                    aVarY3 = qx.p.y(eVar, hVar);
                                                } else if (iY4 == 2) {
                                                    aVarY4 = qx.p.y(eVar, hVar);
                                                } else if (iY4 != 3) {
                                                    eVar.A();
                                                    eVar.B();
                                                } else {
                                                    int iP3 = eVar.p();
                                                    if (iP3 == 1) {
                                                        if (iP3 == i12) {
                                                            xVar = fd.x.PERCENT;
                                                        } else {
                                                            xVar = fd.x.INDEX;
                                                        }
                                                        xVar2 = xVar;
                                                    } else if (iP3 != 2) {
                                                        hVar.a("Unsupported text range units: " + iP3);
                                                        xVar2 = fd.x.INDEX;
                                                    } else {
                                                        i12 = 1;
                                                        if (iP3 == i12) {
                                                            xVar = fd.x.PERCENT;
                                                        } else {
                                                            xVar = fd.x.INDEX;
                                                        }
                                                        xVar2 = xVar;
                                                    }
                                                }
                                            } else {
                                                aVar3 = qx.p.y(eVar, hVar);
                                            }
                                        }
                                        eVar.d();
                                        if (aVar3 == null && aVarY3 != null) {
                                            aVar3 = new ed.a(2, Collections.singletonList(new ld.a(0)));
                                        }
                                        cVar = new dm.c(aVar3, aVarY3, aVarY4, xVar2, 4);
                                    }
                                }
                                eVar.d();
                                lVar = new ob.l(7, iVar2, cVar);
                            }
                            while (eVar.f()) {
                                eVar.B();
                            }
                            eVar.c();
                        }
                    }
                    eVar.d();
                    fI6 = fI6;
                    fValueOf = f11;
                    z13 = false;
                    break;
                case 13:
                    eVar.a();
                    ArrayList arrayList3 = new ArrayList();
                    while (eVar.f()) {
                        eVar.b();
                        while (eVar.f()) {
                            int iY5 = eVar.y(f34376c);
                            if (iY5 == 0) {
                                int iP4 = eVar.p();
                                if (iP4 == 29) {
                                    b1.p pVar2 = d.f34336a;
                                    jVar = null;
                                    while (eVar.f()) {
                                        if (eVar.y(d.f34336a) != 0) {
                                            eVar.A();
                                            eVar.B();
                                        } else {
                                            eVar.a();
                                            while (eVar.f()) {
                                                eVar.b();
                                                boolean z17 = false;
                                                a5.j jVar2 = null;
                                                while (eVar.f()) {
                                                    int iY6 = eVar.y(d.f34337b);
                                                    if (iY6 == 0) {
                                                        z17 = eVar.p() == 0;
                                                    } else if (iY6 != z15) {
                                                        eVar.A();
                                                        eVar.B();
                                                    } else if (z17) {
                                                        jVar2 = new a5.j(qx.p.w(eVar, hVar, z15), 12);
                                                    } else {
                                                        eVar.B();
                                                    }
                                                    z15 = true;
                                                }
                                                eVar.d();
                                                if (jVar2 != null) {
                                                    jVar = jVar2;
                                                }
                                                z15 = true;
                                            }
                                            eVar.c();
                                            z15 = true;
                                        }
                                    }
                                } else {
                                    if (iP4 == 25) {
                                        i iVar3 = new i();
                                        while (eVar.f()) {
                                            if (eVar.y(i.f34352f) != 0) {
                                                eVar.A();
                                                eVar.B();
                                            } else {
                                                eVar.a();
                                                while (eVar.f()) {
                                                    eVar.b();
                                                    String strQ5 = BuildConfig.VERSION_NAME;
                                                    while (eVar.f()) {
                                                        int iY7 = eVar.y(i.f34353g);
                                                        if (iY7 == 0) {
                                                            strQ5 = eVar.q();
                                                        } else if (iY7 == 1) {
                                                            strQ5.getClass();
                                                            switch (strQ5) {
                                                                case "Distance":
                                                                    iVar3.f34357d = qx.p.w(eVar, hVar, true);
                                                                    break;
                                                                case "Opacity":
                                                                    iVar3.f34355b = qx.p.w(eVar, hVar, false);
                                                                    break;
                                                                case "Direction":
                                                                    iVar3.f34356c = qx.p.w(eVar, hVar, false);
                                                                    break;
                                                                case "Shadow Color":
                                                                    iVar3.f34354a = qx.p.v(eVar, hVar);
                                                                    break;
                                                                case "Softness":
                                                                    iVar3.f34358e = qx.p.w(eVar, hVar, true);
                                                                    break;
                                                                default:
                                                                    eVar.B();
                                                                    break;
                                                            }
                                                        } else {
                                                            eVar.A();
                                                            eVar.B();
                                                        }
                                                    }
                                                    eVar.d();
                                                }
                                                eVar.c();
                                            }
                                        }
                                        ed.a aVar4 = iVar3.f34354a;
                                        if (aVar4 == null || (bVar = iVar3.f34355b) == null || (bVar2 = iVar3.f34356c) == null) {
                                            f12 = fValueOf;
                                        } else {
                                            f12 = fValueOf;
                                            ed.b bVar4 = iVar3.f34357d;
                                            if (bVar4 != null && (bVar3 = iVar3.f34358e) != null) {
                                                iVar = new a9.i(aVar4, bVar, bVar2, bVar4, bVar3);
                                            }
                                        }
                                        iVar = null;
                                    }
                                    fValueOf = f12;
                                    z15 = true;
                                }
                            } else if (iY5 != z15) {
                                eVar.A();
                                eVar.B();
                            } else {
                                arrayList3.add(eVar.q());
                            }
                            f12 = fValueOf;
                            fValueOf = f12;
                            z15 = true;
                        }
                        eVar.d();
                        z15 = true;
                    }
                    f11 = fValueOf;
                    eVar.c();
                    hVar.a("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: " + arrayList3);
                    fI6 = fI6;
                    fValueOf = f11;
                    z13 = false;
                    break;
                case 14:
                    fI6 = (float) eVar.i();
                    z13 = false;
                    break;
                case 15:
                    fI5 = (float) eVar.i();
                    z13 = false;
                    break;
                case 16:
                    fI3 = (float) (eVar.i() * ((double) kd.k.c()));
                    fI6 = fI6;
                    z13 = false;
                    break;
                case 17:
                    fI4 = (float) (eVar.i() * ((double) kd.k.c()));
                    fI6 = fI6;
                    z13 = false;
                    break;
                case 18:
                    fI = (float) eVar.i();
                    break;
                case 19:
                    fI2 = (float) eVar.i();
                    break;
                case 20:
                    bVarW = qx.p.w(eVar, hVar, z13);
                    break;
                case 21:
                    strQ2 = eVar.q();
                    break;
                case 22:
                    zH = eVar.h();
                    break;
                case 23:
                    z14 = eVar.p() != 1 ? z13 : true;
                    break;
                case Service.METRICS_FIELD_NUMBER /* 24 */:
                    int iP5 = eVar.p();
                    if (iP5 < fd.g.values().length) {
                        gVar2 = fd.g.values()[iP5];
                    } else {
                        hVar.a("Unsupported Blend Mode: " + iP5);
                        gVar2 = fd.g.NORMAL;
                    }
                    break;
                default:
                    eVar.A();
                    eVar.B();
                    fValueOf = fValueOf;
                    str = strQ2;
                    z12 = z13;
                    f5 = fI6;
                    z13 = z12;
                    strQ2 = str;
                    fI6 = f5;
                    fValueOf = fValueOf;
                    break;
            }
        }
        Float f13 = fValueOf;
        String str2 = strQ2;
        float f14 = fI6;
        eVar.d();
        ArrayList arrayList4 = new ArrayList();
        if (fI > CropImageView.DEFAULT_ASPECT_RATIO) {
            z11 = z14;
            arrayList4.add(new ld.a(hVar, f13, f13, (BaseInterpolator) null, CropImageView.DEFAULT_ASPECT_RATIO, Float.valueOf(fI)));
        } else {
            z11 = z14;
        }
        if (fI2 <= CropImageView.DEFAULT_ASPECT_RATIO) {
            fI2 = hVar.m;
        }
        arrayList4.add(new ld.a(hVar, fValueOf2, fValueOf2, (BaseInterpolator) null, fI, Float.valueOf(fI2)));
        arrayList4.add(new ld.a(hVar, f13, f13, (BaseInterpolator) null, fI2, Float.valueOf(Float.MAX_VALUE)));
        if (strQ3.endsWith(".ai") || "ai".equals(str2)) {
            hVar.a("Convert your Illustrator layers to shape layers.");
        }
        if (z11) {
            if (eVar2 == null) {
                eVar2 = new ed.e();
            }
            ed.e eVar3 = eVar2;
            eVar3.f25482j = z11;
            eVar2 = eVar3;
        }
        return new gd.i(arrayList2, hVar, strQ3, jP, gVar3, jP2, strQ, arrayList, eVar2, iC, iC2, color, f14, fI5, fI3, fI4, aVar, lVar, arrayList4, hVar3, bVarW, zH, jVar, iVar, gVar2);
    }
}
