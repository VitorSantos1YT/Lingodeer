package md;

import a0.c2;
import android.content.Context;
import android.content.Intent;
import android.graphics.Matrix;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import android.webkit.WebView;
import b7.e0;
import com.adjust.sdk.Constants;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.facebook.FacebookException;
import com.lingo.fluent.ui.base.PdFinishActivity;
import com.lingo.lingoskill.speak.ui.SpeakLeadBoardActivity;
import com.lingodeer.data.env.Env;
import com.lingodeer.data.model.CourseSentence;
import com.lingodeer.data.model.CourseWord;
import com.lingodeer.data.model.INTENTS;
import com.tbruyelle.rxpermissions3.BuildConfig;
import d0.i;
import d0.s1;
import f0.l;
import f0.t0;
import fr.o0;
import g00.n1;
import hh.p0;
import hh.y;
import j0.f;
import j0.h;
import j0.v1;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import jt.m1;
import jt.o1;
import jt.p1;
import jt.v0;
import ju.d;
import l1.a1;
import l1.b1;
import l1.b3;
import l1.g;
import l1.m;
import l1.n;
import l1.s;
import l1.t;
import l1.x1;
import lf.j1;
import m0.c;
import m0.e;
import m0.p;
import m0.x;
import m0.z;
import o3.w;
import okhttp3.internal.platform.ZjS.OYAvlbfUyD;
import org.json.JSONException;
import org.json.JSONObject;
import oz.q;
import qp.o2;
import re.b;
import rz.b0;
import rz.i0;
import vt.n0;
import w1.j;
import z1.o;
import z1.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    /* JADX WARN: Code duplicated, block: B:100:0x0183  */
    /* JADX WARN: Code duplicated, block: B:105:0x0190 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:106:0x0192  */
    /* JADX WARN: Code duplicated, block: B:108:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:111:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:19:0x003c  */
    /* JADX WARN: Code duplicated, block: B:21:0x0042  */
    /* JADX WARN: Code duplicated, block: B:22:0x0045  */
    /* JADX WARN: Code duplicated, block: B:26:0x0050  */
    /* JADX WARN: Code duplicated, block: B:28:0x0054  */
    /* JADX WARN: Code duplicated, block: B:30:0x005c  */
    /* JADX WARN: Code duplicated, block: B:31:0x005f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0065  */
    /* JADX WARN: Code duplicated, block: B:37:0x006d  */
    /* JADX WARN: Code duplicated, block: B:39:0x0071  */
    /* JADX WARN: Code duplicated, block: B:41:0x0074  */
    /* JADX WARN: Code duplicated, block: B:43:0x007c  */
    /* JADX WARN: Code duplicated, block: B:44:0x007f  */
    /* JADX WARN: Code duplicated, block: B:48:0x008d  */
    /* JADX WARN: Code duplicated, block: B:49:0x008f  */
    /* JADX WARN: Code duplicated, block: B:52:0x009f  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:69:0x00e6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:71:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:74:0x0104 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:75:0x0106  */
    /* JADX WARN: Code duplicated, block: B:78:0x011f  */
    /* JADX WARN: Code duplicated, block: B:79:0x0124  */
    /* JADX WARN: Code duplicated, block: B:81:0x0128  */
    /* JADX WARN: Code duplicated, block: B:82:0x012b  */
    /* JADX WARN: Code duplicated, block: B:85:0x013a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:86:0x013c  */
    /* JADX WARN: Code duplicated, block: B:90:0x016a  */
    /* JADX WARN: Code duplicated, block: B:92:0x0170  */
    /* JADX WARN: Code duplicated, block: B:98:0x017d  */
    public static final void a(c cVar, r rVar, x xVar, v1 v1Var, h hVar, f fVar, t0 t0Var, boolean z11, i iVar, fz.c cVar2, n nVar, int i11, int i12) {
        r rVar2;
        int i13;
        int i14;
        h hVar2;
        int i15;
        f fVar2;
        int i16;
        int i17;
        int i18;
        boolean z12;
        boolean z13;
        s sVar;
        x xVar2;
        boolean z14;
        r rVar3;
        h hVar3;
        f fVar3;
        t0 t0Var2;
        i iVar2;
        x1 x1VarT;
        int i19;
        r rVar4;
        boolean zD;
        Object objQ;
        int i21;
        int i22;
        h hVar4;
        f fVar4;
        b0.x xVarA;
        boolean zF;
        Object objQ2;
        int i23;
        r rVar5;
        x xVar3;
        h hVar5;
        t0 t0Var3;
        boolean z15;
        boolean z16;
        i iVarA;
        int i24;
        boolean z17;
        Object objQ3;
        int i25;
        s sVar2 = (s) nVar;
        sVar2.f0(-2072102870);
        int i26 = (sVar2.f(cVar) ? 4 : 2) | i11;
        int i27 = i12 & 2;
        if (i27 == 0) {
            if ((i11 & 48) == 0) {
                rVar2 = rVar;
                i26 |= sVar2.f(rVar2) ? 32 : 16;
            }
            i13 = i26 | 128;
            if ((i11 & 3072) == 0) {
                if (sVar2.f(v1Var)) {
                    i25 = 2048;
                } else {
                    i25 = 1024;
                }
                i13 |= i25;
            }
            i14 = i13 | 24576;
            if ((i11 & 196608) == 0) {
                if ((i12 & 32) == 0) {
                    hVar2 = hVar;
                    int i28 = sVar2.f(hVar2) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536;
                    i14 |= i28;
                } else {
                    hVar2 = hVar;
                }
                i14 |= i28;
            } else {
                hVar2 = hVar;
            }
            i15 = i12 & 64;
            if (i15 != 0) {
                if ((1572864 & i11) == 0) {
                    fVar2 = fVar;
                    if (sVar2.f(fVar2)) {
                        i16 = 1048576;
                    } else {
                        i16 = 524288;
                    }
                    i14 |= i16;
                }
                i17 = i14 | 373293056;
                if (sVar2.h(cVar2)) {
                    i18 = 4;
                } else {
                    i18 = 2;
                }
                z12 = false;
                if ((i17 & 306783379) == 306783378 || (i18 & 3) != 2) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (sVar2.T(i17 & 1, z13)) {
                    sVar2.Y();
                    i19 = i11 & 1;
                    g gVar = m.f39353a;
                    if (i19 != 0 || sVar2.C()) {
                        if (i27 != 0) {
                            rVar4 = o.f58481a;
                        } else {
                            rVar4 = rVar2;
                        }
                        p pVar = z.f40671a;
                        Object[] objArr = new Object[0];
                        o2 o2Var = x.f40649w;
                        zD = sVar2.d(0) | sVar2.d(0);
                        objQ = sVar2.Q();
                        if (zD || objQ == gVar) {
                            objQ = new d(12);
                            sVar2.o0(objQ);
                        }
                        z12 = false;
                        x xVar4 = (x) j.d(objArr, o2Var, (fz.a) objQ, sVar2, 0);
                        i21 = i17 & (-897);
                        if ((i12 & 32) != 0) {
                            hVar4 = j0.i.f35305c;
                            i22 = i17 & (-459649);
                        } else {
                            i22 = i21;
                            hVar4 = hVar2;
                        }
                        if (i15 != 0) {
                            fVar4 = j0.i.f35303a;
                        } else {
                            fVar4 = fVar2;
                        }
                        xVarA = c2.a(sVar2);
                        zF = sVar2.f(xVarA);
                        objQ2 = sVar2.Q();
                        if (zF || objQ2 == gVar) {
                            objQ2 = new l(xVarA);
                            sVar2.o0(objQ2);
                        }
                        l lVar = (l) objQ2;
                        i23 = i22 & (-1908408321);
                        rVar5 = rVar4;
                        xVar3 = xVar4;
                        hVar5 = hVar4;
                        t0Var3 = lVar;
                        z15 = true;
                        z16 = true;
                        iVarA = s1.a(sVar2);
                    } else {
                        sVar2.W();
                        int i29 = i17 & (-897);
                        if ((i12 & 32) != 0) {
                            i29 = i17 & (-459649);
                        }
                        i23 = i29 & (-1908408321);
                        xVar3 = xVar;
                        t0Var3 = t0Var;
                        z16 = z11;
                        hVar5 = hVar2;
                        fVar4 = fVar2;
                        rVar5 = rVar2;
                        z15 = true;
                        iVarA = iVar;
                    }
                    sVar2.q();
                    i24 = (i23 & 14) | ((i23 >> 15) & 112);
                    boolean z18 = ((((i24 & 14) ^ 6) > 4 || !sVar2.f(cVar)) && (i24 & 6) != 4) ? z12 : z15;
                    if ((((i24 & 112) ^ 48) <= 32 && sVar2.f(fVar4)) || (i24 & 48) == 32) {
                    }
                    z17 = z18 | z12;
                    objQ3 = sVar2.Q();
                    if (z17 || objQ3 == gVar) {
                        objQ3 = new e(new k9.p(10, cVar, fVar4));
                        sVar2.o0(objQ3);
                    }
                    sVar = sVar2;
                    f fVar5 = fVar4;
                    ns.o.a(rVar5, xVar3, (e) objQ3, v1Var, t0Var3, z16, iVarA, hVar5, fVar5, cVar2, sVar, ((i23 >> 3) & 14) | 196608 | (i23 & 7168) | 12607488 | ((i23 << 12) & 1879048192), ((i23 >> 18) & 14) | ((i18 << 3) & 112));
                    rVar3 = rVar5;
                    xVar2 = xVar3;
                    t0Var2 = t0Var3;
                    z14 = z16;
                    iVar2 = iVarA;
                    hVar3 = hVar5;
                    fVar3 = fVar5;
                } else {
                    sVar = sVar2;
                    sVar.W();
                    xVar2 = xVar;
                    z14 = z11;
                    rVar3 = rVar2;
                    hVar3 = hVar2;
                    fVar3 = fVar2;
                    t0Var2 = t0Var;
                    iVar2 = iVar;
                }
                x1VarT = sVar.t();
                if (x1VarT != null) {
                    x1VarT.f39502d = new m0.g(cVar, rVar3, xVar2, v1Var, hVar3, fVar3, t0Var2, z14, iVar2, cVar2, i11, i12);
                }
            }
            i14 |= 1572864;
            fVar2 = fVar;
            i17 = i14 | 373293056;
            if (sVar2.h(cVar2)) {
                i18 = 4;
            } else {
                i18 = 2;
            }
            z12 = false;
            if ((i17 & 306783379) == 306783378) {
                z13 = true;
            } else {
                z13 = true;
            }
            if (sVar2.T(i17 & 1, z13)) {
                sVar2.Y();
                i19 = i11 & 1;
                g gVar2 = m.f39353a;
                if (i19 != 0) {
                    if (i27 != 0) {
                        rVar4 = o.f58481a;
                    } else {
                        rVar4 = rVar2;
                    }
                    p pVar2 = z.f40671a;
                    Object[] objArr2 = new Object[0];
                    o2 o2Var2 = x.f40649w;
                    zD = sVar2.d(0) | sVar2.d(0);
                    objQ = sVar2.Q();
                    if (zD) {
                        objQ = new d(12);
                        sVar2.o0(objQ);
                    } else {
                        objQ = new d(12);
                        sVar2.o0(objQ);
                    }
                    z12 = false;
                    x xVar5 = (x) j.d(objArr2, o2Var2, (fz.a) objQ, sVar2, 0);
                    i21 = i17 & (-897);
                    if ((i12 & 32) != 0) {
                        hVar4 = j0.i.f35305c;
                        i22 = i17 & (-459649);
                    } else {
                        i22 = i21;
                        hVar4 = hVar2;
                    }
                    if (i15 != 0) {
                        fVar4 = j0.i.f35303a;
                    } else {
                        fVar4 = fVar2;
                    }
                    xVarA = c2.a(sVar2);
                    zF = sVar2.f(xVarA);
                    objQ2 = sVar2.Q();
                    if (zF) {
                        objQ2 = new l(xVarA);
                        sVar2.o0(objQ2);
                    } else {
                        objQ2 = new l(xVarA);
                        sVar2.o0(objQ2);
                    }
                    l lVar2 = (l) objQ2;
                    i23 = i22 & (-1908408321);
                    rVar5 = rVar4;
                    xVar3 = xVar5;
                    hVar5 = hVar4;
                    t0Var3 = lVar2;
                    z15 = true;
                    z16 = true;
                    iVarA = s1.a(sVar2);
                } else {
                    if (i27 != 0) {
                        rVar4 = o.f58481a;
                    } else {
                        rVar4 = rVar2;
                    }
                    p pVar3 = z.f40671a;
                    Object[] objArr3 = new Object[0];
                    o2 o2Var3 = x.f40649w;
                    zD = sVar2.d(0) | sVar2.d(0);
                    objQ = sVar2.Q();
                    if (zD) {
                        objQ = new d(12);
                        sVar2.o0(objQ);
                    } else {
                        objQ = new d(12);
                        sVar2.o0(objQ);
                    }
                    z12 = false;
                    x xVar6 = (x) j.d(objArr3, o2Var3, (fz.a) objQ, sVar2, 0);
                    i21 = i17 & (-897);
                    if ((i12 & 32) != 0) {
                        hVar4 = j0.i.f35305c;
                        i22 = i17 & (-459649);
                    } else {
                        i22 = i21;
                        hVar4 = hVar2;
                    }
                    if (i15 != 0) {
                        fVar4 = j0.i.f35303a;
                    } else {
                        fVar4 = fVar2;
                    }
                    xVarA = c2.a(sVar2);
                    zF = sVar2.f(xVarA);
                    objQ2 = sVar2.Q();
                    if (zF) {
                        objQ2 = new l(xVarA);
                        sVar2.o0(objQ2);
                    } else {
                        objQ2 = new l(xVarA);
                        sVar2.o0(objQ2);
                    }
                    l lVar3 = (l) objQ2;
                    i23 = i22 & (-1908408321);
                    rVar5 = rVar4;
                    xVar3 = xVar6;
                    hVar5 = hVar4;
                    t0Var3 = lVar3;
                    z15 = true;
                    z16 = true;
                    iVarA = s1.a(sVar2);
                }
                sVar2.q();
                i24 = (i23 & 14) | ((i23 >> 15) & 112);
                if (((i24 & 14) ^ 6) > 4) {
                }
                z12 = ((i24 & 112) ^ 48) <= 32 ? z15 : z15;
                z17 = z18 | z12;
                objQ3 = sVar2.Q();
                if (z17) {
                    objQ3 = new e(new k9.p(10, cVar, fVar4));
                    sVar2.o0(objQ3);
                } else {
                    objQ3 = new e(new k9.p(10, cVar, fVar4));
                    sVar2.o0(objQ3);
                }
                sVar = sVar2;
                f fVar6 = fVar4;
                ns.o.a(rVar5, xVar3, (e) objQ3, v1Var, t0Var3, z16, iVarA, hVar5, fVar6, cVar2, sVar, ((i23 >> 3) & 14) | 196608 | (i23 & 7168) | 12607488 | ((i23 << 12) & 1879048192), ((i23 >> 18) & 14) | ((i18 << 3) & 112));
                rVar3 = rVar5;
                xVar2 = xVar3;
                t0Var2 = t0Var3;
                z14 = z16;
                iVar2 = iVarA;
                hVar3 = hVar5;
                fVar3 = fVar6;
            } else {
                sVar = sVar2;
                sVar.W();
                xVar2 = xVar;
                z14 = z11;
                rVar3 = rVar2;
                hVar3 = hVar2;
                fVar3 = fVar2;
                t0Var2 = t0Var;
                iVar2 = iVar;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new m0.g(cVar, rVar3, xVar2, v1Var, hVar3, fVar3, t0Var2, z14, iVar2, cVar2, i11, i12);
            }
        }
        i26 |= 48;
        rVar2 = rVar;
        i13 = i26 | 128;
        if ((i11 & 3072) == 0) {
            if (sVar2.f(v1Var)) {
                i25 = 2048;
            } else {
                i25 = 1024;
            }
            i13 |= i25;
        }
        i14 = i13 | 24576;
        if ((i11 & 196608) == 0) {
            if ((i12 & 32) == 0) {
                hVar2 = hVar;
                if (sVar2.f(hVar2)) {
                }
                i14 |= i28;
            } else {
                hVar2 = hVar;
            }
            i14 |= i28;
        } else {
            hVar2 = hVar;
        }
        i15 = i12 & 64;
        if (i15 != 0) {
            if ((1572864 & i11) == 0) {
                fVar2 = fVar;
                if (sVar2.f(fVar2)) {
                    i16 = 1048576;
                } else {
                    i16 = 524288;
                }
                i14 |= i16;
            }
            i17 = i14 | 373293056;
            if (sVar2.h(cVar2)) {
                i18 = 4;
            } else {
                i18 = 2;
            }
            z12 = false;
            if ((i17 & 306783379) == 306783378) {
                z13 = true;
            } else {
                z13 = true;
            }
            if (sVar2.T(i17 & 1, z13)) {
                sVar2.Y();
                i19 = i11 & 1;
                g gVar3 = m.f39353a;
                if (i19 != 0) {
                    if (i27 != 0) {
                        rVar4 = o.f58481a;
                    } else {
                        rVar4 = rVar2;
                    }
                    p pVar4 = z.f40671a;
                    Object[] objArr4 = new Object[0];
                    o2 o2Var4 = x.f40649w;
                    zD = sVar2.d(0) | sVar2.d(0);
                    objQ = sVar2.Q();
                    if (zD) {
                        objQ = new d(12);
                        sVar2.o0(objQ);
                    } else {
                        objQ = new d(12);
                        sVar2.o0(objQ);
                    }
                    z12 = false;
                    x xVar7 = (x) j.d(objArr4, o2Var4, (fz.a) objQ, sVar2, 0);
                    i21 = i17 & (-897);
                    if ((i12 & 32) != 0) {
                        hVar4 = j0.i.f35305c;
                        i22 = i17 & (-459649);
                    } else {
                        i22 = i21;
                        hVar4 = hVar2;
                    }
                    if (i15 != 0) {
                        fVar4 = j0.i.f35303a;
                    } else {
                        fVar4 = fVar2;
                    }
                    xVarA = c2.a(sVar2);
                    zF = sVar2.f(xVarA);
                    objQ2 = sVar2.Q();
                    if (zF) {
                        objQ2 = new l(xVarA);
                        sVar2.o0(objQ2);
                    } else {
                        objQ2 = new l(xVarA);
                        sVar2.o0(objQ2);
                    }
                    l lVar4 = (l) objQ2;
                    i23 = i22 & (-1908408321);
                    rVar5 = rVar4;
                    xVar3 = xVar7;
                    hVar5 = hVar4;
                    t0Var3 = lVar4;
                    z15 = true;
                    z16 = true;
                    iVarA = s1.a(sVar2);
                } else {
                    if (i27 != 0) {
                        rVar4 = o.f58481a;
                    } else {
                        rVar4 = rVar2;
                    }
                    p pVar5 = z.f40671a;
                    Object[] objArr5 = new Object[0];
                    o2 o2Var5 = x.f40649w;
                    zD = sVar2.d(0) | sVar2.d(0);
                    objQ = sVar2.Q();
                    if (zD) {
                        objQ = new d(12);
                        sVar2.o0(objQ);
                    } else {
                        objQ = new d(12);
                        sVar2.o0(objQ);
                    }
                    z12 = false;
                    x xVar8 = (x) j.d(objArr5, o2Var5, (fz.a) objQ, sVar2, 0);
                    i21 = i17 & (-897);
                    if ((i12 & 32) != 0) {
                        hVar4 = j0.i.f35305c;
                        i22 = i17 & (-459649);
                    } else {
                        i22 = i21;
                        hVar4 = hVar2;
                    }
                    if (i15 != 0) {
                        fVar4 = j0.i.f35303a;
                    } else {
                        fVar4 = fVar2;
                    }
                    xVarA = c2.a(sVar2);
                    zF = sVar2.f(xVarA);
                    objQ2 = sVar2.Q();
                    if (zF) {
                        objQ2 = new l(xVarA);
                        sVar2.o0(objQ2);
                    } else {
                        objQ2 = new l(xVarA);
                        sVar2.o0(objQ2);
                    }
                    l lVar5 = (l) objQ2;
                    i23 = i22 & (-1908408321);
                    rVar5 = rVar4;
                    xVar3 = xVar8;
                    hVar5 = hVar4;
                    t0Var3 = lVar5;
                    z15 = true;
                    z16 = true;
                    iVarA = s1.a(sVar2);
                }
                sVar2.q();
                i24 = (i23 & 14) | ((i23 >> 15) & 112);
                if (((i24 & 14) ^ 6) > 4) {
                }
                if (((i24 & 112) ^ 48) <= 32) {
                }
                z17 = z18 | z12;
                objQ3 = sVar2.Q();
                if (z17) {
                    objQ3 = new e(new k9.p(10, cVar, fVar4));
                    sVar2.o0(objQ3);
                } else {
                    objQ3 = new e(new k9.p(10, cVar, fVar4));
                    sVar2.o0(objQ3);
                }
                sVar = sVar2;
                f fVar7 = fVar4;
                ns.o.a(rVar5, xVar3, (e) objQ3, v1Var, t0Var3, z16, iVarA, hVar5, fVar7, cVar2, sVar, ((i23 >> 3) & 14) | 196608 | (i23 & 7168) | 12607488 | ((i23 << 12) & 1879048192), ((i23 >> 18) & 14) | ((i18 << 3) & 112));
                rVar3 = rVar5;
                xVar2 = xVar3;
                t0Var2 = t0Var3;
                z14 = z16;
                iVar2 = iVarA;
                hVar3 = hVar5;
                fVar3 = fVar7;
            } else {
                sVar = sVar2;
                sVar.W();
                xVar2 = xVar;
                z14 = z11;
                rVar3 = rVar2;
                hVar3 = hVar2;
                fVar3 = fVar2;
                t0Var2 = t0Var;
                iVar2 = iVar;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new m0.g(cVar, rVar3, xVar2, v1Var, hVar3, fVar3, t0Var2, z14, iVar2, cVar2, i11, i12);
            }
        }
        i14 |= 1572864;
        fVar2 = fVar;
        i17 = i14 | 373293056;
        if (sVar2.h(cVar2)) {
            i18 = 4;
        } else {
            i18 = 2;
        }
        z12 = false;
        if ((i17 & 306783379) == 306783378) {
            z13 = true;
        } else {
            z13 = true;
        }
        if (sVar2.T(i17 & 1, z13)) {
            sVar2.Y();
            i19 = i11 & 1;
            g gVar4 = m.f39353a;
            if (i19 != 0) {
                if (i27 != 0) {
                    rVar4 = o.f58481a;
                } else {
                    rVar4 = rVar2;
                }
                p pVar6 = z.f40671a;
                Object[] objArr6 = new Object[0];
                o2 o2Var6 = x.f40649w;
                zD = sVar2.d(0) | sVar2.d(0);
                objQ = sVar2.Q();
                if (zD) {
                    objQ = new d(12);
                    sVar2.o0(objQ);
                } else {
                    objQ = new d(12);
                    sVar2.o0(objQ);
                }
                z12 = false;
                x xVar9 = (x) j.d(objArr6, o2Var6, (fz.a) objQ, sVar2, 0);
                i21 = i17 & (-897);
                if ((i12 & 32) != 0) {
                    hVar4 = j0.i.f35305c;
                    i22 = i17 & (-459649);
                } else {
                    i22 = i21;
                    hVar4 = hVar2;
                }
                if (i15 != 0) {
                    fVar4 = j0.i.f35303a;
                } else {
                    fVar4 = fVar2;
                }
                xVarA = c2.a(sVar2);
                zF = sVar2.f(xVarA);
                objQ2 = sVar2.Q();
                if (zF) {
                    objQ2 = new l(xVarA);
                    sVar2.o0(objQ2);
                } else {
                    objQ2 = new l(xVarA);
                    sVar2.o0(objQ2);
                }
                l lVar6 = (l) objQ2;
                i23 = i22 & (-1908408321);
                rVar5 = rVar4;
                xVar3 = xVar9;
                hVar5 = hVar4;
                t0Var3 = lVar6;
                z15 = true;
                z16 = true;
                iVarA = s1.a(sVar2);
            } else {
                if (i27 != 0) {
                    rVar4 = o.f58481a;
                } else {
                    rVar4 = rVar2;
                }
                p pVar7 = z.f40671a;
                Object[] objArr7 = new Object[0];
                o2 o2Var7 = x.f40649w;
                zD = sVar2.d(0) | sVar2.d(0);
                objQ = sVar2.Q();
                if (zD) {
                    objQ = new d(12);
                    sVar2.o0(objQ);
                } else {
                    objQ = new d(12);
                    sVar2.o0(objQ);
                }
                z12 = false;
                x xVar10 = (x) j.d(objArr7, o2Var7, (fz.a) objQ, sVar2, 0);
                i21 = i17 & (-897);
                if ((i12 & 32) != 0) {
                    hVar4 = j0.i.f35305c;
                    i22 = i17 & (-459649);
                } else {
                    i22 = i21;
                    hVar4 = hVar2;
                }
                if (i15 != 0) {
                    fVar4 = j0.i.f35303a;
                } else {
                    fVar4 = fVar2;
                }
                xVarA = c2.a(sVar2);
                zF = sVar2.f(xVarA);
                objQ2 = sVar2.Q();
                if (zF) {
                    objQ2 = new l(xVarA);
                    sVar2.o0(objQ2);
                } else {
                    objQ2 = new l(xVarA);
                    sVar2.o0(objQ2);
                }
                l lVar7 = (l) objQ2;
                i23 = i22 & (-1908408321);
                rVar5 = rVar4;
                xVar3 = xVar10;
                hVar5 = hVar4;
                t0Var3 = lVar7;
                z15 = true;
                z16 = true;
                iVarA = s1.a(sVar2);
            }
            sVar2.q();
            i24 = (i23 & 14) | ((i23 >> 15) & 112);
            if (((i24 & 14) ^ 6) > 4) {
            }
            if (((i24 & 112) ^ 48) <= 32) {
            }
            z17 = z18 | z12;
            objQ3 = sVar2.Q();
            if (z17) {
                objQ3 = new e(new k9.p(10, cVar, fVar4));
                sVar2.o0(objQ3);
            } else {
                objQ3 = new e(new k9.p(10, cVar, fVar4));
                sVar2.o0(objQ3);
            }
            sVar = sVar2;
            f fVar8 = fVar4;
            ns.o.a(rVar5, xVar3, (e) objQ3, v1Var, t0Var3, z16, iVarA, hVar5, fVar8, cVar2, sVar, ((i23 >> 3) & 14) | 196608 | (i23 & 7168) | 12607488 | ((i23 << 12) & 1879048192), ((i23 >> 18) & 14) | ((i18 << 3) & 112));
            rVar3 = rVar5;
            xVar2 = xVar3;
            t0Var2 = t0Var3;
            z14 = z16;
            iVar2 = iVarA;
            hVar3 = hVar5;
            fVar3 = fVar8;
        } else {
            sVar = sVar2;
            sVar.W();
            xVar2 = xVar;
            z14 = z11;
            rVar3 = rVar2;
            hVar3 = hVar2;
            fVar3 = fVar2;
            t0Var2 = t0Var;
            iVar2 = iVar;
        }
        x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new m0.g(cVar, rVar3, xVar2, v1Var, hVar3, fVar3, t0Var2, z14, iVar2, cVar2, i11, i12);
        }
    }

    public static final ArrayList b(int i11, int i12, int i13) {
        int i14 = i11 - ((i12 - 1) * i13);
        int i15 = i14 / i12;
        int i16 = i14 % i12;
        ArrayList arrayList = new ArrayList(i12);
        int i17 = 0;
        while (i17 < i12) {
            arrayList.add(Integer.valueOf((i17 < i16 ? 1 : 0) + i15));
            i17++;
        }
        return arrayList;
    }

    public static a4.l c(i0 i0Var) {
        return com.bumptech.glide.g.n(new hh.c(i0Var, 20));
    }

    public static final void d(int i11, int i12) {
        if (i11 > i12) {
            throw new IndexOutOfBoundsException(p0.l("toIndex (", i11, ") is greater than size (", i12, ")."));
        }
    }

    public static final long e(InputStream inputStream, OutputStream outputStream, int i11) throws IOException {
        kotlin.jvm.internal.m.f(inputStream, "<this>");
        byte[] bArr = new byte[i11];
        int i12 = inputStream.read(bArr);
        long j11 = 0;
        while (i12 >= 0) {
            outputStream.write(bArr, 0, i12);
            j11 += (long) i12;
            i12 = inputStream.read(bArr);
        }
        return j11;
    }

    public static b g(Collection collection, Bundle bundle, re.g gVar, String applicationId) {
        ArrayList arrayListB;
        ArrayList arrayListB2;
        kotlin.jvm.internal.m.f(bundle, "bundle");
        kotlin.jvm.internal.m.f(applicationId, "applicationId");
        Date dateN = j1.n(bundle, "expires_in", new Date());
        String string = bundle.getString("access_token");
        if (string != null) {
            Date dateN2 = j1.n(bundle, "data_access_expiration_time", new Date(0L));
            String string2 = bundle.getString("granted_scopes");
            if (string2 != null && string2.length() > 0) {
                String[] strArr = (String[]) q.W0(string2, new String[]{","}, 0, 6).toArray(new String[0]);
                collection = ns.o.b(Arrays.copyOf(strArr, strArr.length));
            }
            String string3 = bundle.getString("denied_scopes");
            if (string3 == null || string3.length() <= 0) {
                arrayListB = null;
            } else {
                String[] strArr2 = (String[]) q.W0(string3, new String[]{","}, 0, 6).toArray(new String[0]);
                arrayListB = ns.o.b(Arrays.copyOf(strArr2, strArr2.length));
            }
            String string4 = bundle.getString("expired_scopes");
            if (string4 == null || string4.length() <= 0) {
                arrayListB2 = null;
            } else {
                String[] strArr3 = (String[]) q.W0(string4, new String[]{","}, 0, 6).toArray(new String[0]);
                arrayListB2 = ns.o.b(Arrays.copyOf(strArr3, strArr3.length));
            }
            if (!j1.y(string)) {
                String string5 = bundle.getString("graph_domain");
                String string6 = bundle.getString("signed_request");
                if (string6 == null || string6.length() == 0) {
                    throw new FacebookException("Authorization response does not contain the signed_request");
                }
                try {
                    String[] strArr4 = (String[]) q.W0(string6, new String[]{"."}, 0, 6).toArray(new String[0]);
                    if (strArr4.length == 2) {
                        byte[] data = Base64.decode(strArr4[1], 0);
                        kotlin.jvm.internal.m.e(data, "data");
                        String string7 = new JSONObject(new String(data, oz.a.f46133a)).getString("user_id");
                        kotlin.jvm.internal.m.e(string7, "jsonObject.getString(\"user_id\")");
                        return new b(string, applicationId, string7, collection, arrayListB, arrayListB2, gVar, dateN, new Date(), dateN2, string5);
                    }
                } catch (UnsupportedEncodingException | JSONException unused) {
                }
                throw new FacebookException("Failed to retrieve user_id from signed_request");
            }
        }
        return null;
    }

    public static Handler h(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return a2.l.f(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException e8) {
            Throwable cause = e8.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    public static re.h i(String str, Bundle bundle) {
        kotlin.jvm.internal.m.f(bundle, "bundle");
        String string = bundle.getString("id_token");
        if (string == null || string.length() == 0 || str == null || str.length() == 0) {
            return null;
        }
        try {
            return new re.h(string, str);
        } catch (Exception e8) {
            throw new FacebookException(e8.getMessage(), e8);
        }
    }

    public static String j(String str) {
        if (str == null) {
            return null;
        }
        try {
            String str2 = new String(Base64.encode(str.getBytes(Constants.ENCODING), 2), Constants.ENCODING);
            StringBuilder sb2 = new StringBuilder();
            for (int i11 = 0; i11 < str2.length(); i11++) {
                char cCharAt = str2.charAt(i11);
                if (cCharAt == 'z') {
                    sb2.append('a');
                } else if (cCharAt == 'Z') {
                    sb2.append('A');
                } else if ((cCharAt < 'a' || cCharAt >= 'z') && (cCharAt < 'A' || cCharAt >= 'Z')) {
                    sb2.append(cCharAt);
                } else {
                    sb2.append((char) (cCharAt + 1));
                }
            }
            return sb2.toString();
        } catch (UnsupportedEncodingException e8) {
            throw new RuntimeException(e8);
        } catch (NullPointerException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static InvocationHandler k() {
        ClassLoader classLoader;
        if (Build.VERSION.SDK_INT >= 28) {
            classLoader = a2.l.w();
        } else {
            try {
                Method declaredMethod = WebView.class.getDeclaredMethod("getFactory", null);
                declaredMethod.setAccessible(true);
                classLoader = declaredMethod.invoke(null, null).getClass().getClassLoader();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e8) {
                throw new RuntimeException(e8);
            }
        }
        return (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, classLoader).getDeclaredMethod("createWebViewProviderFactory", null).invoke(null, null);
    }

    public static final mz.c l(e00.g gVar) {
        kotlin.jvm.internal.m.f(gVar, "<this>");
        if (gVar instanceof e00.b) {
            return ((e00.b) gVar).f24669b;
        }
        if (gVar instanceof n1) {
            return l(((n1) gVar).f28441a);
        }
        return null;
    }

    public static String m(Env env, int i11, long j11) {
        kotlin.jvm.internal.m.f(env, "env");
        int i12 = env.keyLanguage;
        if (i12 == 0) {
            if (xt.b.e().f()) {
                StringBuilder sbO = e0.o(i11, "cn-m-s-", "-", j11);
                sbO.append(".mp3");
                return sbO.toString();
            }
            StringBuilder sbO2 = e0.o(i11, "cn-f-s-", "-", j11);
            sbO2.append(".mp3");
            return sbO2.toString();
        }
        if (i12 == 1) {
            if (xt.b.e().f()) {
                StringBuilder sbO3 = e0.o(i11, "jp-m-s-", "-", j11);
                sbO3.append(".mp3");
                return sbO3.toString();
            }
            StringBuilder sbO4 = e0.o(i11, "jp-f-s-", "-", j11);
            sbO4.append(".mp3");
            return sbO4.toString();
        }
        if (i12 == 2) {
            if (xt.b.e().f()) {
                StringBuilder sbO5 = e0.o(i11, "kr-m-s-", "-", j11);
                sbO5.append(".mp3");
                return sbO5.toString();
            }
            StringBuilder sbO6 = e0.o(i11, "kr-f-s-", "-", j11);
            sbO6.append(".mp3");
            return sbO6.toString();
        }
        if (i12 != 4) {
            if (i12 != 5) {
                if (i12 != 6) {
                    if (i12 != 8) {
                        if (i12 != 20) {
                            if (i12 != 22) {
                                if (i12 != 40) {
                                    if (i12 == 47 || i12 == 48) {
                                        if (xt.b.e().f()) {
                                            StringBuilder sbO7 = e0.o(i11, "esus-m-s-", "-", j11);
                                            sbO7.append(".mp3");
                                            return sbO7.toString();
                                        }
                                        StringBuilder sbO8 = e0.o(i11, "esus-f-s-", "-", j11);
                                        sbO8.append(".mp3");
                                        return sbO8.toString();
                                    }
                                    switch (i12) {
                                        case 10:
                                            break;
                                        case 11:
                                            if (xt.b.e().f()) {
                                                StringBuilder sbO9 = e0.o(i11, "cnup-m-s-", "-", j11);
                                                sbO9.append(".mp3");
                                                return sbO9.toString();
                                            }
                                            StringBuilder sbO10 = e0.o(i11, "cnup-f-s-", "-", j11);
                                            sbO10.append(".mp3");
                                            return sbO10.toString();
                                        case 12:
                                            if (xt.b.e().f()) {
                                                StringBuilder sbO11 = e0.o(i11, "jpup-m-s-", "-", j11);
                                                sbO11.append(".mp3");
                                                return sbO11.toString();
                                            }
                                            StringBuilder sbO12 = e0.o(i11, "jpup-f-s-", "-", j11);
                                            sbO12.append(".mp3");
                                            return sbO12.toString();
                                        case 13:
                                            if (xt.b.e().f()) {
                                                StringBuilder sbO13 = e0.o(i11, "krup-m-s-", "-", j11);
                                                sbO13.append(".mp3");
                                                return sbO13.toString();
                                            }
                                            StringBuilder sbO14 = e0.o(i11, "krup-f-s-", "-", j11);
                                            sbO14.append(".mp3");
                                            return sbO14.toString();
                                        case 14:
                                            break;
                                        case 15:
                                            break;
                                        case 16:
                                            break;
                                        case 17:
                                            break;
                                        default:
                                            return null;
                                    }
                                }
                            }
                            if (xt.b.e().f()) {
                                StringBuilder sbO15 = e0.o(i11, "ruoc-m-s-", "-", j11);
                                sbO15.append(".mp3");
                                return sbO15.toString();
                            }
                            StringBuilder sbO16 = e0.o(i11, "ruoc-f-s-", "-", j11);
                            sbO16.append(".mp3");
                            return sbO16.toString();
                        }
                        if (xt.b.e().f()) {
                            StringBuilder sbO17 = e0.o(i11, "itoc-m-s-", "-", j11);
                            sbO17.append(".mp3");
                            return sbO17.toString();
                        }
                        StringBuilder sbO18 = e0.o(i11, "itoc-f-s-", "-", j11);
                        sbO18.append(".mp3");
                        return sbO18.toString();
                    }
                    if (xt.b.e().f()) {
                        StringBuilder sbO19 = e0.o(i11, "ptoc-m-s-", "-", j11);
                        sbO19.append(".mp3");
                        return sbO19.toString();
                    }
                    StringBuilder sbO20 = e0.o(i11, "ptoc-f-s-", "-", j11);
                    sbO20.append(".mp3");
                    return sbO20.toString();
                }
                if (xt.b.e().f()) {
                    StringBuilder sbO21 = e0.o(i11, "deoc-m-s-", "-", j11);
                    sbO21.append(".mp3");
                    return sbO21.toString();
                }
                StringBuilder sbO22 = e0.o(i11, "deoc-f-s-", "-", j11);
                sbO22.append(".mp3");
                return sbO22.toString();
            }
            if (xt.b.e().f()) {
                StringBuilder sbO23 = e0.o(i11, "froc-m-s-", "-", j11);
                sbO23.append(".mp3");
                return sbO23.toString();
            }
            StringBuilder sbO24 = e0.o(i11, "froc-f-s-", "-", j11);
            sbO24.append(".mp3");
            return sbO24.toString();
        }
        if (xt.b.e().f()) {
            StringBuilder sbO25 = e0.o(i11, "esoc-m-s-", "-", j11);
            sbO25.append(".mp3");
            return sbO25.toString();
        }
        StringBuilder sbO26 = e0.o(i11, "esoc-f-s-", "-", j11);
        sbO26.append(".mp3");
        return sbO26.toString();
    }

    public static final void n(List list, lc.d dVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((fz.c) it.next()).invoke(dVar);
        }
    }

    public static boolean o(byte b3) {
        return b3 > -65;
    }

    public static Intent p(Context context, int i11) {
        kotlin.jvm.internal.m.f(context, "context");
        Intent intent = new Intent(context, (Class<?>) SpeakLeadBoardActivity.class);
        intent.putExtra(INTENTS.EXTRA_INT, i11);
        return intent;
    }

    public static Intent q(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) PdFinishActivity.class);
        intent.putExtra(INTENTS.EXTRA_STRING, str);
        return intent;
    }

    public static final void r(lc.d dVar, fz.c cVar) {
        dVar.K.add(cVar);
        dVar.setOnDismissListener(new nc.a(dVar));
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Iterable, java.lang.Object] */
    public static final void s(u10.c cVar, fz.c cVar2) {
        x10.a aVar = cVar.f52731a;
        v10.b bVar = cVar.f52732b;
        u10.a aVar2 = bVar.f53471a;
        if (cVar2 != null) {
            cVar2.invoke(aVar2);
            if (aVar2.f52730e.isEmpty()) {
                return;
            }
            aVar.getClass();
            for (mz.c cVar3 : aVar2.f52730e) {
                String mapping = f20.a.a(cVar3) + ':' + BuildConfig.VERSION_NAME + ':' + aVar2.f52726a;
                kotlin.jvm.internal.m.f(mapping, "mapping");
                aVar.f55749c.put(mapping, bVar);
            }
        }
    }

    public static final byte[] t(InputStream inputStream) throws IOException {
        kotlin.jvm.internal.m.f(inputStream, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(OSSConstants.DEFAULT_BUFFER_SIZE, inputStream.available()));
        e(inputStream, byteArrayOutputStream, OSSConstants.DEFAULT_BUFFER_SIZE);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        kotlin.jvm.internal.m.e(byteArray, "toByteArray(...)");
        return byteArray;
    }

    /* JADX WARN: Code duplicated, block: B:109:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:153:0x04b0  */
    /* JADX WARN: Code duplicated, block: B:168:0x04e1  */
    public static final m1 u(CourseSentence courseSentence, List list, List list2, Long l9, n nVar, int i11, int i12) {
        boolean zD;
        boolean zD2;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        Object objQ;
        kotlin.jvm.internal.m.f(courseSentence, "courseSentence");
        boolean z15 = (i12 & 32) == 0;
        boolean z16 = (i12 & 64) == 0;
        s sVar = (s) nVar;
        Object objQ2 = sVar.Q();
        g gVar = m.f39353a;
        if (objQ2 == gVar) {
            objQ2 = t.q(sVar);
            sVar.o0(objQ2);
        }
        b0 b0Var = (b0) objQ2;
        s sVar2 = (s) nVar;
        boolean zF = sVar2.f(courseSentence);
        Object objQ3 = sVar2.Q();
        if (zF || objQ3 == gVar) {
            objQ3 = t.B(ht.q.DEFAULT);
            sVar2.o0(objQ3);
        }
        b1 b1Var = (b1) objQ3;
        s sVar3 = (s) nVar;
        boolean zF2 = sVar3.f(courseSentence);
        Object objQ4 = sVar3.Q();
        if (zF2 || objQ4 == gVar) {
            objQ4 = t.B(ht.a.f33722e);
            sVar3.o0(objQ4);
        }
        b1 b1Var2 = (b1) objQ4;
        s sVar4 = (s) nVar;
        boolean zF3 = sVar4.f(courseSentence);
        Object objQ5 = sVar4.Q();
        Object obj = objQ5;
        if (zF3 || objQ5 == gVar) {
            x1.p pVar = new x1.p();
            pVar.addAll(list);
            sVar4.o0(pVar);
            obj = pVar;
        }
        x1.p pVar2 = (x1.p) obj;
        s sVar5 = (s) nVar;
        boolean zF4 = sVar5.f(courseSentence);
        Object objQ6 = sVar5.Q();
        Object obj2 = objQ6;
        if (zF4 || objQ6 == gVar) {
            x1.p pVar3 = new x1.p();
            pVar3.addAll(list2);
            sVar5.o0(pVar3);
            obj2 = pVar3;
        }
        x1.p pVar4 = (x1.p) obj2;
        s sVar6 = (s) nVar;
        boolean zF5 = sVar6.f(courseSentence);
        Object objQ7 = sVar6.Q();
        if (zF5 || objQ7 == gVar) {
            objQ7 = new x1.p();
            sVar6.o0(objQ7);
        }
        x1.p pVar5 = (x1.p) objQ7;
        s sVar7 = (s) nVar;
        boolean zF6 = sVar7.f(courseSentence);
        boolean z17 = true;
        Object objQ8 = sVar7.Q();
        if (zF6 || objQ8 == gVar) {
            objQ8 = defpackage.e.v(-1, sVar7);
        }
        a1 a1Var = (a1) objQ8;
        s sVar8 = (s) nVar;
        boolean zF7 = sVar8.f(courseSentence);
        Object objQ9 = sVar8.Q();
        if (zF7 || objQ9 == gVar) {
            objQ9 = t.B(BuildConfig.VERSION_NAME);
            sVar8.o0(objQ9);
        }
        b1 b1Var3 = (b1) objQ9;
        s sVar9 = (s) nVar;
        boolean zF8 = sVar9.f(courseSentence);
        boolean z18 = z16;
        Object objQ10 = sVar9.Q();
        boolean z19 = z15;
        if (zF8 || objQ10 == gVar) {
            objQ10 = t.B(new w(BuildConfig.VERSION_NAME, 0L, 6));
            sVar9.o0(objQ10);
        }
        b1 b1Var4 = (b1) objQ10;
        s sVar10 = (s) nVar;
        boolean zF9 = sVar10.f(courseSentence);
        Object objQ11 = sVar10.Q();
        if (zF9 || objQ11 == gVar) {
            objQ11 = t.B(Boolean.FALSE);
            sVar10.o0(objQ11);
        }
        b1 b1Var5 = (b1) objQ11;
        Object[] objArr = {l9};
        s sVar11 = (s) nVar;
        Object objQ12 = sVar11.Q();
        if (objQ12 == gVar) {
            objQ12 = new y(21);
            sVar11.o0(objQ12);
        }
        b1 b1Var6 = (b1) j.c(objArr, (fz.a) objQ12, sVar11, 48);
        s sVar12 = (s) nVar;
        boolean zF10 = sVar12.f(courseSentence);
        Object objQ13 = sVar12.Q();
        if (zF10 || objQ13 == gVar) {
            objQ13 = t.B(ns.s.NONE);
            sVar12.o0(objQ13);
        }
        b1 b1Var7 = (b1) objQ13;
        s sVar13 = (s) nVar;
        boolean zF11 = sVar13.f(courseSentence);
        Object objQ14 = sVar13.Q();
        if (zF11 || objQ14 == gVar) {
            objQ14 = t.B(Boolean.FALSE);
            sVar13.o0(objQ14);
        }
        b1 b1Var8 = (b1) objQ14;
        s sVar14 = (s) nVar;
        e20.a aVarC = w4.c.c(sVar14, -1168520582, sVar14, -1633490746);
        boolean zF12 = sVar14.f(null) | sVar14.f(aVarC);
        Object objQ15 = sVar14.Q();
        if (zF12 || objQ15 == gVar) {
            objQ15 = w4.c.e(ns.l.class, aVarC, null, null, sVar14);
        }
        sVar14.p(false);
        sVar14.p(false);
        ns.l lVar = (ns.l) objQ15;
        e20.a aVarC2 = w4.c.c(sVar14, -1168520582, sVar14, -1633490746);
        boolean zF13 = sVar14.f(null) | sVar14.f(aVarC2);
        Object objQ16 = sVar14.Q();
        if (zF13 || objQ16 == gVar) {
            objQ16 = w4.c.e(n0.class, aVarC2, null, null, sVar14);
        }
        sVar14.p(false);
        sVar14.p(false);
        n0 n0Var = (n0) objQ16;
        o0 o0Var = (o0) n0Var;
        boolean zF14 = sVar14.f(courseSentence) | sVar14.g(o0Var.f27733a.isKeyboard);
        Object objQ17 = sVar14.Q();
        if (zF14 || objQ17 == gVar) {
            objQ17 = ep.a.s(o0Var.f27733a.isKeyboard, sVar14);
        }
        b1 b1Var9 = (b1) objQ17;
        Object objQ18 = sVar14.Q();
        if (objQ18 == gVar) {
            objQ18 = t.s(new jt.i0(6, b1Var));
            sVar14.o0(objQ18);
        }
        b3 b3Var = (b3) objQ18;
        boolean zF15 = sVar14.f(courseSentence);
        Object objQ19 = sVar14.Q();
        if (zF15 || objQ19 == gVar) {
            objQ19 = courseSentence.getDisplaySpellCharWords();
            sVar14.o0(objQ19);
        }
        List list3 = (List) objQ19;
        Env env = o0Var.f27733a;
        boolean zG = sVar14.g(env.examCharAudioSwitch) | sVar14.d(env.keyLanguage);
        Object objQ20 = sVar14.Q();
        if (zG || objQ20 == gVar) {
            objQ20 = ep.a.s(env.examCharAudioSwitch && xt.d.u(env.keyLanguage), sVar14);
        }
        b1 b1Var10 = (b1) objQ20;
        boolean zD3 = sVar14.d(env.keyLanguage) | sVar14.g(env.enableM13OptionLuoma) | sVar14.d(o0Var.t());
        Object objQ21 = sVar14.Q();
        if (zD3 || objQ21 == gVar) {
            if (!xt.d.u(env.keyLanguage)) {
                zD = false;
            } else if (xt.d.w(env.keyLanguage)) {
                zD = ry.l.D(new Integer[]{2, 4}, Integer.valueOf(o0Var.t()));
            } else if (o0Var.t() == 0) {
                zD = true;
            } else {
                zD = false;
            }
            objQ21 = ep.a.s(zD || (env.enableM13OptionLuoma && xt.d.u(env.keyLanguage)), sVar14);
        }
        b1 b1Var11 = (b1) objQ21;
        boolean zD4 = sVar14.d(env.keyLanguage);
        Object objQ22 = sVar14.Q();
        if (zD4 || objQ22 == gVar) {
            objQ22 = Boolean.valueOf(xt.d.u(env.keyLanguage));
            sVar14.o0(objQ22);
        }
        boolean zBooleanValue = ((Boolean) objQ22).booleanValue();
        boolean zD5 = sVar14.d(o0Var.t()) | sVar14.d(env.keyLanguage);
        Object objQ23 = sVar14.Q();
        if (zD5 || objQ23 == gVar) {
            if (xt.d.u(env.keyLanguage)) {
                zD2 = xt.d.w(env.keyLanguage) ? ry.l.D(new Integer[]{5, 6}, Integer.valueOf(o0Var.t())) : ry.l.D(new Integer[]{2}, Integer.valueOf(o0Var.t()));
            } else {
                zD2 = false;
            }
            objQ23 = ep.a.s(zD2, sVar14);
        }
        b1 b1Var12 = (b1) objQ23;
        boolean zD6 = sVar14.d(o0Var.t()) | sVar14.d(env.keyLanguage);
        Object objQ24 = sVar14.Q();
        if (zD6 || objQ24 == gVar) {
            objQ24 = Boolean.valueOf(ry.l.D(new Integer[]{12, 1}, Integer.valueOf(env.keyLanguage)) && ry.l.D(new Integer[]{2, 4}, Integer.valueOf(o0Var.t())));
            sVar14.o0(objQ24);
        }
        boolean zBooleanValue2 = ((Boolean) objQ24).booleanValue();
        boolean zD7 = sVar14.d(env.keyLanguage) | sVar14.f(courseSentence) | sVar14.f(b1Var10) | sVar14.f(b1Var11) | sVar14.g(zBooleanValue) | sVar14.f(b1Var12) | sVar14.g(zBooleanValue2) | sVar14.f(list3) | sVar14.f(pVar4) | sVar14.g(((Boolean) b3Var.getValue()).booleanValue()) | sVar14.f(b1Var) | sVar14.f(b0Var) | sVar14.f(b1Var2) | sVar14.f(pVar2) | sVar14.f(pVar5) | sVar14.f(a1Var) | sVar14.f(b1Var9) | sVar14.f(b1Var3) | sVar14.f(b1Var4) | sVar14.f(b1Var5) | sVar14.f(b1Var6) | sVar14.f(b1Var7) | sVar14.f(b1Var8);
        if (((i11 & 458752) ^ 196608) > 131072) {
            if (sVar14.g(z19)) {
                z19 = z19;
            } else {
                z19 = z19;
                if ((i11 & 196608) != 131072) {
                    z11 = false;
                }
            }
            z11 = true;
        } else if ((i11 & 196608) != 131072) {
            z11 = true;
        } else {
            z11 = false;
        }
        boolean z20 = z11 | zD7;
        if (((i11 & 3670016) ^ 1572864) > 1048576) {
            z12 = z18;
            if (sVar14.g(z12)) {
                z13 = z20;
            }
            z14 = z13 | z17;
            objQ = sVar14.Q();
            if (z14 || objQ == gVar) {
                m1 m1Var = new m1(courseSentence, env.keyLanguage, b1Var10, b1Var11, zBooleanValue, b1Var12, ((Boolean) b3Var.getValue()).booleanValue(), b0Var, b1Var, b1Var2, list3, pVar2, pVar4, pVar5, a1Var, b1Var9, b1Var3, b1Var4, b1Var5, b1Var6, b1Var7, z12, b1Var8, new v0(z19, n0Var, lVar, null, 1), new o1(n0Var, b1Var9, b1Var, b1Var3, pVar5, null, 0), new p1(b1Var10, n0Var, (vy.d) null), new p1(n0Var, b1Var11, (vy.d) null), zBooleanValue2);
                sVar14.o0(m1Var);
                objQ = m1Var;
            }
            return (m1) objQ;
        }
        z12 = z18;
        z13 = z20;
        if ((i11 & 1572864) != 1048576) {
            z17 = false;
        }
        z14 = z13 | z17;
        objQ = sVar14.Q();
        if (z14) {
            m1 m1Var2 = new m1(courseSentence, env.keyLanguage, b1Var10, b1Var11, zBooleanValue, b1Var12, ((Boolean) b3Var.getValue()).booleanValue(), b0Var, b1Var, b1Var2, list3, pVar2, pVar4, pVar5, a1Var, b1Var9, b1Var3, b1Var4, b1Var5, b1Var6, b1Var7, z12, b1Var8, new v0(z19, n0Var, lVar, null, 1), new o1(n0Var, b1Var9, b1Var, b1Var3, pVar5, null, 0), new p1(b1Var10, n0Var, (vy.d) null), new p1(n0Var, b1Var11, (vy.d) null), zBooleanValue2);
            sVar14.o0(m1Var2);
            objQ = m1Var2;
        } else {
            m1 m1Var3 = new m1(courseSentence, env.keyLanguage, b1Var10, b1Var11, zBooleanValue, b1Var12, ((Boolean) b3Var.getValue()).booleanValue(), b0Var, b1Var, b1Var2, list3, pVar2, pVar4, pVar5, a1Var, b1Var9, b1Var3, b1Var4, b1Var5, b1Var6, b1Var7, z12, b1Var8, new v0(z19, n0Var, lVar, null, 1), new o1(n0Var, b1Var9, b1Var, b1Var3, pVar5, null, 0), new p1(b1Var10, n0Var, (vy.d) null), new p1(n0Var, b1Var11, (vy.d) null), zBooleanValue2);
            sVar14.o0(m1Var3);
            objQ = m1Var3;
        }
        return (m1) objQ;
    }

    public static final ht.q v(int i11, boolean z11, int i12, String inputText) {
        kotlin.jvm.internal.m.f(inputText, "inputText");
        if (z11) {
            return o00.a.x(i11, o00.a.G(i11, inputText)) ? ht.q.SELECTED : ht.q.DEFAULT;
        }
        return i12 > 0 ? ht.q.SELECTED : ht.q.DEFAULT;
    }

    public static final qy.r w(CourseWord courseWord, List list) {
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            CourseWord courseWord2 = (CourseWord) list.get(i11);
            Iterator<CourseWord> it = courseWord2.getDisplayCharWords().iterator();
            int i12 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i12 = -1;
                    break;
                }
                if (kotlin.jvm.internal.m.a(it.next().getWord(), "_")) {
                    break;
                }
                i12++;
            }
            if (i12 != -1) {
                ArrayList arrayListC1 = ry.m.c1(courseWord2.getDisplayCharWords());
                CourseWord courseWord3 = (CourseWord) arrayListC1.get(i12);
                String realWord = courseWord3.getRealWord();
                Locale locale = Locale.ROOT;
                String lowerCase = realWord.toLowerCase(locale);
                kotlin.jvm.internal.m.e(lowerCase, "toLowerCase(...)");
                String lowerCase2 = courseWord.getWord().toLowerCase(locale);
                kotlin.jvm.internal.m.e(lowerCase2, "toLowerCase(...)");
                arrayListC1.set(i12, lowerCase.equals(lowerCase2) ? CourseWord.copy$default(courseWord3, 0L, courseWord3.getRealWord(), courseWord.getZhuYin(), courseWord.getLuoMa(), null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, null, null, null, 0, -15, 63, null) : CourseWord.copy$default(courseWord3, 0L, courseWord.getOriginalWord(), courseWord.getZhuYin(), courseWord.getLuoMa(), null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, null, null, null, 0, -15, 63, null));
                return new qy.r(Integer.valueOf(i11), Integer.valueOf(i12), CourseWord.copy$default(courseWord2, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, arrayListC1, null, null, null, null, 0, -1, 62, null));
            }
        }
        return null;
    }

    public static final String x(String str) {
        kotlin.jvm.internal.m.f(str, "<this>");
        return oz.x.q0(oz.x.q0(oz.x.q0(oz.x.q0(oz.x.q0(oz.x.q0(oz.x.q0(str, "ّ", "ٌ"), "َّ", "َّ"), "ِّ", "ِِّ"), "ُّ", "ُّ"), "ًّ", "ًّ"), "ٍّ", "ٍٍّ"), "ٌّ", "ٌٍّ");
    }

    public static final String y(String str) {
        String strNormalize = Normalizer.normalize(str, Normalizer.Form.NFD);
        kotlin.jvm.internal.m.c(strNormalize);
        Pattern patternCompile = Pattern.compile("[\\u0300\\u0301\\u0304\\u030C]");
        kotlin.jvm.internal.m.e(patternCompile, "compile(...)");
        String strReplaceAll = patternCompile.matcher(strNormalize).replaceAll(BuildConfig.VERSION_NAME);
        kotlin.jvm.internal.m.e(strReplaceAll, "replaceAll(...)");
        String strNormalize2 = Normalizer.normalize(strReplaceAll, Normalizer.Form.NFC);
        kotlin.jvm.internal.m.e(strNormalize2, "normalize(...)");
        return strNormalize2;
    }

    public static final q6.m z(q6.m mVar, Matrix matrix) {
        kotlin.jvm.internal.m.f(mVar, "<this>");
        b1.p pVar = new b1.p(29, new float[2], matrix);
        long jX = gb.r.X(y.h.a(mVar.f47505b, mVar.f47506c), pVar);
        sy.c cVarO = ns.o.o();
        List list = mVar.f47504a;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            cVarO.add(((q6.g) list.get(i11)).a(pVar));
        }
        return new q6.m(ns.o.e(cVarO), gb.r.y(jX), gb.r.z(jX));
    }

    public static b f(Bundle bundle, re.g gVar, String str) {
        String string;
        kotlin.jvm.internal.m.f(bundle, "bundle");
        kotlin.jvm.internal.m.f(str, OYAvlbfUyD.BTdLhhM);
        Date dateN = j1.n(bundle, "com.facebook.platform.extra.EXPIRES_SECONDS_SINCE_EPOCH", new Date(0L));
        ArrayList<String> stringArrayList = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
        String string2 = bundle.getString("com.facebook.platform.extra.ACCESS_TOKEN");
        Date dateN2 = j1.n(bundle, "com.facebook.platform.extra.EXTRA_DATA_ACCESS_EXPIRATION_TIME", new Date(0L));
        if (string2 == null || string2.length() == 0 || (string = bundle.getString("com.facebook.platform.extra.USER_ID")) == null || string.length() == 0) {
            return null;
        }
        return new b(string2, str, string, stringArrayList, null, null, gVar, dateN, new Date(), dateN2, bundle.getString("graph_domain"));
    }
}
