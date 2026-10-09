package ao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import bq.r;
import com.google.android.gms.measurement.zfxB.ypOOxsaJG;
import com.google.api.Service;
import com.lingodeer.data.env.Env;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends jj.a {
    public final /* synthetic */ int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i11, String str2, Env env, int i12) {
        super(context, str, cursorFactory, i11, str2, env);
        this.H = i12;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, Env env, int i11) {
        super(context, "RuSkill.db", null, 1, "ru_skill.zip", env);
        this.H = i11;
        switch (i11) {
            case 2:
                m.f(context, "context");
                super(context, "GrkSkill.db", null, 1, "grk_skill.zip", env);
                break;
            case 3:
            case 4:
            case 5:
            case 7:
            case 10:
            case 12:
            case 14:
            case 16:
            case 18:
            case 21:
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
            case 27:
            default:
                m.f(context, "context");
                break;
            case 6:
                m.f(context, "context");
                super(context, "JpSkill.db", null, 1, "jp_skill.zip", env);
                break;
            case 8:
                m.f(context, "context");
                super(context, "JpupSkill.db", null, 1, "jpup_skill.zip", env);
                break;
            case 9:
                m.f(context, "context");
                super(context, "EsSkill.db", null, 1, "es_skill.zip", env);
                break;
            case 11:
                m.f(context, "context");
                super(context, "MalSkill.db", null, 1, "mal_skill.zip", env);
                break;
            case 13:
                m.f(context, "context");
                super(context, "VtSkill.db", null, 1, "vt_skill.zip", env);
                break;
            case 15:
                m.f(context, "context");
                super(context, "HindiSkill.db", null, 1, "hindi_skill.zip", env);
                break;
            case 17:
                m.f(context, "context");
                super(context, "DeSkill.db", null, 1, "de_skill.zip", env);
                break;
            case 19:
                m.f(context, "context");
                super(context, "EsusSkill.db", null, 1, "esus_skill.zip", env);
                break;
            case 20:
                m.f(context, "context");
                super(context, "PolSkill.db", null, 1, "pol_skill.zip", env);
                break;
            case 22:
                m.f(context, "context");
                super(context, "CnSkill.db", null, 1, "cn_skill_v2.zip", env);
                break;
            case 23:
                m.f(context, "context");
                super(context, "CnupSkill.db", null, 1, "cnup_skill_v2.zip", env);
                break;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                m.f(context, "context");
                super(context, "ThaiSkill.db", null, 1, "thai_skill.zip", env);
                break;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                m.f(context, "context");
                super(context, "FrSkill.db", null, 1, "fr_skill.zip", env);
                break;
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                m.f(context, "context");
                super(context, "PtSkill.db", null, 1, "pt_skill.zip", env);
                break;
        }
    }

    @Override // jj.a
    public final void h() {
        int i11 = this.H;
        Env env = this.f36404c;
        switch (i11) {
            case 0:
                int[] iArr = r.f4959a;
                env.ruDbVersion = bq.m.e(c());
                env.updateEntry("ruDbVersion");
                env.ruDefaultLan = 3;
                env.updateEntry("ruDefaultLan");
                break;
            case 1:
                int[] iArr2 = r.f4959a;
                env.ruScDbVersion = bq.m.e(c());
                env.updateEntry("ruScDbVersion");
                break;
            case 2:
                int[] iArr3 = r.f4959a;
                env.grkDbVersion = bq.m.e(c());
                env.updateEntry("grkDbVersion");
                env.grkDefaultLan = 3;
                env.updateEntry("grkDefaultLan");
                break;
            case 3:
                int[] iArr4 = r.f4959a;
                env.grkScDbVersion = bq.m.e(c());
                env.updateEntry("grkScDbVersion");
                break;
            case 4:
                int[] iArr5 = r.f4959a;
                env.cnScDbVersion = bq.m.e(c());
                env.updateEntry("cnScDbVersion");
                break;
            case 5:
                int[] iArr6 = r.f4959a;
                env.jsCharDbVersion = bq.m.e(c());
                env.updateEntry("jsCharDbVersion");
                break;
            case 6:
                int[] iArr7 = r.f4959a;
                env.jsDbVersion = bq.m.e(c());
                env.updateEntry("jsDbVersion");
                env.jsDefaultLan = 3;
                env.updateEntry("jsDefaultLan");
                break;
            case 7:
                int[] iArr8 = r.f4959a;
                env.jpScDbVersion = bq.m.e(c());
                env.updateEntry("jpScDbVersion");
                break;
            case 8:
                int[] iArr9 = r.f4959a;
                env.jpupDbVersion = bq.m.e(c());
                env.updateEntry("jpupDbVersion");
                env.jpupDefaultLan = 3;
                env.updateEntry("jpupDefaultLan");
                break;
            case 9:
                int[] iArr10 = r.f4959a;
                env.esDbVersion = bq.m.e(c());
                env.updateEntry("esDbVersion");
                env.esDefaultLan = 3;
                env.updateEntry("esDefaultLan");
                break;
            case 10:
                int[] iArr11 = r.f4959a;
                env.esScDbVersion = bq.m.e(c());
                env.updateEntry("esScDbVersion");
                break;
            case 11:
                int[] iArr12 = r.f4959a;
                env.malDbVersion = bq.m.e(c());
                env.updateEntry("malDbVersion");
                env.malDefaultLan = 3;
                env.updateEntry(ypOOxsaJG.bGOconC);
                break;
            case 12:
                int[] iArr13 = r.f4959a;
                env.malScDbVersion = bq.m.e(c());
                env.updateEntry("malScDbVersion");
                break;
            case 13:
                int[] iArr14 = r.f4959a;
                env.vtDbVersion = bq.m.e(c());
                env.updateEntry("vtDbVersion");
                env.vtDefaultLan = 3;
                env.updateEntry("vtDefaultLan");
                break;
            case 14:
                int[] iArr15 = r.f4959a;
                env.vtScDbVersion = bq.m.e(c());
                env.updateEntry("vtScDbVersion");
                break;
            case 15:
                int[] iArr16 = r.f4959a;
                env.hiDbVersion = bq.m.e(c());
                env.updateEntry("hiDbVersion");
                env.hiDefaultLan = 3;
                env.updateEntry("hiDefaultLan");
                break;
            case 16:
                int[] iArr17 = r.f4959a;
                env.turScDbVersion = bq.m.e(c());
                env.updateEntry("turScDbVersion");
                break;
            case 17:
                int[] iArr18 = r.f4959a;
                env.deDbVersion = bq.m.e(c());
                env.updateEntry("deDbVersion");
                env.deDefaultLan = 3;
                env.updateEntry("deDefaultLan");
                break;
            case 18:
                int[] iArr19 = r.f4959a;
                env.deScDbVersion = bq.m.e(c());
                env.updateEntry("deScDbVersion");
                break;
            case 19:
                int[] iArr20 = r.f4959a;
                env.esusDbVersion = bq.m.e(c());
                env.updateEntry("esusDbVersion");
                env.esusDefaultLan = 3;
                env.updateEntry("esusDefaultLan");
                break;
            case 20:
                int[] iArr21 = r.f4959a;
                env.polDbVersion = bq.m.e(c());
                env.updateEntry("polDbVersion");
                env.polDefaultLan = 3;
                env.updateEntry("polDefaultLan");
                break;
            case 21:
                int[] iArr22 = r.f4959a;
                env.polScDbVersion = bq.m.e(c());
                env.updateEntry("polScDbVersion");
                break;
            case 22:
                int[] iArr23 = r.f4959a;
                env.csDbVersion = bq.m.e(c());
                env.updateEntry("csDbVersion");
                env.csDefaultLan = 3;
                env.updateEntry("csDefaultLan");
                break;
            case 23:
                int[] iArr24 = r.f4959a;
                env.cnupDbVersion = bq.m.e(c());
                env.updateEntry("cnupDbVersion");
                env.cnupDefaultLan = 3;
                env.updateEntry("cnupDefaultLan");
                break;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                int[] iArr25 = r.f4959a;
                env.thaiDbVersion = bq.m.e(c());
                env.updateEntry("thaiDbVersion");
                env.thaiDefaultLan = 3;
                env.updateEntry("thaiDefaultLan");
                break;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                int[] iArr26 = r.f4959a;
                env.thaiScDbVersion = bq.m.e(c());
                env.updateEntry("thaiScDbVersion");
                break;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                int[] iArr27 = r.f4959a;
                env.frDbVersion = bq.m.e(c());
                env.updateEntry("frDbVersion");
                env.frDefaultLan = 3;
                env.updateEntry("frDefaultLan");
                break;
            case 27:
                int[] iArr28 = r.f4959a;
                env.frScDbVersion = bq.m.e(c());
                env.updateEntry("frScDbVersion");
                break;
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                int[] iArr29 = r.f4959a;
                env.ptDbVersion = bq.m.e(c());
                env.updateEntry("ptDbVersion");
                env.ptDefaultLan = 3;
                env.updateEntry("ptDefaultLan");
                break;
            default:
                int[] iArr30 = r.f4959a;
                env.ptScDbVersion = bq.m.e(c());
                env.updateEntry("ptScDbVersion");
                break;
        }
    }
}
