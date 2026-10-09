package cl;

import a.ar.MFeWs;
import android.content.Context;
import cf.x;
import com.google.firebase.annotations.jjzf.kHfjNGauVgdF;
import com.lingo.lingoskill.LingoSkillApplication;
import com.tbruyelle.rxpermissions3.BuildConfig;
import ij.f;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f7181c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f7182d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Context context, int i11) {
        super(context);
        this.f7180b = i11;
    }

    @Override // ij.f
    public final String d() {
        switch (this.f7180b) {
            case 0:
                return "grk_skill.zip";
            case 1:
                return "es_skill.zip";
            case 2:
                return "mal_skill.zip";
            case 3:
                return "vt_skill.zip";
            case 4:
                return "hindi_skill.zip";
            case 5:
                return "esus_skill.zip";
            case 6:
                return "pol_skill.zip";
            case 7:
                return "thai_skill.zip";
            case 8:
                return "idn_skill.zip";
            case 9:
                return "tur_skill.zip";
            case 10:
                return "ukr_skill.zip";
            default:
                return "frus_skill.zip";
        }
    }

    @Override // ij.f
    public final int f() {
        switch (this.f7180b) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
        }
        return this.f7181c;
    }

    @Override // ij.f
    public final int g() {
        switch (this.f7180b) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
        }
        return this.f7182d;
    }

    @Override // ij.f
    public final String e() {
        switch (this.f7180b) {
            case 0:
                return BuildConfig.VERSION_NAME;
            case 1:
                LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                int i11 = x.n().locateLanguage;
                if (i11 == 1) {
                    return "trans_es_skill_jp.z";
                }
                if (i11 == 2) {
                    return kHfjNGauVgdF.XZMfFVPHmbEfcS;
                }
                if (i11 != 8) {
                    return (i11 == 9 || i11 != 57) ? "trans_es_skill_tch.z" : "trans_es_skill_thai.z";
                }
                return "trans_es_skill_pt.z";
            case 2:
            case 3:
            case 4:
                return BuildConfig.VERSION_NAME;
            case 5:
                LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                int i12 = x.n().locateLanguage;
                if (i12 == 1) {
                    return "trans_esus_skill_jp.z";
                }
                if (i12 == 2) {
                    return "trans_esus_skill_kr.z";
                }
                if (i12 == 5) {
                    return "trans_esus_skill_fr.z";
                }
                if (i12 != 6) {
                    return i12 != 9 ? BuildConfig.VERSION_NAME : "trans_esus_skill_tch.z";
                }
                return "trans_esus_skill_de.z";
            case 6:
                return BuildConfig.VERSION_NAME;
            case 7:
                LingoSkillApplication lingoSkillApplication3 = LingoSkillApplication.f21665b;
                int i13 = x.n().locateLanguage;
                if (i13 != 1) {
                    return i13 != 9 ? BuildConfig.VERSION_NAME : "trans_thai_skill_tch.z";
                }
                return "trans_thai_skill_jp.z";
            case 8:
            case 9:
            case 10:
                return BuildConfig.VERSION_NAME;
            default:
                LingoSkillApplication lingoSkillApplication4 = LingoSkillApplication.f21665b;
                int i14 = x.n().locateLanguage;
                if (i14 != 6) {
                    return i14 != 51 ? BuildConfig.VERSION_NAME : "trans_frus_skill_ara.z";
                }
                return "trans_frus_skill_de.z";
        }
    }

    @Override // ij.f
    public final void j(int i11) {
        switch (this.f7180b) {
            case 0:
                LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                x.n().grkDefaultLan = i11;
                x.n().updateEntry("grkDefaultLan");
                break;
            case 1:
                LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                x.n().esDefaultLan = i11;
                x.n().updateEntry("esDefaultLan");
                break;
            case 2:
                LingoSkillApplication lingoSkillApplication3 = LingoSkillApplication.f21665b;
                x.n().malDefaultLan = i11;
                x.n().updateEntry("malDefaultLan");
                break;
            case 3:
                LingoSkillApplication lingoSkillApplication4 = LingoSkillApplication.f21665b;
                x.n().vtDefaultLan = i11;
                x.n().updateEntry("vtDefaultLan");
                break;
            case 4:
                LingoSkillApplication lingoSkillApplication5 = LingoSkillApplication.f21665b;
                x.n().hiDefaultLan = i11;
                x.n().updateEntry("hiDefaultLan");
                break;
            case 5:
                LingoSkillApplication lingoSkillApplication6 = LingoSkillApplication.f21665b;
                x.n().esusDefaultLan = i11;
                x.n().updateEntry("esusDefaultLan");
                break;
            case 6:
                LingoSkillApplication lingoSkillApplication7 = LingoSkillApplication.f21665b;
                x.n().polDefaultLan = i11;
                x.n().updateEntry(MFeWs.bJETl);
                break;
            case 7:
                LingoSkillApplication lingoSkillApplication8 = LingoSkillApplication.f21665b;
                x.n().thaiDefaultLan = i11;
                x.n().updateEntry("thaiDefaultLan");
                break;
            case 8:
                LingoSkillApplication lingoSkillApplication9 = LingoSkillApplication.f21665b;
                x.n().idnDefaultLan = i11;
                x.n().updateEntry("idnDefaultLan");
                break;
            case 9:
                LingoSkillApplication lingoSkillApplication10 = LingoSkillApplication.f21665b;
                x.n().turDefaultLan = i11;
                x.n().updateEntry("turDefaultLan");
                break;
            case 10:
                LingoSkillApplication lingoSkillApplication11 = LingoSkillApplication.f21665b;
                x.n().ukrDefaultLan = i11;
                x.n().updateEntry("ukrDefaultLan");
                break;
            default:
                LingoSkillApplication lingoSkillApplication12 = LingoSkillApplication.f21665b;
                x.n().frusDefaultLan = i11;
                x.n().updateEntry("frusDefaultLan");
                break;
        }
    }
}
