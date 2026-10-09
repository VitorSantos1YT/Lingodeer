package com.lingo.lingoskill.object;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class MultiLanMapField {
    private String fieldName;
    private int lanSig;
    private String tableKeyName;
    private String tableName;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final List<MultiLanMapField> createItems() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new MultiLanMapField(1, WordDao.TABLENAME, "Translations", "WordId"));
            arrayList.add(new MultiLanMapField(2, WordDao.TABLENAME, "Explanation", "WordId"));
            arrayList.add(new MultiLanMapField(5, SentenceDao.TABLENAME, "Translations", "SentenceId"));
            arrayList.add(new MultiLanMapField(11, UnitDao.TABLENAME, "UnitName", "UnitId"));
            arrayList.add(new MultiLanMapField(30, UnitDao.TABLENAME, "Description", "UnitId"));
            arrayList.add(new MultiLanMapField(102, PhraseDao.TABLENAME, "Translations", "PhraseId"));
            return arrayList;
        }

        private Companion() {
        }
    }

    public MultiLanMapField(int i11, String tableName, String fieldName, String tableKeyName) {
        m.f(tableName, "tableName");
        m.f(fieldName, "fieldName");
        m.f(tableKeyName, "tableKeyName");
        this.lanSig = i11;
        this.tableName = tableName;
        this.fieldName = fieldName;
        this.tableKeyName = tableKeyName;
    }

    public final String getFieldName() {
        return this.fieldName;
    }

    public final int getLanSig() {
        return this.lanSig;
    }

    public final String getTableKeyName() {
        return this.tableKeyName;
    }

    public final String getTableName() {
        return this.tableName;
    }

    public final void setFieldName(String str) {
        m.f(str, "<set-?>");
        this.fieldName = str;
    }

    public final void setLanSig(int i11) {
        this.lanSig = i11;
    }

    public final void setTableKeyName(String str) {
        m.f(str, "<set-?>");
        this.tableKeyName = str;
    }

    public final void setTableName(String str) {
        m.f(str, "<set-?>");
        this.tableName = str;
    }
}
