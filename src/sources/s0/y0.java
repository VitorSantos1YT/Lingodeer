package s0;

import android.R;
import android.content.res.Resources;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 s0.y0[], still in use, count: 1, list:
  (r0v1 s0.y0[]) from 0x006a: INVOKE (r0v1 s0.y0[]) STATIC call: ub.a.U(java.lang.Enum[]):yy.b A[MD:(java.lang.Enum[]):yy.b (m), WRAPPED] (LINE:107)
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
/* JADX INFO: loaded from: classes.dex */
public final class y0 {
    Cut(R.attr.actionModeCutDrawable, v0.e.f53457a, "Cut"),
    Copy(R.attr.actionModeCopyDrawable, v0.e.f53458b, "Copy"),
    Paste(R.attr.actionModePasteDrawable, v0.e.f53459c, "Paste"),
    SelectAll(R.attr.actionModeSelectAllDrawable, v0.e.f53460d, "SelectAll"),
    Autofill(0, v0.e.f53461e, "Autofill");

    private static final /* synthetic */ yy.a $ENTRIES;
    private final int drawableId;
    private final Object key;
    private final int stringId;

    static {
        $ENTRIES = ub.a.U(y0VarArr);
    }

    public y0(int i11, Object obj, String str) {
        super(str, i);
        this.key = obj;
        this.stringId = i;
        this.drawableId = i11;
    }

    public static y0 valueOf(String str) {
        return (y0) Enum.valueOf(y0.class, str);
    }

    public static y0[] values() {
        return (y0[]) $VALUES.clone();
    }

    public final int a() {
        return this.drawableId;
    }

    public final Object b() {
        return this.key;
    }

    public final String c(Resources resources) {
        return resources.getString(this.stringId);
    }
}
