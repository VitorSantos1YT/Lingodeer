package se;

import aj.uZCn.evRpcb;
import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.os.LocaleList;
import android.os.StatFs;
import android.text.Layout;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LocaleSpan;
import android.text.style.RelativeSizeSpan;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.android.billingclient.api.c0;
import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.http.oss.MYmT.bjXGJ;
import com.lingo.lingoskill.object.Level;
import com.lingodeer.data.model.CourseLesson;
import com.lingodeer.data.model.CourseLessonPracticeType;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import cz.k;
import d1.j0;
import e6.q1;
import f0.h1;
import fr.p3;
import g00.i1;
import g2.f0;
import g2.p0;
import h1.i9;
import h1.s1;
import h1.v1;
import h1.y4;
import h1.z4;
import j0.e2;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kc.l;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.m;
import kotlinx.serialization.SerializationException;
import l1.b1;
import l1.b3;
import l1.c3;
import l1.x1;
import m00.a0;
import m00.o;
import m00.x;
import ot.f2;
import s0.o0;
import sg.d0;
import tg.i0;
import z2.g0;
import z2.g1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p implements f00.c, f00.a {
    public static final void F(c6.l lVar, k6.c cVar, t1.d dVar, l1.n nVar, int i11) {
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1959221577);
        if ((((sVar.f(lVar) ? 4 : 2) | i11 | (sVar.f(cVar) ? 32 : 16)) & 147) == 146 && sVar.F()) {
            sVar.W();
        } else {
            k6.d dVar2 = k6.d.f37917a;
            sVar.e0(578571862);
            sVar.e0(-548224868);
            if (!(sVar.f39434a instanceof c6.b)) {
                l1.t.z();
                throw null;
            }
            sVar.b0();
            if (sVar.S) {
                sVar.k(dVar2);
            } else {
                sVar.r0();
            }
            l1.t.J(k6.e.f37918b, lVar, sVar);
            l1.t.J(k6.e.f37919c, cVar, sVar);
            dVar.invoke(sVar, 6);
            sVar.p(true);
            sVar.p(false);
            sVar.p(false);
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new y4(lVar, cVar, dVar, i11, 3);
        }
    }

    public static final void G(t1.d dVar, l1.n nVar, int i11) {
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1162635549);
        if (sVar.T(i11 & 1, (i11 & 3) != 2)) {
            l1.t.a(j0.f22926a.a(null), dVar, sVar, 56);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new br.m(dVar, i11, 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0201  */
    /* JADX WARN: Code duplicated, block: B:102:0x020a  */
    /* JADX WARN: Code duplicated, block: B:108:0x024f  */
    /* JADX WARN: Code duplicated, block: B:112:0x0211 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x0069 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x006b  */
    /* JADX WARN: Code duplicated, block: B:36:0x006e  */
    /* JADX WARN: Code duplicated, block: B:39:0x007b  */
    /* JADX WARN: Code duplicated, block: B:40:0x007d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0084  */
    /* JADX WARN: Code duplicated, block: B:47:0x008d  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:52:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:63:0x0105  */
    /* JADX WARN: Code duplicated, block: B:65:0x0109  */
    /* JADX WARN: Code duplicated, block: B:67:0x0150  */
    /* JADX WARN: Code duplicated, block: B:69:0x015b  */
    /* JADX WARN: Code duplicated, block: B:70:0x016e  */
    /* JADX WARN: Code duplicated, block: B:72:0x0172  */
    /* JADX WARN: Code duplicated, block: B:73:0x0178  */
    /* JADX WARN: Code duplicated, block: B:75:0x017c  */
    /* JADX WARN: Code duplicated, block: B:76:0x0182  */
    /* JADX WARN: Code duplicated, block: B:78:0x0186  */
    /* JADX WARN: Code duplicated, block: B:79:0x0191  */
    /* JADX WARN: Code duplicated, block: B:81:0x0195  */
    /* JADX WARN: Code duplicated, block: B:82:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:84:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:87:0x01c9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:94:0x01d7  */
    public static final void H(i0 i0Var, sg.q astNode, z1.r rVar, l1.n nVar, int i11, int i12) {
        int i13;
        z1.r rVar2;
        z1.r rVar3;
        int i14;
        boolean z11;
        Object objQ;
        qh.d dVar;
        j3.e eVar;
        List listK;
        z1.r rVar4;
        sg.q qVar;
        boolean z12;
        Integer num;
        c.a aVar;
        int i15;
        boolean z13;
        Integer numValueOf;
        z1.r rVar5;
        x1 x1VarT;
        kotlin.jvm.internal.m.f(i0Var, "<this>");
        String str = "astNode";
        kotlin.jvm.internal.m.f(astNode, "astNode");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1311725673);
        if ((i11 & 6) == 0) {
            i13 = (sVar.f(i0Var) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= sVar.f(astNode) ? 32 : 16;
        }
        int i16 = i12 & 2;
        if (i16 == 0) {
            if ((i11 & 384) == 0) {
                rVar2 = rVar;
                i13 |= sVar.f(rVar2) ? 256 : 128;
            }
            if ((i13 & 147) == 146 || !sVar.F()) {
                if (i16 != 0) {
                    rVar3 = z1.o.f58481a;
                } else {
                    rVar3 = rVar2;
                }
                sVar.d0(-2075087027);
                i14 = 1;
                if ((i13 & 112) == 32) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objQ = sVar.Q();
                if (!z11 || objQ == l1.m.f39353a) {
                    dVar = new qh.d();
                    eVar = (j3.e) dVar.f47750b;
                    listK = ns.o.K(new rg.a(astNode, false, null));
                    while (!listK.isEmpty()) {
                        rg.a aVar2 = (rg.a) ry.m.q0(listK);
                        qVar = aVar2.f49242a;
                        z12 = aVar2.f49243b;
                        num = aVar2.f49244c;
                        kotlin.jvm.internal.m.f(qVar, str);
                        aVar = qVar.f51656a;
                        listK = ry.m.k0(listK, i14);
                        if (z12) {
                            str = str;
                            rVar3 = rVar3;
                            i15 = i14;
                        } else {
                            z13 = aVar instanceof sg.b;
                            if (z13) {
                                int i17 = dVar.i(vg.e.f54026d);
                                String text = ((sg.b) aVar).f51630a;
                                kotlin.jvm.internal.m.f(text, "text");
                                eVar.d(text);
                                eVar.f(i17);
                                numValueOf = null;
                            } else if (aVar instanceof sg.e) {
                                numValueOf = Integer.valueOf(dVar.i(vg.f.f54028d));
                            } else {
                                if (aVar instanceof sg.v) {
                                    numValueOf = Integer.valueOf(dVar.i(vg.h.f54032d));
                                } else {
                                    if (aVar instanceof sg.k) {
                                        str = str;
                                        rVar3 = rVar3;
                                        z13 = z13;
                                        vg.a aVar3 = new vg.a(new f2(23), new t1.d(new l0.g(aVar, 1), true, 786218717), 2);
                                        String string = UUID.randomUUID().toString();
                                        kotlin.jvm.internal.m.e(string, "toString(...)");
                                        ((LinkedHashMap) dVar.f47751c).put("inline:".concat(string), aVar3);
                                        o0.o((j3.e) dVar.f47750b, string, "�");
                                    } else {
                                        str = str;
                                        rVar3 = rVar3;
                                        z13 = z13;
                                        if (aVar instanceof sg.n) {
                                            numValueOf = Integer.valueOf(dVar.i(new vg.g(((sg.n) aVar).f51650a)));
                                        } else if (aVar instanceof sg.u) {
                                            eVar.d(" ");
                                        } else if (aVar instanceof sg.g) {
                                            eVar.d("\n");
                                        } else if (aVar instanceof sg.w) {
                                            numValueOf = Integer.valueOf(dVar.i(vg.d.f54024d));
                                        } else if (aVar instanceof d0) {
                                            String text2 = ((d0) aVar).f51634a;
                                            kotlin.jvm.internal.m.f(text2, "text");
                                            eVar.d(text2);
                                        } else if (aVar instanceof sg.o) {
                                            numValueOf = Integer.valueOf(dVar.i(new vg.g(((sg.o) aVar).f51653b)));
                                        }
                                    }
                                    numValueOf = null;
                                }
                                ArrayList arrayListH0 = ry.m.H0(ns.o.K(new rg.a(qVar, true, numValueOf)), listK);
                                if (!(aVar instanceof d0) || z13 || (aVar instanceof sg.k) || (aVar instanceof sg.u) || (aVar instanceof sg.g)) {
                                    i15 = 1;
                                } else {
                                    i15 = 1;
                                    Iterator it = ue.f.l(qVar, true).iterator();
                                    while (it.hasNext()) {
                                        arrayListH0 = ry.m.H0(ns.o.K(new rg.a((sg.q) it.next(), false, null)), arrayListH0);
                                    }
                                }
                                listK = arrayListH0;
                            }
                            ArrayList arrayListH1 = ry.m.H0(ns.o.K(new rg.a(qVar, true, numValueOf)), listK);
                            if (aVar instanceof d0) {
                                i15 = 1;
                            } else {
                                i15 = 1;
                            }
                            listK = arrayListH1;
                        }
                        if (num != null) {
                            eVar.f(num.intValue());
                        }
                        i14 = i15;
                        str = str;
                        rVar3 = rVar3;
                    }
                    rVar4 = rVar3;
                    vg.m mVar = new vg.m(eVar.j(), ry.x.h0((LinkedHashMap) dVar.f47751c));
                    sVar.o0(mVar);
                    objQ = mVar;
                } else {
                    rVar4 = rVar3;
                }
                sVar.p(false);
                int i18 = i13 & 910;
                z1.r rVar6 = rVar4;
                c.a.c(i0Var, (vg.m) objQ, rVar6, null, false, 0, 0, sVar, i18, 60);
                rVar5 = rVar6;
            } else {
                sVar.W();
                rVar5 = rVar2;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new androidx.lifecycle.compose.d(i0Var, astNode, rVar5, i11, i12, 8);
            }
        }
        i13 |= 384;
        rVar2 = rVar;
        if ((i13 & 147) == 146) {
            if (i16 != 0) {
                rVar3 = z1.o.f58481a;
            } else {
                rVar3 = rVar2;
            }
            sVar.d0(-2075087027);
            i14 = 1;
            if ((i13 & 112) == 32) {
                z11 = true;
            } else {
                z11 = false;
            }
            objQ = sVar.Q();
            if (z11) {
                dVar = new qh.d();
                eVar = (j3.e) dVar.f47750b;
                listK = ns.o.K(new rg.a(astNode, false, null));
                while (!listK.isEmpty()) {
                    rg.a aVar4 = (rg.a) ry.m.q0(listK);
                    qVar = aVar4.f49242a;
                    z12 = aVar4.f49243b;
                    num = aVar4.f49244c;
                    kotlin.jvm.internal.m.f(qVar, str);
                    aVar = qVar.f51656a;
                    listK = ry.m.k0(listK, i14);
                    if (z12) {
                        z13 = aVar instanceof sg.b;
                        if (z13) {
                            int i19 = dVar.i(vg.e.f54026d);
                            String text3 = ((sg.b) aVar).f51630a;
                            kotlin.jvm.internal.m.f(text3, "text");
                            eVar.d(text3);
                            eVar.f(i19);
                            numValueOf = null;
                        } else if (aVar instanceof sg.e) {
                            numValueOf = Integer.valueOf(dVar.i(vg.f.f54028d));
                        } else {
                            if (aVar instanceof sg.v) {
                                numValueOf = Integer.valueOf(dVar.i(vg.h.f54032d));
                            } else {
                                if (aVar instanceof sg.k) {
                                    str = str;
                                    rVar3 = rVar3;
                                    z13 = z13;
                                    vg.a aVar5 = new vg.a(new f2(23), new t1.d(new l0.g(aVar, 1), true, 786218717), 2);
                                    String string2 = UUID.randomUUID().toString();
                                    kotlin.jvm.internal.m.e(string2, "toString(...)");
                                    ((LinkedHashMap) dVar.f47751c).put("inline:".concat(string2), aVar5);
                                    o0.o((j3.e) dVar.f47750b, string2, "�");
                                } else {
                                    str = str;
                                    rVar3 = rVar3;
                                    z13 = z13;
                                    if (aVar instanceof sg.n) {
                                        numValueOf = Integer.valueOf(dVar.i(new vg.g(((sg.n) aVar).f51650a)));
                                    } else if (aVar instanceof sg.u) {
                                        eVar.d(" ");
                                    } else if (aVar instanceof sg.g) {
                                        eVar.d("\n");
                                    } else if (aVar instanceof sg.w) {
                                        numValueOf = Integer.valueOf(dVar.i(vg.d.f54024d));
                                    } else if (aVar instanceof d0) {
                                        String text4 = ((d0) aVar).f51634a;
                                        kotlin.jvm.internal.m.f(text4, "text");
                                        eVar.d(text4);
                                    } else if (aVar instanceof sg.o) {
                                        numValueOf = Integer.valueOf(dVar.i(new vg.g(((sg.o) aVar).f51653b)));
                                    }
                                }
                                numValueOf = null;
                            }
                            ArrayList arrayListH2 = ry.m.H0(ns.o.K(new rg.a(qVar, true, numValueOf)), listK);
                            if (aVar instanceof d0) {
                                i15 = 1;
                            } else {
                                i15 = 1;
                            }
                            listK = arrayListH2;
                        }
                        ArrayList arrayListH3 = ry.m.H0(ns.o.K(new rg.a(qVar, true, numValueOf)), listK);
                        if (aVar instanceof d0) {
                            i15 = 1;
                        } else {
                            i15 = 1;
                        }
                        listK = arrayListH3;
                    } else {
                        str = str;
                        rVar3 = rVar3;
                        i15 = i14;
                    }
                    if (num != null) {
                        eVar.f(num.intValue());
                    }
                    i14 = i15;
                    str = str;
                    rVar3 = rVar3;
                }
                rVar4 = rVar3;
                vg.m mVar2 = new vg.m(eVar.j(), ry.x.h0((LinkedHashMap) dVar.f47751c));
                sVar.o0(mVar2);
                objQ = mVar2;
            } else {
                dVar = new qh.d();
                eVar = (j3.e) dVar.f47750b;
                listK = ns.o.K(new rg.a(astNode, false, null));
                while (!listK.isEmpty()) {
                    rg.a aVar6 = (rg.a) ry.m.q0(listK);
                    qVar = aVar6.f49242a;
                    z12 = aVar6.f49243b;
                    num = aVar6.f49244c;
                    kotlin.jvm.internal.m.f(qVar, str);
                    aVar = qVar.f51656a;
                    listK = ry.m.k0(listK, i14);
                    if (z12) {
                        z13 = aVar instanceof sg.b;
                        if (z13) {
                            int i110 = dVar.i(vg.e.f54026d);
                            String text5 = ((sg.b) aVar).f51630a;
                            kotlin.jvm.internal.m.f(text5, "text");
                            eVar.d(text5);
                            eVar.f(i110);
                            numValueOf = null;
                        } else if (aVar instanceof sg.e) {
                            numValueOf = Integer.valueOf(dVar.i(vg.f.f54028d));
                        } else {
                            if (aVar instanceof sg.v) {
                                numValueOf = Integer.valueOf(dVar.i(vg.h.f54032d));
                            } else {
                                if (aVar instanceof sg.k) {
                                    str = str;
                                    rVar3 = rVar3;
                                    z13 = z13;
                                    vg.a aVar7 = new vg.a(new f2(23), new t1.d(new l0.g(aVar, 1), true, 786218717), 2);
                                    String string3 = UUID.randomUUID().toString();
                                    kotlin.jvm.internal.m.e(string3, "toString(...)");
                                    ((LinkedHashMap) dVar.f47751c).put("inline:".concat(string3), aVar7);
                                    o0.o((j3.e) dVar.f47750b, string3, "�");
                                } else {
                                    str = str;
                                    rVar3 = rVar3;
                                    z13 = z13;
                                    if (aVar instanceof sg.n) {
                                        numValueOf = Integer.valueOf(dVar.i(new vg.g(((sg.n) aVar).f51650a)));
                                    } else if (aVar instanceof sg.u) {
                                        eVar.d(" ");
                                    } else if (aVar instanceof sg.g) {
                                        eVar.d("\n");
                                    } else if (aVar instanceof sg.w) {
                                        numValueOf = Integer.valueOf(dVar.i(vg.d.f54024d));
                                    } else if (aVar instanceof d0) {
                                        String text6 = ((d0) aVar).f51634a;
                                        kotlin.jvm.internal.m.f(text6, "text");
                                        eVar.d(text6);
                                    } else if (aVar instanceof sg.o) {
                                        numValueOf = Integer.valueOf(dVar.i(new vg.g(((sg.o) aVar).f51653b)));
                                    }
                                }
                                numValueOf = null;
                            }
                            ArrayList arrayListH4 = ry.m.H0(ns.o.K(new rg.a(qVar, true, numValueOf)), listK);
                            if (aVar instanceof d0) {
                                i15 = 1;
                            } else {
                                i15 = 1;
                            }
                            listK = arrayListH4;
                        }
                        ArrayList arrayListH5 = ry.m.H0(ns.o.K(new rg.a(qVar, true, numValueOf)), listK);
                        if (aVar instanceof d0) {
                            i15 = 1;
                        } else {
                            i15 = 1;
                        }
                        listK = arrayListH5;
                    } else {
                        str = str;
                        rVar3 = rVar3;
                        i15 = i14;
                    }
                    if (num != null) {
                        eVar.f(num.intValue());
                    }
                    i14 = i15;
                    str = str;
                    rVar3 = rVar3;
                }
                rVar4 = rVar3;
                vg.m mVar3 = new vg.m(eVar.j(), ry.x.h0((LinkedHashMap) dVar.f47751c));
                sVar.o0(mVar3);
                objQ = mVar3;
            }
            sVar.p(false);
            int i111 = i13 & 910;
            z1.r rVar7 = rVar4;
            c.a.c(i0Var, (vg.m) objQ, rVar7, null, false, 0, 0, sVar, i111, 60);
            rVar5 = rVar7;
        } else {
            if (i16 != 0) {
                rVar3 = z1.o.f58481a;
            } else {
                rVar3 = rVar2;
            }
            sVar.d0(-2075087027);
            i14 = 1;
            if ((i13 & 112) == 32) {
                z11 = true;
            } else {
                z11 = false;
            }
            objQ = sVar.Q();
            if (z11) {
                dVar = new qh.d();
                eVar = (j3.e) dVar.f47750b;
                listK = ns.o.K(new rg.a(astNode, false, null));
                while (!listK.isEmpty()) {
                    rg.a aVar8 = (rg.a) ry.m.q0(listK);
                    qVar = aVar8.f49242a;
                    z12 = aVar8.f49243b;
                    num = aVar8.f49244c;
                    kotlin.jvm.internal.m.f(qVar, str);
                    aVar = qVar.f51656a;
                    listK = ry.m.k0(listK, i14);
                    if (z12) {
                        z13 = aVar instanceof sg.b;
                        if (z13) {
                            int i112 = dVar.i(vg.e.f54026d);
                            String text7 = ((sg.b) aVar).f51630a;
                            kotlin.jvm.internal.m.f(text7, "text");
                            eVar.d(text7);
                            eVar.f(i112);
                            numValueOf = null;
                        } else if (aVar instanceof sg.e) {
                            numValueOf = Integer.valueOf(dVar.i(vg.f.f54028d));
                        } else {
                            if (aVar instanceof sg.v) {
                                numValueOf = Integer.valueOf(dVar.i(vg.h.f54032d));
                            } else {
                                if (aVar instanceof sg.k) {
                                    str = str;
                                    rVar3 = rVar3;
                                    z13 = z13;
                                    vg.a aVar9 = new vg.a(new f2(23), new t1.d(new l0.g(aVar, 1), true, 786218717), 2);
                                    String string4 = UUID.randomUUID().toString();
                                    kotlin.jvm.internal.m.e(string4, "toString(...)");
                                    ((LinkedHashMap) dVar.f47751c).put("inline:".concat(string4), aVar9);
                                    o0.o((j3.e) dVar.f47750b, string4, "�");
                                } else {
                                    str = str;
                                    rVar3 = rVar3;
                                    z13 = z13;
                                    if (aVar instanceof sg.n) {
                                        numValueOf = Integer.valueOf(dVar.i(new vg.g(((sg.n) aVar).f51650a)));
                                    } else if (aVar instanceof sg.u) {
                                        eVar.d(" ");
                                    } else if (aVar instanceof sg.g) {
                                        eVar.d("\n");
                                    } else if (aVar instanceof sg.w) {
                                        numValueOf = Integer.valueOf(dVar.i(vg.d.f54024d));
                                    } else if (aVar instanceof d0) {
                                        String text8 = ((d0) aVar).f51634a;
                                        kotlin.jvm.internal.m.f(text8, "text");
                                        eVar.d(text8);
                                    } else if (aVar instanceof sg.o) {
                                        numValueOf = Integer.valueOf(dVar.i(new vg.g(((sg.o) aVar).f51653b)));
                                    }
                                }
                                numValueOf = null;
                            }
                            ArrayList arrayListH6 = ry.m.H0(ns.o.K(new rg.a(qVar, true, numValueOf)), listK);
                            if (aVar instanceof d0) {
                                i15 = 1;
                            } else {
                                i15 = 1;
                            }
                            listK = arrayListH6;
                        }
                        ArrayList arrayListH7 = ry.m.H0(ns.o.K(new rg.a(qVar, true, numValueOf)), listK);
                        if (aVar instanceof d0) {
                            i15 = 1;
                        } else {
                            i15 = 1;
                        }
                        listK = arrayListH7;
                    } else {
                        str = str;
                        rVar3 = rVar3;
                        i15 = i14;
                    }
                    if (num != null) {
                        eVar.f(num.intValue());
                    }
                    i14 = i15;
                    str = str;
                    rVar3 = rVar3;
                }
                rVar4 = rVar3;
                vg.m mVar4 = new vg.m(eVar.j(), ry.x.h0((LinkedHashMap) dVar.f47751c));
                sVar.o0(mVar4);
                objQ = mVar4;
            } else {
                dVar = new qh.d();
                eVar = (j3.e) dVar.f47750b;
                listK = ns.o.K(new rg.a(astNode, false, null));
                while (!listK.isEmpty()) {
                    rg.a aVar10 = (rg.a) ry.m.q0(listK);
                    qVar = aVar10.f49242a;
                    z12 = aVar10.f49243b;
                    num = aVar10.f49244c;
                    kotlin.jvm.internal.m.f(qVar, str);
                    aVar = qVar.f51656a;
                    listK = ry.m.k0(listK, i14);
                    if (z12) {
                        z13 = aVar instanceof sg.b;
                        if (z13) {
                            int i113 = dVar.i(vg.e.f54026d);
                            String text9 = ((sg.b) aVar).f51630a;
                            kotlin.jvm.internal.m.f(text9, "text");
                            eVar.d(text9);
                            eVar.f(i113);
                            numValueOf = null;
                        } else if (aVar instanceof sg.e) {
                            numValueOf = Integer.valueOf(dVar.i(vg.f.f54028d));
                        } else {
                            if (aVar instanceof sg.v) {
                                numValueOf = Integer.valueOf(dVar.i(vg.h.f54032d));
                            } else {
                                if (aVar instanceof sg.k) {
                                    str = str;
                                    rVar3 = rVar3;
                                    z13 = z13;
                                    vg.a aVar11 = new vg.a(new f2(23), new t1.d(new l0.g(aVar, 1), true, 786218717), 2);
                                    String string5 = UUID.randomUUID().toString();
                                    kotlin.jvm.internal.m.e(string5, "toString(...)");
                                    ((LinkedHashMap) dVar.f47751c).put("inline:".concat(string5), aVar11);
                                    o0.o((j3.e) dVar.f47750b, string5, "�");
                                } else {
                                    str = str;
                                    rVar3 = rVar3;
                                    z13 = z13;
                                    if (aVar instanceof sg.n) {
                                        numValueOf = Integer.valueOf(dVar.i(new vg.g(((sg.n) aVar).f51650a)));
                                    } else if (aVar instanceof sg.u) {
                                        eVar.d(" ");
                                    } else if (aVar instanceof sg.g) {
                                        eVar.d("\n");
                                    } else if (aVar instanceof sg.w) {
                                        numValueOf = Integer.valueOf(dVar.i(vg.d.f54024d));
                                    } else if (aVar instanceof d0) {
                                        String text10 = ((d0) aVar).f51634a;
                                        kotlin.jvm.internal.m.f(text10, "text");
                                        eVar.d(text10);
                                    } else if (aVar instanceof sg.o) {
                                        numValueOf = Integer.valueOf(dVar.i(new vg.g(((sg.o) aVar).f51653b)));
                                    }
                                }
                                numValueOf = null;
                            }
                            ArrayList arrayListH8 = ry.m.H0(ns.o.K(new rg.a(qVar, true, numValueOf)), listK);
                            if (aVar instanceof d0) {
                                i15 = 1;
                            } else {
                                i15 = 1;
                            }
                            listK = arrayListH8;
                        }
                        ArrayList arrayListH9 = ry.m.H0(ns.o.K(new rg.a(qVar, true, numValueOf)), listK);
                        if (aVar instanceof d0) {
                            i15 = 1;
                        } else {
                            i15 = 1;
                        }
                        listK = arrayListH9;
                    } else {
                        str = str;
                        rVar3 = rVar3;
                        i15 = i14;
                    }
                    if (num != null) {
                        eVar.f(num.intValue());
                    }
                    i14 = i15;
                    str = str;
                    rVar3 = rVar3;
                }
                rVar4 = rVar3;
                vg.m mVar5 = new vg.m(eVar.j(), ry.x.h0((LinkedHashMap) dVar.f47751c));
                sVar.o0(mVar5);
                objQ = mVar5;
            }
            sVar.p(false);
            int i114 = i13 & 910;
            z1.r rVar8 = rVar4;
            c.a.c(i0Var, (vg.m) objQ, rVar8, null, false, 0, 0, sVar, i114, 60);
            rVar5 = rVar8;
        }
        x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new androidx.lifecycle.compose.d(i0Var, astNode, rVar5, i11, i12, 8);
        }
    }

    public static final void I(boolean z11, kw.h hVar, z1.r rVar, l1.n nVar, int i11) {
        l1.s sVar = (l1.s) nVar;
        sVar.f0(918273795);
        float f5 = kw.c.f38846a;
        sVar.e0(705353685);
        c3 c3Var = v1.f31180a;
        long j11 = ((s1) sVar.j(c3Var)).f31033p;
        long j12 = ((s1) sVar.j(c3Var)).f31034q;
        kw.b bVar = new kw.b();
        bVar.f38845a = j12;
        sVar.p(false);
        float f11 = kw.c.f38852g;
        float f12 = 0;
        sVar.e0(1336199549);
        boolean zG = sVar.g(z11) | sVar.f(hVar);
        Object objQ = sVar.Q();
        if (zG || objQ == l1.m.f39353a) {
            objQ = l1.t.s(new g.d(z11, hVar));
            sVar.o0(objQ);
        }
        b3 b3Var = (b3) objQ;
        sVar.p(false);
        sVar.e0(-500159467);
        b1 b1VarH = l1.t.H(new g2.x(j11), sVar);
        sVar.p(false);
        long j13 = ((g2.x) b1VarH.getValue()).f28624a;
        long j14 = ((g2.x) bVar.b(sVar).getValue()).f28624a;
        float f13 = ((Boolean) b3Var.getValue()).booleanValue() ? f11 : 0;
        float f14 = ((Boolean) b3Var.getValue()).booleanValue() ? f12 : 0;
        r0.e eVar = kw.c.f38847b;
        z1.r rVarN = e2.n(rVar, kw.c.f38846a);
        kotlin.jvm.internal.m.f(rVarN, "<this>");
        i9.a(g0.x(rVarN, f0.q(d2.h.f(z1.o.f58481a, kw.d.f38855c), new a0.o0(hVar, 19))), eVar, j13, j14, f13, f14, null, t1.e.b(sVar, 1346147486, new z4(z11, bVar, hVar)), sVar, 12582960, 64);
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new z4(z11, hVar, rVar, bVar, f11, f12, i11);
        }
    }

    public static final void J(kw.h hVar, long j11, z1.r rVar, l1.n nVar, int i11) {
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1063991473);
        sVar.e0(941720851);
        Object objQ = sVar.Q();
        l1.g gVar = l1.m.f39353a;
        Object obj = objQ;
        if (objQ == gVar) {
            g2.k kVarA = g2.o.a();
            kVarA.k(1);
            sVar.o0(kVarA);
            obj = kVarA;
        }
        p0 p0Var = (p0) obj;
        sVar.p(false);
        sVar.e0(941720937);
        boolean zF = sVar.f(hVar);
        Object objQ2 = sVar.Q();
        if (zF || objQ2 == gVar) {
            objQ2 = l1.t.s(new kw.e(hVar, 0));
            sVar.o0(objQ2);
        }
        sVar.p(false);
        b3 b3VarB = b0.h.b(((Number) ((b3) objQ2).getValue()).floatValue(), kw.c.f38853h, "alphaState", sVar, 3120, 20);
        d0.n.b(0, new j1.e(hVar, b3VarB, j11, p0Var, 1), sVar, g3.r.b(rVar, false, kw.d.f38854b));
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new q1(hVar, j11, rVar, i11);
        }
    }

    public static final boolean K(c2.g gVar, long j11) {
        if (!gVar.f58482a.P) {
            return false;
        }
        y2.v vVar = (y2.v) y2.f.x(gVar).f56892i0.f50086d;
        if (!vVar.f57011t0.P) {
            return false;
        }
        long jP = vVar.P(0L);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jP >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jP & 4294967295L));
        long j12 = gVar.S;
        float f5 = ((int) (j12 >> 32)) + fIntBitsToFloat;
        float f11 = ((int) (j12 & 4294967295L)) + fIntBitsToFloat2;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j11 >> 32));
        if (fIntBitsToFloat > fIntBitsToFloat3 || fIntBitsToFloat3 > f5) {
            return false;
        }
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j11 & 4294967295L));
        return fIntBitsToFloat2 <= fIntBitsToFloat4 && fIntBitsToFloat4 <= f11;
    }

    public static void L(StringBuilder sb2, Object obj, fz.c cVar) {
        if (cVar != null) {
            sb2.append((CharSequence) cVar.invoke(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            sb2.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb2.append(((Character) obj).charValue());
        } else {
            sb2.append((CharSequence) obj.toString());
        }
    }

    public static final Object M(Task task, xy.c cVar) throws Exception {
        if (!task.isComplete()) {
            rz.m mVar = new rz.m(1, ue.f.x(cVar));
            mVar.s();
            task.addOnCompleteListener(b00.a.f3758a, new b00.b(mVar));
            Object objR = mVar.r();
            wy.a aVar = wy.a.COROUTINE_SUSPENDED;
            return objR;
        }
        Exception exception = task.getException();
        if (exception != null) {
            throw exception;
        }
        if (!task.isCanceled()) {
            return task.getResult();
        }
        throw new CancellationException("Task " + task + " was cancelled normally.");
    }

    public static final vb.i N(Context context) {
        final vb.e eVar = new vb.e(context);
        final int i11 = 0;
        qy.q qVarV = com.bumptech.glide.d.v(new fz.a() { // from class: vb.d
            @Override // fz.a
            public final Object invoke() {
                int largeMemoryClass;
                yb.h hVar;
                switch (i11) {
                    case 0:
                        Context context2 = eVar.f53817a;
                        Bitmap.Config[] configArr = kc.h.f38057a;
                        double d5 = 0.2d;
                        try {
                            Object systemService = context2.getSystemService((Class<Object>) ActivityManager.class);
                            m.c(systemService);
                            if (((ActivityManager) systemService).isLowRamDevice()) {
                                d5 = 0.15d;
                            }
                        } catch (Exception unused) {
                        }
                        int i12 = 0;
                        c0 c0Var = new c0(3, (byte) 0);
                        if (d5 > 0.0d) {
                            Bitmap.Config[] configArr2 = kc.h.f38057a;
                            try {
                                Object systemService2 = context2.getSystemService((Class<Object>) ActivityManager.class);
                                m.c(systemService2);
                                ActivityManager activityManager = (ActivityManager) systemService2;
                                largeMemoryClass = (context2.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
                            } catch (Exception unused2) {
                                largeMemoryClass = 256;
                            }
                            double d11 = d5 * ((double) largeMemoryClass);
                            double d12 = 1024;
                            i12 = (int) (d11 * d12 * d12);
                            break;
                        }
                        return new ec.c(i12 > 0 ? new ob.e(i12, c0Var) : new hd.b(c0Var, 10), c0Var);
                    default:
                        e eVar2 = eVar;
                        l lVar = l.f38070a;
                        Context context3 = eVar2.f53817a;
                        synchronized (lVar) {
                            try {
                                hVar = l.f38071b;
                                if (hVar == null) {
                                    x xVar = o.f40737a;
                                    yz.f fVar = rz.o0.f50940a;
                                    yz.e eVar3 = yz.e.f58387a;
                                    Bitmap.Config[] configArr3 = kc.h.f38057a;
                                    File cacheDir = context3.getCacheDir();
                                    if (cacheDir == null) {
                                        throw new IllegalStateException("cacheDir == null");
                                    }
                                    cacheDir.mkdirs();
                                    File fileU = k.U(cacheDir);
                                    String str = a0.f40673b;
                                    a0 a0VarN = p20.c.n(fileU);
                                    long jN = 10485760;
                                    try {
                                        File file = a0VarN.toFile();
                                        file.mkdir();
                                        StatFs statFs = new StatFs(file.getAbsolutePath());
                                        jN = hz.b.n((long) (0.02d * statFs.getBlockCountLong() * statFs.getBlockSizeLong()), 10485760L, 262144000L);
                                        break;
                                    } catch (Exception unused3) {
                                    }
                                    yb.h hVar2 = new yb.h(jN, xVar, a0VarN, eVar3);
                                    l.f38071b = hVar2;
                                    hVar = hVar2;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        return hVar;
                }
            }
        });
        final int i12 = 1;
        qy.q qVarV2 = com.bumptech.glide.d.v(new fz.a() { // from class: vb.d
            @Override // fz.a
            public final Object invoke() {
                int largeMemoryClass;
                yb.h hVar;
                switch (i12) {
                    case 0:
                        Context context2 = eVar.f53817a;
                        Bitmap.Config[] configArr = kc.h.f38057a;
                        double d5 = 0.2d;
                        try {
                            Object systemService = context2.getSystemService((Class<Object>) ActivityManager.class);
                            m.c(systemService);
                            if (((ActivityManager) systemService).isLowRamDevice()) {
                                d5 = 0.15d;
                            }
                        } catch (Exception unused) {
                        }
                        int i13 = 0;
                        c0 c0Var = new c0(3, (byte) 0);
                        if (d5 > 0.0d) {
                            Bitmap.Config[] configArr2 = kc.h.f38057a;
                            try {
                                Object systemService2 = context2.getSystemService((Class<Object>) ActivityManager.class);
                                m.c(systemService2);
                                ActivityManager activityManager = (ActivityManager) systemService2;
                                largeMemoryClass = (context2.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
                            } catch (Exception unused2) {
                                largeMemoryClass = 256;
                            }
                            double d11 = d5 * ((double) largeMemoryClass);
                            double d12 = 1024;
                            i13 = (int) (d11 * d12 * d12);
                            break;
                        }
                        return new ec.c(i13 > 0 ? new ob.e(i13, c0Var) : new hd.b(c0Var, 10), c0Var);
                    default:
                        e eVar2 = eVar;
                        l lVar = l.f38070a;
                        Context context3 = eVar2.f53817a;
                        synchronized (lVar) {
                            try {
                                hVar = l.f38071b;
                                if (hVar == null) {
                                    x xVar = o.f40737a;
                                    yz.f fVar = rz.o0.f50940a;
                                    yz.e eVar3 = yz.e.f58387a;
                                    Bitmap.Config[] configArr3 = kc.h.f38057a;
                                    File cacheDir = context3.getCacheDir();
                                    if (cacheDir == null) {
                                        throw new IllegalStateException("cacheDir == null");
                                    }
                                    cacheDir.mkdirs();
                                    File fileU = k.U(cacheDir);
                                    String str = a0.f40673b;
                                    a0 a0VarN = p20.c.n(fileU);
                                    long jN = 10485760;
                                    try {
                                        File file = a0VarN.toFile();
                                        file.mkdir();
                                        StatFs statFs = new StatFs(file.getAbsolutePath());
                                        jN = hz.b.n((long) (0.02d * statFs.getBlockCountLong() * statFs.getBlockSizeLong()), 10485760L, 262144000L);
                                        break;
                                    } catch (Exception unused3) {
                                    }
                                    yb.h hVar2 = new yb.h(jN, xVar, a0VarN, eVar3);
                                    l.f38071b = hVar2;
                                    hVar = hVar2;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        return hVar;
                }
            }
        });
        qy.q qVarV3 = com.bumptech.glide.d.v(new uu.f(i12));
        ry.r rVar = ry.r.f50854a;
        return new vb.i(eVar.f53817a, eVar.f53818b, qVarV, qVarV2, qVarV3, new vb.b(rVar, rVar, rVar, rVar, rVar), eVar.f53819c);
    }

    public static final float P(l1.n nVar, int i11) {
        l1.s sVar = (l1.s) nVar;
        return ((Resources) sVar.j(AndroidCompositionLocals_androidKt.f1201c)).getDimension(i11) / ((v3.c) sVar.j(g1.f58547h)).getDensity();
    }

    public static final float Q(Layout layout, int i11, Paint paint) {
        float fAbs;
        float width;
        float lineLeft = layout.getLineLeft(i11);
        ThreadLocal threadLocal = k3.s.f37905a;
        if (layout.getEllipsisCount(i11) <= 0 || layout.getParagraphDirection(i11) != 1 || lineLeft >= CropImageView.DEFAULT_ASPECT_RATIO) {
            return CropImageView.DEFAULT_ASPECT_RATIO;
        }
        float fMeasureText = paint.measureText("…") + (layout.getPrimaryHorizontal(layout.getEllipsisStart(i11) + layout.getLineStart(i11)) - lineLeft);
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i11);
        if ((paragraphAlignment == null ? -1 : m3.d.f40835a[paragraphAlignment.ordinal()]) == 1) {
            fAbs = Math.abs(lineLeft);
            width = (layout.getWidth() - fMeasureText) / 2.0f;
        } else {
            fAbs = Math.abs(lineLeft);
            width = layout.getWidth() - fMeasureText;
        }
        return width + fAbs;
    }

    public static final float R(Layout layout, int i11, Paint paint) {
        float width;
        float width2;
        ThreadLocal threadLocal = k3.s.f37905a;
        if (layout.getEllipsisCount(i11) <= 0) {
            return CropImageView.DEFAULT_ASPECT_RATIO;
        }
        if (layout.getParagraphDirection(i11) != -1 || layout.getWidth() >= layout.getLineRight(i11)) {
            return CropImageView.DEFAULT_ASPECT_RATIO;
        }
        float fMeasureText = paint.measureText("…") + (layout.getLineRight(i11) - layout.getPrimaryHorizontal(layout.getEllipsisStart(i11) + layout.getLineStart(i11)));
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i11);
        if ((paragraphAlignment != null ? m3.d.f40835a[paragraphAlignment.ordinal()] : -1) == 1) {
            width = layout.getWidth() - layout.getLineRight(i11);
            width2 = (layout.getWidth() - fMeasureText) / 2.0f;
        } else {
            width = layout.getWidth() - layout.getLineRight(i11);
            width2 = layout.getWidth() - fMeasureText;
        }
        return width - width2;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0022  */
    public static Long[] S() {
        long j11;
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        int i11 = cf.x.n().keyLanguage;
        if (i11 != 22 && i11 != 40 && i11 != 48 && i11 != 54 && i11 != 55) {
            switch (i11) {
                case 14:
                case 15:
                case 16:
                case 17:
                    j11 = 2;
                    break;
                default:
                    j11 = 1;
                    break;
            }
        } else {
            j11 = 2;
        }
        if (ij.d.f34419e == null) {
            synchronized (ij.d.class) {
                if (ij.d.f34419e == null) {
                    LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                    kotlin.jvm.internal.m.c(lingoSkillApplication2);
                    ij.d.f34419e = new ij.d(lingoSkillApplication2);
                }
            }
        }
        ij.d dVar = ij.d.f34419e;
        kotlin.jvm.internal.m.c(dVar);
        Object objLoad = dVar.q().load(Long.valueOf(j11));
        kotlin.jvm.internal.m.e(objLoad, "load(...)");
        Long[] lArrV = ew.a.v(((Level) objLoad).getUnitList());
        kotlin.jvm.internal.m.e(lArrV, "parseIdLst(...)");
        ArrayList arrayListL0 = ry.l.l0(lArrV);
        if (cf.x.n().keyLanguage == 1) {
            arrayListL0.remove(ns.o.A(arrayListL0));
            if (FirebaseRemoteConfig.d().b("jp_test_new_unit1") && ry.l.D(new Integer[]{3, 9}, Integer.valueOf(cf.x.n().locateLanguage)) && cf.x.n().keyLanguage == 1) {
                arrayListL0.set(0, 150L);
            }
        }
        return (Long[]) arrayListL0.toArray(new Long[0]);
    }

    public static final void T(CourseLesson lesson, fz.e onClickLesson, b1 currentClickLesson, b1 showRedoPanel, b1 showDialogueSpeakingRedoPanel, fz.a aVar) {
        kotlin.jvm.internal.m.f(lesson, "lesson");
        kotlin.jvm.internal.m.f(onClickLesson, "onClickLesson");
        kotlin.jvm.internal.m.f(currentClickLesson, "currentClickLesson");
        kotlin.jvm.internal.m.f(showRedoPanel, "showRedoPanel");
        kotlin.jvm.internal.m.f(showDialogueSpeakingRedoPanel, "showDialogueSpeakingRedoPanel");
        int i11 = nt.a.f44046b[lesson.getLessonState().ordinal()];
        if (i11 == 1) {
            aVar.invoke();
            return;
        }
        if (i11 == 2) {
            int i12 = nt.a.f44045a[lesson.getLessonType().ordinal()];
            if (i12 == 1) {
                onClickLesson.invoke(lesson, CourseLessonPracticeType.CourseLessonStart);
                return;
            }
            if (i12 == 2) {
                onClickLesson.invoke(lesson, CourseLessonPracticeType.CourseLessonDialogueWarmup);
                return;
            }
            if (i12 == 3) {
                onClickLesson.invoke(lesson, CourseLessonPracticeType.CourseLessonDialoguePractice);
                return;
            } else if (i12 == 4) {
                onClickLesson.invoke(lesson, CourseLessonPracticeType.CourseLessonDialogueSpeaking);
                return;
            } else {
                if (i12 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                onClickLesson.invoke(lesson, CourseLessonPracticeType.CourseLessonCoffeeBreak);
                return;
            }
        }
        if (i11 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        int i13 = nt.a.f44045a[lesson.getLessonType().ordinal()];
        if (i13 == 1) {
            currentClickLesson.setValue(lesson);
            showRedoPanel.setValue(Boolean.TRUE);
            return;
        }
        if (i13 == 2) {
            onClickLesson.invoke(lesson, CourseLessonPracticeType.CourseLessonDialogueWarmup);
            return;
        }
        if (i13 == 3) {
            onClickLesson.invoke(lesson, CourseLessonPracticeType.CourseLessonDialoguePractice);
        } else if (i13 == 4) {
            onClickLesson.invoke(lesson, CourseLessonPracticeType.CourseLessonDialogueSpeaking);
        } else {
            if (i13 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            onClickLesson.invoke(lesson, CourseLessonPracticeType.CourseLessonCoffeeBreak);
        }
    }

    public static final long U(long j11, float f5) {
        return (Float.isNaN(f5) || f5 >= 1.0f) ? j11 : g2.x.c(j11, g2.x.e(j11) * f5);
    }

    public static wm.a V() {
        if (wm.a.f55177e == null) {
            synchronized (wm.a.class) {
                if (wm.a.f55177e == null) {
                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                    kotlin.jvm.internal.m.c(lingoSkillApplication);
                    wm.a.f55177e = new wm.a(lingoSkillApplication);
                }
            }
        }
        wm.a aVar = wm.a.f55177e;
        kotlin.jvm.internal.m.c(aVar);
        return aVar;
    }

    public static pd.i W(Context context) {
        pd.i iVar = new pd.i(new qd.d(new ob.u(context.getApplicationContext(), 29)), new ob.e(new p3(26)));
        pd.b bVar = iVar.f46795i;
        if (bVar != null) {
            bVar.f46774e = true;
            bVar.interrupt();
        }
        for (pd.d dVar : iVar.f46794h) {
            if (dVar != null) {
                dVar.f46782e = true;
                dVar.interrupt();
            }
        }
        pd.b bVar2 = new pd.b(iVar.f46789c, iVar.f46790d, iVar.f46791e, iVar.f46793g);
        iVar.f46795i = bVar2;
        bVar2.start();
        for (int i11 = 0; i11 < iVar.f46794h.length; i11++) {
            pd.d dVar2 = new pd.d(iVar.f46790d, iVar.f46792f, iVar.f46791e, iVar.f46793g);
            iVar.f46794h[i11] = dVar2;
            dVar2.start();
        }
        return iVar;
    }

    public static final int X(m0.q qVar, h1 h1Var) {
        return (int) (h1Var == h1.Vertical ? qVar.f40619o & 4294967295L : qVar.f40619o >> 32);
    }

    public static ya.j Y(String str) {
        String strGroup;
        if (str == null || oz.q.K0(str)) {
            return null;
        }
        Matcher matcher = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?").matcher(str);
        if (!matcher.matches() || (strGroup = matcher.group(1)) == null) {
            return null;
        }
        int i11 = Integer.parseInt(strGroup);
        String strGroup2 = matcher.group(2);
        if (strGroup2 == null) {
            return null;
        }
        int i12 = Integer.parseInt(strGroup2);
        String strGroup3 = matcher.group(3);
        if (strGroup3 == null) {
            return null;
        }
        int i13 = Integer.parseInt(strGroup3);
        String strGroup4 = matcher.group(4) != null ? matcher.group(4) : BuildConfig.VERSION_NAME;
        kotlin.jvm.internal.m.c(strGroup4);
        return new ya.j(strGroup4, i11, i12, i13);
    }

    public static final float Z(long j11, float f5, v3.c cVar) {
        if (v3.o.a(j11, v3.o.f53501c)) {
            return f5;
        }
        long jB = v3.o.b(j11);
        if (v3.p.a(jB, 4294967296L)) {
            return cVar.y0(j11);
        }
        if (v3.p.a(jB, 8589934592L)) {
            return v3.o.c(j11) * f5;
        }
        return Float.NaN;
    }

    public static final float a0(long j11, float f5, v3.c cVar) {
        float fC;
        long jB = v3.o.b(j11);
        if (v3.p.a(jB, 4294967296L)) {
            if (cVar.Z() <= 1.05d) {
                return cVar.y0(j11);
            }
            fC = v3.o.c(j11) / v3.o.c(cVar.K(f5));
        } else {
            if (!v3.p.a(jB, 8589934592L)) {
                return Float.NaN;
            }
            fC = v3.o.c(j11);
        }
        return fC * f5;
    }

    public static final void b0(Spannable spannable, long j11, int i11, int i12) {
        if (j11 != 16) {
            spannable.setSpan(new ForegroundColorSpan(f0.E(j11)), i11, i12, 33);
        }
    }

    public static final void c0(Spannable spannable, long j11, v3.c cVar, int i11, int i12) {
        long jB = v3.o.b(j11);
        if (v3.p.a(jB, 4294967296L)) {
            spannable.setSpan(new AbsoluteSizeSpan(hz.b.Q(cVar.y0(j11)), false), i11, i12, 33);
        } else if (v3.p.a(jB, 8589934592L)) {
            spannable.setSpan(new RelativeSizeSpan(v3.o.c(j11)), i11, i12, 33);
        }
    }

    public static final void d0(Spannable spannable, q3.b bVar, int i11, int i12) {
        if (bVar != null) {
            ArrayList arrayList = new ArrayList(ry.n.W(bVar, 10));
            Iterator it = bVar.f47419a.iterator();
            while (it.hasNext()) {
                arrayList.add(((q3.a) it.next()).f47417a);
            }
            Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
            spannable.setSpan(new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length))), i11, i12, 33);
        }
    }

    @Override // f00.c
    public byte A() {
        O();
        throw null;
    }

    @Override // f00.c
    public short B() {
        O();
        throw null;
    }

    @Override // f00.c
    public float C() {
        O();
        throw null;
    }

    @Override // f00.a
    public long D(e00.g descriptor, int i11) {
        kotlin.jvm.internal.m.f(descriptor, "descriptor");
        return o();
    }

    @Override // f00.c
    public double E() {
        O();
        throw null;
    }

    public void O() {
        throw new SerializationException(kotlin.jvm.internal.z.a(getClass()) + " can't retrieve untyped values");
    }

    public void c(e00.g descriptor) {
        kotlin.jvm.internal.m.f(descriptor, "descriptor");
    }

    @Override // f00.c
    public f00.a d(e00.g descriptor) {
        kotlin.jvm.internal.m.f(descriptor, "descriptor");
        return this;
    }

    @Override // f00.a
    public double e(e00.g descriptor, int i11) {
        kotlin.jvm.internal.m.f(descriptor, "descriptor");
        return E();
    }

    @Override // f00.c
    public boolean f() {
        O();
        throw null;
    }

    @Override // f00.c
    public char g() {
        O();
        throw null;
    }

    @Override // f00.a
    public short h(i1 descriptor, int i11) {
        kotlin.jvm.internal.m.f(descriptor, "descriptor");
        return B();
    }

    @Override // f00.c
    public int j() {
        O();
        throw null;
    }

    @Override // f00.a
    public String k(e00.g descriptor, int i11) {
        kotlin.jvm.internal.m.f(descriptor, "descriptor");
        return l();
    }

    @Override // f00.c
    public String l() {
        O();
        throw null;
    }

    @Override // f00.a
    public char m(i1 descriptor, int i11) {
        kotlin.jvm.internal.m.f(descriptor, "descriptor");
        return g();
    }

    @Override // f00.c
    public long o() {
        O();
        throw null;
    }

    @Override // f00.a
    public int p(e00.g descriptor, int i11) {
        kotlin.jvm.internal.m.f(descriptor, "descriptor");
        return j();
    }

    @Override // f00.a
    public f00.c q(i1 descriptor, int i11) {
        kotlin.jvm.internal.m.f(descriptor, "descriptor");
        return u(descriptor.i(i11));
    }

    @Override // f00.c
    public boolean r() {
        return true;
    }

    public Object t(e00.g descriptor, int i11, c00.a deserializer, Object obj) {
        kotlin.jvm.internal.m.f(descriptor, "descriptor");
        kotlin.jvm.internal.m.f(deserializer, "deserializer");
        return x(deserializer);
    }

    @Override // f00.a
    public float v(e00.g descriptor, int i11) {
        kotlin.jvm.internal.m.f(descriptor, "descriptor");
        return C();
    }

    @Override // f00.a
    public boolean w(e00.g descriptor, int i11) {
        kotlin.jvm.internal.m.f(descriptor, "descriptor");
        return f();
    }

    @Override // f00.c
    public Object x(c00.a deserializer) {
        kotlin.jvm.internal.m.f(deserializer, "deserializer");
        return deserializer.deserialize(this);
    }

    @Override // f00.a
    public byte y(i1 descriptor, int i11) {
        kotlin.jvm.internal.m.f(descriptor, "descriptor");
        return A();
    }

    @Override // f00.c
    public int z(e00.g enumDescriptor) {
        kotlin.jvm.internal.m.f(enumDescriptor, "enumDescriptor");
        O();
        throw null;
    }

    @Override // f00.a
    public Object s(e00.g descriptor, int i11, c00.a aVar, Object obj) {
        kotlin.jvm.internal.m.f(descriptor, "descriptor");
        kotlin.jvm.internal.m.f(aVar, evRpcb.uMQXjYd);
        if (aVar.getDescriptor().c() || r()) {
            return x(aVar);
        }
        return null;
    }

    @Override // f00.c
    public f00.c u(e00.g gVar) {
        kotlin.jvm.internal.m.f(gVar, bjXGJ.RUWRquJ);
        return this;
    }
}
