package id;

import android.graphics.Rect;
import androidx.drawerlayout.widget.ktFt.FpIL;
import com.yalantis.ucrop.view.CropImageView;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.HashMap;
import y.u0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b1.p f34377a = b1.p.E("w", "h", "ip", "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b1.p f34378b = b1.p.E("id", "layers", "w", "h", "p", "u");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b1.p f34379c = b1.p.E("list");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b1.p f34380d = b1.p.E("cm", FpIL.sZNcmpon, "dr");

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0045. Please report as an issue. */
    public static wc.h a(jd.e eVar) throws EOFException, jd.b {
        wc.h hVar;
        int i11;
        float f5;
        wc.h hVar2;
        float f11;
        float f12;
        float fC = kd.k.c();
        y.r rVar = new y.r((Object) null);
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        u0 u0Var = new u0(0);
        wc.h hVar3 = new wc.h();
        eVar.b();
        int i12 = 0;
        int i13 = 0;
        float fI = CropImageView.DEFAULT_ASPECT_RATIO;
        float fI2 = CropImageView.DEFAULT_ASPECT_RATIO;
        float fI3 = CropImageView.DEFAULT_ASPECT_RATIO;
        while (eVar.f()) {
            switch (eVar.y(f34377a)) {
                case 0:
                    i12 = (int) eVar.i();
                    hVar3 = hVar3;
                    break;
                case 1:
                    i13 = (int) eVar.i();
                    hVar3 = hVar3;
                    break;
                case 2:
                    fI2 = (float) eVar.i();
                    hVar3 = hVar3;
                    break;
                case 3:
                    fI = ((float) eVar.i()) - 0.01f;
                    hVar3 = hVar3;
                    fC = fC;
                    break;
                case 4:
                    fI3 = (float) eVar.i();
                    hVar3 = hVar3;
                    fC = fC;
                    break;
                case 5:
                    fC = fC;
                    hVar = hVar3;
                    i11 = i13;
                    f5 = fI2;
                    String[] strArrSplit = eVar.q().split("\\.");
                    int i14 = Integer.parseInt(strArrSplit[0]);
                    int i15 = Integer.parseInt(strArrSplit[1]);
                    int i16 = Integer.parseInt(strArrSplit[2]);
                    if (i14 < 4 || (i14 <= 4 && (i15 < 4 || (i15 <= 4 && i16 < 0)))) {
                        hVar.a("Lottie only supports bodymovin >= 4.4.0");
                    }
                    hVar3 = hVar;
                    i13 = i11;
                    fI2 = f5;
                    fC = fC;
                    break;
                case 6:
                    fC = fC;
                    wc.h hVar4 = hVar3;
                    i11 = i13;
                    f5 = fI2;
                    eVar.a();
                    int i17 = 0;
                    while (eVar.f()) {
                        wc.h hVar5 = hVar4;
                        gd.i iVarA = s.a(eVar, hVar5);
                        if (iVarA.f29103e == gd.g.IMAGE) {
                            i17++;
                        }
                        arrayList.add(iVarA);
                        rVar.h(iVarA.f29102d, iVarA);
                        if (i17 > 4) {
                            kd.d.b("You have " + i17 + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
                        }
                        hVar4 = hVar5;
                    }
                    hVar = hVar4;
                    eVar.c();
                    hVar3 = hVar;
                    i13 = i11;
                    fI2 = f5;
                    fC = fC;
                    break;
                case 7:
                    fC = fC;
                    i11 = i13;
                    f5 = fI2;
                    eVar.a();
                    while (eVar.f()) {
                        ArrayList arrayList3 = new ArrayList();
                        y.r rVar2 = new y.r((Object) null);
                        eVar.b();
                        String strQ = null;
                        String strQ2 = null;
                        String strQ3 = null;
                        int iP = 0;
                        int iP2 = 0;
                        while (eVar.f()) {
                            int iY = eVar.y(f34378b);
                            if (iY != 0) {
                                if (iY == 1) {
                                    eVar.a();
                                    while (eVar.f()) {
                                        gd.i iVarA2 = s.a(eVar, hVar3);
                                        rVar2.h(iVarA2.f29102d, iVarA2);
                                        arrayList3.add(iVarA2);
                                        hVar3 = hVar3;
                                    }
                                    hVar2 = hVar3;
                                    eVar.c();
                                } else if (iY == 2) {
                                    iP = eVar.p();
                                } else if (iY == 3) {
                                    iP2 = eVar.p();
                                } else if (iY == 4) {
                                    strQ2 = eVar.q();
                                } else if (iY != 5) {
                                    eVar.A();
                                    eVar.B();
                                    hVar2 = hVar3;
                                } else {
                                    strQ3 = eVar.q();
                                }
                                hVar3 = hVar2;
                            } else {
                                strQ = eVar.q();
                            }
                        }
                        wc.h hVar6 = hVar3;
                        eVar.d();
                        if (strQ2 != null) {
                            map2.put(strQ, new wc.x(strQ, iP, strQ2, iP2, strQ3));
                        } else {
                            map.put(strQ, arrayList3);
                        }
                        hVar3 = hVar6;
                    }
                    eVar.c();
                    hVar = hVar3;
                    hVar3 = hVar;
                    i13 = i11;
                    fI2 = f5;
                    fC = fC;
                    break;
                case 8:
                    fC = fC;
                    i11 = i13;
                    float f13 = fI2;
                    eVar.b();
                    while (eVar.f()) {
                        if (eVar.y(f34379c) != 0) {
                            eVar.A();
                            eVar.B();
                        } else {
                            eVar.a();
                            while (eVar.f()) {
                                b1.p pVar = k.f34361a;
                                eVar.b();
                                String strQ4 = null;
                                String strQ5 = null;
                                String strQ6 = null;
                                while (eVar.f()) {
                                    int iY2 = eVar.y(k.f34361a);
                                    if (iY2 != 0) {
                                        float f14 = f13;
                                        if (iY2 == 1) {
                                            strQ5 = eVar.q();
                                        } else if (iY2 == 2) {
                                            strQ6 = eVar.q();
                                        } else if (iY2 != 3) {
                                            eVar.A();
                                            eVar.B();
                                        } else {
                                            eVar.i();
                                        }
                                        f13 = f14;
                                    } else {
                                        strQ4 = eVar.q();
                                    }
                                }
                                eVar.d();
                                map3.put(strQ5, new dd.d(strQ4, strQ5, strQ6));
                                f13 = f13;
                            }
                            eVar.c();
                        }
                    }
                    f5 = f13;
                    eVar.d();
                    hVar = hVar3;
                    hVar3 = hVar;
                    i13 = i11;
                    fI2 = f5;
                    fC = fC;
                    break;
                case 9:
                    fC = fC;
                    i11 = i13;
                    f11 = fI2;
                    eVar.a();
                    while (eVar.f()) {
                        b1.p pVar2 = j.f34359a;
                        ArrayList arrayList4 = new ArrayList();
                        eVar.b();
                        double dI = 0.0d;
                        char cCharAt = 0;
                        String strQ7 = null;
                        String strQ8 = null;
                        while (eVar.f()) {
                            int iY3 = eVar.y(j.f34359a);
                            if (iY3 == 0) {
                                cCharAt = eVar.q().charAt(0);
                            } else if (iY3 == 1) {
                                eVar.i();
                            } else if (iY3 == 2) {
                                dI = eVar.i();
                            } else if (iY3 == 3) {
                                strQ7 = eVar.q();
                            } else if (iY3 == 4) {
                                strQ8 = eVar.q();
                            } else if (iY3 != 5) {
                                eVar.A();
                                eVar.B();
                            } else {
                                eVar.b();
                                while (eVar.f()) {
                                    if (eVar.y(j.f34360b) != 0) {
                                        eVar.A();
                                        eVar.B();
                                    } else {
                                        eVar.a();
                                        while (eVar.f()) {
                                            arrayList4.add((fd.r) g.a(eVar, hVar3));
                                        }
                                        eVar.c();
                                    }
                                }
                                eVar.d();
                            }
                        }
                        eVar.d();
                        dd.e eVar2 = new dd.e(arrayList4, cCharAt, dI, strQ7, strQ8);
                        u0Var.g(eVar2.hashCode(), eVar2);
                    }
                    eVar.c();
                    f5 = f11;
                    hVar = hVar3;
                    hVar3 = hVar;
                    i13 = i11;
                    fI2 = f5;
                    fC = fC;
                    break;
                case 10:
                    eVar.a();
                    while (eVar.f()) {
                        eVar.b();
                        String strQ9 = null;
                        float fI4 = CropImageView.DEFAULT_ASPECT_RATIO;
                        float fI5 = CropImageView.DEFAULT_ASPECT_RATIO;
                        while (eVar.f()) {
                            int iY4 = eVar.y(f34380d);
                            if (iY4 != 0) {
                                f12 = fC;
                                if (iY4 == 1) {
                                    fI2 = fI2;
                                    fI4 = (float) eVar.i();
                                } else if (iY4 != 2) {
                                    eVar.A();
                                    eVar.B();
                                } else {
                                    fI2 = fI2;
                                    fI5 = (float) eVar.i();
                                }
                                i13 = i13;
                            } else {
                                f12 = fC;
                                strQ9 = eVar.q();
                            }
                            fC = f12;
                        }
                        eVar.d();
                        arrayList2.add(new dd.i(strQ9, fI4, fI5));
                        fI2 = fI2;
                        i13 = i13;
                        fC = fC;
                    }
                    fC = fC;
                    i11 = i13;
                    f11 = fI2;
                    eVar.c();
                    f5 = f11;
                    hVar = hVar3;
                    hVar3 = hVar;
                    i13 = i11;
                    fI2 = f5;
                    fC = fC;
                    break;
                default:
                    eVar.A();
                    eVar.B();
                    fC = fC;
                    hVar = hVar3;
                    i11 = i13;
                    f5 = fI2;
                    hVar3 = hVar;
                    i13 = i11;
                    fI2 = f5;
                    fC = fC;
                    break;
            }
        }
        float f15 = fC;
        wc.h hVar7 = hVar3;
        Rect rect = new Rect(0, 0, (int) (i12 * f15), (int) (i13 * f15));
        float fC2 = kd.k.c();
        hVar7.f54967k = rect;
        hVar7.f54968l = fI2;
        hVar7.m = fI;
        hVar7.f54969n = fI3;
        hVar7.f54966j = arrayList;
        hVar7.f54965i = rVar;
        hVar7.f54959c = map;
        hVar7.f54960d = map2;
        hVar7.f54961e = fC2;
        hVar7.f54964h = u0Var;
        hVar7.f54962f = map3;
        hVar7.f54963g = arrayList2;
        return hVar7;
    }
}
