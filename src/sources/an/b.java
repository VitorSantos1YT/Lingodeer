package an;

import bq.v;
import com.google.android.gms.measurement.zfxB.ypOOxsaJG;
import com.google.zxing.pdf417.decoder.vBn.xTCJ;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.Word;
import com.lingo.lingoskill.object.YinTu;
import com.lingo.lingoskill.object.YouYin;
import com.lingo.lingoskill.object.ZhuoYin;
import com.lingo.lingoskill.ruskill.ui.learn.mr.OCBJEWZHh;
import com.lingodeer.data.env.Env;
import com.tbruyelle.rxpermissions3.BuildConfig;
import dt.Xk.wuoM;
import fz.f;
import gm.h;
import hh.p0;
import hj.d2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.m;
import nv.p;
import oz.q;
import oz.x;
import qp.d3;
import si.e;
import su.Mbl.tcppUUQxZjFdy;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends d3 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f757n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(mp.b bVar, long j11, int i11) {
        super(bVar, j11);
        this.f757n = i11;
    }

    private final boolean v() {
        String str;
        String string;
        int i11;
        ta.a aVar = this.f47886f;
        m.c(aVar);
        ta.a aVar2 = this.f47886f;
        m.c(aVar2);
        String str2 = q.i1(((d2) aVar2).f32482c.getText().toString()).toString();
        m.f(str2, "str");
        String str3 = " ";
        String strQ0 = x.q0(x.q0(p.s("[\\p{P}+~$`^=|<>～｀＄＾＋＝｜＜＞￥×]", "compile(...)", str2, BuildConfig.VERSION_NAME, "replaceAll(...)"), " ", BuildConfig.VERSION_NAME), "v", "ü");
        Iterator<Word> it = r().getSentWords().iterator();
        while (true) {
            int i12 = 1;
            if (!it.hasNext()) {
                boolean z11 = strQ0.length() == 0;
                t(z11);
                return z11;
            }
            Word next = it.next();
            if (next.getWordType() != 1) {
                String word = next.getWord();
                int iB = w4.c.b(1, word, "getWord(...)");
                int i13 = 0;
                boolean z12 = false;
                while (i13 <= iB) {
                    boolean z13 = m.h(word.charAt(!z12 ? i13 : iB), 32) <= 0;
                    if (z12) {
                        if (!z13) {
                            break;
                        }
                        iB--;
                    } else if (z13) {
                        i13++;
                    } else {
                        z12 = true;
                    }
                }
                String strQ1 = x.q0(w4.c.g(word, iB, 1, i13), str3, BuildConfig.VERSION_NAME);
                Env env = this.f47884d;
                if (!env.isSChinese) {
                    String tWord = next.getTWord();
                    int iB2 = w4.c.b(1, tWord, "getTWord(...)");
                    int i14 = 0;
                    boolean z14 = false;
                    while (i14 <= iB2) {
                        boolean z15 = m.h(tWord.charAt(!z14 ? i14 : iB2), 32) <= 0;
                        if (z14) {
                            if (!z15) {
                                i12 = 1;
                                break;
                            }
                            iB2--;
                        } else if (z15) {
                            i14++;
                        } else {
                            i12 = 1;
                            z14 = true;
                        }
                        i12 = 1;
                    }
                    strQ1 = x.q0(w4.c.g(tWord, iB2, i12, i14), str3, BuildConfig.VERSION_NAME);
                }
                String zhuyin = next.getZhuyin();
                int iB3 = w4.c.b(i12, zhuyin, "getZhuyin(...)");
                int i15 = 0;
                boolean z16 = false;
                while (i15 <= iB3) {
                    boolean z17 = m.h(zhuyin.charAt(!z16 ? i15 : iB3), 32) <= 0;
                    if (z16) {
                        if (!z17) {
                            break;
                        }
                        iB3--;
                    } else if (z17) {
                        i15++;
                    } else {
                        z16 = true;
                    }
                }
                String strQ2 = x.q0(w4.c.g(zhuyin, iB3, 1, i15), str3, BuildConfig.VERSION_NAME);
                Matcher matcher = v.f4987a.matcher(v.a(strQ2));
                if (matcher.find()) {
                    StringBuilder sb2 = new StringBuilder();
                    int iEnd = 0;
                    while (true) {
                        sb2.append(strQ2.substring(iEnd, matcher.start()));
                        int iStart = matcher.start();
                        int iEnd2 = matcher.end();
                        sb2.append(matcher.group());
                        String strSubstring = strQ2.substring(iStart, iEnd2);
                        int i16 = 0;
                        while (true) {
                            if (i16 >= strSubstring.length()) {
                                str = str3;
                                i11 = 0;
                                break;
                            }
                            str = str3;
                            int iIndexOf = "āáǎàōóǒòēéěèīíǐìūúǔùǖǘǚǜ".indexOf(strSubstring.charAt(i16));
                            if (iIndexOf != -1) {
                                i11 = (iIndexOf % 4) + 1;
                                break;
                            }
                            i16++;
                            str3 = str;
                        }
                        if (i11 != 0) {
                            sb2.append(Integer.toString(i11));
                        }
                        iEnd = matcher.end();
                        if (!matcher.find(iEnd)) {
                            break;
                        }
                        str3 = str;
                    }
                    sb2.append(strQ2.substring(iEnd));
                    string = sb2.toString();
                } else {
                    str = str3;
                    string = strQ2;
                }
                String strA = v.a(strQ2);
                m.e(strA, "replaceYunmuWithNoneToneAndYuWithV(...)");
                String strQ3 = x.q0(strA, "v", "ü");
                if (x.s0(strQ0, qi.b.a(strQ1), false)) {
                    Pattern patternCompile = Pattern.compile(strQ1);
                    m.e(patternCompile, "compile(...)");
                    strQ0 = patternCompile.matcher(strQ0).replaceFirst(BuildConfig.VERSION_NAME);
                    m.e(strQ0, "replaceFirst(...)");
                } else if (x.s0(strQ0, qi.b.a(strQ2), false)) {
                    Pattern patternCompile2 = Pattern.compile(strQ2);
                    m.e(patternCompile2, "compile(...)");
                    strQ0 = patternCompile2.matcher(strQ0).replaceFirst(BuildConfig.VERSION_NAME);
                    m.e(strQ0, "replaceFirst(...)");
                } else {
                    m.c(string);
                    if (x.s0(strQ0, qi.b.a(string), false)) {
                        Pattern patternCompile3 = Pattern.compile(string);
                        m.e(patternCompile3, "compile(...)");
                        strQ0 = patternCompile3.matcher(strQ0).replaceFirst(BuildConfig.VERSION_NAME);
                        m.e(strQ0, "replaceFirst(...)");
                    } else {
                        if (!x.s0(strQ0, qi.b.a(strQ3), false)) {
                            t(false);
                            LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                            String checkAnswerPrompt = env.checkAnswerPrompt;
                            m.e(checkAnswerPrompt, "checkAnswerPrompt");
                            String strQ4 = x.q0(checkAnswerPrompt, "userSentence%", strQ0);
                            String translations = r().getTranslations();
                            m.e(translations, "getTranslations(...)");
                            String strQ5 = x.q0(strQ4, "translation%", translations);
                            String sentence = r().getSentence();
                            m.e(sentence, "getSentence(...)");
                            x.q0(strQ5, "correctSentence%", sentence);
                            return false;
                        }
                        Pattern patternCompile4 = Pattern.compile(strQ3);
                        m.e(patternCompile4, "compile(...)");
                        strQ0 = patternCompile4.matcher(strQ0).replaceFirst(BuildConfig.VERSION_NAME);
                        m.e(strQ0, "replaceFirst(...)");
                    }
                }
                str3 = str;
            }
        }
    }

    private final boolean w() {
        ta.a aVar = this.f47886f;
        m.c(aVar);
        ta.a aVar2 = this.f47886f;
        m.c(aVar2);
        String str = q.i1(((d2) aVar2).f32482c.getText().toString()).toString();
        m.f(str, "str");
        String strN = p0.n("getDefault(...)", x.q0(p.s("[\\p{P}+~$`^=|<>～｀＄＾＋＝｜＜＞￥×]", "compile(...)", str, BuildConfig.VERSION_NAME, "replaceAll(...)"), " ", BuildConfig.VERSION_NAME), "toLowerCase(...)");
        Iterator<Word> it = r().getSentWords().iterator();
        while (true) {
            int i11 = 1;
            if (!it.hasNext()) {
                boolean z11 = strN.length() == 0;
                t(z11);
                return z11;
            }
            Word next = it.next();
            if (next.getWordType() != 1) {
                String word = next.getWord();
                int iB = w4.c.b(1, word, "getWord(...)");
                int i12 = 0;
                boolean z12 = false;
                while (i12 <= iB) {
                    boolean z13 = m.h(word.charAt(!z12 ? i12 : iB), 32) <= 0;
                    if (z12) {
                        if (!z13) {
                            i11 = 1;
                            break;
                        }
                        iB--;
                    } else if (z13) {
                        i12++;
                    } else {
                        i11 = 1;
                        z12 = true;
                    }
                    i11 = 1;
                }
                String strS = p.s("[\\p{P}+~$`^=|<>～｀＄＾＋＝｜＜＞￥×]", "compile(...)", p0.n("getDefault(...)", x.q0(w4.c.g(word, iB, i11, i12), " ", BuildConfig.VERSION_NAME), "toLowerCase(...)"), BuildConfig.VERSION_NAME, "replaceAll(...)");
                if (!x.s0(strN, strS, false)) {
                    t(false);
                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                    String checkAnswerPrompt = this.f47884d.checkAnswerPrompt;
                    m.e(checkAnswerPrompt, "checkAnswerPrompt");
                    String strQ0 = x.q0(checkAnswerPrompt, "userSentence%", strN);
                    String translations = r().getTranslations();
                    m.e(translations, "getTranslations(...)");
                    String strQ1 = x.q0(strQ0, "translation%", translations);
                    String sentence = r().getSentence();
                    m.e(sentence, "getSentence(...)");
                    x.q0(strQ1, "correctSentence%", sentence);
                    return false;
                }
                Pattern patternCompile = Pattern.compile(strS);
                m.e(patternCompile, "compile(...)");
                strN = patternCompile.matcher(strN).replaceFirst(BuildConfig.VERSION_NAME);
                m.e(strN, "replaceFirst(...)");
            }
        }
    }

    private final boolean x() {
        ta.a aVar = this.f47886f;
        m.c(aVar);
        ta.a aVar2 = this.f47886f;
        m.c(aVar2);
        String str = q.i1(((d2) aVar2).f32482c.getText().toString()).toString();
        m.f(str, "str");
        String strQ0 = x.q0(p.s("[\\p{P}+~$`^=|<>～｀＄＾＋＝｜＜＞￥×]", "compile(...)", str, BuildConfig.VERSION_NAME, "replaceAll(...)"), " ", BuildConfig.VERSION_NAME);
        Locale locale = Locale.getDefault();
        m.e(locale, "getDefault(...)");
        String lowerCase = strQ0.toLowerCase(locale);
        m.e(lowerCase, "toLowerCase(...)");
        String str2 = "ê";
        String str3 = "compile(...)";
        String str4 = "i";
        String str5 = "ç";
        String str6 = "ú";
        String str7 = "c";
        String strQ1 = x.q0(x.q0(x.q0(x.q0(x.q0(x.q0(x.q0(x.q0(x.q0(lowerCase, "á", "a"), "â", "a"), "ã", "a"), "à", "a"), "é", "e"), "ê", "e"), "í", "i"), "ú", "u"), "ç", "c");
        Iterator<Word> it = r().getSentWords().iterator();
        while (true) {
            String str8 = strQ1;
            if (!it.hasNext()) {
                boolean z11 = str8.length() == 0;
                t(z11);
                return z11;
            }
            Word next = it.next();
            str5 = str5;
            if (next.getWordType() != 1) {
                String word = next.getWord();
                String str9 = str7;
                int iB = w4.c.b(1, word, "getWord(...)");
                int i11 = 0;
                boolean z12 = false;
                while (true) {
                    if (i11 > iB) {
                        str2 = str2;
                        str4 = str4;
                        break;
                    }
                    str4 = str4;
                    str2 = str2;
                    boolean z13 = m.h(word.charAt(!z12 ? i11 : iB), 32) <= 0;
                    if (z12) {
                        if (!z13) {
                            break;
                        }
                        iB--;
                    } else if (z13) {
                        i11++;
                    } else {
                        z12 = true;
                    }
                }
                String strQ2 = x.q0(w4.c.g(word, iB, 1, i11), " ", BuildConfig.VERSION_NAME);
                Locale locale2 = Locale.getDefault();
                m.e(locale2, "getDefault(...)");
                String lowerCase2 = strQ2.toLowerCase(locale2);
                m.e(lowerCase2, "toLowerCase(...)");
                String str10 = str6;
                String str11 = str3;
                String strS = p.s("[\\p{P}+~$`^=|<>～｀＄＾＋＝｜＜＞￥×]", str11, x.q0(x.q0(x.q0(x.q0(x.q0(x.q0(x.q0(x.q0(x.q0(lowerCase2, "á", "a"), "â", "a"), "ã", "a"), "à", "a"), "é", "e"), str2, "e"), "í", str4), str10, "u"), str5, str9), BuildConfig.VERSION_NAME, "replaceAll(...)");
                if (!x.s0(str8, strS, false)) {
                    t(false);
                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                    String checkAnswerPrompt = this.f47884d.checkAnswerPrompt;
                    m.e(checkAnswerPrompt, "checkAnswerPrompt");
                    String strQ3 = x.q0(checkAnswerPrompt, "userSentence%", str8);
                    String translations = r().getTranslations();
                    m.e(translations, "getTranslations(...)");
                    String strQ4 = x.q0(strQ3, "translation%", translations);
                    String sentence = r().getSentence();
                    m.e(sentence, "getSentence(...)");
                    x.q0(strQ4, "correctSentence%", sentence);
                    return false;
                }
                Pattern patternCompile = Pattern.compile(strS);
                m.e(patternCompile, str11);
                strQ1 = patternCompile.matcher(str8).replaceFirst(BuildConfig.VERSION_NAME);
                m.e(strQ1, "replaceFirst(...)");
                str3 = str11;
                str6 = str10;
                str7 = str9;
                str4 = str4;
            } else {
                str2 = str2;
                strQ1 = str8;
            }
            str2 = str2;
        }
    }

    public static String y(String str) {
        Object objValueOf;
        String str2 = q.i1(str).toString();
        m.f(str2, "str");
        String strN = p0.n("getDefault(...)", x.q0(p.s("[\\p{P}+~$`^=|<>～｀＄＾＋＝｜＜＞￥×]", "compile(...)", str2, BuildConfig.VERSION_NAME, "replaceAll(...)"), " ", BuildConfig.VERSION_NAME), "toLowerCase(...)");
        ArrayList arrayList = new ArrayList(strN.length());
        for (int i11 = 0; i11 < strN.length(); i11++) {
            char cCharAt = strN.charAt(i11);
            if (q.W0("á à ả ã ạ ă ắ ằ ẳ ẵ ặ â ấ ầ ẩ ẫ ậ", new String[]{" "}, 0, 6).contains(String.valueOf(cCharAt))) {
                objValueOf = "a";
            } else if ("đ".equals(String.valueOf(cCharAt))) {
                objValueOf = "d";
            } else if (q.W0("é è ẻ ẽ ẹ ê ế ề ể ễ ệ", new String[]{" "}, 0, 6).contains(String.valueOf(cCharAt))) {
                objValueOf = "e";
            } else if (q.W0("í ì ỉ ĩ ị", new String[]{" "}, 0, 6).contains(String.valueOf(cCharAt))) {
                objValueOf = "i";
            } else if (q.W0("ó ò ỏ õ ọ ô ố ồ ổ ỗ ộ ơ ớ ờ ở ỡ ợ", new String[]{" "}, 0, 6).contains(String.valueOf(cCharAt))) {
                objValueOf = "o";
            } else if (q.W0("ú ù ủ ũ ụ ư ứ ừ ử ữ ự", new String[]{" "}, 0, 6).contains(String.valueOf(cCharAt))) {
                objValueOf = "u";
            } else {
                objValueOf = q.W0("ý ỳ ỷ ỹ ỵ", new String[]{" "}, 0, 6).contains(String.valueOf(cCharAt)) ? "y" : Character.valueOf(cCharAt);
            }
            arrayList.add(objValueOf);
        }
        return x.q0(ry.m.y0(arrayList, BuildConfig.VERSION_NAME, null, null, null, 62), "an-na", "anna");
    }

    /* JADX WARN: Code duplicated, block: B:156:0x0626 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:157:0x0628  */
    /* JADX WARN: Code duplicated, block: B:158:0x062a  */
    /* JADX WARN: Code duplicated, block: B:161:0x0637  */
    /* JADX WARN: Code duplicated, block: B:162:0x0639  */
    /* JADX WARN: Code duplicated, block: B:169:0x0647  */
    /* JADX WARN: Code duplicated, block: B:172:0x0671  */
    /* JADX WARN: Code duplicated, block: B:177:0x068f  */
    /* JADX WARN: Code duplicated, block: B:181:0x0696 A[Catch: all -> 0x06a3, TRY_LEAVE, TryCatch #1 {, blocks: (B:179:0x0692, B:181:0x0696), top: B:565:0x0692 }] */
    /* JADX WARN: Code duplicated, block: B:192:0x06c9  */
    /* JADX WARN: Code duplicated, block: B:195:0x06e1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:196:0x06e3  */
    /* JADX WARN: Code duplicated, block: B:197:0x06e5  */
    /* JADX WARN: Code duplicated, block: B:200:0x06f4  */
    /* JADX WARN: Code duplicated, block: B:201:0x06f6  */
    /* JADX WARN: Code duplicated, block: B:203:0x06f9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:209:0x070d  */
    /* JADX WARN: Code duplicated, block: B:214:0x073b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:215:0x073d  */
    /* JADX WARN: Code duplicated, block: B:216:0x073f  */
    /* JADX WARN: Code duplicated, block: B:219:0x074e  */
    /* JADX WARN: Code duplicated, block: B:220:0x0750  */
    /* JADX WARN: Code duplicated, block: B:222:0x0753 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:228:0x0766  */
    /* JADX WARN: Code duplicated, block: B:234:0x07a6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:235:0x07a8  */
    /* JADX WARN: Code duplicated, block: B:236:0x07aa  */
    /* JADX WARN: Code duplicated, block: B:239:0x07b7  */
    /* JADX WARN: Code duplicated, block: B:240:0x07b9  */
    /* JADX WARN: Code duplicated, block: B:247:0x07c7  */
    /* JADX WARN: Code duplicated, block: B:250:0x07e6 A[LOOP:11: B:190:0x06c3->B:250:0x07e6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:253:0x07fc  */
    /* JADX WARN: Code duplicated, block: B:257:0x0803 A[Catch: all -> 0x0810, TRY_LEAVE, TryCatch #0 {, blocks: (B:255:0x07ff, B:257:0x0803), top: B:563:0x07ff }] */
    /* JADX WARN: Code duplicated, block: B:268:0x0836  */
    /* JADX WARN: Code duplicated, block: B:270:0x084b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:271:0x084d  */
    /* JADX WARN: Code duplicated, block: B:272:0x084f  */
    /* JADX WARN: Code duplicated, block: B:275:0x085c  */
    /* JADX WARN: Code duplicated, block: B:276:0x085e  */
    /* JADX WARN: Code duplicated, block: B:283:0x086c  */
    /* JADX WARN: Code duplicated, block: B:286:0x0896 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:287:0x0898  */
    /* JADX WARN: Code duplicated, block: B:288:0x089a  */
    /* JADX WARN: Code duplicated, block: B:291:0x08a7  */
    /* JADX WARN: Code duplicated, block: B:292:0x08a9  */
    /* JADX WARN: Code duplicated, block: B:299:0x08b7  */
    /* JADX WARN: Code duplicated, block: B:304:0x08f4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:305:0x08f6  */
    /* JADX WARN: Code duplicated, block: B:306:0x08f8  */
    /* JADX WARN: Code duplicated, block: B:309:0x0905  */
    /* JADX WARN: Code duplicated, block: B:310:0x0907  */
    /* JADX WARN: Code duplicated, block: B:317:0x0915  */
    /* JADX WARN: Code duplicated, block: B:321:0x0930  */
    /* JADX WARN: Code duplicated, block: B:325:0x0937 A[Catch: all -> 0x0944, TRY_LEAVE, TryCatch #2 {, blocks: (B:323:0x0933, B:325:0x0937), top: B:567:0x0933 }] */
    /* JADX WARN: Code duplicated, block: B:336:0x096a  */
    /* JADX WARN: Code duplicated, block: B:338:0x097f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:339:0x0981  */
    /* JADX WARN: Code duplicated, block: B:340:0x0983  */
    /* JADX WARN: Code duplicated, block: B:343:0x0990  */
    /* JADX WARN: Code duplicated, block: B:344:0x0992  */
    /* JADX WARN: Code duplicated, block: B:351:0x09a0  */
    /* JADX WARN: Code duplicated, block: B:354:0x09c9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:355:0x09cb  */
    /* JADX WARN: Code duplicated, block: B:356:0x09cd  */
    /* JADX WARN: Code duplicated, block: B:359:0x09da  */
    /* JADX WARN: Code duplicated, block: B:360:0x09dc  */
    /* JADX WARN: Code duplicated, block: B:367:0x09ea  */
    /* JADX WARN: Code duplicated, block: B:372:0x0a27 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:373:0x0a29  */
    /* JADX WARN: Code duplicated, block: B:374:0x0a2b  */
    /* JADX WARN: Code duplicated, block: B:377:0x0a38  */
    /* JADX WARN: Code duplicated, block: B:378:0x0a3a  */
    /* JADX WARN: Code duplicated, block: B:385:0x0a48  */
    /* JADX WARN: Code duplicated, block: B:389:0x0a74 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:390:0x0a76  */
    /* JADX WARN: Code duplicated, block: B:391:0x0a78  */
    /* JADX WARN: Code duplicated, block: B:394:0x0a85  */
    /* JADX WARN: Code duplicated, block: B:395:0x0a87  */
    /* JADX WARN: Code duplicated, block: B:402:0x0a95  */
    /* JADX WARN: Code duplicated, block: B:405:0x0ad1  */
    /* JADX WARN: Code duplicated, block: B:407:0x0af8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:408:0x0afa  */
    /* JADX WARN: Code duplicated, block: B:409:0x0afc  */
    /* JADX WARN: Code duplicated, block: B:412:0x0b09  */
    /* JADX WARN: Code duplicated, block: B:413:0x0b0b  */
    /* JADX WARN: Code duplicated, block: B:420:0x0b19  */
    /* JADX WARN: Code duplicated, block: B:423:0x0b6c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:424:0x0b6e  */
    /* JADX WARN: Code duplicated, block: B:425:0x0b70  */
    /* JADX WARN: Code duplicated, block: B:428:0x0b7d  */
    /* JADX WARN: Code duplicated, block: B:429:0x0b7f  */
    /* JADX WARN: Code duplicated, block: B:436:0x0b8d  */
    /* JADX WARN: Code duplicated, block: B:438:0x0bb8  */
    /* JADX WARN: Code duplicated, block: B:440:0x0bc7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:441:0x0bc9  */
    /* JADX WARN: Code duplicated, block: B:442:0x0bcb  */
    /* JADX WARN: Code duplicated, block: B:445:0x0bd8  */
    /* JADX WARN: Code duplicated, block: B:446:0x0bda  */
    /* JADX WARN: Code duplicated, block: B:453:0x0be8  */
    /* JADX WARN: Code duplicated, block: B:457:0x0c16  */
    /* JADX WARN: Code duplicated, block: B:458:0x0c30  */
    /* JADX WARN: Code duplicated, block: B:460:0x0c3b  */
    /* JADX WARN: Code duplicated, block: B:461:0x0c55  */
    /* JADX WARN: Code duplicated, block: B:463:0x0c69  */
    /* JADX WARN: Code duplicated, block: B:464:0x0c8b  */
    /* JADX WARN: Code duplicated, block: B:466:0x0c96  */
    /* JADX WARN: Code duplicated, block: B:467:0x0caf  */
    /* JADX WARN: Code duplicated, block: B:469:0x0cba  */
    /* JADX WARN: Code duplicated, block: B:534:0x0eda A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:535:0x0edc  */
    /* JADX WARN: Code duplicated, block: B:536:0x0ede  */
    /* JADX WARN: Code duplicated, block: B:539:0x0eeb  */
    /* JADX WARN: Code duplicated, block: B:540:0x0eed  */
    /* JADX WARN: Code duplicated, block: B:547:0x0efb  */
    /* JADX WARN: Code duplicated, block: B:554:0x0f32  */
    /* JADX WARN: Code duplicated, block: B:563:0x07ff A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:565:0x0692 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:567:0x0933 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:619:0x0cd6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:633:0x0643 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:634:0x0640 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:636:0x063e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:637:0x063c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:638:0x0645 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:644:0x068b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:645:0x0685 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:649:0x0781 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:650:0x07f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:651:0x0710 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:652:0x0709 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:653:0x0702 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:654:0x06fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:655:0x070b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:659:0x0769 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:660:0x0762 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:661:0x075b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:662:0x0764 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:663:0x0755 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:667:0x07c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:668:0x07c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:670:0x07be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:671:0x07bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:672:0x07c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:677:0x092c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:678:0x08cf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:679:? A[LOOP:15: B:266:0x0830->B:679:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:680:0x0868 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:681:0x0865 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:683:0x0863 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:684:0x0861 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:685:0x086a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:690:0x08b3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:691:0x08b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:693:0x08ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:694:0x08ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:695:0x08b5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:700:0x0911 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:701:0x090e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:703:0x090c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:704:0x090a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:705:0x0913 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:711:0x0a02 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:712:? A[LOOP:19: B:334:0x0964->B:712:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:714:0x099c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:715:0x0999 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:716:0x0997 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:717:0x0995 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:718:0x099e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:724:0x09e6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:725:0x09e3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:726:0x09e1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:727:0x09df A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:728:0x09e8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:734:0x0a44 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:735:0x0a41 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:736:0x0a3f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:737:0x0a3d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:738:0x0a46 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:744:0x0a91 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:745:0x0a8e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:746:0x0a8c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:747:0x0a93 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:748:0x0a8a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:754:0x0b15 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:755:0x0b12 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:756:0x0b10 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:757:0x0b17 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:758:0x0b0e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:764:0x0b89 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:765:0x0b86 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:766:0x0b84 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:767:0x0b8b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:768:0x0b82 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:773:0x0be1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:775:0x0be4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:776:0x0bdf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:777:0x0be6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:778:0x0bdd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:799:0x0f28 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:800:0x0f14 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:801:0x0f46 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:818:0x0ef7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:819:0x0ef4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:820:0x0ef2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:821:0x0ef9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:822:0x0ef0 A[SYNTHETIC] */
    @Override // hi.a
    public final boolean a() {
        String strQ0;
        String zhuyin;
        int iB;
        int i11;
        boolean z11;
        String strQ1;
        int i12;
        boolean z12;
        String lowerCase;
        String zhuyin2;
        int length;
        int i13;
        boolean z13;
        String lowerCase2;
        ArrayList arrayListD;
        StringBuilder sb2;
        int size;
        int i14;
        String str;
        String str2;
        String string;
        int iB2;
        int i15;
        boolean z14;
        StringBuilder sb3;
        String Luoma;
        String luoma;
        int iB3;
        int i16;
        boolean z15;
        String lowerCase3;
        String lowerCase4;
        int i17;
        boolean z16;
        String string2;
        String str3;
        int length2;
        int i18;
        boolean z17;
        String str4;
        int length3;
        int i19;
        boolean z18;
        int i21;
        boolean z19;
        int i22;
        boolean z20;
        int i23;
        boolean z21;
        Word word;
        Iterator it;
        Iterator it2;
        String word2;
        int iB4;
        int i24;
        boolean z22;
        String strG;
        String strQ2;
        int length4;
        int i25;
        boolean z23;
        String lowerCase5;
        String strQ3;
        int length5;
        int i26;
        boolean z24;
        int i27;
        boolean z25;
        int i28;
        boolean z26;
        int i29;
        boolean z27;
        ZhuoYin zhuoYin;
        String word3;
        int iB5;
        int i30;
        boolean z28;
        String strG2;
        String strQ4;
        int length6;
        int i31;
        boolean z29;
        String lowerCase6;
        String strQ5;
        int length7;
        int i32;
        boolean z30;
        int i33;
        boolean z31;
        int i34;
        boolean z32;
        int i35;
        boolean z33;
        YinTu yinTu;
        String word4;
        int iB6;
        int i36;
        boolean z34;
        String strG3;
        String strQ6;
        int length8;
        int i37;
        boolean z35;
        String lowerCase7;
        String strQ7;
        int length9;
        int i38;
        boolean z36;
        int i39;
        boolean z37;
        int i40;
        boolean z38;
        int i41;
        boolean z39;
        int i42;
        boolean z40;
        String str5;
        String str6;
        switch (this.f757n) {
            case 0:
                ta.a aVar = this.f47886f;
                m.c(aVar);
                ta.a aVar2 = this.f47886f;
                m.c(aVar2);
                String str7 = q.i1(((d2) aVar2).f32482c.getText().toString()).toString();
                m.f(str7, "str");
                String strQ8 = x.q0(p.s("[\\p{P}+~$`^=|<>～｀＄＾＋＝｜＜＞￥×]", "compile(...)", str7, BuildConfig.VERSION_NAME, "replaceAll(...)"), " ", BuildConfig.VERSION_NAME);
                for (Word word5 : r().getSentWords()) {
                    if (word5.getWordType() != 1) {
                        String word6 = word5.getWord();
                        int iB7 = w4.c.b(1, word6, "getWord(...)");
                        int i43 = 0;
                        boolean z41 = false;
                        while (i43 <= iB7) {
                            boolean z42 = m.h(word6.charAt(!z41 ? i43 : iB7), 32) <= 0;
                            if (z41) {
                                if (z42) {
                                    iB7--;
                                } else {
                                    strQ0 = x.q0(w4.c.g(word6, iB7, 1, i43), " ", BuildConfig.VERSION_NAME);
                                    zhuyin = word5.getZhuyin();
                                    iB = w4.c.b(1, zhuyin, "getZhuyin(...)");
                                    i11 = 0;
                                    z11 = false;
                                    while (i11 <= iB) {
                                        if (z11) {
                                            i12 = iB;
                                        } else {
                                            i12 = i11;
                                        }
                                        if (m.h(zhuyin.charAt(i12), 32) <= 0) {
                                            z12 = true;
                                        } else {
                                            z12 = false;
                                        }
                                        if (z11) {
                                            if (z12) {
                                                iB--;
                                            } else {
                                                strQ1 = x.q0(w4.c.g(zhuyin, iB, 1, i11), " ", BuildConfig.VERSION_NAME);
                                                if (x.s0(strQ8, p.s("[\\p{P}+~$`^=|<>～｀＄＾＋＝｜＜＞￥×]", "compile(...)", strQ0, BuildConfig.VERSION_NAME, "replaceAll(...)"), false)) {
                                                    Pattern patternCompile = Pattern.compile(strQ0);
                                                    m.e(patternCompile, "compile(...)");
                                                    strQ8 = patternCompile.matcher(strQ8).replaceFirst(BuildConfig.VERSION_NAME);
                                                    m.e(strQ8, "replaceFirst(...)");
                                                } else {
                                                    if (x.s0(strQ8, p.s("[\\p{P}+~$`^=|<>～｀＄＾＋＝｜＜＞￥×]", "compile(...)", strQ1, BuildConfig.VERSION_NAME, "replaceAll(...)"), false)) {
                                                        t(false);
                                                        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                                                        String checkAnswerPrompt = this.f47884d.checkAnswerPrompt;
                                                        m.e(checkAnswerPrompt, "checkAnswerPrompt");
                                                        String strQ9 = x.q0(checkAnswerPrompt, "userSentence%", strQ8);
                                                        String translations = r().getTranslations();
                                                        m.e(translations, "getTranslations(...)");
                                                        String strQ10 = x.q0(strQ9, "translation%", translations);
                                                        String sentence = r().getSentence();
                                                        m.e(sentence, "getSentence(...)");
                                                        x.q0(strQ10, "correctSentence%", sentence);
                                                        return false;
                                                    }
                                                    Pattern patternCompile2 = Pattern.compile(strQ1);
                                                    m.e(patternCompile2, "compile(...)");
                                                    strQ8 = patternCompile2.matcher(strQ8).replaceFirst(BuildConfig.VERSION_NAME);
                                                    m.e(strQ8, "replaceFirst(...)");
                                                }
                                            }
                                        } else if (z12) {
                                            i11++;
                                        } else {
                                            z11 = true;
                                        }
                                    }
                                    strQ1 = x.q0(w4.c.g(zhuyin, iB, 1, i11), " ", BuildConfig.VERSION_NAME);
                                    if (x.s0(strQ8, p.s("[\\p{P}+~$`^=|<>～｀＄＾＋＝｜＜＞￥×]", "compile(...)", strQ0, BuildConfig.VERSION_NAME, "replaceAll(...)"), false)) {
                                        Pattern patternCompile3 = Pattern.compile(strQ0);
                                        m.e(patternCompile3, "compile(...)");
                                        strQ8 = patternCompile3.matcher(strQ8).replaceFirst(BuildConfig.VERSION_NAME);
                                        m.e(strQ8, "replaceFirst(...)");
                                    } else {
                                        if (x.s0(strQ8, p.s("[\\p{P}+~$`^=|<>～｀＄＾＋＝｜＜＞￥×]", "compile(...)", strQ1, BuildConfig.VERSION_NAME, "replaceAll(...)"), false)) {
                                            t(false);
                                            LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                                            String checkAnswerPrompt2 = this.f47884d.checkAnswerPrompt;
                                            m.e(checkAnswerPrompt2, "checkAnswerPrompt");
                                            String strQ11 = x.q0(checkAnswerPrompt2, "userSentence%", strQ8);
                                            String translations2 = r().getTranslations();
                                            m.e(translations2, "getTranslations(...)");
                                            String strQ12 = x.q0(strQ11, "translation%", translations2);
                                            String sentence2 = r().getSentence();
                                            m.e(sentence2, "getSentence(...)");
                                            x.q0(strQ12, "correctSentence%", sentence2);
                                            return false;
                                        }
                                        Pattern patternCompile4 = Pattern.compile(strQ1);
                                        m.e(patternCompile4, "compile(...)");
                                        strQ8 = patternCompile4.matcher(strQ8).replaceFirst(BuildConfig.VERSION_NAME);
                                        m.e(strQ8, "replaceFirst(...)");
                                    }
                                }
                            } else if (z42) {
                                i43++;
                            } else {
                                z41 = true;
                            }
                        }
                        strQ0 = x.q0(w4.c.g(word6, iB7, 1, i43), " ", BuildConfig.VERSION_NAME);
                        zhuyin = word5.getZhuyin();
                        iB = w4.c.b(1, zhuyin, "getZhuyin(...)");
                        i11 = 0;
                        z11 = false;
                        while (i11 <= iB) {
                            if (z11) {
                                i12 = i11;
                            } else {
                                i12 = iB;
                            }
                            if (m.h(zhuyin.charAt(i12), 32) <= 0) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (z11) {
                                if (z12) {
                                    z11 = true;
                                } else {
                                    i11++;
                                }
                            } else if (z12) {
                                strQ1 = x.q0(w4.c.g(zhuyin, iB, 1, i11), " ", BuildConfig.VERSION_NAME);
                                if (x.s0(strQ8, p.s("[\\p{P}+~$`^=|<>～｀＄＾＋＝｜＜＞￥×]", "compile(...)", strQ0, BuildConfig.VERSION_NAME, "replaceAll(...)"), false)) {
                                    Pattern patternCompile5 = Pattern.compile(strQ0);
                                    m.e(patternCompile5, "compile(...)");
                                    strQ8 = patternCompile5.matcher(strQ8).replaceFirst(BuildConfig.VERSION_NAME);
                                    m.e(strQ8, "replaceFirst(...)");
                                } else {
                                    if (x.s0(strQ8, p.s("[\\p{P}+~$`^=|<>～｀＄＾＋＝｜＜＞￥×]", "compile(...)", strQ1, BuildConfig.VERSION_NAME, "replaceAll(...)"), false)) {
                                        t(false);
                                        LingoSkillApplication lingoSkillApplication3 = LingoSkillApplication.f21665b;
                                        String checkAnswerPrompt3 = this.f47884d.checkAnswerPrompt;
                                        m.e(checkAnswerPrompt3, "checkAnswerPrompt");
                                        String strQ13 = x.q0(checkAnswerPrompt3, "userSentence%", strQ8);
                                        String translations3 = r().getTranslations();
                                        m.e(translations3, "getTranslations(...)");
                                        String strQ14 = x.q0(strQ13, "translation%", translations3);
                                        String sentence3 = r().getSentence();
                                        m.e(sentence3, "getSentence(...)");
                                        x.q0(strQ14, "correctSentence%", sentence3);
                                        return false;
                                    }
                                    Pattern patternCompile6 = Pattern.compile(strQ1);
                                    m.e(patternCompile6, "compile(...)");
                                    strQ8 = patternCompile6.matcher(strQ8).replaceFirst(BuildConfig.VERSION_NAME);
                                    m.e(strQ8, "replaceFirst(...)");
                                }
                            } else {
                                iB--;
                            }
                        }
                        strQ1 = x.q0(w4.c.g(zhuyin, iB, 1, i11), " ", BuildConfig.VERSION_NAME);
                        if (x.s0(strQ8, p.s("[\\p{P}+~$`^=|<>～｀＄＾＋＝｜＜＞￥×]", "compile(...)", strQ0, BuildConfig.VERSION_NAME, "replaceAll(...)"), false)) {
                            Pattern patternCompile7 = Pattern.compile(strQ0);
                            m.e(patternCompile7, "compile(...)");
                            strQ8 = patternCompile7.matcher(strQ8).replaceFirst(BuildConfig.VERSION_NAME);
                            m.e(strQ8, "replaceFirst(...)");
                        } else {
                            if (x.s0(strQ8, p.s("[\\p{P}+~$`^=|<>～｀＄＾＋＝｜＜＞￥×]", "compile(...)", strQ1, BuildConfig.VERSION_NAME, "replaceAll(...)"), false)) {
                                t(false);
                                LingoSkillApplication lingoSkillApplication4 = LingoSkillApplication.f21665b;
                                String checkAnswerPrompt4 = this.f47884d.checkAnswerPrompt;
                                m.e(checkAnswerPrompt4, "checkAnswerPrompt");
                                String strQ15 = x.q0(checkAnswerPrompt4, "userSentence%", strQ8);
                                String translations4 = r().getTranslations();
                                m.e(translations4, "getTranslations(...)");
                                String strQ16 = x.q0(strQ15, "translation%", translations4);
                                String sentence4 = r().getSentence();
                                m.e(sentence4, "getSentence(...)");
                                x.q0(strQ16, "correctSentence%", sentence4);
                                return false;
                            }
                            Pattern patternCompile8 = Pattern.compile(strQ1);
                            m.e(patternCompile8, "compile(...)");
                            strQ8 = patternCompile8.matcher(strQ8).replaceFirst(BuildConfig.VERSION_NAME);
                            m.e(strQ8, "replaceFirst(...)");
                        }
                    }
                }
                boolean z43 = strQ8.length() == 0;
                t(z43);
                return z43;
            case 1:
                ta.a aVar3 = this.f47886f;
                m.c(aVar3);
                ta.a aVar4 = this.f47886f;
                m.c(aVar4);
                String str8 = q.i1(((d2) aVar4).f32482c.getText().toString()).toString();
                m.f(str8, "str");
                String strN = p0.n("getDefault(...)", x.q0(x.q0(p.s("[\\p{P}+~$`^=|<>～｀＄＾＋＝｜＜＞￥×]", "compile(...)", str8, BuildConfig.VERSION_NAME, "replaceAll(...)"), " ", BuildConfig.VERSION_NAME), "́", BuildConfig.VERSION_NAME), "toLowerCase(...)");
                Iterator<Word> it3 = r().getSentWords().iterator();
                while (it3.hasNext()) {
                    Word next = it3.next();
                    if (next.getWordType() != 1) {
                        String word7 = next.getWord();
                        int iB8 = w4.c.b(1, word7, "getWord(...)");
                        int i44 = 0;
                        boolean z44 = false;
                        while (true) {
                            if (i44 <= iB8) {
                                it3 = it3;
                                boolean z45 = m.h(word7.charAt(!z44 ? i44 : iB8), 32) <= 0;
                                if (z44) {
                                    if (z45) {
                                        iB8--;
                                    }
                                } else if (z45) {
                                    i44++;
                                } else {
                                    z44 = true;
                                }
                            } else {
                                it3 = it3;
                            }
                        }
                        String strS = p.s("[\\p{P}+~$`^=|<>～｀＄＾＋＝｜＜＞￥×]", "compile(...)", p0.n("getDefault(...)", x.q0(x.q0(w4.c.g(word7, iB8, 1, i44), " ", BuildConfig.VERSION_NAME), "́", BuildConfig.VERSION_NAME), "toLowerCase(...)"), BuildConfig.VERSION_NAME, "replaceAll(...)");
                        if (!x.s0(strN, strS, false)) {
                            t(false);
                            LingoSkillApplication lingoSkillApplication5 = LingoSkillApplication.f21665b;
                            String checkAnswerPrompt5 = this.f47884d.checkAnswerPrompt;
                            m.e(checkAnswerPrompt5, "checkAnswerPrompt");
                            String strQ17 = x.q0(checkAnswerPrompt5, "userSentence%", strN);
                            String translations5 = r().getTranslations();
                            m.e(translations5, "getTranslations(...)");
                            String strQ18 = x.q0(strQ17, "translation%", translations5);
                            String sentence5 = r().getSentence();
                            m.e(sentence5, "getSentence(...)");
                            x.q0(strQ18, "correctSentence%", sentence5);
                            return false;
                        }
                        Pattern patternCompile9 = Pattern.compile(strS);
                        m.e(patternCompile9, "compile(...)");
                        strN = patternCompile9.matcher(strN).replaceFirst(BuildConfig.VERSION_NAME);
                        m.e(strN, "replaceFirst(...)");
                        it3 = it3;
                    }
                }
                boolean z46 = strN.length() == 0;
                t(z46);
                return z46;
            case 2:
                ta.a aVar5 = this.f47886f;
                m.c(aVar5);
                ta.a aVar6 = this.f47886f;
                m.c(aVar6);
                String str9 = q.i1(((d2) aVar6).f32482c.getText().toString()).toString();
                m.f(str9, "str");
                String lowerCase8 = x.q0(p.s("[\\p{P}+~$`^=|<>～｀＄＾＋＝｜＜＞￥×]", "compile(...)", str9, BuildConfig.VERSION_NAME, "replaceAll(...)"), " ", BuildConfig.VERSION_NAME).toLowerCase(Locale.ROOT);
                m.e(lowerCase8, "toLowerCase(...)");
                Iterator<Word> it4 = r().getSentWords().iterator();
                while (it4.hasNext()) {
                    Word next2 = it4.next();
                    if (next2.getWordType() != 1) {
                        String word8 = next2.getWord();
                        int iB9 = w4.c.b(1, word8, "getWord(...)");
                        int i45 = 0;
                        boolean z47 = false;
                        while (i45 <= iB9) {
                            boolean z48 = m.h(word8.charAt(!z47 ? i45 : iB9), 32) <= 0;
                            if (z47) {
                                if (z48) {
                                    iB9--;
                                } else {
                                    lowerCase = x.q0(w4.c.g(word8, iB9, 1, i45), " ", BuildConfig.VERSION_NAME).toLowerCase(Locale.ROOT);
                                    m.e(lowerCase, "toLowerCase(...)");
                                    zhuyin2 = next2.getZhuyin();
                                    m.e(zhuyin2, "getZhuyin(...)");
                                    length = zhuyin2.length() - 1;
                                    i13 = 0;
                                    z13 = false;
                                    while (i13 <= length) {
                                        if (z13) {
                                            i42 = length;
                                        } else {
                                            i42 = i13;
                                        }
                                        if (m.h(zhuyin2.charAt(i42), 32) <= 0) {
                                            z40 = true;
                                        } else {
                                            z40 = false;
                                        }
                                        if (z13) {
                                            if (z40) {
                                                length--;
                                            } else {
                                                lowerCase2 = x.q0(w4.c.g(zhuyin2, length, 1, i13), " ", BuildConfig.VERSION_NAME).toLowerCase(Locale.ROOT);
                                                m.e(lowerCase2, "toLowerCase(...)");
                                                arrayListD = qi.b.d(next2);
                                                sb2 = new StringBuilder();
                                                size = arrayListD.size();
                                                i14 = 0;
                                                while (i14 < size) {
                                                    Object obj = arrayListD.get(i14);
                                                    i14++;
                                                    word = (Word) obj;
                                                    if (m.a(word.getWord(), "っ")) {
                                                        sb2.append("ッ");
                                                    } else {
                                                        if (dm.a.f23483c == null) {
                                                            synchronized (dm.a.class) {
                                                                if (dm.a.f23483c == null) {
                                                                    LingoSkillApplication lingoSkillApplication6 = LingoSkillApplication.f21665b;
                                                                    m.c(lingoSkillApplication6);
                                                                    dm.a.f23483c = new dm.a(lingoSkillApplication6);
                                                                }
                                                            }
                                                        }
                                                        dm.a aVar7 = dm.a.f23483c;
                                                        m.c(aVar7);
                                                        List listD = aVar7.o().queryBuilder().d();
                                                        m.e(listD, "list(...)");
                                                        it = listD.iterator();
                                                        while (true) {
                                                            if (it.hasNext()) {
                                                                it4 = it4;
                                                                lowerCase = lowerCase;
                                                                lowerCase2 = lowerCase2;
                                                                arrayListD = arrayListD;
                                                                if (dm.a.f23483c == null) {
                                                                    synchronized (dm.a.class) {
                                                                        if (dm.a.f23483c == null) {
                                                                            LingoSkillApplication lingoSkillApplication7 = LingoSkillApplication.f21665b;
                                                                            m.c(lingoSkillApplication7);
                                                                            dm.a.f23483c = new dm.a(lingoSkillApplication7);
                                                                        }
                                                                    }
                                                                }
                                                                dm.a aVar8 = dm.a.f23483c;
                                                                m.c(aVar8);
                                                                List listD2 = aVar8.t().queryBuilder().d();
                                                                m.e(listD2, "list(...)");
                                                                it2 = listD2.iterator();
                                                                while (true) {
                                                                    if (it2.hasNext()) {
                                                                        if (dm.a.f23483c == null) {
                                                                            synchronized (dm.a.class) {
                                                                                if (dm.a.f23483c == null) {
                                                                                    LingoSkillApplication lingoSkillApplication8 = LingoSkillApplication.f21665b;
                                                                                    m.c(lingoSkillApplication8);
                                                                                    dm.a.f23483c = new dm.a(lingoSkillApplication8);
                                                                                }
                                                                            }
                                                                        }
                                                                        dm.a aVar9 = dm.a.f23483c;
                                                                        m.c(aVar9);
                                                                        List<YouYin> listD3 = aVar9.s().queryBuilder().d();
                                                                        m.e(listD3, "list(...)");
                                                                        for (YouYin youYin : listD3) {
                                                                            word2 = word.getWord();
                                                                            iB4 = w4.c.b(1, word2, "getWord(...)");
                                                                            i24 = 0;
                                                                            z22 = false;
                                                                            while (i24 <= iB4) {
                                                                                if (z22) {
                                                                                    i29 = iB4;
                                                                                } else {
                                                                                    i29 = i24;
                                                                                }
                                                                                if (m.h(word2.charAt(i29), 32) <= 0) {
                                                                                    z27 = true;
                                                                                } else {
                                                                                    z27 = false;
                                                                                }
                                                                                if (z22) {
                                                                                    if (z27) {
                                                                                        iB4--;
                                                                                    } else {
                                                                                        strG = w4.c.g(word2, iB4, 1, i24);
                                                                                        String ping = youYin.getPing();
                                                                                        m.e(ping, "getPing(...)");
                                                                                        strQ2 = x.q0(x.q0(ping, "(", BuildConfig.VERSION_NAME), ")", BuildConfig.VERSION_NAME);
                                                                                        length4 = strQ2.length() - 1;
                                                                                        i25 = 0;
                                                                                        z23 = false;
                                                                                        while (i25 <= length4) {
                                                                                            if (z23) {
                                                                                                i28 = length4;
                                                                                            } else {
                                                                                                i28 = i25;
                                                                                            }
                                                                                            if (m.h(strQ2.charAt(i28), 32) <= 0) {
                                                                                                z26 = true;
                                                                                            } else {
                                                                                                z26 = false;
                                                                                            }
                                                                                            if (z23) {
                                                                                                if (z26) {
                                                                                                    length4--;
                                                                                                } else {
                                                                                                    lowerCase5 = w4.c.g(strQ2, length4, 1, i25).toLowerCase(Locale.ROOT);
                                                                                                    m.e(lowerCase5, "toLowerCase(...)");
                                                                                                    if (m.a(strG, lowerCase5)) {
                                                                                                        String pian = youYin.getPian();
                                                                                                        m.e(pian, "getPian(...)");
                                                                                                        strQ3 = x.q0(x.q0(pian, "(", BuildConfig.VERSION_NAME), ")", BuildConfig.VERSION_NAME);
                                                                                                        length5 = strQ3.length() - 1;
                                                                                                        i26 = 0;
                                                                                                        z24 = false;
                                                                                                        while (i26 <= length5) {
                                                                                                            if (z24) {
                                                                                                                i27 = length5;
                                                                                                            } else {
                                                                                                                i27 = i26;
                                                                                                            }
                                                                                                            if (m.h(strQ3.charAt(i27), 32) <= 0) {
                                                                                                                z25 = true;
                                                                                                            } else {
                                                                                                                z25 = false;
                                                                                                            }
                                                                                                            if (z24) {
                                                                                                                if (z25) {
                                                                                                                    length5--;
                                                                                                                } else {
                                                                                                                    String lowerCase9 = w4.c.g(strQ3, length5, 1, i26).toLowerCase(Locale.ROOT);
                                                                                                                    m.e(lowerCase9, "toLowerCase(...)");
                                                                                                                    sb2.append(lowerCase9);
                                                                                                                }
                                                                                                            } else if (z25) {
                                                                                                                i26++;
                                                                                                            } else {
                                                                                                                z24 = true;
                                                                                                            }
                                                                                                        }
                                                                                                        String lowerCase10 = w4.c.g(strQ3, length5, 1, i26).toLowerCase(Locale.ROOT);
                                                                                                        m.e(lowerCase10, "toLowerCase(...)");
                                                                                                        sb2.append(lowerCase10);
                                                                                                    }
                                                                                                }
                                                                                            } else if (z26) {
                                                                                                i25++;
                                                                                            } else {
                                                                                                z23 = true;
                                                                                            }
                                                                                        }
                                                                                        lowerCase5 = w4.c.g(strQ2, length4, 1, i25).toLowerCase(Locale.ROOT);
                                                                                        m.e(lowerCase5, "toLowerCase(...)");
                                                                                        if (m.a(strG, lowerCase5)) {
                                                                                            String pian2 = youYin.getPian();
                                                                                            m.e(pian2, "getPian(...)");
                                                                                            strQ3 = x.q0(x.q0(pian2, "(", BuildConfig.VERSION_NAME), ")", BuildConfig.VERSION_NAME);
                                                                                            length5 = strQ3.length() - 1;
                                                                                            i26 = 0;
                                                                                            z24 = false;
                                                                                            while (i26 <= length5) {
                                                                                                if (z24) {
                                                                                                    i27 = i26;
                                                                                                } else {
                                                                                                    i27 = length5;
                                                                                                }
                                                                                                if (m.h(strQ3.charAt(i27), 32) <= 0) {
                                                                                                    z25 = true;
                                                                                                } else {
                                                                                                    z25 = false;
                                                                                                }
                                                                                                if (z24) {
                                                                                                    if (z25) {
                                                                                                        z24 = true;
                                                                                                    } else {
                                                                                                        i26++;
                                                                                                    }
                                                                                                } else if (z25) {
                                                                                                    String lowerCase11 = w4.c.g(strQ3, length5, 1, i26).toLowerCase(Locale.ROOT);
                                                                                                    m.e(lowerCase11, "toLowerCase(...)");
                                                                                                    sb2.append(lowerCase11);
                                                                                                } else {
                                                                                                    length5--;
                                                                                                }
                                                                                            }
                                                                                            String lowerCase12 = w4.c.g(strQ3, length5, 1, i26).toLowerCase(Locale.ROOT);
                                                                                            m.e(lowerCase12, "toLowerCase(...)");
                                                                                            sb2.append(lowerCase12);
                                                                                        }
                                                                                    }
                                                                                } else if (z27) {
                                                                                    i24++;
                                                                                } else {
                                                                                    z22 = true;
                                                                                }
                                                                            }
                                                                            strG = w4.c.g(word2, iB4, 1, i24);
                                                                            String ping2 = youYin.getPing();
                                                                            m.e(ping2, "getPing(...)");
                                                                            strQ2 = x.q0(x.q0(ping2, "(", BuildConfig.VERSION_NAME), ")", BuildConfig.VERSION_NAME);
                                                                            length4 = strQ2.length() - 1;
                                                                            i25 = 0;
                                                                            z23 = false;
                                                                            while (i25 <= length4) {
                                                                                if (z23) {
                                                                                    i28 = i25;
                                                                                } else {
                                                                                    i28 = length4;
                                                                                }
                                                                                if (m.h(strQ2.charAt(i28), 32) <= 0) {
                                                                                    z26 = true;
                                                                                } else {
                                                                                    z26 = false;
                                                                                }
                                                                                if (z23) {
                                                                                    if (z26) {
                                                                                        z23 = true;
                                                                                    } else {
                                                                                        i25++;
                                                                                    }
                                                                                } else if (z26) {
                                                                                    lowerCase5 = w4.c.g(strQ2, length4, 1, i25).toLowerCase(Locale.ROOT);
                                                                                    m.e(lowerCase5, "toLowerCase(...)");
                                                                                    if (m.a(strG, lowerCase5)) {
                                                                                        String pian3 = youYin.getPian();
                                                                                        m.e(pian3, "getPian(...)");
                                                                                        strQ3 = x.q0(x.q0(pian3, "(", BuildConfig.VERSION_NAME), ")", BuildConfig.VERSION_NAME);
                                                                                        length5 = strQ3.length() - 1;
                                                                                        i26 = 0;
                                                                                        z24 = false;
                                                                                        while (i26 <= length5) {
                                                                                            if (z24) {
                                                                                                i27 = i26;
                                                                                            } else {
                                                                                                i27 = length5;
                                                                                            }
                                                                                            if (m.h(strQ3.charAt(i27), 32) <= 0) {
                                                                                                z25 = true;
                                                                                            } else {
                                                                                                z25 = false;
                                                                                            }
                                                                                            if (z24) {
                                                                                                if (z25) {
                                                                                                    z24 = true;
                                                                                                } else {
                                                                                                    i26++;
                                                                                                }
                                                                                            } else if (z25) {
                                                                                                String lowerCase13 = w4.c.g(strQ3, length5, 1, i26).toLowerCase(Locale.ROOT);
                                                                                                m.e(lowerCase13, "toLowerCase(...)");
                                                                                                sb2.append(lowerCase13);
                                                                                            } else {
                                                                                                length5--;
                                                                                            }
                                                                                        }
                                                                                        String lowerCase14 = w4.c.g(strQ3, length5, 1, i26).toLowerCase(Locale.ROOT);
                                                                                        m.e(lowerCase14, "toLowerCase(...)");
                                                                                        sb2.append(lowerCase14);
                                                                                    }
                                                                                } else {
                                                                                    length4--;
                                                                                }
                                                                            }
                                                                            lowerCase5 = w4.c.g(strQ2, length4, 1, i25).toLowerCase(Locale.ROOT);
                                                                            m.e(lowerCase5, "toLowerCase(...)");
                                                                            if (m.a(strG, lowerCase5)) {
                                                                                String pian4 = youYin.getPian();
                                                                                m.e(pian4, "getPian(...)");
                                                                                strQ3 = x.q0(x.q0(pian4, "(", BuildConfig.VERSION_NAME), ")", BuildConfig.VERSION_NAME);
                                                                                length5 = strQ3.length() - 1;
                                                                                i26 = 0;
                                                                                z24 = false;
                                                                                while (i26 <= length5) {
                                                                                    if (z24) {
                                                                                        i27 = i26;
                                                                                    } else {
                                                                                        i27 = length5;
                                                                                    }
                                                                                    if (m.h(strQ3.charAt(i27), 32) <= 0) {
                                                                                        z25 = true;
                                                                                    } else {
                                                                                        z25 = false;
                                                                                    }
                                                                                    if (z24) {
                                                                                        if (z25) {
                                                                                            z24 = true;
                                                                                        } else {
                                                                                            i26++;
                                                                                        }
                                                                                    } else if (z25) {
                                                                                        String lowerCase15 = w4.c.g(strQ3, length5, 1, i26).toLowerCase(Locale.ROOT);
                                                                                        m.e(lowerCase15, "toLowerCase(...)");
                                                                                        sb2.append(lowerCase15);
                                                                                    } else {
                                                                                        length5--;
                                                                                    }
                                                                                }
                                                                                String lowerCase16 = w4.c.g(strQ3, length5, 1, i26).toLowerCase(Locale.ROOT);
                                                                                m.e(lowerCase16, "toLowerCase(...)");
                                                                                sb2.append(lowerCase16);
                                                                            }
                                                                        }
                                                                        break;
                                                                    } else {
                                                                        zhuoYin = (ZhuoYin) it2.next();
                                                                        word3 = word.getWord();
                                                                        iB5 = w4.c.b(1, word3, "getWord(...)");
                                                                        i30 = 0;
                                                                        z28 = false;
                                                                        while (i30 <= iB5) {
                                                                            if (z28) {
                                                                                i35 = iB5;
                                                                            } else {
                                                                                i35 = i30;
                                                                            }
                                                                            if (m.h(word3.charAt(i35), 32) <= 0) {
                                                                                z33 = true;
                                                                            } else {
                                                                                z33 = false;
                                                                            }
                                                                            if (z28) {
                                                                                if (z33) {
                                                                                    iB5--;
                                                                                } else {
                                                                                    strG2 = w4.c.g(word3, iB5, 1, i30);
                                                                                    String ping3 = zhuoYin.getPing();
                                                                                    m.e(ping3, ypOOxsaJG.hziLDAbZxV);
                                                                                    strQ4 = x.q0(x.q0(ping3, "(", BuildConfig.VERSION_NAME), ")", BuildConfig.VERSION_NAME);
                                                                                    length6 = strQ4.length() - 1;
                                                                                    i31 = 0;
                                                                                    z29 = false;
                                                                                    while (i31 <= length6) {
                                                                                        if (z29) {
                                                                                            i34 = length6;
                                                                                        } else {
                                                                                            i34 = i31;
                                                                                        }
                                                                                        if (m.h(strQ4.charAt(i34), 32) <= 0) {
                                                                                            z32 = true;
                                                                                        } else {
                                                                                            z32 = false;
                                                                                        }
                                                                                        if (z29) {
                                                                                            if (z32) {
                                                                                                length6--;
                                                                                            } else {
                                                                                                lowerCase6 = w4.c.g(strQ4, length6, 1, i31).toLowerCase(Locale.ROOT);
                                                                                                m.e(lowerCase6, "toLowerCase(...)");
                                                                                                if (m.a(strG2, lowerCase6)) {
                                                                                                    String pian5 = zhuoYin.getPian();
                                                                                                    m.e(pian5, "getPian(...)");
                                                                                                    strQ5 = x.q0(x.q0(pian5, "(", BuildConfig.VERSION_NAME), ")", BuildConfig.VERSION_NAME);
                                                                                                    length7 = strQ5.length() - 1;
                                                                                                    i32 = 0;
                                                                                                    z30 = false;
                                                                                                    while (i32 <= length7) {
                                                                                                        if (z30) {
                                                                                                            i33 = length7;
                                                                                                        } else {
                                                                                                            i33 = i32;
                                                                                                        }
                                                                                                        if (m.h(strQ5.charAt(i33), 32) <= 0) {
                                                                                                            z31 = true;
                                                                                                        } else {
                                                                                                            z31 = false;
                                                                                                        }
                                                                                                        if (z30) {
                                                                                                            if (z31) {
                                                                                                                length7--;
                                                                                                            } else {
                                                                                                                String lowerCase17 = w4.c.g(strQ5, length7, 1, i32).toLowerCase(Locale.ROOT);
                                                                                                                m.e(lowerCase17, "toLowerCase(...)");
                                                                                                                sb2.append(lowerCase17);
                                                                                                            }
                                                                                                        } else if (z31) {
                                                                                                            i32++;
                                                                                                        } else {
                                                                                                            z30 = true;
                                                                                                        }
                                                                                                    }
                                                                                                    String lowerCase18 = w4.c.g(strQ5, length7, 1, i32).toLowerCase(Locale.ROOT);
                                                                                                    m.e(lowerCase18, "toLowerCase(...)");
                                                                                                    sb2.append(lowerCase18);
                                                                                                }
                                                                                            }
                                                                                        } else if (z32) {
                                                                                            i31++;
                                                                                        } else {
                                                                                            z29 = true;
                                                                                        }
                                                                                    }
                                                                                    lowerCase6 = w4.c.g(strQ4, length6, 1, i31).toLowerCase(Locale.ROOT);
                                                                                    m.e(lowerCase6, "toLowerCase(...)");
                                                                                    if (m.a(strG2, lowerCase6)) {
                                                                                        String pian6 = zhuoYin.getPian();
                                                                                        m.e(pian6, "getPian(...)");
                                                                                        strQ5 = x.q0(x.q0(pian6, "(", BuildConfig.VERSION_NAME), ")", BuildConfig.VERSION_NAME);
                                                                                        length7 = strQ5.length() - 1;
                                                                                        i32 = 0;
                                                                                        z30 = false;
                                                                                        while (i32 <= length7) {
                                                                                            if (z30) {
                                                                                                i33 = i32;
                                                                                            } else {
                                                                                                i33 = length7;
                                                                                            }
                                                                                            if (m.h(strQ5.charAt(i33), 32) <= 0) {
                                                                                                z31 = true;
                                                                                            } else {
                                                                                                z31 = false;
                                                                                            }
                                                                                            if (z30) {
                                                                                                if (z31) {
                                                                                                    z30 = true;
                                                                                                } else {
                                                                                                    i32++;
                                                                                                }
                                                                                            } else if (z31) {
                                                                                                String lowerCase19 = w4.c.g(strQ5, length7, 1, i32).toLowerCase(Locale.ROOT);
                                                                                                m.e(lowerCase19, "toLowerCase(...)");
                                                                                                sb2.append(lowerCase19);
                                                                                            } else {
                                                                                                length7--;
                                                                                            }
                                                                                        }
                                                                                        String lowerCase110 = w4.c.g(strQ5, length7, 1, i32).toLowerCase(Locale.ROOT);
                                                                                        m.e(lowerCase110, "toLowerCase(...)");
                                                                                        sb2.append(lowerCase110);
                                                                                    }
                                                                                }
                                                                            } else if (z33) {
                                                                                i30++;
                                                                            } else {
                                                                                z28 = true;
                                                                            }
                                                                        }
                                                                        strG2 = w4.c.g(word3, iB5, 1, i30);
                                                                        String ping4 = zhuoYin.getPing();
                                                                        m.e(ping4, ypOOxsaJG.hziLDAbZxV);
                                                                        strQ4 = x.q0(x.q0(ping4, "(", BuildConfig.VERSION_NAME), ")", BuildConfig.VERSION_NAME);
                                                                        length6 = strQ4.length() - 1;
                                                                        i31 = 0;
                                                                        z29 = false;
                                                                        while (i31 <= length6) {
                                                                            if (z29) {
                                                                                i34 = i31;
                                                                            } else {
                                                                                i34 = length6;
                                                                            }
                                                                            if (m.h(strQ4.charAt(i34), 32) <= 0) {
                                                                                z32 = true;
                                                                            } else {
                                                                                z32 = false;
                                                                            }
                                                                            if (z29) {
                                                                                if (z32) {
                                                                                    z29 = true;
                                                                                } else {
                                                                                    i31++;
                                                                                }
                                                                            } else if (z32) {
                                                                                lowerCase6 = w4.c.g(strQ4, length6, 1, i31).toLowerCase(Locale.ROOT);
                                                                                m.e(lowerCase6, "toLowerCase(...)");
                                                                                if (m.a(strG2, lowerCase6)) {
                                                                                    String pian7 = zhuoYin.getPian();
                                                                                    m.e(pian7, "getPian(...)");
                                                                                    strQ5 = x.q0(x.q0(pian7, "(", BuildConfig.VERSION_NAME), ")", BuildConfig.VERSION_NAME);
                                                                                    length7 = strQ5.length() - 1;
                                                                                    i32 = 0;
                                                                                    z30 = false;
                                                                                    while (i32 <= length7) {
                                                                                        if (z30) {
                                                                                            i33 = i32;
                                                                                        } else {
                                                                                            i33 = length7;
                                                                                        }
                                                                                        if (m.h(strQ5.charAt(i33), 32) <= 0) {
                                                                                            z31 = true;
                                                                                        } else {
                                                                                            z31 = false;
                                                                                        }
                                                                                        if (z30) {
                                                                                            if (z31) {
                                                                                                z30 = true;
                                                                                            } else {
                                                                                                i32++;
                                                                                            }
                                                                                        } else if (z31) {
                                                                                            String lowerCase111 = w4.c.g(strQ5, length7, 1, i32).toLowerCase(Locale.ROOT);
                                                                                            m.e(lowerCase111, "toLowerCase(...)");
                                                                                            sb2.append(lowerCase111);
                                                                                        } else {
                                                                                            length7--;
                                                                                        }
                                                                                    }
                                                                                    String lowerCase112 = w4.c.g(strQ5, length7, 1, i32).toLowerCase(Locale.ROOT);
                                                                                    m.e(lowerCase112, "toLowerCase(...)");
                                                                                    sb2.append(lowerCase112);
                                                                                }
                                                                            } else {
                                                                                length6--;
                                                                            }
                                                                        }
                                                                        lowerCase6 = w4.c.g(strQ4, length6, 1, i31).toLowerCase(Locale.ROOT);
                                                                        m.e(lowerCase6, "toLowerCase(...)");
                                                                        if (m.a(strG2, lowerCase6)) {
                                                                            String pian8 = zhuoYin.getPian();
                                                                            m.e(pian8, "getPian(...)");
                                                                            strQ5 = x.q0(x.q0(pian8, "(", BuildConfig.VERSION_NAME), ")", BuildConfig.VERSION_NAME);
                                                                            length7 = strQ5.length() - 1;
                                                                            i32 = 0;
                                                                            z30 = false;
                                                                            while (i32 <= length7) {
                                                                                if (z30) {
                                                                                    i33 = i32;
                                                                                } else {
                                                                                    i33 = length7;
                                                                                }
                                                                                if (m.h(strQ5.charAt(i33), 32) <= 0) {
                                                                                    z31 = true;
                                                                                } else {
                                                                                    z31 = false;
                                                                                }
                                                                                if (z30) {
                                                                                    if (z31) {
                                                                                        z30 = true;
                                                                                    } else {
                                                                                        i32++;
                                                                                    }
                                                                                } else if (z31) {
                                                                                    String lowerCase113 = w4.c.g(strQ5, length7, 1, i32).toLowerCase(Locale.ROOT);
                                                                                    m.e(lowerCase113, "toLowerCase(...)");
                                                                                    sb2.append(lowerCase113);
                                                                                } else {
                                                                                    length7--;
                                                                                }
                                                                            }
                                                                            String lowerCase114 = w4.c.g(strQ5, length7, 1, i32).toLowerCase(Locale.ROOT);
                                                                            m.e(lowerCase114, "toLowerCase(...)");
                                                                            sb2.append(lowerCase114);
                                                                        }
                                                                    }
                                                                }
                                                                break;
                                                            } else {
                                                                yinTu = (YinTu) it.next();
                                                                word4 = word.getWord();
                                                                iB6 = w4.c.b(1, word4, "getWord(...)");
                                                                i36 = 0;
                                                                z34 = false;
                                                                while (true) {
                                                                    it4 = it4;
                                                                    if (i36 <= iB6) {
                                                                        if (z34) {
                                                                            i41 = iB6;
                                                                        } else {
                                                                            i41 = i36;
                                                                        }
                                                                        lowerCase = lowerCase;
                                                                        if (m.h(word4.charAt(i41), 32) <= 0) {
                                                                            z39 = true;
                                                                        } else {
                                                                            z39 = false;
                                                                        }
                                                                        if (z34) {
                                                                            if (!z39) {
                                                                                iB6--;
                                                                            }
                                                                        } else if (z39) {
                                                                            i36++;
                                                                        } else {
                                                                            z34 = true;
                                                                        }
                                                                    } else {
                                                                        lowerCase = lowerCase;
                                                                    }
                                                                }
                                                                strG3 = w4.c.g(word4, iB6, 1, i36);
                                                                String ping5 = yinTu.getPing();
                                                                m.e(ping5, "getPing(...)");
                                                                strQ6 = x.q0(x.q0(ping5, "(", BuildConfig.VERSION_NAME), ")", BuildConfig.VERSION_NAME);
                                                                length8 = strQ6.length() - 1;
                                                                i37 = 0;
                                                                z35 = false;
                                                                while (true) {
                                                                    lowerCase2 = lowerCase2;
                                                                    if (i37 <= length8) {
                                                                        if (z35) {
                                                                            i40 = length8;
                                                                        } else {
                                                                            i40 = i37;
                                                                        }
                                                                        arrayListD = arrayListD;
                                                                        if (m.h(strQ6.charAt(i40), 32) <= 0) {
                                                                            z38 = true;
                                                                        } else {
                                                                            z38 = false;
                                                                        }
                                                                        if (z35) {
                                                                            if (!z38) {
                                                                                length8--;
                                                                            }
                                                                        } else if (z38) {
                                                                            i37++;
                                                                        } else {
                                                                            z35 = true;
                                                                        }
                                                                    } else {
                                                                        arrayListD = arrayListD;
                                                                    }
                                                                }
                                                                lowerCase7 = w4.c.g(strQ6, length8, 1, i37).toLowerCase(Locale.ROOT);
                                                                m.e(lowerCase7, "toLowerCase(...)");
                                                                if (m.a(strG3, lowerCase7)) {
                                                                    String pian9 = yinTu.getPian();
                                                                    m.e(pian9, "getPian(...)");
                                                                    strQ7 = x.q0(x.q0(pian9, "(", BuildConfig.VERSION_NAME), ")", BuildConfig.VERSION_NAME);
                                                                    length9 = strQ7.length() - 1;
                                                                    i38 = 0;
                                                                    z36 = false;
                                                                    while (i38 <= length9) {
                                                                        if (z36) {
                                                                            i39 = length9;
                                                                        } else {
                                                                            i39 = i38;
                                                                        }
                                                                        if (m.h(strQ7.charAt(i39), 32) <= 0) {
                                                                            z37 = true;
                                                                        } else {
                                                                            z37 = false;
                                                                        }
                                                                        if (z36) {
                                                                            if (z37) {
                                                                                length9--;
                                                                            } else {
                                                                                String lowerCase20 = w4.c.g(strQ7, length9, 1, i38).toLowerCase(Locale.ROOT);
                                                                                m.e(lowerCase20, "toLowerCase(...)");
                                                                                sb2.append(lowerCase20);
                                                                            }
                                                                        } else if (z37) {
                                                                            i38++;
                                                                        } else {
                                                                            z36 = true;
                                                                        }
                                                                    }
                                                                    String lowerCase21 = w4.c.g(strQ7, length9, 1, i38).toLowerCase(Locale.ROOT);
                                                                    m.e(lowerCase21, "toLowerCase(...)");
                                                                    sb2.append(lowerCase21);
                                                                } else {
                                                                    lowerCase2 = lowerCase2;
                                                                    it4 = it4;
                                                                    lowerCase = lowerCase;
                                                                    arrayListD = arrayListD;
                                                                }
                                                            }
                                                        }
                                                        lowerCase2 = lowerCase2;
                                                        it4 = it4;
                                                        lowerCase = lowerCase;
                                                        arrayListD = arrayListD;
                                                    }
                                                    break;
                                                }
                                                Iterator<Word> it5 = it4;
                                                str = lowerCase;
                                                str2 = lowerCase2;
                                                string = sb2.toString();
                                                iB2 = w4.c.b(1, string, "toString(...)");
                                                i15 = 0;
                                                z14 = false;
                                                while (i15 <= iB2) {
                                                    if (z14) {
                                                        i23 = iB2;
                                                    } else {
                                                        i23 = i15;
                                                    }
                                                    if (m.h(string.charAt(i23), 32) <= 0) {
                                                        z21 = true;
                                                    } else {
                                                        z21 = false;
                                                    }
                                                    if (z14) {
                                                        if (z21) {
                                                            iB2--;
                                                        } else {
                                                            String lowerCase22 = x.q0(w4.c.g(string, iB2, 1, i15), " ", BuildConfig.VERSION_NAME).toLowerCase(Locale.ROOT);
                                                            m.e(lowerCase22, "toLowerCase(...)");
                                                            sb3 = new StringBuilder(lowerCase22);
                                                            Luoma = next2.Luoma;
                                                            m.e(Luoma, "Luoma");
                                                            if (q.W0(Luoma, new String[]{"#"}, 0, 6).toArray(new String[0]).length > 1) {
                                                                String Luoma2 = next2.Luoma;
                                                                m.e(Luoma2, "Luoma");
                                                                str3 = ((String[]) q.W0(Luoma2, new String[]{"#"}, 0, 6).toArray(new String[0]))[0];
                                                                length2 = str3.length() - 1;
                                                                i18 = 0;
                                                                z17 = false;
                                                                while (i18 <= length2) {
                                                                    if (z17) {
                                                                        i22 = length2;
                                                                    } else {
                                                                        i22 = i18;
                                                                    }
                                                                    if (m.h(str3.charAt(i22), 32) <= 0) {
                                                                        z20 = true;
                                                                    } else {
                                                                        z20 = false;
                                                                    }
                                                                    if (z17) {
                                                                        if (z20) {
                                                                            length2--;
                                                                        } else {
                                                                            lowerCase3 = x.q0(x.q0(x.q0(w4.c.g(str3, length2, 1, i18), "_", " "), " ", BuildConfig.VERSION_NAME), "-", BuildConfig.VERSION_NAME).toLowerCase(Locale.ROOT);
                                                                            m.e(lowerCase3, tcppUUQxZjFdy.qvcOg);
                                                                            String Luoma3 = next2.Luoma;
                                                                            m.e(Luoma3, "Luoma");
                                                                            str4 = ((String[]) q.W0(Luoma3, new String[]{"#"}, 0, 6).toArray(new String[0]))[1];
                                                                            length3 = str4.length() - 1;
                                                                            i19 = 0;
                                                                            z18 = false;
                                                                            while (i19 <= length3) {
                                                                                if (z18) {
                                                                                    i21 = length3;
                                                                                } else {
                                                                                    i21 = i19;
                                                                                }
                                                                                if (m.h(str4.charAt(i21), 32) <= 0) {
                                                                                    z19 = true;
                                                                                } else {
                                                                                    z19 = false;
                                                                                }
                                                                                if (z18) {
                                                                                    if (z19) {
                                                                                        length3--;
                                                                                    } else {
                                                                                        lowerCase4 = x.q0(x.q0(x.q0(w4.c.g(str4, length3, 1, i19), "_", " "), " ", BuildConfig.VERSION_NAME), "-", BuildConfig.VERSION_NAME).toLowerCase(Locale.ROOT);
                                                                                        m.e(lowerCase4, "toLowerCase(...)");
                                                                                    }
                                                                                } else if (z19) {
                                                                                    i19++;
                                                                                } else {
                                                                                    z18 = true;
                                                                                }
                                                                            }
                                                                            lowerCase4 = x.q0(x.q0(x.q0(w4.c.g(str4, length3, 1, i19), "_", " "), " ", BuildConfig.VERSION_NAME), "-", BuildConfig.VERSION_NAME).toLowerCase(Locale.ROOT);
                                                                            m.e(lowerCase4, "toLowerCase(...)");
                                                                        }
                                                                    } else if (z20) {
                                                                        i18++;
                                                                    } else {
                                                                        z17 = true;
                                                                    }
                                                                }
                                                                lowerCase3 = x.q0(x.q0(x.q0(w4.c.g(str3, length2, 1, i18), "_", " "), " ", BuildConfig.VERSION_NAME), "-", BuildConfig.VERSION_NAME).toLowerCase(Locale.ROOT);
                                                                m.e(lowerCase3, tcppUUQxZjFdy.qvcOg);
                                                                String Luoma4 = next2.Luoma;
                                                                m.e(Luoma4, "Luoma");
                                                                str4 = ((String[]) q.W0(Luoma4, new String[]{"#"}, 0, 6).toArray(new String[0]))[1];
                                                                length3 = str4.length() - 1;
                                                                i19 = 0;
                                                                z18 = false;
                                                                while (i19 <= length3) {
                                                                    if (z18) {
                                                                        i21 = i19;
                                                                    } else {
                                                                        i21 = length3;
                                                                    }
                                                                    if (m.h(str4.charAt(i21), 32) <= 0) {
                                                                        z19 = true;
                                                                    } else {
                                                                        z19 = false;
                                                                    }
                                                                    if (z18) {
                                                                        if (z19) {
                                                                            z18 = true;
                                                                        } else {
                                                                            i19++;
                                                                        }
                                                                    } else if (z19) {
                                                                        lowerCase4 = x.q0(x.q0(x.q0(w4.c.g(str4, length3, 1, i19), "_", " "), " ", BuildConfig.VERSION_NAME), "-", BuildConfig.VERSION_NAME).toLowerCase(Locale.ROOT);
                                                                        m.e(lowerCase4, "toLowerCase(...)");
                                                                    } else {
                                                                        length3--;
                                                                    }
                                                                }
                                                                lowerCase4 = x.q0(x.q0(x.q0(w4.c.g(str4, length3, 1, i19), "_", " "), " ", BuildConfig.VERSION_NAME), "-", BuildConfig.VERSION_NAME).toLowerCase(Locale.ROOT);
                                                                m.e(lowerCase4, "toLowerCase(...)");
                                                            } else {
                                                                luoma = next2.getLuoma();
                                                                iB3 = w4.c.b(1, luoma, "getLuoma(...)");
                                                                i16 = 0;
                                                                z15 = false;
                                                                while (i16 <= iB3) {
                                                                    if (z15) {
                                                                        i17 = iB3;
                                                                    } else {
                                                                        i17 = i16;
                                                                    }
                                                                    if (m.h(luoma.charAt(i17), 32) <= 0) {
                                                                        z16 = true;
                                                                    } else {
                                                                        z16 = false;
                                                                    }
                                                                    if (z15) {
                                                                        if (z16) {
                                                                            iB3--;
                                                                        } else {
                                                                            lowerCase3 = x.q0(x.q0(w4.c.g(luoma, iB3, 1, i16), " ", BuildConfig.VERSION_NAME), "-", BuildConfig.VERSION_NAME).toLowerCase(Locale.ROOT);
                                                                            m.e(lowerCase3, "toLowerCase(...)");
                                                                            lowerCase4 = lowerCase3;
                                                                        }
                                                                    } else if (z16) {
                                                                        i16++;
                                                                    } else {
                                                                        z15 = true;
                                                                    }
                                                                }
                                                                lowerCase3 = x.q0(x.q0(w4.c.g(luoma, iB3, 1, i16), " ", BuildConfig.VERSION_NAME), "-", BuildConfig.VERSION_NAME).toLowerCase(Locale.ROOT);
                                                                m.e(lowerCase3, "toLowerCase(...)");
                                                                lowerCase4 = lowerCase3;
                                                            }
                                                            if (x.s0(lowerCase8, qi.b.a(str), false)) {
                                                                Pattern patternCompile10 = Pattern.compile(str);
                                                                m.e(patternCompile10, "compile(...)");
                                                                lowerCase8 = patternCompile10.matcher(lowerCase8).replaceFirst(BuildConfig.VERSION_NAME);
                                                                m.e(lowerCase8, "replaceFirst(...)");
                                                            } else if (x.s0(lowerCase8, qi.b.a(str2), false)) {
                                                                Pattern patternCompile11 = Pattern.compile(str2);
                                                                m.e(patternCompile11, "compile(...)");
                                                                lowerCase8 = patternCompile11.matcher(lowerCase8).replaceFirst(BuildConfig.VERSION_NAME);
                                                                m.e(lowerCase8, "replaceFirst(...)");
                                                            } else {
                                                                string2 = sb3.toString();
                                                                m.e(string2, "toString(...)");
                                                                if (x.s0(lowerCase8, qi.b.a(string2), false)) {
                                                                    String string3 = sb3.toString();
                                                                    m.e(string3, "toString(...)");
                                                                    Pattern patternCompile12 = Pattern.compile(string3);
                                                                    m.e(patternCompile12, "compile(...)");
                                                                    lowerCase8 = patternCompile12.matcher(lowerCase8).replaceFirst(BuildConfig.VERSION_NAME);
                                                                    m.e(lowerCase8, "replaceFirst(...)");
                                                                } else if (x.s0(lowerCase8, qi.b.a(lowerCase3), false)) {
                                                                    Pattern patternCompile13 = Pattern.compile(lowerCase3);
                                                                    m.e(patternCompile13, "compile(...)");
                                                                    lowerCase8 = patternCompile13.matcher(lowerCase8).replaceFirst(BuildConfig.VERSION_NAME);
                                                                    m.e(lowerCase8, "replaceFirst(...)");
                                                                } else {
                                                                    if (x.s0(lowerCase8, qi.b.a(lowerCase4), false)) {
                                                                        t(false);
                                                                        LingoSkillApplication lingoSkillApplication9 = LingoSkillApplication.f21665b;
                                                                        String checkAnswerPrompt6 = this.f47884d.checkAnswerPrompt;
                                                                        m.e(checkAnswerPrompt6, "checkAnswerPrompt");
                                                                        String strQ19 = x.q0(checkAnswerPrompt6, "userSentence%", lowerCase8);
                                                                        String translations6 = r().getTranslations();
                                                                        m.e(translations6, "getTranslations(...)");
                                                                        String strQ20 = x.q0(strQ19, "translation%", translations6);
                                                                        String sentence6 = r().getSentence();
                                                                        m.e(sentence6, "getSentence(...)");
                                                                        x.q0(strQ20, "correctSentence%", sentence6);
                                                                        return false;
                                                                    }
                                                                    Pattern patternCompile14 = Pattern.compile(lowerCase4);
                                                                    m.e(patternCompile14, "compile(...)");
                                                                    lowerCase8 = patternCompile14.matcher(lowerCase8).replaceFirst(BuildConfig.VERSION_NAME);
                                                                    m.e(lowerCase8, "replaceFirst(...)");
                                                                }
                                                            }
                                                            it4 = it5;
                                                        }
                                                    } else if (z21) {
                                                        i15++;
                                                    } else {
                                                        z14 = true;
                                                    }
                                                }
                                                String lowerCase23 = x.q0(w4.c.g(string, iB2, 1, i15), " ", BuildConfig.VERSION_NAME).toLowerCase(Locale.ROOT);
                                                m.e(lowerCase23, "toLowerCase(...)");
                                                sb3 = new StringBuilder(lowerCase23);
                                                Luoma = next2.Luoma;
                                                m.e(Luoma, "Luoma");
                                                if (q.W0(Luoma, new String[]{"#"}, 0, 6).toArray(new String[0]).length > 1) {
                                                    String Luoma5 = next2.Luoma;
                                                    m.e(Luoma5, "Luoma");
                                                    str3 = ((String[]) q.W0(Luoma5, new String[]{"#"}, 0, 6).toArray(new String[0]))[0];
                                                    length2 = str3.length() - 1;
                                                    i18 = 0;
                                                    z17 = false;
                                                    while (i18 <= length2) {
                                                        if (z17) {
                                                            i22 = i18;
                                                        } else {
                                                            i22 = length2;
                                                        }
                                                        if (m.h(str3.charAt(i22), 32) <= 0) {
                                                            z20 = true;
                                                        } else {
                                                            z20 = false;
                                                        }
                                                        if (z17) {
                                                            if (z20) {
                                                                z17 = true;
                                                            } else {
                                                                i18++;
                                                            }
                                                        } else if (z20) {
                                                            lowerCase3 = x.q0(x.q0(x.q0(w4.c.g(str3, length2, 1, i18), "_", " "), " ", BuildConfig.VERSION_NAME), "-", BuildConfig.VERSION_NAME).toLowerCase(Locale.ROOT);
                                                            m.e(lowerCase3, tcppUUQxZjFdy.qvcOg);
                                                            String Luoma6 = next2.Luoma;
                                                            m.e(Luoma6, "Luoma");
                                                            str4 = ((String[]) q.W0(Luoma6, new String[]{"#"}, 0, 6).toArray(new String[0]))[1];
                                                            length3 = str4.length() - 1;
                                                            i19 = 0;
                                                            z18 = false;
                                                            while (i19 <= length3) {
                                                                if (z18) {
                                                                    i21 = i19;
                                                                } else {
                                                                    i21 = length3;
                                                                }
                                                                if (m.h(str4.charAt(i21), 32) <= 0) {
                                                                    z19 = true;
                                                                } else {
                                                                    z19 = false;
                                                                }
                                                                if (z18) {
                                                                    if (z19) {
                                                                        z18 = true;
                                                                    } else {
                                                                        i19++;
                                                                    }
                                                                } else if (z19) {
                                                                    lowerCase4 = x.q0(x.q0(x.q0(w4.c.g(str4, length3, 1, i19), "_", " "), " ", BuildConfig.VERSION_NAME), "-", BuildConfig.VERSION_NAME).toLowerCase(Locale.ROOT);
                                                                    m.e(lowerCase4, "toLowerCase(...)");
                                                                } else {
                                                                    length3--;
                                                                }
                                                            }
                                                            lowerCase4 = x.q0(x.q0(x.q0(w4.c.g(str4, length3, 1, i19), "_", " "), " ", BuildConfig.VERSION_NAME), "-", BuildConfig.VERSION_NAME).toLowerCase(Locale.ROOT);
                                                            m.e(lowerCase4, "toLowerCase(...)");
                                                        } else {
                                                            length2--;
                                                        }
                                                    }
                                                    lowerCase3 = x.q0(x.q0(x.q0(w4.c.g(str3, length2, 1, i18), "_", " "), " ", BuildConfig.VERSION_NAME), "-", BuildConfig.VERSION_NAME).toLowerCase(Locale.ROOT);
                                                    m.e(lowerCase3, tcppUUQxZjFdy.qvcOg);
                                                    String Luoma7 = next2.Luoma;
                                                    m.e(Luoma7, "Luoma");
                                                    str4 = ((String[]) q.W0(Luoma7, new String[]{"#"}, 0, 6).toArray(new String[0]))[1];
                                                    length3 = str4.length() - 1;
                                                    i19 = 0;
                                                    z18 = false;
                                                    while (i19 <= length3) {
                                                        if (z18) {
                                                            i21 = i19;
                                                        } else {
                                                            i21 = length3;
                                                        }
                                                        if (m.h(str4.charAt(i21), 32) <= 0) {
                                                            z19 = true;
                                                        } else {
                                                            z19 = false;
                                                        }
                                                        if (z18) {
                                                            if (z19) {
                                                                z18 = true;
                                                            } else {
                                                                i19++;
                                                            }
                                                        } else if (z19) {
                                                            lowerCase4 = x.q0(x.q0(x.q0(w4.c.g(str4, length3, 1, i19), "_", " "), " ", BuildConfig.VERSION_NAME), "-", BuildConfig.VERSION_NAME).toLowerCase(Locale.ROOT);
                                                            m.e(lowerCase4, "toLowerCase(...)");
                                                        } else {
                                                            length3--;
                                                        }
                                                    }
                                                    lowerCase4 = x.q0(x.q0(x.q0(w4.c.g(str4, length3, 1, i19), "_", " "), " ", BuildConfig.VERSION_NAME), "-", BuildConfig.VERSION_NAME).toLowerCase(Locale.ROOT);
                                                    m.e(lowerCase4, "toLowerCase(...)");
                                                } else {
                                                    luoma = next2.getLuoma();
                                                    iB3 = w4.c.b(1, luoma, "getLuoma(...)");
                                                    i16 = 0;
                                                    z15 = false;
                                                    while (i16 <= iB3) {
                                                        if (z15) {
                                                            i17 = i16;
                                                        } else {
                                                            i17 = iB3;
                                                        }
                                                        if (m.h(luoma.charAt(i17), 32) <= 0) {
                                                            z16 = true;
                                                        } else {
                                                            z16 = false;
                                                        }
                                                        if (z15) {
                                                            if (z16) {
                                                                z15 = true;
                                                            } else {
                                                                i16++;
                                                            }
                                                        } else if (z16) {
                                                            lowerCase3 = x.q0(x.q0(w4.c.g(luoma, iB3, 1, i16), " ", BuildConfig.VERSION_NAME), "-", BuildConfig.VERSION_NAME).toLowerCase(Locale.ROOT);
                                                            m.e(lowerCase3, "toLowerCase(...)");
                                                            lowerCase4 = lowerCase3;
                                                        } else {
                                                            iB3--;
                                                        }
                                                    }
                                                    lowerCase3 = x.q0(x.q0(w4.c.g(luoma, iB3, 1, i16), " ", BuildConfig.VERSION_NAME), "-", BuildConfig.VERSION_NAME).toLowerCase(Locale.ROOT);
                                                    m.e(lowerCase3, "toLowerCase(...)");
                                                    lowerCase4 = lowerCase3;
                                                }
                                                if (x.s0(lowerCase8, qi.b.a(str), false)) {
                                                    Pattern patternCompile15 = Pattern.compile(str);
                                                    m.e(patternCompile15, "compile(...)");
                                                    lowerCase8 = patternCompile15.matcher(lowerCase8).replaceFirst(BuildConfig.VERSION_NAME);
                                                    m.e(lowerCase8, "replaceFirst(...)");
                                                } else if (x.s0(lowerCase8, qi.b.a(str2), false)) {
                                                    Pattern patternCompile16 = Pattern.compile(str2);
                                                    m.e(patternCompile16, "compile(...)");
                                                    lowerCase8 = patternCompile16.matcher(lowerCase8).replaceFirst(BuildConfig.VERSION_NAME);
                                                    m.e(lowerCase8, "replaceFirst(...)");
                                                } else {
                                                    string2 = sb3.toString();
                                                    m.e(string2, "toString(...)");
                                                    if (x.s0(lowerCase8, qi.b.a(string2), false)) {
                                                        String string4 = sb3.toString();
                                                        m.e(string4, "toString(...)");
                                                        Pattern patternCompile17 = Pattern.compile(string4);
                                                        m.e(patternCompile17, "compile(...)");
                                                        lowerCase8 = patternCompile17.matcher(lowerCase8).replaceFirst(BuildConfig.VERSION_NAME);
                                                        m.e(lowerCase8, "replaceFirst(...)");
                                                    } else if (x.s0(lowerCase8, qi.b.a(lowerCase3), false)) {
                                                        Pattern patternCompile18 = Pattern.compile(lowerCase3);
                                                        m.e(patternCompile18, "compile(...)");
                                                        lowerCase8 = patternCompile18.matcher(lowerCase8).replaceFirst(BuildConfig.VERSION_NAME);
                                                        m.e(lowerCase8, "replaceFirst(...)");
                                                    } else {
                                                        if (x.s0(lowerCase8, qi.b.a(lowerCase4), false)) {
                                                            t(false);
                                                            LingoSkillApplication lingoSkillApplication10 = LingoSkillApplication.f21665b;
                                                            String checkAnswerPrompt7 = this.f47884d.checkAnswerPrompt;
                                                            m.e(checkAnswerPrompt7, "checkAnswerPrompt");
                                                            String strQ110 = x.q0(checkAnswerPrompt7, "userSentence%", lowerCase8);
                                                            String translations7 = r().getTranslations();
                                                            m.e(translations7, "getTranslations(...)");
                                                            String strQ21 = x.q0(strQ110, "translation%", translations7);
                                                            String sentence7 = r().getSentence();
                                                            m.e(sentence7, "getSentence(...)");
                                                            x.q0(strQ21, "correctSentence%", sentence7);
                                                            return false;
                                                        }
                                                        Pattern patternCompile19 = Pattern.compile(lowerCase4);
                                                        m.e(patternCompile19, "compile(...)");
                                                        lowerCase8 = patternCompile19.matcher(lowerCase8).replaceFirst(BuildConfig.VERSION_NAME);
                                                        m.e(lowerCase8, "replaceFirst(...)");
                                                    }
                                                }
                                                it4 = it5;
                                            }
                                        } else if (z40) {
                                            i13++;
                                        } else {
                                            z13 = true;
                                        }
                                    }
                                    lowerCase2 = x.q0(w4.c.g(zhuyin2, length, 1, i13), " ", BuildConfig.VERSION_NAME).toLowerCase(Locale.ROOT);
                                    m.e(lowerCase2, "toLowerCase(...)");
                                    arrayListD = qi.b.d(next2);
                                    sb2 = new StringBuilder();
                                    size = arrayListD.size();
                                    i14 = 0;
                                    while (i14 < size) {
                                        Object obj2 = arrayListD.get(i14);
                                        i14++;
                                        word = (Word) obj2;
                                        if (m.a(word.getWord(), "っ")) {
                                            sb2.append("ッ");
                                        } else {
                                            if (dm.a.f23483c == null) {
                                                synchronized (dm.a.class) {
                                                    if (dm.a.f23483c == null) {
                                                        LingoSkillApplication lingoSkillApplication11 = LingoSkillApplication.f21665b;
                                                        m.c(lingoSkillApplication11);
                                                        dm.a.f23483c = new dm.a(lingoSkillApplication11);
                                                    }
                                                }
                                            }
                                            dm.a aVar10 = dm.a.f23483c;
                                            m.c(aVar10);
                                            List listD4 = aVar10.o().queryBuilder().d();
                                            m.e(listD4, "list(...)");
                                            it = listD4.iterator();
                                            while (true) {
                                                if (it.hasNext()) {
                                                    it4 = it4;
                                                    lowerCase = lowerCase;
                                                    lowerCase2 = lowerCase2;
                                                    arrayListD = arrayListD;
                                                    if (dm.a.f23483c == null) {
                                                        synchronized (dm.a.class) {
                                                            if (dm.a.f23483c == null) {
                                                                LingoSkillApplication lingoSkillApplication12 = LingoSkillApplication.f21665b;
                                                                m.c(lingoSkillApplication12);
                                                                dm.a.f23483c = new dm.a(lingoSkillApplication12);
                                                            }
                                                        }
                                                    }
                                                    dm.a aVar11 = dm.a.f23483c;
                                                    m.c(aVar11);
                                                    List listD5 = aVar11.t().queryBuilder().d();
                                                    m.e(listD5, "list(...)");
                                                    it2 = listD5.iterator();
                                                    while (true) {
                                                        if (it2.hasNext()) {
                                                            if (dm.a.f23483c == null) {
                                                                synchronized (dm.a.class) {
                                                                    if (dm.a.f23483c == null) {
                                                                        LingoSkillApplication lingoSkillApplication13 = LingoSkillApplication.f21665b;
                                                                        m.c(lingoSkillApplication13);
                                                                        dm.a.f23483c = new dm.a(lingoSkillApplication13);
                                                                    }
                                                                }
                                                            }
                                                            dm.a aVar12 = dm.a.f23483c;
                                                            m.c(aVar12);
                                                            List<YouYin> listD6 = aVar12.s().queryBuilder().d();
                                                            m.e(listD6, "list(...)");
                                                            while (r2.hasNext()) {
                                                                word2 = word.getWord();
                                                                iB4 = w4.c.b(1, word2, "getWord(...)");
                                                                i24 = 0;
                                                                z22 = false;
                                                                while (i24 <= iB4) {
                                                                    if (z22) {
                                                                        i29 = i24;
                                                                    } else {
                                                                        i29 = iB4;
                                                                    }
                                                                    if (m.h(word2.charAt(i29), 32) <= 0) {
                                                                        z27 = true;
                                                                    } else {
                                                                        z27 = false;
                                                                    }
                                                                    if (z22) {
                                                                        if (z27) {
                                                                            z22 = true;
                                                                        } else {
                                                                            i24++;
                                                                        }
                                                                    } else if (z27) {
                                                                        strG = w4.c.g(word2, iB4, 1, i24);
                                                                        String ping6 = youYin.getPing();
                                                                        m.e(ping6, "getPing(...)");
                                                                        strQ2 = x.q0(x.q0(ping6, "(", BuildConfig.VERSION_NAME), ")", BuildConfig.VERSION_NAME);
                                                                        length4 = strQ2.length() - 1;
                                                                        i25 = 0;
                                                                        z23 = false;
                                                                        while (i25 <= length4) {
                                                                            if (z23) {
                                                                                i28 = i25;
                                                                            } else {
                                                                                i28 = length4;
                                                                            }
                                                                            if (m.h(strQ2.charAt(i28), 32) <= 0) {
                                                                                z26 = true;
                                                                            } else {
                                                                                z26 = false;
                                                                            }
                                                                            if (z23) {
                                                                                if (z26) {
                                                                                    z23 = true;
                                                                                } else {
                                                                                    i25++;
                                                                                }
                                                                            } else if (z26) {
                                                                                lowerCase5 = w4.c.g(strQ2, length4, 1, i25).toLowerCase(Locale.ROOT);
                                                                                m.e(lowerCase5, "toLowerCase(...)");
                                                                                if (m.a(strG, lowerCase5)) {
                                                                                    String pian10 = youYin.getPian();
                                                                                    m.e(pian10, "getPian(...)");
                                                                                    strQ3 = x.q0(x.q0(pian10, "(", BuildConfig.VERSION_NAME), ")", BuildConfig.VERSION_NAME);
                                                                                    length5 = strQ3.length() - 1;
                                                                                    i26 = 0;
                                                                                    z24 = false;
                                                                                    while (i26 <= length5) {
                                                                                        if (z24) {
                                                                                            i27 = i26;
                                                                                        } else {
                                                                                            i27 = length5;
                                                                                        }
                                                                                        if (m.h(strQ3.charAt(i27), 32) <= 0) {
                                                                                            z25 = true;
                                                                                        } else {
                                                                                            z25 = false;
                                                                                        }
                                                                                        if (z24) {
                                                                                            if (z25) {
                                                                                                z24 = true;
                                                                                            } else {
                                                                                                i26++;
                                                                                            }
                                                                                        } else if (z25) {
                                                                                            String lowerCase115 = w4.c.g(strQ3, length5, 1, i26).toLowerCase(Locale.ROOT);
                                                                                            m.e(lowerCase115, "toLowerCase(...)");
                                                                                            sb2.append(lowerCase115);
                                                                                        } else {
                                                                                            length5--;
                                                                                        }
                                                                                    }
                                                                                    String lowerCase116 = w4.c.g(strQ3, length5, 1, i26).toLowerCase(Locale.ROOT);
                                                                                    m.e(lowerCase116, "toLowerCase(...)");
                                                                                    sb2.append(lowerCase116);
                                                                                }
                                                                            } else {
                                                                                length4--;
                                                                            }
                                                                        }
                                                                        lowerCase5 = w4.c.g(strQ2, length4, 1, i25).toLowerCase(Locale.ROOT);
                                                                        m.e(lowerCase5, "toLowerCase(...)");
                                                                        if (m.a(strG, lowerCase5)) {
                                                                            String pian11 = youYin.getPian();
                                                                            m.e(pian11, "getPian(...)");
                                                                            strQ3 = x.q0(x.q0(pian11, "(", BuildConfig.VERSION_NAME), ")", BuildConfig.VERSION_NAME);
                                                                            length5 = strQ3.length() - 1;
                                                                            i26 = 0;
                                                                            z24 = false;
                                                                            while (i26 <= length5) {
                                                                                if (z24) {
                                                                                    i27 = i26;
                                                                                } else {
                                                                                    i27 = length5;
                                                                                }
                                                                                if (m.h(strQ3.charAt(i27), 32) <= 0) {
                                                                                    z25 = true;
                                                                                } else {
                                                                                    z25 = false;
                                                                                }
                                                                                if (z24) {
                                                                                    if (z25) {
                                                                                        z24 = true;
                                                                                    } else {
                                                                                        i26++;
                                                                                    }
                                                                                } else if (z25) {
                                                                                    String lowerCase117 = w4.c.g(strQ3, length5, 1, i26).toLowerCase(Locale.ROOT);
                                                                                    m.e(lowerCase117, "toLowerCase(...)");
                                                                                    sb2.append(lowerCase117);
                                                                                } else {
                                                                                    length5--;
                                                                                }
                                                                            }
                                                                            String lowerCase118 = w4.c.g(strQ3, length5, 1, i26).toLowerCase(Locale.ROOT);
                                                                            m.e(lowerCase118, "toLowerCase(...)");
                                                                            sb2.append(lowerCase118);
                                                                        }
                                                                    } else {
                                                                        iB4--;
                                                                    }
                                                                }
                                                                strG = w4.c.g(word2, iB4, 1, i24);
                                                                String ping7 = youYin.getPing();
                                                                m.e(ping7, "getPing(...)");
                                                                strQ2 = x.q0(x.q0(ping7, "(", BuildConfig.VERSION_NAME), ")", BuildConfig.VERSION_NAME);
                                                                length4 = strQ2.length() - 1;
                                                                i25 = 0;
                                                                z23 = false;
                                                                while (i25 <= length4) {
                                                                    if (z23) {
                                                                        i28 = i25;
                                                                    } else {
                                                                        i28 = length4;
                                                                    }
                                                                    if (m.h(strQ2.charAt(i28), 32) <= 0) {
                                                                        z26 = true;
                                                                    } else {
                                                                        z26 = false;
                                                                    }
                                                                    if (z23) {
                                                                        if (z26) {
                                                                            z23 = true;
                                                                        } else {
                                                                            i25++;
                                                                        }
                                                                    } else if (z26) {
                                                                        lowerCase5 = w4.c.g(strQ2, length4, 1, i25).toLowerCase(Locale.ROOT);
                                                                        m.e(lowerCase5, "toLowerCase(...)");
                                                                        if (m.a(strG, lowerCase5)) {
                                                                            String pian12 = youYin.getPian();
                                                                            m.e(pian12, "getPian(...)");
                                                                            strQ3 = x.q0(x.q0(pian12, "(", BuildConfig.VERSION_NAME), ")", BuildConfig.VERSION_NAME);
                                                                            length5 = strQ3.length() - 1;
                                                                            i26 = 0;
                                                                            z24 = false;
                                                                            while (i26 <= length5) {
                                                                                if (z24) {
                                                                                    i27 = i26;
                                                                                } else {
                                                                                    i27 = length5;
                                                                                }
                                                                                if (m.h(strQ3.charAt(i27), 32) <= 0) {
                                                                                    z25 = true;
                                                                                } else {
                                                                                    z25 = false;
                                                                                }
                                                                                if (z24) {
                                                                                    if (z25) {
                                                                                        z24 = true;
                                                                                    } else {
                                                                                        i26++;
                                                                                    }
                                                                                } else if (z25) {
                                                                                    String lowerCase119 = w4.c.g(strQ3, length5, 1, i26).toLowerCase(Locale.ROOT);
                                                                                    m.e(lowerCase119, "toLowerCase(...)");
                                                                                    sb2.append(lowerCase119);
                                                                                } else {
                                                                                    length5--;
                                                                                }
                                                                            }
                                                                            String lowerCase1110 = w4.c.g(strQ3, length5, 1, i26).toLowerCase(Locale.ROOT);
                                                                            m.e(lowerCase1110, "toLowerCase(...)");
                                                                            sb2.append(lowerCase1110);
                                                                        }
                                                                    } else {
                                                                        length4--;
                                                                    }
                                                                }
                                                                lowerCase5 = w4.c.g(strQ2, length4, 1, i25).toLowerCase(Locale.ROOT);
                                                                m.e(lowerCase5, "toLowerCase(...)");
                                                                if (m.a(strG, lowerCase5)) {
                                                                    String pian13 = youYin.getPian();
                                                                    m.e(pian13, "getPian(...)");
                                                                    strQ3 = x.q0(x.q0(pian13, "(", BuildConfig.VERSION_NAME), ")", BuildConfig.VERSION_NAME);
                                                                    length5 = strQ3.length() - 1;
                                                                    i26 = 0;
                                                                    z24 = false;
                                                                    while (i26 <= length5) {
                                                                        if (z24) {
                                                                            i27 = i26;
                                                                        } else {
                                                                            i27 = length5;
                                                                        }
                                                                        if (m.h(strQ3.charAt(i27), 32) <= 0) {
                                                                            z25 = true;
                                                                        } else {
                                                                            z25 = false;
                                                                        }
                                                                        if (z24) {
                                                                            if (z25) {
                                                                                z24 = true;
                                                                            } else {
                                                                                i26++;
                                                                            }
                                                                        } else if (z25) {
                                                                            String lowerCase1111 = w4.c.g(strQ3, length5, 1, i26).toLowerCase(Locale.ROOT);
                                                                            m.e(lowerCase1111, "toLowerCase(...)");
                                                                            sb2.append(lowerCase1111);
                                                                        } else {
                                                                            length5--;
                                                                        }
                                                                    }
                                                                    String lowerCase1112 = w4.c.g(strQ3, length5, 1, i26).toLowerCase(Locale.ROOT);
                                                                    m.e(lowerCase1112, "toLowerCase(...)");
                                                                    sb2.append(lowerCase1112);
                                                                }
                                                            }
                                                            break;
                                                        } else {
                                                            zhuoYin = (ZhuoYin) it2.next();
                                                            word3 = word.getWord();
                                                            iB5 = w4.c.b(1, word3, "getWord(...)");
                                                            i30 = 0;
                                                            z28 = false;
                                                            while (i30 <= iB5) {
                                                                if (z28) {
                                                                    i35 = i30;
                                                                } else {
                                                                    i35 = iB5;
                                                                }
                                                                if (m.h(word3.charAt(i35), 32) <= 0) {
                                                                    z33 = true;
                                                                } else {
                                                                    z33 = false;
                                                                }
                                                                if (z28) {
                                                                    if (z33) {
                                                                        z28 = true;
                                                                    } else {
                                                                        i30++;
                                                                    }
                                                                } else if (z33) {
                                                                    strG2 = w4.c.g(word3, iB5, 1, i30);
                                                                    String ping8 = zhuoYin.getPing();
                                                                    m.e(ping8, ypOOxsaJG.hziLDAbZxV);
                                                                    strQ4 = x.q0(x.q0(ping8, "(", BuildConfig.VERSION_NAME), ")", BuildConfig.VERSION_NAME);
                                                                    length6 = strQ4.length() - 1;
                                                                    i31 = 0;
                                                                    z29 = false;
                                                                    while (i31 <= length6) {
                                                                        if (z29) {
                                                                            i34 = i31;
                                                                        } else {
                                                                            i34 = length6;
                                                                        }
                                                                        if (m.h(strQ4.charAt(i34), 32) <= 0) {
                                                                            z32 = true;
                                                                        } else {
                                                                            z32 = false;
                                                                        }
                                                                        if (z29) {
                                                                            if (z32) {
                                                                                z29 = true;
                                                                            } else {
                                                                                i31++;
                                                                            }
                                                                        } else if (z32) {
                                                                            lowerCase6 = w4.c.g(strQ4, length6, 1, i31).toLowerCase(Locale.ROOT);
                                                                            m.e(lowerCase6, "toLowerCase(...)");
                                                                            if (m.a(strG2, lowerCase6)) {
                                                                                String pian14 = zhuoYin.getPian();
                                                                                m.e(pian14, "getPian(...)");
                                                                                strQ5 = x.q0(x.q0(pian14, "(", BuildConfig.VERSION_NAME), ")", BuildConfig.VERSION_NAME);
                                                                                length7 = strQ5.length() - 1;
                                                                                i32 = 0;
                                                                                z30 = false;
                                                                                while (i32 <= length7) {
                                                                                    if (z30) {
                                                                                        i33 = i32;
                                                                                    } else {
                                                                                        i33 = length7;
                                                                                    }
                                                                                    if (m.h(strQ5.charAt(i33), 32) <= 0) {
                                                                                        z31 = true;
                                                                                    } else {
                                                                                        z31 = false;
                                                                                    }
                                                                                    if (z30) {
                                                                                        if (z31) {
                                                                                            z30 = true;
                                                                                        } else {
                                                                                            i32++;
                                                                                        }
                                                                                    } else if (z31) {
                                                                                        String lowerCase1113 = w4.c.g(strQ5, length7, 1, i32).toLowerCase(Locale.ROOT);
                                                                                        m.e(lowerCase1113, "toLowerCase(...)");
                                                                                        sb2.append(lowerCase1113);
                                                                                    } else {
                                                                                        length7--;
                                                                                    }
                                                                                }
                                                                                String lowerCase1114 = w4.c.g(strQ5, length7, 1, i32).toLowerCase(Locale.ROOT);
                                                                                m.e(lowerCase1114, "toLowerCase(...)");
                                                                                sb2.append(lowerCase1114);
                                                                            }
                                                                        } else {
                                                                            length6--;
                                                                        }
                                                                    }
                                                                    lowerCase6 = w4.c.g(strQ4, length6, 1, i31).toLowerCase(Locale.ROOT);
                                                                    m.e(lowerCase6, "toLowerCase(...)");
                                                                    if (m.a(strG2, lowerCase6)) {
                                                                        String pian15 = zhuoYin.getPian();
                                                                        m.e(pian15, "getPian(...)");
                                                                        strQ5 = x.q0(x.q0(pian15, "(", BuildConfig.VERSION_NAME), ")", BuildConfig.VERSION_NAME);
                                                                        length7 = strQ5.length() - 1;
                                                                        i32 = 0;
                                                                        z30 = false;
                                                                        while (i32 <= length7) {
                                                                            if (z30) {
                                                                                i33 = i32;
                                                                            } else {
                                                                                i33 = length7;
                                                                            }
                                                                            if (m.h(strQ5.charAt(i33), 32) <= 0) {
                                                                                z31 = true;
                                                                            } else {
                                                                                z31 = false;
                                                                            }
                                                                            if (z30) {
                                                                                if (z31) {
                                                                                    z30 = true;
                                                                                } else {
                                                                                    i32++;
                                                                                }
                                                                            } else if (z31) {
                                                                                String lowerCase1115 = w4.c.g(strQ5, length7, 1, i32).toLowerCase(Locale.ROOT);
                                                                                m.e(lowerCase1115, "toLowerCase(...)");
                                                                                sb2.append(lowerCase1115);
                                                                            } else {
                                                                                length7--;
                                                                            }
                                                                        }
                                                                        String lowerCase1116 = w4.c.g(strQ5, length7, 1, i32).toLowerCase(Locale.ROOT);
                                                                        m.e(lowerCase1116, "toLowerCase(...)");
                                                                        sb2.append(lowerCase1116);
                                                                    }
                                                                } else {
                                                                    iB5--;
                                                                }
                                                            }
                                                            strG2 = w4.c.g(word3, iB5, 1, i30);
                                                            String ping9 = zhuoYin.getPing();
                                                            m.e(ping9, ypOOxsaJG.hziLDAbZxV);
                                                            strQ4 = x.q0(x.q0(ping9, "(", BuildConfig.VERSION_NAME), ")", BuildConfig.VERSION_NAME);
                                                            length6 = strQ4.length() - 1;
                                                            i31 = 0;
                                                            z29 = false;
                                                            while (i31 <= length6) {
                                                                if (z29) {
                                                                    i34 = i31;
                                                                } else {
                                                                    i34 = length6;
                                                                }
                                                                if (m.h(strQ4.charAt(i34), 32) <= 0) {
                                                                    z32 = true;
                                                                } else {
                                                                    z32 = false;
                                                                }
                                                                if (z29) {
                                                                    if (z32) {
                                                                        z29 = true;
                                                                    } else {
                                                                        i31++;
                                                                    }
                                                                } else if (z32) {
                                                                    lowerCase6 = w4.c.g(strQ4, length6, 1, i31).toLowerCase(Locale.ROOT);
                                                                    m.e(lowerCase6, "toLowerCase(...)");
                                                                    if (m.a(strG2, lowerCase6)) {
                                                                        String pian16 = zhuoYin.getPian();
                                                                        m.e(pian16, "getPian(...)");
                                                                        strQ5 = x.q0(x.q0(pian16, "(", BuildConfig.VERSION_NAME), ")", BuildConfig.VERSION_NAME);
                                                                        length7 = strQ5.length() - 1;
                                                                        i32 = 0;
                                                                        z30 = false;
                                                                        while (i32 <= length7) {
                                                                            if (z30) {
                                                                                i33 = i32;
                                                                            } else {
                                                                                i33 = length7;
                                                                            }
                                                                            if (m.h(strQ5.charAt(i33), 32) <= 0) {
                                                                                z31 = true;
                                                                            } else {
                                                                                z31 = false;
                                                                            }
                                                                            if (z30) {
                                                                                if (z31) {
                                                                                    z30 = true;
                                                                                } else {
                                                                                    i32++;
                                                                                }
                                                                            } else if (z31) {
                                                                                String lowerCase1117 = w4.c.g(strQ5, length7, 1, i32).toLowerCase(Locale.ROOT);
                                                                                m.e(lowerCase1117, "toLowerCase(...)");
                                                                                sb2.append(lowerCase1117);
                                                                            } else {
                                                                                length7--;
                                                                            }
                                                                        }
                                                                        String lowerCase1118 = w4.c.g(strQ5, length7, 1, i32).toLowerCase(Locale.ROOT);
                                                                        m.e(lowerCase1118, "toLowerCase(...)");
                                                                        sb2.append(lowerCase1118);
                                                                    }
                                                                } else {
                                                                    length6--;
                                                                }
                                                            }
                                                            lowerCase6 = w4.c.g(strQ4, length6, 1, i31).toLowerCase(Locale.ROOT);
                                                            m.e(lowerCase6, "toLowerCase(...)");
                                                            if (m.a(strG2, lowerCase6)) {
                                                                String pian17 = zhuoYin.getPian();
                                                                m.e(pian17, "getPian(...)");
                                                                strQ5 = x.q0(x.q0(pian17, "(", BuildConfig.VERSION_NAME), ")", BuildConfig.VERSION_NAME);
                                                                length7 = strQ5.length() - 1;
                                                                i32 = 0;
                                                                z30 = false;
                                                                while (i32 <= length7) {
                                                                    if (z30) {
                                                                        i33 = i32;
                                                                    } else {
                                                                        i33 = length7;
                                                                    }
                                                                    if (m.h(strQ5.charAt(i33), 32) <= 0) {
                                                                        z31 = true;
                                                                    } else {
                                                                        z31 = false;
                                                                    }
                                                                    if (z30) {
                                                                        if (z31) {
                                                                            z30 = true;
                                                                        } else {
                                                                            i32++;
                                                                        }
                                                                    } else if (z31) {
                                                                        String lowerCase1119 = w4.c.g(strQ5, length7, 1, i32).toLowerCase(Locale.ROOT);
                                                                        m.e(lowerCase1119, "toLowerCase(...)");
                                                                        sb2.append(lowerCase1119);
                                                                    } else {
                                                                        length7--;
                                                                    }
                                                                }
                                                                String lowerCase11110 = w4.c.g(strQ5, length7, 1, i32).toLowerCase(Locale.ROOT);
                                                                m.e(lowerCase11110, "toLowerCase(...)");
                                                                sb2.append(lowerCase11110);
                                                            }
                                                        }
                                                    }
                                                    break;
                                                } else {
                                                    yinTu = (YinTu) it.next();
                                                    word4 = word.getWord();
                                                    iB6 = w4.c.b(1, word4, "getWord(...)");
                                                    i36 = 0;
                                                    z34 = false;
                                                    while (true) {
                                                        it4 = it4;
                                                        if (i36 <= iB6) {
                                                            if (z34) {
                                                                i41 = i36;
                                                            } else {
                                                                i41 = iB6;
                                                            }
                                                            lowerCase = lowerCase;
                                                            if (m.h(word4.charAt(i41), 32) <= 0) {
                                                                z39 = true;
                                                            } else {
                                                                z39 = false;
                                                            }
                                                            if (z34) {
                                                                if (z39) {
                                                                    z34 = true;
                                                                } else {
                                                                    i36++;
                                                                }
                                                            } else if (!z39) {
                                                                iB6--;
                                                            }
                                                        } else {
                                                            lowerCase = lowerCase;
                                                        }
                                                    }
                                                    strG3 = w4.c.g(word4, iB6, 1, i36);
                                                    String ping10 = yinTu.getPing();
                                                    m.e(ping10, "getPing(...)");
                                                    strQ6 = x.q0(x.q0(ping10, "(", BuildConfig.VERSION_NAME), ")", BuildConfig.VERSION_NAME);
                                                    length8 = strQ6.length() - 1;
                                                    i37 = 0;
                                                    z35 = false;
                                                    while (true) {
                                                        lowerCase2 = lowerCase2;
                                                        if (i37 <= length8) {
                                                            if (z35) {
                                                                i40 = i37;
                                                            } else {
                                                                i40 = length8;
                                                            }
                                                            arrayListD = arrayListD;
                                                            if (m.h(strQ6.charAt(i40), 32) <= 0) {
                                                                z38 = true;
                                                            } else {
                                                                z38 = false;
                                                            }
                                                            if (z35) {
                                                                if (z38) {
                                                                    z35 = true;
                                                                } else {
                                                                    i37++;
                                                                }
                                                            } else if (!z38) {
                                                                length8--;
                                                            }
                                                        } else {
                                                            arrayListD = arrayListD;
                                                        }
                                                    }
                                                    lowerCase7 = w4.c.g(strQ6, length8, 1, i37).toLowerCase(Locale.ROOT);
                                                    m.e(lowerCase7, "toLowerCase(...)");
                                                    if (m.a(strG3, lowerCase7)) {
                                                        String pian18 = yinTu.getPian();
                                                        m.e(pian18, "getPian(...)");
                                                        strQ7 = x.q0(x.q0(pian18, "(", BuildConfig.VERSION_NAME), ")", BuildConfig.VERSION_NAME);
                                                        length9 = strQ7.length() - 1;
                                                        i38 = 0;
                                                        z36 = false;
                                                        while (i38 <= length9) {
                                                            if (z36) {
                                                                i39 = i38;
                                                            } else {
                                                                i39 = length9;
                                                            }
                                                            if (m.h(strQ7.charAt(i39), 32) <= 0) {
                                                                z37 = true;
                                                            } else {
                                                                z37 = false;
                                                            }
                                                            if (z36) {
                                                                if (z37) {
                                                                    z36 = true;
                                                                } else {
                                                                    i38++;
                                                                }
                                                            } else if (z37) {
                                                                String lowerCase24 = w4.c.g(strQ7, length9, 1, i38).toLowerCase(Locale.ROOT);
                                                                m.e(lowerCase24, "toLowerCase(...)");
                                                                sb2.append(lowerCase24);
                                                            } else {
                                                                length9--;
                                                            }
                                                        }
                                                        String lowerCase25 = w4.c.g(strQ7, length9, 1, i38).toLowerCase(Locale.ROOT);
                                                        m.e(lowerCase25, "toLowerCase(...)");
                                                        sb2.append(lowerCase25);
                                                    } else {
                                                        lowerCase2 = lowerCase2;
                                                        it4 = it4;
                                                        lowerCase = lowerCase;
                                                        arrayListD = arrayListD;
                                                    }
                                                }
                                            }
                                            lowerCase2 = lowerCase2;
                                            it4 = it4;
                                            lowerCase = lowerCase;
                                            arrayListD = arrayListD;
                                        }
                                        break;
                                    }
                                    Iterator<Word> it6 = it4;
                                    str = lowerCase;
                                    str2 = lowerCase2;
                                    string = sb2.toString();
                                    iB2 = w4.c.b(1, string, "toString(...)");
                                    i15 = 0;
                                    z14 = false;
                                    while (i15 <= iB2) {
                                        if (z14) {
                                            i23 = i15;
                                        } else {
                                            i23 = iB2;
                                        }
                                        if (m.h(string.charAt(i23), 32) <= 0) {
                                            z21 = true;
                                        } else {
                                            z21 = false;
                                        }
                                        if (z14) {
                                            if (z21) {
                                                z14 = true;
                                            } else {
                                                i15++;
                                            }
                                        } else if (z21) {
                                            String lowerCase26 = x.q0(w4.c.g(string, iB2, 1, i15), " ", BuildConfig.VERSION_NAME).toLowerCase(Locale.ROOT);
                                            m.e(lowerCase26, "toLowerCase(...)");
                                            sb3 = new StringBuilder(lowerCase26);
                                            Luoma = next2.Luoma;
                                            m.e(Luoma, "Luoma");
                                            if (q.W0(Luoma, new String[]{"#"}, 0, 6).toArray(new String[0]).length > 1) {
                                                String Luoma8 = next2.Luoma;
                                                m.e(Luoma8, "Luoma");
                                                str3 = ((String[]) q.W0(Luoma8, new String[]{"#"}, 0, 6).toArray(new String[0]))[0];
                                                length2 = str3.length() - 1;
                                                i18 = 0;
                                                z17 = false;
                                                while (i18 <= length2) {
                                                    if (z17) {
                                                        i22 = i18;
                                                    } else {
                                                        i22 = length2;
                                                    }
                                                    if (m.h(str3.charAt(i22), 32) <= 0) {
                                                        z20 = true;
                                                    } else {
                                                        z20 = false;
                                                    }
                                                    if (z17) {
                                                        if (z20) {
                                                            z17 = true;
                                                        } else {
                                                            i18++;
                                                        }
                                                    } else if (z20) {
                                                        lowerCase3 = x.q0(x.q0(x.q0(w4.c.g(str3, length2, 1, i18), "_", " "), " ", BuildConfig.VERSION_NAME), "-", BuildConfig.VERSION_NAME).toLowerCase(Locale.ROOT);
                                                        m.e(lowerCase3, tcppUUQxZjFdy.qvcOg);
                                                        String Luoma9 = next2.Luoma;
                                                        m.e(Luoma9, "Luoma");
                                                        str4 = ((String[]) q.W0(Luoma9, new String[]{"#"}, 0, 6).toArray(new String[0]))[1];
                                                        length3 = str4.length() - 1;
                                                        i19 = 0;
                                                        z18 = false;
                                                        while (i19 <= length3) {
                                                            if (z18) {
                                                                i21 = i19;
                                                            } else {
                                                                i21 = length3;
                                                            }
                                                            if (m.h(str4.charAt(i21), 32) <= 0) {
                                                                z19 = true;
                                                            } else {
                                                                z19 = false;
                                                            }
                                                            if (z18) {
                                                                if (z19) {
                                                                    z18 = true;
                                                                } else {
                                                                    i19++;
                                                                }
                                                            } else if (z19) {
                                                                lowerCase4 = x.q0(x.q0(x.q0(w4.c.g(str4, length3, 1, i19), "_", " "), " ", BuildConfig.VERSION_NAME), "-", BuildConfig.VERSION_NAME).toLowerCase(Locale.ROOT);
                                                                m.e(lowerCase4, "toLowerCase(...)");
                                                            } else {
                                                                length3--;
                                                            }
                                                        }
                                                        lowerCase4 = x.q0(x.q0(x.q0(w4.c.g(str4, length3, 1, i19), "_", " "), " ", BuildConfig.VERSION_NAME), "-", BuildConfig.VERSION_NAME).toLowerCase(Locale.ROOT);
                                                        m.e(lowerCase4, "toLowerCase(...)");
                                                    } else {
                                                        length2--;
                                                    }
                                                }
                                                lowerCase3 = x.q0(x.q0(x.q0(w4.c.g(str3, length2, 1, i18), "_", " "), " ", BuildConfig.VERSION_NAME), "-", BuildConfig.VERSION_NAME).toLowerCase(Locale.ROOT);
                                                m.e(lowerCase3, tcppUUQxZjFdy.qvcOg);
                                                String Luoma10 = next2.Luoma;
                                                m.e(Luoma10, "Luoma");
                                                str4 = ((String[]) q.W0(Luoma10, new String[]{"#"}, 0, 6).toArray(new String[0]))[1];
                                                length3 = str4.length() - 1;
                                                i19 = 0;
                                                z18 = false;
                                                while (i19 <= length3) {
                                                    if (z18) {
                                                        i21 = i19;
                                                    } else {
                                                        i21 = length3;
                                                    }
                                                    if (m.h(str4.charAt(i21), 32) <= 0) {
                                                        z19 = true;
                                                    } else {
                                                        z19 = false;
                                                    }
                                                    if (z18) {
                                                        if (z19) {
                                                            z18 = true;
                                                        } else {
                                                            i19++;
                                                        }
                                                    } else if (z19) {
                                                        lowerCase4 = x.q0(x.q0(x.q0(w4.c.g(str4, length3, 1, i19), "_", " "), " ", BuildConfig.VERSION_NAME), "-", BuildConfig.VERSION_NAME).toLowerCase(Locale.ROOT);
                                                        m.e(lowerCase4, "toLowerCase(...)");
                                                    } else {
                                                        length3--;
                                                    }
                                                }
                                                lowerCase4 = x.q0(x.q0(x.q0(w4.c.g(str4, length3, 1, i19), "_", " "), " ", BuildConfig.VERSION_NAME), "-", BuildConfig.VERSION_NAME).toLowerCase(Locale.ROOT);
                                                m.e(lowerCase4, "toLowerCase(...)");
                                            } else {
                                                luoma = next2.getLuoma();
                                                iB3 = w4.c.b(1, luoma, "getLuoma(...)");
                                                i16 = 0;
                                                z15 = false;
                                                while (i16 <= iB3) {
                                                    if (z15) {
                                                        i17 = i16;
                                                    } else {
                                                        i17 = iB3;
                                                    }
                                                    if (m.h(luoma.charAt(i17), 32) <= 0) {
                                                        z16 = true;
                                                    } else {
                                                        z16 = false;
                                                    }
                                                    if (z15) {
                                                        if (z16) {
                                                            z15 = true;
                                                        } else {
                                                            i16++;
                                                        }
                                                    } else if (z16) {
                                                        lowerCase3 = x.q0(x.q0(w4.c.g(luoma, iB3, 1, i16), " ", BuildConfig.VERSION_NAME), "-", BuildConfig.VERSION_NAME).toLowerCase(Locale.ROOT);
                                                        m.e(lowerCase3, "toLowerCase(...)");
                                                        lowerCase4 = lowerCase3;
                                                    } else {
                                                        iB3--;
                                                    }
                                                }
                                                lowerCase3 = x.q0(x.q0(w4.c.g(luoma, iB3, 1, i16), " ", BuildConfig.VERSION_NAME), "-", BuildConfig.VERSION_NAME).toLowerCase(Locale.ROOT);
                                                m.e(lowerCase3, "toLowerCase(...)");
                                                lowerCase4 = lowerCase3;
                                            }
                                            if (x.s0(lowerCase8, qi.b.a(str), false)) {
                                                Pattern patternCompile110 = Pattern.compile(str);
                                                m.e(patternCompile110, "compile(...)");
                                                lowerCase8 = patternCompile110.matcher(lowerCase8).replaceFirst(BuildConfig.VERSION_NAME);
                                                m.e(lowerCase8, "replaceFirst(...)");
                                            } else if (x.s0(lowerCase8, qi.b.a(str2), false)) {
                                                Pattern patternCompile111 = Pattern.compile(str2);
                                                m.e(patternCompile111, "compile(...)");
                                                lowerCase8 = patternCompile111.matcher(lowerCase8).replaceFirst(BuildConfig.VERSION_NAME);
                                                m.e(lowerCase8, "replaceFirst(...)");
                                            } else {
                                                string2 = sb3.toString();
                                                m.e(string2, "toString(...)");
                                                if (x.s0(lowerCase8, qi.b.a(string2), false)) {
                                                    String string5 = sb3.toString();
                                                    m.e(string5, "toString(...)");
                                                    Pattern patternCompile112 = Pattern.compile(string5);
                                                    m.e(patternCompile112, "compile(...)");
                                                    lowerCase8 = patternCompile112.matcher(lowerCase8).replaceFirst(BuildConfig.VERSION_NAME);
                                                    m.e(lowerCase8, "replaceFirst(...)");
                                                } else if (x.s0(lowerCase8, qi.b.a(lowerCase3), false)) {
                                                    Pattern patternCompile113 = Pattern.compile(lowerCase3);
                                                    m.e(patternCompile113, "compile(...)");
                                                    lowerCase8 = patternCompile113.matcher(lowerCase8).replaceFirst(BuildConfig.VERSION_NAME);
                                                    m.e(lowerCase8, "replaceFirst(...)");
                                                } else {
                                                    if (x.s0(lowerCase8, qi.b.a(lowerCase4), false)) {
                                                        t(false);
                                                        LingoSkillApplication lingoSkillApplication14 = LingoSkillApplication.f21665b;
                                                        String checkAnswerPrompt8 = this.f47884d.checkAnswerPrompt;
                                                        m.e(checkAnswerPrompt8, "checkAnswerPrompt");
                                                        String strQ111 = x.q0(checkAnswerPrompt8, "userSentence%", lowerCase8);
                                                        String translations8 = r().getTranslations();
                                                        m.e(translations8, "getTranslations(...)");
                                                        String strQ22 = x.q0(strQ111, "translation%", translations8);
                                                        String sentence8 = r().getSentence();
                                                        m.e(sentence8, "getSentence(...)");
                                                        x.q0(strQ22, "correctSentence%", sentence8);
                                                        return false;
                                                    }
                                                    Pattern patternCompile114 = Pattern.compile(lowerCase4);
                                                    m.e(patternCompile114, "compile(...)");
                                                    lowerCase8 = patternCompile114.matcher(lowerCase8).replaceFirst(BuildConfig.VERSION_NAME);
                                                    m.e(lowerCase8, "replaceFirst(...)");
                                                }
                                            }
                                            it4 = it6;
                                        } else {
                                            iB2--;
                                        }
                                    }
                                    String lowerCase27 = x.q0(w4.c.g(string, iB2, 1, i15), " ", BuildConfig.VERSION_NAME).toLowerCase(Locale.ROOT);
                                    m.e(lowerCase27, "toLowerCase(...)");
                                    sb3 = new StringBuilder(lowerCase27);
                                    Luoma = next2.Luoma;
                                    m.e(Luoma, "Luoma");
                                    if (q.W0(Luoma, new String[]{"#"}, 0, 6).toArray(new String[0]).length > 1) {
                                        String Luoma11 = next2.Luoma;
                                        m.e(Luoma11, "Luoma");
                                        str3 = ((String[]) q.W0(Luoma11, new String[]{"#"}, 0, 6).toArray(new String[0]))[0];
                                        length2 = str3.length() - 1;
                                        i18 = 0;
                                        z17 = false;
                                        while (i18 <= length2) {
                                            if (z17) {
                                                i22 = i18;
                                            } else {
                                                i22 = length2;
                                            }
                                            if (m.h(str3.charAt(i22), 32) <= 0) {
                                                z20 = true;
                                            } else {
                                                z20 = false;
                                            }
                                            if (z17) {
                                                if (z20) {
                                                    z17 = true;
                                                } else {
                                                    i18++;
                                                }
                                            } else if (z20) {
                                                lowerCase3 = x.q0(x.q0(x.q0(w4.c.g(str3, length2, 1, i18), "_", " "), " ", BuildConfig.VERSION_NAME), "-", BuildConfig.VERSION_NAME).toLowerCase(Locale.ROOT);
                                                m.e(lowerCase3, tcppUUQxZjFdy.qvcOg);
                                                String Luoma12 = next2.Luoma;
                                                m.e(Luoma12, "Luoma");
                                                str4 = ((String[]) q.W0(Luoma12, new String[]{"#"}, 0, 6).toArray(new String[0]))[1];
                                                length3 = str4.length() - 1;
                                                i19 = 0;
                                                z18 = false;
                                                while (i19 <= length3) {
                                                    if (z18) {
                                                        i21 = i19;
                                                    } else {
                                                        i21 = length3;
                                                    }
                                                    if (m.h(str4.charAt(i21), 32) <= 0) {
                                                        z19 = true;
                                                    } else {
                                                        z19 = false;
                                                    }
                                                    if (z18) {
                                                        if (z19) {
                                                            z18 = true;
                                                        } else {
                                                            i19++;
                                                        }
                                                    } else if (z19) {
                                                        lowerCase4 = x.q0(x.q0(x.q0(w4.c.g(str4, length3, 1, i19), "_", " "), " ", BuildConfig.VERSION_NAME), "-", BuildConfig.VERSION_NAME).toLowerCase(Locale.ROOT);
                                                        m.e(lowerCase4, "toLowerCase(...)");
                                                    } else {
                                                        length3--;
                                                    }
                                                }
                                                lowerCase4 = x.q0(x.q0(x.q0(w4.c.g(str4, length3, 1, i19), "_", " "), " ", BuildConfig.VERSION_NAME), "-", BuildConfig.VERSION_NAME).toLowerCase(Locale.ROOT);
                                                m.e(lowerCase4, "toLowerCase(...)");
                                            } else {
                                                length2--;
                                            }
                                        }
                                        lowerCase3 = x.q0(x.q0(x.q0(w4.c.g(str3, length2, 1, i18), "_", " "), " ", BuildConfig.VERSION_NAME), "-", BuildConfig.VERSION_NAME).toLowerCase(Locale.ROOT);
                                        m.e(lowerCase3, tcppUUQxZjFdy.qvcOg);
                                        String Luoma13 = next2.Luoma;
                                        m.e(Luoma13, "Luoma");
                                        str4 = ((String[]) q.W0(Luoma13, new String[]{"#"}, 0, 6).toArray(new String[0]))[1];
                                        length3 = str4.length() - 1;
                                        i19 = 0;
                                        z18 = false;
                                        while (i19 <= length3) {
                                            if (z18) {
                                                i21 = i19;
                                            } else {
                                                i21 = length3;
                                            }
                                            if (m.h(str4.charAt(i21), 32) <= 0) {
                                                z19 = true;
                                            } else {
                                                z19 = false;
                                            }
                                            if (z18) {
                                                if (z19) {
                                                    z18 = true;
                                                } else {
                                                    i19++;
                                                }
                                            } else if (z19) {
                                                lowerCase4 = x.q0(x.q0(x.q0(w4.c.g(str4, length3, 1, i19), "_", " "), " ", BuildConfig.VERSION_NAME), "-", BuildConfig.VERSION_NAME).toLowerCase(Locale.ROOT);
                                                m.e(lowerCase4, "toLowerCase(...)");
                                            } else {
                                                length3--;
                                            }
                                        }
                                        lowerCase4 = x.q0(x.q0(x.q0(w4.c.g(str4, length3, 1, i19), "_", " "), " ", BuildConfig.VERSION_NAME), "-", BuildConfig.VERSION_NAME).toLowerCase(Locale.ROOT);
                                        m.e(lowerCase4, "toLowerCase(...)");
                                    } else {
                                        luoma = next2.getLuoma();
                                        iB3 = w4.c.b(1, luoma, "getLuoma(...)");
                                        i16 = 0;
                                        z15 = false;
                                        while (i16 <= iB3) {
                                            if (z15) {
                                                i17 = i16;
                                            } else {
                                                i17 = iB3;
                                            }
                                            if (m.h(luoma.charAt(i17), 32) <= 0) {
                                                z16 = true;
                                            } else {
                                                z16 = false;
                                            }
                                            if (z15) {
                                                if (z16) {
                                                    z15 = true;
                                                } else {
                                                    i16++;
                                                }
                                            } else if (z16) {
                                                lowerCase3 = x.q0(x.q0(w4.c.g(luoma, iB3, 1, i16), " ", BuildConfig.VERSION_NAME), "-", BuildConfig.VERSION_NAME).toLowerCase(Locale.ROOT);
                                                m.e(lowerCase3, "toLowerCase(...)");
                                                lowerCase4 = lowerCase3;
                                            } else {
                                                iB3--;
                                            }
                                        }
                                        lowerCase3 = x.q0(x.q0(w4.c.g(luoma, iB3, 1, i16), " ", BuildConfig.VERSION_NAME), "-", BuildConfig.VERSION_NAME).toLowerCase(Locale.ROOT);
                                        m.e(lowerCase3, "toLowerCase(...)");
                                        lowerCase4 = lowerCase3;
                                    }
                                    if (x.s0(lowerCase8, qi.b.a(str), false)) {
                                        Pattern patternCompile115 = Pattern.compile(str);
                                        m.e(patternCompile115, "compile(...)");
                                        lowerCase8 = patternCompile115.matcher(lowerCase8).replaceFirst(BuildConfig.VERSION_NAME);
                                        m.e(lowerCase8, "replaceFirst(...)");
                                    } else if (x.s0(lowerCase8, qi.b.a(str2), false)) {
                                        Pattern patternCompile116 = Pattern.compile(str2);
                                        m.e(patternCompile116, "compile(...)");
                                        lowerCase8 = patternCompile116.matcher(lowerCase8).replaceFirst(BuildConfig.VERSION_NAME);
                                        m.e(lowerCase8, "replaceFirst(...)");
                                    } else {
                                        string2 = sb3.toString();
                                        m.e(string2, "toString(...)");
                                        if (x.s0(lowerCase8, qi.b.a(string2), false)) {
                                            String string6 = sb3.toString();
                                            m.e(string6, "toString(...)");
                                            Pattern patternCompile117 = Pattern.compile(string6);
                                            m.e(patternCompile117, "compile(...)");
                                            lowerCase8 = patternCompile117.matcher(lowerCase8).replaceFirst(BuildConfig.VERSION_NAME);
                                            m.e(lowerCase8, "replaceFirst(...)");
                                        } else if (x.s0(lowerCase8, qi.b.a(lowerCase3), false)) {
                                            Pattern patternCompile118 = Pattern.compile(lowerCase3);
                                            m.e(patternCompile118, "compile(...)");
                                            lowerCase8 = patternCompile118.matcher(lowerCase8).replaceFirst(BuildConfig.VERSION_NAME);
                                            m.e(lowerCase8, "replaceFirst(...)");
                                        } else {
                                            if (x.s0(lowerCase8, qi.b.a(lowerCase4), false)) {
                                                t(false);
                                                LingoSkillApplication lingoSkillApplication15 = LingoSkillApplication.f21665b;
                                                String checkAnswerPrompt9 = this.f47884d.checkAnswerPrompt;
                                                m.e(checkAnswerPrompt9, "checkAnswerPrompt");
                                                String strQ112 = x.q0(checkAnswerPrompt9, "userSentence%", lowerCase8);
                                                String translations9 = r().getTranslations();
                                                m.e(translations9, "getTranslations(...)");
                                                String strQ23 = x.q0(strQ112, "translation%", translations9);
                                                String sentence9 = r().getSentence();
                                                m.e(sentence9, "getSentence(...)");
                                                x.q0(strQ23, "correctSentence%", sentence9);
                                                return false;
                                            }
                                            Pattern patternCompile119 = Pattern.compile(lowerCase4);
                                            m.e(patternCompile119, "compile(...)");
                                            lowerCase8 = patternCompile119.matcher(lowerCase8).replaceFirst(BuildConfig.VERSION_NAME);
                                            m.e(lowerCase8, "replaceFirst(...)");
                                        }
                                    }
                                    it4 = it6;
                                }
                            } else if (z48) {
                                i45++;
                            } else {
                                z47 = true;
                            }
                        }
                        lowerCase = x.q0(w4.c.g(word8, iB9, 1, i45), " ", BuildConfig.VERSION_NAME).toLowerCase(Locale.ROOT);
                        m.e(lowerCase, "toLowerCase(...)");
                        zhuyin2 = next2.getZhuyin();
                        m.e(zhuyin2, "getZhuyin(...)");
                        length = zhuyin2.length() - 1;
                        i13 = 0;
                        z13 = false;
                        while (i13 <= length) {
                            if (z13) {
                                i42 = i13;
                            } else {
                                i42 = length;
                            }
                            if (m.h(zhuyin2.charAt(i42), 32) <= 0) {
                                z40 = true;
                            } else {
                                z40 = false;
                            }
                            if (z13) {
                                if (z40) {
                                    z13 = true;
                                } else {
                                    i13++;
                                }
                            } else if (z40) {
                                lowerCase2 = x.q0(w4.c.g(zhuyin2, length, 1, i13), " ", BuildConfig.VERSION_NAME).toLowerCase(Locale.ROOT);
                                m.e(lowerCase2, "toLowerCase(...)");
                                arrayListD = qi.b.d(next2);
                                sb2 = new StringBuilder();
                                size = arrayListD.size();
                                i14 = 0;
                                while (i14 < size) {
                                    Object obj3 = arrayListD.get(i14);
                                    i14++;
                                    word = (Word) obj3;
                                    if (m.a(word.getWord(), "っ")) {
                                        sb2.append("ッ");
                                    } else {
                                        if (dm.a.f23483c == null) {
                                            synchronized (dm.a.class) {
                                                if (dm.a.f23483c == null) {
                                                    LingoSkillApplication lingoSkillApplication16 = LingoSkillApplication.f21665b;
                                                    m.c(lingoSkillApplication16);
                                                    dm.a.f23483c = new dm.a(lingoSkillApplication16);
                                                }
                                            }
                                        }
                                        dm.a aVar13 = dm.a.f23483c;
                                        m.c(aVar13);
                                        List listD7 = aVar13.o().queryBuilder().d();
                                        m.e(listD7, "list(...)");
                                        it = listD7.iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                it4 = it4;
                                                lowerCase = lowerCase;
                                                lowerCase2 = lowerCase2;
                                                arrayListD = arrayListD;
                                                if (dm.a.f23483c == null) {
                                                    synchronized (dm.a.class) {
                                                        if (dm.a.f23483c == null) {
                                                            LingoSkillApplication lingoSkillApplication17 = LingoSkillApplication.f21665b;
                                                            m.c(lingoSkillApplication17);
                                                            dm.a.f23483c = new dm.a(lingoSkillApplication17);
                                                        }
                                                    }
                                                }
                                                dm.a aVar14 = dm.a.f23483c;
                                                m.c(aVar14);
                                                List listD8 = aVar14.t().queryBuilder().d();
                                                m.e(listD8, "list(...)");
                                                it2 = listD8.iterator();
                                                while (true) {
                                                    if (it2.hasNext()) {
                                                        if (dm.a.f23483c == null) {
                                                            synchronized (dm.a.class) {
                                                                if (dm.a.f23483c == null) {
                                                                    LingoSkillApplication lingoSkillApplication18 = LingoSkillApplication.f21665b;
                                                                    m.c(lingoSkillApplication18);
                                                                    dm.a.f23483c = new dm.a(lingoSkillApplication18);
                                                                }
                                                            }
                                                        }
                                                        dm.a aVar15 = dm.a.f23483c;
                                                        m.c(aVar15);
                                                        List<YouYin> listD9 = aVar15.s().queryBuilder().d();
                                                        m.e(listD9, "list(...)");
                                                        while (r2.hasNext()) {
                                                            word2 = word.getWord();
                                                            iB4 = w4.c.b(1, word2, "getWord(...)");
                                                            i24 = 0;
                                                            z22 = false;
                                                            while (i24 <= iB4) {
                                                                if (z22) {
                                                                    i29 = i24;
                                                                } else {
                                                                    i29 = iB4;
                                                                }
                                                                if (m.h(word2.charAt(i29), 32) <= 0) {
                                                                    z27 = true;
                                                                } else {
                                                                    z27 = false;
                                                                }
                                                                if (z22) {
                                                                    if (z27) {
                                                                        z22 = true;
                                                                    } else {
                                                                        i24++;
                                                                    }
                                                                } else if (z27) {
                                                                    strG = w4.c.g(word2, iB4, 1, i24);
                                                                    String ping11 = youYin.getPing();
                                                                    m.e(ping11, "getPing(...)");
                                                                    strQ2 = x.q0(x.q0(ping11, "(", BuildConfig.VERSION_NAME), ")", BuildConfig.VERSION_NAME);
                                                                    length4 = strQ2.length() - 1;
                                                                    i25 = 0;
                                                                    z23 = false;
                                                                    while (i25 <= length4) {
                                                                        if (z23) {
                                                                            i28 = i25;
                                                                        } else {
                                                                            i28 = length4;
                                                                        }
                                                                        if (m.h(strQ2.charAt(i28), 32) <= 0) {
                                                                            z26 = true;
                                                                        } else {
                                                                            z26 = false;
                                                                        }
                                                                        if (z23) {
                                                                            if (z26) {
                                                                                z23 = true;
                                                                            } else {
                                                                                i25++;
                                                                            }
                                                                        } else if (z26) {
                                                                            lowerCase5 = w4.c.g(strQ2, length4, 1, i25).toLowerCase(Locale.ROOT);
                                                                            m.e(lowerCase5, "toLowerCase(...)");
                                                                            if (m.a(strG, lowerCase5)) {
                                                                                String pian19 = youYin.getPian();
                                                                                m.e(pian19, "getPian(...)");
                                                                                strQ3 = x.q0(x.q0(pian19, "(", BuildConfig.VERSION_NAME), ")", BuildConfig.VERSION_NAME);
                                                                                length5 = strQ3.length() - 1;
                                                                                i26 = 0;
                                                                                z24 = false;
                                                                                while (i26 <= length5) {
                                                                                    if (z24) {
                                                                                        i27 = i26;
                                                                                    } else {
                                                                                        i27 = length5;
                                                                                    }
                                                                                    if (m.h(strQ3.charAt(i27), 32) <= 0) {
                                                                                        z25 = true;
                                                                                    } else {
                                                                                        z25 = false;
                                                                                    }
                                                                                    if (z24) {
                                                                                        if (z25) {
                                                                                            z24 = true;
                                                                                        } else {
                                                                                            i26++;
                                                                                        }
                                                                                    } else if (z25) {
                                                                                        String lowerCase11111 = w4.c.g(strQ3, length5, 1, i26).toLowerCase(Locale.ROOT);
                                                                                        m.e(lowerCase11111, "toLowerCase(...)");
                                                                                        sb2.append(lowerCase11111);
                                                                                    } else {
                                                                                        length5--;
                                                                                    }
                                                                                }
                                                                                String lowerCase11112 = w4.c.g(strQ3, length5, 1, i26).toLowerCase(Locale.ROOT);
                                                                                m.e(lowerCase11112, "toLowerCase(...)");
                                                                                sb2.append(lowerCase11112);
                                                                            }
                                                                        } else {
                                                                            length4--;
                                                                        }
                                                                    }
                                                                    lowerCase5 = w4.c.g(strQ2, length4, 1, i25).toLowerCase(Locale.ROOT);
                                                                    m.e(lowerCase5, "toLowerCase(...)");
                                                                    if (m.a(strG, lowerCase5)) {
                                                                        String pian110 = youYin.getPian();
                                                                        m.e(pian110, "getPian(...)");
                                                                        strQ3 = x.q0(x.q0(pian110, "(", BuildConfig.VERSION_NAME), ")", BuildConfig.VERSION_NAME);
                                                                        length5 = strQ3.length() - 1;
                                                                        i26 = 0;
                                                                        z24 = false;
                                                                        while (i26 <= length5) {
                                                                            if (z24) {
                                                                                i27 = i26;
                                                                            } else {
                                                                                i27 = length5;
                                                                            }
                                                                            if (m.h(strQ3.charAt(i27), 32) <= 0) {
                                                                                z25 = true;
                                                                            } else {
                                                                                z25 = false;
                                                                            }
                                                                            if (z24) {
                                                                                if (z25) {
                                                                                    z24 = true;
                                                                                } else {
                                                                                    i26++;
                                                                                }
                                                                            } else if (z25) {
                                                                                String lowerCase11113 = w4.c.g(strQ3, length5, 1, i26).toLowerCase(Locale.ROOT);
                                                                                m.e(lowerCase11113, "toLowerCase(...)");
                                                                                sb2.append(lowerCase11113);
                                                                            } else {
                                                                                length5--;
                                                                            }
                                                                        }
                                                                        String lowerCase11114 = w4.c.g(strQ3, length5, 1, i26).toLowerCase(Locale.ROOT);
                                                                        m.e(lowerCase11114, "toLowerCase(...)");
                                                                        sb2.append(lowerCase11114);
                                                                    }
                                                                } else {
                                                                    iB4--;
                                                                }
                                                            }
                                                            strG = w4.c.g(word2, iB4, 1, i24);
                                                            String ping12 = youYin.getPing();
                                                            m.e(ping12, "getPing(...)");
                                                            strQ2 = x.q0(x.q0(ping12, "(", BuildConfig.VERSION_NAME), ")", BuildConfig.VERSION_NAME);
                                                            length4 = strQ2.length() - 1;
                                                            i25 = 0;
                                                            z23 = false;
                                                            while (i25 <= length4) {
                                                                if (z23) {
                                                                    i28 = i25;
                                                                } else {
                                                                    i28 = length4;
                                                                }
                                                                if (m.h(strQ2.charAt(i28), 32) <= 0) {
                                                                    z26 = true;
                                                                } else {
                                                                    z26 = false;
                                                                }
                                                                if (z23) {
                                                                    if (z26) {
                                                                        z23 = true;
                                                                    } else {
                                                                        i25++;
                                                                    }
                                                                } else if (z26) {
                                                                    lowerCase5 = w4.c.g(strQ2, length4, 1, i25).toLowerCase(Locale.ROOT);
                                                                    m.e(lowerCase5, "toLowerCase(...)");
                                                                    if (m.a(strG, lowerCase5)) {
                                                                        String pian111 = youYin.getPian();
                                                                        m.e(pian111, "getPian(...)");
                                                                        strQ3 = x.q0(x.q0(pian111, "(", BuildConfig.VERSION_NAME), ")", BuildConfig.VERSION_NAME);
                                                                        length5 = strQ3.length() - 1;
                                                                        i26 = 0;
                                                                        z24 = false;
                                                                        while (i26 <= length5) {
                                                                            if (z24) {
                                                                                i27 = i26;
                                                                            } else {
                                                                                i27 = length5;
                                                                            }
                                                                            if (m.h(strQ3.charAt(i27), 32) <= 0) {
                                                                                z25 = true;
                                                                            } else {
                                                                                z25 = false;
                                                                            }
                                                                            if (z24) {
                                                                                if (z25) {
                                                                                    z24 = true;
                                                                                } else {
                                                                                    i26++;
                                                                                }
                                                                            } else if (z25) {
                                                                                String lowerCase11115 = w4.c.g(strQ3, length5, 1, i26).toLowerCase(Locale.ROOT);
                                                                                m.e(lowerCase11115, "toLowerCase(...)");
                                                                                sb2.append(lowerCase11115);
                                                                            } else {
                                                                                length5--;
                                                                            }
                                                                        }
                                                                        String lowerCase11116 = w4.c.g(strQ3, length5, 1, i26).toLowerCase(Locale.ROOT);
                                                                        m.e(lowerCase11116, "toLowerCase(...)");
                                                                        sb2.append(lowerCase11116);
                                                                    }
                                                                } else {
                                                                    length4--;
                                                                }
                                                            }
                                                            lowerCase5 = w4.c.g(strQ2, length4, 1, i25).toLowerCase(Locale.ROOT);
                                                            m.e(lowerCase5, "toLowerCase(...)");
                                                            if (m.a(strG, lowerCase5)) {
                                                                String pian112 = youYin.getPian();
                                                                m.e(pian112, "getPian(...)");
                                                                strQ3 = x.q0(x.q0(pian112, "(", BuildConfig.VERSION_NAME), ")", BuildConfig.VERSION_NAME);
                                                                length5 = strQ3.length() - 1;
                                                                i26 = 0;
                                                                z24 = false;
                                                                while (i26 <= length5) {
                                                                    if (z24) {
                                                                        i27 = i26;
                                                                    } else {
                                                                        i27 = length5;
                                                                    }
                                                                    if (m.h(strQ3.charAt(i27), 32) <= 0) {
                                                                        z25 = true;
                                                                    } else {
                                                                        z25 = false;
                                                                    }
                                                                    if (z24) {
                                                                        if (z25) {
                                                                            z24 = true;
                                                                        } else {
                                                                            i26++;
                                                                        }
                                                                    } else if (z25) {
                                                                        String lowerCase11117 = w4.c.g(strQ3, length5, 1, i26).toLowerCase(Locale.ROOT);
                                                                        m.e(lowerCase11117, "toLowerCase(...)");
                                                                        sb2.append(lowerCase11117);
                                                                    } else {
                                                                        length5--;
                                                                    }
                                                                }
                                                                String lowerCase11118 = w4.c.g(strQ3, length5, 1, i26).toLowerCase(Locale.ROOT);
                                                                m.e(lowerCase11118, "toLowerCase(...)");
                                                                sb2.append(lowerCase11118);
                                                            }
                                                        }
                                                        break;
                                                    } else {
                                                        zhuoYin = (ZhuoYin) it2.next();
                                                        word3 = word.getWord();
                                                        iB5 = w4.c.b(1, word3, "getWord(...)");
                                                        i30 = 0;
                                                        z28 = false;
                                                        while (i30 <= iB5) {
                                                            if (z28) {
                                                                i35 = i30;
                                                            } else {
                                                                i35 = iB5;
                                                            }
                                                            if (m.h(word3.charAt(i35), 32) <= 0) {
                                                                z33 = true;
                                                            } else {
                                                                z33 = false;
                                                            }
                                                            if (z28) {
                                                                if (z33) {
                                                                    z28 = true;
                                                                } else {
                                                                    i30++;
                                                                }
                                                            } else if (z33) {
                                                                strG2 = w4.c.g(word3, iB5, 1, i30);
                                                                String ping13 = zhuoYin.getPing();
                                                                m.e(ping13, ypOOxsaJG.hziLDAbZxV);
                                                                strQ4 = x.q0(x.q0(ping13, "(", BuildConfig.VERSION_NAME), ")", BuildConfig.VERSION_NAME);
                                                                length6 = strQ4.length() - 1;
                                                                i31 = 0;
                                                                z29 = false;
                                                                while (i31 <= length6) {
                                                                    if (z29) {
                                                                        i34 = i31;
                                                                    } else {
                                                                        i34 = length6;
                                                                    }
                                                                    if (m.h(strQ4.charAt(i34), 32) <= 0) {
                                                                        z32 = true;
                                                                    } else {
                                                                        z32 = false;
                                                                    }
                                                                    if (z29) {
                                                                        if (z32) {
                                                                            z29 = true;
                                                                        } else {
                                                                            i31++;
                                                                        }
                                                                    } else if (z32) {
                                                                        lowerCase6 = w4.c.g(strQ4, length6, 1, i31).toLowerCase(Locale.ROOT);
                                                                        m.e(lowerCase6, "toLowerCase(...)");
                                                                        if (m.a(strG2, lowerCase6)) {
                                                                            String pian113 = zhuoYin.getPian();
                                                                            m.e(pian113, "getPian(...)");
                                                                            strQ5 = x.q0(x.q0(pian113, "(", BuildConfig.VERSION_NAME), ")", BuildConfig.VERSION_NAME);
                                                                            length7 = strQ5.length() - 1;
                                                                            i32 = 0;
                                                                            z30 = false;
                                                                            while (i32 <= length7) {
                                                                                if (z30) {
                                                                                    i33 = i32;
                                                                                } else {
                                                                                    i33 = length7;
                                                                                }
                                                                                if (m.h(strQ5.charAt(i33), 32) <= 0) {
                                                                                    z31 = true;
                                                                                } else {
                                                                                    z31 = false;
                                                                                }
                                                                                if (z30) {
                                                                                    if (z31) {
                                                                                        z30 = true;
                                                                                    } else {
                                                                                        i32++;
                                                                                    }
                                                                                } else if (z31) {
                                                                                    String lowerCase11119 = w4.c.g(strQ5, length7, 1, i32).toLowerCase(Locale.ROOT);
                                                                                    m.e(lowerCase11119, "toLowerCase(...)");
                                                                                    sb2.append(lowerCase11119);
                                                                                } else {
                                                                                    length7--;
                                                                                }
                                                                            }
                                                                            String lowerCase111110 = w4.c.g(strQ5, length7, 1, i32).toLowerCase(Locale.ROOT);
                                                                            m.e(lowerCase111110, "toLowerCase(...)");
                                                                            sb2.append(lowerCase111110);
                                                                        }
                                                                    } else {
                                                                        length6--;
                                                                    }
                                                                }
                                                                lowerCase6 = w4.c.g(strQ4, length6, 1, i31).toLowerCase(Locale.ROOT);
                                                                m.e(lowerCase6, "toLowerCase(...)");
                                                                if (m.a(strG2, lowerCase6)) {
                                                                    String pian114 = zhuoYin.getPian();
                                                                    m.e(pian114, "getPian(...)");
                                                                    strQ5 = x.q0(x.q0(pian114, "(", BuildConfig.VERSION_NAME), ")", BuildConfig.VERSION_NAME);
                                                                    length7 = strQ5.length() - 1;
                                                                    i32 = 0;
                                                                    z30 = false;
                                                                    while (i32 <= length7) {
                                                                        if (z30) {
                                                                            i33 = i32;
                                                                        } else {
                                                                            i33 = length7;
                                                                        }
                                                                        if (m.h(strQ5.charAt(i33), 32) <= 0) {
                                                                            z31 = true;
                                                                        } else {
                                                                            z31 = false;
                                                                        }
                                                                        if (z30) {
                                                                            if (z31) {
                                                                                z30 = true;
                                                                            } else {
                                                                                i32++;
                                                                            }
                                                                        } else if (z31) {
                                                                            String lowerCase111111 = w4.c.g(strQ5, length7, 1, i32).toLowerCase(Locale.ROOT);
                                                                            m.e(lowerCase111111, "toLowerCase(...)");
                                                                            sb2.append(lowerCase111111);
                                                                        } else {
                                                                            length7--;
                                                                        }
                                                                    }
                                                                    String lowerCase111112 = w4.c.g(strQ5, length7, 1, i32).toLowerCase(Locale.ROOT);
                                                                    m.e(lowerCase111112, "toLowerCase(...)");
                                                                    sb2.append(lowerCase111112);
                                                                }
                                                            } else {
                                                                iB5--;
                                                            }
                                                        }
                                                        strG2 = w4.c.g(word3, iB5, 1, i30);
                                                        String ping14 = zhuoYin.getPing();
                                                        m.e(ping14, ypOOxsaJG.hziLDAbZxV);
                                                        strQ4 = x.q0(x.q0(ping14, "(", BuildConfig.VERSION_NAME), ")", BuildConfig.VERSION_NAME);
                                                        length6 = strQ4.length() - 1;
                                                        i31 = 0;
                                                        z29 = false;
                                                        while (i31 <= length6) {
                                                            if (z29) {
                                                                i34 = i31;
                                                            } else {
                                                                i34 = length6;
                                                            }
                                                            if (m.h(strQ4.charAt(i34), 32) <= 0) {
                                                                z32 = true;
                                                            } else {
                                                                z32 = false;
                                                            }
                                                            if (z29) {
                                                                if (z32) {
                                                                    z29 = true;
                                                                } else {
                                                                    i31++;
                                                                }
                                                            } else if (z32) {
                                                                lowerCase6 = w4.c.g(strQ4, length6, 1, i31).toLowerCase(Locale.ROOT);
                                                                m.e(lowerCase6, "toLowerCase(...)");
                                                                if (m.a(strG2, lowerCase6)) {
                                                                    String pian115 = zhuoYin.getPian();
                                                                    m.e(pian115, "getPian(...)");
                                                                    strQ5 = x.q0(x.q0(pian115, "(", BuildConfig.VERSION_NAME), ")", BuildConfig.VERSION_NAME);
                                                                    length7 = strQ5.length() - 1;
                                                                    i32 = 0;
                                                                    z30 = false;
                                                                    while (i32 <= length7) {
                                                                        if (z30) {
                                                                            i33 = i32;
                                                                        } else {
                                                                            i33 = length7;
                                                                        }
                                                                        if (m.h(strQ5.charAt(i33), 32) <= 0) {
                                                                            z31 = true;
                                                                        } else {
                                                                            z31 = false;
                                                                        }
                                                                        if (z30) {
                                                                            if (z31) {
                                                                                z30 = true;
                                                                            } else {
                                                                                i32++;
                                                                            }
                                                                        } else if (z31) {
                                                                            String lowerCase111113 = w4.c.g(strQ5, length7, 1, i32).toLowerCase(Locale.ROOT);
                                                                            m.e(lowerCase111113, "toLowerCase(...)");
                                                                            sb2.append(lowerCase111113);
                                                                        } else {
                                                                            length7--;
                                                                        }
                                                                    }
                                                                    String lowerCase111114 = w4.c.g(strQ5, length7, 1, i32).toLowerCase(Locale.ROOT);
                                                                    m.e(lowerCase111114, "toLowerCase(...)");
                                                                    sb2.append(lowerCase111114);
                                                                }
                                                            } else {
                                                                length6--;
                                                            }
                                                        }
                                                        lowerCase6 = w4.c.g(strQ4, length6, 1, i31).toLowerCase(Locale.ROOT);
                                                        m.e(lowerCase6, "toLowerCase(...)");
                                                        if (m.a(strG2, lowerCase6)) {
                                                            String pian116 = zhuoYin.getPian();
                                                            m.e(pian116, "getPian(...)");
                                                            strQ5 = x.q0(x.q0(pian116, "(", BuildConfig.VERSION_NAME), ")", BuildConfig.VERSION_NAME);
                                                            length7 = strQ5.length() - 1;
                                                            i32 = 0;
                                                            z30 = false;
                                                            while (i32 <= length7) {
                                                                if (z30) {
                                                                    i33 = i32;
                                                                } else {
                                                                    i33 = length7;
                                                                }
                                                                if (m.h(strQ5.charAt(i33), 32) <= 0) {
                                                                    z31 = true;
                                                                } else {
                                                                    z31 = false;
                                                                }
                                                                if (z30) {
                                                                    if (z31) {
                                                                        z30 = true;
                                                                    } else {
                                                                        i32++;
                                                                    }
                                                                } else if (z31) {
                                                                    String lowerCase111115 = w4.c.g(strQ5, length7, 1, i32).toLowerCase(Locale.ROOT);
                                                                    m.e(lowerCase111115, "toLowerCase(...)");
                                                                    sb2.append(lowerCase111115);
                                                                } else {
                                                                    length7--;
                                                                }
                                                            }
                                                            String lowerCase111116 = w4.c.g(strQ5, length7, 1, i32).toLowerCase(Locale.ROOT);
                                                            m.e(lowerCase111116, "toLowerCase(...)");
                                                            sb2.append(lowerCase111116);
                                                        }
                                                    }
                                                }
                                                break;
                                            } else {
                                                yinTu = (YinTu) it.next();
                                                word4 = word.getWord();
                                                iB6 = w4.c.b(1, word4, "getWord(...)");
                                                i36 = 0;
                                                z34 = false;
                                                while (true) {
                                                    it4 = it4;
                                                    if (i36 <= iB6) {
                                                        if (z34) {
                                                            i41 = i36;
                                                        } else {
                                                            i41 = iB6;
                                                        }
                                                        lowerCase = lowerCase;
                                                        if (m.h(word4.charAt(i41), 32) <= 0) {
                                                            z39 = true;
                                                        } else {
                                                            z39 = false;
                                                        }
                                                        if (z34) {
                                                            if (z39) {
                                                                z34 = true;
                                                            } else {
                                                                i36++;
                                                            }
                                                        } else if (!z39) {
                                                            iB6--;
                                                        }
                                                    } else {
                                                        lowerCase = lowerCase;
                                                    }
                                                }
                                                strG3 = w4.c.g(word4, iB6, 1, i36);
                                                String ping15 = yinTu.getPing();
                                                m.e(ping15, "getPing(...)");
                                                strQ6 = x.q0(x.q0(ping15, "(", BuildConfig.VERSION_NAME), ")", BuildConfig.VERSION_NAME);
                                                length8 = strQ6.length() - 1;
                                                i37 = 0;
                                                z35 = false;
                                                while (true) {
                                                    lowerCase2 = lowerCase2;
                                                    if (i37 <= length8) {
                                                        if (z35) {
                                                            i40 = i37;
                                                        } else {
                                                            i40 = length8;
                                                        }
                                                        arrayListD = arrayListD;
                                                        if (m.h(strQ6.charAt(i40), 32) <= 0) {
                                                            z38 = true;
                                                        } else {
                                                            z38 = false;
                                                        }
                                                        if (z35) {
                                                            if (z38) {
                                                                z35 = true;
                                                            } else {
                                                                i37++;
                                                            }
                                                        } else if (!z38) {
                                                            length8--;
                                                        }
                                                    } else {
                                                        arrayListD = arrayListD;
                                                    }
                                                }
                                                lowerCase7 = w4.c.g(strQ6, length8, 1, i37).toLowerCase(Locale.ROOT);
                                                m.e(lowerCase7, "toLowerCase(...)");
                                                if (m.a(strG3, lowerCase7)) {
                                                    String pian117 = yinTu.getPian();
                                                    m.e(pian117, "getPian(...)");
                                                    strQ7 = x.q0(x.q0(pian117, "(", BuildConfig.VERSION_NAME), ")", BuildConfig.VERSION_NAME);
                                                    length9 = strQ7.length() - 1;
                                                    i38 = 0;
                                                    z36 = false;
                                                    while (i38 <= length9) {
                                                        if (z36) {
                                                            i39 = i38;
                                                        } else {
                                                            i39 = length9;
                                                        }
                                                        if (m.h(strQ7.charAt(i39), 32) <= 0) {
                                                            z37 = true;
                                                        } else {
                                                            z37 = false;
                                                        }
                                                        if (z36) {
                                                            if (z37) {
                                                                z36 = true;
                                                            } else {
                                                                i38++;
                                                            }
                                                        } else if (z37) {
                                                            String lowerCase28 = w4.c.g(strQ7, length9, 1, i38).toLowerCase(Locale.ROOT);
                                                            m.e(lowerCase28, "toLowerCase(...)");
                                                            sb2.append(lowerCase28);
                                                        } else {
                                                            length9--;
                                                        }
                                                    }
                                                    String lowerCase29 = w4.c.g(strQ7, length9, 1, i38).toLowerCase(Locale.ROOT);
                                                    m.e(lowerCase29, "toLowerCase(...)");
                                                    sb2.append(lowerCase29);
                                                } else {
                                                    lowerCase2 = lowerCase2;
                                                    it4 = it4;
                                                    lowerCase = lowerCase;
                                                    arrayListD = arrayListD;
                                                }
                                            }
                                        }
                                        lowerCase2 = lowerCase2;
                                        it4 = it4;
                                        lowerCase = lowerCase;
                                        arrayListD = arrayListD;
                                    }
                                    break;
                                }
                                Iterator<Word> it7 = it4;
                                str = lowerCase;
                                str2 = lowerCase2;
                                string = sb2.toString();
                                iB2 = w4.c.b(1, string, "toString(...)");
                                i15 = 0;
                                z14 = false;
                                while (i15 <= iB2) {
                                    if (z14) {
                                        i23 = i15;
                                    } else {
                                        i23 = iB2;
                                    }
                                    if (m.h(string.charAt(i23), 32) <= 0) {
                                        z21 = true;
                                    } else {
                                        z21 = false;
                                    }
                                    if (z14) {
                                        if (z21) {
                                            z14 = true;
                                        } else {
                                            i15++;
                                        }
                                    } else if (z21) {
                                        String lowerCase210 = x.q0(w4.c.g(string, iB2, 1, i15), " ", BuildConfig.VERSION_NAME).toLowerCase(Locale.ROOT);
                                        m.e(lowerCase210, "toLowerCase(...)");
                                        sb3 = new StringBuilder(lowerCase210);
                                        Luoma = next2.Luoma;
                                        m.e(Luoma, "Luoma");
                                        if (q.W0(Luoma, new String[]{"#"}, 0, 6).toArray(new String[0]).length > 1) {
                                            String Luoma14 = next2.Luoma;
                                            m.e(Luoma14, "Luoma");
                                            str3 = ((String[]) q.W0(Luoma14, new String[]{"#"}, 0, 6).toArray(new String[0]))[0];
                                            length2 = str3.length() - 1;
                                            i18 = 0;
                                            z17 = false;
                                            while (i18 <= length2) {
                                                if (z17) {
                                                    i22 = i18;
                                                } else {
                                                    i22 = length2;
                                                }
                                                if (m.h(str3.charAt(i22), 32) <= 0) {
                                                    z20 = true;
                                                } else {
                                                    z20 = false;
                                                }
                                                if (z17) {
                                                    if (z20) {
                                                        z17 = true;
                                                    } else {
                                                        i18++;
                                                    }
                                                } else if (z20) {
                                                    lowerCase3 = x.q0(x.q0(x.q0(w4.c.g(str3, length2, 1, i18), "_", " "), " ", BuildConfig.VERSION_NAME), "-", BuildConfig.VERSION_NAME).toLowerCase(Locale.ROOT);
                                                    m.e(lowerCase3, tcppUUQxZjFdy.qvcOg);
                                                    String Luoma15 = next2.Luoma;
                                                    m.e(Luoma15, "Luoma");
                                                    str4 = ((String[]) q.W0(Luoma15, new String[]{"#"}, 0, 6).toArray(new String[0]))[1];
                                                    length3 = str4.length() - 1;
                                                    i19 = 0;
                                                    z18 = false;
                                                    while (i19 <= length3) {
                                                        if (z18) {
                                                            i21 = i19;
                                                        } else {
                                                            i21 = length3;
                                                        }
                                                        if (m.h(str4.charAt(i21), 32) <= 0) {
                                                            z19 = true;
                                                        } else {
                                                            z19 = false;
                                                        }
                                                        if (z18) {
                                                            if (z19) {
                                                                z18 = true;
                                                            } else {
                                                                i19++;
                                                            }
                                                        } else if (z19) {
                                                            lowerCase4 = x.q0(x.q0(x.q0(w4.c.g(str4, length3, 1, i19), "_", " "), " ", BuildConfig.VERSION_NAME), "-", BuildConfig.VERSION_NAME).toLowerCase(Locale.ROOT);
                                                            m.e(lowerCase4, "toLowerCase(...)");
                                                        } else {
                                                            length3--;
                                                        }
                                                    }
                                                    lowerCase4 = x.q0(x.q0(x.q0(w4.c.g(str4, length3, 1, i19), "_", " "), " ", BuildConfig.VERSION_NAME), "-", BuildConfig.VERSION_NAME).toLowerCase(Locale.ROOT);
                                                    m.e(lowerCase4, "toLowerCase(...)");
                                                } else {
                                                    length2--;
                                                }
                                            }
                                            lowerCase3 = x.q0(x.q0(x.q0(w4.c.g(str3, length2, 1, i18), "_", " "), " ", BuildConfig.VERSION_NAME), "-", BuildConfig.VERSION_NAME).toLowerCase(Locale.ROOT);
                                            m.e(lowerCase3, tcppUUQxZjFdy.qvcOg);
                                            String Luoma16 = next2.Luoma;
                                            m.e(Luoma16, "Luoma");
                                            str4 = ((String[]) q.W0(Luoma16, new String[]{"#"}, 0, 6).toArray(new String[0]))[1];
                                            length3 = str4.length() - 1;
                                            i19 = 0;
                                            z18 = false;
                                            while (i19 <= length3) {
                                                if (z18) {
                                                    i21 = i19;
                                                } else {
                                                    i21 = length3;
                                                }
                                                if (m.h(str4.charAt(i21), 32) <= 0) {
                                                    z19 = true;
                                                } else {
                                                    z19 = false;
                                                }
                                                if (z18) {
                                                    if (z19) {
                                                        z18 = true;
                                                    } else {
                                                        i19++;
                                                    }
                                                } else if (z19) {
                                                    lowerCase4 = x.q0(x.q0(x.q0(w4.c.g(str4, length3, 1, i19), "_", " "), " ", BuildConfig.VERSION_NAME), "-", BuildConfig.VERSION_NAME).toLowerCase(Locale.ROOT);
                                                    m.e(lowerCase4, "toLowerCase(...)");
                                                } else {
                                                    length3--;
                                                }
                                            }
                                            lowerCase4 = x.q0(x.q0(x.q0(w4.c.g(str4, length3, 1, i19), "_", " "), " ", BuildConfig.VERSION_NAME), "-", BuildConfig.VERSION_NAME).toLowerCase(Locale.ROOT);
                                            m.e(lowerCase4, "toLowerCase(...)");
                                        } else {
                                            luoma = next2.getLuoma();
                                            iB3 = w4.c.b(1, luoma, "getLuoma(...)");
                                            i16 = 0;
                                            z15 = false;
                                            while (i16 <= iB3) {
                                                if (z15) {
                                                    i17 = i16;
                                                } else {
                                                    i17 = iB3;
                                                }
                                                if (m.h(luoma.charAt(i17), 32) <= 0) {
                                                    z16 = true;
                                                } else {
                                                    z16 = false;
                                                }
                                                if (z15) {
                                                    if (z16) {
                                                        z15 = true;
                                                    } else {
                                                        i16++;
                                                    }
                                                } else if (z16) {
                                                    lowerCase3 = x.q0(x.q0(w4.c.g(luoma, iB3, 1, i16), " ", BuildConfig.VERSION_NAME), "-", BuildConfig.VERSION_NAME).toLowerCase(Locale.ROOT);
                                                    m.e(lowerCase3, "toLowerCase(...)");
                                                    lowerCase4 = lowerCase3;
                                                } else {
                                                    iB3--;
                                                }
                                            }
                                            lowerCase3 = x.q0(x.q0(w4.c.g(luoma, iB3, 1, i16), " ", BuildConfig.VERSION_NAME), "-", BuildConfig.VERSION_NAME).toLowerCase(Locale.ROOT);
                                            m.e(lowerCase3, "toLowerCase(...)");
                                            lowerCase4 = lowerCase3;
                                        }
                                        if (x.s0(lowerCase8, qi.b.a(str), false)) {
                                            Pattern patternCompile1110 = Pattern.compile(str);
                                            m.e(patternCompile1110, "compile(...)");
                                            lowerCase8 = patternCompile1110.matcher(lowerCase8).replaceFirst(BuildConfig.VERSION_NAME);
                                            m.e(lowerCase8, "replaceFirst(...)");
                                        } else if (x.s0(lowerCase8, qi.b.a(str2), false)) {
                                            Pattern patternCompile1111 = Pattern.compile(str2);
                                            m.e(patternCompile1111, "compile(...)");
                                            lowerCase8 = patternCompile1111.matcher(lowerCase8).replaceFirst(BuildConfig.VERSION_NAME);
                                            m.e(lowerCase8, "replaceFirst(...)");
                                        } else {
                                            string2 = sb3.toString();
                                            m.e(string2, "toString(...)");
                                            if (x.s0(lowerCase8, qi.b.a(string2), false)) {
                                                String string7 = sb3.toString();
                                                m.e(string7, "toString(...)");
                                                Pattern patternCompile1112 = Pattern.compile(string7);
                                                m.e(patternCompile1112, "compile(...)");
                                                lowerCase8 = patternCompile1112.matcher(lowerCase8).replaceFirst(BuildConfig.VERSION_NAME);
                                                m.e(lowerCase8, "replaceFirst(...)");
                                            } else if (x.s0(lowerCase8, qi.b.a(lowerCase3), false)) {
                                                Pattern patternCompile1113 = Pattern.compile(lowerCase3);
                                                m.e(patternCompile1113, "compile(...)");
                                                lowerCase8 = patternCompile1113.matcher(lowerCase8).replaceFirst(BuildConfig.VERSION_NAME);
                                                m.e(lowerCase8, "replaceFirst(...)");
                                            } else {
                                                if (x.s0(lowerCase8, qi.b.a(lowerCase4), false)) {
                                                    t(false);
                                                    LingoSkillApplication lingoSkillApplication19 = LingoSkillApplication.f21665b;
                                                    String checkAnswerPrompt10 = this.f47884d.checkAnswerPrompt;
                                                    m.e(checkAnswerPrompt10, "checkAnswerPrompt");
                                                    String strQ113 = x.q0(checkAnswerPrompt10, "userSentence%", lowerCase8);
                                                    String translations10 = r().getTranslations();
                                                    m.e(translations10, "getTranslations(...)");
                                                    String strQ24 = x.q0(strQ113, "translation%", translations10);
                                                    String sentence10 = r().getSentence();
                                                    m.e(sentence10, "getSentence(...)");
                                                    x.q0(strQ24, "correctSentence%", sentence10);
                                                    return false;
                                                }
                                                Pattern patternCompile1114 = Pattern.compile(lowerCase4);
                                                m.e(patternCompile1114, "compile(...)");
                                                lowerCase8 = patternCompile1114.matcher(lowerCase8).replaceFirst(BuildConfig.VERSION_NAME);
                                                m.e(lowerCase8, "replaceFirst(...)");
                                            }
                                        }
                                        it4 = it7;
                                    } else {
                                        iB2--;
                                    }
                                }
                                String lowerCase211 = x.q0(w4.c.g(string, iB2, 1, i15), " ", BuildConfig.VERSION_NAME).toLowerCase(Locale.ROOT);
                                m.e(lowerCase211, "toLowerCase(...)");
                                sb3 = new StringBuilder(lowerCase211);
                                Luoma = next2.Luoma;
                                m.e(Luoma, "Luoma");
                                if (q.W0(Luoma, new String[]{"#"}, 0, 6).toArray(new String[0]).length > 1) {
                                    String Luoma17 = next2.Luoma;
                                    m.e(Luoma17, "Luoma");
                                    str3 = ((String[]) q.W0(Luoma17, new String[]{"#"}, 0, 6).toArray(new String[0]))[0];
                                    length2 = str3.length() - 1;
                                    i18 = 0;
                                    z17 = false;
                                    while (i18 <= length2) {
                                        if (z17) {
                                            i22 = i18;
                                        } else {
                                            i22 = length2;
                                        }
                                        if (m.h(str3.charAt(i22), 32) <= 0) {
                                            z20 = true;
                                        } else {
                                            z20 = false;
                                        }
                                        if (z17) {
                                            if (z20) {
                                                z17 = true;
                                            } else {
                                                i18++;
                                            }
                                        } else if (z20) {
                                            lowerCase3 = x.q0(x.q0(x.q0(w4.c.g(str3, length2, 1, i18), "_", " "), " ", BuildConfig.VERSION_NAME), "-", BuildConfig.VERSION_NAME).toLowerCase(Locale.ROOT);
                                            m.e(lowerCase3, tcppUUQxZjFdy.qvcOg);
                                            String Luoma18 = next2.Luoma;
                                            m.e(Luoma18, "Luoma");
                                            str4 = ((String[]) q.W0(Luoma18, new String[]{"#"}, 0, 6).toArray(new String[0]))[1];
                                            length3 = str4.length() - 1;
                                            i19 = 0;
                                            z18 = false;
                                            while (i19 <= length3) {
                                                if (z18) {
                                                    i21 = i19;
                                                } else {
                                                    i21 = length3;
                                                }
                                                if (m.h(str4.charAt(i21), 32) <= 0) {
                                                    z19 = true;
                                                } else {
                                                    z19 = false;
                                                }
                                                if (z18) {
                                                    if (z19) {
                                                        z18 = true;
                                                    } else {
                                                        i19++;
                                                    }
                                                } else if (z19) {
                                                    lowerCase4 = x.q0(x.q0(x.q0(w4.c.g(str4, length3, 1, i19), "_", " "), " ", BuildConfig.VERSION_NAME), "-", BuildConfig.VERSION_NAME).toLowerCase(Locale.ROOT);
                                                    m.e(lowerCase4, "toLowerCase(...)");
                                                } else {
                                                    length3--;
                                                }
                                            }
                                            lowerCase4 = x.q0(x.q0(x.q0(w4.c.g(str4, length3, 1, i19), "_", " "), " ", BuildConfig.VERSION_NAME), "-", BuildConfig.VERSION_NAME).toLowerCase(Locale.ROOT);
                                            m.e(lowerCase4, "toLowerCase(...)");
                                        } else {
                                            length2--;
                                        }
                                    }
                                    lowerCase3 = x.q0(x.q0(x.q0(w4.c.g(str3, length2, 1, i18), "_", " "), " ", BuildConfig.VERSION_NAME), "-", BuildConfig.VERSION_NAME).toLowerCase(Locale.ROOT);
                                    m.e(lowerCase3, tcppUUQxZjFdy.qvcOg);
                                    String Luoma19 = next2.Luoma;
                                    m.e(Luoma19, "Luoma");
                                    str4 = ((String[]) q.W0(Luoma19, new String[]{"#"}, 0, 6).toArray(new String[0]))[1];
                                    length3 = str4.length() - 1;
                                    i19 = 0;
                                    z18 = false;
                                    while (i19 <= length3) {
                                        if (z18) {
                                            i21 = i19;
                                        } else {
                                            i21 = length3;
                                        }
                                        if (m.h(str4.charAt(i21), 32) <= 0) {
                                            z19 = true;
                                        } else {
                                            z19 = false;
                                        }
                                        if (z18) {
                                            if (z19) {
                                                z18 = true;
                                            } else {
                                                i19++;
                                            }
                                        } else if (z19) {
                                            lowerCase4 = x.q0(x.q0(x.q0(w4.c.g(str4, length3, 1, i19), "_", " "), " ", BuildConfig.VERSION_NAME), "-", BuildConfig.VERSION_NAME).toLowerCase(Locale.ROOT);
                                            m.e(lowerCase4, "toLowerCase(...)");
                                        } else {
                                            length3--;
                                        }
                                    }
                                    lowerCase4 = x.q0(x.q0(x.q0(w4.c.g(str4, length3, 1, i19), "_", " "), " ", BuildConfig.VERSION_NAME), "-", BuildConfig.VERSION_NAME).toLowerCase(Locale.ROOT);
                                    m.e(lowerCase4, "toLowerCase(...)");
                                } else {
                                    luoma = next2.getLuoma();
                                    iB3 = w4.c.b(1, luoma, "getLuoma(...)");
                                    i16 = 0;
                                    z15 = false;
                                    while (i16 <= iB3) {
                                        if (z15) {
                                            i17 = i16;
                                        } else {
                                            i17 = iB3;
                                        }
                                        if (m.h(luoma.charAt(i17), 32) <= 0) {
                                            z16 = true;
                                        } else {
                                            z16 = false;
                                        }
                                        if (z15) {
                                            if (z16) {
                                                z15 = true;
                                            } else {
                                                i16++;
                                            }
                                        } else if (z16) {
                                            lowerCase3 = x.q0(x.q0(w4.c.g(luoma, iB3, 1, i16), " ", BuildConfig.VERSION_NAME), "-", BuildConfig.VERSION_NAME).toLowerCase(Locale.ROOT);
                                            m.e(lowerCase3, "toLowerCase(...)");
                                            lowerCase4 = lowerCase3;
                                        } else {
                                            iB3--;
                                        }
                                    }
                                    lowerCase3 = x.q0(x.q0(w4.c.g(luoma, iB3, 1, i16), " ", BuildConfig.VERSION_NAME), "-", BuildConfig.VERSION_NAME).toLowerCase(Locale.ROOT);
                                    m.e(lowerCase3, "toLowerCase(...)");
                                    lowerCase4 = lowerCase3;
                                }
                                if (x.s0(lowerCase8, qi.b.a(str), false)) {
                                    Pattern patternCompile1115 = Pattern.compile(str);
                                    m.e(patternCompile1115, "compile(...)");
                                    lowerCase8 = patternCompile1115.matcher(lowerCase8).replaceFirst(BuildConfig.VERSION_NAME);
                                    m.e(lowerCase8, "replaceFirst(...)");
                                } else if (x.s0(lowerCase8, qi.b.a(str2), false)) {
                                    Pattern patternCompile1116 = Pattern.compile(str2);
                                    m.e(patternCompile1116, "compile(...)");
                                    lowerCase8 = patternCompile1116.matcher(lowerCase8).replaceFirst(BuildConfig.VERSION_NAME);
                                    m.e(lowerCase8, "replaceFirst(...)");
                                } else {
                                    string2 = sb3.toString();
                                    m.e(string2, "toString(...)");
                                    if (x.s0(lowerCase8, qi.b.a(string2), false)) {
                                        String string8 = sb3.toString();
                                        m.e(string8, "toString(...)");
                                        Pattern patternCompile1117 = Pattern.compile(string8);
                                        m.e(patternCompile1117, "compile(...)");
                                        lowerCase8 = patternCompile1117.matcher(lowerCase8).replaceFirst(BuildConfig.VERSION_NAME);
                                        m.e(lowerCase8, "replaceFirst(...)");
                                    } else if (x.s0(lowerCase8, qi.b.a(lowerCase3), false)) {
                                        Pattern patternCompile1118 = Pattern.compile(lowerCase3);
                                        m.e(patternCompile1118, "compile(...)");
                                        lowerCase8 = patternCompile1118.matcher(lowerCase8).replaceFirst(BuildConfig.VERSION_NAME);
                                        m.e(lowerCase8, "replaceFirst(...)");
                                    } else {
                                        if (x.s0(lowerCase8, qi.b.a(lowerCase4), false)) {
                                            t(false);
                                            LingoSkillApplication lingoSkillApplication110 = LingoSkillApplication.f21665b;
                                            String checkAnswerPrompt11 = this.f47884d.checkAnswerPrompt;
                                            m.e(checkAnswerPrompt11, "checkAnswerPrompt");
                                            String strQ114 = x.q0(checkAnswerPrompt11, "userSentence%", lowerCase8);
                                            String translations11 = r().getTranslations();
                                            m.e(translations11, "getTranslations(...)");
                                            String strQ25 = x.q0(strQ114, "translation%", translations11);
                                            String sentence11 = r().getSentence();
                                            m.e(sentence11, "getSentence(...)");
                                            x.q0(strQ25, "correctSentence%", sentence11);
                                            return false;
                                        }
                                        Pattern patternCompile1119 = Pattern.compile(lowerCase4);
                                        m.e(patternCompile1119, "compile(...)");
                                        lowerCase8 = patternCompile1119.matcher(lowerCase8).replaceFirst(BuildConfig.VERSION_NAME);
                                        m.e(lowerCase8, "replaceFirst(...)");
                                    }
                                }
                                it4 = it7;
                            } else {
                                length--;
                            }
                        }
                        lowerCase2 = x.q0(w4.c.g(zhuyin2, length, 1, i13), " ", BuildConfig.VERSION_NAME).toLowerCase(Locale.ROOT);
                        m.e(lowerCase2, "toLowerCase(...)");
                        arrayListD = qi.b.d(next2);
                        sb2 = new StringBuilder();
                        size = arrayListD.size();
                        i14 = 0;
                        while (i14 < size) {
                            Object obj4 = arrayListD.get(i14);
                            i14++;
                            word = (Word) obj4;
                            if (m.a(word.getWord(), "っ")) {
                                sb2.append("ッ");
                            } else {
                                if (dm.a.f23483c == null) {
                                    synchronized (dm.a.class) {
                                        if (dm.a.f23483c == null) {
                                            LingoSkillApplication lingoSkillApplication111 = LingoSkillApplication.f21665b;
                                            m.c(lingoSkillApplication111);
                                            dm.a.f23483c = new dm.a(lingoSkillApplication111);
                                        }
                                    }
                                }
                                dm.a aVar16 = dm.a.f23483c;
                                m.c(aVar16);
                                List listD10 = aVar16.o().queryBuilder().d();
                                m.e(listD10, "list(...)");
                                it = listD10.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        it4 = it4;
                                        lowerCase = lowerCase;
                                        lowerCase2 = lowerCase2;
                                        arrayListD = arrayListD;
                                        if (dm.a.f23483c == null) {
                                            synchronized (dm.a.class) {
                                                if (dm.a.f23483c == null) {
                                                    LingoSkillApplication lingoSkillApplication112 = LingoSkillApplication.f21665b;
                                                    m.c(lingoSkillApplication112);
                                                    dm.a.f23483c = new dm.a(lingoSkillApplication112);
                                                }
                                            }
                                        }
                                        dm.a aVar17 = dm.a.f23483c;
                                        m.c(aVar17);
                                        List listD11 = aVar17.t().queryBuilder().d();
                                        m.e(listD11, "list(...)");
                                        it2 = listD11.iterator();
                                        while (true) {
                                            if (it2.hasNext()) {
                                                if (dm.a.f23483c == null) {
                                                    synchronized (dm.a.class) {
                                                        if (dm.a.f23483c == null) {
                                                            LingoSkillApplication lingoSkillApplication113 = LingoSkillApplication.f21665b;
                                                            m.c(lingoSkillApplication113);
                                                            dm.a.f23483c = new dm.a(lingoSkillApplication113);
                                                        }
                                                    }
                                                }
                                                dm.a aVar18 = dm.a.f23483c;
                                                m.c(aVar18);
                                                List<YouYin> listD12 = aVar18.s().queryBuilder().d();
                                                m.e(listD12, "list(...)");
                                                while (r2.hasNext()) {
                                                    word2 = word.getWord();
                                                    iB4 = w4.c.b(1, word2, "getWord(...)");
                                                    i24 = 0;
                                                    z22 = false;
                                                    while (i24 <= iB4) {
                                                        if (z22) {
                                                            i29 = i24;
                                                        } else {
                                                            i29 = iB4;
                                                        }
                                                        if (m.h(word2.charAt(i29), 32) <= 0) {
                                                            z27 = true;
                                                        } else {
                                                            z27 = false;
                                                        }
                                                        if (z22) {
                                                            if (z27) {
                                                                z22 = true;
                                                            } else {
                                                                i24++;
                                                            }
                                                        } else if (z27) {
                                                            strG = w4.c.g(word2, iB4, 1, i24);
                                                            String ping16 = youYin.getPing();
                                                            m.e(ping16, "getPing(...)");
                                                            strQ2 = x.q0(x.q0(ping16, "(", BuildConfig.VERSION_NAME), ")", BuildConfig.VERSION_NAME);
                                                            length4 = strQ2.length() - 1;
                                                            i25 = 0;
                                                            z23 = false;
                                                            while (i25 <= length4) {
                                                                if (z23) {
                                                                    i28 = i25;
                                                                } else {
                                                                    i28 = length4;
                                                                }
                                                                if (m.h(strQ2.charAt(i28), 32) <= 0) {
                                                                    z26 = true;
                                                                } else {
                                                                    z26 = false;
                                                                }
                                                                if (z23) {
                                                                    if (z26) {
                                                                        z23 = true;
                                                                    } else {
                                                                        i25++;
                                                                    }
                                                                } else if (z26) {
                                                                    lowerCase5 = w4.c.g(strQ2, length4, 1, i25).toLowerCase(Locale.ROOT);
                                                                    m.e(lowerCase5, "toLowerCase(...)");
                                                                    if (m.a(strG, lowerCase5)) {
                                                                        String pian118 = youYin.getPian();
                                                                        m.e(pian118, "getPian(...)");
                                                                        strQ3 = x.q0(x.q0(pian118, "(", BuildConfig.VERSION_NAME), ")", BuildConfig.VERSION_NAME);
                                                                        length5 = strQ3.length() - 1;
                                                                        i26 = 0;
                                                                        z24 = false;
                                                                        while (i26 <= length5) {
                                                                            if (z24) {
                                                                                i27 = i26;
                                                                            } else {
                                                                                i27 = length5;
                                                                            }
                                                                            if (m.h(strQ3.charAt(i27), 32) <= 0) {
                                                                                z25 = true;
                                                                            } else {
                                                                                z25 = false;
                                                                            }
                                                                            if (z24) {
                                                                                if (z25) {
                                                                                    z24 = true;
                                                                                } else {
                                                                                    i26++;
                                                                                }
                                                                            } else if (z25) {
                                                                                String lowerCase111117 = w4.c.g(strQ3, length5, 1, i26).toLowerCase(Locale.ROOT);
                                                                                m.e(lowerCase111117, "toLowerCase(...)");
                                                                                sb2.append(lowerCase111117);
                                                                            } else {
                                                                                length5--;
                                                                            }
                                                                        }
                                                                        String lowerCase111118 = w4.c.g(strQ3, length5, 1, i26).toLowerCase(Locale.ROOT);
                                                                        m.e(lowerCase111118, "toLowerCase(...)");
                                                                        sb2.append(lowerCase111118);
                                                                    }
                                                                } else {
                                                                    length4--;
                                                                }
                                                            }
                                                            lowerCase5 = w4.c.g(strQ2, length4, 1, i25).toLowerCase(Locale.ROOT);
                                                            m.e(lowerCase5, "toLowerCase(...)");
                                                            if (m.a(strG, lowerCase5)) {
                                                                String pian119 = youYin.getPian();
                                                                m.e(pian119, "getPian(...)");
                                                                strQ3 = x.q0(x.q0(pian119, "(", BuildConfig.VERSION_NAME), ")", BuildConfig.VERSION_NAME);
                                                                length5 = strQ3.length() - 1;
                                                                i26 = 0;
                                                                z24 = false;
                                                                while (i26 <= length5) {
                                                                    if (z24) {
                                                                        i27 = i26;
                                                                    } else {
                                                                        i27 = length5;
                                                                    }
                                                                    if (m.h(strQ3.charAt(i27), 32) <= 0) {
                                                                        z25 = true;
                                                                    } else {
                                                                        z25 = false;
                                                                    }
                                                                    if (z24) {
                                                                        if (z25) {
                                                                            z24 = true;
                                                                        } else {
                                                                            i26++;
                                                                        }
                                                                    } else if (z25) {
                                                                        String lowerCase111119 = w4.c.g(strQ3, length5, 1, i26).toLowerCase(Locale.ROOT);
                                                                        m.e(lowerCase111119, "toLowerCase(...)");
                                                                        sb2.append(lowerCase111119);
                                                                    } else {
                                                                        length5--;
                                                                    }
                                                                }
                                                                String lowerCase1111110 = w4.c.g(strQ3, length5, 1, i26).toLowerCase(Locale.ROOT);
                                                                m.e(lowerCase1111110, "toLowerCase(...)");
                                                                sb2.append(lowerCase1111110);
                                                            }
                                                        } else {
                                                            iB4--;
                                                        }
                                                    }
                                                    strG = w4.c.g(word2, iB4, 1, i24);
                                                    String ping17 = youYin.getPing();
                                                    m.e(ping17, "getPing(...)");
                                                    strQ2 = x.q0(x.q0(ping17, "(", BuildConfig.VERSION_NAME), ")", BuildConfig.VERSION_NAME);
                                                    length4 = strQ2.length() - 1;
                                                    i25 = 0;
                                                    z23 = false;
                                                    while (i25 <= length4) {
                                                        if (z23) {
                                                            i28 = i25;
                                                        } else {
                                                            i28 = length4;
                                                        }
                                                        if (m.h(strQ2.charAt(i28), 32) <= 0) {
                                                            z26 = true;
                                                        } else {
                                                            z26 = false;
                                                        }
                                                        if (z23) {
                                                            if (z26) {
                                                                z23 = true;
                                                            } else {
                                                                i25++;
                                                            }
                                                        } else if (z26) {
                                                            lowerCase5 = w4.c.g(strQ2, length4, 1, i25).toLowerCase(Locale.ROOT);
                                                            m.e(lowerCase5, "toLowerCase(...)");
                                                            if (m.a(strG, lowerCase5)) {
                                                                String pian1110 = youYin.getPian();
                                                                m.e(pian1110, "getPian(...)");
                                                                strQ3 = x.q0(x.q0(pian1110, "(", BuildConfig.VERSION_NAME), ")", BuildConfig.VERSION_NAME);
                                                                length5 = strQ3.length() - 1;
                                                                i26 = 0;
                                                                z24 = false;
                                                                while (i26 <= length5) {
                                                                    if (z24) {
                                                                        i27 = i26;
                                                                    } else {
                                                                        i27 = length5;
                                                                    }
                                                                    if (m.h(strQ3.charAt(i27), 32) <= 0) {
                                                                        z25 = true;
                                                                    } else {
                                                                        z25 = false;
                                                                    }
                                                                    if (z24) {
                                                                        if (z25) {
                                                                            z24 = true;
                                                                        } else {
                                                                            i26++;
                                                                        }
                                                                    } else if (z25) {
                                                                        String lowerCase1111111 = w4.c.g(strQ3, length5, 1, i26).toLowerCase(Locale.ROOT);
                                                                        m.e(lowerCase1111111, "toLowerCase(...)");
                                                                        sb2.append(lowerCase1111111);
                                                                    } else {
                                                                        length5--;
                                                                    }
                                                                }
                                                                String lowerCase1111112 = w4.c.g(strQ3, length5, 1, i26).toLowerCase(Locale.ROOT);
                                                                m.e(lowerCase1111112, "toLowerCase(...)");
                                                                sb2.append(lowerCase1111112);
                                                            }
                                                        } else {
                                                            length4--;
                                                        }
                                                    }
                                                    lowerCase5 = w4.c.g(strQ2, length4, 1, i25).toLowerCase(Locale.ROOT);
                                                    m.e(lowerCase5, "toLowerCase(...)");
                                                    if (m.a(strG, lowerCase5)) {
                                                        String pian1111 = youYin.getPian();
                                                        m.e(pian1111, "getPian(...)");
                                                        strQ3 = x.q0(x.q0(pian1111, "(", BuildConfig.VERSION_NAME), ")", BuildConfig.VERSION_NAME);
                                                        length5 = strQ3.length() - 1;
                                                        i26 = 0;
                                                        z24 = false;
                                                        while (i26 <= length5) {
                                                            if (z24) {
                                                                i27 = i26;
                                                            } else {
                                                                i27 = length5;
                                                            }
                                                            if (m.h(strQ3.charAt(i27), 32) <= 0) {
                                                                z25 = true;
                                                            } else {
                                                                z25 = false;
                                                            }
                                                            if (z24) {
                                                                if (z25) {
                                                                    z24 = true;
                                                                } else {
                                                                    i26++;
                                                                }
                                                            } else if (z25) {
                                                                String lowerCase1111113 = w4.c.g(strQ3, length5, 1, i26).toLowerCase(Locale.ROOT);
                                                                m.e(lowerCase1111113, "toLowerCase(...)");
                                                                sb2.append(lowerCase1111113);
                                                            } else {
                                                                length5--;
                                                            }
                                                        }
                                                        String lowerCase1111114 = w4.c.g(strQ3, length5, 1, i26).toLowerCase(Locale.ROOT);
                                                        m.e(lowerCase1111114, "toLowerCase(...)");
                                                        sb2.append(lowerCase1111114);
                                                    }
                                                }
                                                break;
                                            } else {
                                                zhuoYin = (ZhuoYin) it2.next();
                                                word3 = word.getWord();
                                                iB5 = w4.c.b(1, word3, "getWord(...)");
                                                i30 = 0;
                                                z28 = false;
                                                while (i30 <= iB5) {
                                                    if (z28) {
                                                        i35 = i30;
                                                    } else {
                                                        i35 = iB5;
                                                    }
                                                    if (m.h(word3.charAt(i35), 32) <= 0) {
                                                        z33 = true;
                                                    } else {
                                                        z33 = false;
                                                    }
                                                    if (z28) {
                                                        if (z33) {
                                                            z28 = true;
                                                        } else {
                                                            i30++;
                                                        }
                                                    } else if (z33) {
                                                        strG2 = w4.c.g(word3, iB5, 1, i30);
                                                        String ping18 = zhuoYin.getPing();
                                                        m.e(ping18, ypOOxsaJG.hziLDAbZxV);
                                                        strQ4 = x.q0(x.q0(ping18, "(", BuildConfig.VERSION_NAME), ")", BuildConfig.VERSION_NAME);
                                                        length6 = strQ4.length() - 1;
                                                        i31 = 0;
                                                        z29 = false;
                                                        while (i31 <= length6) {
                                                            if (z29) {
                                                                i34 = i31;
                                                            } else {
                                                                i34 = length6;
                                                            }
                                                            if (m.h(strQ4.charAt(i34), 32) <= 0) {
                                                                z32 = true;
                                                            } else {
                                                                z32 = false;
                                                            }
                                                            if (z29) {
                                                                if (z32) {
                                                                    z29 = true;
                                                                } else {
                                                                    i31++;
                                                                }
                                                            } else if (z32) {
                                                                lowerCase6 = w4.c.g(strQ4, length6, 1, i31).toLowerCase(Locale.ROOT);
                                                                m.e(lowerCase6, "toLowerCase(...)");
                                                                if (m.a(strG2, lowerCase6)) {
                                                                    String pian1112 = zhuoYin.getPian();
                                                                    m.e(pian1112, "getPian(...)");
                                                                    strQ5 = x.q0(x.q0(pian1112, "(", BuildConfig.VERSION_NAME), ")", BuildConfig.VERSION_NAME);
                                                                    length7 = strQ5.length() - 1;
                                                                    i32 = 0;
                                                                    z30 = false;
                                                                    while (i32 <= length7) {
                                                                        if (z30) {
                                                                            i33 = i32;
                                                                        } else {
                                                                            i33 = length7;
                                                                        }
                                                                        if (m.h(strQ5.charAt(i33), 32) <= 0) {
                                                                            z31 = true;
                                                                        } else {
                                                                            z31 = false;
                                                                        }
                                                                        if (z30) {
                                                                            if (z31) {
                                                                                z30 = true;
                                                                            } else {
                                                                                i32++;
                                                                            }
                                                                        } else if (z31) {
                                                                            String lowerCase1111115 = w4.c.g(strQ5, length7, 1, i32).toLowerCase(Locale.ROOT);
                                                                            m.e(lowerCase1111115, "toLowerCase(...)");
                                                                            sb2.append(lowerCase1111115);
                                                                        } else {
                                                                            length7--;
                                                                        }
                                                                    }
                                                                    String lowerCase1111116 = w4.c.g(strQ5, length7, 1, i32).toLowerCase(Locale.ROOT);
                                                                    m.e(lowerCase1111116, "toLowerCase(...)");
                                                                    sb2.append(lowerCase1111116);
                                                                }
                                                            } else {
                                                                length6--;
                                                            }
                                                        }
                                                        lowerCase6 = w4.c.g(strQ4, length6, 1, i31).toLowerCase(Locale.ROOT);
                                                        m.e(lowerCase6, "toLowerCase(...)");
                                                        if (m.a(strG2, lowerCase6)) {
                                                            String pian1113 = zhuoYin.getPian();
                                                            m.e(pian1113, "getPian(...)");
                                                            strQ5 = x.q0(x.q0(pian1113, "(", BuildConfig.VERSION_NAME), ")", BuildConfig.VERSION_NAME);
                                                            length7 = strQ5.length() - 1;
                                                            i32 = 0;
                                                            z30 = false;
                                                            while (i32 <= length7) {
                                                                if (z30) {
                                                                    i33 = i32;
                                                                } else {
                                                                    i33 = length7;
                                                                }
                                                                if (m.h(strQ5.charAt(i33), 32) <= 0) {
                                                                    z31 = true;
                                                                } else {
                                                                    z31 = false;
                                                                }
                                                                if (z30) {
                                                                    if (z31) {
                                                                        z30 = true;
                                                                    } else {
                                                                        i32++;
                                                                    }
                                                                } else if (z31) {
                                                                    String lowerCase1111117 = w4.c.g(strQ5, length7, 1, i32).toLowerCase(Locale.ROOT);
                                                                    m.e(lowerCase1111117, "toLowerCase(...)");
                                                                    sb2.append(lowerCase1111117);
                                                                } else {
                                                                    length7--;
                                                                }
                                                            }
                                                            String lowerCase1111118 = w4.c.g(strQ5, length7, 1, i32).toLowerCase(Locale.ROOT);
                                                            m.e(lowerCase1111118, "toLowerCase(...)");
                                                            sb2.append(lowerCase1111118);
                                                        }
                                                    } else {
                                                        iB5--;
                                                    }
                                                }
                                                strG2 = w4.c.g(word3, iB5, 1, i30);
                                                String ping19 = zhuoYin.getPing();
                                                m.e(ping19, ypOOxsaJG.hziLDAbZxV);
                                                strQ4 = x.q0(x.q0(ping19, "(", BuildConfig.VERSION_NAME), ")", BuildConfig.VERSION_NAME);
                                                length6 = strQ4.length() - 1;
                                                i31 = 0;
                                                z29 = false;
                                                while (i31 <= length6) {
                                                    if (z29) {
                                                        i34 = i31;
                                                    } else {
                                                        i34 = length6;
                                                    }
                                                    if (m.h(strQ4.charAt(i34), 32) <= 0) {
                                                        z32 = true;
                                                    } else {
                                                        z32 = false;
                                                    }
                                                    if (z29) {
                                                        if (z32) {
                                                            z29 = true;
                                                        } else {
                                                            i31++;
                                                        }
                                                    } else if (z32) {
                                                        lowerCase6 = w4.c.g(strQ4, length6, 1, i31).toLowerCase(Locale.ROOT);
                                                        m.e(lowerCase6, "toLowerCase(...)");
                                                        if (m.a(strG2, lowerCase6)) {
                                                            String pian1114 = zhuoYin.getPian();
                                                            m.e(pian1114, "getPian(...)");
                                                            strQ5 = x.q0(x.q0(pian1114, "(", BuildConfig.VERSION_NAME), ")", BuildConfig.VERSION_NAME);
                                                            length7 = strQ5.length() - 1;
                                                            i32 = 0;
                                                            z30 = false;
                                                            while (i32 <= length7) {
                                                                if (z30) {
                                                                    i33 = i32;
                                                                } else {
                                                                    i33 = length7;
                                                                }
                                                                if (m.h(strQ5.charAt(i33), 32) <= 0) {
                                                                    z31 = true;
                                                                } else {
                                                                    z31 = false;
                                                                }
                                                                if (z30) {
                                                                    if (z31) {
                                                                        z30 = true;
                                                                    } else {
                                                                        i32++;
                                                                    }
                                                                } else if (z31) {
                                                                    String lowerCase1111119 = w4.c.g(strQ5, length7, 1, i32).toLowerCase(Locale.ROOT);
                                                                    m.e(lowerCase1111119, "toLowerCase(...)");
                                                                    sb2.append(lowerCase1111119);
                                                                } else {
                                                                    length7--;
                                                                }
                                                            }
                                                            String lowerCase11111110 = w4.c.g(strQ5, length7, 1, i32).toLowerCase(Locale.ROOT);
                                                            m.e(lowerCase11111110, "toLowerCase(...)");
                                                            sb2.append(lowerCase11111110);
                                                        }
                                                    } else {
                                                        length6--;
                                                    }
                                                }
                                                lowerCase6 = w4.c.g(strQ4, length6, 1, i31).toLowerCase(Locale.ROOT);
                                                m.e(lowerCase6, "toLowerCase(...)");
                                                if (m.a(strG2, lowerCase6)) {
                                                    String pian1115 = zhuoYin.getPian();
                                                    m.e(pian1115, "getPian(...)");
                                                    strQ5 = x.q0(x.q0(pian1115, "(", BuildConfig.VERSION_NAME), ")", BuildConfig.VERSION_NAME);
                                                    length7 = strQ5.length() - 1;
                                                    i32 = 0;
                                                    z30 = false;
                                                    while (i32 <= length7) {
                                                        if (z30) {
                                                            i33 = i32;
                                                        } else {
                                                            i33 = length7;
                                                        }
                                                        if (m.h(strQ5.charAt(i33), 32) <= 0) {
                                                            z31 = true;
                                                        } else {
                                                            z31 = false;
                                                        }
                                                        if (z30) {
                                                            if (z31) {
                                                                z30 = true;
                                                            } else {
                                                                i32++;
                                                            }
                                                        } else if (z31) {
                                                            String lowerCase11111111 = w4.c.g(strQ5, length7, 1, i32).toLowerCase(Locale.ROOT);
                                                            m.e(lowerCase11111111, "toLowerCase(...)");
                                                            sb2.append(lowerCase11111111);
                                                        } else {
                                                            length7--;
                                                        }
                                                    }
                                                    String lowerCase11111112 = w4.c.g(strQ5, length7, 1, i32).toLowerCase(Locale.ROOT);
                                                    m.e(lowerCase11111112, "toLowerCase(...)");
                                                    sb2.append(lowerCase11111112);
                                                }
                                            }
                                        }
                                        break;
                                    } else {
                                        yinTu = (YinTu) it.next();
                                        word4 = word.getWord();
                                        iB6 = w4.c.b(1, word4, "getWord(...)");
                                        i36 = 0;
                                        z34 = false;
                                        while (true) {
                                            it4 = it4;
                                            if (i36 <= iB6) {
                                                if (z34) {
                                                    i41 = i36;
                                                } else {
                                                    i41 = iB6;
                                                }
                                                lowerCase = lowerCase;
                                                if (m.h(word4.charAt(i41), 32) <= 0) {
                                                    z39 = true;
                                                } else {
                                                    z39 = false;
                                                }
                                                if (z34) {
                                                    if (z39) {
                                                        z34 = true;
                                                    } else {
                                                        i36++;
                                                    }
                                                } else if (!z39) {
                                                    iB6--;
                                                }
                                            } else {
                                                lowerCase = lowerCase;
                                            }
                                        }
                                        strG3 = w4.c.g(word4, iB6, 1, i36);
                                        String ping110 = yinTu.getPing();
                                        m.e(ping110, "getPing(...)");
                                        strQ6 = x.q0(x.q0(ping110, "(", BuildConfig.VERSION_NAME), ")", BuildConfig.VERSION_NAME);
                                        length8 = strQ6.length() - 1;
                                        i37 = 0;
                                        z35 = false;
                                        while (true) {
                                            lowerCase2 = lowerCase2;
                                            if (i37 <= length8) {
                                                if (z35) {
                                                    i40 = i37;
                                                } else {
                                                    i40 = length8;
                                                }
                                                arrayListD = arrayListD;
                                                if (m.h(strQ6.charAt(i40), 32) <= 0) {
                                                    z38 = true;
                                                } else {
                                                    z38 = false;
                                                }
                                                if (z35) {
                                                    if (z38) {
                                                        z35 = true;
                                                    } else {
                                                        i37++;
                                                    }
                                                } else if (!z38) {
                                                    length8--;
                                                }
                                            } else {
                                                arrayListD = arrayListD;
                                            }
                                        }
                                        lowerCase7 = w4.c.g(strQ6, length8, 1, i37).toLowerCase(Locale.ROOT);
                                        m.e(lowerCase7, "toLowerCase(...)");
                                        if (m.a(strG3, lowerCase7)) {
                                            String pian1116 = yinTu.getPian();
                                            m.e(pian1116, "getPian(...)");
                                            strQ7 = x.q0(x.q0(pian1116, "(", BuildConfig.VERSION_NAME), ")", BuildConfig.VERSION_NAME);
                                            length9 = strQ7.length() - 1;
                                            i38 = 0;
                                            z36 = false;
                                            while (i38 <= length9) {
                                                if (z36) {
                                                    i39 = i38;
                                                } else {
                                                    i39 = length9;
                                                }
                                                if (m.h(strQ7.charAt(i39), 32) <= 0) {
                                                    z37 = true;
                                                } else {
                                                    z37 = false;
                                                }
                                                if (z36) {
                                                    if (z37) {
                                                        z36 = true;
                                                    } else {
                                                        i38++;
                                                    }
                                                } else if (z37) {
                                                    String lowerCase212 = w4.c.g(strQ7, length9, 1, i38).toLowerCase(Locale.ROOT);
                                                    m.e(lowerCase212, "toLowerCase(...)");
                                                    sb2.append(lowerCase212);
                                                } else {
                                                    length9--;
                                                }
                                            }
                                            String lowerCase213 = w4.c.g(strQ7, length9, 1, i38).toLowerCase(Locale.ROOT);
                                            m.e(lowerCase213, "toLowerCase(...)");
                                            sb2.append(lowerCase213);
                                        } else {
                                            lowerCase2 = lowerCase2;
                                            it4 = it4;
                                            lowerCase = lowerCase;
                                            arrayListD = arrayListD;
                                        }
                                    }
                                }
                                lowerCase2 = lowerCase2;
                                it4 = it4;
                                lowerCase = lowerCase;
                                arrayListD = arrayListD;
                            }
                            break;
                        }
                        Iterator<Word> it8 = it4;
                        str = lowerCase;
                        str2 = lowerCase2;
                        string = sb2.toString();
                        iB2 = w4.c.b(1, string, "toString(...)");
                        i15 = 0;
                        z14 = false;
                        while (i15 <= iB2) {
                            if (z14) {
                                i23 = i15;
                            } else {
                                i23 = iB2;
                            }
                            if (m.h(string.charAt(i23), 32) <= 0) {
                                z21 = true;
                            } else {
                                z21 = false;
                            }
                            if (z14) {
                                if (z21) {
                                    z14 = true;
                                } else {
                                    i15++;
                                }
                            } else if (z21) {
                                String lowerCase214 = x.q0(w4.c.g(string, iB2, 1, i15), " ", BuildConfig.VERSION_NAME).toLowerCase(Locale.ROOT);
                                m.e(lowerCase214, "toLowerCase(...)");
                                sb3 = new StringBuilder(lowerCase214);
                                Luoma = next2.Luoma;
                                m.e(Luoma, "Luoma");
                                if (q.W0(Luoma, new String[]{"#"}, 0, 6).toArray(new String[0]).length > 1) {
                                    String Luoma110 = next2.Luoma;
                                    m.e(Luoma110, "Luoma");
                                    str3 = ((String[]) q.W0(Luoma110, new String[]{"#"}, 0, 6).toArray(new String[0]))[0];
                                    length2 = str3.length() - 1;
                                    i18 = 0;
                                    z17 = false;
                                    while (i18 <= length2) {
                                        if (z17) {
                                            i22 = i18;
                                        } else {
                                            i22 = length2;
                                        }
                                        if (m.h(str3.charAt(i22), 32) <= 0) {
                                            z20 = true;
                                        } else {
                                            z20 = false;
                                        }
                                        if (z17) {
                                            if (z20) {
                                                z17 = true;
                                            } else {
                                                i18++;
                                            }
                                        } else if (z20) {
                                            lowerCase3 = x.q0(x.q0(x.q0(w4.c.g(str3, length2, 1, i18), "_", " "), " ", BuildConfig.VERSION_NAME), "-", BuildConfig.VERSION_NAME).toLowerCase(Locale.ROOT);
                                            m.e(lowerCase3, tcppUUQxZjFdy.qvcOg);
                                            String Luoma111 = next2.Luoma;
                                            m.e(Luoma111, "Luoma");
                                            str4 = ((String[]) q.W0(Luoma111, new String[]{"#"}, 0, 6).toArray(new String[0]))[1];
                                            length3 = str4.length() - 1;
                                            i19 = 0;
                                            z18 = false;
                                            while (i19 <= length3) {
                                                if (z18) {
                                                    i21 = i19;
                                                } else {
                                                    i21 = length3;
                                                }
                                                if (m.h(str4.charAt(i21), 32) <= 0) {
                                                    z19 = true;
                                                } else {
                                                    z19 = false;
                                                }
                                                if (z18) {
                                                    if (z19) {
                                                        z18 = true;
                                                    } else {
                                                        i19++;
                                                    }
                                                } else if (z19) {
                                                    lowerCase4 = x.q0(x.q0(x.q0(w4.c.g(str4, length3, 1, i19), "_", " "), " ", BuildConfig.VERSION_NAME), "-", BuildConfig.VERSION_NAME).toLowerCase(Locale.ROOT);
                                                    m.e(lowerCase4, "toLowerCase(...)");
                                                } else {
                                                    length3--;
                                                }
                                            }
                                            lowerCase4 = x.q0(x.q0(x.q0(w4.c.g(str4, length3, 1, i19), "_", " "), " ", BuildConfig.VERSION_NAME), "-", BuildConfig.VERSION_NAME).toLowerCase(Locale.ROOT);
                                            m.e(lowerCase4, "toLowerCase(...)");
                                        } else {
                                            length2--;
                                        }
                                    }
                                    lowerCase3 = x.q0(x.q0(x.q0(w4.c.g(str3, length2, 1, i18), "_", " "), " ", BuildConfig.VERSION_NAME), "-", BuildConfig.VERSION_NAME).toLowerCase(Locale.ROOT);
                                    m.e(lowerCase3, tcppUUQxZjFdy.qvcOg);
                                    String Luoma112 = next2.Luoma;
                                    m.e(Luoma112, "Luoma");
                                    str4 = ((String[]) q.W0(Luoma112, new String[]{"#"}, 0, 6).toArray(new String[0]))[1];
                                    length3 = str4.length() - 1;
                                    i19 = 0;
                                    z18 = false;
                                    while (i19 <= length3) {
                                        if (z18) {
                                            i21 = i19;
                                        } else {
                                            i21 = length3;
                                        }
                                        if (m.h(str4.charAt(i21), 32) <= 0) {
                                            z19 = true;
                                        } else {
                                            z19 = false;
                                        }
                                        if (z18) {
                                            if (z19) {
                                                z18 = true;
                                            } else {
                                                i19++;
                                            }
                                        } else if (z19) {
                                            lowerCase4 = x.q0(x.q0(x.q0(w4.c.g(str4, length3, 1, i19), "_", " "), " ", BuildConfig.VERSION_NAME), "-", BuildConfig.VERSION_NAME).toLowerCase(Locale.ROOT);
                                            m.e(lowerCase4, "toLowerCase(...)");
                                        } else {
                                            length3--;
                                        }
                                    }
                                    lowerCase4 = x.q0(x.q0(x.q0(w4.c.g(str4, length3, 1, i19), "_", " "), " ", BuildConfig.VERSION_NAME), "-", BuildConfig.VERSION_NAME).toLowerCase(Locale.ROOT);
                                    m.e(lowerCase4, "toLowerCase(...)");
                                } else {
                                    luoma = next2.getLuoma();
                                    iB3 = w4.c.b(1, luoma, "getLuoma(...)");
                                    i16 = 0;
                                    z15 = false;
                                    while (i16 <= iB3) {
                                        if (z15) {
                                            i17 = i16;
                                        } else {
                                            i17 = iB3;
                                        }
                                        if (m.h(luoma.charAt(i17), 32) <= 0) {
                                            z16 = true;
                                        } else {
                                            z16 = false;
                                        }
                                        if (z15) {
                                            if (z16) {
                                                z15 = true;
                                            } else {
                                                i16++;
                                            }
                                        } else if (z16) {
                                            lowerCase3 = x.q0(x.q0(w4.c.g(luoma, iB3, 1, i16), " ", BuildConfig.VERSION_NAME), "-", BuildConfig.VERSION_NAME).toLowerCase(Locale.ROOT);
                                            m.e(lowerCase3, "toLowerCase(...)");
                                            lowerCase4 = lowerCase3;
                                        } else {
                                            iB3--;
                                        }
                                    }
                                    lowerCase3 = x.q0(x.q0(w4.c.g(luoma, iB3, 1, i16), " ", BuildConfig.VERSION_NAME), "-", BuildConfig.VERSION_NAME).toLowerCase(Locale.ROOT);
                                    m.e(lowerCase3, "toLowerCase(...)");
                                    lowerCase4 = lowerCase3;
                                }
                                if (x.s0(lowerCase8, qi.b.a(str), false)) {
                                    Pattern patternCompile11110 = Pattern.compile(str);
                                    m.e(patternCompile11110, "compile(...)");
                                    lowerCase8 = patternCompile11110.matcher(lowerCase8).replaceFirst(BuildConfig.VERSION_NAME);
                                    m.e(lowerCase8, "replaceFirst(...)");
                                } else if (x.s0(lowerCase8, qi.b.a(str2), false)) {
                                    Pattern patternCompile11111 = Pattern.compile(str2);
                                    m.e(patternCompile11111, "compile(...)");
                                    lowerCase8 = patternCompile11111.matcher(lowerCase8).replaceFirst(BuildConfig.VERSION_NAME);
                                    m.e(lowerCase8, "replaceFirst(...)");
                                } else {
                                    string2 = sb3.toString();
                                    m.e(string2, "toString(...)");
                                    if (x.s0(lowerCase8, qi.b.a(string2), false)) {
                                        String string9 = sb3.toString();
                                        m.e(string9, "toString(...)");
                                        Pattern patternCompile11112 = Pattern.compile(string9);
                                        m.e(patternCompile11112, "compile(...)");
                                        lowerCase8 = patternCompile11112.matcher(lowerCase8).replaceFirst(BuildConfig.VERSION_NAME);
                                        m.e(lowerCase8, "replaceFirst(...)");
                                    } else if (x.s0(lowerCase8, qi.b.a(lowerCase3), false)) {
                                        Pattern patternCompile11113 = Pattern.compile(lowerCase3);
                                        m.e(patternCompile11113, "compile(...)");
                                        lowerCase8 = patternCompile11113.matcher(lowerCase8).replaceFirst(BuildConfig.VERSION_NAME);
                                        m.e(lowerCase8, "replaceFirst(...)");
                                    } else {
                                        if (x.s0(lowerCase8, qi.b.a(lowerCase4), false)) {
                                            t(false);
                                            LingoSkillApplication lingoSkillApplication114 = LingoSkillApplication.f21665b;
                                            String checkAnswerPrompt12 = this.f47884d.checkAnswerPrompt;
                                            m.e(checkAnswerPrompt12, "checkAnswerPrompt");
                                            String strQ115 = x.q0(checkAnswerPrompt12, "userSentence%", lowerCase8);
                                            String translations12 = r().getTranslations();
                                            m.e(translations12, "getTranslations(...)");
                                            String strQ26 = x.q0(strQ115, "translation%", translations12);
                                            String sentence12 = r().getSentence();
                                            m.e(sentence12, "getSentence(...)");
                                            x.q0(strQ26, "correctSentence%", sentence12);
                                            return false;
                                        }
                                        Pattern patternCompile11114 = Pattern.compile(lowerCase4);
                                        m.e(patternCompile11114, "compile(...)");
                                        lowerCase8 = patternCompile11114.matcher(lowerCase8).replaceFirst(BuildConfig.VERSION_NAME);
                                        m.e(lowerCase8, "replaceFirst(...)");
                                    }
                                }
                                it4 = it8;
                            } else {
                                iB2--;
                            }
                        }
                        String lowerCase215 = x.q0(w4.c.g(string, iB2, 1, i15), " ", BuildConfig.VERSION_NAME).toLowerCase(Locale.ROOT);
                        m.e(lowerCase215, "toLowerCase(...)");
                        sb3 = new StringBuilder(lowerCase215);
                        Luoma = next2.Luoma;
                        m.e(Luoma, "Luoma");
                        if (q.W0(Luoma, new String[]{"#"}, 0, 6).toArray(new String[0]).length > 1) {
                            String Luoma113 = next2.Luoma;
                            m.e(Luoma113, "Luoma");
                            str3 = ((String[]) q.W0(Luoma113, new String[]{"#"}, 0, 6).toArray(new String[0]))[0];
                            length2 = str3.length() - 1;
                            i18 = 0;
                            z17 = false;
                            while (i18 <= length2) {
                                if (z17) {
                                    i22 = i18;
                                } else {
                                    i22 = length2;
                                }
                                if (m.h(str3.charAt(i22), 32) <= 0) {
                                    z20 = true;
                                } else {
                                    z20 = false;
                                }
                                if (z17) {
                                    if (z20) {
                                        z17 = true;
                                    } else {
                                        i18++;
                                    }
                                } else if (z20) {
                                    lowerCase3 = x.q0(x.q0(x.q0(w4.c.g(str3, length2, 1, i18), "_", " "), " ", BuildConfig.VERSION_NAME), "-", BuildConfig.VERSION_NAME).toLowerCase(Locale.ROOT);
                                    m.e(lowerCase3, tcppUUQxZjFdy.qvcOg);
                                    String Luoma114 = next2.Luoma;
                                    m.e(Luoma114, "Luoma");
                                    str4 = ((String[]) q.W0(Luoma114, new String[]{"#"}, 0, 6).toArray(new String[0]))[1];
                                    length3 = str4.length() - 1;
                                    i19 = 0;
                                    z18 = false;
                                    while (i19 <= length3) {
                                        if (z18) {
                                            i21 = i19;
                                        } else {
                                            i21 = length3;
                                        }
                                        if (m.h(str4.charAt(i21), 32) <= 0) {
                                            z19 = true;
                                        } else {
                                            z19 = false;
                                        }
                                        if (z18) {
                                            if (z19) {
                                                z18 = true;
                                            } else {
                                                i19++;
                                            }
                                        } else if (z19) {
                                            lowerCase4 = x.q0(x.q0(x.q0(w4.c.g(str4, length3, 1, i19), "_", " "), " ", BuildConfig.VERSION_NAME), "-", BuildConfig.VERSION_NAME).toLowerCase(Locale.ROOT);
                                            m.e(lowerCase4, "toLowerCase(...)");
                                        } else {
                                            length3--;
                                        }
                                    }
                                    lowerCase4 = x.q0(x.q0(x.q0(w4.c.g(str4, length3, 1, i19), "_", " "), " ", BuildConfig.VERSION_NAME), "-", BuildConfig.VERSION_NAME).toLowerCase(Locale.ROOT);
                                    m.e(lowerCase4, "toLowerCase(...)");
                                } else {
                                    length2--;
                                }
                            }
                            lowerCase3 = x.q0(x.q0(x.q0(w4.c.g(str3, length2, 1, i18), "_", " "), " ", BuildConfig.VERSION_NAME), "-", BuildConfig.VERSION_NAME).toLowerCase(Locale.ROOT);
                            m.e(lowerCase3, tcppUUQxZjFdy.qvcOg);
                            String Luoma115 = next2.Luoma;
                            m.e(Luoma115, "Luoma");
                            str4 = ((String[]) q.W0(Luoma115, new String[]{"#"}, 0, 6).toArray(new String[0]))[1];
                            length3 = str4.length() - 1;
                            i19 = 0;
                            z18 = false;
                            while (i19 <= length3) {
                                if (z18) {
                                    i21 = i19;
                                } else {
                                    i21 = length3;
                                }
                                if (m.h(str4.charAt(i21), 32) <= 0) {
                                    z19 = true;
                                } else {
                                    z19 = false;
                                }
                                if (z18) {
                                    if (z19) {
                                        z18 = true;
                                    } else {
                                        i19++;
                                    }
                                } else if (z19) {
                                    lowerCase4 = x.q0(x.q0(x.q0(w4.c.g(str4, length3, 1, i19), "_", " "), " ", BuildConfig.VERSION_NAME), "-", BuildConfig.VERSION_NAME).toLowerCase(Locale.ROOT);
                                    m.e(lowerCase4, "toLowerCase(...)");
                                } else {
                                    length3--;
                                }
                            }
                            lowerCase4 = x.q0(x.q0(x.q0(w4.c.g(str4, length3, 1, i19), "_", " "), " ", BuildConfig.VERSION_NAME), "-", BuildConfig.VERSION_NAME).toLowerCase(Locale.ROOT);
                            m.e(lowerCase4, "toLowerCase(...)");
                        } else {
                            luoma = next2.getLuoma();
                            iB3 = w4.c.b(1, luoma, "getLuoma(...)");
                            i16 = 0;
                            z15 = false;
                            while (i16 <= iB3) {
                                if (z15) {
                                    i17 = i16;
                                } else {
                                    i17 = iB3;
                                }
                                if (m.h(luoma.charAt(i17), 32) <= 0) {
                                    z16 = true;
                                } else {
                                    z16 = false;
                                }
                                if (z15) {
                                    if (z16) {
                                        z15 = true;
                                    } else {
                                        i16++;
                                    }
                                } else if (z16) {
                                    lowerCase3 = x.q0(x.q0(w4.c.g(luoma, iB3, 1, i16), " ", BuildConfig.VERSION_NAME), "-", BuildConfig.VERSION_NAME).toLowerCase(Locale.ROOT);
                                    m.e(lowerCase3, "toLowerCase(...)");
                                    lowerCase4 = lowerCase3;
                                } else {
                                    iB3--;
                                }
                            }
                            lowerCase3 = x.q0(x.q0(w4.c.g(luoma, iB3, 1, i16), " ", BuildConfig.VERSION_NAME), "-", BuildConfig.VERSION_NAME).toLowerCase(Locale.ROOT);
                            m.e(lowerCase3, "toLowerCase(...)");
                            lowerCase4 = lowerCase3;
                        }
                        if (x.s0(lowerCase8, qi.b.a(str), false)) {
                            Pattern patternCompile11115 = Pattern.compile(str);
                            m.e(patternCompile11115, "compile(...)");
                            lowerCase8 = patternCompile11115.matcher(lowerCase8).replaceFirst(BuildConfig.VERSION_NAME);
                            m.e(lowerCase8, "replaceFirst(...)");
                        } else if (x.s0(lowerCase8, qi.b.a(str2), false)) {
                            Pattern patternCompile11116 = Pattern.compile(str2);
                            m.e(patternCompile11116, "compile(...)");
                            lowerCase8 = patternCompile11116.matcher(lowerCase8).replaceFirst(BuildConfig.VERSION_NAME);
                            m.e(lowerCase8, "replaceFirst(...)");
                        } else {
                            string2 = sb3.toString();
                            m.e(string2, "toString(...)");
                            if (x.s0(lowerCase8, qi.b.a(string2), false)) {
                                String string10 = sb3.toString();
                                m.e(string10, "toString(...)");
                                Pattern patternCompile11117 = Pattern.compile(string10);
                                m.e(patternCompile11117, "compile(...)");
                                lowerCase8 = patternCompile11117.matcher(lowerCase8).replaceFirst(BuildConfig.VERSION_NAME);
                                m.e(lowerCase8, "replaceFirst(...)");
                            } else if (x.s0(lowerCase8, qi.b.a(lowerCase3), false)) {
                                Pattern patternCompile11118 = Pattern.compile(lowerCase3);
                                m.e(patternCompile11118, "compile(...)");
                                lowerCase8 = patternCompile11118.matcher(lowerCase8).replaceFirst(BuildConfig.VERSION_NAME);
                                m.e(lowerCase8, "replaceFirst(...)");
                            } else {
                                if (x.s0(lowerCase8, qi.b.a(lowerCase4), false)) {
                                    t(false);
                                    LingoSkillApplication lingoSkillApplication115 = LingoSkillApplication.f21665b;
                                    String checkAnswerPrompt13 = this.f47884d.checkAnswerPrompt;
                                    m.e(checkAnswerPrompt13, "checkAnswerPrompt");
                                    String strQ116 = x.q0(checkAnswerPrompt13, "userSentence%", lowerCase8);
                                    String translations13 = r().getTranslations();
                                    m.e(translations13, "getTranslations(...)");
                                    String strQ27 = x.q0(strQ116, "translation%", translations13);
                                    String sentence13 = r().getSentence();
                                    m.e(sentence13, "getSentence(...)");
                                    x.q0(strQ27, "correctSentence%", sentence13);
                                    return false;
                                }
                                Pattern patternCompile11119 = Pattern.compile(lowerCase4);
                                m.e(patternCompile11119, "compile(...)");
                                lowerCase8 = patternCompile11119.matcher(lowerCase8).replaceFirst(BuildConfig.VERSION_NAME);
                                m.e(lowerCase8, "replaceFirst(...)");
                            }
                        }
                        it4 = it8;
                    }
                }
                boolean z49 = lowerCase8.length() == 0;
                t(z49);
                return z49;
            case 3:
                String str10 = "toLowerCase(...)";
                String str11 = "getDefault(...)";
                String str12 = "compile(...)";
                ta.a aVar19 = this.f47886f;
                m.c(aVar19);
                ta.a aVar20 = this.f47886f;
                m.c(aVar20);
                String str13 = q.i1(((d2) aVar20).f32482c.getText().toString()).toString();
                m.f(str13, "str");
                String strQ28 = x.q0(p.s("[\\p{P}+~$`^=|<>～｀＄＾＋＝｜＜＞￥×]", "compile(...)", str13, BuildConfig.VERSION_NAME, "replaceAll(...)"), " ", BuildConfig.VERSION_NAME);
                Locale locale = Locale.getDefault();
                m.e(locale, "getDefault(...)");
                String lowerCase30 = strQ28.toLowerCase(locale);
                m.e(lowerCase30, "toLowerCase(...)");
                String str14 = "o";
                String str15 = "replaceAll(...)";
                String str16 = "ú";
                String str17 = "[\\p{P}+~$`^=|<>～｀＄＾＋＝｜＜＞￥×]";
                String str18 = "u";
                String strQ29 = x.q0(x.q0(x.q0(x.q0(x.q0(lowerCase30, "á", "a"), "é", "e"), "í", "i"), "ó", "o"), "ú", "u");
                for (Word word9 : r().getSentWords()) {
                    String str19 = strQ29;
                    String str20 = str12;
                    if (word9.getWordType() != 1) {
                        String word10 = word9.getWord();
                        String str21 = str16;
                        int iB10 = w4.c.b(1, word10, "getWord(...)");
                        int i46 = 0;
                        boolean z50 = false;
                        while (true) {
                            if (i46 <= iB10) {
                                str18 = str18;
                                str14 = str14;
                                boolean z51 = m.h(word10.charAt(!z50 ? i46 : iB10), 32) <= 0;
                                if (z50) {
                                    if (z51) {
                                        iB10--;
                                    }
                                } else if (z51) {
                                    i46++;
                                } else {
                                    z50 = true;
                                }
                            } else {
                                str14 = str14;
                                str18 = str18;
                            }
                        }
                        String strQ30 = x.q0(w4.c.g(word10, iB10, 1, i46), " ", BuildConfig.VERSION_NAME);
                        Locale locale2 = Locale.getDefault();
                        m.e(locale2, str11);
                        String lowerCase31 = strQ30.toLowerCase(locale2);
                        m.e(lowerCase31, str10);
                        String str22 = str18;
                        String str23 = str15;
                        String str24 = str10;
                        String str25 = str17;
                        String str26 = str11;
                        String strS2 = p.s(str25, str20, x.q0(x.q0(x.q0(x.q0(x.q0(lowerCase31, "á", "a"), "é", "e"), "í", "i"), "ó", str14), str21, str22), BuildConfig.VERSION_NAME, str23);
                        if (!x.s0(str19, strS2, false)) {
                            t(false);
                            LingoSkillApplication lingoSkillApplication20 = LingoSkillApplication.f21665b;
                            String checkAnswerPrompt14 = this.f47884d.checkAnswerPrompt;
                            m.e(checkAnswerPrompt14, "checkAnswerPrompt");
                            String strQ31 = x.q0(checkAnswerPrompt14, "userSentence%", str19);
                            String translations14 = r().getTranslations();
                            m.e(translations14, "getTranslations(...)");
                            String strQ32 = x.q0(strQ31, "translation%", translations14);
                            String sentence14 = r().getSentence();
                            m.e(sentence14, "getSentence(...)");
                            x.q0(strQ32, "correctSentence%", sentence14);
                            return false;
                        }
                        Pattern patternCompile20 = Pattern.compile(strS2);
                        m.e(patternCompile20, str20);
                        String strReplaceFirst = patternCompile20.matcher(str19).replaceFirst(BuildConfig.VERSION_NAME);
                        m.e(strReplaceFirst, "replaceFirst(...)");
                        str16 = str21;
                        str18 = str22;
                        str14 = str14;
                        strQ29 = strReplaceFirst;
                        str10 = str24;
                        str15 = str23;
                        str12 = str20;
                        str11 = str26;
                        str17 = str25;
                    } else {
                        strQ29 = str19;
                        str10 = str10;
                        str14 = str14;
                        str15 = str15;
                        str12 = str20;
                    }
                }
                boolean z52 = strQ29.length() == 0;
                t(z52);
                return z52;
            case 4:
                ta.a aVar21 = this.f47886f;
                m.c(aVar21);
                ta.a aVar22 = this.f47886f;
                m.c(aVar22);
                String strY = y(((d2) aVar22).f32482c.getText().toString());
                for (Word word11 : r().getSentWords()) {
                    if (word11.getWordType() != 1) {
                        String word12 = word11.getWord();
                        m.e(word12, OCBJEWZHh.LKmEgvGmU);
                        String strY2 = y(word12);
                        if (!x.s0(strY, strY2, false)) {
                            t(false);
                            return false;
                        }
                        Pattern patternCompile21 = Pattern.compile(strY2);
                        m.e(patternCompile21, "compile(...)");
                        strY = patternCompile21.matcher(strY).replaceFirst(BuildConfig.VERSION_NAME);
                        m.e(strY, "replaceFirst(...)");
                    }
                }
                boolean z53 = strY.length() == 0;
                t(z53);
                return z53;
            case 5:
                String str27 = "toLowerCase(...)";
                String str28 = xTCJ.qHcNNHDNxqjpESN;
                String str29 = "compile(...)";
                ta.a aVar23 = this.f47886f;
                m.c(aVar23);
                ta.a aVar24 = this.f47886f;
                m.c(aVar24);
                String str30 = q.i1(((d2) aVar24).f32482c.getText().toString()).toString();
                m.f(str30, "str");
                String strQ33 = x.q0(p.s("[\\p{P}+~$`^=|<>～｀＄＾＋＝｜＜＞￥×]", "compile(...)", str30, BuildConfig.VERSION_NAME, "replaceAll(...)"), " ", BuildConfig.VERSION_NAME);
                Locale locale3 = Locale.getDefault();
                m.e(locale3, str28);
                String lowerCase32 = strQ33.toLowerCase(locale3);
                m.e(lowerCase32, "toLowerCase(...)");
                String str31 = "o";
                String str32 = "replaceAll(...)";
                String str33 = "ú";
                String str34 = "[\\p{P}+~$`^=|<>～｀＄＾＋＝｜＜＞￥×]";
                String str35 = "u";
                String strQ34 = x.q0(x.q0(x.q0(x.q0(x.q0(lowerCase32, "á", "a"), "é", "e"), "í", "i"), "ó", "o"), "ú", "u");
                for (Word word13 : r().getSentWords()) {
                    String str36 = strQ34;
                    String str37 = str29;
                    if (word13.getWordType() != 1) {
                        String word14 = word13.getWord();
                        String str38 = str33;
                        int iB11 = w4.c.b(1, word14, "getWord(...)");
                        int i47 = 0;
                        boolean z54 = false;
                        while (true) {
                            if (i47 <= iB11) {
                                str35 = str35;
                                str31 = str31;
                                boolean z55 = m.h(word14.charAt(!z54 ? i47 : iB11), 32) <= 0;
                                if (z54) {
                                    if (z55) {
                                        iB11--;
                                    }
                                } else if (z55) {
                                    i47++;
                                } else {
                                    z54 = true;
                                }
                            } else {
                                str31 = str31;
                                str35 = str35;
                            }
                        }
                        String strQ35 = x.q0(w4.c.g(word14, iB11, 1, i47), " ", BuildConfig.VERSION_NAME);
                        Locale locale4 = Locale.getDefault();
                        m.e(locale4, str28);
                        String lowerCase33 = strQ35.toLowerCase(locale4);
                        m.e(lowerCase33, str27);
                        String str39 = str35;
                        String str40 = str32;
                        String str41 = str27;
                        String str42 = str34;
                        String str43 = str28;
                        String strS3 = p.s(str42, str37, x.q0(x.q0(x.q0(x.q0(x.q0(lowerCase33, "á", "a"), "é", "e"), "í", "i"), "ó", str31), str38, str39), BuildConfig.VERSION_NAME, str40);
                        if (!x.s0(str36, strS3, false)) {
                            t(false);
                            return false;
                        }
                        Pattern patternCompile22 = Pattern.compile(strS3);
                        m.e(patternCompile22, str37);
                        String strReplaceFirst2 = patternCompile22.matcher(str36).replaceFirst(BuildConfig.VERSION_NAME);
                        m.e(strReplaceFirst2, "replaceFirst(...)");
                        str33 = str38;
                        str35 = str39;
                        str31 = str31;
                        strQ34 = strReplaceFirst2;
                        str27 = str41;
                        str32 = str40;
                        str29 = str37;
                        str28 = str43;
                        str34 = str42;
                    } else {
                        strQ34 = str36;
                        str27 = str27;
                        str31 = str31;
                        str32 = str32;
                        str29 = str37;
                    }
                }
                boolean z56 = strQ34.length() == 0;
                t(z56);
                return z56;
            case 6:
                return u();
            case 7:
                return v();
            case 8:
                return w();
            case 9:
                return x();
            default:
                String str44 = "toLowerCase(...)";
                ta.a aVar25 = this.f47886f;
                m.c(aVar25);
                ta.a aVar26 = this.f47886f;
                m.c(aVar26);
                String str45 = q.i1(((d2) aVar26).f32482c.getText().toString()).toString();
                m.f(str45, "str");
                String strQ36 = x.q0(p.s("[\\p{P}+~$`^=|<>～｀＄＾＋＝｜＜＞￥×]", "compile(...)", str45, BuildConfig.VERSION_NAME, "replaceAll(...)"), " ", BuildConfig.VERSION_NAME);
                Locale locale5 = Locale.getDefault();
                m.e(locale5, "getDefault(...)");
                String lowerCase34 = strQ36.toLowerCase(locale5);
                m.e(lowerCase34, "toLowerCase(...)");
                String str46 = "o";
                String str47 = "ó";
                String str48 = "i";
                String str49 = "replaceAll(...)";
                String str50 = "[\\p{P}+~$`^=|<>～｀＄＾＋＝｜＜＞￥×]";
                String str51 = "a";
                String str52 = "compile(...)";
                String str53 = "ù";
                String str54 = "à";
                String str55 = "u";
                String strQ37 = x.q0(x.q0(x.q0(x.q0(x.q0(x.q0(x.q0(lowerCase34, "è", "e"), "é", "e"), "ò", "o"), "ó", "o"), "ì", "i"), "à", "a"), "ù", "u");
                for (Word word15 : r().getSentWords()) {
                    String str56 = strQ37;
                    String str57 = str55;
                    if (word15.getWordType() != 1) {
                        String word16 = word15.getWord();
                        String str58 = str53;
                        int iB12 = w4.c.b(1, word16, "getWord(...)");
                        int i48 = 0;
                        boolean z57 = false;
                        while (true) {
                            if (i48 <= iB12) {
                                str51 = str51;
                                str48 = str48;
                                boolean z58 = m.h(word16.charAt(!z57 ? i48 : iB12), 32) <= 0;
                                if (z57) {
                                    if (z58) {
                                        iB12--;
                                    }
                                } else if (z58) {
                                    i48++;
                                } else {
                                    z57 = true;
                                }
                            } else {
                                str48 = str48;
                                str51 = str51;
                            }
                        }
                        String strQ38 = x.q0(w4.c.g(word16, iB12, 1, i48), " ", BuildConfig.VERSION_NAME);
                        Locale locale6 = Locale.getDefault();
                        m.e(locale6, "getDefault(...)");
                        String lowerCase35 = strQ38.toLowerCase(locale6);
                        m.e(lowerCase35, str44);
                        String str59 = str48;
                        String str60 = str54;
                        String str61 = str51;
                        String str62 = str44;
                        str53 = str58;
                        String strQ39 = x.q0(x.q0(x.q0(x.q0(x.q0(x.q0(x.q0(lowerCase35, "è", "e"), "é", "e"), "ò", str46), str47, str46), "ì", str59), str60, str61), str53, str57);
                        String str63 = str49;
                        String str64 = str47;
                        String str65 = str50;
                        str6 = str52;
                        String strS4 = p.s(str65, str6, strQ39, BuildConfig.VERSION_NAME, str63);
                        str5 = str65;
                        if (!x.s0(str56, strS4, false)) {
                            t(false);
                            return false;
                        }
                        Pattern patternCompile23 = Pattern.compile(strS4);
                        m.e(patternCompile23, str6);
                        String strReplaceFirst3 = patternCompile23.matcher(str56).replaceFirst(BuildConfig.VERSION_NAME);
                        m.e(strReplaceFirst3, "replaceFirst(...)");
                        strQ37 = strReplaceFirst3;
                        str44 = str62;
                        str54 = str60;
                        str51 = str61;
                        str48 = str59;
                        str47 = str64;
                        str49 = str63;
                    } else {
                        str5 = str50;
                        str6 = str52;
                        strQ37 = str56;
                        str44 = str44;
                        str54 = str54;
                        str51 = str51;
                        str48 = str48;
                    }
                    str55 = str57;
                    str52 = str6;
                    str46 = str46;
                    str50 = str5;
                }
                boolean z59 = strQ37.length() == 0;
                t(z59);
                return z59;
        }
    }

    @Override // qp.d3, qp.d
    public f n() {
        switch (this.f757n) {
            case 0:
                return a.f756a;
            case 1:
            case 4:
            case 9:
            default:
                return super.n();
            case 2:
                return h.f29299a;
            case 3:
                return hk.a.f33680a;
            case 5:
                return ok.a.f44931a;
            case 6:
                return pj.a.f46944a;
            case 7:
                return e.f51711a;
            case 8:
                return uk.a.f53017a;
            case 10:
                return zh.a.f59214a;
        }
    }

    private final boolean u() {
        ta.a aVar = this.f47886f;
        m.c(aVar);
        ta.a aVar2 = this.f47886f;
        m.c(aVar2);
        String str = q.i1(((d2) aVar2).f32482c.getText().toString()).toString();
        m.f(str, "str");
        String str2 = wuoM.aAzezYlBDYLpUq;
        String strQ0 = x.q0(p.s("[\\p{P}+~$`^=|<>～｀＄＾＋＝｜＜＞￥×]", "compile(...)", str, BuildConfig.VERSION_NAME, str2), " ", BuildConfig.VERSION_NAME);
        Locale locale = Locale.getDefault();
        m.e(locale, "getDefault(...)");
        String lowerCase = strQ0.toLowerCase(locale);
        m.e(lowerCase, "toLowerCase(...)");
        String str3 = "ss";
        String str4 = "é";
        String str5 = "compile(...)";
        String str6 = "e";
        String strQ1 = x.q0(x.q0(x.q0(x.q0(x.q0(lowerCase, "ä", "ae"), "ö", "oe"), "ü", "ue"), "ß", "ss"), "é", "e");
        Iterator<Word> it = r().getSentWords().iterator();
        while (true) {
            String str7 = strQ1;
            if (!it.hasNext()) {
                boolean z11 = str7.length() == 0;
                t(z11);
                return z11;
            }
            Word next = it.next();
            String str8 = str2;
            if (next.getWordType() != 1) {
                String word = next.getWord();
                String str9 = str4;
                int iB = w4.c.b(1, word, "getWord(...)");
                int i11 = 0;
                boolean z12 = false;
                while (true) {
                    if (i11 > iB) {
                        str3 = str3;
                        str6 = str6;
                        break;
                    }
                    str6 = str6;
                    str3 = str3;
                    boolean z13 = m.h(word.charAt(!z12 ? i11 : iB), 32) <= 0;
                    if (z12) {
                        if (!z13) {
                            break;
                        }
                        iB--;
                    } else if (z13) {
                        i11++;
                    } else {
                        z12 = true;
                    }
                }
                String strQ2 = x.q0(w4.c.g(word, iB, 1, i11), " ", BuildConfig.VERSION_NAME);
                Locale locale2 = Locale.getDefault();
                m.e(locale2, "getDefault(...)");
                String lowerCase2 = strQ2.toLowerCase(locale2);
                m.e(lowerCase2, "toLowerCase(...)");
                String str10 = str5;
                str2 = str8;
                String strS = p.s("[\\p{P}+~$`^=|<>～｀＄＾＋＝｜＜＞￥×]", str10, x.q0(x.q0(x.q0(x.q0(x.q0(lowerCase2, "ä", "ae"), "ö", "oe"), "ü", "ue"), "ß", str3), str9, str6), BuildConfig.VERSION_NAME, str2);
                if (!x.s0(str7, strS, false)) {
                    t(false);
                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                    String checkAnswerPrompt = this.f47884d.checkAnswerPrompt;
                    m.e(checkAnswerPrompt, "checkAnswerPrompt");
                    String strQ3 = x.q0(checkAnswerPrompt, "userSentence%", str7);
                    String translations = r().getTranslations();
                    m.e(translations, "getTranslations(...)");
                    String strQ4 = x.q0(strQ3, "translation%", translations);
                    String sentence = r().getSentence();
                    m.e(sentence, "getSentence(...)");
                    x.q0(strQ4, "correctSentence%", sentence);
                    return false;
                }
                Pattern patternCompile = Pattern.compile(strS);
                m.e(patternCompile, str10);
                strQ1 = patternCompile.matcher(str7).replaceFirst(BuildConfig.VERSION_NAME);
                m.e(strQ1, "replaceFirst(...)");
                str5 = str10;
                str4 = str9;
                str6 = str6;
            } else {
                str3 = str3;
                strQ1 = str7;
                str2 = str8;
            }
            str3 = str3;
        }
    }
}
