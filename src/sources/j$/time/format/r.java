package j$.time.format;

import j$.time.chrono.Chronology;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalField;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class r implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TemporalField f35091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextStyle f35092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a0 f35093c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile j f35094d;

    public r(TemporalField temporalField, TextStyle textStyle, a0 a0Var) {
        this.f35091a = temporalField;
        this.f35092b = textStyle;
        this.f35093c = a0Var;
    }

    @Override // j$.time.format.e
    public final boolean w(x xVar, StringBuilder sb2) {
        String strC;
        Long lA = xVar.a(this.f35091a);
        DateTimeFormatter dateTimeFormatter = xVar.f35116b;
        if (lA == null) {
            return false;
        }
        Chronology chronology = (Chronology) xVar.f35115a.d(j$.time.temporal.n.f35177b);
        if (chronology == null || chronology == j$.time.chrono.p.f34989d) {
            strC = this.f35093c.c(this.f35091a, lA.longValue(), this.f35092b, dateTimeFormatter.f35012b);
        } else {
            strC = this.f35093c.b(chronology, this.f35091a, lA.longValue(), this.f35092b, dateTimeFormatter.f35012b);
        }
        if (strC != null) {
            sb2.append(strC);
            return true;
        }
        if (this.f35094d == null) {
            this.f35094d = new j(this.f35091a, 1, 19, d0.NORMAL);
        }
        return this.f35094d.w(xVar, sb2);
    }

    @Override // j$.time.format.e
    public final int B(v vVar, CharSequence charSequence, int i11) {
        Iterator itE;
        a0 a0Var = this.f35093c;
        TemporalField temporalField = this.f35091a;
        int length = charSequence.length();
        if (i11 >= 0 && i11 <= length) {
            boolean z11 = vVar.f35108c;
            DateTimeFormatter dateTimeFormatter = vVar.f35106a;
            TextStyle textStyle = z11 ? this.f35092b : null;
            Chronology chronologyD = vVar.d();
            if (chronologyD == null || chronologyD == j$.time.chrono.p.f34989d) {
                itE = a0Var.e(temporalField, textStyle, dateTimeFormatter.f35012b);
            } else {
                itE = a0Var.d(chronologyD, temporalField, textStyle, dateTimeFormatter.f35012b);
            }
            Iterator it = itE;
            if (it != null) {
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    String str = (String) entry.getKey();
                    if (vVar.h(str, 0, charSequence, i11, str.length())) {
                        return vVar.g(this.f35091a, ((Long) entry.getValue()).longValue(), i11, str.length() + i11);
                    }
                }
                if (temporalField == ChronoField.ERA && !vVar.f35108c) {
                    for (j$.time.chrono.j jVar : chronologyD.A()) {
                        String string = jVar.toString();
                        if (vVar.h(string, 0, charSequence, i11, string.length())) {
                            return vVar.g(this.f35091a, jVar.getValue(), i11, string.length() + i11);
                        }
                    }
                }
                if (vVar.f35108c) {
                    return ~i11;
                }
            }
            if (this.f35094d == null) {
                this.f35094d = new j(this.f35091a, 1, 19, d0.NORMAL);
            }
            return this.f35094d.B(vVar, charSequence, i11);
        }
        throw new IndexOutOfBoundsException();
    }

    public final String toString() {
        TextStyle textStyle = TextStyle.FULL;
        TemporalField temporalField = this.f35091a;
        TextStyle textStyle2 = this.f35092b;
        if (textStyle2 == textStyle) {
            return "Text(" + temporalField + ")";
        }
        return "Text(" + temporalField + "," + textStyle2 + ")";
    }
}
