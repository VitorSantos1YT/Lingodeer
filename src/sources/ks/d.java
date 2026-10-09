package ks;

import com.google.zxing.pdf417.decoder.vBn.xTCJ;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 ks.d[], still in use, count: 1, list:
  (r0v1 ks.d[]) from 0x0273: INVOKE (r0v1 ks.d[]) STATIC call: ub.a.U(java.lang.Enum[]):yy.b A[MD:(java.lang.Enum[]):yy.b (m), WRAPPED] (LINE:629)
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class d {
    KR("kr", 2, "kr"),
    JP("jp", 1, "jp"),
    CN("cn", 0, "cn"),
    ES_US("esus", 47, "esus"),
    FR_US("frus", 53, "frus"),
    DE("deoc", 6, xTCJ.MbMU),
    EN("en", 3, "en"),
    ES("esoc", 4, "es"),
    FR("froc", 5, "fr"),
    PT("ptoc", 8, "pt"),
    RU("ruoc", 10, "ru"),
    IT("itoc", 20, "it"),
    AR("ara", 51, "ara"),
    VT("vt", 7, "vt"),
    THAI("thai", 57, "thai"),
    TUR("tur", 21, "tur"),
    HINDI("hindi", 61, "hindi"),
    GRK("grk", 65, "grk"),
    UKR("ukr", 63, "ukr"),
    IDN("idn", 18, "idn"),
    POL("pol", 19, "pol"),
    MAL("mal", 69, "mal"),
    KR_UP("krup", 13, "krup"),
    JP_UP("jpup", 12, "jpup"),
    CN_UP("cnup", 11, "cnup"),
    ES_US_UP("esusup", 48, "esusup"),
    FR_US_UP("frusup", 54, "frusup"),
    DE_UP("deocup", 16, "deup"),
    ES_UP("esocup", 14, "esup"),
    FR_UP("frocup", 15, "frup"),
    PT_UP("ptocup", 17, "ptup"),
    RU_UP("ruocup", 22, "ruup"),
    IT_UP("itocup", 40, "itup"),
    AR_UP("araup", 55, "araup");

    private static final /* synthetic */ yy.a $ENTRIES;
    private final String apiCode;
    private final int intCode;
    private final String trackCode;

    public d(String str, int i11, String str2) {
        super(str, i);
        this.intCode = i11;
        this.apiCode = str;
        this.trackCode = str2;
    }

    public static yy.a b() {
        return $ENTRIES;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }

    public final String a() {
        return this.apiCode;
    }

    public final int c() {
        return this.intCode;
    }

    public final String e() {
        return this.trackCode;
    }

    static {
        $ENTRIES = ub.a.U(dVarArr);
    }
}
