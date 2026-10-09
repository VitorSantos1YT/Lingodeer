package com.lingo.lingoskill.object;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.lingo.lingoskill.ruskill.ui.learn.mr.OCBJEWZHh;
import org.greenrobot.greendao.d;
import su.Mbl.tcppUUQxZjFdy;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class ScSubCateDao extends org.greenrobot.greendao.a {
    public static final String TABLENAME = "subcategory";
    private final kj.a eng_nameConverter;
    private final kj.a esp_nameConverter;
    private final kj.a id_nameConverter;
    private final kj.a jpn_nameConverter;
    private final kj.a krn_nameConverter;
    private final kj.a pt_nameConverter;
    private final kj.a ru_nameConverter;
    private final kj.a th_nameConverter;
    private final kj.a vi_nameConverter;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Properties {
        public static final d Cid;
        public static final d Eng_name;
        public static final d Esp_name;
        public static final d Id;
        public static final d Id_name;
        public static final d Jpn_name;
        public static final d Krn_name;
        public static final d Pt_name;
        public static final d Ru_name;
        public static final d Th_name;
        public static final d Vi_name;

        static {
            Class cls = Long.TYPE;
            Id = new d(0, cls, "id", true, "id");
            Cid = new d(1, cls, "cid", false, "cid");
            Eng_name = new d(2, String.class, "eng_name", false, "eng_name");
            Krn_name = new d(3, String.class, "krn_name", false, "krn_name");
            Jpn_name = new d(4, String.class, "jpn_name", false, OCBJEWZHh.InCjxCycs);
            Esp_name = new d(5, String.class, tcppUUQxZjFdy.oUEiyicRHfp, false, "esp_name");
            Vi_name = new d(6, String.class, "vi_name", false, "vi_name");
            Ru_name = new d(7, String.class, "ru_name", false, "ru_name");
            Id_name = new d(8, String.class, "id_name", false, "id_name");
            Th_name = new d(9, String.class, "th_name", false, "th_name");
            Pt_name = new d(10, String.class, "pt_name", false, "pt_name");
        }
    }

    public ScSubCateDao(j10.a aVar, DaoSession daoSession) {
        super(aVar, daoSession);
        this.eng_nameConverter = new kj.a();
        this.krn_nameConverter = new kj.a();
        this.jpn_nameConverter = new kj.a();
        this.esp_nameConverter = new kj.a();
        this.vi_nameConverter = new kj.a();
        this.ru_nameConverter = new kj.a();
        this.id_nameConverter = new kj.a();
        this.th_nameConverter = new kj.a();
        this.pt_nameConverter = new kj.a();
    }

    @Override // org.greenrobot.greendao.a
    public final boolean isEntityUpdateable() {
        return true;
    }

    @Override // org.greenrobot.greendao.a
    public Long getKey(ScSubCate scSubCate) {
        if (scSubCate != null) {
            return Long.valueOf(scSubCate.getId());
        }
        return null;
    }

    @Override // org.greenrobot.greendao.a
    public boolean hasKey(ScSubCate scSubCate) {
        throw new UnsupportedOperationException("Unsupported for entities with a non-null key");
    }

    @Override // org.greenrobot.greendao.a
    public Long readKey(Cursor cursor, int i11) {
        return Long.valueOf(cursor.getLong(i11));
    }

    @Override // org.greenrobot.greendao.a
    public final Long updateKeyAfterInsert(ScSubCate scSubCate, long j11) {
        scSubCate.setId(j11);
        return Long.valueOf(j11);
    }

    @Override // org.greenrobot.greendao.a
    public final void bindValues(org.greenrobot.greendao.database.d dVar, ScSubCate scSubCate) {
        dVar.f();
        dVar.g(1, scSubCate.getId());
        dVar.g(2, scSubCate.getCid());
        String eng_name = scSubCate.getEng_name();
        if (eng_name != null) {
            com.google.android.material.datepicker.d.A(this.eng_nameConverter, eng_name, dVar, 3);
        }
        String krn_name = scSubCate.getKrn_name();
        if (krn_name != null) {
            com.google.android.material.datepicker.d.A(this.krn_nameConverter, krn_name, dVar, 4);
        }
        String jpn_name = scSubCate.getJpn_name();
        if (jpn_name != null) {
            com.google.android.material.datepicker.d.A(this.jpn_nameConverter, jpn_name, dVar, 5);
        }
        String esp_name = scSubCate.getEsp_name();
        if (esp_name != null) {
            com.google.android.material.datepicker.d.A(this.esp_nameConverter, esp_name, dVar, 6);
        }
        String vi_name = scSubCate.getVi_name();
        if (vi_name != null) {
            com.google.android.material.datepicker.d.A(this.vi_nameConverter, vi_name, dVar, 7);
        }
        String ru_name = scSubCate.getRu_name();
        if (ru_name != null) {
            com.google.android.material.datepicker.d.A(this.ru_nameConverter, ru_name, dVar, 8);
        }
        String id_name = scSubCate.getId_name();
        if (id_name != null) {
            com.google.android.material.datepicker.d.A(this.id_nameConverter, id_name, dVar, 9);
        }
        String th_name = scSubCate.getTh_name();
        if (th_name != null) {
            com.google.android.material.datepicker.d.A(this.th_nameConverter, th_name, dVar, 10);
        }
        String pt_name = scSubCate.getPt_name();
        if (pt_name != null) {
            com.google.android.material.datepicker.d.A(this.pt_nameConverter, pt_name, dVar, 11);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v0 ??, still in use, count: 1, list:
          (r2v0 ?? I:??[OBJECT, ARRAY]) from 0x00c0: RETURN (r2v0 ?? I:??[OBJECT, ARRAY])
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    @Override // org.greenrobot.greendao.a
    public com.lingo.lingoskill.object.ScSubCate readEntity(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v0 ??, still in use, count: 1, list:
          (r2v0 ?? I:??[OBJECT, ARRAY]) from 0x00c0: RETURN (r2v0 ?? I:??[OBJECT, ARRAY])
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r19v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */

    public ScSubCateDao(j10.a aVar) {
        super(aVar, null);
        this.eng_nameConverter = new kj.a();
        this.krn_nameConverter = new kj.a();
        this.jpn_nameConverter = new kj.a();
        this.esp_nameConverter = new kj.a();
        this.vi_nameConverter = new kj.a();
        this.ru_nameConverter = new kj.a();
        this.id_nameConverter = new kj.a();
        this.th_nameConverter = new kj.a();
        this.pt_nameConverter = new kj.a();
    }

    @Override // org.greenrobot.greendao.a
    public void readEntity(Cursor cursor, ScSubCate scSubCate, int i11) {
        scSubCate.setId(cursor.getLong(i11));
        scSubCate.setCid(cursor.getLong(i11 + 1));
        int i12 = i11 + 2;
        scSubCate.setEng_name(cursor.isNull(i12) ? null : com.google.android.material.datepicker.d.j(cursor, i12, this.eng_nameConverter));
        int i13 = i11 + 3;
        scSubCate.setKrn_name(cursor.isNull(i13) ? null : com.google.android.material.datepicker.d.j(cursor, i13, this.krn_nameConverter));
        int i14 = i11 + 4;
        scSubCate.setJpn_name(cursor.isNull(i14) ? null : com.google.android.material.datepicker.d.j(cursor, i14, this.jpn_nameConverter));
        int i15 = i11 + 5;
        scSubCate.setEsp_name(cursor.isNull(i15) ? null : com.google.android.material.datepicker.d.j(cursor, i15, this.esp_nameConverter));
        int i16 = i11 + 6;
        scSubCate.setVi_name(cursor.isNull(i16) ? null : com.google.android.material.datepicker.d.j(cursor, i16, this.vi_nameConverter));
        int i17 = i11 + 7;
        scSubCate.setRu_name(cursor.isNull(i17) ? null : com.google.android.material.datepicker.d.j(cursor, i17, this.ru_nameConverter));
        int i18 = i11 + 8;
        scSubCate.setId_name(cursor.isNull(i18) ? null : com.google.android.material.datepicker.d.j(cursor, i18, this.id_nameConverter));
        int i19 = i11 + 9;
        scSubCate.setTh_name(cursor.isNull(i19) ? null : com.google.android.material.datepicker.d.j(cursor, i19, this.th_nameConverter));
        int i21 = i11 + 10;
        scSubCate.setPt_name(cursor.isNull(i21) ? null : com.google.android.material.datepicker.d.j(cursor, i21, this.pt_nameConverter));
    }

    @Override // org.greenrobot.greendao.a
    public final void bindValues(SQLiteStatement sQLiteStatement, ScSubCate scSubCate) {
        sQLiteStatement.clearBindings();
        sQLiteStatement.bindLong(1, scSubCate.getId());
        sQLiteStatement.bindLong(2, scSubCate.getCid());
        String eng_name = scSubCate.getEng_name();
        if (eng_name != null) {
            com.google.android.material.datepicker.d.z(this.eng_nameConverter, eng_name, sQLiteStatement, 3);
        }
        String krn_name = scSubCate.getKrn_name();
        if (krn_name != null) {
            com.google.android.material.datepicker.d.z(this.krn_nameConverter, krn_name, sQLiteStatement, 4);
        }
        String jpn_name = scSubCate.getJpn_name();
        if (jpn_name != null) {
            com.google.android.material.datepicker.d.z(this.jpn_nameConverter, jpn_name, sQLiteStatement, 5);
        }
        String esp_name = scSubCate.getEsp_name();
        if (esp_name != null) {
            com.google.android.material.datepicker.d.z(this.esp_nameConverter, esp_name, sQLiteStatement, 6);
        }
        String vi_name = scSubCate.getVi_name();
        if (vi_name != null) {
            com.google.android.material.datepicker.d.z(this.vi_nameConverter, vi_name, sQLiteStatement, 7);
        }
        String ru_name = scSubCate.getRu_name();
        if (ru_name != null) {
            com.google.android.material.datepicker.d.z(this.ru_nameConverter, ru_name, sQLiteStatement, 8);
        }
        String id_name = scSubCate.getId_name();
        if (id_name != null) {
            com.google.android.material.datepicker.d.z(this.id_nameConverter, id_name, sQLiteStatement, 9);
        }
        String th_name = scSubCate.getTh_name();
        if (th_name != null) {
            com.google.android.material.datepicker.d.z(this.th_nameConverter, th_name, sQLiteStatement, 10);
        }
        String pt_name = scSubCate.getPt_name();
        if (pt_name != null) {
            com.google.android.material.datepicker.d.z(this.pt_nameConverter, pt_name, sQLiteStatement, 11);
        }
    }
}
