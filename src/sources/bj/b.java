package bj;

import android.content.Context;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import cf.x;
import com.bumptech.glide.d;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingodeer.R;
import kotlin.jvm.internal.m;
import p9.v;
import qy.j;
import w4.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends v {
    public Preference K;
    public Preference L;
    public final Object M = d.u(j.SYNCHRONIZED, new a(this, 0));
    public final app.rive.runtime.kotlin.core.a N = new app.rive.runtime.kotlin.core.a(this, 2);

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, qy.h] */
    @Override // androidx.fragment.app.k0
    public final void onResume() {
        super.onResume();
        ((ur.a) this.M.getValue()).d("FlashcardSettings");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:28:0x007b  */
    /* JADX WARN: Code duplicated, block: B:30:0x0099  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:36:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:42:0x0147  */
    /* JADX WARN: Code duplicated, block: B:43:0x0154  */
    /* JADX WARN: Code duplicated, block: B:44:0x0162  */
    @Override // p9.v
    public final void r() {
        q(R.xml.flash_card_settting_preferences);
        this.K = b(getString(R.string.flash_card_display_key));
        this.L = b(getString(R.string.flash_card_audio_model_key));
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        int i11 = x.n().keyLanguage;
        if (i11 == 22) {
            Preference preference = this.K;
            m.d(preference, "null cannot be cast to non-null type androidx.preference.ListPreference");
            ((ListPreference) preference).F(R.array.ru_flashcard_display_item);
        } else if (i11 == 40) {
            Preference preference2 = this.K;
            m.d(preference2, "null cannot be cast to non-null type androidx.preference.ListPreference");
            ((ListPreference) preference2).F(R.array.it_flashcard_display_item);
        } else if (i11 == 51) {
            Preference preference3 = this.K;
            m.d(preference3, "null cannot be cast to non-null type androidx.preference.ListPreference");
            ((ListPreference) preference3).F(R.array.ar_flashcard_display_item);
        } else if (i11 == 57) {
            Preference preference4 = this.K;
            m.d(preference4, "null cannot be cast to non-null type androidx.preference.ListPreference");
            ((ListPreference) preference4).F(R.array.thai_flashcard_display_item);
        } else if (i11 == 61) {
            Preference preference5 = this.K;
            m.d(preference5, "null cannot be cast to non-null type androidx.preference.ListPreference");
            ((ListPreference) preference5).F(R.array.hindi_flashcard_display_item);
        } else if (i11 == 63) {
            Preference preference6 = this.K;
            m.d(preference6, "null cannot be cast to non-null type androidx.preference.ListPreference");
            ((ListPreference) preference6).F(R.array.ukr_flashcard_display_item);
        } else if (i11 == 65) {
            Preference preference7 = this.K;
            m.d(preference7, "null cannot be cast to non-null type androidx.preference.ListPreference");
            ((ListPreference) preference7).F(R.array.gre_flashcard_display_item);
        } else if (i11 == 69) {
            Preference preference8 = this.K;
            m.d(preference8, "null cannot be cast to non-null type androidx.preference.ListPreference");
            ((ListPreference) preference8).F(R.array.mal_flashcard_display_item);
        } else if (i11 != 47 && i11 != 48) {
            switch (i11) {
                case 0:
                    Preference preference9 = this.K;
                    m.d(preference9, "null cannot be cast to non-null type androidx.preference.ListPreference");
                    ((ListPreference) preference9).F(R.array.display_item);
                    break;
                case 1:
                    Preference preference10 = this.K;
                    m.d(preference10, "null cannot be cast to non-null type androidx.preference.ListPreference");
                    ((ListPreference) preference10).F(R.array.js_display_item);
                    break;
                case 2:
                    Preference preference11 = this.K;
                    m.d(preference11, "null cannot be cast to non-null type androidx.preference.ListPreference");
                    ((ListPreference) preference11).F(R.array.korean_flashcard_display_item);
                    break;
                case 3:
                    Preference preference12 = this.K;
                    m.d(preference12, "null cannot be cast to non-null type androidx.preference.ListPreference");
                    ((ListPreference) preference12).F(R.array.en_flashcard_display_item);
                    break;
                case 4:
                    Preference preference13 = this.K;
                    m.d(preference13, "null cannot be cast to non-null type androidx.preference.ListPreference");
                    ((ListPreference) preference13).F(R.array.es_flashcard_display_item);
                    break;
                case 5:
                    Preference preference14 = this.K;
                    m.d(preference14, "null cannot be cast to non-null type androidx.preference.ListPreference");
                    ((ListPreference) preference14).F(R.array.fr_flashcard_display_item);
                    break;
                case 6:
                    Preference preference15 = this.K;
                    m.d(preference15, "null cannot be cast to non-null type androidx.preference.ListPreference");
                    ((ListPreference) preference15).F(R.array.de_flashcard_display_item);
                    break;
                case 7:
                    Preference preference16 = this.K;
                    m.d(preference16, "null cannot be cast to non-null type androidx.preference.ListPreference");
                    ((ListPreference) preference16).F(R.array.vt_flashcard_display_item);
                    break;
                case 8:
                    Preference preference17 = this.K;
                    m.d(preference17, "null cannot be cast to non-null type androidx.preference.ListPreference");
                    ((ListPreference) preference17).F(R.array.pt_flashcard_display_item);
                    break;
                default:
                    switch (i11) {
                        case 10:
                            Preference preference18 = this.K;
                            m.d(preference18, "null cannot be cast to non-null type androidx.preference.ListPreference");
                            ((ListPreference) preference18).F(R.array.ru_flashcard_display_item);
                            break;
                        case 11:
                            Preference preference19 = this.K;
                            m.d(preference19, "null cannot be cast to non-null type androidx.preference.ListPreference");
                            ((ListPreference) preference19).F(R.array.display_item);
                            break;
                        case 12:
                            Preference preference110 = this.K;
                            m.d(preference110, "null cannot be cast to non-null type androidx.preference.ListPreference");
                            ((ListPreference) preference110).F(R.array.js_display_item);
                            break;
                        case 13:
                            Preference preference111 = this.K;
                            m.d(preference111, "null cannot be cast to non-null type androidx.preference.ListPreference");
                            ((ListPreference) preference111).F(R.array.korean_flashcard_display_item);
                            break;
                        case 14:
                            Preference preference112 = this.K;
                            m.d(preference112, "null cannot be cast to non-null type androidx.preference.ListPreference");
                            ((ListPreference) preference112).F(R.array.es_flashcard_display_item);
                            break;
                        case 15:
                            Preference preference113 = this.K;
                            m.d(preference113, "null cannot be cast to non-null type androidx.preference.ListPreference");
                            ((ListPreference) preference113).F(R.array.fr_flashcard_display_item);
                            break;
                        case 16:
                            Preference preference114 = this.K;
                            m.d(preference114, "null cannot be cast to non-null type androidx.preference.ListPreference");
                            ((ListPreference) preference114).F(R.array.de_flashcard_display_item);
                            break;
                        case 17:
                            Preference preference115 = this.K;
                            m.d(preference115, "null cannot be cast to non-null type androidx.preference.ListPreference");
                            ((ListPreference) preference115).F(R.array.pt_flashcard_display_item);
                            break;
                        case 18:
                            Preference preference20 = this.K;
                            m.d(preference20, "null cannot be cast to non-null type androidx.preference.ListPreference");
                            ((ListPreference) preference20).F(R.array.idn_flashcard_display_item);
                            break;
                        case 19:
                            Preference preference21 = this.K;
                            m.d(preference21, "null cannot be cast to non-null type androidx.preference.ListPreference");
                            ((ListPreference) preference21).F(R.array.pol_flashcard_display_item);
                            break;
                        case 20:
                            Preference preference22 = this.K;
                            m.d(preference22, "null cannot be cast to non-null type androidx.preference.ListPreference");
                            ((ListPreference) preference22).F(R.array.it_flashcard_display_item);
                            break;
                        default:
                            switch (i11) {
                                case 53:
                                case 54:
                                    Preference preference116 = this.K;
                                    m.d(preference116, "null cannot be cast to non-null type androidx.preference.ListPreference");
                                    ((ListPreference) preference116).F(R.array.fr_flashcard_display_item);
                                    break;
                                case 55:
                                    Preference preference23 = this.K;
                                    m.d(preference23, "null cannot be cast to non-null type androidx.preference.ListPreference");
                                    ((ListPreference) preference23).F(R.array.ar_flashcard_display_item);
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            Preference preference117 = this.K;
            m.d(preference117, "null cannot be cast to non-null type androidx.preference.ListPreference");
            ((ListPreference) preference117).F(R.array.es_flashcard_display_item);
        }
        Preference preference24 = this.K;
        m.d(preference24, "null cannot be cast to non-null type androidx.preference.ListPreference");
        c.u(x.n().flashCardDisplayIn, (ListPreference) preference24);
        Preference preference25 = this.L;
        m.d(preference25, "null cannot be cast to non-null type androidx.preference.ListPreference");
        c.u(x.n().flashCardIsPlayModel, (ListPreference) preference25);
        Preference preference26 = this.K;
        m.c(preference26);
        app.rive.runtime.kotlin.core.a aVar = this.N;
        preference26.f2327e = aVar;
        if (preference26 instanceof ListPreference) {
            Context context = preference26.f2319a;
            aVar.c(preference26, context.getSharedPreferences(context.getPackageName() + "_preferences", 0).getString(preference26.N, null));
        }
        Preference preference27 = this.L;
        m.c(preference27);
        preference27.f2327e = aVar;
        if (preference27 instanceof ListPreference) {
            Context context2 = preference27.f2319a;
            aVar.c(preference27, context2.getSharedPreferences(context2.getPackageName() + "_preferences", 0).getString(preference27.N, null));
        }
    }
}
