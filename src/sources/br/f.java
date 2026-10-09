package br;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.k1;
import bp.g1;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.lingo.chinesetone.ChineseToneIndexActivity;
import com.lingo.course.ui.CourseFlashCardIndexActivity;
import com.lingo.course.ui.CourseListenAlongActivity;
import com.lingo.lingoskill.ar.ui.syllable.ARSyllableIndexActivity;
import com.lingo.lingoskill.billing.SubscriptionHelpActivity;
import com.lingo.lingoskill.chineseskill.ui.pinyin.PinyinLessonIndexActivity;
import com.lingo.lingoskill.deskill.ui.learn.DESyllableIntroductionActivity;
import com.lingo.lingoskill.englishskill.ui.learn.ENSyllableIntroductionActivity;
import com.lingo.lingoskill.espanskill.ui.learn.ESSyllableIntroductionActivity;
import com.lingo.lingoskill.esusskill.ui.learn.ESUSSyllableIntroductionActivity;
import com.lingo.lingoskill.franchskill.ui.learn.FRSyllableIntroductionActivity2;
import com.lingo.lingoskill.grkskill.ui.learn.GRKSyllableIntroductionActivity;
import com.lingo.lingoskill.hindiskill.ui.learn.HINDISyllableIntroductionActivity;
import com.lingo.lingoskill.idnskill.ui.learn.IDNSyllableIntroductionActivity;
import com.lingo.lingoskill.itskill.ui.learn.ITSyllableIntroductionActivity;
import com.lingo.lingoskill.japanskill.ui.syllablenew.JPSyllableIndexActivity;
import com.lingo.lingoskill.malskill.ui.learn.MALSyllableIntroductionActivity;
import com.lingo.lingoskill.polskill.ui.learn.POLSyllableIntroductionActivity;
import com.lingo.lingoskill.ptskill.ui.syllable.PTNewSyllableIntroductionActivity;
import com.lingo.lingoskill.ruskill.ui.learn.RUSyllableIndexActivity;
import com.lingo.lingoskill.thaiskill.ui.learn.THAISyllableIntroductionActivity;
import com.lingo.lingoskill.turskill.ui.learn.TURSyllableIntroductionActivity;
import com.lingo.lingoskill.ui.base.RemoteUrlActivity;
import com.lingo.lingoskill.ukrskill.ui.learn.UKRSyllableIntroductionActivity;
import com.lingo.lingoskill.vtskill.ui.syllable.ui.VTSyllableIndexActivity;
import com.lingo.main.ui.MainComposeActivity;
import com.lingo.syllable.ko.KOSyllableActivity;
import com.lingodeer.R;
import com.lingodeer.data.model.INTENTS;
import fr.o0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MainComposeActivity f5031b;

    public /* synthetic */ f(MainComposeActivity mainComposeActivity, int i11) {
        this.f5030a = i11;
        this.f5031b = mainComposeActivity;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:62:0x016c  */
    /* JADX WARN: Code duplicated, block: B:64:0x0172  */
    /* JADX WARN: Code duplicated, block: B:65:0x0175  */
    /* JADX WARN: Code duplicated, block: B:66:0x0178  */
    /* JADX WARN: Code duplicated, block: B:68:0x017e  */
    /* JADX WARN: Code duplicated, block: B:69:0x0181  */
    /* JADX WARN: Code duplicated, block: B:70:0x0184  */
    /* JADX WARN: Code duplicated, block: B:77:0x0199  */
    /* JADX WARN: Code duplicated, block: B:78:0x019c  */
    @Override // fz.a
    public final Object invoke() {
        Class cls;
        String str;
        int i11 = this.f5030a;
        qy.b0 b0Var = qy.b0.f48488a;
        MainComposeActivity mainComposeActivity = this.f5031b;
        switch (i11) {
            case 0:
                Intent intent = new Intent();
                intent.setAction("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.TEXT", "Preparing for a trip abroad? Install LingoDeer and save these survival phrases in your phone for free! https://c85vz.app.goo.gl/e7tG");
                intent.setType("text/plain");
                mainComposeActivity.startActivity(Intent.createChooser(intent, null));
                b7.e0.A(mainComposeActivity.m(), "jxz_tv_learn_topbar_share");
                return b0Var;
            case 1:
                ar.g gVarQ = mainComposeActivity.q();
                k1 supportFragmentManager = mainComposeActivity.getSupportFragmentManager();
                kotlin.jvm.internal.m.e(supportFragmentManager, "getSupportFragmentManager(...)");
                gVarQ.getClass();
                int i12 = ((o0) gVarQ.f2850a).f27733a.keyLanguage;
                if (i12 == 0) {
                    gVarQ.a(new Integer[]{4, 5, 6, 1, 2, 8, 10, 20, 3}, 11, supportFragmentManager);
                } else if (i12 == 1) {
                    gVarQ.a(new Integer[]{4, 5, 6, 2, 7, 9, 20, 3}, 12, supportFragmentManager);
                } else if (i12 == 2) {
                    gVarQ.a(new Integer[]{4, 5, 6, 1, 9, 20, 3}, 13, supportFragmentManager);
                } else if (i12 == 4) {
                    gVarQ.a(new Integer[]{2, 1, 9, 8, 3}, 14, supportFragmentManager);
                } else if (i12 == 5) {
                    gVarQ.a(new Integer[]{9, 2, 1, 3}, 15, supportFragmentManager);
                } else if (i12 == 6) {
                    gVarQ.a(new Integer[]{9, 2, 1, 21, 3}, 16, supportFragmentManager);
                } else if (i12 == 8) {
                    gVarQ.a(new Integer[]{9, 3}, 17, supportFragmentManager);
                } else if (i12 == 10) {
                    gVarQ.a(new Integer[]{9, 21, 6, 3}, 22, supportFragmentManager);
                } else if (i12 == 20) {
                    gVarQ.a(new Integer[]{3}, 40, supportFragmentManager);
                } else if (i12 == 47) {
                    gVarQ.a(new Integer[]{6, 5, 9, 3}, 48, supportFragmentManager);
                } else if (i12 == 51) {
                    gVarQ.a(new Integer[]{9, 3}, 55, supportFragmentManager);
                } else if (i12 == 53) {
                    gVarQ.a(new Integer[]{6, 5, 9, 3}, 54, supportFragmentManager);
                }
                return b0Var;
            case 2:
                ar.g gVarQ2 = mainComposeActivity.q();
                i.c startAlphabetForResult = mainComposeActivity.R;
                Context context = gVarQ2.f2852c;
                kotlin.jvm.internal.m.f(startAlphabetForResult, "startAlphabetForResult");
                int i13 = ((o0) gVarQ2.f2850a).f27733a.keyLanguage;
                if (i13 == 40) {
                    cls = ITSyllableIntroductionActivity.class;
                    b7.e0.y(context, cls, startAlphabetForResult);
                } else if (i13 == 51) {
                    cls = ARSyllableIndexActivity.class;
                    b7.e0.y(context, cls, startAlphabetForResult);
                } else {
                    if (i13 == 57) {
                        cls = THAISyllableIntroductionActivity.class;
                    } else if (i13 == 61) {
                        cls = HINDISyllableIntroductionActivity.class;
                    } else if (i13 == 63) {
                        cls = UKRSyllableIntroductionActivity.class;
                    } else if (i13 == 65) {
                        cls = GRKSyllableIntroductionActivity.class;
                    } else if (i13 == 69) {
                        cls = MALSyllableIntroductionActivity.class;
                    } else if (i13 != 47 && i13 != 48) {
                        switch (i13) {
                            case 0:
                                cls = PinyinLessonIndexActivity.class;
                                break;
                            case 1:
                                cls = JPSyllableIndexActivity.class;
                                break;
                            case 2:
                                cls = KOSyllableActivity.class;
                                break;
                            case 3:
                                cls = ENSyllableIntroductionActivity.class;
                                break;
                            case 4:
                                cls = ESSyllableIntroductionActivity.class;
                                break;
                            case 5:
                                cls = FRSyllableIntroductionActivity2.class;
                                break;
                            case 6:
                                cls = DESyllableIntroductionActivity.class;
                                break;
                            case 7:
                                cls = VTSyllableIndexActivity.class;
                                break;
                            case 8:
                                cls = PTNewSyllableIntroductionActivity.class;
                                break;
                            default:
                                switch (i13) {
                                    case 10:
                                    case 22:
                                        cls = RUSyllableIndexActivity.class;
                                        break;
                                    case 11:
                                        cls = PinyinLessonIndexActivity.class;
                                        break;
                                    case 12:
                                        cls = JPSyllableIndexActivity.class;
                                        break;
                                    case 13:
                                        cls = KOSyllableActivity.class;
                                        break;
                                    case 14:
                                        cls = ESSyllableIntroductionActivity.class;
                                        break;
                                    case 15:
                                        cls = FRSyllableIntroductionActivity2.class;
                                        break;
                                    case 16:
                                        cls = DESyllableIntroductionActivity.class;
                                        break;
                                    case 17:
                                        cls = PTNewSyllableIntroductionActivity.class;
                                        break;
                                    case 18:
                                        cls = IDNSyllableIntroductionActivity.class;
                                        break;
                                    case 19:
                                        cls = POLSyllableIntroductionActivity.class;
                                        break;
                                    case 20:
                                        cls = ITSyllableIntroductionActivity.class;
                                        break;
                                    case 21:
                                        cls = TURSyllableIntroductionActivity.class;
                                        break;
                                    default:
                                        switch (i13) {
                                            case 53:
                                            case 54:
                                                cls = FRSyllableIntroductionActivity2.class;
                                                break;
                                            case 55:
                                                cls = ARSyllableIndexActivity.class;
                                                break;
                                        }
                                        break;
                                }
                                break;
                        }
                    } else {
                        cls = ESUSSyllableIntroductionActivity.class;
                    }
                    b7.e0.y(context, cls, startAlphabetForResult);
                }
                b7.e0.A(gVarQ2.f2851b, "jxz_learn_click_alphabet");
                return b0Var;
            case 3:
                ar.g gVarQ3 = mainComposeActivity.q();
                i.c startAlphabetForResult2 = mainComposeActivity.R;
                gVarQ3.getClass();
                kotlin.jvm.internal.m.f(startAlphabetForResult2, "startAlphabetForResult");
                startAlphabetForResult2.a(new Intent(gVarQ3.f2852c, (Class<?>) ChineseToneIndexActivity.class));
                return b0Var;
            case 4:
                int i14 = MainComposeActivity.U;
                return new ar.e(mainComposeActivity);
            case 5:
                int i15 = MainComposeActivity.U;
                return new ar.g(mainComposeActivity.l(), mainComposeActivity.m(), mainComposeActivity);
            case 6:
                int i16 = SubscriptionHelpActivity.Q;
                Intent intent2 = new Intent(mainComposeActivity, (Class<?>) SubscriptionHelpActivity.class);
                intent2.putExtra(INTENTS.EXTRA_STRING, "onContactUsClick");
                mainComposeActivity.startActivity(intent2);
                return b0Var;
            case 7:
                int i17 = ((o0) mainComposeActivity.l()).f27733a.locateLanguage;
                if (i17 == 1) {
                    str = "https://lingodeer.freshdesk.com/ja-JP/support/home";
                } else if (i17 == 2) {
                    str = "https://lingodeer.freshdesk.com/ko/support/home";
                } else if (i17 != 18) {
                    switch (i17) {
                        case 4:
                            str = "https://lingodeer.freshdesk.com/es-LA/support/home";
                            break;
                        case 5:
                            str = "https://lingodeer.freshdesk.com/fr/support/home";
                            break;
                        case 6:
                            str = "https://lingodeer.freshdesk.com/de/support/home";
                            break;
                        case 7:
                        default:
                            str = "https://lingodeer.freshdesk.com/en/support/home";
                            break;
                        case 8:
                            str = "https://lingodeer.freshdesk.com/pt-BR/support/home";
                            break;
                        case 9:
                            str = "https://lingodeer.freshdesk.com/zh-TW/support/home";
                            break;
                        case 10:
                            str = "https://lingodeer.freshdesk.com/ru-RU/support/home";
                            break;
                    }
                } else {
                    str = "https://lingodeer.freshdesk.com/id/support/home";
                }
                int i18 = RemoteUrlActivity.R;
                String string = mainComposeActivity.getString(R.string.faq);
                kotlin.jvm.internal.m.e(string, "getString(...)");
                mainComposeActivity.startActivity(g1.q(mainComposeActivity, str, string));
                return b0Var;
            case 8:
                int i19 = RemoteUrlActivity.R;
                String strG = ep.a.g("https://www.", FirebaseRemoteConfig.d().f("end_point"), "/terms-conditions-html");
                String string2 = mainComposeActivity.getString(R.string.terms_of_use_login);
                kotlin.jvm.internal.m.e(string2, "getString(...)");
                mainComposeActivity.startActivity(g1.q(mainComposeActivity, strG, string2));
                return b0Var;
            case 9:
                int i21 = RemoteUrlActivity.R;
                String strG2 = ep.a.g("https://www.", FirebaseRemoteConfig.d().f("end_point"), "/privacypolicy-html");
                String string3 = mainComposeActivity.getString(R.string.privacy_policy_login);
                kotlin.jvm.internal.m.e(string3, "getString(...)");
                mainComposeActivity.startActivity(g1.q(mainComposeActivity, strG2, string3));
                return b0Var;
            case 10:
                ar.g gVarQ4 = mainComposeActivity.q();
                i.c reviewActivityResultLauncher = mainComposeActivity.S;
                gVarQ4.getClass();
                kotlin.jvm.internal.m.f(reviewActivityResultLauncher, "reviewActivityResultLauncher");
                b7.e0.A(gVarQ4.f2851b, "jxz_review_click_enter_flashcard");
                int i22 = CourseFlashCardIndexActivity.f21612t;
                Intent intent3 = new Intent(gVarQ4.f2852c, (Class<?>) CourseFlashCardIndexActivity.class);
                intent3.putExtra("extra_start_destination", "scheduled_srs");
                reviewActivityResultLauncher.a(intent3);
                return b0Var;
            default:
                int i23 = CourseListenAlongActivity.f21613t;
                mainComposeActivity.startActivity(new Intent(mainComposeActivity, (Class<?>) CourseListenAlongActivity.class));
                return b0Var;
        }
    }
}
