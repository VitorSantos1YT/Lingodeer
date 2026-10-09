package com.lingo.lingoskill.object;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.tbruyelle.rxpermissions3.BuildConfig;
import org.greenrobot.greendao.d;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class LanguageTransVersionDao extends org.greenrobot.greendao.a {
    public static final String TABLENAME = "languageTransVersion";

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Properties {
        public static final d Cn;
        public static final d De;
        public static final d En;
        public static final d Es;
        public static final d Fr;
        public static final d Id = new d(0, String.class, "id", true, "id");
        public static final d Idn;
        public static final d It;
        public static final d Jp;
        public static final d Kr;
        public static final d Pol;
        public static final d Pt;
        public static final d Ru;
        public static final d Tch;
        public static final d Tur;
        public static final d Vi;

        static {
            Class cls = Integer.TYPE;
            Cn = new d(1, cls, "cn", false, "cn");
            Jp = new d(2, cls, "jp", false, "jp");
            Kr = new d(3, cls, "kr", false, "kr");
            En = new d(4, cls, "en", false, "en");
            Es = new d(5, cls, "es", false, "es");
            De = new d(6, cls, "de", false, "de");
            Fr = new d(7, cls, "fr", false, "fr");
            Pt = new d(8, cls, "pt", false, "pt");
            Vi = new d(9, cls, "vi", false, "vi");
            Ru = new d(10, cls, "ru", false, "ru");
            Tch = new d(11, cls, "tch", false, "tch");
            Idn = new d(12, Integer.class, "idn", false, "idn");
            Pol = new d(13, Integer.class, "pol", false, "pol");
            It = new d(14, Integer.class, "it", false, "it");
            Tur = new d(15, Integer.class, "tur", false, "tur");
        }
    }

    public LanguageTransVersionDao(j10.a aVar, DaoSession daoSession) {
        super(aVar, daoSession);
    }

    public static void createTable(org.greenrobot.greendao.database.a aVar, boolean z11) {
        com.google.android.material.datepicker.d.v("CREATE TABLE ", z11 ? "IF NOT EXISTS " : BuildConfig.VERSION_NAME, "\"languageTransVersion\" (\"id\" TEXT PRIMARY KEY NOT NULL UNIQUE ,\"cn\" INTEGER NOT NULL ,\"jp\" INTEGER NOT NULL ,\"kr\" INTEGER NOT NULL ,\"en\" INTEGER NOT NULL ,\"es\" INTEGER NOT NULL ,\"de\" INTEGER NOT NULL ,\"fr\" INTEGER NOT NULL ,\"pt\" INTEGER NOT NULL ,\"vi\" INTEGER NOT NULL ,\"ru\" INTEGER NOT NULL ,\"tch\" INTEGER NOT NULL ,\"idn\" INTEGER,\"pol\" INTEGER,\"it\" INTEGER,\"tur\" INTEGER);", aVar);
    }

    public static void dropTable(org.greenrobot.greendao.database.a aVar, boolean z11) {
        com.google.android.material.datepicker.d.x(new StringBuilder("DROP TABLE "), z11 ? "IF EXISTS " : BuildConfig.VERSION_NAME, "\"languageTransVersion\"", aVar);
    }

    @Override // org.greenrobot.greendao.a
    public final boolean isEntityUpdateable() {
        return true;
    }

    public LanguageTransVersionDao(j10.a aVar) {
        super(aVar, null);
    }

    @Override // org.greenrobot.greendao.a
    public String getKey(LanguageTransVersion languageTransVersion) {
        if (languageTransVersion != null) {
            return languageTransVersion.getId();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.a
    public boolean hasKey(LanguageTransVersion languageTransVersion) {
        return languageTransVersion.getId() != null;
    }

    @Override // org.greenrobot.greendao.a
    public String readKey(Cursor cursor, int i11) {
        if (cursor.isNull(i11)) {
            return null;
        }
        return cursor.getString(i11);
    }

    @Override // org.greenrobot.greendao.a
    public final String updateKeyAfterInsert(LanguageTransVersion languageTransVersion, long j11) {
        return languageTransVersion.getId();
    }

    @Override // org.greenrobot.greendao.a
    public final void bindValues(org.greenrobot.greendao.database.d dVar, LanguageTransVersion languageTransVersion) {
        dVar.f();
        String id2 = languageTransVersion.getId();
        if (id2 != null) {
            dVar.l(1, id2);
        }
        dVar.g(2, languageTransVersion.getCn());
        dVar.g(3, languageTransVersion.getJp());
        dVar.g(4, languageTransVersion.getKr());
        dVar.g(5, languageTransVersion.getEn());
        dVar.g(6, languageTransVersion.getEs());
        dVar.g(7, languageTransVersion.getDe());
        dVar.g(8, languageTransVersion.getFr());
        dVar.g(9, languageTransVersion.getPt());
        dVar.g(10, languageTransVersion.getVi());
        dVar.g(11, languageTransVersion.getRu());
        dVar.g(12, languageTransVersion.getTch());
        Integer idn = languageTransVersion.getIdn();
        if (idn != null) {
            dVar.g(13, idn.intValue());
        }
        Integer pol = languageTransVersion.getPol();
        if (pol != null) {
            dVar.g(14, pol.intValue());
        }
        Integer it = languageTransVersion.getIt();
        if (it != null) {
            dVar.g(15, it.intValue());
        }
        Integer tur = languageTransVersion.getTur();
        if (tur != null) {
            dVar.g(16, tur.intValue());
        }
    }

    @Override // org.greenrobot.greendao.a
    public LanguageTransVersion readEntity(Cursor cursor, int i11) {
        String string = cursor.isNull(i11) ? null : cursor.getString(i11);
        int i12 = cursor.getInt(i11 + 1);
        int i13 = cursor.getInt(i11 + 2);
        int i14 = cursor.getInt(i11 + 3);
        int i15 = cursor.getInt(i11 + 4);
        int i16 = cursor.getInt(i11 + 5);
        int i17 = cursor.getInt(i11 + 6);
        int i18 = cursor.getInt(i11 + 7);
        int i19 = cursor.getInt(i11 + 8);
        int i21 = cursor.getInt(i11 + 9);
        int i22 = cursor.getInt(i11 + 10);
        int i23 = cursor.getInt(i11 + 11);
        int i24 = i11 + 12;
        Integer numValueOf = cursor.isNull(i24) ? null : Integer.valueOf(cursor.getInt(i24));
        int i25 = i11 + 13;
        Integer numValueOf2 = cursor.isNull(i25) ? null : Integer.valueOf(cursor.getInt(i25));
        int i26 = i11 + 14;
        Integer numValueOf3 = cursor.isNull(i26) ? null : Integer.valueOf(cursor.getInt(i26));
        int i27 = i11 + 15;
        return new LanguageTransVersion(string, i12, i13, i14, i15, i16, i17, i18, i19, i21, i22, i23, numValueOf, numValueOf2, numValueOf3, cursor.isNull(i27) ? null : Integer.valueOf(cursor.getInt(i27)));
    }

    @Override // org.greenrobot.greendao.a
    public void readEntity(Cursor cursor, LanguageTransVersion languageTransVersion, int i11) {
        languageTransVersion.setId(cursor.isNull(i11) ? null : cursor.getString(i11));
        languageTransVersion.setCn(cursor.getInt(i11 + 1));
        languageTransVersion.setJp(cursor.getInt(i11 + 2));
        languageTransVersion.setKr(cursor.getInt(i11 + 3));
        languageTransVersion.setEn(cursor.getInt(i11 + 4));
        languageTransVersion.setEs(cursor.getInt(i11 + 5));
        languageTransVersion.setDe(cursor.getInt(i11 + 6));
        languageTransVersion.setFr(cursor.getInt(i11 + 7));
        languageTransVersion.setPt(cursor.getInt(i11 + 8));
        languageTransVersion.setVi(cursor.getInt(i11 + 9));
        languageTransVersion.setRu(cursor.getInt(i11 + 10));
        languageTransVersion.setTch(cursor.getInt(i11 + 11));
        int i12 = i11 + 12;
        languageTransVersion.setIdn(cursor.isNull(i12) ? null : Integer.valueOf(cursor.getInt(i12)));
        int i13 = i11 + 13;
        languageTransVersion.setPol(cursor.isNull(i13) ? null : Integer.valueOf(cursor.getInt(i13)));
        int i14 = i11 + 14;
        languageTransVersion.setIt(cursor.isNull(i14) ? null : Integer.valueOf(cursor.getInt(i14)));
        int i15 = i11 + 15;
        languageTransVersion.setTur(cursor.isNull(i15) ? null : Integer.valueOf(cursor.getInt(i15)));
    }

    @Override // org.greenrobot.greendao.a
    public final void bindValues(SQLiteStatement sQLiteStatement, LanguageTransVersion languageTransVersion) {
        sQLiteStatement.clearBindings();
        String id2 = languageTransVersion.getId();
        if (id2 != null) {
            sQLiteStatement.bindString(1, id2);
        }
        sQLiteStatement.bindLong(2, languageTransVersion.getCn());
        sQLiteStatement.bindLong(3, languageTransVersion.getJp());
        sQLiteStatement.bindLong(4, languageTransVersion.getKr());
        sQLiteStatement.bindLong(5, languageTransVersion.getEn());
        sQLiteStatement.bindLong(6, languageTransVersion.getEs());
        sQLiteStatement.bindLong(7, languageTransVersion.getDe());
        sQLiteStatement.bindLong(8, languageTransVersion.getFr());
        sQLiteStatement.bindLong(9, languageTransVersion.getPt());
        sQLiteStatement.bindLong(10, languageTransVersion.getVi());
        sQLiteStatement.bindLong(11, languageTransVersion.getRu());
        sQLiteStatement.bindLong(12, languageTransVersion.getTch());
        Integer idn = languageTransVersion.getIdn();
        if (idn != null) {
            sQLiteStatement.bindLong(13, idn.intValue());
        }
        Integer pol = languageTransVersion.getPol();
        if (pol != null) {
            sQLiteStatement.bindLong(14, pol.intValue());
        }
        Integer it = languageTransVersion.getIt();
        if (it != null) {
            sQLiteStatement.bindLong(15, it.intValue());
        }
        Integer tur = languageTransVersion.getTur();
        if (tur != null) {
            sQLiteStatement.bindLong(16, tur.intValue());
        }
    }
}
