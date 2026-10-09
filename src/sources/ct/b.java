package ct;

import defpackage.e;
import fr.j3;
import j3.y0;
import kotlin.jvm.internal.m;
import v3.o;
import v3.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f22466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f22467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f22468c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f22469d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f22470e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f22471f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f22472g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f22473h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f22474i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final y0 f22475j;

    public b(long j11, long j12, long j13, long j14, long j15, long j16, long j17, int i11, float f5, y0 keyLanguageTextStyle) {
        m.f(keyLanguageTextStyle, "keyLanguageTextStyle");
        this.f22466a = j11;
        this.f22467b = j12;
        this.f22468c = j13;
        this.f22469d = j14;
        this.f22470e = j15;
        this.f22471f = j16;
        this.f22472g = j17;
        this.f22473h = i11;
        this.f22474i = f5;
        this.f22475j = keyLanguageTextStyle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return o.a(this.f22466a, bVar.f22466a) && o.a(this.f22467b, bVar.f22467b) && o.a(this.f22468c, bVar.f22468c) && o.a(this.f22469d, bVar.f22469d) && o.a(this.f22470e, bVar.f22470e) && o.a(this.f22471f, bVar.f22471f) && o.a(this.f22472g, bVar.f22472g) && this.f22473h == bVar.f22473h && Float.compare(this.f22474i, bVar.f22474i) == 0 && m.a(this.f22475j, bVar.f22475j);
    }

    public final int hashCode() {
        p[] pVarArr = o.f53500b;
        return this.f22475j.hashCode() + e.a(e.b(this.f22473h, e.f(this.f22472g, e.f(this.f22471f, e.f(this.f22470e, e.f(this.f22469d, e.f(this.f22468c, e.f(this.f22467b, Long.hashCode(this.f22466a) * 31, 31), 31), 31), 31), 31), 31), 31), this.f22474i, 31);
    }

    public final String toString() {
        String strF = o.f(this.f22466a);
        String strF2 = o.f(this.f22467b);
        String strF3 = o.f(this.f22468c);
        String strF4 = o.f(this.f22469d);
        String strF5 = o.f(this.f22470e);
        String strF6 = o.f(this.f22471f);
        String strF7 = o.f(this.f22472g);
        StringBuilder sbS = e.s("CourseThemeConfig(hintTextSize=", strF, ", mainTextSize=", strF2, ", mainTranslationTextSize=");
        com.google.android.material.datepicker.d.w(sbS, strF3, ", translationSize=", strF4, ", optionCharSizeBig=");
        com.google.android.material.datepicker.d.w(sbS, strF5, ", optionTranslationSizeBig=", strF6, ", optionSizeBig=");
        sbS.append(strF7);
        sbS.append(", scriptStyle=");
        sbS.append(this.f22473h);
        sbS.append(", pronunciationGuideAlpha=");
        sbS.append(this.f22474i);
        sbS.append(", keyLanguageTextStyle=");
        sbS.append(this.f22475j);
        sbS.append(")");
        return sbS.toString();
    }

    public /* synthetic */ b(float f5, int i11, int i12, long j11) {
        this(j3.A(18), (i12 & 2) != 0 ? j3.A(22) : j11, j3.A(22), j3.A(16), j3.A(42), j3.A(25), j3.A(25), (i12 & 128) != 0 ? -1 : i11, (i12 & 256) != 0 ? 1.0f : f5, new y0(0L, 0L, null, null, 0L, 0, 0L, 16777215));
    }
}
