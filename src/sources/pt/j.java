package pt;

import bt.s5;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.lingodeer.data.model.CourseWord;
import com.lingodeer.data.model.PhonemeDetail;
import com.lingodeer.data.model.SyllableDetail;
import com.lingodeer.data.model.SyllablePhonemeResult;
import g2.v0;
import g2.x;
import h1.ua;
import j3.p0;
import j3.y0;
import java.text.Normalizer;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.m;
import l1.n;
import l1.q1;
import l1.s;
import l1.t;
import l1.x1;
import n3.o;
import n3.p;
import oz.q;
import ry.l;
import w2.q0;
import z1.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f47151a = l.m0(new Character[]{772, 769, 780, 768});

    /* JADX WARN: Code duplicated, block: B:171:0x030a  */
    public static final void a(CourseWord word, String middleText, boolean z11, y0 y0Var, r rVar, n nVar, int i11) {
        s sVar;
        boolean z12;
        k kVar;
        SyllablePhonemeResult syllablePhonemeResult;
        List<PhonemeDetail> phonemes;
        List syllables;
        int i12;
        StringBuilder sb2;
        StringBuilder sb3;
        Set set;
        boolean z13;
        int i13;
        x xVar;
        char cCharAt;
        List<PhonemeDetail> phonemes2;
        m.f(word, "word");
        m.f(middleText, "middleText");
        s sVar2 = (s) nVar;
        sVar2.f0(-511631715);
        int i14 = (i11 & 6) == 0 ? (sVar2.h(word) ? 4 : 2) | i11 : i11;
        if ((i11 & 48) == 0) {
            i14 |= sVar2.f(middleText) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i14 |= sVar2.g(z11) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i14 |= sVar2.f(y0Var) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i14 |= sVar2.f(rVar) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        if (sVar2.T(i14 & 1, (i14 & 9363) != 9362)) {
            boolean zF = ((i14 & 896) == 256) | sVar2.f(word) | ((i14 & 112) == 32);
            Object objQ = sVar2.Q();
            if (zF || objQ == l1.m.f39353a) {
                j3.e eVar = new j3.e();
                j3.e eVar2 = new j3.e();
                if (word.getWordType() != 4 || (syllablePhonemeResult = word.getSyllablePhonemeResult()) == null || (phonemes = syllablePhonemeResult.getPhonemes()) == null || !(!phonemes.isEmpty())) {
                    sVar = sVar2;
                    z12 = true;
                    eVar.d(middleText);
                    eVar2.d(middleText);
                    kVar = new k(eVar.j(), eVar2.j());
                } else {
                    SyllablePhonemeResult syllablePhonemeResult2 = word.getSyllablePhonemeResult();
                    List<PhonemeDetail> list = ry.r.f50854a;
                    if (syllablePhonemeResult2 == null || (syllables = syllablePhonemeResult2.getSyllables()) == null) {
                        syllables = list;
                    }
                    SyllablePhonemeResult syllablePhonemeResult3 = word.getSyllablePhonemeResult();
                    if (syllablePhonemeResult3 != null && (phonemes2 = syllablePhonemeResult3.getPhonemes()) != null) {
                        list = phonemes2;
                    }
                    StringBuilder sb4 = eVar.f35683a;
                    StringBuilder sb5 = eVar2.f35683a;
                    if (z11) {
                        String strNormalize = Normalizer.normalize(middleText, Normalizer.Form.NFD);
                        int i15 = 0;
                        int i16 = 0;
                        int i17 = 0;
                        int i18 = 0;
                        while (i18 < strNormalize.length()) {
                            if (strNormalize.charAt(i18) == ' ') {
                                eVar.b(' ');
                                eVar2.b(' ');
                                i18++;
                            } else {
                                StringBuilder sb6 = new StringBuilder();
                                int i19 = i18 + 1;
                                sb6.append(strNormalize.charAt(i18));
                                while (true) {
                                    i12 = i19;
                                    if (i12 >= strNormalize.length()) {
                                        sb2 = sb5;
                                        break;
                                    }
                                    byte type = (byte) Character.getType((int) strNormalize.charAt(i12));
                                    sb2 = sb5;
                                    if (type != 6 && type != 8 && type != 7) {
                                        break;
                                    }
                                    i19 = i12 + 1;
                                    sb6.append(strNormalize.charAt(i12));
                                    sb5 = sb2;
                                }
                                String string = sb6.toString();
                                char cC0 = q.C0(string);
                                String strY0 = q.y0(1, string);
                                String str = strNormalize;
                                int i21 = 0;
                                while (true) {
                                    int length = strY0.length();
                                    sb3 = sb4;
                                    set = f47151a;
                                    if (i21 >= length) {
                                        z13 = false;
                                        break;
                                    } else if (set.contains(Character.valueOf(strY0.charAt(i21)))) {
                                        z13 = true;
                                        break;
                                    } else {
                                        i21++;
                                        sb4 = sb3;
                                    }
                                }
                                int length2 = sb3.length();
                                String strNormalize2 = Normalizer.normalize(string, Normalizer.Form.NFD);
                                m.c(strNormalize2);
                                eVar.d(strNormalize2);
                                SyllableDetail syllableDetail = (SyllableDetail) ry.m.t0(i15, syllables);
                                x xVar2 = syllableDetail != null ? new x(s5.i(syllableDetail.getAccuracyScore())) : null;
                                if (z13 != 0) {
                                    i13 = i15 + 1;
                                }
                                if (xVar2 != null) {
                                    i13 = i15;
                                    eVar.a(new p0(xVar2.f28624a, 0L, (n3.s) null, (o) null, (p) null, (n3.i) null, (String) null, 0L, (u3.a) null, (u3.p) null, (q3.b) null, 0L, (u3.l) null, (v0) null, 65534), length2, sb3.length());
                                } else {
                                    i13 = i15;
                                }
                                int length3 = sb2.length();
                                boolean z14 = z13 && cC0 == 'i';
                                char cC1 = q.C0(string);
                                String strY1 = q.y0(1, string);
                                StringBuilder sb7 = new StringBuilder();
                                boolean z15 = z14;
                                int length4 = strY1.length();
                                int i22 = i13;
                                int i23 = 0;
                                while (i23 < length4) {
                                    int i24 = length4;
                                    char cCharAt2 = strY1.charAt(i23);
                                    String str2 = strY1;
                                    if (!set.contains(Character.valueOf(cCharAt2))) {
                                        sb7.append(cCharAt2);
                                    }
                                    i23++;
                                    length4 = i24;
                                    strY1 = str2;
                                }
                                String string2 = sb7.toString();
                                if (z15 && cC1 == 'i') {
                                    cC1 = 305;
                                }
                                StringBuilder sb8 = new StringBuilder();
                                sb8.append(cC1);
                                for (int i25 = 0; i25 < string2.length(); i25++) {
                                    sb8.append(string2.charAt(i25));
                                }
                                String strNormalize3 = Normalizer.normalize(sb8.toString(), Normalizer.Form.NFC);
                                m.e(strNormalize3, "normalize(...)");
                                eVar2.d(strNormalize3);
                                if (i16 < list.size()) {
                                    PhonemeDetail phonemeDetail = list.get(i16);
                                    String phoneme = phonemeDetail.getPhoneme();
                                    if (strNormalize3.equals("ü")) {
                                        cC0 = 252;
                                    } else if (cC0 == 'i') {
                                        cC0 = 'i';
                                    }
                                    PhonemeDetail phonemeDetail2 = (PhonemeDetail) ry.m.t0(i16 - 1, list);
                                    String phoneme2 = phonemeDetail2 != null ? phonemeDetail2.getPhoneme() : null;
                                    if (i17 < phoneme.length() && (cC0 == phoneme.charAt(i17) || cC0 == (cCharAt = phoneme.charAt(i17)) || (((cC0 == 'u' && cCharAt == 252) || (cC0 == 252 && cCharAt == 'u')) && ry.m.i0(ns.o.L("j", "q", "x", "y"), phoneme2)))) {
                                        xVar = new x(s5.i(phonemeDetail.getAccuracyScore()));
                                        i17++;
                                        if (i17 >= phoneme.length()) {
                                            i16++;
                                            i17 = 0;
                                        }
                                    } else if (phoneme.length() > 0) {
                                        xVar = new x(s5.i(phonemeDetail.getAccuracyScore()));
                                        if ((phoneme.length() - i17) - 1 > 0) {
                                            i17++;
                                        } else {
                                            i16++;
                                            i17 = 0;
                                        }
                                    } else {
                                        xVar = null;
                                    }
                                } else {
                                    xVar = null;
                                }
                                if (xVar != null) {
                                    eVar2.a(new p0(xVar.f28624a, 0L, (n3.s) null, (o) null, (p) null, (n3.i) null, (String) null, 0L, (u3.a) null, (u3.p) null, (q3.b) null, 0L, (u3.l) null, (v0) null, 65534), length3, sb2.length());
                                }
                                sb5 = sb2;
                                i18 = i12;
                                strNormalize = str;
                                sb4 = sb3;
                                sVar2 = sVar2;
                                i15 = i22;
                            }
                        }
                        sVar = sVar2;
                        z12 = true;
                        kVar = new k(eVar.j(), eVar2.j());
                    } else {
                        sVar = sVar2;
                        z12 = true;
                        int length5 = middleText.length();
                        int i26 = 0;
                        for (int i27 = 0; i27 < length5; i27++) {
                            char cCharAt3 = middleText.charAt(i27);
                            if (cCharAt3 == ' ') {
                                eVar.b(' ');
                                eVar2.b(' ');
                            } else {
                                int length6 = sb4.length();
                                eVar.b(cCharAt3);
                                eVar2.b(cCharAt3);
                                SyllableDetail syllableDetail2 = (SyllableDetail) ry.m.t0(i26, syllables);
                                x xVar3 = syllableDetail2 != null ? new x(s5.i(syllableDetail2.getAccuracyScore())) : null;
                                if (xVar3 != null) {
                                    eVar.a(new p0(xVar3.f28624a, 0L, (n3.s) null, (o) null, (p) null, (n3.i) null, (String) null, 0L, (u3.a) null, (u3.p) null, (q3.b) null, 0L, (u3.l) null, (v0) null, 65534), length6, sb4.length());
                                    eVar2.a(new p0(xVar3.f28624a, 0L, (n3.s) null, (o) null, (p) null, (n3.i) null, (String) null, 0L, (u3.a) null, (u3.p) null, (q3.b) null, 0L, (u3.l) null, (v0) null, 65534), length6, sb5.length());
                                }
                                i26++;
                            }
                        }
                        kVar = new k(eVar.j(), eVar2.j());
                    }
                }
                objQ = kVar;
                sVar2 = sVar;
                sVar2.o0(objQ);
            } else {
                i14 = i14;
                z12 = true;
            }
            k kVar2 = (k) objQ;
            j3.h hVar = kVar2.f47152a;
            j3.h hVar2 = kVar2.f47153b;
            q0 q0VarD = j0.o.d(z1.c.f58463a, false);
            int iHashCode = Long.hashCode(sVar2.T);
            q1 q1VarL = sVar2.l();
            r rVarC = z1.a.c(sVar2, rVar);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar);
            } else {
                sVar2.r0();
            }
            t.J(y2.j.f56917f, q0VarD, sVar2);
            t.J(y2.j.f56916e, q1VarL, sVar2);
            y2.h hVar3 = y2.j.f56918g;
            if (sVar2.S || !m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar2, iHashCode, hVar3);
            }
            t.J(y2.j.f56915d, rVarC, sVar2);
            int i28 = (i14 << 12) & 29360128;
            s sVar3 = sVar2;
            ua.c(hVar, null, 0L, 0L, null, 0L, new u3.k(3), 0L, 0, false, 0, 0, null, null, y0Var, sVar3, 0, i28, 130558);
            ua.c(hVar2, null, 0L, 0L, null, 0L, new u3.k(3), 0L, 0, false, 0, 0, null, null, y0Var, sVar3, 0, i28, 130558);
            sVar2 = sVar3;
            sVar2.p(z12);
        } else {
            sVar2.W();
        }
        x1 x1VarT = sVar2.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new at.q(word, middleText, z11, y0Var, rVar, i11);
        }
    }
}
