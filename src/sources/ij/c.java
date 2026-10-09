package ij;

import android.database.Cursor;
import cf.x;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.DaoSession;
import com.lingo.lingoskill.object.LessonDao;
import com.lingo.lingoskill.object.Level;
import com.lingo.lingoskill.object.Sentence;
import com.lingo.lingoskill.object.Unit;
import com.lingo.lingoskill.object.UnitDao;
import com.lingo.lingoskill.object.Word;
import com.lingo.lingoskill.object.WordDao;
import fa.EQx.nuRcCS;
import java.util.ArrayList;
import java.util.List;
import ns.o;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class c {
    public static List a() {
        if (d.f34419e == null) {
            synchronized (d.class) {
                if (d.f34419e == null) {
                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                    kotlin.jvm.internal.m.c(lingoSkillApplication);
                    d.f34419e = new d(lingoSkillApplication);
                }
            }
        }
        d dVar = d.f34419e;
        kotlin.jvm.internal.m.c(dVar);
        k10.g gVarQueryBuilder = dVar.p().queryBuilder();
        org.greenrobot.greendao.d dVar2 = LessonDao.Properties.LessonId;
        dVar2.getClass();
        gVarQueryBuilder.f(new k10.h(dVar2, "<?", (Object) 10000), new k10.h[0]);
        gVarQueryBuilder.e(" ASC", dVar2);
        List listD = gVarQueryBuilder.d();
        kotlin.jvm.internal.m.e(listD, "list(...)");
        return listD;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0027  */
    public static ArrayList b() {
        long j11;
        ArrayList arrayList = new ArrayList();
        try {
            LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
            int i11 = x.n().keyLanguage;
            if (i11 != 22 && i11 != 40 && i11 != 48 && i11 != 54 && i11 != 55) {
                switch (i11) {
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                        j11 = 2;
                        break;
                    default:
                        j11 = 1;
                        break;
                }
            } else {
                j11 = 2;
            }
            e00.i iVarA = kotlin.jvm.internal.l.a(ew.a.v(d(j11).getUnitList()));
            while (iVarA.hasNext()) {
                Long l9 = (Long) iVarA.next();
                kotlin.jvm.internal.m.c(l9);
                arrayList.add(g(l9.longValue()));
            }
            LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
            if (x.n().keyLanguage == 1) {
                Unit unit = (Unit) ry.m.z0(arrayList);
                arrayList.remove(o.A(arrayList));
                if (FirebaseRemoteConfig.d().b("jp_test_new_unit1") && ry.l.D(new Integer[]{3, 9}, Integer.valueOf(x.n().locateLanguage)) && x.n().keyLanguage == 1) {
                    Unit unit2 = (Unit) ry.m.q0(arrayList);
                    unit2.setUnitId(unit.getUnitId());
                    unit2.setLessonList(unit.getLessonList());
                }
            }
            return arrayList;
        } catch (Exception e8) {
            e8.printStackTrace();
            return arrayList;
        }
    }

    public static List c(long j11) {
        if (d.f34419e == null) {
            synchronized (d.class) {
                if (d.f34419e == null) {
                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                    kotlin.jvm.internal.m.c(lingoSkillApplication);
                    d.f34419e = new d(lingoSkillApplication);
                }
            }
        }
        d dVar = d.f34419e;
        kotlin.jvm.internal.m.c(dVar);
        k10.g gVarQueryBuilder = dVar.p().queryBuilder();
        gVarQueryBuilder.f(LessonDao.Properties.UnitId.b(Long.valueOf(j11)), new k10.h[0]);
        List listD = gVarQueryBuilder.d();
        kotlin.jvm.internal.m.e(listD, "list(...)");
        return listD;
    }

    public static Level d(long j11) {
        if (d.f34419e == null) {
            synchronized (d.class) {
                if (d.f34419e == null) {
                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                    kotlin.jvm.internal.m.c(lingoSkillApplication);
                    d.f34419e = new d(lingoSkillApplication);
                }
            }
        }
        d dVar = d.f34419e;
        kotlin.jvm.internal.m.c(dVar);
        Object objLoad = dVar.q().load(Long.valueOf(j11));
        kotlin.jvm.internal.m.e(objLoad, "load(...)");
        return (Level) objLoad;
    }

    public static Sentence e(long j11) {
        try {
            if (d.f34419e == null) {
                synchronized (d.class) {
                    if (d.f34419e == null) {
                        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                        kotlin.jvm.internal.m.c(lingoSkillApplication);
                        d.f34419e = new d(lingoSkillApplication);
                    }
                }
            }
            d dVar = d.f34419e;
            kotlin.jvm.internal.m.c(dVar);
            Sentence sentence = (Sentence) dVar.u().load(Long.valueOf(j11));
            sentence.setSentence(sentence.getSentence());
            Long[] lArrV = ew.a.v(sentence.getWordList());
            ArrayList arrayList = new ArrayList();
            e00.i iVarA = kotlin.jvm.internal.l.a(lArrV);
            while (iVarA.hasNext()) {
                Long l9 = (Long) iVarA.next();
                kotlin.jvm.internal.m.c(l9);
                Word wordH = h(l9.longValue());
                if (wordH != null) {
                    arrayList.add(wordH);
                }
            }
            sentence.setSentWords(arrayList);
            LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
            if (x.n().keyLanguage != 11 && x.n().keyLanguage != 0) {
                return sentence;
            }
            if (x.n().isSChinese) {
                sentence.setSentence(sentence.getSentence());
                return sentence;
            }
            sentence.setSentence(sentence.TSentence);
            return sentence;
        } catch (Exception e8) {
            e8.printStackTrace();
            return null;
        }
    }

    public static Unit g(long j11) {
        Unit unit = new Unit();
        if (d.f34419e == null) {
            synchronized (d.class) {
                if (d.f34419e == null) {
                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                    kotlin.jvm.internal.m.c(lingoSkillApplication);
                    d.f34419e = new d(lingoSkillApplication);
                }
            }
        }
        d dVar = d.f34419e;
        kotlin.jvm.internal.m.c(dVar);
        UnitDao unitDao = ((DaoSession) dVar.f34423d).getUnitDao();
        kotlin.jvm.internal.m.e(unitDao, "getUnitDao(...)");
        k10.g gVarQueryBuilder = unitDao.queryBuilder();
        gVarQueryBuilder.f(UnitDao.Properties.UnitId.b(Long.valueOf(j11)), new k10.h[0]);
        Cursor cursorC = gVarQueryBuilder.b().c();
        try {
            Cursor cursor = cursorC;
            while (cursor.moveToNext()) {
                unit.setUnitId(cursor.getLong(0));
                try {
                    unit.setUnitName(com.bumptech.glide.d.m(cursor.getString(1)));
                    unit.setLessonList(com.bumptech.glide.d.m(cursor.getString(3)));
                    unit.setSortIndex(cursor.getInt(4));
                    unit.setLevelId(cursor.getInt(5));
                    unit.setIconResSuffix(com.bumptech.glide.d.m(cursor.getString(6)));
                } catch (Exception e8) {
                    e8.printStackTrace();
                }
            }
            o.m(cursorC, null);
            return unit;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                o.m(cursorC, th2);
                throw th3;
            }
        }
    }

    public static Word h(long j11) {
        try {
            if (d.f34419e == null) {
                synchronized (d.class) {
                    if (d.f34419e == null) {
                        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                        kotlin.jvm.internal.m.c(lingoSkillApplication);
                        d.f34419e = new d(lingoSkillApplication);
                    }
                }
            }
            d dVar = d.f34419e;
            kotlin.jvm.internal.m.c(dVar);
            WordDao wordDao = ((DaoSession) dVar.f34423d).getWordDao();
            kotlin.jvm.internal.m.e(wordDao, "getWordDao(...)");
            k10.g gVarQueryBuilder = wordDao.queryBuilder();
            gVarQueryBuilder.f(WordDao.Properties.WordId.b(Long.valueOf(j11)), new k10.h[0]);
            gVarQueryBuilder.f37855f = 1;
            Word word = (Word) gVarQueryBuilder.d().get(0);
            LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
            if (x.n().keyLanguage != 11 && x.n().keyLanguage != 0) {
                return word;
            }
            if (x.n().isSChinese) {
                word.setWord(word.getWord());
                return word;
            }
            word.setWord(word.TWord);
            return word;
        } catch (Exception unused) {
            return null;
        }
    }

    public static Unit f(long j11, boolean z11) {
        Unit unitG;
        if (z11) {
            if (d.f34419e == null) {
                synchronized (d.class) {
                    if (d.f34419e == null) {
                        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                        kotlin.jvm.internal.m.c(lingoSkillApplication);
                        d.f34419e = new d(lingoSkillApplication);
                    }
                }
            }
            d dVar = d.f34419e;
            kotlin.jvm.internal.m.c(dVar);
            UnitDao unitDao = ((DaoSession) dVar.f34423d).getUnitDao();
            kotlin.jvm.internal.m.e(unitDao, "getUnitDao(...)");
            unitG = (Unit) unitDao.load(Long.valueOf(j11));
        } else {
            unitG = g(j11);
        }
        if (FirebaseRemoteConfig.d().b(nuRcCS.KpaBIezkwcbrvDs)) {
            LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
            if (ry.l.D(new Integer[]{3, 9}, Integer.valueOf(x.n().locateLanguage)) && x.n().keyLanguage == 1 && j11 == 150 && unitG != null) {
                unitG.setSortIndex(1);
                unitG.setIconResSuffix("uicon_14;ubg_14");
            }
        }
        return unitG;
    }
}
