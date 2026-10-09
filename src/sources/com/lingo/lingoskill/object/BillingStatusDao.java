package com.lingo.lingoskill.object;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import androidx.lifecycle.livedata.HeRS.DytezVyM;
import com.tbruyelle.rxpermissions3.BuildConfig;
import org.greenrobot.greendao.d;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class BillingStatusDao extends org.greenrobot.greendao.a {
    public static final String TABLENAME = "BillingStatus";
    private final kj.a expired_date_msConverter;
    private final kj.a expired_date_strConverter;
    private final kj.a from_typeConverter;
    private final kj.a grant_typeConverter;
    private final kj.a orderidConverter;
    private final kj.a purchase_date_msConverter;
    private final kj.a purchase_date_strConverter;
    private final kj.a transactionidConverter;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Properties {
        public static final d LanguageName = new d(0, String.class, DytezVyM.zNZswoEGTT, true, "languageName");
        public static final d Orderid = new d(1, String.class, "orderid", false, "orderid");
        public static final d Transactionid = new d(2, String.class, "transactionid", false, "transactionid");
        public static final d Productid = new d(3, String.class, "productid", false, "productid");
        public static final d Purchase_date_ms = new d(4, String.class, "purchase_date_ms", false, "purchase_date_ms");
        public static final d Expired_date_ms = new d(5, String.class, "expired_date_ms", false, "expired_date_ms");
        public static final d Purchase_date_str = new d(6, String.class, "purchase_date_str", false, "purchase_date_str");
        public static final d Expired_date_str = new d(7, String.class, "expired_date_str", false, "expired_date_str");
        public static final d From_type = new d(8, String.class, "from_type", false, "from_type");
        public static final d Grant_type = new d(9, String.class, "grant_type", false, "grant_type");
    }

    public BillingStatusDao(j10.a aVar, DaoSession daoSession) {
        super(aVar, daoSession);
        this.orderidConverter = new kj.a();
        this.transactionidConverter = new kj.a();
        this.purchase_date_msConverter = new kj.a();
        this.expired_date_msConverter = new kj.a();
        this.purchase_date_strConverter = new kj.a();
        this.expired_date_strConverter = new kj.a();
        this.from_typeConverter = new kj.a();
        this.grant_typeConverter = new kj.a();
    }

    public static void createTable(org.greenrobot.greendao.database.a aVar, boolean z11) {
        com.google.android.material.datepicker.d.v("CREATE TABLE ", z11 ? "IF NOT EXISTS " : BuildConfig.VERSION_NAME, "\"BillingStatus\" (\"languageName\" TEXT PRIMARY KEY NOT NULL ,\"orderid\" TEXT,\"transactionid\" TEXT,\"productid\" TEXT,\"purchase_date_ms\" TEXT,\"expired_date_ms\" TEXT,\"purchase_date_str\" TEXT,\"expired_date_str\" TEXT,\"from_type\" TEXT,\"grant_type\" TEXT);", aVar);
    }

    public static void dropTable(org.greenrobot.greendao.database.a aVar, boolean z11) {
        com.google.android.material.datepicker.d.x(new StringBuilder("DROP TABLE "), z11 ? "IF EXISTS " : BuildConfig.VERSION_NAME, "\"BillingStatus\"", aVar);
    }

    @Override // org.greenrobot.greendao.a
    public final boolean isEntityUpdateable() {
        return true;
    }

    @Override // org.greenrobot.greendao.a
    public String getKey(BillingStatus billingStatus) {
        if (billingStatus != null) {
            return billingStatus.getLanguageName();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.a
    public boolean hasKey(BillingStatus billingStatus) {
        return billingStatus.getLanguageName() != null;
    }

    @Override // org.greenrobot.greendao.a
    public String readKey(Cursor cursor, int i11) {
        if (cursor.isNull(i11)) {
            return null;
        }
        return cursor.getString(i11);
    }

    @Override // org.greenrobot.greendao.a
    public final String updateKeyAfterInsert(BillingStatus billingStatus, long j11) {
        return billingStatus.getLanguageName();
    }

    @Override // org.greenrobot.greendao.a
    public final void bindValues(org.greenrobot.greendao.database.d dVar, BillingStatus billingStatus) {
        dVar.f();
        String languageName = billingStatus.getLanguageName();
        if (languageName != null) {
            dVar.l(1, languageName);
        }
        String orderid = billingStatus.getOrderid();
        if (orderid != null) {
            com.google.android.material.datepicker.d.A(this.orderidConverter, orderid, dVar, 2);
        }
        String transactionid = billingStatus.getTransactionid();
        if (transactionid != null) {
            com.google.android.material.datepicker.d.A(this.transactionidConverter, transactionid, dVar, 3);
        }
        String productid = billingStatus.getProductid();
        if (productid != null) {
            dVar.l(4, productid);
        }
        String purchase_date_ms = billingStatus.getPurchase_date_ms();
        if (purchase_date_ms != null) {
            com.google.android.material.datepicker.d.A(this.purchase_date_msConverter, purchase_date_ms, dVar, 5);
        }
        String expired_date_ms = billingStatus.getExpired_date_ms();
        if (expired_date_ms != null) {
            com.google.android.material.datepicker.d.A(this.expired_date_msConverter, expired_date_ms, dVar, 6);
        }
        String purchase_date_str = billingStatus.getPurchase_date_str();
        if (purchase_date_str != null) {
            com.google.android.material.datepicker.d.A(this.purchase_date_strConverter, purchase_date_str, dVar, 7);
        }
        String expired_date_str = billingStatus.getExpired_date_str();
        if (expired_date_str != null) {
            com.google.android.material.datepicker.d.A(this.expired_date_strConverter, expired_date_str, dVar, 8);
        }
        String from_type = billingStatus.getFrom_type();
        if (from_type != null) {
            com.google.android.material.datepicker.d.A(this.from_typeConverter, from_type, dVar, 9);
        }
        String grant_type = billingStatus.getGrant_type();
        if (grant_type != null) {
            com.google.android.material.datepicker.d.A(this.grant_typeConverter, grant_type, dVar, 10);
        }
    }

    @Override // org.greenrobot.greendao.a
    public BillingStatus readEntity(Cursor cursor, int i11) {
        String string = cursor.isNull(i11) ? null : cursor.getString(i11);
        int i12 = i11 + 1;
        int i13 = i11 + 2;
        int i14 = i11 + 3;
        int i15 = i11 + 4;
        int i16 = i11 + 5;
        int i17 = i11 + 6;
        int i18 = i11 + 7;
        int i19 = i11 + 8;
        int i21 = i11 + 9;
        return new BillingStatus(string, cursor.isNull(i12) ? null : com.google.android.material.datepicker.d.j(cursor, i12, this.orderidConverter), cursor.isNull(i13) ? null : com.google.android.material.datepicker.d.j(cursor, i13, this.transactionidConverter), cursor.isNull(i14) ? null : cursor.getString(i14), cursor.isNull(i15) ? null : com.google.android.material.datepicker.d.j(cursor, i15, this.purchase_date_msConverter), cursor.isNull(i16) ? null : com.google.android.material.datepicker.d.j(cursor, i16, this.expired_date_msConverter), cursor.isNull(i17) ? null : com.google.android.material.datepicker.d.j(cursor, i17, this.purchase_date_strConverter), cursor.isNull(i18) ? null : com.google.android.material.datepicker.d.j(cursor, i18, this.expired_date_strConverter), cursor.isNull(i19) ? null : com.google.android.material.datepicker.d.j(cursor, i19, this.from_typeConverter), cursor.isNull(i21) ? null : com.google.android.material.datepicker.d.j(cursor, i21, this.grant_typeConverter));
    }

    public BillingStatusDao(j10.a aVar) {
        super(aVar, null);
        this.orderidConverter = new kj.a();
        this.transactionidConverter = new kj.a();
        this.purchase_date_msConverter = new kj.a();
        this.expired_date_msConverter = new kj.a();
        this.purchase_date_strConverter = new kj.a();
        this.expired_date_strConverter = new kj.a();
        this.from_typeConverter = new kj.a();
        this.grant_typeConverter = new kj.a();
    }

    @Override // org.greenrobot.greendao.a
    public void readEntity(Cursor cursor, BillingStatus billingStatus, int i11) {
        billingStatus.setLanguageName(cursor.isNull(i11) ? null : cursor.getString(i11));
        int i12 = i11 + 1;
        billingStatus.setOrderid(cursor.isNull(i12) ? null : com.google.android.material.datepicker.d.j(cursor, i12, this.orderidConverter));
        int i13 = i11 + 2;
        billingStatus.setTransactionid(cursor.isNull(i13) ? null : com.google.android.material.datepicker.d.j(cursor, i13, this.transactionidConverter));
        int i14 = i11 + 3;
        billingStatus.setProductid(cursor.isNull(i14) ? null : cursor.getString(i14));
        int i15 = i11 + 4;
        billingStatus.setPurchase_date_ms(cursor.isNull(i15) ? null : com.google.android.material.datepicker.d.j(cursor, i15, this.purchase_date_msConverter));
        int i16 = i11 + 5;
        billingStatus.setExpired_date_ms(cursor.isNull(i16) ? null : com.google.android.material.datepicker.d.j(cursor, i16, this.expired_date_msConverter));
        int i17 = i11 + 6;
        billingStatus.setPurchase_date_str(cursor.isNull(i17) ? null : com.google.android.material.datepicker.d.j(cursor, i17, this.purchase_date_strConverter));
        int i18 = i11 + 7;
        billingStatus.setExpired_date_str(cursor.isNull(i18) ? null : com.google.android.material.datepicker.d.j(cursor, i18, this.expired_date_strConverter));
        int i19 = i11 + 8;
        billingStatus.setFrom_type(cursor.isNull(i19) ? null : com.google.android.material.datepicker.d.j(cursor, i19, this.from_typeConverter));
        int i21 = i11 + 9;
        billingStatus.setGrant_type(cursor.isNull(i21) ? null : com.google.android.material.datepicker.d.j(cursor, i21, this.grant_typeConverter));
    }

    @Override // org.greenrobot.greendao.a
    public final void bindValues(SQLiteStatement sQLiteStatement, BillingStatus billingStatus) {
        sQLiteStatement.clearBindings();
        String languageName = billingStatus.getLanguageName();
        if (languageName != null) {
            sQLiteStatement.bindString(1, languageName);
        }
        String orderid = billingStatus.getOrderid();
        if (orderid != null) {
            com.google.android.material.datepicker.d.z(this.orderidConverter, orderid, sQLiteStatement, 2);
        }
        String transactionid = billingStatus.getTransactionid();
        if (transactionid != null) {
            com.google.android.material.datepicker.d.z(this.transactionidConverter, transactionid, sQLiteStatement, 3);
        }
        String productid = billingStatus.getProductid();
        if (productid != null) {
            sQLiteStatement.bindString(4, productid);
        }
        String purchase_date_ms = billingStatus.getPurchase_date_ms();
        if (purchase_date_ms != null) {
            com.google.android.material.datepicker.d.z(this.purchase_date_msConverter, purchase_date_ms, sQLiteStatement, 5);
        }
        String expired_date_ms = billingStatus.getExpired_date_ms();
        if (expired_date_ms != null) {
            com.google.android.material.datepicker.d.z(this.expired_date_msConverter, expired_date_ms, sQLiteStatement, 6);
        }
        String purchase_date_str = billingStatus.getPurchase_date_str();
        if (purchase_date_str != null) {
            com.google.android.material.datepicker.d.z(this.purchase_date_strConverter, purchase_date_str, sQLiteStatement, 7);
        }
        String expired_date_str = billingStatus.getExpired_date_str();
        if (expired_date_str != null) {
            com.google.android.material.datepicker.d.z(this.expired_date_strConverter, expired_date_str, sQLiteStatement, 8);
        }
        String from_type = billingStatus.getFrom_type();
        if (from_type != null) {
            com.google.android.material.datepicker.d.z(this.from_typeConverter, from_type, sQLiteStatement, 9);
        }
        String grant_type = billingStatus.getGrant_type();
        if (grant_type != null) {
            com.google.android.material.datepicker.d.z(this.grant_typeConverter, grant_type, sQLiteStatement, 10);
        }
    }
}
