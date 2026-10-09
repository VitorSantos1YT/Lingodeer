package wm;

import cf.x;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.DaoMaster;
import com.lingo.lingoskill.object.DaoSession;
import com.lingo.lingoskill.object.KOCharDao;
import com.lingo.lingoskill.object.KOCharPartDao;
import com.lingo.lingoskill.object.KOCharZhuyin;
import com.lingo.lingoskill.object.KOCharZhuyinDao;
import com.lingodeer.R;
import ff.h;
import java.util.List;
import k10.g;
import kotlin.jvm.internal.m;
import se.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static a f55177e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DaoSession f55178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final KOCharDao f55179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final KOCharPartDao f55180c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final KOCharZhuyinDao f55181d;

    public a(LingoSkillApplication lingoSkillApplication) {
        h.y(lingoSkillApplication, R.string.lesson_1_vowels);
        h.y(lingoSkillApplication, R.string.lesson_2_silent_consonant);
        h.y(lingoSkillApplication, R.string.lesson_3_consonants);
        h.y(lingoSkillApplication, R.string.lesson_4_consonants);
        h.y(lingoSkillApplication, R.string.lesson_5_consonants);
        h.y(lingoSkillApplication, R.string.lesson_6_consonants);
        h.y(lingoSkillApplication, R.string.lesson_7_consonants);
        h.y(lingoSkillApplication, R.string.lesson_8_consonants);
        h.y(lingoSkillApplication, R.string.lesson_1_comples_vowels);
        h.y(lingoSkillApplication, R.string.lesson_2_complex_vowels);
        h.y(lingoSkillApplication, R.string.lesson_3_complex_vowels);
        h.y(lingoSkillApplication, R.string.lesson_4_complex_vowels);
        h.y(lingoSkillApplication, R.string.lesson_5_complex_vowels);
        h.y(lingoSkillApplication, R.string.lesson_6_complex_vowels);
        h.y(lingoSkillApplication, R.string.lesson_7_complex_vowels);
        h.y(lingoSkillApplication, R.string.lesson_8_complex_vowels);
        LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
        DaoMaster daoMaster = new DaoMaster(new sl.a(lingoSkillApplication, "KoChar_2.db", null, 1, "kochar.db", x.n(), 8).getWritableDatabase());
        DaoSession daoSessionM210newSession = daoMaster.m210newSession();
        m.e(daoSessionM210newSession, "newSession(...)");
        this.f55178a = daoSessionM210newSession;
        org.greenrobot.greendao.database.a database = daoMaster.getDatabase();
        m.e(database, "getDatabase(...)");
        database.k("CREATE TABLE IF NOT EXISTS \"koChar\" (\"CharId\" INTEGER PRIMARY KEY NOT NULL ,\"Character\" TEXT,\"CharPath\" TEXT);");
        database.k("CREATE TABLE IF NOT EXISTS \"koCharPart\" (\"PartId\" INTEGER PRIMARY KEY NOT NULL ,\"CharId\" INTEGER NOT NULL ,\"PartIndex\" INTEGER NOT NULL ,\"PartPath\" TEXT,\"PartDirection\" TEXT);");
        database.k("CREATE TABLE IF NOT EXISTS \"charZhunyin\" (\"ID\" INTEGER PRIMARY KEY NOT NULL ,\"Character\" TEXT,\"Zhuyin\" TEXT);");
        KOCharDao kOCharDao = daoSessionM210newSession.getKOCharDao();
        m.e(kOCharDao, "getKOCharDao(...)");
        this.f55179b = kOCharDao;
        KOCharPartDao kOCharPartDao = daoSessionM210newSession.getKOCharPartDao();
        m.e(kOCharPartDao, "getKOCharPartDao(...)");
        this.f55180c = kOCharPartDao;
        KOCharZhuyinDao kOCharZhuyinDao = daoSessionM210newSession.getKOCharZhuyinDao();
        m.e(kOCharZhuyinDao, "getKOCharZhuyinDao(...)");
        this.f55181d = kOCharZhuyinDao;
    }

    public static String a(String character) {
        m.f(character, "character");
        g gVarQueryBuilder = p.V().f55181d.queryBuilder();
        gVarQueryBuilder.f(KOCharZhuyinDao.Properties.Character.b(character), new k10.h[0]);
        gVarQueryBuilder.f37855f = 1;
        List listD = gVarQueryBuilder.d();
        if (listD.size() != 0) {
            return ((KOCharZhuyin) listD.get(0)).getZhuyin();
        }
        return null;
    }
}
