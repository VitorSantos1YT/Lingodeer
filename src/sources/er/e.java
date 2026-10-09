package er;

import com.google.android.gms.internal.stats.RC.ualZoVVCQs;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'DAILY_LEARN' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class e {
    private static final /* synthetic */ yy.a $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e BILLING_5MIN;
    public static final d Companion;
    public static final e DAILY_LEARN;
    public static final e DISCOUNT_LAST_1H;
    public static final e SRS_REVIEW;
    private final int jobId;
    private final int requestCode;
    private final String source;
    private final String targetActivity;

    public e(String str, int i11, String str2, int i12, String str3, int i13) {
        super(str, i11);
        this.requestCode = i12;
        this.jobId = i13;
        this.source = str2;
        this.targetActivity = str3;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }

    public final int a() {
        return this.jobId;
    }

    public final int b() {
        return this.requestCode;
    }

    public final String c() {
        return this.source;
    }

    static {
        String str = "DAILY_LEARN";
        int i11 = 0;
        int i12 = 1000;
        e eVar = new e(str, i11, i12, "daily_learn", 10000);
        DAILY_LEARN = eVar;
        String str2 = ualZoVVCQs.SVqAZIppo;
        int i13 = 1;
        int i14 = 1001;
        e eVar2 = new e(str2, i13, i14, "srs_review", 10001);
        SRS_REVIEW = eVar2;
        e eVar3 = new e("DISCOUNT_LAST_1H", 2, "discount_last_1h", 1002, "com.lingo.lingoskill.ui.base.GuideNotification", 10002);
        DISCOUNT_LAST_1H = eVar3;
        e eVar4 = new e("BILLING_5MIN", 3, "billing_5min", 1005, "com.lingo.lingoskill.ui.base.GuideNotification", 10005);
        BILLING_5MIN = eVar4;
        e[] eVarArr = {eVar, eVar2, eVar3, eVar4};
        $VALUES = eVarArr;
        $ENTRIES = ub.a.U(eVarArr);
        Companion = new d();
    }

    public /* synthetic */ e(String str, int i11, int i12, String str2, int i13) {
        this(str, i11, str2, i12, "com.lingo.lingoskill.ui.base.SplashActivity", i13);
    }
}
