package ao;

import android.content.Context;
import cf.x;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.http.oss.MYmT.bjXGJ;
import com.tbruyelle.rxpermissions3.BuildConfig;
import dt.Xk.wuoM;
import ij.f;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2815c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2816d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f2817e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, int i11) {
        super(context);
        this.f2814b = i11;
        m.f(context, "context");
        switch (i11) {
            case 1:
                super(context);
                LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                if (x.n().keyLanguage == 1) {
                    x.n();
                } else {
                    x.n();
                }
                this.f2815c = x.n().keyLanguage == 1 ? x.n().jsDefaultLan : x.n().jpupDefaultLan;
                x.n();
                this.f2816d = 3;
                this.f2817e = x.n().keyLanguage == 1 ? "jp_skill.zip" : "jpup_skill.zip";
                break;
            case 2:
                super(context);
                LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                x.n();
                this.f2815c = x.n().deDefaultLan;
                this.f2816d = 3;
                this.f2817e = "de_skill.zip";
                break;
            case 3:
                super(context);
                LingoSkillApplication lingoSkillApplication3 = LingoSkillApplication.f21665b;
                if (x.n().keyLanguage == 0) {
                    x.n();
                } else {
                    x.n();
                }
                this.f2815c = x.n().keyLanguage == 0 ? x.n().csDefaultLan : x.n().cnupDefaultLan;
                x.n();
                this.f2816d = 3;
                this.f2817e = x.n().keyLanguage == 0 ? "cn_skill_v2.zip" : "cnup_skill_v2.zip";
                break;
            case 4:
                super(context);
                LingoSkillApplication lingoSkillApplication4 = LingoSkillApplication.f21665b;
                this.f2815c = x.n().frDefaultLan;
                this.f2816d = 3;
                this.f2817e = "fr_skill.zip";
                break;
            case 5:
                super(context);
                LingoSkillApplication lingoSkillApplication5 = LingoSkillApplication.f21665b;
                x.n();
                this.f2815c = x.n().ptDefaultLan;
                this.f2816d = 3;
                this.f2817e = "pt_skill.zip";
                break;
            case 6:
                super(context);
                LingoSkillApplication lingoSkillApplication6 = LingoSkillApplication.f21665b;
                this.f2815c = x.n().enesDefaultLan;
                this.f2816d = 4;
                this.f2817e = BuildConfig.VERSION_NAME;
                break;
            case 7:
                super(context);
                LingoSkillApplication lingoSkillApplication7 = LingoSkillApplication.f21665b;
                this.f2815c = x.n().arDefaultLan;
                this.f2816d = 3;
                this.f2817e = "ar_skill.zip";
                break;
            case 8:
                super(context);
                LingoSkillApplication lingoSkillApplication8 = LingoSkillApplication.f21665b;
                if (x.n().keyLanguage == 2) {
                    x.n();
                } else {
                    x.n();
                }
                this.f2815c = x.n().keyLanguage == 2 ? x.n().koDefaultLan : x.n().krupDefaultLan;
                x.n();
                this.f2816d = 3;
                this.f2817e = x.n().keyLanguage == 2 ? "kr_skill.zip" : "krup_skill.zip";
                break;
            case 9:
                super(context);
                LingoSkillApplication lingoSkillApplication9 = LingoSkillApplication.f21665b;
                x.n();
                this.f2815c = x.n().enDefaultLan;
                this.f2816d = 2;
                this.f2817e = "en_skill.zip";
                break;
            default:
                LingoSkillApplication lingoSkillApplication10 = LingoSkillApplication.f21665b;
                this.f2815c = x.n().ruDefaultLan;
                this.f2816d = 3;
                this.f2817e = "ru_skill.zip";
                break;
        }
    }

    @Override // ij.f
    public final String d() {
        switch (this.f2814b) {
            case 0:
                return this.f2817e;
            case 1:
                return this.f2817e;
            case 2:
                return this.f2817e;
            case 3:
                return this.f2817e;
            case 4:
                return this.f2817e;
            case 5:
                return this.f2817e;
            case 6:
                return "enes_skill.zip";
            case 7:
                return this.f2817e;
            case 8:
                return this.f2817e;
            default:
                return this.f2817e;
        }
    }

    @Override // ij.f
    public final int f() {
        switch (this.f2814b) {
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
        }
        return this.f2815c;
    }

    @Override // ij.f
    public final int g() {
        switch (this.f2814b) {
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
        }
        return this.f2816d;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:110:0x0164 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:178:0x0244 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x00a1 A[RETURN, SYNTHETIC] */
    @Override // ij.f
    public final String e() {
        switch (this.f2814b) {
            case 0:
                LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                int i11 = x.n().locateLanguage;
                if (i11 != 6) {
                    return (i11 == 9 || i11 != 21) ? "trans_ru_skill_tch.z" : "trans_ru_skill_tur.z";
                }
                return "trans_ru_skill_de.z";
            case 1:
                LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                int i12 = x.n().locateLanguage;
                if (i12 == 2) {
                    return x.n().keyLanguage == 1 ? "trans_jp_skill_kr.z" : "trans_jpup_skill_kr.z";
                }
                if (i12 == 18) {
                    return "trans_jp_skill_idn.z";
                }
                if (i12 == 57) {
                    return x.n().keyLanguage == 1 ? "trans_jp_skill_thai.z" : "trans_jpup_skill_thai.z";
                }
                if (i12 == 20) {
                    return x.n().keyLanguage == 1 ? "trans_jp_skill_it.z" : "trans_jpup_skill_it.z";
                }
                if (i12 == 21) {
                    return x.n().keyLanguage == 1 ? "trans_jp_skill_tur.z" : "trans_jpup_skill_tur.z";
                }
                switch (i12) {
                    case 4:
                        if (x.n().keyLanguage == 1) {
                            return "trans_jp_skill_es.z";
                        }
                        return "trans_jpup_skill_es.z";
                    case 5:
                        return x.n().keyLanguage == 1 ? "trans_jp_skill_fr.z" : "trans_jpup_skill_fr.z";
                    case 6:
                        return x.n().keyLanguage == 1 ? "trans_jp_skill_de.z" : "trans_jpup_skill_de.z";
                    case 7:
                        return x.n().keyLanguage == 1 ? "trans_jp_skill_vt.z" : "trans_jpup_skill_vt.z";
                    case 8:
                        return x.n().keyLanguage == 1 ? "trans_jp_skill_pt.z" : "trans_jpup_skill_pt.z";
                    case 9:
                        return x.n().keyLanguage == 1 ? "trans_jp_skill_tch.z" : "trans_jpup_skill_tch.z";
                    case 10:
                        return "trans_jp_skill_ru.z";
                    default:
                        return "trans_jp_skill_es.z";
                }
            case 2:
                LingoSkillApplication lingoSkillApplication3 = LingoSkillApplication.f21665b;
                int i13 = x.n().locateLanguage;
                if (i13 == 1) {
                    return "trans_de_skill_jp.z";
                }
                if (i13 != 2) {
                    return (i13 == 9 || i13 != 21) ? "trans_de_skill_tch.z" : "trans_de_skill_tur.z";
                }
                return "trans_de_skill_kr.z";
            case 3:
                LingoSkillApplication lingoSkillApplication4 = LingoSkillApplication.f21665b;
                int i14 = x.n().locateLanguage;
                if (i14 == 1) {
                    return x.n().keyLanguage == 0 ? "trans_cn_skill_jp.z" : "trans_cnup_skill_jp.z";
                }
                if (i14 == 2) {
                    return x.n().keyLanguage == 0 ? "trans_cn_skill_kr.z" : "trans_cnup_skill_kr.z";
                }
                if (i14 == 10) {
                    return x.n().keyLanguage == 0 ? "trans_cn_skill_ru.z" : "trans_cnup_skill_ru.z";
                }
                if (i14 == 18) {
                    return "trans_cn_skill_idn.z";
                }
                if (i14 == 51) {
                    return "trans_cn_skill_ara.z";
                }
                if (i14 == 57) {
                    return x.n().keyLanguage == 0 ? "trans_cn_skill_thai.z" : "trans_cnup_skill_thai.z";
                }
                if (i14 == 20) {
                    return x.n().keyLanguage == 0 ? "trans_cn_skill_it.z" : "trans_cnup_skill_it.z";
                }
                if (i14 == 21) {
                    return "trans_cn_skill_tur.z";
                }
                switch (i14) {
                    case 4:
                        if (x.n().keyLanguage == 0) {
                            return "trans_cn_skill_es.z";
                        }
                        return "trans_cnup_skill_es.z";
                    case 5:
                        return x.n().keyLanguage == 0 ? "trans_cn_skill_fr.z" : "trans_cnup_skill_fr.z";
                    case 6:
                        return x.n().keyLanguage == 0 ? "trans_cn_skill_de.z" : "trans_cnup_skill_de.z";
                    case 7:
                        return x.n().keyLanguage == 0 ? "trans_cn_skill_vt.z" : "trans_cnup_skill_vt.z";
                    case 8:
                        return x.n().keyLanguage == 0 ? "trans_cn_skill_pt.z" : "trans_cnup_skill_pt.z";
                    default:
                        return "trans_cn_skill_es.z";
                }
            case 4:
                LingoSkillApplication lingoSkillApplication5 = LingoSkillApplication.f21665b;
                int i15 = x.n().locateLanguage;
                if (i15 != 1) {
                    return i15 != 2 ? "trans_fr_skill_tch.z" : "trans_fr_skill_kr.z";
                }
                return "trans_fr_skill_jp.z";
            case 5:
                LingoSkillApplication lingoSkillApplication6 = LingoSkillApplication.f21665b;
                return x.n().locateLanguage != 1 ? "trans_pt_skill_tch.z" : "trans_pt_skill_jp.z";
            case 6:
                return this.f2817e;
            case 7:
                LingoSkillApplication lingoSkillApplication7 = LingoSkillApplication.f21665b;
                return x.n().locateLanguage == 9 ? "trans_ar_skill_tch.z" : BuildConfig.VERSION_NAME;
            case 8:
                LingoSkillApplication lingoSkillApplication8 = LingoSkillApplication.f21665b;
                int i16 = x.n().locateLanguage;
                if (i16 == 1) {
                    return x.n().keyLanguage == 2 ? "trans_kr_skill_jp.z" : "trans_krup_skill_jp.z";
                }
                if (i16 == 18) {
                    return "trans_kr_skill_idn.z";
                }
                if (i16 == 20) {
                    return x.n().keyLanguage == 2 ? "trans_kr_skill_it.z" : "trans_krup_skill_it.z";
                }
                switch (i16) {
                    case 4:
                        if (x.n().keyLanguage == 2) {
                            return "trans_kr_skill_es.z";
                        }
                        return "trans_krup_skill_es.z";
                    case 5:
                        return x.n().keyLanguage == 2 ? "trans_kr_skill_fr.z" : "trans_krup_skill_fr.z";
                    case 6:
                        return x.n().keyLanguage == 2 ? "trans_kr_skill_de.z" : "trans_krup_skill_de.z";
                    case 7:
                        return "trans_kr_skill_vt.z";
                    case 8:
                        return "trans_kr_skill_pt.z";
                    case 9:
                        return x.n().keyLanguage == 2 ? "trans_kr_skill_tch.z" : "trans_krup_skill_tch.z";
                    case 10:
                        return "trans_kr_skill_ru.z";
                    default:
                        return "trans_kr_skill_es.z";
                }
            default:
                LingoSkillApplication lingoSkillApplication9 = LingoSkillApplication.f21665b;
                int i17 = x.n().locateLanguage;
                if (i17 != 1) {
                    if (i17 == 51) {
                        return "trans_en_skill_ara.z";
                    }
                    if (i17 == 57) {
                        return "trans_en_skill_thai.z";
                    }
                    switch (i17) {
                        case 4:
                            return wuoM.nCwZIDtXEcModV;
                        case 5:
                            return "trans_en_skill_fr.z";
                        case 6:
                            return "trans_en_skill_de.z";
                        case 7:
                            return "trans_en_skill_vt.z";
                        case 8:
                            return "trans_en_skill_pt.z";
                        case 9:
                            return "trans_en_skill_tch.z";
                        case 10:
                            return "trans_en_skill_ru.z";
                        default:
                            switch (i17) {
                                case 18:
                                    return "trans_en_skill_idn.z";
                                case 19:
                                    return "trans_en_skill_pol.z";
                                case 20:
                                    return "trans_en_skill_it.z";
                                case 21:
                                    return "trans_en_skill_tur.z";
                            }
                    }
                }
                return "trans_en_skill_jp.z";
        }
    }

    @Override // ij.f
    public final void j(int i11) {
        switch (this.f2814b) {
            case 0:
                LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                x.n().ruDefaultLan = i11;
                x.n().updateEntry("ruDefaultLan");
                break;
            case 1:
                LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                if (x.n().keyLanguage != 1) {
                    x.n().jpupDefaultLan = i11;
                    x.n().updateEntry("jpupDefaultLan");
                } else {
                    x.n().jsDefaultLan = i11;
                    x.n().updateEntry("jsDefaultLan");
                }
                break;
            case 2:
                LingoSkillApplication lingoSkillApplication3 = LingoSkillApplication.f21665b;
                x.n().deDefaultLan = i11;
                x.n().updateEntry("deDefaultLan");
                break;
            case 3:
                LingoSkillApplication lingoSkillApplication4 = LingoSkillApplication.f21665b;
                if (x.n().keyLanguage != 0) {
                    x.n().cnupDefaultLan = i11;
                    x.n().updateEntry(bjXGJ.xFYpnAuE);
                } else {
                    x.n().csDefaultLan = i11;
                    x.n().updateEntry("csDefaultLan");
                }
                break;
            case 4:
                LingoSkillApplication lingoSkillApplication5 = LingoSkillApplication.f21665b;
                x.n().frDefaultLan = i11;
                x.n().updateEntry("frDefaultLan");
                break;
            case 5:
                LingoSkillApplication lingoSkillApplication6 = LingoSkillApplication.f21665b;
                x.n().ptDefaultLan = i11;
                x.n().updateEntry("ptDefaultLan");
                break;
            case 6:
                LingoSkillApplication lingoSkillApplication7 = LingoSkillApplication.f21665b;
                x.n().enesDefaultLan = i11;
                x.n().updateEntry("enesDefaultLan");
                break;
            case 7:
                LingoSkillApplication lingoSkillApplication8 = LingoSkillApplication.f21665b;
                x.n().arDefaultLan = i11;
                x.n().updateEntry("arDefaultLan");
                break;
            case 8:
                LingoSkillApplication lingoSkillApplication9 = LingoSkillApplication.f21665b;
                if (x.n().keyLanguage != 2) {
                    x.n().krupDefaultLan = i11;
                    x.n().updateEntry("krupDefaultLan");
                } else {
                    x.n().koDefaultLan = i11;
                    x.n().updateEntry("koDefaultLan");
                }
                break;
            default:
                LingoSkillApplication lingoSkillApplication10 = LingoSkillApplication.f21665b;
                x.n().enDefaultLan = i11;
                x.n().updateEntry("enDefaultLan");
                break;
        }
    }
}
