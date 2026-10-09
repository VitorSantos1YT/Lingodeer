package dt;

import aj.uZCn.evRpcb;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import bt.w6;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.lingodeer.R;
import com.lingodeer.data.model.AchievementLevelType;
import com.lingodeer.data.model.OptionItemSelectedState;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import h1.k7;
import h1.ua;
import java.text.Normalizer;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import sz.xej.iFLeRCXvYCGdPW;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final oz.o f23626a = new oz.o("\\p{M}+");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Locale f23627b = Locale.forLanguageTag("tr");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l1.c3 f23628c = new l1.c3(new cr.m(11));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f23629d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f23630e = -1;

    public static final boolean A(int i11, String str) {
        kotlin.jvm.internal.m.f(str, "<this>");
        Pattern patternCompile = Pattern.compile("[\\p{P}+~$`^=|<>～｀＄＾＋＝｜＜＞￥×]");
        kotlin.jvm.internal.m.e(patternCompile, "compile(...)");
        return (patternCompile.matcher(str).matches() || ry.l.D(new String[]{"..."}, str)) && !F(i11, str);
    }

    public static final String B(int i11, String str) {
        String strNormalize = Normalizer.normalize(str, Normalizer.Form.NFC);
        if (z(i11)) {
            kotlin.jvm.internal.m.c(strNormalize);
            return E(strNormalize);
        }
        kotlin.jvm.internal.m.c(strNormalize);
        return strNormalize;
    }

    public static final String C(int i11, String str) {
        kotlin.jvm.internal.m.f(str, "<this>");
        Locale locale = (i11 == 21 || i11 == 60) ? f23627b : Locale.ROOT;
        kotlin.jvm.internal.m.c(locale);
        String lowerCase = str.toLowerCase(locale);
        kotlin.jvm.internal.m.e(lowerCase, "toLowerCase(...)");
        return B(i11, lowerCase);
    }

    public static final String E(String str) {
        String strNormalize = Normalizer.normalize(str, Normalizer.Form.NFD);
        kotlin.jvm.internal.m.c(strNormalize);
        String strNormalize2 = Normalizer.normalize(oz.x.q0(strNormalize, "́", BuildConfig.VERSION_NAME), Normalizer.Form.NFC);
        kotlin.jvm.internal.m.e(strNormalize2, "normalize(...)");
        return strNormalize2;
    }

    public static final boolean F(int i11, String str) {
        kotlin.jvm.internal.m.f(str, "<this>");
        if (str.equals("'")) {
            return true;
        }
        if (i11 != 63 && i11 != 64) {
            return false;
        }
        Character chValueOf = str.length() == 1 ? Character.valueOf(str.charAt(0)) : null;
        if (chValueOf == null) {
            return false;
        }
        char cCharValue = chValueOf.charValue();
        return cCharValue == '\'' || cCharValue == 8217 || cCharValue == 700 || cCharValue == 65287 || cCharValue == 699;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0047  */
    /* JADX WARN: Code duplicated, block: B:25:0x004d  */
    /* JADX WARN: Code duplicated, block: B:26:0x0050  */
    /* JADX WARN: Code duplicated, block: B:30:0x0059  */
    /* JADX WARN: Code duplicated, block: B:32:0x005f  */
    /* JADX WARN: Code duplicated, block: B:33:0x0061  */
    /* JADX WARN: Code duplicated, block: B:37:0x006c  */
    /* JADX WARN: Code duplicated, block: B:38:0x006e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0077 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0079  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:48:0x00be  */
    /* JADX WARN: Code duplicated, block: B:49:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:57:0x0102  */
    /* JADX WARN: Code duplicated, block: B:59:0x013c  */
    /* JADX WARN: Code duplicated, block: B:62:0x0146  */
    /* JADX WARN: Code duplicated, block: B:64:? A[RETURN, SYNTHETIC] */
    public static final void a(boolean z11, z1.r rVar, long j11, fz.a onClick, l1.n nVar, int i11, int i12) {
        int i13;
        z1.r rVarN;
        boolean z12;
        z1.r rVar2;
        l1.x1 x1VarT;
        List listL;
        kotlin.jvm.internal.w wVar;
        Object objQ;
        l1.g gVar;
        l1.b1 b1Var;
        l1.b1 b1Var2;
        boolean z13;
        Object objQ2;
        int i14;
        int i15;
        kotlin.jvm.internal.m.f(onClick, "onClick");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1098481714);
        if ((i11 & 6) == 0) {
            i13 = (sVar.g(z11) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i16 = i12 & 2;
        if (i16 == 0) {
            if ((i11 & 48) == 0) {
                rVarN = rVar;
                i13 |= sVar.f(rVarN) ? 32 : 16;
            }
            if ((i11 & 384) == 0) {
                if (sVar.e(j11)) {
                    i15 = 256;
                } else {
                    i15 = 128;
                }
                i13 |= i15;
            }
            if ((i11 & 3072) == 0) {
                if (sVar.h(onClick)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i13 |= i14;
            }
            if ((i13 & 1171) != 1170) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (sVar.T(i13 & 1, z12)) {
                if (i16 != 0) {
                    rVarN = j0.e2.n(z1.o.f58481a, 32);
                }
                listL = ns.o.L(se.k.y(R.drawable.ic_pinyin_audio_3, sVar, 0), se.k.y(R.drawable.ic_pinyin_audio_2, sVar, 0), se.k.y(R.drawable.ic_pinyin_audio_1, sVar, 0));
                wVar = new kotlin.jvm.internal.w();
                objQ = sVar.Q();
                gVar = l1.m.f39353a;
                if (objQ == gVar) {
                    objQ = l1.t.B(listL.get(wVar.f38359a));
                    sVar.o0(objQ);
                }
                b1Var = (l1.b1) objQ;
                if (z11) {
                    sVar.d0(-1512418137);
                    b1Var2 = b1Var;
                    l1.t.f(new w(b1Var, listL, wVar, null, 0), qy.b0.f48488a, sVar);
                    sVar.p(false);
                } else {
                    b1Var2 = b1Var;
                    sVar.d0(-1512059994);
                    sVar.p(false);
                    b1Var2.setValue(listL.get(0));
                }
                k2.b bVar = (k2.b) b1Var2.getValue();
                z13 = (i13 & 7168) == 2048;
                objQ2 = sVar.Q();
                if (z13 || objQ2 == gVar) {
                    objQ2 = new ch.o0(5, onClick);
                    sVar.o0(objQ2);
                }
                z1.r rVar3 = rVarN;
                d0.n.c(bVar, null, d2.h.i(iu.k.q((i13 >> 3) & 14, 7, (fz.a) objQ2, sVar, rVar3, false), iu.k.p(sVar), 1.0f), null, null, CropImageView.DEFAULT_ASPECT_RATIO, new g2.p(j11, 5), sVar, 48, 56);
                sVar = sVar;
                rVar2 = rVar3;
            } else {
                sVar.W();
                rVar2 = rVarN;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new m(z11, rVar2, j11, onClick, i11, i12, 0);
            }
        }
        i13 |= 48;
        rVarN = rVar;
        if ((i11 & 384) == 0) {
            if (sVar.e(j11)) {
                i15 = 256;
            } else {
                i15 = 128;
            }
            i13 |= i15;
        }
        if ((i11 & 3072) == 0) {
            if (sVar.h(onClick)) {
                i14 = 2048;
            } else {
                i14 = 1024;
            }
            i13 |= i14;
        }
        if ((i13 & 1171) != 1170) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (sVar.T(i13 & 1, z12)) {
            if (i16 != 0) {
                rVarN = j0.e2.n(z1.o.f58481a, 32);
            }
            listL = ns.o.L(se.k.y(R.drawable.ic_pinyin_audio_3, sVar, 0), se.k.y(R.drawable.ic_pinyin_audio_2, sVar, 0), se.k.y(R.drawable.ic_pinyin_audio_1, sVar, 0));
            wVar = new kotlin.jvm.internal.w();
            objQ = sVar.Q();
            gVar = l1.m.f39353a;
            if (objQ == gVar) {
                objQ = l1.t.B(listL.get(wVar.f38359a));
                sVar.o0(objQ);
            }
            b1Var = (l1.b1) objQ;
            if (z11) {
                sVar.d0(-1512418137);
                b1Var2 = b1Var;
                l1.t.f(new w(b1Var, listL, wVar, null, 0), qy.b0.f48488a, sVar);
                sVar.p(false);
            } else {
                b1Var2 = b1Var;
                sVar.d0(-1512059994);
                sVar.p(false);
                b1Var2.setValue(listL.get(0));
            }
            k2.b bVar2 = (k2.b) b1Var2.getValue();
            if ((i13 & 7168) == 2048) {
            }
            objQ2 = sVar.Q();
            if (z13) {
                objQ2 = new ch.o0(5, onClick);
                sVar.o0(objQ2);
            } else {
                objQ2 = new ch.o0(5, onClick);
                sVar.o0(objQ2);
            }
            z1.r rVar4 = rVarN;
            d0.n.c(bVar2, null, d2.h.i(iu.k.q((i13 >> 3) & 14, 7, (fz.a) objQ2, sVar, rVar4, false), iu.k.p(sVar), 1.0f), null, null, CropImageView.DEFAULT_ASPECT_RATIO, new g2.p(j11, 5), sVar, 48, 56);
            sVar = sVar;
            rVar2 = rVar4;
        } else {
            sVar.W();
            rVar2 = rVarN;
        }
        x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new m(z11, rVar2, j11, onClick, i11, i12, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0042  */
    /* JADX WARN: Code duplicated, block: B:20:0x0045  */
    /* JADX WARN: Code duplicated, block: B:23:0x0050  */
    /* JADX WARN: Code duplicated, block: B:24:0x0052  */
    /* JADX WARN: Code duplicated, block: B:27:0x005d  */
    /* JADX WARN: Code duplicated, block: B:28:0x005f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0068 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x006a  */
    /* JADX WARN: Code duplicated, block: B:33:0x006e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0099  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:44:0x0108  */
    /* JADX WARN: Code duplicated, block: B:48:0x0111  */
    /* JADX WARN: Code duplicated, block: B:50:0x013f  */
    /* JADX WARN: Code duplicated, block: B:53:0x0149  */
    /* JADX WARN: Code duplicated, block: B:55:? A[RETURN, SYNTHETIC] */
    public static final void b(boolean z11, z1.r rVar, long j11, fz.a onClick, l1.n nVar, int i11, int i12) {
        z1.r rVar2;
        int i13;
        int i14;
        int i15;
        boolean z12;
        z1.r rVar3;
        l1.x1 x1VarT;
        z1.r rVar4;
        List listL;
        kotlin.jvm.internal.w wVar;
        Object objQ;
        l1.g gVar;
        l1.b1 b1Var;
        l1.b1 b1Var2;
        boolean z13;
        Object objQ2;
        kotlin.jvm.internal.m.f(onClick, "onClick");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1537122355);
        int i16 = i11 | (sVar.g(z11) ? 4 : 2);
        int i17 = i12 & 2;
        if (i17 == 0) {
            if ((i11 & 48) == 0) {
                rVar2 = rVar;
                i16 |= sVar.f(rVar2) ? 32 : 16;
            }
            if (sVar.e(j11)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            int i18 = i16 | i13;
            if (sVar.h(onClick)) {
                i14 = 2048;
            } else {
                i14 = 1024;
            }
            i15 = i18 | i14;
            if ((i15 & 1171) != 1170) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (sVar.T(i15 & 1, z12)) {
                if (i17 != 0) {
                    rVar4 = z1.o.f58481a;
                } else {
                    rVar4 = rVar2;
                }
                listL = ns.o.L(se.k.y(R.drawable.ic_slow_audio_3, sVar, 0), se.k.y(R.drawable.ic_slow_audio_2, sVar, 0), se.k.y(R.drawable.ic_slow_audio_1, sVar, 0));
                wVar = new kotlin.jvm.internal.w();
                objQ = sVar.Q();
                gVar = l1.m.f39353a;
                if (objQ == gVar) {
                    objQ = l1.t.B(listL.get(wVar.f38359a));
                    sVar.o0(objQ);
                }
                b1Var = (l1.b1) objQ;
                if (z11) {
                    sVar.d0(529701768);
                    b1Var2 = b1Var;
                    l1.t.f(new w(b1Var, listL, wVar, null, 1), qy.b0.f48488a, sVar);
                    sVar.p(false);
                } else {
                    b1Var2 = b1Var;
                    sVar.d0(530059911);
                    sVar.p(false);
                    b1Var2.setValue(listL.get(0));
                }
                k2.b bVar = (k2.b) b1Var2.getValue();
                z1.r rVarI = d2.h.i(j0.c.E(j0.e2.n(rVar4, 42), CropImageView.DEFAULT_ASPECT_RATIO, 2, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), iu.k.p(sVar), 1.0f);
                z13 = (i15 & 7168) == 2048;
                objQ2 = sVar.Q();
                if (z13 || objQ2 == gVar) {
                    objQ2 = new ch.o0(9, onClick);
                    sVar.o0(objQ2);
                }
                d0.n.c(bVar, null, iu.k.q(0, 7, (fz.a) objQ2, sVar, rVarI, false), null, null, CropImageView.DEFAULT_ASPECT_RATIO, new g2.p(j11, 5), sVar, 48, 56);
                sVar = sVar;
                rVar3 = rVar4;
            } else {
                sVar.W();
                rVar3 = rVar2;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new m(z11, rVar3, j11, onClick, i11, i12, 1);
            }
        }
        i16 |= 48;
        rVar2 = rVar;
        if (sVar.e(j11)) {
            i13 = 256;
        } else {
            i13 = 128;
        }
        int i19 = i16 | i13;
        if (sVar.h(onClick)) {
            i14 = 2048;
        } else {
            i14 = 1024;
        }
        i15 = i19 | i14;
        if ((i15 & 1171) != 1170) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (sVar.T(i15 & 1, z12)) {
            if (i17 != 0) {
                rVar4 = z1.o.f58481a;
            } else {
                rVar4 = rVar2;
            }
            listL = ns.o.L(se.k.y(R.drawable.ic_slow_audio_3, sVar, 0), se.k.y(R.drawable.ic_slow_audio_2, sVar, 0), se.k.y(R.drawable.ic_slow_audio_1, sVar, 0));
            wVar = new kotlin.jvm.internal.w();
            objQ = sVar.Q();
            gVar = l1.m.f39353a;
            if (objQ == gVar) {
                objQ = l1.t.B(listL.get(wVar.f38359a));
                sVar.o0(objQ);
            }
            b1Var = (l1.b1) objQ;
            if (z11) {
                sVar.d0(529701768);
                b1Var2 = b1Var;
                l1.t.f(new w(b1Var, listL, wVar, null, 1), qy.b0.f48488a, sVar);
                sVar.p(false);
            } else {
                b1Var2 = b1Var;
                sVar.d0(530059911);
                sVar.p(false);
                b1Var2.setValue(listL.get(0));
            }
            k2.b bVar2 = (k2.b) b1Var2.getValue();
            z1.r rVarI2 = d2.h.i(j0.c.E(j0.e2.n(rVar4, 42), CropImageView.DEFAULT_ASPECT_RATIO, 2, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), iu.k.p(sVar), 1.0f);
            if ((i15 & 7168) == 2048) {
            }
            objQ2 = sVar.Q();
            if (z13) {
                objQ2 = new ch.o0(9, onClick);
                sVar.o0(objQ2);
            } else {
                objQ2 = new ch.o0(9, onClick);
                sVar.o0(objQ2);
            }
            d0.n.c(bVar2, null, iu.k.q(0, 7, (fz.a) objQ2, sVar, rVarI2, false), null, null, CropImageView.DEFAULT_ASPECT_RATIO, new g2.p(j11, 5), sVar, 48, 56);
            sVar = sVar;
            rVar3 = rVar4;
        } else {
            sVar.W();
            rVar3 = rVar2;
        }
        x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new m(z11, rVar3, j11, onClick, i11, i12, 1);
        }
    }

    public static final void c(int i11, long j11, fz.a onClick, l1.n nVar, z1.r rVar, boolean z11) {
        int i12;
        l1.b1 b1Var;
        kotlin.jvm.internal.m.f(onClick, "onClick");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1070534414);
        if ((i11 & 6) == 0) {
            i12 = (sVar.g(z11) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.f(rVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar.e(j11) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar.h(onClick) ? 2048 : 1024;
        }
        if (sVar.T(i12 & 1, (i12 & 1171) != 1170)) {
            List listL = ns.o.L(se.k.y(R.drawable.ic_user_record_audio_3, sVar, 0), se.k.y(R.drawable.ic_user_record_audio_2, sVar, 0), se.k.y(R.drawable.ic_user_record_audio_1, sVar, 0));
            kotlin.jvm.internal.w wVar = new kotlin.jvm.internal.w();
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                objQ = l1.t.B(listL.get(wVar.f38359a));
                sVar.o0(objQ);
            }
            l1.b1 b1Var2 = (l1.b1) objQ;
            if (z11) {
                sVar.d0(2136909027);
                b1Var = b1Var2;
                l1.t.f(new w(b1Var, listL, wVar, null, 2), qy.b0.f48488a, sVar);
                sVar.p(false);
            } else {
                b1Var = b1Var2;
                sVar.d0(2137267170);
                sVar.p(false);
                b1Var.setValue(listL.get(0));
            }
            k2.b bVar = (k2.b) b1Var.getValue();
            z1.r rVarI = d2.h.i(j0.e2.n(rVar, 32), iu.k.p(sVar), 1.0f);
            boolean z12 = (i12 & 7168) == 2048;
            Object objQ2 = sVar.Q();
            if (z12 || objQ2 == gVar) {
                objQ2 = new ch.o0(6, onClick);
                sVar.o0(objQ2);
            }
            d0.n.c(bVar, null, iu.k.q(0, 7, (fz.a) objQ2, sVar, rVarI, false), null, null, CropImageView.DEFAULT_ASPECT_RATIO, new g2.p(j11, 5), sVar, 48, 56);
            sVar = sVar;
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new k(z11, rVar, j11, onClick, i11, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0042  */
    /* JADX WARN: Code duplicated, block: B:25:0x0047  */
    /* JADX WARN: Code duplicated, block: B:27:0x004b  */
    /* JADX WARN: Code duplicated, block: B:29:0x0053  */
    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
    /* JADX WARN: Code duplicated, block: B:34:0x005f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0064  */
    /* JADX WARN: Code duplicated, block: B:38:0x0068  */
    /* JADX WARN: Code duplicated, block: B:40:0x0070  */
    /* JADX WARN: Code duplicated, block: B:41:0x0073  */
    /* JADX WARN: Code duplicated, block: B:45:0x007c  */
    /* JADX WARN: Code duplicated, block: B:47:0x0080  */
    /* JADX WARN: Code duplicated, block: B:49:0x0083  */
    /* JADX WARN: Code duplicated, block: B:51:0x008b  */
    /* JADX WARN: Code duplicated, block: B:52:0x008e  */
    /* JADX WARN: Code duplicated, block: B:56:0x0096  */
    /* JADX WARN: Code duplicated, block: B:58:0x009e  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:80:0x00de  */
    /* JADX WARN: Code duplicated, block: B:83:0x0104  */
    /* JADX WARN: Code duplicated, block: B:84:0x0108  */
    /* JADX WARN: Code duplicated, block: B:87:0x011b  */
    /* JADX WARN: Code duplicated, block: B:89:0x0129  */
    /* JADX WARN: Code duplicated, block: B:91:0x016d  */
    /* JADX WARN: Code duplicated, block: B:94:0x017d  */
    /* JADX WARN: Code duplicated, block: B:96:? A[RETURN, SYNTHETIC] */
    public static final void d(final l1.b1 currentTextStyle, z1.r rVar, j0.f fVar, z1.i iVar, float f5, float f11, final t1.d dVar, l1.n nVar, final int i11, final int i12) {
        int i13;
        z1.r rVar2;
        int i14;
        j0.f fVar2;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        float f12;
        int i21;
        t1.d dVar2;
        boolean z11;
        final float f13;
        final z1.r rVar3;
        final j0.f fVar3;
        final float f14;
        final z1.i iVar2;
        l1.x1 x1VarT;
        z1.r rVar4;
        j0.f fVar4;
        float f15;
        int i22;
        float f16;
        int iHashCode;
        y2.i iVar3;
        y2.h hVar;
        int i23;
        kotlin.jvm.internal.m.f(currentTextStyle, "currentTextStyle");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-358227477);
        if ((i11 & 6) == 0) {
            i13 = (sVar.f(currentTextStyle) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i24 = i12 & 2;
        if (i24 == 0) {
            if ((i11 & 48) == 0) {
                rVar2 = rVar;
                i13 |= sVar.f(rVar2) ? 32 : 16;
            }
            i14 = i12 & 4;
            if (i14 != 0) {
                if ((i11 & 384) == 0) {
                    fVar2 = fVar;
                    if (sVar.f(fVar2)) {
                        i15 = 256;
                    } else {
                        i15 = 128;
                    }
                    i13 |= i15;
                }
                i16 = i13 | 3072;
                i17 = i12 & 16;
                if (i17 != 0) {
                    if ((i11 & 24576) == 0) {
                        if (sVar.c(f5)) {
                            i18 = 16384;
                        } else {
                            i18 = OSSConstants.DEFAULT_BUFFER_SIZE;
                        }
                        i16 |= i18;
                    }
                    i19 = i12 & 32;
                    if (i19 != 0) {
                        if ((196608 & i11) == 0) {
                            f12 = f11;
                            if (sVar.c(f12)) {
                                i21 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                            } else {
                                i21 = 65536;
                            }
                            i16 |= i21;
                        }
                        if ((1572864 & i11) == 0) {
                            dVar2 = dVar;
                            if (sVar.h(dVar2)) {
                                i23 = 1048576;
                            } else {
                                i23 = 524288;
                            }
                            i16 |= i23;
                        } else {
                            dVar2 = dVar;
                        }
                        if ((599187 & i16) != 599186) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (sVar.T(i16 & 1, z11)) {
                            if (i24 != 0) {
                                rVar4 = z1.o.f58481a;
                            } else {
                                rVar4 = rVar2;
                            }
                            if (i14 != 0) {
                                fVar4 = j0.i.f35307e;
                            } else {
                                fVar4 = fVar2;
                            }
                            z1.i iVar4 = z1.c.M;
                            if (i17 != 0) {
                                f15 = 8;
                            } else {
                                f15 = f5;
                            }
                            if (i19 != 0) {
                                int i25 = i16;
                                f16 = 8;
                                i22 = i25;
                            } else {
                                i22 = i16;
                                f16 = f12;
                            }
                            int i26 = i22 >> 3;
                            w2.q0 q0VarD = j0.o.d(z1.c.f58467e, false);
                            iHashCode = Long.hashCode(sVar.T);
                            l1.q1 q1VarL = sVar.l();
                            z1.r rVarC = z1.a.c(sVar, rVar4);
                            y2.k.J.getClass();
                            iVar3 = y2.j.f56913b;
                            sVar.h0();
                            if (sVar.S) {
                                sVar.k(iVar3);
                            } else {
                                sVar.r0();
                            }
                            l1.t.J(y2.j.f56917f, q0VarD, sVar);
                            l1.t.J(y2.j.f56916e, q1VarL, sVar);
                            hVar = y2.j.f56918g;
                            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                            }
                            l1.t.J(y2.j.f56915d, rVarC, sVar);
                            int i27 = (i26 & 112) | 24576 | (i26 & 896) | ((i22 << 15) & 458752);
                            int i28 = i22 << 6;
                            z1.r rVar5 = rVar4;
                            e.C(null, fVar4, iVar4, null, false, currentTextStyle, f15, f16, 0, 0L, dVar2, sVar, i27 | (3670016 & i28) | (i28 & 29360128), (i22 >> 18) & 14, 777);
                            sVar.p(true);
                            fVar3 = fVar4;
                            iVar2 = iVar4;
                            f13 = f15;
                            f14 = f16;
                            rVar3 = rVar5;
                        } else {
                            sVar.W();
                            f13 = f5;
                            rVar3 = rVar2;
                            fVar3 = fVar2;
                            f14 = f12;
                            iVar2 = iVar;
                        }
                        x1VarT = sVar.t();
                        if (x1VarT != null) {
                            x1VarT.f39502d = new fz.e() { // from class: dt.r
                                @Override // fz.e
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    a0.d(currentTextStyle, rVar3, fVar3, iVar2, f13, f14, dVar, (l1.n) obj, l1.t.M(i11 | 1), i12);
                                    return qy.b0.f48488a;
                                }
                            };
                        }
                    }
                    i16 |= 196608;
                    f12 = f11;
                    if ((1572864 & i11) == 0) {
                        dVar2 = dVar;
                        if (sVar.h(dVar2)) {
                            i23 = 1048576;
                        } else {
                            i23 = 524288;
                        }
                        i16 |= i23;
                    } else {
                        dVar2 = dVar;
                    }
                    if ((599187 & i16) != 599186) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (sVar.T(i16 & 1, z11)) {
                        if (i24 != 0) {
                            rVar4 = z1.o.f58481a;
                        } else {
                            rVar4 = rVar2;
                        }
                        if (i14 != 0) {
                            fVar4 = j0.i.f35307e;
                        } else {
                            fVar4 = fVar2;
                        }
                        z1.i iVar5 = z1.c.M;
                        if (i17 != 0) {
                            f15 = 8;
                        } else {
                            f15 = f5;
                        }
                        if (i19 != 0) {
                            int i29 = i16;
                            f16 = 8;
                            i22 = i29;
                        } else {
                            i22 = i16;
                            f16 = f12;
                        }
                        int i210 = i22 >> 3;
                        w2.q0 q0VarD2 = j0.o.d(z1.c.f58467e, false);
                        iHashCode = Long.hashCode(sVar.T);
                        l1.q1 q1VarL2 = sVar.l();
                        z1.r rVarC2 = z1.a.c(sVar, rVar4);
                        y2.k.J.getClass();
                        iVar3 = y2.j.f56913b;
                        sVar.h0();
                        if (sVar.S) {
                            sVar.k(iVar3);
                        } else {
                            sVar.r0();
                        }
                        l1.t.J(y2.j.f56917f, q0VarD2, sVar);
                        l1.t.J(y2.j.f56916e, q1VarL2, sVar);
                        hVar = y2.j.f56918g;
                        if (sVar.S) {
                            defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                        } else {
                            defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                        }
                        l1.t.J(y2.j.f56915d, rVarC2, sVar);
                        int i211 = (i210 & 112) | 24576 | (i210 & 896) | ((i22 << 15) & 458752);
                        int i212 = i22 << 6;
                        z1.r rVar6 = rVar4;
                        e.C(null, fVar4, iVar5, null, false, currentTextStyle, f15, f16, 0, 0L, dVar2, sVar, i211 | (3670016 & i212) | (i212 & 29360128), (i22 >> 18) & 14, 777);
                        sVar.p(true);
                        fVar3 = fVar4;
                        iVar2 = iVar5;
                        f13 = f15;
                        f14 = f16;
                        rVar3 = rVar6;
                    } else {
                        sVar.W();
                        f13 = f5;
                        rVar3 = rVar2;
                        fVar3 = fVar2;
                        f14 = f12;
                        iVar2 = iVar;
                    }
                    x1VarT = sVar.t();
                    if (x1VarT != null) {
                        x1VarT.f39502d = new fz.e() { // from class: dt.r
                            @Override // fz.e
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                a0.d(currentTextStyle, rVar3, fVar3, iVar2, f13, f14, dVar, (l1.n) obj, l1.t.M(i11 | 1), i12);
                                return qy.b0.f48488a;
                            }
                        };
                    }
                }
                i16 = i13 | 27648;
                i19 = i12 & 32;
                if (i19 != 0) {
                    if ((196608 & i11) == 0) {
                        f12 = f11;
                        if (sVar.c(f12)) {
                            i21 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                        } else {
                            i21 = 65536;
                        }
                        i16 |= i21;
                    }
                    if ((1572864 & i11) == 0) {
                        dVar2 = dVar;
                        if (sVar.h(dVar2)) {
                            i23 = 1048576;
                        } else {
                            i23 = 524288;
                        }
                        i16 |= i23;
                    } else {
                        dVar2 = dVar;
                    }
                    if ((599187 & i16) != 599186) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (sVar.T(i16 & 1, z11)) {
                        if (i24 != 0) {
                            rVar4 = z1.o.f58481a;
                        } else {
                            rVar4 = rVar2;
                        }
                        if (i14 != 0) {
                            fVar4 = j0.i.f35307e;
                        } else {
                            fVar4 = fVar2;
                        }
                        z1.i iVar6 = z1.c.M;
                        if (i17 != 0) {
                            f15 = 8;
                        } else {
                            f15 = f5;
                        }
                        if (i19 != 0) {
                            int i213 = i16;
                            f16 = 8;
                            i22 = i213;
                        } else {
                            i22 = i16;
                            f16 = f12;
                        }
                        int i214 = i22 >> 3;
                        w2.q0 q0VarD3 = j0.o.d(z1.c.f58467e, false);
                        iHashCode = Long.hashCode(sVar.T);
                        l1.q1 q1VarL3 = sVar.l();
                        z1.r rVarC3 = z1.a.c(sVar, rVar4);
                        y2.k.J.getClass();
                        iVar3 = y2.j.f56913b;
                        sVar.h0();
                        if (sVar.S) {
                            sVar.k(iVar3);
                        } else {
                            sVar.r0();
                        }
                        l1.t.J(y2.j.f56917f, q0VarD3, sVar);
                        l1.t.J(y2.j.f56916e, q1VarL3, sVar);
                        hVar = y2.j.f56918g;
                        if (sVar.S) {
                            defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                        } else {
                            defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                        }
                        l1.t.J(y2.j.f56915d, rVarC3, sVar);
                        int i215 = (i214 & 112) | 24576 | (i214 & 896) | ((i22 << 15) & 458752);
                        int i216 = i22 << 6;
                        z1.r rVar7 = rVar4;
                        e.C(null, fVar4, iVar6, null, false, currentTextStyle, f15, f16, 0, 0L, dVar2, sVar, i215 | (3670016 & i216) | (i216 & 29360128), (i22 >> 18) & 14, 777);
                        sVar.p(true);
                        fVar3 = fVar4;
                        iVar2 = iVar6;
                        f13 = f15;
                        f14 = f16;
                        rVar3 = rVar7;
                    } else {
                        sVar.W();
                        f13 = f5;
                        rVar3 = rVar2;
                        fVar3 = fVar2;
                        f14 = f12;
                        iVar2 = iVar;
                    }
                    x1VarT = sVar.t();
                    if (x1VarT != null) {
                        x1VarT.f39502d = new fz.e() { // from class: dt.r
                            @Override // fz.e
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                a0.d(currentTextStyle, rVar3, fVar3, iVar2, f13, f14, dVar, (l1.n) obj, l1.t.M(i11 | 1), i12);
                                return qy.b0.f48488a;
                            }
                        };
                    }
                }
                i16 |= 196608;
                f12 = f11;
                if ((1572864 & i11) == 0) {
                    dVar2 = dVar;
                    if (sVar.h(dVar2)) {
                        i23 = 1048576;
                    } else {
                        i23 = 524288;
                    }
                    i16 |= i23;
                } else {
                    dVar2 = dVar;
                }
                if ((599187 & i16) != 599186) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (sVar.T(i16 & 1, z11)) {
                    if (i24 != 0) {
                        rVar4 = z1.o.f58481a;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i14 != 0) {
                        fVar4 = j0.i.f35307e;
                    } else {
                        fVar4 = fVar2;
                    }
                    z1.i iVar7 = z1.c.M;
                    if (i17 != 0) {
                        f15 = 8;
                    } else {
                        f15 = f5;
                    }
                    if (i19 != 0) {
                        int i217 = i16;
                        f16 = 8;
                        i22 = i217;
                    } else {
                        i22 = i16;
                        f16 = f12;
                    }
                    int i218 = i22 >> 3;
                    w2.q0 q0VarD4 = j0.o.d(z1.c.f58467e, false);
                    iHashCode = Long.hashCode(sVar.T);
                    l1.q1 q1VarL4 = sVar.l();
                    z1.r rVarC4 = z1.a.c(sVar, rVar4);
                    y2.k.J.getClass();
                    iVar3 = y2.j.f56913b;
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar3);
                    } else {
                        sVar.r0();
                    }
                    l1.t.J(y2.j.f56917f, q0VarD4, sVar);
                    l1.t.J(y2.j.f56916e, q1VarL4, sVar);
                    hVar = y2.j.f56918g;
                    if (sVar.S) {
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                    } else {
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                    }
                    l1.t.J(y2.j.f56915d, rVarC4, sVar);
                    int i219 = (i218 & 112) | 24576 | (i218 & 896) | ((i22 << 15) & 458752);
                    int i2110 = i22 << 6;
                    z1.r rVar8 = rVar4;
                    e.C(null, fVar4, iVar7, null, false, currentTextStyle, f15, f16, 0, 0L, dVar2, sVar, i219 | (3670016 & i2110) | (i2110 & 29360128), (i22 >> 18) & 14, 777);
                    sVar.p(true);
                    fVar3 = fVar4;
                    iVar2 = iVar7;
                    f13 = f15;
                    f14 = f16;
                    rVar3 = rVar8;
                } else {
                    sVar.W();
                    f13 = f5;
                    rVar3 = rVar2;
                    fVar3 = fVar2;
                    f14 = f12;
                    iVar2 = iVar;
                }
                x1VarT = sVar.t();
                if (x1VarT != null) {
                    x1VarT.f39502d = new fz.e() { // from class: dt.r
                        @Override // fz.e
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            a0.d(currentTextStyle, rVar3, fVar3, iVar2, f13, f14, dVar, (l1.n) obj, l1.t.M(i11 | 1), i12);
                            return qy.b0.f48488a;
                        }
                    };
                }
            }
            i13 |= 384;
            fVar2 = fVar;
            i16 = i13 | 3072;
            i17 = i12 & 16;
            if (i17 != 0) {
                if ((i11 & 24576) == 0) {
                    if (sVar.c(f5)) {
                        i18 = 16384;
                    } else {
                        i18 = OSSConstants.DEFAULT_BUFFER_SIZE;
                    }
                    i16 |= i18;
                }
                i19 = i12 & 32;
                if (i19 != 0) {
                    if ((196608 & i11) == 0) {
                        f12 = f11;
                        if (sVar.c(f12)) {
                            i21 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                        } else {
                            i21 = 65536;
                        }
                        i16 |= i21;
                    }
                    if ((1572864 & i11) == 0) {
                        dVar2 = dVar;
                        if (sVar.h(dVar2)) {
                            i23 = 1048576;
                        } else {
                            i23 = 524288;
                        }
                        i16 |= i23;
                    } else {
                        dVar2 = dVar;
                    }
                    if ((599187 & i16) != 599186) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (sVar.T(i16 & 1, z11)) {
                        if (i24 != 0) {
                            rVar4 = z1.o.f58481a;
                        } else {
                            rVar4 = rVar2;
                        }
                        if (i14 != 0) {
                            fVar4 = j0.i.f35307e;
                        } else {
                            fVar4 = fVar2;
                        }
                        z1.i iVar8 = z1.c.M;
                        if (i17 != 0) {
                            f15 = 8;
                        } else {
                            f15 = f5;
                        }
                        if (i19 != 0) {
                            int i2111 = i16;
                            f16 = 8;
                            i22 = i2111;
                        } else {
                            i22 = i16;
                            f16 = f12;
                        }
                        int i2112 = i22 >> 3;
                        w2.q0 q0VarD5 = j0.o.d(z1.c.f58467e, false);
                        iHashCode = Long.hashCode(sVar.T);
                        l1.q1 q1VarL5 = sVar.l();
                        z1.r rVarC5 = z1.a.c(sVar, rVar4);
                        y2.k.J.getClass();
                        iVar3 = y2.j.f56913b;
                        sVar.h0();
                        if (sVar.S) {
                            sVar.k(iVar3);
                        } else {
                            sVar.r0();
                        }
                        l1.t.J(y2.j.f56917f, q0VarD5, sVar);
                        l1.t.J(y2.j.f56916e, q1VarL5, sVar);
                        hVar = y2.j.f56918g;
                        if (sVar.S) {
                            defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                        } else {
                            defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                        }
                        l1.t.J(y2.j.f56915d, rVarC5, sVar);
                        int i2113 = (i2112 & 112) | 24576 | (i2112 & 896) | ((i22 << 15) & 458752);
                        int i2114 = i22 << 6;
                        z1.r rVar9 = rVar4;
                        e.C(null, fVar4, iVar8, null, false, currentTextStyle, f15, f16, 0, 0L, dVar2, sVar, i2113 | (3670016 & i2114) | (i2114 & 29360128), (i22 >> 18) & 14, 777);
                        sVar.p(true);
                        fVar3 = fVar4;
                        iVar2 = iVar8;
                        f13 = f15;
                        f14 = f16;
                        rVar3 = rVar9;
                    } else {
                        sVar.W();
                        f13 = f5;
                        rVar3 = rVar2;
                        fVar3 = fVar2;
                        f14 = f12;
                        iVar2 = iVar;
                    }
                    x1VarT = sVar.t();
                    if (x1VarT != null) {
                        x1VarT.f39502d = new fz.e() { // from class: dt.r
                            @Override // fz.e
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                a0.d(currentTextStyle, rVar3, fVar3, iVar2, f13, f14, dVar, (l1.n) obj, l1.t.M(i11 | 1), i12);
                                return qy.b0.f48488a;
                            }
                        };
                    }
                }
                i16 |= 196608;
                f12 = f11;
                if ((1572864 & i11) == 0) {
                    dVar2 = dVar;
                    if (sVar.h(dVar2)) {
                        i23 = 1048576;
                    } else {
                        i23 = 524288;
                    }
                    i16 |= i23;
                } else {
                    dVar2 = dVar;
                }
                if ((599187 & i16) != 599186) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (sVar.T(i16 & 1, z11)) {
                    if (i24 != 0) {
                        rVar4 = z1.o.f58481a;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i14 != 0) {
                        fVar4 = j0.i.f35307e;
                    } else {
                        fVar4 = fVar2;
                    }
                    z1.i iVar9 = z1.c.M;
                    if (i17 != 0) {
                        f15 = 8;
                    } else {
                        f15 = f5;
                    }
                    if (i19 != 0) {
                        int i2115 = i16;
                        f16 = 8;
                        i22 = i2115;
                    } else {
                        i22 = i16;
                        f16 = f12;
                    }
                    int i2116 = i22 >> 3;
                    w2.q0 q0VarD6 = j0.o.d(z1.c.f58467e, false);
                    iHashCode = Long.hashCode(sVar.T);
                    l1.q1 q1VarL6 = sVar.l();
                    z1.r rVarC6 = z1.a.c(sVar, rVar4);
                    y2.k.J.getClass();
                    iVar3 = y2.j.f56913b;
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar3);
                    } else {
                        sVar.r0();
                    }
                    l1.t.J(y2.j.f56917f, q0VarD6, sVar);
                    l1.t.J(y2.j.f56916e, q1VarL6, sVar);
                    hVar = y2.j.f56918g;
                    if (sVar.S) {
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                    } else {
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                    }
                    l1.t.J(y2.j.f56915d, rVarC6, sVar);
                    int i2117 = (i2116 & 112) | 24576 | (i2116 & 896) | ((i22 << 15) & 458752);
                    int i2118 = i22 << 6;
                    z1.r rVar10 = rVar4;
                    e.C(null, fVar4, iVar9, null, false, currentTextStyle, f15, f16, 0, 0L, dVar2, sVar, i2117 | (3670016 & i2118) | (i2118 & 29360128), (i22 >> 18) & 14, 777);
                    sVar.p(true);
                    fVar3 = fVar4;
                    iVar2 = iVar9;
                    f13 = f15;
                    f14 = f16;
                    rVar3 = rVar10;
                } else {
                    sVar.W();
                    f13 = f5;
                    rVar3 = rVar2;
                    fVar3 = fVar2;
                    f14 = f12;
                    iVar2 = iVar;
                }
                x1VarT = sVar.t();
                if (x1VarT != null) {
                    x1VarT.f39502d = new fz.e() { // from class: dt.r
                        @Override // fz.e
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            a0.d(currentTextStyle, rVar3, fVar3, iVar2, f13, f14, dVar, (l1.n) obj, l1.t.M(i11 | 1), i12);
                            return qy.b0.f48488a;
                        }
                    };
                }
            }
            i16 = i13 | 27648;
            i19 = i12 & 32;
            if (i19 != 0) {
                if ((196608 & i11) == 0) {
                    f12 = f11;
                    if (sVar.c(f12)) {
                        i21 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                    } else {
                        i21 = 65536;
                    }
                    i16 |= i21;
                }
                if ((1572864 & i11) == 0) {
                    dVar2 = dVar;
                    if (sVar.h(dVar2)) {
                        i23 = 1048576;
                    } else {
                        i23 = 524288;
                    }
                    i16 |= i23;
                } else {
                    dVar2 = dVar;
                }
                if ((599187 & i16) != 599186) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (sVar.T(i16 & 1, z11)) {
                    if (i24 != 0) {
                        rVar4 = z1.o.f58481a;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i14 != 0) {
                        fVar4 = j0.i.f35307e;
                    } else {
                        fVar4 = fVar2;
                    }
                    z1.i iVar10 = z1.c.M;
                    if (i17 != 0) {
                        f15 = 8;
                    } else {
                        f15 = f5;
                    }
                    if (i19 != 0) {
                        int i2119 = i16;
                        f16 = 8;
                        i22 = i2119;
                    } else {
                        i22 = i16;
                        f16 = f12;
                    }
                    int i21110 = i22 >> 3;
                    w2.q0 q0VarD7 = j0.o.d(z1.c.f58467e, false);
                    iHashCode = Long.hashCode(sVar.T);
                    l1.q1 q1VarL7 = sVar.l();
                    z1.r rVarC7 = z1.a.c(sVar, rVar4);
                    y2.k.J.getClass();
                    iVar3 = y2.j.f56913b;
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar3);
                    } else {
                        sVar.r0();
                    }
                    l1.t.J(y2.j.f56917f, q0VarD7, sVar);
                    l1.t.J(y2.j.f56916e, q1VarL7, sVar);
                    hVar = y2.j.f56918g;
                    if (sVar.S) {
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                    } else {
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                    }
                    l1.t.J(y2.j.f56915d, rVarC7, sVar);
                    int i21111 = (i21110 & 112) | 24576 | (i21110 & 896) | ((i22 << 15) & 458752);
                    int i21112 = i22 << 6;
                    z1.r rVar11 = rVar4;
                    e.C(null, fVar4, iVar10, null, false, currentTextStyle, f15, f16, 0, 0L, dVar2, sVar, i21111 | (3670016 & i21112) | (i21112 & 29360128), (i22 >> 18) & 14, 777);
                    sVar.p(true);
                    fVar3 = fVar4;
                    iVar2 = iVar10;
                    f13 = f15;
                    f14 = f16;
                    rVar3 = rVar11;
                } else {
                    sVar.W();
                    f13 = f5;
                    rVar3 = rVar2;
                    fVar3 = fVar2;
                    f14 = f12;
                    iVar2 = iVar;
                }
                x1VarT = sVar.t();
                if (x1VarT != null) {
                    x1VarT.f39502d = new fz.e() { // from class: dt.r
                        @Override // fz.e
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            a0.d(currentTextStyle, rVar3, fVar3, iVar2, f13, f14, dVar, (l1.n) obj, l1.t.M(i11 | 1), i12);
                            return qy.b0.f48488a;
                        }
                    };
                }
            }
            i16 |= 196608;
            f12 = f11;
            if ((1572864 & i11) == 0) {
                dVar2 = dVar;
                if (sVar.h(dVar2)) {
                    i23 = 1048576;
                } else {
                    i23 = 524288;
                }
                i16 |= i23;
            } else {
                dVar2 = dVar;
            }
            if ((599187 & i16) != 599186) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (sVar.T(i16 & 1, z11)) {
                if (i24 != 0) {
                    rVar4 = z1.o.f58481a;
                } else {
                    rVar4 = rVar2;
                }
                if (i14 != 0) {
                    fVar4 = j0.i.f35307e;
                } else {
                    fVar4 = fVar2;
                }
                z1.i iVar11 = z1.c.M;
                if (i17 != 0) {
                    f15 = 8;
                } else {
                    f15 = f5;
                }
                if (i19 != 0) {
                    int i21113 = i16;
                    f16 = 8;
                    i22 = i21113;
                } else {
                    i22 = i16;
                    f16 = f12;
                }
                int i21114 = i22 >> 3;
                w2.q0 q0VarD8 = j0.o.d(z1.c.f58467e, false);
                iHashCode = Long.hashCode(sVar.T);
                l1.q1 q1VarL8 = sVar.l();
                z1.r rVarC8 = z1.a.c(sVar, rVar4);
                y2.k.J.getClass();
                iVar3 = y2.j.f56913b;
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar3);
                } else {
                    sVar.r0();
                }
                l1.t.J(y2.j.f56917f, q0VarD8, sVar);
                l1.t.J(y2.j.f56916e, q1VarL8, sVar);
                hVar = y2.j.f56918g;
                if (sVar.S) {
                    defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                } else {
                    defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                }
                l1.t.J(y2.j.f56915d, rVarC8, sVar);
                int i21115 = (i21114 & 112) | 24576 | (i21114 & 896) | ((i22 << 15) & 458752);
                int i21116 = i22 << 6;
                z1.r rVar12 = rVar4;
                e.C(null, fVar4, iVar11, null, false, currentTextStyle, f15, f16, 0, 0L, dVar2, sVar, i21115 | (3670016 & i21116) | (i21116 & 29360128), (i22 >> 18) & 14, 777);
                sVar.p(true);
                fVar3 = fVar4;
                iVar2 = iVar11;
                f13 = f15;
                f14 = f16;
                rVar3 = rVar12;
            } else {
                sVar.W();
                f13 = f5;
                rVar3 = rVar2;
                fVar3 = fVar2;
                f14 = f12;
                iVar2 = iVar;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new fz.e() { // from class: dt.r
                    @Override // fz.e
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        a0.d(currentTextStyle, rVar3, fVar3, iVar2, f13, f14, dVar, (l1.n) obj, l1.t.M(i11 | 1), i12);
                        return qy.b0.f48488a;
                    }
                };
            }
        }
        i13 |= 48;
        rVar2 = rVar;
        i14 = i12 & 4;
        if (i14 != 0) {
            if ((i11 & 384) == 0) {
                fVar2 = fVar;
                if (sVar.f(fVar2)) {
                    i15 = 256;
                } else {
                    i15 = 128;
                }
                i13 |= i15;
            }
            i16 = i13 | 3072;
            i17 = i12 & 16;
            if (i17 != 0) {
                if ((i11 & 24576) == 0) {
                    if (sVar.c(f5)) {
                        i18 = 16384;
                    } else {
                        i18 = OSSConstants.DEFAULT_BUFFER_SIZE;
                    }
                    i16 |= i18;
                }
                i19 = i12 & 32;
                if (i19 != 0) {
                    if ((196608 & i11) == 0) {
                        f12 = f11;
                        if (sVar.c(f12)) {
                            i21 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                        } else {
                            i21 = 65536;
                        }
                        i16 |= i21;
                    }
                    if ((1572864 & i11) == 0) {
                        dVar2 = dVar;
                        if (sVar.h(dVar2)) {
                            i23 = 1048576;
                        } else {
                            i23 = 524288;
                        }
                        i16 |= i23;
                    } else {
                        dVar2 = dVar;
                    }
                    if ((599187 & i16) != 599186) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (sVar.T(i16 & 1, z11)) {
                        if (i24 != 0) {
                            rVar4 = z1.o.f58481a;
                        } else {
                            rVar4 = rVar2;
                        }
                        if (i14 != 0) {
                            fVar4 = j0.i.f35307e;
                        } else {
                            fVar4 = fVar2;
                        }
                        z1.i iVar12 = z1.c.M;
                        if (i17 != 0) {
                            f15 = 8;
                        } else {
                            f15 = f5;
                        }
                        if (i19 != 0) {
                            int i21117 = i16;
                            f16 = 8;
                            i22 = i21117;
                        } else {
                            i22 = i16;
                            f16 = f12;
                        }
                        int i21118 = i22 >> 3;
                        w2.q0 q0VarD9 = j0.o.d(z1.c.f58467e, false);
                        iHashCode = Long.hashCode(sVar.T);
                        l1.q1 q1VarL9 = sVar.l();
                        z1.r rVarC9 = z1.a.c(sVar, rVar4);
                        y2.k.J.getClass();
                        iVar3 = y2.j.f56913b;
                        sVar.h0();
                        if (sVar.S) {
                            sVar.k(iVar3);
                        } else {
                            sVar.r0();
                        }
                        l1.t.J(y2.j.f56917f, q0VarD9, sVar);
                        l1.t.J(y2.j.f56916e, q1VarL9, sVar);
                        hVar = y2.j.f56918g;
                        if (sVar.S) {
                            defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                        } else {
                            defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                        }
                        l1.t.J(y2.j.f56915d, rVarC9, sVar);
                        int i21119 = (i21118 & 112) | 24576 | (i21118 & 896) | ((i22 << 15) & 458752);
                        int i211110 = i22 << 6;
                        z1.r rVar13 = rVar4;
                        e.C(null, fVar4, iVar12, null, false, currentTextStyle, f15, f16, 0, 0L, dVar2, sVar, i21119 | (3670016 & i211110) | (i211110 & 29360128), (i22 >> 18) & 14, 777);
                        sVar.p(true);
                        fVar3 = fVar4;
                        iVar2 = iVar12;
                        f13 = f15;
                        f14 = f16;
                        rVar3 = rVar13;
                    } else {
                        sVar.W();
                        f13 = f5;
                        rVar3 = rVar2;
                        fVar3 = fVar2;
                        f14 = f12;
                        iVar2 = iVar;
                    }
                    x1VarT = sVar.t();
                    if (x1VarT != null) {
                        x1VarT.f39502d = new fz.e() { // from class: dt.r
                            @Override // fz.e
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                a0.d(currentTextStyle, rVar3, fVar3, iVar2, f13, f14, dVar, (l1.n) obj, l1.t.M(i11 | 1), i12);
                                return qy.b0.f48488a;
                            }
                        };
                    }
                }
                i16 |= 196608;
                f12 = f11;
                if ((1572864 & i11) == 0) {
                    dVar2 = dVar;
                    if (sVar.h(dVar2)) {
                        i23 = 1048576;
                    } else {
                        i23 = 524288;
                    }
                    i16 |= i23;
                } else {
                    dVar2 = dVar;
                }
                if ((599187 & i16) != 599186) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (sVar.T(i16 & 1, z11)) {
                    if (i24 != 0) {
                        rVar4 = z1.o.f58481a;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i14 != 0) {
                        fVar4 = j0.i.f35307e;
                    } else {
                        fVar4 = fVar2;
                    }
                    z1.i iVar13 = z1.c.M;
                    if (i17 != 0) {
                        f15 = 8;
                    } else {
                        f15 = f5;
                    }
                    if (i19 != 0) {
                        int i211111 = i16;
                        f16 = 8;
                        i22 = i211111;
                    } else {
                        i22 = i16;
                        f16 = f12;
                    }
                    int i211112 = i22 >> 3;
                    w2.q0 q0VarD10 = j0.o.d(z1.c.f58467e, false);
                    iHashCode = Long.hashCode(sVar.T);
                    l1.q1 q1VarL10 = sVar.l();
                    z1.r rVarC10 = z1.a.c(sVar, rVar4);
                    y2.k.J.getClass();
                    iVar3 = y2.j.f56913b;
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar3);
                    } else {
                        sVar.r0();
                    }
                    l1.t.J(y2.j.f56917f, q0VarD10, sVar);
                    l1.t.J(y2.j.f56916e, q1VarL10, sVar);
                    hVar = y2.j.f56918g;
                    if (sVar.S) {
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                    } else {
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                    }
                    l1.t.J(y2.j.f56915d, rVarC10, sVar);
                    int i211113 = (i211112 & 112) | 24576 | (i211112 & 896) | ((i22 << 15) & 458752);
                    int i211114 = i22 << 6;
                    z1.r rVar14 = rVar4;
                    e.C(null, fVar4, iVar13, null, false, currentTextStyle, f15, f16, 0, 0L, dVar2, sVar, i211113 | (3670016 & i211114) | (i211114 & 29360128), (i22 >> 18) & 14, 777);
                    sVar.p(true);
                    fVar3 = fVar4;
                    iVar2 = iVar13;
                    f13 = f15;
                    f14 = f16;
                    rVar3 = rVar14;
                } else {
                    sVar.W();
                    f13 = f5;
                    rVar3 = rVar2;
                    fVar3 = fVar2;
                    f14 = f12;
                    iVar2 = iVar;
                }
                x1VarT = sVar.t();
                if (x1VarT != null) {
                    x1VarT.f39502d = new fz.e() { // from class: dt.r
                        @Override // fz.e
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            a0.d(currentTextStyle, rVar3, fVar3, iVar2, f13, f14, dVar, (l1.n) obj, l1.t.M(i11 | 1), i12);
                            return qy.b0.f48488a;
                        }
                    };
                }
            }
            i16 = i13 | 27648;
            i19 = i12 & 32;
            if (i19 != 0) {
                if ((196608 & i11) == 0) {
                    f12 = f11;
                    if (sVar.c(f12)) {
                        i21 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                    } else {
                        i21 = 65536;
                    }
                    i16 |= i21;
                }
                if ((1572864 & i11) == 0) {
                    dVar2 = dVar;
                    if (sVar.h(dVar2)) {
                        i23 = 1048576;
                    } else {
                        i23 = 524288;
                    }
                    i16 |= i23;
                } else {
                    dVar2 = dVar;
                }
                if ((599187 & i16) != 599186) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (sVar.T(i16 & 1, z11)) {
                    if (i24 != 0) {
                        rVar4 = z1.o.f58481a;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i14 != 0) {
                        fVar4 = j0.i.f35307e;
                    } else {
                        fVar4 = fVar2;
                    }
                    z1.i iVar14 = z1.c.M;
                    if (i17 != 0) {
                        f15 = 8;
                    } else {
                        f15 = f5;
                    }
                    if (i19 != 0) {
                        int i211115 = i16;
                        f16 = 8;
                        i22 = i211115;
                    } else {
                        i22 = i16;
                        f16 = f12;
                    }
                    int i211116 = i22 >> 3;
                    w2.q0 q0VarD11 = j0.o.d(z1.c.f58467e, false);
                    iHashCode = Long.hashCode(sVar.T);
                    l1.q1 q1VarL11 = sVar.l();
                    z1.r rVarC11 = z1.a.c(sVar, rVar4);
                    y2.k.J.getClass();
                    iVar3 = y2.j.f56913b;
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar3);
                    } else {
                        sVar.r0();
                    }
                    l1.t.J(y2.j.f56917f, q0VarD11, sVar);
                    l1.t.J(y2.j.f56916e, q1VarL11, sVar);
                    hVar = y2.j.f56918g;
                    if (sVar.S) {
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                    } else {
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                    }
                    l1.t.J(y2.j.f56915d, rVarC11, sVar);
                    int i211117 = (i211116 & 112) | 24576 | (i211116 & 896) | ((i22 << 15) & 458752);
                    int i211118 = i22 << 6;
                    z1.r rVar15 = rVar4;
                    e.C(null, fVar4, iVar14, null, false, currentTextStyle, f15, f16, 0, 0L, dVar2, sVar, i211117 | (3670016 & i211118) | (i211118 & 29360128), (i22 >> 18) & 14, 777);
                    sVar.p(true);
                    fVar3 = fVar4;
                    iVar2 = iVar14;
                    f13 = f15;
                    f14 = f16;
                    rVar3 = rVar15;
                } else {
                    sVar.W();
                    f13 = f5;
                    rVar3 = rVar2;
                    fVar3 = fVar2;
                    f14 = f12;
                    iVar2 = iVar;
                }
                x1VarT = sVar.t();
                if (x1VarT != null) {
                    x1VarT.f39502d = new fz.e() { // from class: dt.r
                        @Override // fz.e
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            a0.d(currentTextStyle, rVar3, fVar3, iVar2, f13, f14, dVar, (l1.n) obj, l1.t.M(i11 | 1), i12);
                            return qy.b0.f48488a;
                        }
                    };
                }
            }
            i16 |= 196608;
            f12 = f11;
            if ((1572864 & i11) == 0) {
                dVar2 = dVar;
                if (sVar.h(dVar2)) {
                    i23 = 1048576;
                } else {
                    i23 = 524288;
                }
                i16 |= i23;
            } else {
                dVar2 = dVar;
            }
            if ((599187 & i16) != 599186) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (sVar.T(i16 & 1, z11)) {
                if (i24 != 0) {
                    rVar4 = z1.o.f58481a;
                } else {
                    rVar4 = rVar2;
                }
                if (i14 != 0) {
                    fVar4 = j0.i.f35307e;
                } else {
                    fVar4 = fVar2;
                }
                z1.i iVar15 = z1.c.M;
                if (i17 != 0) {
                    f15 = 8;
                } else {
                    f15 = f5;
                }
                if (i19 != 0) {
                    int i211119 = i16;
                    f16 = 8;
                    i22 = i211119;
                } else {
                    i22 = i16;
                    f16 = f12;
                }
                int i2111110 = i22 >> 3;
                w2.q0 q0VarD12 = j0.o.d(z1.c.f58467e, false);
                iHashCode = Long.hashCode(sVar.T);
                l1.q1 q1VarL12 = sVar.l();
                z1.r rVarC12 = z1.a.c(sVar, rVar4);
                y2.k.J.getClass();
                iVar3 = y2.j.f56913b;
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar3);
                } else {
                    sVar.r0();
                }
                l1.t.J(y2.j.f56917f, q0VarD12, sVar);
                l1.t.J(y2.j.f56916e, q1VarL12, sVar);
                hVar = y2.j.f56918g;
                if (sVar.S) {
                    defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                } else {
                    defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                }
                l1.t.J(y2.j.f56915d, rVarC12, sVar);
                int i2111111 = (i2111110 & 112) | 24576 | (i2111110 & 896) | ((i22 << 15) & 458752);
                int i2111112 = i22 << 6;
                z1.r rVar16 = rVar4;
                e.C(null, fVar4, iVar15, null, false, currentTextStyle, f15, f16, 0, 0L, dVar2, sVar, i2111111 | (3670016 & i2111112) | (i2111112 & 29360128), (i22 >> 18) & 14, 777);
                sVar.p(true);
                fVar3 = fVar4;
                iVar2 = iVar15;
                f13 = f15;
                f14 = f16;
                rVar3 = rVar16;
            } else {
                sVar.W();
                f13 = f5;
                rVar3 = rVar2;
                fVar3 = fVar2;
                f14 = f12;
                iVar2 = iVar;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new fz.e() { // from class: dt.r
                    @Override // fz.e
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        a0.d(currentTextStyle, rVar3, fVar3, iVar2, f13, f14, dVar, (l1.n) obj, l1.t.M(i11 | 1), i12);
                        return qy.b0.f48488a;
                    }
                };
            }
        }
        i13 |= 384;
        fVar2 = fVar;
        i16 = i13 | 3072;
        i17 = i12 & 16;
        if (i17 != 0) {
            if ((i11 & 24576) == 0) {
                if (sVar.c(f5)) {
                    i18 = 16384;
                } else {
                    i18 = OSSConstants.DEFAULT_BUFFER_SIZE;
                }
                i16 |= i18;
            }
            i19 = i12 & 32;
            if (i19 != 0) {
                if ((196608 & i11) == 0) {
                    f12 = f11;
                    if (sVar.c(f12)) {
                        i21 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                    } else {
                        i21 = 65536;
                    }
                    i16 |= i21;
                }
                if ((1572864 & i11) == 0) {
                    dVar2 = dVar;
                    if (sVar.h(dVar2)) {
                        i23 = 1048576;
                    } else {
                        i23 = 524288;
                    }
                    i16 |= i23;
                } else {
                    dVar2 = dVar;
                }
                if ((599187 & i16) != 599186) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (sVar.T(i16 & 1, z11)) {
                    if (i24 != 0) {
                        rVar4 = z1.o.f58481a;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i14 != 0) {
                        fVar4 = j0.i.f35307e;
                    } else {
                        fVar4 = fVar2;
                    }
                    z1.i iVar16 = z1.c.M;
                    if (i17 != 0) {
                        f15 = 8;
                    } else {
                        f15 = f5;
                    }
                    if (i19 != 0) {
                        int i2111113 = i16;
                        f16 = 8;
                        i22 = i2111113;
                    } else {
                        i22 = i16;
                        f16 = f12;
                    }
                    int i2111114 = i22 >> 3;
                    w2.q0 q0VarD13 = j0.o.d(z1.c.f58467e, false);
                    iHashCode = Long.hashCode(sVar.T);
                    l1.q1 q1VarL13 = sVar.l();
                    z1.r rVarC13 = z1.a.c(sVar, rVar4);
                    y2.k.J.getClass();
                    iVar3 = y2.j.f56913b;
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar3);
                    } else {
                        sVar.r0();
                    }
                    l1.t.J(y2.j.f56917f, q0VarD13, sVar);
                    l1.t.J(y2.j.f56916e, q1VarL13, sVar);
                    hVar = y2.j.f56918g;
                    if (sVar.S) {
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                    } else {
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                    }
                    l1.t.J(y2.j.f56915d, rVarC13, sVar);
                    int i2111115 = (i2111114 & 112) | 24576 | (i2111114 & 896) | ((i22 << 15) & 458752);
                    int i2111116 = i22 << 6;
                    z1.r rVar17 = rVar4;
                    e.C(null, fVar4, iVar16, null, false, currentTextStyle, f15, f16, 0, 0L, dVar2, sVar, i2111115 | (3670016 & i2111116) | (i2111116 & 29360128), (i22 >> 18) & 14, 777);
                    sVar.p(true);
                    fVar3 = fVar4;
                    iVar2 = iVar16;
                    f13 = f15;
                    f14 = f16;
                    rVar3 = rVar17;
                } else {
                    sVar.W();
                    f13 = f5;
                    rVar3 = rVar2;
                    fVar3 = fVar2;
                    f14 = f12;
                    iVar2 = iVar;
                }
                x1VarT = sVar.t();
                if (x1VarT != null) {
                    x1VarT.f39502d = new fz.e() { // from class: dt.r
                        @Override // fz.e
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            a0.d(currentTextStyle, rVar3, fVar3, iVar2, f13, f14, dVar, (l1.n) obj, l1.t.M(i11 | 1), i12);
                            return qy.b0.f48488a;
                        }
                    };
                }
            }
            i16 |= 196608;
            f12 = f11;
            if ((1572864 & i11) == 0) {
                dVar2 = dVar;
                if (sVar.h(dVar2)) {
                    i23 = 1048576;
                } else {
                    i23 = 524288;
                }
                i16 |= i23;
            } else {
                dVar2 = dVar;
            }
            if ((599187 & i16) != 599186) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (sVar.T(i16 & 1, z11)) {
                if (i24 != 0) {
                    rVar4 = z1.o.f58481a;
                } else {
                    rVar4 = rVar2;
                }
                if (i14 != 0) {
                    fVar4 = j0.i.f35307e;
                } else {
                    fVar4 = fVar2;
                }
                z1.i iVar17 = z1.c.M;
                if (i17 != 0) {
                    f15 = 8;
                } else {
                    f15 = f5;
                }
                if (i19 != 0) {
                    int i2111117 = i16;
                    f16 = 8;
                    i22 = i2111117;
                } else {
                    i22 = i16;
                    f16 = f12;
                }
                int i2111118 = i22 >> 3;
                w2.q0 q0VarD14 = j0.o.d(z1.c.f58467e, false);
                iHashCode = Long.hashCode(sVar.T);
                l1.q1 q1VarL14 = sVar.l();
                z1.r rVarC14 = z1.a.c(sVar, rVar4);
                y2.k.J.getClass();
                iVar3 = y2.j.f56913b;
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar3);
                } else {
                    sVar.r0();
                }
                l1.t.J(y2.j.f56917f, q0VarD14, sVar);
                l1.t.J(y2.j.f56916e, q1VarL14, sVar);
                hVar = y2.j.f56918g;
                if (sVar.S) {
                    defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                } else {
                    defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                }
                l1.t.J(y2.j.f56915d, rVarC14, sVar);
                int i2111119 = (i2111118 & 112) | 24576 | (i2111118 & 896) | ((i22 << 15) & 458752);
                int i21111110 = i22 << 6;
                z1.r rVar18 = rVar4;
                e.C(null, fVar4, iVar17, null, false, currentTextStyle, f15, f16, 0, 0L, dVar2, sVar, i2111119 | (3670016 & i21111110) | (i21111110 & 29360128), (i22 >> 18) & 14, 777);
                sVar.p(true);
                fVar3 = fVar4;
                iVar2 = iVar17;
                f13 = f15;
                f14 = f16;
                rVar3 = rVar18;
            } else {
                sVar.W();
                f13 = f5;
                rVar3 = rVar2;
                fVar3 = fVar2;
                f14 = f12;
                iVar2 = iVar;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new fz.e() { // from class: dt.r
                    @Override // fz.e
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        a0.d(currentTextStyle, rVar3, fVar3, iVar2, f13, f14, dVar, (l1.n) obj, l1.t.M(i11 | 1), i12);
                        return qy.b0.f48488a;
                    }
                };
            }
        }
        i16 = i13 | 27648;
        i19 = i12 & 32;
        if (i19 != 0) {
            if ((196608 & i11) == 0) {
                f12 = f11;
                if (sVar.c(f12)) {
                    i21 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                } else {
                    i21 = 65536;
                }
                i16 |= i21;
            }
            if ((1572864 & i11) == 0) {
                dVar2 = dVar;
                if (sVar.h(dVar2)) {
                    i23 = 1048576;
                } else {
                    i23 = 524288;
                }
                i16 |= i23;
            } else {
                dVar2 = dVar;
            }
            if ((599187 & i16) != 599186) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (sVar.T(i16 & 1, z11)) {
                if (i24 != 0) {
                    rVar4 = z1.o.f58481a;
                } else {
                    rVar4 = rVar2;
                }
                if (i14 != 0) {
                    fVar4 = j0.i.f35307e;
                } else {
                    fVar4 = fVar2;
                }
                z1.i iVar18 = z1.c.M;
                if (i17 != 0) {
                    f15 = 8;
                } else {
                    f15 = f5;
                }
                if (i19 != 0) {
                    int i21111111 = i16;
                    f16 = 8;
                    i22 = i21111111;
                } else {
                    i22 = i16;
                    f16 = f12;
                }
                int i21111112 = i22 >> 3;
                w2.q0 q0VarD15 = j0.o.d(z1.c.f58467e, false);
                iHashCode = Long.hashCode(sVar.T);
                l1.q1 q1VarL15 = sVar.l();
                z1.r rVarC15 = z1.a.c(sVar, rVar4);
                y2.k.J.getClass();
                iVar3 = y2.j.f56913b;
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar3);
                } else {
                    sVar.r0();
                }
                l1.t.J(y2.j.f56917f, q0VarD15, sVar);
                l1.t.J(y2.j.f56916e, q1VarL15, sVar);
                hVar = y2.j.f56918g;
                if (sVar.S) {
                    defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                } else {
                    defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                }
                l1.t.J(y2.j.f56915d, rVarC15, sVar);
                int i21111113 = (i21111112 & 112) | 24576 | (i21111112 & 896) | ((i22 << 15) & 458752);
                int i21111114 = i22 << 6;
                z1.r rVar19 = rVar4;
                e.C(null, fVar4, iVar18, null, false, currentTextStyle, f15, f16, 0, 0L, dVar2, sVar, i21111113 | (3670016 & i21111114) | (i21111114 & 29360128), (i22 >> 18) & 14, 777);
                sVar.p(true);
                fVar3 = fVar4;
                iVar2 = iVar18;
                f13 = f15;
                f14 = f16;
                rVar3 = rVar19;
            } else {
                sVar.W();
                f13 = f5;
                rVar3 = rVar2;
                fVar3 = fVar2;
                f14 = f12;
                iVar2 = iVar;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new fz.e() { // from class: dt.r
                    @Override // fz.e
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        a0.d(currentTextStyle, rVar3, fVar3, iVar2, f13, f14, dVar, (l1.n) obj, l1.t.M(i11 | 1), i12);
                        return qy.b0.f48488a;
                    }
                };
            }
        }
        i16 |= 196608;
        f12 = f11;
        if ((1572864 & i11) == 0) {
            dVar2 = dVar;
            if (sVar.h(dVar2)) {
                i23 = 1048576;
            } else {
                i23 = 524288;
            }
            i16 |= i23;
        } else {
            dVar2 = dVar;
        }
        if ((599187 & i16) != 599186) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (sVar.T(i16 & 1, z11)) {
            if (i24 != 0) {
                rVar4 = z1.o.f58481a;
            } else {
                rVar4 = rVar2;
            }
            if (i14 != 0) {
                fVar4 = j0.i.f35307e;
            } else {
                fVar4 = fVar2;
            }
            z1.i iVar19 = z1.c.M;
            if (i17 != 0) {
                f15 = 8;
            } else {
                f15 = f5;
            }
            if (i19 != 0) {
                int i21111115 = i16;
                f16 = 8;
                i22 = i21111115;
            } else {
                i22 = i16;
                f16 = f12;
            }
            int i21111116 = i22 >> 3;
            w2.q0 q0VarD16 = j0.o.d(z1.c.f58467e, false);
            iHashCode = Long.hashCode(sVar.T);
            l1.q1 q1VarL16 = sVar.l();
            z1.r rVarC16 = z1.a.c(sVar, rVar4);
            y2.k.J.getClass();
            iVar3 = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar3);
            } else {
                sVar.r0();
            }
            l1.t.J(y2.j.f56917f, q0VarD16, sVar);
            l1.t.J(y2.j.f56916e, q1VarL16, sVar);
            hVar = y2.j.f56918g;
            if (sVar.S) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            } else {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC16, sVar);
            int i21111117 = (i21111116 & 112) | 24576 | (i21111116 & 896) | ((i22 << 15) & 458752);
            int i21111118 = i22 << 6;
            z1.r rVar110 = rVar4;
            e.C(null, fVar4, iVar19, null, false, currentTextStyle, f15, f16, 0, 0L, dVar2, sVar, i21111117 | (3670016 & i21111118) | (i21111118 & 29360128), (i22 >> 18) & 14, 777);
            sVar.p(true);
            fVar3 = fVar4;
            iVar2 = iVar19;
            f13 = f15;
            f14 = f16;
            rVar3 = rVar110;
        } else {
            sVar.W();
            f13 = f5;
            rVar3 = rVar2;
            fVar3 = fVar2;
            f14 = f12;
            iVar2 = iVar;
        }
        x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fz.e() { // from class: dt.r
                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    a0.d(currentTextStyle, rVar3, fVar3, iVar2, f13, f14, dVar, (l1.n) obj, l1.t.M(i11 | 1), i12);
                    return qy.b0.f48488a;
                }
            };
        }
    }

    public static final void e(OptionItemSelectedState selectedState, boolean z11, t1.d dVar, fz.a onClick, z1.r rVar, l1.n nVar, int i11) {
        long jC;
        int i12;
        long jW;
        kotlin.jvm.internal.m.f(selectedState, "selectedState");
        kotlin.jvm.internal.m.f(onClick, "onClick");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1276514763);
        int i13 = (sVar.d(selectedState.ordinal()) ? 4 : 2) | i11;
        if ((i11 & 48) == 0) {
            i13 |= sVar.g(z11) ? 32 : 16;
        }
        int i14 = i13 | (sVar.h(onClick) ? 2048 : 1024);
        if ((i11 & 24576) == 0) {
            i14 |= sVar.f(rVar) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        if (sVar.T(i14 & 1, (i14 & 9363) != 9362)) {
            int[] iArr = z.f24406a;
            int i15 = iArr[selectedState.ordinal()];
            if (i15 == 1) {
                sVar.d0(1629972291);
                jC = g2.x.c(((h1.s1) sVar.j(h1.v1.f31180a)).f31033p, CropImageView.DEFAULT_ASPECT_RATIO);
                sVar.p(false);
            } else if (i15 == 2) {
                sVar.d0(1629976741);
                jC = g2.x.c(((h1.s1) sVar.j(h1.v1.f31180a)).f31021c, 0.5f);
                sVar.p(false);
            } else if (i15 == 3) {
                sVar.d0(1629981349);
                jC = g2.x.c(ob.f.x((h1.s1) sVar.j(h1.v1.f31180a), sVar), 0.5f);
                sVar.p(false);
            } else {
                if (i15 != 4) {
                    throw nv.p.x(sVar, 1629969502, false);
                }
                sVar.d0(1629985829);
                jC = g2.x.c(ob.f.z((h1.s1) sVar.j(h1.v1.f31180a), sVar), 0.5f);
                sVar.p(false);
            }
            l1.b3 b3VarA = a0.t1.a(jC, null, "backgroundColor", sVar, 384, 10);
            int i16 = iArr[selectedState.ordinal()];
            if (i16 == 1) {
                i12 = 0;
                sVar.d0(1629994396);
                jW = ((h1.s1) sVar.j(h1.v1.f31180a)).A;
                sVar.p(false);
            } else if (i16 == 2) {
                i12 = 0;
                sVar.d0(1629997020);
                jW = ((h1.s1) sVar.j(h1.v1.f31180a)).f31017a;
                sVar.p(false);
            } else if (i16 == 3) {
                i12 = 0;
                sVar.d0(1629999616);
                jW = ob.f.w((h1.s1) sVar.j(h1.v1.f31180a), sVar);
                sVar.p(false);
            } else {
                if (i16 != 4) {
                    throw nv.p.x(sVar, 1629991678, false);
                }
                sVar.d0(1630002270);
                jW = ob.f.y((h1.s1) sVar.j(h1.v1.f31180a), sVar);
                i12 = 0;
                sVar.p(false);
            }
            d0.v vVarA = d0.n.a(((g2.x) a0.t1.a(jW, null, "borderColor", sVar, 384, 10).getValue()).f28624a, 2);
            z1.r rVarB = d2.h.b(rVar, r0.f.d(10));
            int i17 = (i14 & 7168) == 2048 ? 1 : i12;
            Object objQ = sVar.Q();
            if (i17 != 0 || objQ == l1.m.f39353a) {
                objQ = new ch.o0(10, onClick);
                sVar.o0(objQ);
            }
            k7.d(iu.k.q(i14 & 112, 6, (fz.a) objQ, sVar, rVarB, z11), r0.f.d(12), k7.p(((g2.x) b3VarA.getValue()).f28624a, sVar, i12), null, vVarA, t1.e.d(683705603, new br.l(dVar, 2), sVar), sVar, 196608, 8);
            sVar = sVar;
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new at.q(selectedState, z11, dVar, onClick, rVar, i11);
        }
    }

    public static final void f(z1.r rVar, float f5, boolean z11, fz.a onClick, l1.n nVar, int i11, int i12) {
        float f11;
        int i13;
        kotlin.jvm.internal.m.f(onClick, "onClick");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(222316835);
        int i14 = i12 & 2;
        if (i14 != 0) {
            i13 = i11 | 48;
            f11 = f5;
        } else if ((i11 & 48) == 0) {
            f11 = f5;
            i13 = i11 | (sVar.c(f11) ? 32 : 16);
        } else {
            f11 = f5;
            i13 = i11;
        }
        int i15 = i13 | (sVar.g(z11) ? 256 : 128) | (sVar.h(onClick) ? 2048 : 1024);
        if (sVar.T(i15 & 1, (i15 & 1171) != 1170)) {
            float f12 = i14 != 0 ? 16 : f11;
            List listL = ns.o.L(se.k.y(R.drawable.ic_pinyin_audio_3, sVar, 0), se.k.y(R.drawable.ic_pinyin_audio_2, sVar, 0), se.k.y(R.drawable.ic_pinyin_audio_1, sVar, 0));
            kotlin.jvm.internal.w wVar = new kotlin.jvm.internal.w();
            Object objQ = sVar.Q();
            if (objQ == l1.m.f39353a) {
                objQ = l1.t.B(listL.get(wVar.f38359a));
                sVar.o0(objQ);
            }
            l1.b1 b1Var = (l1.b1) objQ;
            if (z11) {
                sVar.d0(201764402);
                l1.t.f(new w(b1Var, listL, wVar, null, 3), qy.b0.f48488a, sVar);
                sVar.p(false);
            } else {
                sVar.d0(202122545);
                sVar.p(false);
                b1Var.setValue(listL.get(0));
            }
            h(rVar, 0L, onClick, t1.e.d(-1160217757, new p(b1Var, f12, 1), sVar), sVar, 3078 | ((i15 >> 3) & 896), 2);
            f11 = f12;
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new t(rVar, f11, z11, onClick, i11, i12);
        }
    }

    public static final void g(ht.q courseTestState, z1.r rVar, String text, fz.a onClick, l1.n nVar, int i11, int i12) {
        int i13;
        z1.r rVar2;
        kotlin.jvm.internal.m.f(courseTestState, "courseTestState");
        kotlin.jvm.internal.m.f(text, "text");
        kotlin.jvm.internal.m.f(onClick, "onClick");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-375281634);
        if ((i11 & 6) == 0) {
            i13 = (sVar.d(courseTestState.ordinal()) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i14 = i12 & 2;
        if (i14 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= sVar.f(rVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i13 |= sVar.f(text) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i13 |= sVar.h(onClick) ? 2048 : 1024;
        }
        if (sVar.T(i13 & 1, (i13 & 1171) != 1170)) {
            rVar2 = i14 != 0 ? z1.o.f58481a : rVar;
            float f5 = 16;
            iu.k.e(onClick, j0.e2.e(j0.c.B(j0.c.v(rVar2), f5, f5), 1.0f), (courseTestState == ht.q.DEFAULT || courseTestState == ht.q.REVISING) ? false : true, 0L, null, t1.e.d(-1552142551, new bp.a0(text, 2), sVar), sVar, ((i13 >> 9) & 14) | 196608, 24);
        } else {
            sVar.W();
            rVar2 = rVar;
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new bp.z(courseTestState, rVar2, text, onClick, i11, i12);
        }
    }

    public static final void h(z1.r modifier, long j11, fz.a onClick, t1.d dVar, l1.n nVar, int i11, int i12) {
        int i13;
        kotlin.jvm.internal.m.f(modifier, "modifier");
        kotlin.jvm.internal.m.f(onClick, "onClick");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1655929377);
        if ((i11 & 6) == 0) {
            i13 = (sVar.f(modifier) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= ((i12 & 2) == 0 && sVar.e(j11)) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i13 |= sVar.h(onClick) ? 256 : 128;
        }
        if (sVar.T(i13 & 1, (i13 & 1171) != 1170)) {
            sVar.Y();
            if ((i11 & 1) != 0 && !sVar.C()) {
                sVar.W();
                if ((i12 & 2) != 0) {
                    i13 &= -113;
                }
            } else if ((i12 & 2) != 0) {
                j11 = ((h1.s1) sVar.j(h1.v1.f31180a)).f31024f;
                i13 &= -113;
            }
            sVar.q();
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                objQ = l1.t.B(Boolean.FALSE);
                sVar.o0(objQ);
            }
            l1.b1 b1Var = (l1.b1) objQ;
            z1.r rVarH = d0.n.h(modifier, j11, r0.f.f48733a);
            boolean z11 = (i13 & 896) == 256;
            Object objQ2 = sVar.Q();
            if (z11 || objQ2 == gVar) {
                objQ2 = new y(onClick, b1Var);
                sVar.o0(objQ2);
            }
            z1.r rVarA = s2.g0.a(rVarH, qy.b0.f48488a, (PointerInputEventHandler) objQ2);
            w2.q0 q0VarD = j0.o.d(z1.c.f58467e, false);
            int iHashCode = Long.hashCode(sVar.T);
            l1.q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarA);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(y2.j.f56917f, q0VarD, sVar);
            l1.t.J(y2.j.f56916e, q1VarL, sVar);
            y2.h hVar = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC, sVar);
            dVar.invoke(j0.r.f35391a, sVar, 54);
            sVar.p(true);
        } else {
            sVar.W();
        }
        long j12 = j11;
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new l(modifier, j12, onClick, dVar, i11, i12);
        }
    }

    public static final void i(int i11, fz.a onClick, l1.n nVar, z1.r rVar, boolean z11) {
        kotlin.jvm.internal.m.f(onClick, "onClick");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-470808214);
        int i12 = (sVar.g(z11) ? 32 : 16) | i11 | (sVar.h(onClick) ? 256 : 128);
        if (sVar.T(i12 & 1, (i12 & 147) != 146)) {
            List listL = ns.o.L(se.k.y(R.drawable.ic_user_record_audio_3, sVar, 0), se.k.y(R.drawable.ic_user_record_audio_2, sVar, 0), se.k.y(R.drawable.ic_user_record_audio_1, sVar, 0));
            kotlin.jvm.internal.w wVar = new kotlin.jvm.internal.w();
            Object objQ = sVar.Q();
            if (objQ == l1.m.f39353a) {
                objQ = l1.t.B(listL.get(wVar.f38359a));
                sVar.o0(objQ);
            }
            l1.b1 b1Var = (l1.b1) objQ;
            if (z11) {
                sVar.d0(1516179883);
                l1.t.f(new w(b1Var, listL, wVar, null, 4), qy.b0.f48488a, sVar);
                sVar.p(false);
            } else {
                sVar.d0(1516538026);
                sVar.p(false);
                b1Var.setValue(listL.get(0));
            }
            h(rVar, 0L, onClick, t1.e.d(1470000042, new bt.g5(1, b1Var), sVar), sVar, 3078 | (i12 & 896), 2);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new j(rVar, z11, onClick, i11);
        }
    }

    public static final void j(int i11, int i12, fz.a onClick, l1.n nVar, z1.r rVar, boolean z11) {
        int i13;
        boolean z12;
        long jE;
        kotlin.jvm.internal.m.f(onClick, "onClick");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1183509060);
        int i14 = i12 & 2;
        if (i14 != 0) {
            i13 = i11 | 48;
        } else if ((i11 & 48) == 0) {
            i13 = (sVar.g(z11) ? 32 : 16) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 384) == 0) {
            i13 |= sVar.h(onClick) ? 256 : 128;
        }
        if (sVar.T(i13 & 1, (i13 & 147) != 146)) {
            boolean z13 = i14 != 0 ? true : z11;
            if (z13) {
                sVar.d0(532087715);
                jE = ((h1.s1) sVar.j(h1.v1.f31180a)).f31024f;
                sVar.p(false);
            } else {
                sVar.d0(532151637);
                sVar.p(false);
                jE = g2.f0.e(4292730333L);
            }
            h(rVar, jE, onClick, t1.e.d(-1794462588, new h(z13, 0), sVar), sVar, 3078 | (i13 & 896), 0);
            z12 = z13;
        } else {
            sVar.W();
            z12 = z11;
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new i(i11, i12, onClick, rVar, z12);
        }
    }

    public static final void k(z1.r rVar, float f5, fz.a onClick, l1.n nVar, int i11) {
        float f11;
        kotlin.jvm.internal.m.f(onClick, "onClick");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-696496828);
        int i12 = i11 | 48 | (sVar.h(onClick) ? 256 : 128);
        if (sVar.T(i12 & 1, (i12 & 147) != 146)) {
            f11 = 8;
            List listL = ns.o.L(se.k.y(R.drawable.ls_recording_3, sVar, 0), se.k.y(R.drawable.ls_recording_2, sVar, 0), se.k.y(R.drawable.ls_recording_1, sVar, 0));
            kotlin.jvm.internal.w wVar = new kotlin.jvm.internal.w();
            Object objQ = sVar.Q();
            if (objQ == l1.m.f39353a) {
                objQ = l1.t.B(listL.get(wVar.f38359a));
                sVar.o0(objQ);
            }
            l1.b1 b1Var = (l1.b1) objQ;
            l1.t.f(new w(b1Var, listL, wVar, null, 5), qy.b0.f48488a, sVar);
            h(rVar, 0L, onClick, t1.e.d(-91775100, new p(b1Var, f11, 0), sVar), sVar, 3078 | (i12 & 896), 2);
        } else {
            sVar.W();
            f11 = f5;
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new s(rVar, f11, onClick, i11);
        }
    }

    public static final void l(z1.r rVar, l1.n nVar, int i11) {
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1204935304);
        if (sVar.T(i11 & 1, (i11 & 3) != 2)) {
            d0.n.c(se.k.y(R.drawable.ic_recording_recognize, sVar, 0), null, g2.f0.s(rVar, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, ((Number) b0.e.g(b0.e.p(BuildConfig.VERSION_NAME, sVar, 0), CropImageView.DEFAULT_ASPECT_RATIO, 360.0f, b0.e.o(b0.e.r(1000, 0, b0.b0.f3441d, 2), b0.u0.Restart, 4), BuildConfig.VERSION_NAME, sVar, 29112, 0).f3553d.getValue()).floatValue(), null, 524031), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, 48, 120);
            sVar = sVar;
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new ch.g(rVar, i11, 4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0040  */
    /* JADX WARN: Code duplicated, block: B:24:0x0045  */
    /* JADX WARN: Code duplicated, block: B:26:0x004d  */
    /* JADX WARN: Code duplicated, block: B:27:0x0050  */
    /* JADX WARN: Code duplicated, block: B:31:0x005b  */
    /* JADX WARN: Code duplicated, block: B:32:0x005d  */
    /* JADX WARN: Code duplicated, block: B:35:0x0065  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069  */
    /* JADX WARN: Code duplicated, block: B:38:0x006b  */
    /* JADX WARN: Code duplicated, block: B:40:0x006e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0079  */
    /* JADX WARN: Code duplicated, block: B:43:0x007c  */
    /* JADX WARN: Code duplicated, block: B:44:0x007e  */
    /* JADX WARN: Code duplicated, block: B:47:0x00af  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:61:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:62:0x0104  */
    /* JADX WARN: Code duplicated, block: B:66:0x0125  */
    /* JADX WARN: Code duplicated, block: B:70:0x014f  */
    /* JADX WARN: Code duplicated, block: B:74:0x017f  */
    /* JADX WARN: Code duplicated, block: B:78:0x01be  */
    /* JADX WARN: Code duplicated, block: B:80:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:83:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:85:? A[RETURN, SYNTHETIC] */
    public static final void m(z1.r rVar, long j11, boolean z11, l1.n nVar, final int i11, final int i12) {
        z1.r rVar2;
        int i13;
        long j12;
        int i14;
        boolean z12;
        int i15;
        int i16;
        boolean z13;
        final z1.r rVar3;
        final long j13;
        final boolean z14;
        l1.x1 x1VarT;
        z1.o oVar;
        z1.r rVar4;
        long jE;
        boolean z15;
        int iHashCode;
        y2.i iVar;
        y2.h hVar;
        ColorFilter colorFilter;
        int iHashCode2;
        r4.a aVar;
        PorterDuff.Mode modeF;
        ColorFilter porterDuffColorFilter;
        String[] strArr;
        boolean zF;
        Object objQ;
        dd.f fVar;
        boolean zF2;
        Object objQ2;
        ad.v[] vVarArr;
        boolean zD;
        Object objQ3;
        ad.i iVarE;
        boolean zF3;
        Object objQ4;
        Object objG;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(100088392);
        int i17 = i12 & 1;
        if (i17 != 0) {
            i13 = i11 | 6;
            rVar2 = rVar;
        } else {
            rVar2 = rVar;
            i13 = i11 | (sVar.f(rVar2) ? 4 : 2);
        }
        int i18 = i12 & 2;
        if (i18 == 0) {
            if ((i11 & 48) == 0) {
                j12 = j11;
                i13 |= sVar.e(j12) ? 32 : 16;
            }
            i14 = i12 & 4;
            if (i14 != 0) {
                i16 = i13 | 384;
                z12 = z11;
            } else {
                z12 = z11;
                if (sVar.g(z12)) {
                    i15 = 256;
                } else {
                    i15 = 128;
                }
                i16 = i13 | i15;
            }
            if ((i16 & 147) != 146) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (sVar.T(i16 & 1, z13)) {
                oVar = z1.o.f58481a;
                if (i17 != 0) {
                    rVar4 = oVar;
                } else {
                    rVar4 = rVar2;
                }
                if (i18 != 0) {
                    jE = g2.f0.e(4290164406L);
                } else {
                    jE = j12;
                }
                if (i14 != 0) {
                    z15 = true;
                } else {
                    z15 = z12;
                }
                z1.r rVarG = j0.e2.g(j0.e2.s(rVar4, AchievementLevelType.DAY_STREAK_LV_8), 72);
                w2.q0 q0VarD = j0.o.d(z1.c.f58467e, false);
                iHashCode = Long.hashCode(sVar.T);
                l1.q1 q1VarL = sVar.l();
                z1.r rVarC = z1.a.c(sVar, rVarG);
                y2.k.J.getClass();
                iVar = y2.j.f56913b;
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar);
                } else {
                    sVar.r0();
                }
                l1.t.J(y2.j.f56917f, q0VarD, sVar);
                l1.t.J(y2.j.f56916e, q1VarL, sVar);
                hVar = y2.j.f56918g;
                if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                    defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                }
                l1.t.J(y2.j.f56915d, rVarC, sVar);
                colorFilter = wc.z.F;
                int i19 = g2.x.f28623j;
                iHashCode2 = Long.hashCode(jE);
                aVar = r4.a.SRC_ATOP;
                if (Build.VERSION.SDK_INT >= 29) {
                    objG = c3.c.g(aVar);
                    if (objG != null) {
                        porterDuffColorFilter = c3.c.b(iHashCode2, objG);
                    } else {
                        porterDuffColorFilter = null;
                    }
                } else {
                    modeF = ff.h.F(aVar);
                    if (modeF != null) {
                        porterDuffColorFilter = new PorterDuffColorFilter(iHashCode2, modeF);
                    } else {
                        porterDuffColorFilter = null;
                    }
                }
                strArr = new String[]{"**"};
                sVar.e0(-1788530187);
                sVar.e0(1613443961);
                zF = sVar.f(strArr);
                objQ = sVar.Q();
                l1.g gVar = l1.m.f39353a;
                if (zF || objQ == gVar) {
                    objQ = new dd.f((String[]) Arrays.copyOf(strArr, 1));
                    sVar.o0(objQ);
                }
                fVar = (dd.f) objQ;
                sVar.p(false);
                sVar.e0(1613444012);
                zF2 = sVar.f(fVar) | sVar.f(porterDuffColorFilter);
                objQ2 = sVar.Q();
                if (zF2 || objQ2 == gVar) {
                    objQ2 = new ad.v(colorFilter, fVar, porterDuffColorFilter);
                    sVar.o0(objQ2);
                }
                sVar.p(false);
                sVar.p(false);
                vVarArr = new ad.v[]{(ad.v) objQ2};
                sVar.e0(-395574495);
                int iHashCode3 = Arrays.hashCode(vVarArr);
                sVar.e0(34468001);
                zD = sVar.d(iHashCode3);
                objQ3 = sVar.Q();
                if (zD || objQ3 == gVar) {
                    objQ3 = new ad.t(ry.l.k0(vVarArr));
                    sVar.o0(objQ3);
                }
                ad.t tVar = (ad.t) objQ3;
                sVar.p(false);
                sVar.p(false);
                ad.p pVarL = gb.r.L(new ad.r(R.raw.audio_wave), sVar);
                iVarE = ff.h.e((wc.h) pVarL.getValue(), z15, CropImageView.DEFAULT_ASPECT_RATIO, sVar, 956);
                wc.h hVar2 = (wc.h) pVarL.getValue();
                zF3 = sVar.f(iVarE);
                objQ4 = sVar.Q();
                if (zF3 || objQ4 == gVar) {
                    objQ4 = new w6(iVarE, 1);
                    sVar.o0(objQ4);
                }
                fr.j3.a(hVar2, (fz.a) objQ4, j0.c.j(j0.e2.s(oVar, 100), 1.0f), tVar, null, null, sVar, 1073742208, 0, 130552);
                sVar.p(true);
                rVar3 = rVar4;
                j13 = jE;
                z14 = z15;
            } else {
                sVar.W();
                rVar3 = rVar2;
                j13 = j12;
                z14 = z12;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new fz.e() { // from class: dt.v
                    @Override // fz.e
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        a0.m(rVar3, j13, z14, (l1.n) obj, l1.t.M(i11 | 1), i12);
                        return qy.b0.f48488a;
                    }
                };
            }
        }
        i13 |= 48;
        j12 = j11;
        i14 = i12 & 4;
        if (i14 != 0) {
            i16 = i13 | 384;
            z12 = z11;
        } else {
            z12 = z11;
            if (sVar.g(z12)) {
                i15 = 256;
            } else {
                i15 = 128;
            }
            i16 = i13 | i15;
        }
        if ((i16 & 147) != 146) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (sVar.T(i16 & 1, z13)) {
            oVar = z1.o.f58481a;
            if (i17 != 0) {
                rVar4 = oVar;
            } else {
                rVar4 = rVar2;
            }
            if (i18 != 0) {
                jE = g2.f0.e(4290164406L);
            } else {
                jE = j12;
            }
            if (i14 != 0) {
                z15 = true;
            } else {
                z15 = z12;
            }
            z1.r rVarG2 = j0.e2.g(j0.e2.s(rVar4, AchievementLevelType.DAY_STREAK_LV_8), 72);
            w2.q0 q0VarD2 = j0.o.d(z1.c.f58467e, false);
            iHashCode = Long.hashCode(sVar.T);
            l1.q1 q1VarL2 = sVar.l();
            z1.r rVarC2 = z1.a.c(sVar, rVarG2);
            y2.k.J.getClass();
            iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(y2.j.f56917f, q0VarD2, sVar);
            l1.t.J(y2.j.f56916e, q1VarL2, sVar);
            hVar = y2.j.f56918g;
            if (sVar.S) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            } else {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC2, sVar);
            colorFilter = wc.z.F;
            int i110 = g2.x.f28623j;
            iHashCode2 = Long.hashCode(jE);
            aVar = r4.a.SRC_ATOP;
            if (Build.VERSION.SDK_INT >= 29) {
                objG = c3.c.g(aVar);
                if (objG != null) {
                    porterDuffColorFilter = c3.c.b(iHashCode2, objG);
                } else {
                    porterDuffColorFilter = null;
                }
            } else {
                modeF = ff.h.F(aVar);
                if (modeF != null) {
                    porterDuffColorFilter = new PorterDuffColorFilter(iHashCode2, modeF);
                } else {
                    porterDuffColorFilter = null;
                }
            }
            strArr = new String[]{"**"};
            sVar.e0(-1788530187);
            sVar.e0(1613443961);
            zF = sVar.f(strArr);
            objQ = sVar.Q();
            l1.g gVar2 = l1.m.f39353a;
            if (zF) {
                objQ = new dd.f((String[]) Arrays.copyOf(strArr, 1));
                sVar.o0(objQ);
            } else {
                objQ = new dd.f((String[]) Arrays.copyOf(strArr, 1));
                sVar.o0(objQ);
            }
            fVar = (dd.f) objQ;
            sVar.p(false);
            sVar.e0(1613444012);
            zF2 = sVar.f(fVar) | sVar.f(porterDuffColorFilter);
            objQ2 = sVar.Q();
            if (zF2) {
                objQ2 = new ad.v(colorFilter, fVar, porterDuffColorFilter);
                sVar.o0(objQ2);
            } else {
                objQ2 = new ad.v(colorFilter, fVar, porterDuffColorFilter);
                sVar.o0(objQ2);
            }
            sVar.p(false);
            sVar.p(false);
            vVarArr = new ad.v[]{(ad.v) objQ2};
            sVar.e0(-395574495);
            int iHashCode4 = Arrays.hashCode(vVarArr);
            sVar.e0(34468001);
            zD = sVar.d(iHashCode4);
            objQ3 = sVar.Q();
            if (zD) {
                objQ3 = new ad.t(ry.l.k0(vVarArr));
                sVar.o0(objQ3);
            } else {
                objQ3 = new ad.t(ry.l.k0(vVarArr));
                sVar.o0(objQ3);
            }
            ad.t tVar2 = (ad.t) objQ3;
            sVar.p(false);
            sVar.p(false);
            ad.p pVarL2 = gb.r.L(new ad.r(R.raw.audio_wave), sVar);
            iVarE = ff.h.e((wc.h) pVarL2.getValue(), z15, CropImageView.DEFAULT_ASPECT_RATIO, sVar, 956);
            wc.h hVar3 = (wc.h) pVarL2.getValue();
            zF3 = sVar.f(iVarE);
            objQ4 = sVar.Q();
            if (zF3) {
                objQ4 = new w6(iVarE, 1);
                sVar.o0(objQ4);
            } else {
                objQ4 = new w6(iVarE, 1);
                sVar.o0(objQ4);
            }
            fr.j3.a(hVar3, (fz.a) objQ4, j0.c.j(j0.e2.s(oVar, 100), 1.0f), tVar2, null, null, sVar, 1073742208, 0, 130552);
            sVar.p(true);
            rVar3 = rVar4;
            j13 = jE;
            z14 = z15;
        } else {
            sVar.W();
            rVar3 = rVar2;
            j13 = j12;
            z14 = z12;
        }
        x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fz.e() { // from class: dt.v
                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    a0.m(rVar3, j13, z14, (l1.n) obj, l1.t.M(i11 | 1), i12);
                    return qy.b0.f48488a;
                }
            };
        }
    }

    public static final void n(int i11, fz.a onClick, l1.n nVar, z1.r rVar) {
        fz.a aVar;
        z1.r rVar2;
        kotlin.jvm.internal.m.f(onClick, "onClick");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-2039526801);
        int i12 = (sVar.h(onClick) ? 32 : 16) | i11;
        if (sVar.T(i12 & 1, (i12 & 19) != 18)) {
            aVar = onClick;
            rVar2 = rVar;
            h(rVar2, g2.f0.e(4294932857L), aVar, e.f23754a, sVar, 3126 | ((i12 << 3) & 896), 0);
        } else {
            aVar = onClick;
            rVar2 = rVar;
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new u(i11, 0, aVar, rVar2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003e  */
    /* JADX WARN: Code duplicated, block: B:20:0x0040  */
    /* JADX WARN: Code duplicated, block: B:23:0x0049 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x004b  */
    /* JADX WARN: Code duplicated, block: B:26:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:31:? A[RETURN, SYNTHETIC] */
    public static final void o(int i11, int i12, String text, l1.n nVar, z1.r rVar) {
        z1.r rVar2;
        boolean z11;
        l1.s sVar;
        z1.r rVar3;
        l1.x1 x1VarT;
        kotlin.jvm.internal.m.f(text, "text");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(610438251);
        int i13 = i11 | (sVar2.f(text) ? 4 : 2);
        int i14 = i12 & 2;
        if (i14 == 0) {
            if ((i11 & 48) == 0) {
                rVar2 = rVar;
                i13 |= sVar2.f(rVar2) ? 32 : 16;
            }
            if ((i13 & 19) != 18) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (sVar2.T(i13 & 1, z11)) {
                if (i14 != 0) {
                    rVar2 = z1.o.f58481a;
                }
                float f5 = 32;
                sVar = sVar2;
                ua.b(text, j0.c.E(rVar2, f5, CropImageView.DEFAULT_ASPECT_RATIO, f5, CropImageView.DEFAULT_ASPECT_RATIO, 10), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a((j3.y0) sVar2.j(ua.f31167a), 0L, ((ct.b) sVar2.j(ct.c.f22476a)).f22468c, n3.s.H, null, null, 0L, null, null, 3, 0, 0L, null, 16744441), sVar, i13 & 14, 0, 65532);
                rVar3 = rVar2;
            } else {
                sVar = sVar2;
                sVar.W();
                rVar3 = rVar2;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new bt.z(text, rVar3, i11, i12, 1);
            }
        }
        i13 |= 48;
        rVar2 = rVar;
        if ((i13 & 19) != 18) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (sVar2.T(i13 & 1, z11)) {
            if (i14 != 0) {
                rVar2 = z1.o.f58481a;
            }
            float f11 = 32;
            sVar = sVar2;
            ua.b(text, j0.c.E(rVar2, f11, CropImageView.DEFAULT_ASPECT_RATIO, f11, CropImageView.DEFAULT_ASPECT_RATIO, 10), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a((j3.y0) sVar2.j(ua.f31167a), 0L, ((ct.b) sVar2.j(ct.c.f22476a)).f22468c, n3.s.H, null, null, 0L, null, null, 3, 0, 0L, null, 16744441), sVar, i13 & 14, 0, 65532);
            rVar3 = rVar2;
        } else {
            sVar = sVar2;
            sVar.W();
            rVar3 = rVar2;
        }
        x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new bt.z(text, rVar3, i11, i12, 1);
        }
    }

    public static final void p(j3.h hVar, l1.n nVar, int i11) {
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1952044428);
        int i12 = i11 | (sVar.f(hVar) ? 4 : 2) | 48;
        if (sVar.T(i12 & 1, (i12 & 19) != 18)) {
            long j11 = ((ct.b) sVar.j(ct.c.f22476a)).f22466a;
            j0.u uVarA = j0.t.a(j0.i.g(6), z1.c.O, sVar, 6);
            int iHashCode = Long.hashCode(sVar.T);
            l1.q1 q1VarL = sVar.l();
            z1.o oVar = z1.o.f58481a;
            z1.r rVarC = z1.a.c(sVar, oVar);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(y2.j.f56917f, uVarA, sVar);
            l1.t.J(y2.j.f56916e, q1VarL, sVar);
            y2.h hVar2 = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar2);
            }
            l1.t.J(y2.j.f56915d, rVarC, sVar);
            sVar.d0(739394264);
            sVar.p(false);
            iu.k.i(hVar, oVar, 0L, null, null, 0L, fr.j3.A(12), j11, null, 0L, null, 0, false, 2, 0, null, null, j3.y0.a((j3.y0) sVar.j(ua.f31167a), 0L, j11, n3.s.K, null, null, 0L, null, null, 0, 0, 0L, null, 16777209), CropImageView.DEFAULT_ASPECT_RATIO, sVar, (i12 & 14) | 1572912, 1572864, 0, 3079996);
            sVar = sVar;
            sVar.p(true);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new ch.b0(hVar, i11, 2);
        }
    }

    public static final void q(String text, boolean z11, l1.n nVar, int i11, int i12) {
        boolean z12;
        int i13;
        kotlin.jvm.internal.m.f(text, "text");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1924707762);
        int i14 = i11 | (sVar.f(text) ? 4 : 2);
        int i15 = i12 & 2;
        if (i15 != 0) {
            i13 = i14 | 48;
            z12 = z11;
        } else {
            z12 = z11;
            i13 = i14 | (sVar.g(z12) ? 32 : 16);
        }
        if (sVar.T(i13 & 1, (i13 & 19) != 18)) {
            boolean z13 = i15 != 0 ? false : z12;
            long j11 = ((ct.b) sVar.j(ct.c.f22476a)).f22466a;
            j0.u uVarA = j0.t.a(j0.i.g(6), z1.c.O, sVar, 6);
            int iHashCode = Long.hashCode(sVar.T);
            l1.q1 q1VarL = sVar.l();
            z1.o oVar = z1.o.f58481a;
            z1.r rVarC = z1.a.c(sVar, oVar);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(y2.j.f56917f, uVarA, sVar);
            l1.t.J(y2.j.f56916e, q1VarL, sVar);
            y2.h hVar = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC, sVar);
            if (z13) {
                sVar.d0(731481043);
                e.B(null, sVar, 0);
            } else {
                sVar.d0(725977830);
            }
            sVar.p(false);
            iu.k.h(text, oVar, 0L, null, null, 0L, fr.j3.A(12), j11, null, 0L, null, 0, false, 2, 0, null, j3.y0.a((j3.y0) sVar.j(ua.f31167a), 0L, j11, n3.s.K, null, null, 0L, null, null, 0, 0, 0L, null, 16777209), CropImageView.DEFAULT_ASPECT_RATIO, sVar, (i13 & 14) | 1572912, 1572864, 1507132);
            sVar = sVar;
            sVar.p(true);
            z12 = z13;
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new n(i11, z12, i12, text);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003c  */
    /* JADX WARN: Code duplicated, block: B:21:0x0041  */
    /* JADX WARN: Code duplicated, block: B:23:0x0045  */
    /* JADX WARN: Code duplicated, block: B:25:0x004d  */
    /* JADX WARN: Code duplicated, block: B:26:0x0050  */
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:32:0x005f  */
    /* JADX WARN: Code duplicated, block: B:33:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x006d  */
    /* JADX WARN: Code duplicated, block: B:38:0x006f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0078  */
    /* JADX WARN: Code duplicated, block: B:43:0x007f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0095 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x0097  */
    /* JADX WARN: Code duplicated, block: B:54:0x009a  */
    /* JADX WARN: Code duplicated, block: B:57:0x009e  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:63:0x0138  */
    /* JADX WARN: Code duplicated, block: B:66:0x0144  */
    /* JADX WARN: Code duplicated, block: B:68:? A[RETURN, SYNTHETIC] */
    public static final void r(final String text, z1.r rVar, int i11, int i12, l1.n nVar, final int i13, final int i14) {
        z1.r rVar2;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        boolean z11;
        final z1.r rVar3;
        final int i21;
        final int i22;
        l1.x1 x1VarT;
        z1.r rVar4;
        int i23;
        int i24;
        kotlin.jvm.internal.m.f(text, "text");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1084677853);
        int i25 = (sVar.f(text) ? 4 : 2) | i13;
        int i26 = i14 & 2;
        if (i26 == 0) {
            if ((i13 & 48) == 0) {
                rVar2 = rVar;
                i25 |= sVar.f(rVar2) ? 32 : 16;
            }
            i15 = i14 & 4;
            if (i15 != 0) {
                if ((i13 & 384) == 0) {
                    i16 = i11;
                    if (sVar.d(i16)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i25 |= i17;
                }
                if ((i14 & 8) == 0) {
                    i18 = i12;
                    int i27 = sVar.d(i18) ? 2048 : 1024;
                    i19 = i25 | i27;
                    if ((i19 & 1171) != 1170) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (sVar.T(i19 & 1, z11)) {
                        sVar.Y();
                        if ((i13 & 1) != 0 || sVar.C()) {
                            if (i26 != 0) {
                                rVar4 = z1.o.f58481a;
                            } else {
                                rVar4 = rVar2;
                            }
                            if (i15 != 0) {
                                i16 = 3;
                            }
                            if ((i14 & 8) != 0) {
                                z1.r rVar5 = rVar4;
                                i23 = i19 & (-7169);
                                rVar3 = rVar5;
                                i24 = 3;
                            } else {
                                z1.r rVar6 = rVar4;
                                i23 = i19;
                                rVar3 = rVar6;
                            }
                            int i28 = i16;
                            sVar.q();
                            long jE = ct.c.e(sVar);
                            boolean zBooleanValue = ((Boolean) sVar.j(ju.f.f37377k)).booleanValue();
                            Object objJ = sVar.j(f23628c);
                            j3.y0 y0VarA = j3.y0.a((j3.y0) sVar.j(ua.f31167a), ((h1.s1) sVar.j(h1.v1.f31180a)).f31036s, jE, n3.s.H, null, null, 0L, null, null, i24, 0, 0L, null, 16744440);
                            fr.j3.i(jE);
                            iu.k.m(text, zBooleanValue, rVar3, objJ, false, null, y0VarA, i28, 0, new s0.g(fr.j3.L(jE & 1095216660480L, v3.o.c(jE) * 0.6f), jE, fr.j3.z(0.25d)), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, (i23 & 14) | ((i23 << 3) & 896) | ((i23 << 15) & 29360128), 7472);
                            i21 = i28;
                            i22 = i24;
                        } else {
                            sVar.W();
                            if ((i14 & 8) != 0) {
                                i19 &= -7169;
                            }
                            i23 = i19;
                            rVar3 = rVar2;
                        }
                        i24 = i18;
                        int i29 = i16;
                        sVar.q();
                        long jE2 = ct.c.e(sVar);
                        boolean zBooleanValue2 = ((Boolean) sVar.j(ju.f.f37377k)).booleanValue();
                        Object objJ2 = sVar.j(f23628c);
                        j3.y0 y0VarA2 = j3.y0.a((j3.y0) sVar.j(ua.f31167a), ((h1.s1) sVar.j(h1.v1.f31180a)).f31036s, jE2, n3.s.H, null, null, 0L, null, null, i24, 0, 0L, null, 16744440);
                        fr.j3.i(jE2);
                        iu.k.m(text, zBooleanValue2, rVar3, objJ2, false, null, y0VarA2, i29, 0, new s0.g(fr.j3.L(jE2 & 1095216660480L, v3.o.c(jE2) * 0.6f), jE2, fr.j3.z(0.25d)), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, (i23 & 14) | ((i23 << 3) & 896) | ((i23 << 15) & 29360128), 7472);
                        i21 = i29;
                        i22 = i24;
                    } else {
                        sVar.W();
                        rVar3 = rVar2;
                        i21 = i16;
                        i22 = i18;
                    }
                    x1VarT = sVar.t();
                    if (x1VarT != null) {
                        x1VarT.f39502d = new fz.e() { // from class: dt.q
                            @Override // fz.e
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                a0.r(text, rVar3, i21, i22, (l1.n) obj, l1.t.M(i13 | 1), i14);
                                return qy.b0.f48488a;
                            }
                        };
                    }
                }
                i18 = i12;
                i19 = i25 | i27;
                if ((i19 & 1171) != 1170) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (sVar.T(i19 & 1, z11)) {
                    sVar.Y();
                    if ((i13 & 1) != 0) {
                        if (i26 != 0) {
                            rVar4 = z1.o.f58481a;
                        } else {
                            rVar4 = rVar2;
                        }
                        if (i15 != 0) {
                            i16 = 3;
                        }
                        if ((i14 & 8) != 0) {
                            z1.r rVar7 = rVar4;
                            i23 = i19 & (-7169);
                            rVar3 = rVar7;
                            i24 = 3;
                        } else {
                            z1.r rVar8 = rVar4;
                            i23 = i19;
                            rVar3 = rVar8;
                            i24 = i18;
                        }
                    } else {
                        if (i26 != 0) {
                            rVar4 = z1.o.f58481a;
                        } else {
                            rVar4 = rVar2;
                        }
                        if (i15 != 0) {
                            i16 = 3;
                        }
                        if ((i14 & 8) != 0) {
                            z1.r rVar9 = rVar4;
                            i23 = i19 & (-7169);
                            rVar3 = rVar9;
                            i24 = 3;
                        } else {
                            z1.r rVar10 = rVar4;
                            i23 = i19;
                            rVar3 = rVar10;
                            i24 = i18;
                        }
                    }
                    int i210 = i16;
                    sVar.q();
                    long jE3 = ct.c.e(sVar);
                    boolean zBooleanValue3 = ((Boolean) sVar.j(ju.f.f37377k)).booleanValue();
                    Object objJ3 = sVar.j(f23628c);
                    j3.y0 y0VarA3 = j3.y0.a((j3.y0) sVar.j(ua.f31167a), ((h1.s1) sVar.j(h1.v1.f31180a)).f31036s, jE3, n3.s.H, null, null, 0L, null, null, i24, 0, 0L, null, 16744440);
                    fr.j3.i(jE3);
                    iu.k.m(text, zBooleanValue3, rVar3, objJ3, false, null, y0VarA3, i210, 0, new s0.g(fr.j3.L(jE3 & 1095216660480L, v3.o.c(jE3) * 0.6f), jE3, fr.j3.z(0.25d)), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, (i23 & 14) | ((i23 << 3) & 896) | ((i23 << 15) & 29360128), 7472);
                    i21 = i210;
                    i22 = i24;
                } else {
                    sVar.W();
                    rVar3 = rVar2;
                    i21 = i16;
                    i22 = i18;
                }
                x1VarT = sVar.t();
                if (x1VarT != null) {
                    x1VarT.f39502d = new fz.e() { // from class: dt.q
                        @Override // fz.e
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            a0.r(text, rVar3, i21, i22, (l1.n) obj, l1.t.M(i13 | 1), i14);
                            return qy.b0.f48488a;
                        }
                    };
                }
            }
            i25 |= 384;
            i16 = i11;
            if ((i14 & 8) == 0) {
                i18 = i12;
                if (sVar.d(i18)) {
                }
                i19 = i25 | i27;
                if ((i19 & 1171) != 1170) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (sVar.T(i19 & 1, z11)) {
                    sVar.Y();
                    if ((i13 & 1) != 0) {
                        if (i26 != 0) {
                            rVar4 = z1.o.f58481a;
                        } else {
                            rVar4 = rVar2;
                        }
                        if (i15 != 0) {
                            i16 = 3;
                        }
                        if ((i14 & 8) != 0) {
                            z1.r rVar11 = rVar4;
                            i23 = i19 & (-7169);
                            rVar3 = rVar11;
                            i24 = 3;
                        } else {
                            z1.r rVar12 = rVar4;
                            i23 = i19;
                            rVar3 = rVar12;
                            i24 = i18;
                        }
                    } else {
                        if (i26 != 0) {
                            rVar4 = z1.o.f58481a;
                        } else {
                            rVar4 = rVar2;
                        }
                        if (i15 != 0) {
                            i16 = 3;
                        }
                        if ((i14 & 8) != 0) {
                            z1.r rVar13 = rVar4;
                            i23 = i19 & (-7169);
                            rVar3 = rVar13;
                            i24 = 3;
                        } else {
                            z1.r rVar14 = rVar4;
                            i23 = i19;
                            rVar3 = rVar14;
                            i24 = i18;
                        }
                    }
                    int i211 = i16;
                    sVar.q();
                    long jE4 = ct.c.e(sVar);
                    boolean zBooleanValue4 = ((Boolean) sVar.j(ju.f.f37377k)).booleanValue();
                    Object objJ4 = sVar.j(f23628c);
                    j3.y0 y0VarA4 = j3.y0.a((j3.y0) sVar.j(ua.f31167a), ((h1.s1) sVar.j(h1.v1.f31180a)).f31036s, jE4, n3.s.H, null, null, 0L, null, null, i24, 0, 0L, null, 16744440);
                    fr.j3.i(jE4);
                    iu.k.m(text, zBooleanValue4, rVar3, objJ4, false, null, y0VarA4, i211, 0, new s0.g(fr.j3.L(jE4 & 1095216660480L, v3.o.c(jE4) * 0.6f), jE4, fr.j3.z(0.25d)), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, (i23 & 14) | ((i23 << 3) & 896) | ((i23 << 15) & 29360128), 7472);
                    i21 = i211;
                    i22 = i24;
                } else {
                    sVar.W();
                    rVar3 = rVar2;
                    i21 = i16;
                    i22 = i18;
                }
                x1VarT = sVar.t();
                if (x1VarT != null) {
                    x1VarT.f39502d = new fz.e() { // from class: dt.q
                        @Override // fz.e
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            a0.r(text, rVar3, i21, i22, (l1.n) obj, l1.t.M(i13 | 1), i14);
                            return qy.b0.f48488a;
                        }
                    };
                }
            }
            i18 = i12;
            i19 = i25 | i27;
            if ((i19 & 1171) != 1170) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (sVar.T(i19 & 1, z11)) {
                sVar.Y();
                if ((i13 & 1) != 0) {
                    if (i26 != 0) {
                        rVar4 = z1.o.f58481a;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i15 != 0) {
                        i16 = 3;
                    }
                    if ((i14 & 8) != 0) {
                        z1.r rVar15 = rVar4;
                        i23 = i19 & (-7169);
                        rVar3 = rVar15;
                        i24 = 3;
                    } else {
                        z1.r rVar16 = rVar4;
                        i23 = i19;
                        rVar3 = rVar16;
                        i24 = i18;
                    }
                } else {
                    if (i26 != 0) {
                        rVar4 = z1.o.f58481a;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i15 != 0) {
                        i16 = 3;
                    }
                    if ((i14 & 8) != 0) {
                        z1.r rVar17 = rVar4;
                        i23 = i19 & (-7169);
                        rVar3 = rVar17;
                        i24 = 3;
                    } else {
                        z1.r rVar18 = rVar4;
                        i23 = i19;
                        rVar3 = rVar18;
                        i24 = i18;
                    }
                }
                int i212 = i16;
                sVar.q();
                long jE5 = ct.c.e(sVar);
                boolean zBooleanValue5 = ((Boolean) sVar.j(ju.f.f37377k)).booleanValue();
                Object objJ5 = sVar.j(f23628c);
                j3.y0 y0VarA5 = j3.y0.a((j3.y0) sVar.j(ua.f31167a), ((h1.s1) sVar.j(h1.v1.f31180a)).f31036s, jE5, n3.s.H, null, null, 0L, null, null, i24, 0, 0L, null, 16744440);
                fr.j3.i(jE5);
                iu.k.m(text, zBooleanValue5, rVar3, objJ5, false, null, y0VarA5, i212, 0, new s0.g(fr.j3.L(jE5 & 1095216660480L, v3.o.c(jE5) * 0.6f), jE5, fr.j3.z(0.25d)), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, (i23 & 14) | ((i23 << 3) & 896) | ((i23 << 15) & 29360128), 7472);
                i21 = i212;
                i22 = i24;
            } else {
                sVar.W();
                rVar3 = rVar2;
                i21 = i16;
                i22 = i18;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new fz.e() { // from class: dt.q
                    @Override // fz.e
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        a0.r(text, rVar3, i21, i22, (l1.n) obj, l1.t.M(i13 | 1), i14);
                        return qy.b0.f48488a;
                    }
                };
            }
        }
        i25 |= 48;
        rVar2 = rVar;
        i15 = i14 & 4;
        if (i15 != 0) {
            if ((i13 & 384) == 0) {
                i16 = i11;
                if (sVar.d(i16)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i25 |= i17;
            }
            if ((i14 & 8) == 0) {
                i18 = i12;
                if (sVar.d(i18)) {
                }
                i19 = i25 | i27;
                if ((i19 & 1171) != 1170) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (sVar.T(i19 & 1, z11)) {
                    sVar.Y();
                    if ((i13 & 1) != 0) {
                        if (i26 != 0) {
                            rVar4 = z1.o.f58481a;
                        } else {
                            rVar4 = rVar2;
                        }
                        if (i15 != 0) {
                            i16 = 3;
                        }
                        if ((i14 & 8) != 0) {
                            z1.r rVar19 = rVar4;
                            i23 = i19 & (-7169);
                            rVar3 = rVar19;
                            i24 = 3;
                        } else {
                            z1.r rVar110 = rVar4;
                            i23 = i19;
                            rVar3 = rVar110;
                            i24 = i18;
                        }
                    } else {
                        if (i26 != 0) {
                            rVar4 = z1.o.f58481a;
                        } else {
                            rVar4 = rVar2;
                        }
                        if (i15 != 0) {
                            i16 = 3;
                        }
                        if ((i14 & 8) != 0) {
                            z1.r rVar111 = rVar4;
                            i23 = i19 & (-7169);
                            rVar3 = rVar111;
                            i24 = 3;
                        } else {
                            z1.r rVar112 = rVar4;
                            i23 = i19;
                            rVar3 = rVar112;
                            i24 = i18;
                        }
                    }
                    int i213 = i16;
                    sVar.q();
                    long jE6 = ct.c.e(sVar);
                    boolean zBooleanValue6 = ((Boolean) sVar.j(ju.f.f37377k)).booleanValue();
                    Object objJ6 = sVar.j(f23628c);
                    j3.y0 y0VarA6 = j3.y0.a((j3.y0) sVar.j(ua.f31167a), ((h1.s1) sVar.j(h1.v1.f31180a)).f31036s, jE6, n3.s.H, null, null, 0L, null, null, i24, 0, 0L, null, 16744440);
                    fr.j3.i(jE6);
                    iu.k.m(text, zBooleanValue6, rVar3, objJ6, false, null, y0VarA6, i213, 0, new s0.g(fr.j3.L(jE6 & 1095216660480L, v3.o.c(jE6) * 0.6f), jE6, fr.j3.z(0.25d)), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, (i23 & 14) | ((i23 << 3) & 896) | ((i23 << 15) & 29360128), 7472);
                    i21 = i213;
                    i22 = i24;
                } else {
                    sVar.W();
                    rVar3 = rVar2;
                    i21 = i16;
                    i22 = i18;
                }
                x1VarT = sVar.t();
                if (x1VarT != null) {
                    x1VarT.f39502d = new fz.e() { // from class: dt.q
                        @Override // fz.e
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            a0.r(text, rVar3, i21, i22, (l1.n) obj, l1.t.M(i13 | 1), i14);
                            return qy.b0.f48488a;
                        }
                    };
                }
            }
            i18 = i12;
            i19 = i25 | i27;
            if ((i19 & 1171) != 1170) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (sVar.T(i19 & 1, z11)) {
                sVar.Y();
                if ((i13 & 1) != 0) {
                    if (i26 != 0) {
                        rVar4 = z1.o.f58481a;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i15 != 0) {
                        i16 = 3;
                    }
                    if ((i14 & 8) != 0) {
                        z1.r rVar113 = rVar4;
                        i23 = i19 & (-7169);
                        rVar3 = rVar113;
                        i24 = 3;
                    } else {
                        z1.r rVar114 = rVar4;
                        i23 = i19;
                        rVar3 = rVar114;
                        i24 = i18;
                    }
                } else {
                    if (i26 != 0) {
                        rVar4 = z1.o.f58481a;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i15 != 0) {
                        i16 = 3;
                    }
                    if ((i14 & 8) != 0) {
                        z1.r rVar115 = rVar4;
                        i23 = i19 & (-7169);
                        rVar3 = rVar115;
                        i24 = 3;
                    } else {
                        z1.r rVar116 = rVar4;
                        i23 = i19;
                        rVar3 = rVar116;
                        i24 = i18;
                    }
                }
                int i214 = i16;
                sVar.q();
                long jE7 = ct.c.e(sVar);
                boolean zBooleanValue7 = ((Boolean) sVar.j(ju.f.f37377k)).booleanValue();
                Object objJ7 = sVar.j(f23628c);
                j3.y0 y0VarA7 = j3.y0.a((j3.y0) sVar.j(ua.f31167a), ((h1.s1) sVar.j(h1.v1.f31180a)).f31036s, jE7, n3.s.H, null, null, 0L, null, null, i24, 0, 0L, null, 16744440);
                fr.j3.i(jE7);
                iu.k.m(text, zBooleanValue7, rVar3, objJ7, false, null, y0VarA7, i214, 0, new s0.g(fr.j3.L(jE7 & 1095216660480L, v3.o.c(jE7) * 0.6f), jE7, fr.j3.z(0.25d)), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, (i23 & 14) | ((i23 << 3) & 896) | ((i23 << 15) & 29360128), 7472);
                i21 = i214;
                i22 = i24;
            } else {
                sVar.W();
                rVar3 = rVar2;
                i21 = i16;
                i22 = i18;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new fz.e() { // from class: dt.q
                    @Override // fz.e
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        a0.r(text, rVar3, i21, i22, (l1.n) obj, l1.t.M(i13 | 1), i14);
                        return qy.b0.f48488a;
                    }
                };
            }
        }
        i25 |= 384;
        i16 = i11;
        if ((i14 & 8) == 0) {
            i18 = i12;
            if (sVar.d(i18)) {
            }
            i19 = i25 | i27;
            if ((i19 & 1171) != 1170) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (sVar.T(i19 & 1, z11)) {
                sVar.Y();
                if ((i13 & 1) != 0) {
                    if (i26 != 0) {
                        rVar4 = z1.o.f58481a;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i15 != 0) {
                        i16 = 3;
                    }
                    if ((i14 & 8) != 0) {
                        z1.r rVar117 = rVar4;
                        i23 = i19 & (-7169);
                        rVar3 = rVar117;
                        i24 = 3;
                    } else {
                        z1.r rVar118 = rVar4;
                        i23 = i19;
                        rVar3 = rVar118;
                        i24 = i18;
                    }
                } else {
                    if (i26 != 0) {
                        rVar4 = z1.o.f58481a;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i15 != 0) {
                        i16 = 3;
                    }
                    if ((i14 & 8) != 0) {
                        z1.r rVar119 = rVar4;
                        i23 = i19 & (-7169);
                        rVar3 = rVar119;
                        i24 = 3;
                    } else {
                        z1.r rVar1110 = rVar4;
                        i23 = i19;
                        rVar3 = rVar1110;
                        i24 = i18;
                    }
                }
                int i215 = i16;
                sVar.q();
                long jE8 = ct.c.e(sVar);
                boolean zBooleanValue8 = ((Boolean) sVar.j(ju.f.f37377k)).booleanValue();
                Object objJ8 = sVar.j(f23628c);
                j3.y0 y0VarA8 = j3.y0.a((j3.y0) sVar.j(ua.f31167a), ((h1.s1) sVar.j(h1.v1.f31180a)).f31036s, jE8, n3.s.H, null, null, 0L, null, null, i24, 0, 0L, null, 16744440);
                fr.j3.i(jE8);
                iu.k.m(text, zBooleanValue8, rVar3, objJ8, false, null, y0VarA8, i215, 0, new s0.g(fr.j3.L(jE8 & 1095216660480L, v3.o.c(jE8) * 0.6f), jE8, fr.j3.z(0.25d)), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, (i23 & 14) | ((i23 << 3) & 896) | ((i23 << 15) & 29360128), 7472);
                i21 = i215;
                i22 = i24;
            } else {
                sVar.W();
                rVar3 = rVar2;
                i21 = i16;
                i22 = i18;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new fz.e() { // from class: dt.q
                    @Override // fz.e
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        a0.r(text, rVar3, i21, i22, (l1.n) obj, l1.t.M(i13 | 1), i14);
                        return qy.b0.f48488a;
                    }
                };
            }
        }
        i18 = i12;
        i19 = i25 | i27;
        if ((i19 & 1171) != 1170) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (sVar.T(i19 & 1, z11)) {
            sVar.Y();
            if ((i13 & 1) != 0) {
                if (i26 != 0) {
                    rVar4 = z1.o.f58481a;
                } else {
                    rVar4 = rVar2;
                }
                if (i15 != 0) {
                    i16 = 3;
                }
                if ((i14 & 8) != 0) {
                    z1.r rVar1111 = rVar4;
                    i23 = i19 & (-7169);
                    rVar3 = rVar1111;
                    i24 = 3;
                } else {
                    z1.r rVar1112 = rVar4;
                    i23 = i19;
                    rVar3 = rVar1112;
                    i24 = i18;
                }
            } else {
                if (i26 != 0) {
                    rVar4 = z1.o.f58481a;
                } else {
                    rVar4 = rVar2;
                }
                if (i15 != 0) {
                    i16 = 3;
                }
                if ((i14 & 8) != 0) {
                    z1.r rVar1113 = rVar4;
                    i23 = i19 & (-7169);
                    rVar3 = rVar1113;
                    i24 = 3;
                } else {
                    z1.r rVar1114 = rVar4;
                    i23 = i19;
                    rVar3 = rVar1114;
                    i24 = i18;
                }
            }
            int i216 = i16;
            sVar.q();
            long jE9 = ct.c.e(sVar);
            boolean zBooleanValue9 = ((Boolean) sVar.j(ju.f.f37377k)).booleanValue();
            Object objJ9 = sVar.j(f23628c);
            j3.y0 y0VarA9 = j3.y0.a((j3.y0) sVar.j(ua.f31167a), ((h1.s1) sVar.j(h1.v1.f31180a)).f31036s, jE9, n3.s.H, null, null, 0L, null, null, i24, 0, 0L, null, 16744440);
            fr.j3.i(jE9);
            iu.k.m(text, zBooleanValue9, rVar3, objJ9, false, null, y0VarA9, i216, 0, new s0.g(fr.j3.L(jE9 & 1095216660480L, v3.o.c(jE9) * 0.6f), jE9, fr.j3.z(0.25d)), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, (i23 & 14) | ((i23 << 3) & 896) | ((i23 << 15) & 29360128), 7472);
            i21 = i216;
            i22 = i24;
        } else {
            sVar.W();
            rVar3 = rVar2;
            i21 = i16;
            i22 = i18;
        }
        x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fz.e() { // from class: dt.q
                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    a0.r(text, rVar3, i21, i22, (l1.n) obj, l1.t.M(i13 | 1), i14);
                    return qy.b0.f48488a;
                }
            };
        }
    }

    public static final void s(z1.r rVar, l1.n nVar, int i11) {
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1025052983);
        if (sVar.T(i11 & 1, (i11 & 3) != 2)) {
            l1.c3 c3Var = h1.v1.f31180a;
            z1.r rVarH = d0.n.h(rVar, g2.x.c(((h1.s1) sVar.j(c3Var)).f31034q, 0.12f), r0.f.f48733a);
            w2.q0 q0VarD = j0.o.d(z1.c.f58467e, false);
            int iHashCode = Long.hashCode(sVar.T);
            l1.q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarH);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(y2.j.f56917f, q0VarD, sVar);
            l1.t.J(y2.j.f56916e, q1VarL, sVar);
            y2.h hVar = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC, sVar);
            h1.r4.b(se.k.y(R.drawable.ic_user_record_audio_3, sVar, 0), null, j0.e2.d(d2.h.i(z1.o.f58481a, iu.k.p(sVar), 1.0f), 0.6f), g2.x.c(((h1.s1) sVar.j(c3Var)).f31034q, 0.38f), sVar, 48, 0);
            sVar.p(true);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new ch.g(rVar, i11, 2);
        }
    }

    public static final void t(ht.l audioPlayingState, boolean z11, fz.a playSlowAudio, fz.a playNormalAudio, l1.n nVar, int i11) {
        boolean z12;
        kotlin.jvm.internal.m.f(audioPlayingState, "audioPlayingState");
        kotlin.jvm.internal.m.f(playSlowAudio, "playSlowAudio");
        kotlin.jvm.internal.m.f(playNormalAudio, "playNormalAudio");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-86791086);
        int i12 = i11 | (sVar.h(audioPlayingState) ? 4 : 2);
        if ((i11 & 48) == 0) {
            i12 |= sVar.g(z11) ? 32 : 16;
        }
        int i13 = i12 | (sVar.h(playSlowAudio) ? 256 : 128) | (sVar.h(playNormalAudio) ? 2048 : 1024);
        if (sVar.T(i13 & 1, (i13 & 1171) != 1170)) {
            if (z11) {
                sVar.d0(-22726511);
                j0.a2 a2VarA = j0.z1.a(j0.i.f35303a, z1.c.M, sVar, 48);
                int iHashCode = Long.hashCode(sVar.T);
                l1.q1 q1VarL = sVar.l();
                z1.o oVar = z1.o.f58481a;
                z1.r rVarC = z1.a.c(sVar, oVar);
                y2.k.J.getClass();
                y2.i iVar = y2.j.f56913b;
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar);
                } else {
                    sVar.r0();
                }
                l1.t.J(y2.j.f56917f, a2VarA, sVar);
                l1.t.J(y2.j.f56916e, q1VarL, sVar);
                y2.h hVar = y2.j.f56918g;
                if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                    defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                }
                l1.t.J(y2.j.f56915d, rVarC, sVar);
                boolean z13 = audioPlayingState instanceof ht.i;
                l1.c3 c3Var = h1.v1.f31180a;
                long j11 = ((h1.s1) sVar.j(c3Var)).f31017a;
                z1.r rVarE = j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 16, CropImageView.DEFAULT_ASPECT_RATIO, 11);
                boolean z14 = (i13 & 896) == 256;
                Object objQ = sVar.Q();
                l1.g gVar = l1.m.f39353a;
                if (z14 || objQ == gVar) {
                    objQ = new ch.o0(7, playSlowAudio);
                    sVar.o0(objQ);
                }
                b(z13, rVarE, j11, (fz.a) objQ, sVar, 48, 0);
                boolean z15 = audioPlayingState instanceof ht.c;
                long j12 = ((h1.s1) sVar.j(c3Var)).f31017a;
                boolean z16 = (i13 & 7168) == 2048;
                Object objQ2 = sVar.Q();
                if (z16 || objQ2 == gVar) {
                    objQ2 = new ch.o0(8, playNormalAudio);
                    sVar.o0(objQ2);
                }
                a(z15, null, j12, (fz.a) objQ2, sVar, 0, 2);
                sVar.p(true);
                z12 = false;
            } else {
                z12 = false;
                sVar.d0(-53610416);
            }
            sVar.p(z12);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new o(audioPlayingState, z11, playSlowAudio, playNormalAudio, i11, 0);
        }
    }

    public static final void u(z1.r rVar, l1.n nVar, int i11) {
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1664068427);
        int i12 = (sVar.f(rVar) ? 4 : 2) | i11;
        if (sVar.T(i12 & 1, (i12 & 3) != 2)) {
            l1.c3 c3Var = h1.v1.f31180a;
            long j11 = ((h1.s1) sVar.j(c3Var)).f31033p;
            r0.e eVar = r0.f.f48733a;
            z1.r rVarJ = d0.n.j(d0.n.h(rVar, j11, eVar), 1, ((h1.s1) sVar.j(c3Var)).A, eVar);
            w2.q0 q0VarD = j0.o.d(z1.c.f58467e, false);
            int iHashCode = Long.hashCode(sVar.T);
            l1.q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarJ);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(y2.j.f56917f, q0VarD, sVar);
            l1.t.J(y2.j.f56916e, q1VarL, sVar);
            y2.h hVar = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC, sVar);
            d0.n.c(se.k.y(R.drawable.ic_course_option_scroll, sVar, 0), "Scroll down indicator", j0.e2.n(z1.o.f58481a, 32), null, null, CropImageView.DEFAULT_ASPECT_RATIO, new g2.p(((h1.s1) sVar.j(c3Var)).A, 5), sVar, 432, 56);
            sVar.p(true);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new ch.g(rVar, i11, 3);
        }
    }

    public static final z1.r v(z1.r rVar) {
        kotlin.jvm.internal.m.f(rVar, "<this>");
        return j0.e2.b(j0.c.B(rVar, 12, 6), CropImageView.DEFAULT_ASPECT_RATIO, 36, 1);
    }

    public static final String x(String str) {
        kotlin.jvm.internal.m.f(str, "<this>");
        String strD = D(str);
        if (!xt.d.u(((fr.o0) xt.b.c()).f27733a.keyLanguage)) {
            String strNormalize = Normalizer.normalize(strD, Normalizer.Form.NFD);
            kotlin.jvm.internal.m.c(strNormalize);
            Pattern patternCompile = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
            kotlin.jvm.internal.m.e(patternCompile, "compile(...)");
            strD = patternCompile.matcher(strNormalize).replaceAll(BuildConfig.VERSION_NAME);
            kotlin.jvm.internal.m.e(strD, "replaceAll(...)");
        }
        String lowerCase = strD.toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.m.e(lowerCase, "toLowerCase(...)");
        return nv.p.s("[\\p{P}+~$`^=|<>～｀＄＾＋＝｜＜＞￥×…]", "compile(...)", oz.x.q0(oz.q.i1(oz.x.q0(lowerCase, "ç", "c")).toString(), " ", BuildConfig.VERSION_NAME), BuildConfig.VERSION_NAME, "replaceAll(...)");
    }

    public static final j3.y0 y(OptionItemSelectedState optionItemSelectedState, l1.n nVar) {
        long jT;
        kotlin.jvm.internal.m.f(optionItemSelectedState, "optionItemSelectedState");
        int i11 = z.f24406a[optionItemSelectedState.ordinal()];
        if (i11 == 2) {
            l1.s sVar = (l1.s) nVar;
            sVar.d0(-974643239);
            jT = ((h1.s1) sVar.j(h1.v1.f31180a)).f31022d;
            sVar.p(false);
        } else if (i11 == 3) {
            l1.s sVar2 = (l1.s) nVar;
            sVar2.d0(-974649283);
            jT = ob.f.t((h1.s1) sVar2.j(h1.v1.f31180a), sVar2);
            sVar2.p(false);
        } else if (i11 != 4) {
            l1.s sVar3 = (l1.s) nVar;
            sVar3.d0(-974641168);
            jT = ((h1.s1) sVar3.j(h1.v1.f31180a)).f31034q;
            sVar3.p(false);
        } else {
            l1.s sVar4 = (l1.s) nVar;
            sVar4.d0(-974646277);
            jT = ob.f.u((h1.s1) sVar4.j(h1.v1.f31180a), sVar4);
            sVar4.p(false);
        }
        l1.b3 b3VarA = a0.t1.a(jT, null, "textColor", nVar, 384, 10);
        return j3.y0.a(ct.c.b(nVar), ((g2.x) b3VarA.getValue()).f28624a, ct.c.c(nVar), n3.s.H, null, null, 0L, null, null, 3, 0, 0L, null, 16744440);
    }

    public static final boolean z(int i11) {
        return i11 == 10 || i11 == 22 || i11 == 41;
    }

    public static final String D(String input) {
        kotlin.jvm.internal.m.f(input, "input");
        Pattern patternCompile = Pattern.compile("（[^)]*）|\\([^)]*\\)");
        kotlin.jvm.internal.m.e(patternCompile, evRpcb.Qrx);
        String strReplaceAll = patternCompile.matcher(input).replaceAll(BuildConfig.VERSION_NAME);
        kotlin.jvm.internal.m.e(strReplaceAll, "replaceAll(...)");
        return strReplaceAll;
    }

    public static final String w(int i11, String str, boolean z11) {
        String string;
        kotlin.jvm.internal.m.f(str, "<this>");
        String strD = D(str);
        Locale locale = (i11 == 21 || i11 == 60) ? f23627b : Locale.ROOT;
        kotlin.jvm.internal.m.c(locale);
        String lowerCase = strD.toLowerCase(locale);
        kotlin.jvm.internal.m.e(lowerCase, iFLeRCXvYCGdPW.aroGCYAbmSYpc);
        if (z11) {
            String strNormalize = Normalizer.normalize(lowerCase, Normalizer.Form.NFC);
            kotlin.jvm.internal.m.e(strNormalize, "normalize(...)");
            string = oz.q.i1(strNormalize).toString();
        } else {
            if (z(i11)) {
                lowerCase = E(lowerCase);
            } else if (!xt.d.u(i11) && i11 != 61 && i11 != 57 && i11 != 69) {
                String strNormalize2 = Normalizer.normalize(lowerCase, Normalizer.Form.NFD);
                kotlin.jvm.internal.m.c(strNormalize2);
                lowerCase = f23626a.g(strNormalize2);
            }
            string = oz.q.i1(oz.x.q0(lowerCase, "ç", "c")).toString();
        }
        StringBuilder sb2 = new StringBuilder(string.length());
        for (int i12 = 0; i12 < string.length(); i12++) {
            char cCharAt = string.charAt(i12);
            if (!qx.p.s(cCharAt)) {
                if (cCharAt == '\'' || cCharAt == 8217 || cCharAt == 700 || cCharAt == 65287 || cCharAt == 699) {
                    if (i11 == 63 || i11 == 64) {
                        sb2.append('\'');
                    }
                } else if (!A(i11, String.valueOf(cCharAt))) {
                    sb2.append(cCharAt);
                }
            }
        }
        return sb2.toString();
    }
}
