package se;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.LifecycleOwner;
import com.adjust.sdk.Constants;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import com.google.android.gms.measurement.zfxB.ypOOxsaJG;
import com.google.gson.Gson;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingodeer.data.model.MFSource;
import d1.e1;
import f.d0;
import f.f0;
import j$.util.DesugarTimeZone;
import j3.y0;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.nio.charset.Charset;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import l1.b1;
import l1.x1;
import lf.j1;
import rz.e0;
import s0.o0;
import sg.a0;
import sg.b0;
import sg.c0;
import tg.i0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static g2.h f51598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static g2.c f51599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static i2.b f51600c;

    public static long A(String str) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("GMT"));
            return simpleDateFormat.parse(str).getTime();
        } catch (ParseException unused) {
            if ("0".equals(str) || "-1".equals(str)) {
                pd.p.b("Unable to parse dateStr: %s, falling back to 0", str);
                return 0L;
            }
            pd.p.a("Unable to parse dateStr: %s, falling back to 0", str);
            return 0L;
        }
    }

    public static final synchronized x B() {
        x xVar;
        h hVar;
        Throwable th2;
        String str;
        Context contextA = re.s.a();
        xVar = null;
        try {
            FileInputStream fileInputStreamOpenFileInput = contextA.openFileInput("AppEventsLogger.persistedevents");
            kotlin.jvm.internal.m.e(fileInputStreamOpenFileInput, "context.openFileInput(PERSISTED_EVENTS_FILENAME)");
            hVar = new h(new BufferedInputStream(fileInputStreamOpenFileInput));
            try {
                Object object = hVar.readObject();
                kotlin.jvm.internal.m.d(object, "null cannot be cast to non-null type com.facebook.appevents.PersistedEvents");
                x xVar2 = (x) object;
                j1.d(hVar);
                try {
                    contextA.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                } catch (Exception unused) {
                }
                xVar = xVar2;
            } catch (FileNotFoundException unused2) {
                j1.d(hVar);
                str = "AppEventsLogger.persistedevents";
                try {
                    contextA.getFileStreamPath(str).delete();
                } catch (Exception unused3) {
                }
            } catch (Exception unused4) {
                j1.d(hVar);
                str = "AppEventsLogger.persistedevents";
                contextA.getFileStreamPath(str).delete();
            } catch (Throwable th3) {
                th2 = th3;
                j1.d(hVar);
                try {
                    contextA.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                } catch (Exception unused5) {
                }
                throw th2;
            }
        } catch (FileNotFoundException unused6) {
            hVar = null;
        } catch (Exception unused7) {
            hVar = null;
        } catch (Throwable th4) {
            hVar = null;
            th2 = th4;
        }
        if (xVar == null) {
            xVar = new x();
        }
        return xVar;
    }

    public static final void C(i0 i0Var, sg.q qVar, l1.n nVar, int i11) {
        int i12;
        kotlin.jvm.internal.m.f(i0Var, "<this>");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1194519785);
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(i0Var) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.f(qVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= (i11 & 512) == 0 ? sVar.f(null) : sVar.h(null) ? 256 : 128;
        }
        if ((i12 & 147) == 146 && sVar.F()) {
            sVar.W();
        } else {
            nz.l lVarL = qVar != null ? ue.f.l(qVar, false) : null;
            if (lVarL != null) {
                Iterator it = lVarL.iterator();
                while (it.hasNext()) {
                    c(i0Var, (sg.q) it.next(), sVar, i12 & 910);
                }
            }
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new rg.b(i0Var, qVar, i11, 3);
        }
    }

    public static final Object D(fz.e eVar) {
        Thread.interrupted();
        return e0.F(vy.j.f54321a, new nu.b(eVar, null));
    }

    public static final void E(x xVar) {
        Context contextA = re.s.a();
        ObjectOutputStream objectOutputStream = null;
        try {
            ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(new BufferedOutputStream(contextA.openFileOutput("AppEventsLogger.persistedevents", 0)));
            try {
                objectOutputStream2.writeObject(xVar);
                j1.d(objectOutputStream2);
            } catch (Throwable unused) {
                objectOutputStream = objectOutputStream2;
                try {
                    contextA.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                } catch (Exception unused2) {
                } finally {
                    j1.d(objectOutputStream);
                }
            }
        } catch (Throwable unused3) {
        }
    }

    public static final void a(boolean z11, fz.a aVar, l1.n nVar, int i11, int i12) {
        int i13;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-361453782);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
        } else {
            i13 = (sVar.g(z11) ? 4 : 2) | i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= sVar.h(aVar) ? 32 : 16;
        }
        if ((i13 & 19) == 18 && sVar.F()) {
            sVar.W();
        } else {
            if (i14 != 0) {
                z11 = true;
            }
            b1 b1VarH = l1.t.H(aVar, sVar);
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                objQ = new g.f(b1VarH, z11);
                sVar.o0(objQ);
            }
            g.f fVar = (g.f) objQ;
            boolean z12 = (i13 & 14) == 4;
            Object objQ2 = sVar.Q();
            if (z12 || objQ2 == gVar) {
                objQ2 = new g.d(fVar, z11, 0);
                sVar.o0(objQ2);
            }
            l1.t.j((fz.a) objQ2, sVar);
            f0 f0VarA = g.i.a(sVar);
            if (f0VarA == null) {
                throw new IllegalStateException("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner");
            }
            d0 onBackPressedDispatcher = f0VarA.getOnBackPressedDispatcher();
            LifecycleOwner lifecycleOwner = (LifecycleOwner) sVar.j(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            boolean zH = sVar.h(onBackPressedDispatcher) | sVar.h(lifecycleOwner);
            Object objQ3 = sVar.Q();
            if (zH || objQ3 == gVar) {
                objQ3 = new a0.j(onBackPressedDispatcher, lifecycleOwner, fVar, 5);
                sVar.o0(objQ3);
            }
            l1.t.d(lifecycleOwner, onBackPressedDispatcher, (fz.c) objQ3, sVar);
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new g.e(z11, aVar, i11, i12);
        }
    }

    public static final void b(i0 i0Var, sg.q qVar, l1.n nVar, int i11) {
        int i12;
        kotlin.jvm.internal.m.f(i0Var, "<this>");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-928065917);
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(i0Var) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.f(qVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= (i11 & 512) == 0 ? sVar.f(null) : sVar.h(null) ? 256 : 128;
        }
        if ((i12 & 147) == 146 && sVar.F()) {
            sVar.W();
        } else {
            c(i0Var, qVar, sVar, i12 & 1022);
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new rg.b(i0Var, qVar, i11, 0);
        }
    }

    public static final boolean d(String str) {
        for (int i11 = 0; i11 < str.length(); i11++) {
            char cCharAt = str.charAt(i11);
            if (kotlin.jvm.internal.m.h(cCharAt, 128) >= 0 || Character.isLetter(cCharAt)) {
                return true;
            }
        }
        return false;
    }

    public static final String e(h00.z zVar, String str) {
        String strB;
        h00.m mVar = (h00.m) zVar.get(str);
        if (mVar == null || (strB = h00.n.h(mVar).b()) == null) {
            throw new IllegalStateException("Missing required key: ".concat(str).toString());
        }
        return strB;
    }

    public static final String f(Number number, Number number2) {
        return "Random range is empty: [" + number + ", " + number2 + ").";
    }

    public static final void g(tz.v vVar, Throwable th2) {
        CancellationException cancellationExceptionA = th2 instanceof CancellationException ? (CancellationException) th2 : null;
        if (cancellationExceptionA == null) {
            cancellationExceptionA = e0.a("Channel was consumed, consumer had failed", th2);
        }
        vVar.cancel(cancellationExceptionA);
    }

    public static final void h(int i11, int i12) {
        if (i11 < 0 || i11 >= i12) {
            throw new IndexOutOfBoundsException(nv.p.p("index: ", i11, i12, ", size: "));
        }
    }

    public static final void i(int i11, int i12) {
        if (i11 < 0 || i11 > i12) {
            throw new IndexOutOfBoundsException(nv.p.p("index: ", i11, i12, ", size: "));
        }
    }

    public static final void j(int i11, int i12, int i13) {
        if (i11 < 0 || i12 > i13) {
            StringBuilder sbK = w4.c.k("fromIndex: ", i11, ", toIndex: ", i12, ", size: ");
            sbK.append(i13);
            throw new IndexOutOfBoundsException(sbK.toString());
        }
        if (i11 > i12) {
            throw new IllegalArgumentException(nv.p.p("fromIndex: ", i11, i12, " > toIndex: "));
        }
    }

    public static final long k(l1.n nVar, int i11) {
        l1.s sVar = (l1.s) nVar;
        Context context = (Context) sVar.j(AndroidCompositionLocals_androidKt.f1200b);
        Resources resources = (Resources) sVar.j(AndroidCompositionLocals_androidKt.f1201c);
        Resources.Theme theme = context.getTheme();
        ThreadLocal threadLocal = q4.j.f47447a;
        return g2.f0.c(resources.getColor(i11, theme));
    }

    public static c1.b n(c1.b bVar, v3.m mVar, y0 y0Var, v3.c cVar, n3.h hVar) {
        if (bVar != null && mVar == bVar.f6414a && j3.t.j(y0Var, mVar).equals(bVar.f6415b) && cVar.getDensity() == bVar.f6416c.f53484a && hVar == bVar.f6417d) {
            return bVar;
        }
        c1.b bVar2 = c1.b.f6413h;
        if (bVar2 != null && mVar == bVar2.f6414a && j3.t.j(y0Var, mVar).equals(bVar2.f6415b) && cVar.getDensity() == bVar2.f6416c.f53484a && hVar == bVar2.f6417d) {
            return bVar2;
        }
        c1.b bVar3 = new c1.b(mVar, j3.t.j(y0Var, mVar), new v3.d(cVar.getDensity(), cVar.Z()), hVar);
        c1.b.f6413h = bVar3;
        return bVar3;
    }

    public static String o() {
        String strE;
        String str;
        if (u()) {
            strE = xt.b.a().e();
            str = "alphabet/m_audio/";
        } else {
            strE = xt.b.a().e();
            str = "alphabet/f_audio/";
        }
        return defpackage.e.m(strE, str);
    }

    public static String p() {
        String strE;
        String str;
        if (v()) {
            strE = xt.b.a().e();
            str = "lesson/m_audio/";
        } else {
            strE = xt.b.a().e();
            str = "lesson/f_audio/";
        }
        return defpackage.e.m(strE, str);
    }

    public static String q() {
        return defpackage.e.m(xt.b.a().e(), "lesson/pic/");
    }

    public static String r() {
        String strE;
        String str;
        if (w()) {
            strE = xt.b.a().e();
            str = "story/m_audio/";
        } else {
            strE = xt.b.a().e();
            str = "story/f_audio/";
        }
        return defpackage.e.m(strE, str);
    }

    public static String s() {
        return defpackage.e.m(xt.b.a().e(), "story/pic/");
    }

    public static MFSource t() throws IOException {
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        kotlin.jvm.internal.m.c(lingoSkillApplication);
        InputStream inputStreamD = ks.b.d(lingoSkillApplication, "mfsource.json");
        byte[] bArr = new byte[inputStreamD.available()];
        inputStreamD.read(bArr);
        inputStreamD.close();
        Charset charsetForName = Charset.forName(Constants.ENCODING);
        kotlin.jvm.internal.m.e(charsetForName, "forName(...)");
        return (MFSource) new Gson().fromJson(new String(bArr, charsetForName), MFSource.class);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:103:0x019d  */
    /* JADX WARN: Code duplicated, block: B:13:0x0023  */
    /* JADX WARN: Code duplicated, block: B:31:0x006f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0095  */
    /* JADX WARN: Code duplicated, block: B:49:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:67:0x0107  */
    /* JADX WARN: Code duplicated, block: B:76:0x012d  */
    /* JADX WARN: Code duplicated, block: B:85:0x0153  */
    /* JADX WARN: Code duplicated, block: B:94:0x0178  */
    public static boolean u() throws IOException {
        MFSource mFSourceT = t();
        if (mFSourceT != null) {
            LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
            int i11 = cf.x.n().keyLanguage;
            if (i11 == 20) {
                if ((cf.x.n().itMFSwitch == 0 || mFSourceT.getItoc().getAlphatable_m() != 1) && (cf.x.n().itMFSwitch != 1 || mFSourceT.getItoc().getAlphatable_f() != 0)) {
                    return false;
                }
            } else if (i11 == 22) {
                if ((cf.x.n().ruMFSwitch == 0 || mFSourceT.getRuoc().getAlphatable_m() != 1) && (cf.x.n().ruMFSwitch != 1 || mFSourceT.getRuoc().getAlphatable_f() != 0)) {
                    return false;
                }
            } else {
                if (i11 == 40) {
                    return cf.x.n().itMFSwitch == 0 ? false : false;
                }
                switch (i11) {
                    case 0:
                        if ((cf.x.n().cnMFSwitch == 0 || mFSourceT.getCn().getAlphatable_m() != 1) && (cf.x.n().cnMFSwitch != 1 || mFSourceT.getCn().getAlphatable_f() != 0)) {
                            return false;
                        }
                        break;
                    case 1:
                        if ((cf.x.n().jpMFSwitch == 0 || mFSourceT.getJp().getAlphatable_m() != 1) && (cf.x.n().jpMFSwitch != 1 || mFSourceT.getJp().getAlphatable_f() != 0)) {
                            return false;
                        }
                        break;
                    case 2:
                        if ((cf.x.n().krMFSwitch == 0 || mFSourceT.getKr().getAlphatable_m() != 1) && (cf.x.n().krMFSwitch != 1 || mFSourceT.getKr().getAlphatable_f() != 0)) {
                            return false;
                        }
                        break;
                    case 3:
                        if ((cf.x.n().enMFSwitch != 0 || mFSourceT.getEn().getAlphatable_m() != 1) && (cf.x.n().enMFSwitch != 1 || mFSourceT.getEn().getAlphatable_f() != 0)) {
                            return false;
                        }
                        break;
                    case 4:
                        if ((cf.x.n().esMFSwitch == 0 || mFSourceT.getEsoc().getAlphatable_m() != 1) && (cf.x.n().esMFSwitch != 1 || mFSourceT.getEsoc().getAlphatable_f() != 0)) {
                            return false;
                        }
                        break;
                    case 5:
                        if ((cf.x.n().frMFSwitch == 0 || mFSourceT.getFroc().getAlphatable_m() != 1) && (cf.x.n().frMFSwitch != 1 || mFSourceT.getFroc().getAlphatable_f() != 0)) {
                            return false;
                        }
                        break;
                    case 6:
                        if ((cf.x.n().deMFSwitch == 0 || mFSourceT.getDeoc().getAlphatable_m() != 1) && (cf.x.n().deMFSwitch != 1 || mFSourceT.getDeoc().getAlphatable_f() != 0)) {
                            return false;
                        }
                        break;
                    case 7:
                        if ((cf.x.n().vtMFSwitch != 0 || mFSourceT.getVt().getAlphatable_m() != 1) && (cf.x.n().vtMFSwitch != 1 || mFSourceT.getVt().getAlphatable_f() != 0)) {
                            return false;
                        }
                        break;
                    case 8:
                        if ((cf.x.n().ptMFSwitch == 0 || mFSourceT.getPt().getAlphatable_m() != 1) && (cf.x.n().ptMFSwitch != 1 || mFSourceT.getPt().getAlphatable_f() != 0)) {
                            return false;
                        }
                        break;
                    default:
                        switch (i11) {
                            case 10:
                                return cf.x.n().ruMFSwitch == 0 ? false : false;
                            case 11:
                                return cf.x.n().cnMFSwitch == 0 ? false : false;
                            case 12:
                                return cf.x.n().jpMFSwitch == 0 ? false : false;
                            case 13:
                                return cf.x.n().krMFSwitch == 0 ? false : false;
                            case 14:
                                return cf.x.n().esMFSwitch == 0 ? false : false;
                            case 15:
                                return cf.x.n().frMFSwitch == 0 ? false : false;
                            case 16:
                                return cf.x.n().deMFSwitch == 0 ? false : false;
                            case 17:
                                return cf.x.n().ptMFSwitch == 0 ? false : false;
                        }
                }
            }
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:121:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:130:0x020f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0095  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:67:0x0107  */
    /* JADX WARN: Code duplicated, block: B:76:0x012d  */
    public static boolean v() throws IOException {
        MFSource mFSourceT = t();
        if (mFSourceT != null) {
            LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
            int i11 = cf.x.n().keyLanguage;
            if (i11 == 20) {
                if ((cf.x.n().itMFSwitch == 0 || mFSourceT.getItoc().getLesson_m() != 1) && (cf.x.n().itMFSwitch != 1 || mFSourceT.getItoc().getLesson_f() != 0)) {
                    return false;
                }
            } else if (i11 == 22) {
                if ((cf.x.n().ruMFSwitch == 0 || mFSourceT.getRuoc().getLesson_m() != 1) && (cf.x.n().ruMFSwitch != 1 || mFSourceT.getRuoc().getLesson_f() != 0)) {
                    return false;
                }
            } else {
                if (i11 == 40) {
                    return cf.x.n().itMFSwitch == 0 ? false : false;
                }
                switch (i11) {
                    case 0:
                        if ((cf.x.n().cnMFSwitch != 0 || mFSourceT.getCn().getLesson_m() != 1) && (cf.x.n().cnMFSwitch != 1 || mFSourceT.getCn().getLesson_f() != 0)) {
                            return false;
                        }
                        break;
                    case 1:
                        if ((cf.x.n().jpMFSwitch != 0 || mFSourceT.getJp().getLesson_m() != 1) && (cf.x.n().jpMFSwitch != 1 || mFSourceT.getJp().getLesson_f() != 0)) {
                            return false;
                        }
                        break;
                    case 2:
                        if ((cf.x.n().krMFSwitch != 0 || mFSourceT.getKr().getLesson_m() != 1) && (cf.x.n().krMFSwitch != 1 || mFSourceT.getKr().getLesson_f() != 0)) {
                            return false;
                        }
                        break;
                    case 3:
                        if ((cf.x.n().enMFSwitch != 0 || mFSourceT.getEn().getLesson_m() != 1) && (cf.x.n().enMFSwitch != 1 || mFSourceT.getEn().getLesson_f() != 0)) {
                            return false;
                        }
                        break;
                    case 4:
                        if ((cf.x.n().esMFSwitch == 0 || mFSourceT.getEsoc().getLesson_m() != 1) && (cf.x.n().esMFSwitch != 1 || mFSourceT.getEsoc().getLesson_f() != 0)) {
                            return false;
                        }
                        break;
                    case 5:
                        if ((cf.x.n().frMFSwitch == 0 || mFSourceT.getFroc().getLesson_m() != 1) && (cf.x.n().frMFSwitch != 1 || mFSourceT.getFroc().getLesson_f() != 0)) {
                            return false;
                        }
                        break;
                    case 6:
                        if ((cf.x.n().deMFSwitch == 0 || mFSourceT.getDeoc().getLesson_m() != 1) && (cf.x.n().deMFSwitch != 1 || mFSourceT.getDeoc().getLesson_f() != 0)) {
                            return false;
                        }
                        break;
                    case 7:
                        if ((cf.x.n().vtMFSwitch != 0 || mFSourceT.getVt().getLesson_m() != 1) && (cf.x.n().vtMFSwitch != 1 || mFSourceT.getVt().getLesson_f() != 0)) {
                            return false;
                        }
                        break;
                    case 8:
                        if ((cf.x.n().ptMFSwitch == 0 || mFSourceT.getPt().getLesson_m() != 1) && (cf.x.n().ptMFSwitch != 1 || mFSourceT.getPt().getLesson_f() != 0)) {
                            return false;
                        }
                        break;
                    default:
                        switch (i11) {
                            case 10:
                                return cf.x.n().ruMFSwitch == 0 ? false : false;
                            case 11:
                                if ((cf.x.n().cnupMFSwitch != 0 || mFSourceT.getCnup().getLesson_m() != 1) && (cf.x.n().cnupMFSwitch != 1 || mFSourceT.getCnup().getLesson_f() != 0)) {
                                    return false;
                                }
                                break;
                            case 12:
                                if ((cf.x.n().jpupMFSwitch != 0 || mFSourceT.getJpup().getLesson_m() != 1) && (cf.x.n().jpupMFSwitch != 1 || mFSourceT.getJpup().getLesson_f() != 0)) {
                                    return false;
                                }
                                break;
                            case 13:
                                if ((cf.x.n().krupMFSwitch != 0 || mFSourceT.getKrup().getLesson_m() != 1) && (cf.x.n().krupMFSwitch != 1 || mFSourceT.getKrup().getLesson_f() != 0)) {
                                    return false;
                                }
                                break;
                            case 14:
                                return cf.x.n().esMFSwitch == 0 ? false : false;
                            case 15:
                                return cf.x.n().frMFSwitch == 0 ? false : false;
                            case 16:
                                return cf.x.n().deMFSwitch == 0 ? false : false;
                            case 17:
                                return cf.x.n().ptMFSwitch == 0 ? false : false;
                        }
                        break;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:121:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:130:0x020f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0095  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:67:0x0107  */
    /* JADX WARN: Code duplicated, block: B:76:0x012d  */
    public static boolean w() throws IOException {
        MFSource mFSourceT = t();
        if (mFSourceT != null) {
            LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
            int i11 = cf.x.n().keyLanguage;
            if (i11 == 20) {
                if ((cf.x.n().itMFSwitch == 0 || mFSourceT.getItoc().getStory_m() != 1) && (cf.x.n().itMFSwitch != 1 || mFSourceT.getItoc().getStory_f() != 0)) {
                    return false;
                }
            } else if (i11 == 22) {
                if ((cf.x.n().ruMFSwitch == 0 || mFSourceT.getRuoc().getStory_m() != 1) && (cf.x.n().ruMFSwitch != 1 || mFSourceT.getRuoc().getStory_f() != 0)) {
                    return false;
                }
            } else {
                if (i11 == 40) {
                    return cf.x.n().itMFSwitch == 0 ? false : false;
                }
                switch (i11) {
                    case 0:
                        if ((cf.x.n().cnMFSwitch != 0 || mFSourceT.getCn().getStory_m() != 1) && (cf.x.n().cnMFSwitch != 1 || mFSourceT.getCn().getStory_f() != 0)) {
                            return false;
                        }
                        break;
                    case 1:
                        if ((cf.x.n().jpMFSwitch != 0 || mFSourceT.getJp().getStory_m() != 1) && (cf.x.n().jpMFSwitch != 1 || mFSourceT.getJp().getStory_f() != 0)) {
                            return false;
                        }
                        break;
                    case 2:
                        if ((cf.x.n().krMFSwitch != 0 || mFSourceT.getKr().getStory_m() != 1) && (cf.x.n().krMFSwitch != 1 || mFSourceT.getKr().getStory_f() != 0)) {
                            return false;
                        }
                        break;
                    case 3:
                        if ((cf.x.n().enMFSwitch != 0 || mFSourceT.getEn().getStory_m() != 1) && (cf.x.n().enMFSwitch != 1 || mFSourceT.getEn().getStory_f() != 0)) {
                            return false;
                        }
                        break;
                    case 4:
                        if ((cf.x.n().esMFSwitch == 0 || mFSourceT.getEsoc().getStory_m() != 1) && (cf.x.n().esMFSwitch != 1 || mFSourceT.getEsoc().getStory_f() != 0)) {
                            return false;
                        }
                        break;
                    case 5:
                        if ((cf.x.n().frMFSwitch == 0 || mFSourceT.getFroc().getStory_m() != 1) && (cf.x.n().frMFSwitch != 1 || mFSourceT.getFroc().getStory_f() != 0)) {
                            return false;
                        }
                        break;
                    case 6:
                        if ((cf.x.n().deMFSwitch == 0 || mFSourceT.getDeoc().getStory_m() != 1) && (cf.x.n().deMFSwitch != 1 || mFSourceT.getDeoc().getStory_f() != 0)) {
                            return false;
                        }
                        break;
                    case 7:
                        if ((cf.x.n().vtMFSwitch != 0 || mFSourceT.getVt().getStory_m() != 1) && (cf.x.n().vtMFSwitch != 1 || mFSourceT.getVt().getStory_f() != 0)) {
                            return false;
                        }
                        break;
                    case 8:
                        if ((cf.x.n().ptMFSwitch == 0 || mFSourceT.getPt().getStory_m() != 1) && (cf.x.n().ptMFSwitch != 1 || mFSourceT.getPt().getStory_f() != 0)) {
                            return false;
                        }
                        break;
                    default:
                        switch (i11) {
                            case 10:
                                return cf.x.n().ruMFSwitch == 0 ? false : false;
                            case 11:
                                if ((cf.x.n().cnupMFSwitch != 0 || mFSourceT.getCnup().getStory_m() != 1) && (cf.x.n().cnupMFSwitch != 1 || mFSourceT.getCnup().getStory_f() != 0)) {
                                    return false;
                                }
                                break;
                            case 12:
                                if ((cf.x.n().jpupMFSwitch != 0 || mFSourceT.getJpup().getStory_m() != 1) && (cf.x.n().jpupMFSwitch != 1 || mFSourceT.getJpup().getStory_f() != 0)) {
                                    return false;
                                }
                                break;
                            case 13:
                                if ((cf.x.n().krupMFSwitch != 0 || mFSourceT.getKrup().getStory_m() != 1) && (cf.x.n().krupMFSwitch != 1 || mFSourceT.getKrup().getStory_f() != 0)) {
                                    return false;
                                }
                                break;
                            case 14:
                                return cf.x.n().esMFSwitch == 0 ? false : false;
                            case 15:
                                return cf.x.n().frMFSwitch == 0 ? false : false;
                            case 16:
                                return cf.x.n().deMFSwitch == 0 ? false : false;
                            case 17:
                                return cf.x.n().ptMFSwitch == 0 ? false : false;
                        }
                        break;
                }
            }
        }
        return true;
    }

    public static ij.d x() {
        if (ij.d.f34419e == null) {
            synchronized (ij.d.class) {
                if (ij.d.f34419e == null) {
                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                    kotlin.jvm.internal.m.c(lingoSkillApplication);
                    ij.d.f34419e = new ij.d(lingoSkillApplication);
                }
            }
        }
        ij.d dVar = ij.d.f34419e;
        kotlin.jvm.internal.m.c(dVar);
        return dVar;
    }

    public static final int y(lz.g range) {
        jz.d dVar = jz.e.f37397a;
        kotlin.jvm.internal.m.f(range, "range");
        int i11 = range.f40532a;
        if (range.isEmpty()) {
            throw new IllegalArgumentException("Cannot get random in empty range: " + range);
        }
        int i12 = range.f40533b;
        if (i12 < Integer.MAX_VALUE) {
            return jz.e.f37398b.e(i11, i12 + 1);
        }
        if (i11 <= Integer.MIN_VALUE) {
            return jz.e.f37398b.c();
        }
        return jz.e.f37398b.e(i11 - 1, i12) + 1;
    }

    public static pd.a z(pd.e eVar) {
        long j11;
        boolean z11;
        long j12;
        long j13;
        long j14;
        long j15;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Map map = eVar.f46784b;
        if (map == null) {
            return null;
        }
        String str = (String) map.get(HttpHeaders.DATE);
        long jA = str != null ? A(str) : 0L;
        String str2 = (String) map.get(HttpHeaders.CACHE_CONTROL);
        int i11 = 0;
        if (str2 != null) {
            String[] strArrSplit = str2.split(",", 0);
            z11 = false;
            j12 = 0;
            j13 = 0;
            while (i11 < strArrSplit.length) {
                String strTrim = strArrSplit[i11].trim();
                if (strTrim.equals("no-cache") || strTrim.equals("no-store")) {
                    return null;
                }
                if (strTrim.startsWith("max-age=")) {
                    try {
                        j12 = Long.parseLong(strTrim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (strTrim.startsWith("stale-while-revalidate=")) {
                    j13 = Long.parseLong(strTrim.substring(23));
                } else if (strTrim.equals("must-revalidate") || strTrim.equals("proxy-revalidate")) {
                    z11 = true;
                }
                i11++;
            }
            j11 = 0;
            i11 = 1;
        } else {
            j11 = 0;
            z11 = false;
            j12 = 0;
            j13 = 0;
        }
        String str3 = (String) map.get(HttpHeaders.EXPIRES);
        long jA2 = str3 != null ? A(str3) : j11;
        String str4 = (String) map.get(HttpHeaders.LAST_MODIFIED);
        long jA3 = str4 != null ? A(str4) : j11;
        String str5 = (String) map.get(HttpHeaders.ETAG);
        if (i11 != 0) {
            long j16 = (j12 * 1000) + jCurrentTimeMillis;
            j15 = z11 ? j16 : (j13 * 1000) + j16;
            j14 = j16;
        } else {
            j14 = (jA <= j11 || jA2 < jA) ? j11 : (jA2 - jA) + jCurrentTimeMillis;
            j15 = j14;
        }
        pd.a aVar = new pd.a();
        aVar.f46761a = eVar.f46783a;
        aVar.f46762b = str5;
        aVar.f46766f = j14;
        aVar.f46765e = j15;
        aVar.f46763c = jA;
        aVar.f46764d = jA3;
        aVar.f46767g = map;
        aVar.f46768h = eVar.f46785c;
        return aVar;
    }

    public abstract void F(ArrayList arrayList);

    public abstract String l(byte[] bArr, int i11, int i12);

    public abstract int m(String str, byte[] bArr, int i11, int i12);

    public static final void c(i0 i0Var, sg.q astNode, l1.n nVar, int i11) {
        kotlin.jvm.internal.m.f(i0Var, ypOOxsaJG.djJzGJjtmFvmj);
        l1.s sVar = (l1.s) nVar;
        sVar.f0(366594227);
        int i12 = (i11 & 6) == 0 ? (sVar.f(i0Var) ? 4 : 2) | i11 : i11;
        if ((i11 & 48) == 0) {
            i12 |= sVar.f(astNode) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= (i11 & 512) == 0 ? sVar.f(null) : sVar.h(null) ? 256 : 128;
        }
        if ((i12 & 147) == 146 && sVar.F()) {
            sVar.W();
        } else {
            if (astNode == null) {
                x1 x1VarT = sVar.t();
                if (x1VarT != null) {
                    x1VarT.f39502d = new rg.b(i0Var, astNode, i11, 1);
                    return;
                }
                return;
            }
            sVar.d0(-1973284790);
            t1.d dVarD = t1.e.d(1712110702, new e1(i0Var, 4), sVar);
            int i13 = (i12 & 112) | (i12 & 14) | 384;
            kotlin.jvm.internal.m.f(i0Var, "<this>");
            kotlin.jvm.internal.m.f(astNode, "astNode");
            sVar.d0(-1256053540);
            c.a aVar = astNode.f51656a;
            if (aVar instanceof sg.d) {
                sVar.d0(2144216659);
                dVarD.invoke(astNode, sVar, Integer.valueOf((i13 >> 3) & 126));
                sVar.p(false);
            } else if (aVar instanceof sg.a) {
                sVar.d0(2046257180);
                tg.f.a(i0Var, t1.e.d(301482436, new d0.b1(3, dVarD, astNode), sVar), sVar, (i13 & 14) | 48);
                sVar.p(false);
            } else if (aVar instanceof sg.f0) {
                sVar.d0(2046370857);
                tg.u.a(i0Var, tg.d0.Unordered, nz.n.Z(ue.f.q(astNode, rg.c.f49249b)), 0, t1.e.d(-996206079, new m0.i(dVarD, 1), sVar), sVar, (i13 & 14) | 24624, 4);
                sVar.p(false);
            } else if (aVar instanceof sg.s) {
                sVar.d0(2046809445);
                tg.u.a(i0Var, tg.d0.Ordered, nz.n.Z(ue.f.l(astNode, false)), ((sg.s) aVar).f51663a - 1, t1.e.d(-1232823904, new m0.i(dVarD, 2), sVar), sVar, (i13 & 14) | 24624, 0);
                sVar.p(false);
            } else if (aVar instanceof sg.e0) {
                sVar.d0(2047271779);
                tg.v.d(i0Var, sVar, i13 & 14);
                sVar.p(false);
            } else if (aVar instanceof sg.h) {
                sVar.d0(2047333407);
                tg.v.c(i0Var, ((sg.h) aVar).f51644a, t1.e.d(727548192, new rg.d(astNode, 0), sVar), sVar, (i13 & 14) | 384);
                sVar.p(false);
            } else if (aVar instanceof sg.l) {
                sVar.d0(2047498823);
                tg.i.a(i0Var, oz.q.i1(((sg.l) aVar).f51649a).toString(), sVar, i13 & 14);
                sVar.p(false);
            } else if (aVar instanceof sg.f) {
                sVar.d0(2047593063);
                tg.i.a(i0Var, oz.q.i1(((sg.f) aVar).f51641e).toString(), sVar, i13 & 14);
                sVar.p(false);
            } else if (aVar instanceof sg.i) {
                sVar.d0(2047684668);
                sVar.d0(2144264999);
                j3.e eVar = new j3.e(16);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                vg.a aVar2 = new vg.a(null, t1.e.d(-1003319804, new qu.u(1, i0Var, aVar), sVar), 3);
                String string = UUID.randomUUID().toString();
                kotlin.jvm.internal.m.e(string, "toString(...)");
                linkedHashMap.put("inline:".concat(string), aVar2);
                o0.o(eVar, string, "�");
                vg.m mVar = new vg.m(eVar.j(), ry.x.h0(linkedHashMap));
                sVar.p(false);
                c.a.c(i0Var, mVar, null, null, false, 0, 0, sVar, i13 & 14, 62);
                sVar = sVar;
                sVar.p(false);
            } else if (aVar instanceof sg.o) {
                sVar.d0(2047889578);
                sVar.p(false);
            } else if (aVar instanceof sg.t) {
                sVar.d0(2047974394);
                p.H(i0Var, astNode, null, sVar, i13 & 126, 2);
                sVar = sVar;
                sVar.p(false);
            } else if (aVar instanceof b0) {
                sVar.d0(2048043679);
                ub.a.K(i0Var, astNode, sVar, i13 & 126);
                sVar.p(false);
            } else if (aVar instanceof sg.d0) {
                sVar.d0(2048339171);
                System.out.println((Object) "Unexpected raw text while traversing the Abstract Syntax Tree.");
                StringBuilder sb2 = new StringBuilder(16);
                new ArrayList();
                ArrayList arrayList = new ArrayList();
                new ArrayList();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                String text = ((sg.d0) aVar).f51634a;
                kotlin.jvm.internal.m.f(text, "text");
                sb2.append(text);
                String string2 = sb2.toString();
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                int size = arrayList.size();
                for (int i14 = 0; i14 < size; i14++) {
                    arrayList2.add(((j3.d) arrayList.get(i14)).a(sb2.length()));
                }
                c.a.c(i0Var, new vg.m(new j3.h(string2, arrayList2), ry.x.h0(linkedHashMap2)), null, null, false, 0, 0, sVar, i13 & 14, 62);
                sVar = sVar;
                sVar.p(false);
            } else if (aVar instanceof sg.p) {
                sVar.d0(2048585621);
                sVar.p(false);
                System.out.println((Object) "MarkdownRichText: Unexpected AstListItem while traversing the Abstract Syntax Tree.");
            } else if (aVar instanceof sg.m) {
                sVar.d0(2048729616);
                sVar.p(false);
                System.out.println((Object) ("MarkdownRichText: Unexpected AstInlineNodeType " + aVar + " while traversing the Abstract Syntax Tree."));
            } else {
                if (!aVar.equals(sg.x.f51669a) && !aVar.equals(a0.f51629a) && !aVar.equals(c0.f51632a) && !(aVar instanceof sg.y)) {
                    throw nv.p.x(sVar, 2144217546, false);
                }
                sVar.d0(2048963542);
                sVar.p(false);
                System.out.println((Object) "MarkdownRichText: Unexpected Table node while traversing the Abstract Syntax Tree.");
            }
            sVar.p(false);
            sVar.p(false);
        }
        x1 x1VarT2 = sVar.t();
        if (x1VarT2 != null) {
            x1VarT2.f39502d = new rg.b(i0Var, astNode, i11, 2);
        }
    }
}
