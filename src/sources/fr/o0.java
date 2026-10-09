package fr;

import am.rVFB.LwKl;
import android.content.Context;
import com.lingodeer.data.env.Env;
import com.lingodeer.data.env.FontSizeStyleKt;
import com.lingodeer.data.env.ScriptStyleInAnswerKt;
import com.tbruyelle.rxpermissions3.BuildConfig;
import dt.Xk.wuoM;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;
import l0.Eeqr.HOBXIlHxIkMBEA;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class o0 implements vt.n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Env f27733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f27734b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final uz.i1 f27735c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final uz.r0 f27736d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final uz.i1 f27737e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final uz.r0 f27738f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final uz.i1 f27739g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final uz.r0 f27740h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final uz.i1 f27741i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final uz.r0 f27742j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final uz.i1 f27743k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final uz.r0 f27744l;
    public final uz.i1 m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final uz.r0 f27745n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final uz.i1 f27746o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final uz.r0 f27747p;

    public o0(Context context, Env env) {
        this.f27733a = env;
        this.f27734b = context;
        if (env.hasMigratedFontSizeStyleV2) {
            int iCoerceFontSizeStyle = FontSizeStyleKt.coerceFontSizeStyle(env.textSizeDel);
            if (iCoerceFontSizeStyle != env.textSizeDel) {
                env.textSizeDel = iCoerceFontSizeStyle;
                env.updateEntry("textSizeDel");
            }
        } else {
            env.textSizeDel = FontSizeStyleKt.migrateLegacyFontSizeStyle(env.textSizeDel);
            env.hasMigratedFontSizeStyleV2 = true;
            env.updateEntries(new String[]{"textSizeDel", "hasMigratedFontSizeStyleV2"});
        }
        uz.i1 i1VarC = uz.x0.c(Integer.valueOf(env.keyLanguage));
        this.f27735c = i1VarC;
        this.f27736d = new uz.r0(i1VarC);
        uz.i1 i1VarC2 = uz.x0.c(Integer.valueOf(env.locateLanguage));
        this.f27737e = i1VarC2;
        this.f27738f = new uz.r0(i1VarC2);
        uz.i1 i1VarC3 = uz.x0.c(Integer.valueOf(t()));
        this.f27739g = i1VarC3;
        this.f27740h = new uz.r0(i1VarC3);
        uz.i1 i1VarC4 = uz.x0.c(Integer.valueOf(ScriptStyleInAnswerKt.resolveScriptStyleInAnswer(u(), t())));
        this.f27741i = i1VarC4;
        this.f27742j = new uz.r0(i1VarC4);
        uz.i1 i1VarC5 = uz.x0.c(Float.valueOf(f()));
        this.f27743k = i1VarC5;
        this.f27744l = new uz.r0(i1VarC5);
        uz.i1 i1VarC6 = uz.x0.c(Integer.valueOf(FontSizeStyleKt.coerceFontSizeStyle(env.textSizeDel)));
        this.m = i1VarC6;
        this.f27745n = new uz.r0(i1VarC6);
        uz.i1 i1VarC7 = uz.x0.c(Integer.valueOf(env.webViewTextZoom));
        this.f27746o = i1VarC7;
        this.f27747p = new uz.r0(i1VarC7);
    }

    public final Set A(int i11) {
        String str = (String) ob.f.d(this.f27733a.listenAlongSelectedUnitIds).get(String.valueOf(i11));
        if (str == null) {
            str = BuildConfig.VERSION_NAME;
        }
        List listW0 = oz.q.W0(str, new String[]{","}, 0, 6);
        ArrayList arrayList = new ArrayList();
        Iterator it = listW0.iterator();
        while (it.hasNext()) {
            Long lU0 = oz.x.u0(oz.q.i1((String) it.next()).toString());
            if (lU0 != null) {
                arrayList.add(lU0);
            }
        }
        return ry.m.f1(arrayList);
    }

    public final Object B(boolean z11, xy.c cVar) {
        yz.f fVar = rz.o0.f50940a;
        Object objM = rz.e0.M(yz.e.f58387a, new j0(this, z11, null, 1), cVar);
        return objM == wy.a.COROUTINE_SUSPENDED ? objM : qy.b0.f48488a;
    }

    public final Object C(String str, xy.i iVar) {
        yz.f fVar = rz.o0.f50940a;
        Object objM = rz.e0.M(yz.e.f58387a, new i0(this, str, null, 1), iVar);
        return objM == wy.a.COROUTINE_SUSPENDED ? objM : qy.b0.f48488a;
    }

    public final Object D(int i11, xy.i iVar) {
        yz.f fVar = rz.o0.f50940a;
        Object objM = rz.e0.M(yz.e.f58387a, new f0(i11, 3, this, null), iVar);
        return objM == wy.a.COROUTINE_SUSPENDED ? objM : qy.b0.f48488a;
    }

    public final Object E(int i11, xy.c cVar) {
        yz.f fVar = rz.o0.f50940a;
        Object objM = rz.e0.M(yz.e.f58387a, new f0(i11, 7, this, null), cVar);
        return objM == wy.a.COROUTINE_SUSPENDED ? objM : qy.b0.f48488a;
    }

    public final Object F(String str, xy.i iVar) {
        yz.f fVar = rz.o0.f50940a;
        Object objM = rz.e0.M(yz.e.f58387a, new i0(this, str, null, 8), iVar);
        return objM == wy.a.COROUTINE_SUSPENDED ? objM : qy.b0.f48488a;
    }

    public final Object G(String str, xy.i iVar) {
        yz.f fVar = rz.o0.f50940a;
        Object objM = rz.e0.M(yz.e.f58387a, new i0(this, str, null, 9), iVar);
        return objM == wy.a.COROUTINE_SUSPENDED ? objM : qy.b0.f48488a;
    }

    public final Object H(long j11, xy.i iVar) {
        yz.f fVar = rz.o0.f50940a;
        Object objM = rz.e0.M(yz.e.f58387a, new h0(this, j11, null, 5), iVar);
        return objM == wy.a.COROUTINE_SUSPENDED ? objM : qy.b0.f48488a;
    }

    public final Object I(int i11, bp.h2 h2Var) {
        yz.f fVar = rz.o0.f50940a;
        Object objM = rz.e0.M(yz.e.f58387a, new f0(i11, 13, this, null), h2Var);
        return objM == wy.a.COROUTINE_SUSPENDED ? objM : qy.b0.f48488a;
    }

    public final Object J(int i11, xy.i iVar) {
        yz.f fVar = rz.o0.f50940a;
        Object objM = rz.e0.M(yz.e.f58387a, new f0(i11, 14, this, null), iVar);
        return objM == wy.a.COROUTINE_SUSPENDED ? objM : qy.b0.f48488a;
    }

    public final Object K(int i11, xy.c cVar) {
        yz.f fVar = rz.o0.f50940a;
        Object objM = rz.e0.M(yz.e.f58387a, new f0(i11, 16, this, null), cVar);
        return objM == wy.a.COROUTINE_SUSPENDED ? objM : qy.b0.f48488a;
    }

    public final Object L(int i11, xy.i iVar) {
        yz.f fVar = rz.o0.f50940a;
        Object objM = rz.e0.M(yz.e.f58387a, new f0(i11, this, null), iVar);
        return objM == wy.a.COROUTINE_SUSPENDED ? objM : qy.b0.f48488a;
    }

    public final Object M(int i11, xy.c cVar) {
        yz.f fVar = rz.o0.f50940a;
        Object objM = rz.e0.M(yz.e.f58387a, new f0(i11, 22, this, null), cVar);
        return objM == wy.a.COROUTINE_SUSPENDED ? objM : qy.b0.f48488a;
    }

    public final Object N(String str, xy.i iVar) {
        yz.f fVar = rz.o0.f50940a;
        Object objM = rz.e0.M(yz.e.f58387a, new i0(this, str, null, 10), iVar);
        return objM == wy.a.COROUTINE_SUSPENDED ? objM : qy.b0.f48488a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object O(boolean z11, xy.c cVar) {
        l0 l0Var;
        if (cVar instanceof l0) {
            l0Var = (l0) cVar;
            int i11 = l0Var.f27667c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                l0Var.f27667c = i11 - Integer.MIN_VALUE;
            } else {
                l0Var = new l0(this, cVar);
            }
        } else {
            l0Var = new l0(this, cVar);
        }
        Object obj = l0Var.f27665a;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = l0Var.f27667c;
        if (i12 == 0) {
            com.bumptech.glide.e.F(obj);
            yz.f fVar = rz.o0.f50940a;
            yz.e eVar = yz.e.f58387a;
            j0 j0Var = new j0(this, z11, null, 12);
            l0Var.f27667c = 1;
            if (rz.e0.M(eVar, j0Var, l0Var) == aVar) {
                return aVar;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(obj);
        }
        return Boolean.TRUE;
    }

    public final Object P(boolean z11, xy.i iVar) {
        yz.f fVar = rz.o0.f50940a;
        Object objM = rz.e0.M(yz.e.f58387a, new j0(this, z11, null, 15), iVar);
        return objM == wy.a.COROUTINE_SUSPENDED ? objM : qy.b0.f48488a;
    }

    public final Object Q(String str, xy.c cVar) {
        yz.f fVar = rz.o0.f50940a;
        Object objM = rz.e0.M(yz.e.f58387a, new i0(this, str, null, 12), cVar);
        return objM == wy.a.COROUTINE_SUSPENDED ? objM : qy.b0.f48488a;
    }

    public final Object R(int i11, xy.c cVar) {
        yz.f fVar = rz.o0.f50940a;
        Object objM = rz.e0.M(yz.e.f58387a, new f0(i11, 23, this, null), cVar);
        return objM == wy.a.COROUTINE_SUSPENDED ? objM : qy.b0.f48488a;
    }

    public final Object S(String str, xy.i iVar) {
        yz.f fVar = rz.o0.f50940a;
        Object objM = rz.e0.M(yz.e.f58387a, new i0(this, str, null, 16), iVar);
        return objM == wy.a.COROUTINE_SUSPENDED ? objM : qy.b0.f48488a;
    }

    public final Object T(int i11, Set set, xy.c cVar) {
        yz.f fVar = rz.o0.f50940a;
        Object objM = rz.e0.M(yz.e.f58387a, new e6.q0(this, i11, set, null, 15), cVar);
        return objM == wy.a.COROUTINE_SUSPENDED ? objM : qy.b0.f48488a;
    }

    public final Object U(xy.c cVar) {
        yz.f fVar = rz.o0.f50940a;
        Object objM = rz.e0.M(yz.e.f58387a, new g0(18, this, null), cVar);
        return objM == wy.a.COROUTINE_SUSPENDED ? objM : qy.b0.f48488a;
    }

    public final Object V(long j11, xy.i iVar) {
        yz.f fVar = rz.o0.f50940a;
        Object objM = rz.e0.M(yz.e.f58387a, new h0(this, j11, null, 12), iVar);
        return objM == wy.a.COROUTINE_SUSPENDED ? objM : qy.b0.f48488a;
    }

    public final Object W(String str, xy.c cVar) {
        yz.f fVar = rz.o0.f50940a;
        Object objM = rz.e0.M(yz.e.f58387a, new i0(this, str, null, 18), cVar);
        return objM == wy.a.COROUTINE_SUSPENDED ? objM : qy.b0.f48488a;
    }

    public final Object X(String str, xy.i iVar) {
        yz.f fVar = rz.o0.f50940a;
        Object objM = rz.e0.M(yz.e.f58387a, new i0(this, str, null, 19), iVar);
        return objM == wy.a.COROUTINE_SUSPENDED ? objM : qy.b0.f48488a;
    }

    public final Object Y(int i11, xy.c cVar) {
        yz.f fVar = rz.o0.f50940a;
        Object objM = rz.e0.M(yz.e.f58387a, new f0(i11, 27, this, null), cVar);
        return objM == wy.a.COROUTINE_SUSPENDED ? objM : qy.b0.f48488a;
    }

    public final Object Z(int i11, xy.c cVar) {
        yz.f fVar = rz.o0.f50940a;
        Object objM = rz.e0.M(yz.e.f58387a, new f0(i11, 28, this, null), cVar);
        return objM == wy.a.COROUTINE_SUSPENDED ? objM : qy.b0.f48488a;
    }

    public final Object a0(boolean z11, xy.c cVar) {
        yz.f fVar = rz.o0.f50940a;
        Object objM = rz.e0.M(yz.e.f58387a, new j0(this, z11, null, 19), cVar);
        return objM == wy.a.COROUTINE_SUSPENDED ? objM : qy.b0.f48488a;
    }

    public final String b() {
        String accountType = this.f27733a.accountType;
        kotlin.jvm.internal.m.e(accountType, "accountType");
        return accountType;
    }

    public final Object b0(boolean z11, xy.c cVar) {
        yz.f fVar = rz.o0.f50940a;
        Object objM = rz.e0.M(yz.e.f58387a, new j0(this, z11, null, 20), cVar);
        return objM == wy.a.COROUTINE_SUSPENDED ? objM : qy.b0.f48488a;
    }

    public final boolean c() {
        return y() && this.f27733a.allowAlternativeAnswers;
    }

    public final Object c0(boolean z11, xy.c cVar) {
        yz.f fVar = rz.o0.f50940a;
        Object objM = rz.e0.M(yz.e.f58387a, new j0(this, z11, null, 21), cVar);
        return objM == wy.a.COROUTINE_SUSPENDED ? objM : qy.b0.f48488a;
    }

    public final String d() {
        String str = this.f27733a.appVersion;
        return str == null ? BuildConfig.VERSION_NAME : str;
    }

    public final Object d0(String str, xy.c cVar) {
        yz.f fVar = rz.o0.f50940a;
        Object objM = rz.e0.M(yz.e.f58387a, new n0(this, str, null, 0), cVar);
        return objM == wy.a.COROUTINE_SUSPENDED ? objM : qy.b0.f48488a;
    }

    public final String e() {
        String str = this.f27733a.buyCoffee;
        return str == null ? BuildConfig.VERSION_NAME : str;
    }

    public final Object e0(int i11, xy.i iVar) {
        yz.f fVar = rz.o0.f50940a;
        Object objM = rz.e0.M(yz.e.f58387a, new m0(i11, this, null), iVar);
        return objM == wy.a.COROUTINE_SUSPENDED ? objM : qy.b0.f48488a;
    }

    public final float f() {
        String coursePronunciationGuideAlphaByLanguage = this.f27733a.coursePronunciationGuideAlphaByLanguage;
        kotlin.jvm.internal.m.e(coursePronunciationGuideAlphaByLanguage, "coursePronunciationGuideAlphaByLanguage");
        Float f5 = (Float) ob.f.b(coursePronunciationGuideAlphaByLanguage).get(a());
        if (f5 != null) {
            return f5.floatValue();
        }
        return 1.0f;
    }

    public final boolean h() {
        Env env = this.f27733a;
        int i11 = env.keyLanguage;
        if (i11 == 0) {
            return env.fluentCNDictationZhuyin;
        }
        if (i11 == 1) {
            return env.fluentJPDictationZhuyin;
        }
        if (i11 == 2) {
            return env.fluentKRDictationZhuyin;
        }
        if (i11 != 4) {
            if (i11 != 5) {
                if (i11 != 47) {
                    if (i11 != 53) {
                        return false;
                    }
                }
            }
            return env.fluentFRDictationZhuyin;
        }
        return env.fluentESDictationZhuyin;
    }

    public final String i() {
        Env env = this.f27733a;
        int i11 = env.keyLanguage;
        if (i11 == 0) {
            String str = env.fluentCNEnterLessonList;
            return str == null ? BuildConfig.VERSION_NAME : str;
        }
        if (i11 == 1) {
            String str2 = env.fluentJPEnterLessonList;
            return str2 == null ? BuildConfig.VERSION_NAME : str2;
        }
        if (i11 == 2) {
            String str3 = env.fluentKREnterLessonList;
            return str3 == null ? BuildConfig.VERSION_NAME : str3;
        }
        if (i11 != 4) {
            if (i11 != 5) {
                if (i11 != 47) {
                    if (i11 != 53) {
                        return BuildConfig.VERSION_NAME;
                    }
                }
            }
            String str4 = env.fluentFREnterLessonList;
            return str4 == null ? BuildConfig.VERSION_NAME : str4;
        }
        String str5 = env.fluentESEnterLessonList;
        return str5 == null ? BuildConfig.VERSION_NAME : str5;
    }

    public final long j() {
        Env env = this.f27733a;
        int i11 = env.keyLanguage;
        if (i11 == 0) {
            return env.fluentCNFocusGameType;
        }
        if (i11 == 1) {
            return env.fluentJPFocusGameType;
        }
        if (i11 == 2) {
            return env.fluentKRFocusGameType;
        }
        if (i11 != 4) {
            if (i11 != 5) {
                if (i11 != 47) {
                    if (i11 != 53) {
                        return 0L;
                    }
                }
            }
            return env.fluentFRFocusGameType;
        }
        return env.fluentESFocusGameType;
    }

    public final int k() {
        Env env = this.f27733a;
        int i11 = env.keyLanguage;
        if (i11 == 0) {
            return env.fluentCNGamePracticeNumber;
        }
        if (i11 == 1) {
            return env.fluentJPGamePracticeNumber;
        }
        if (i11 == 2) {
            return env.fluentKRGamePracticeNumber;
        }
        if (i11 != 4) {
            if (i11 != 5) {
                if (i11 != 47) {
                    if (i11 != 53) {
                        return 20;
                    }
                }
            }
            return env.fluentFRGamePracticeNumber;
        }
        return env.fluentESGamePracticeNumber;
    }

    public final int l() {
        Env env = this.f27733a;
        int i11 = env.keyLanguage;
        if (i11 == 0) {
            return env.fluentCNGameSortType;
        }
        if (i11 == 1) {
            return env.fluentJPGameSortType;
        }
        if (i11 == 2) {
            return env.fluentKRGameSortType;
        }
        if (i11 != 4) {
            if (i11 != 5) {
                if (i11 != 47) {
                    if (i11 != 53) {
                        return 0;
                    }
                }
            }
            return env.fluentFRGameSortType;
        }
        return env.fluentESGameSortType;
    }

    public final int m() {
        Env env = this.f27733a;
        int i11 = env.keyLanguage;
        if (i11 == 0) {
            return env.fluentCNVocabularySort;
        }
        if (i11 == 1) {
            return env.fluentJPVocabularySort;
        }
        if (i11 == 2) {
            return env.fluentKRVocabularySort;
        }
        if (i11 != 4) {
            if (i11 != 5) {
                if (i11 != 47) {
                    if (i11 != 53) {
                        return 0;
                    }
                }
            }
            return env.fluentFRVocabularySort;
        }
        return env.fluentESVocabularySort;
    }

    public final long n() {
        Env env = this.f27733a;
        int i11 = env.keyLanguage;
        if (i11 == 0) {
            return env.fluentCNWordGapTime;
        }
        if (i11 == 1) {
            return env.fluentJPWordGapTime;
        }
        if (i11 == 2) {
            return env.fluentKRWordGapTime;
        }
        if (i11 != 4) {
            if (i11 != 5) {
                if (i11 != 47) {
                    if (i11 != 53) {
                        return 1000L;
                    }
                }
            }
            return env.fluentFRWordGapTime;
        }
        return env.fluentESWordGapTime;
    }

    public final String o() {
        String str = this.f27733a.hasReadFeedList;
        return str == null ? BuildConfig.VERSION_NAME : str;
    }

    public final int p() {
        return this.f27733a.keyLanguage;
    }

    public final String q() {
        String str = this.f27733a.nickName;
        return str == null ? BuildConfig.VERSION_NAME : str;
    }

    public final String r() {
        String notificationWordSent = this.f27733a.notificationWordSent;
        kotlin.jvm.internal.m.e(notificationWordSent, "notificationWordSent");
        return notificationWordSent;
    }

    public final int s() {
        Env env = this.f27733a;
        int i11 = env.keyLanguage;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 11) {
                    if (i11 != 12) {
                        return -1;
                    }
                }
            }
            if (env.fluentLanguage != -1) {
                return -1;
            }
            return env.jsLuomaDisplay;
        }
        if (env.fluentLanguage != -1) {
            return -1;
        }
        return env.isSChinese ? 0 : 1;
    }

    public final int t() {
        Env env = this.f27733a;
        int i11 = env.keyLanguage;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 51 || i11 == 55) {
                        return env.arDisPlay;
                    }
                    if (i11 == 57) {
                        return env.thaiDisPlay;
                    }
                    if (i11 == 61) {
                        return env.hindiDisPlay;
                    }
                    if (i11 == 65) {
                        return env.grkDisPlay;
                    }
                    switch (i11) {
                        case 11:
                            break;
                        case 12:
                            break;
                        case 13:
                            break;
                        default:
                            return -1;
                    }
                }
                return env.fluentLanguage != -1 ? env.fluentKRDisplay : env.koDisPlay;
            }
            return env.fluentLanguage != -1 ? env.fluentJPDisplay : env.jsDisPlay;
        }
        return env.fluentLanguage != -1 ? env.fluentCNDisplay : env.csDisplay;
    }

    public final int u() {
        Env env = this.f27733a;
        int i11 = env.keyLanguage;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 51 || i11 == 55) {
                        return env.arDisPlayInAnswer;
                    }
                    if (i11 == 57) {
                        return env.thaiDisPlayInAnswer;
                    }
                    if (i11 == 61) {
                        return env.hindiDisPlayInAnswer;
                    }
                    if (i11 == 65) {
                        return env.grkDisPlayInAnswer;
                    }
                    switch (i11) {
                        case 11:
                            break;
                        case 12:
                            break;
                        case 13:
                            break;
                        default:
                            return t();
                    }
                }
                return env.fluentLanguage != -1 ? env.fluentKRDisplayInAnswer : env.koDisPlayInAnswer;
            }
            return env.fluentLanguage != -1 ? env.fluentJPDisplayInAnswer : env.jsDisPlayInAnswer;
        }
        return env.fluentLanguage != -1 ? env.fluentCNDisplayInAnswer : env.csDisplayInAnswer;
    }

    public final String v() {
        return defpackage.e.m(this.f27733a.tempDir, "/");
    }

    public final String w() {
        String str = this.f27733a.uid;
        return str == null ? BuildConfig.VERSION_NAME : str;
    }

    public final int x() {
        Env env = this.f27733a;
        int i11 = env.keyLanguage;
        if (i11 == 0) {
            return env.cnMFSwitch;
        }
        if (i11 == 1) {
            return env.jpMFSwitch;
        }
        if (i11 == 2) {
            return env.krMFSwitch;
        }
        if (i11 == 3) {
            return env.enMFSwitch;
        }
        if (i11 == 8 || i11 == 17) {
            return env.ptMFSwitch;
        }
        if (i11 == 47 || i11 == 48) {
            return env.esusMFSwitch;
        }
        switch (i11) {
            case 11:
                return env.cnupMFSwitch;
            case 12:
                return env.jpupMFSwitch;
            case 13:
                return env.krupMFSwitch;
            default:
                return -1;
        }
    }

    public final boolean y() {
        Env env = this.f27733a;
        return ry.l.D(new Integer[]{11, 0}, Integer.valueOf(env.keyLanguage)) || ry.l.D(new Integer[]{12, 1}, Integer.valueOf(env.keyLanguage)) || ry.l.D(new Integer[]{13, 2}, Integer.valueOf(env.keyLanguage)) || ry.l.m0(new Integer[]{3, 4, 14, 47, 48, 5, 15, 53, 54, 6, 16}).contains(Integer.valueOf(env.keyLanguage));
    }

    public final boolean z() {
        return oz.q.v0("release", "debug", false);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:48:0x005d  */
    public final String a() {
        int i11 = this.f27733a.keyLanguage;
        if (i11 != 40) {
            if (i11 == 57) {
                return "thai";
            }
            if (i11 == 61) {
                return "hindi";
            }
            if (i11 == 63) {
                return "ukr";
            }
            if (i11 == 65) {
                return "grk";
            }
            if (i11 == 69) {
                return "mal";
            }
            switch (i11) {
                case 0:
                    return "cn";
                case 1:
                    return "jp";
                case 2:
                    return HOBXIlHxIkMBEA.yLCeKTfIZp;
                case 3:
                    return "en";
                case 4:
                    return "es";
                case 5:
                    return "fr";
                case 6:
                    return "de";
                case 7:
                    return "vt";
                case 8:
                    return "pt";
                default:
                    switch (i11) {
                        case 10:
                        case 22:
                            return "ru";
                        case 11:
                            return "cn";
                        case 12:
                            return "jp";
                        case 13:
                            return HOBXIlHxIkMBEA.yLCeKTfIZp;
                        case 14:
                            return "es";
                        case 15:
                            return "fr";
                        case 16:
                            return "de";
                        case 17:
                            return "pt";
                        case 18:
                            return "idn";
                        case 19:
                            return "pol";
                        case 20:
                            break;
                        case 21:
                            return "tur";
                        default:
                            switch (i11) {
                                case 47:
                                case 48:
                                    return "esus";
                                case 49:
                                case 50:
                                    return "enes";
                                case 51:
                                    return "ara";
                                default:
                                    switch (i11) {
                                        case 53:
                                        case 54:
                                            return "frus";
                                        case 55:
                                            return "ara";
                                        default:
                                            return oz.q.S0(xt.d.k(i11), "up");
                                    }
                            }
                    }
                    break;
            }
        }
        return LwKl.fikh;
    }

    public final String g() {
        Env env = this.f27733a;
        String loginAccount = env.loginAccount;
        if (loginAccount != null) {
            kotlin.jvm.internal.m.e(loginAccount, "loginAccount");
            if (Pattern.compile("^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z0-9-]{2,63}$").matcher(loginAccount).matches()) {
                String str = env.loginAccount;
                kotlin.jvm.internal.m.c(str);
                return str;
            }
        }
        String str2 = env.thirdPartyEmail;
        if (str2 == null) {
            return BuildConfig.VERSION_NAME;
        }
        kotlin.jvm.internal.m.e(str2, wuoM.zxZFoVbjbNk);
        if (!Pattern.compile("^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z0-9-]{2,63}$").matcher(str2).matches()) {
            return BuildConfig.VERSION_NAME;
        }
        String str3 = env.thirdPartyEmail;
        kotlin.jvm.internal.m.c(str3);
        return str3;
    }
}
