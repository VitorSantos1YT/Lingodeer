package sl;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import bq.r;
import com.lingodeer.data.env.Env;
import dt.Xk.wuoM;
import kotlin.jvm.internal.m;
import su.Mbl.tcppUUQxZjFdy;

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
        super(context, "IdnSkill.db", null, 1, "idn_skill.zip", env);
        this.H = i11;
        switch (i11) {
            case 2:
                m.f(context, tcppUUQxZjFdy.ncrmBsaTZFcuPhP);
                super(context, "EnesSkill.db", null, 1, "enes_skill.zip", env);
                break;
            case 3:
                m.f(context, "context");
                super(context, "TurSkill.db", null, 1, "tur_skill.zip", env);
                break;
            case 4:
            case 5:
            case 7:
            case 8:
            case 10:
            case 13:
            case 15:
            case 17:
            default:
                m.f(context, "context");
                break;
            case 6:
                m.f(context, "context");
                super(context, "ArSkill.db", null, 1, "ar_skill.zip", env);
                break;
            case 9:
                m.f(context, "context");
                super(context, "KrSkill.db", null, 1, "kr_skill.zip", env);
                break;
            case 11:
                m.f(context, "context");
                super(context, "KrupSkill.db", null, 1, "krup_skill.zip", env);
                break;
            case 12:
                m.f(context, "context");
                super(context, "UkrSkill.db", null, 1, "ukr_skill.zip", env);
                break;
            case 14:
                m.f(context, "context");
                super(context, "EnSkill.db", null, 1, "en_skill.zip", env);
                break;
            case 16:
                m.f(context, "context");
                super(context, "ItSkill.db", null, 1, "it_skill.zip", env);
                break;
            case 18:
                m.f(context, "context");
                super(context, "FrusSkill.db", null, 1, "frus_skill.zip", env);
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
                env.idnDbVersion = bq.m.e(c());
                env.updateEntry("idnDbVersion");
                env.idnDefaultLan = 3;
                env.updateEntry("idnDefaultLan");
                break;
            case 1:
                int[] iArr2 = r.f4959a;
                env.idnScDbVersion = bq.m.e(c());
                env.updateEntry("idnScDbVersion");
                break;
            case 2:
                int[] iArr3 = r.f4959a;
                env.enesDbVersion = bq.m.e(c());
                env.updateEntry("enesDbVersion");
                env.enesDefaultLan = 4;
                env.updateEntry("enesDefaultLan");
                break;
            case 3:
                int[] iArr4 = r.f4959a;
                env.turDbVersion = bq.m.e(c());
                env.updateEntry("turDbVersion");
                env.turDefaultLan = 3;
                env.updateEntry("turDefaultLan");
                break;
            case 4:
                int[] iArr5 = r.f4959a;
                env.turScDbVersion = bq.m.e(c());
                env.updateEntry("turScDbVersion");
                break;
            case 5:
                int[] iArr6 = r.f4959a;
                env.arCharDbVersion = bq.m.e(c());
                env.updateEntry("arCharDbVersion");
                break;
            case 6:
                int[] iArr7 = r.f4959a;
                env.arDbVersion = bq.m.e(c());
                env.updateEntry("arDbVersion");
                env.arDefaultLan = 3;
                env.updateEntry(wuoM.kFmiIsNRwGnb);
                break;
            case 7:
                int[] iArr8 = r.f4959a;
                env.arScDbVersion = bq.m.e(c());
                env.updateEntry("arScDbVersion");
                break;
            case 8:
                int[] iArr9 = r.f4959a;
                env.koCharDbVersion = bq.m.e(c());
                env.updateEntry("koCharDbVersion");
                break;
            case 9:
                int[] iArr10 = r.f4959a;
                env.koDbVersion = bq.m.e(c());
                env.updateEntry("koDbVersion");
                env.koDefaultLan = 3;
                env.updateEntry("koDefaultLan");
                break;
            case 10:
                int[] iArr11 = r.f4959a;
                env.krScDbVersion = bq.m.e(c());
                env.updateEntry("krScDbVersion");
                break;
            case 11:
                int[] iArr12 = r.f4959a;
                env.krupDbVersion = bq.m.e(c());
                env.updateEntry("krupDbVersion");
                env.krupDefaultLan = 3;
                env.updateEntry("krupDefaultLan");
                break;
            case 12:
                int[] iArr13 = r.f4959a;
                env.ukrDbVersion = bq.m.e(c());
                env.updateEntry("ukrDbVersion");
                env.ukrDefaultLan = 3;
                env.updateEntry("ukrDefaultLan");
                break;
            case 13:
                int[] iArr14 = r.f4959a;
                env.ukrScDbVersion = bq.m.e(c());
                env.updateEntry("ukrScDbVersion");
                break;
            case 14:
                int[] iArr15 = r.f4959a;
                env.enDbVersion = bq.m.e(c());
                env.updateEntry("enDbVersion");
                env.enDefaultLan = 2;
                env.updateEntry("enDefaultLan");
                break;
            case 15:
                int[] iArr16 = r.f4959a;
                env.enScDbVersion = bq.m.e(c());
                env.updateEntry("enScDbVersion");
                break;
            case 16:
                int[] iArr17 = r.f4959a;
                env.itDbVersion = bq.m.e(c());
                env.updateEntry("itDbVersion");
                env.itDefaultLan = 3;
                env.updateEntry("itDefaultLan");
                break;
            case 17:
                int[] iArr18 = r.f4959a;
                env.itScDbVersion = bq.m.e(c());
                env.updateEntry("itScDbVersion");
                break;
            default:
                int[] iArr19 = r.f4959a;
                env.frusDbVersion = bq.m.e(c());
                env.updateEntry("frusDbVersion");
                env.frusDefaultLan = 3;
                env.updateEntry("frusDefaultLan");
                break;
        }
    }
}
