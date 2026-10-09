package j$.time.format;

import j$.time.temporal.TemporalField;

/* JADX INFO: loaded from: classes2.dex */
public class j implements e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long[] f35063f = {0, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000L};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TemporalField f35064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f35065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f35066c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d0 f35067d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f35068e;

    public long a(x xVar, long j11) {
        return j11;
    }

    public j(TemporalField temporalField, int i11, int i12, d0 d0Var) {
        this.f35064a = temporalField;
        this.f35065b = i11;
        this.f35066c = i12;
        this.f35067d = d0Var;
        this.f35068e = 0;
    }

    public j(TemporalField temporalField, int i11, int i12, d0 d0Var, int i13) {
        this.f35064a = temporalField;
        this.f35065b = i11;
        this.f35066c = i12;
        this.f35067d = d0Var;
        this.f35068e = i13;
    }

    public j d() {
        if (this.f35068e == -1) {
            return this;
        }
        return new j(this.f35064a, this.f35065b, this.f35066c, this.f35067d, -1);
    }

    public j e(int i11) {
        return new j(this.f35064a, this.f35065b, this.f35066c, this.f35067d, this.f35068e + i11);
    }

    @Override // j$.time.format.e
    public boolean w(x xVar, StringBuilder sb2) {
        TemporalField temporalField = this.f35064a;
        Long lA = xVar.a(temporalField);
        if (lA == null) {
            return false;
        }
        long jA = a(xVar, lA.longValue());
        DecimalStyle decimalStyle = xVar.f35116b.f35013c;
        String string = jA == Long.MIN_VALUE ? "9223372036854775808" : Long.toString(Math.abs(jA));
        int length = string.length();
        int i11 = this.f35066c;
        if (length > i11) {
            throw new j$.time.c("Field " + temporalField + " cannot be printed as the value " + jA + " exceeds the maximum print width of " + i11);
        }
        String strA = decimalStyle.a(string);
        int i12 = this.f35065b;
        d0 d0Var = this.f35067d;
        if (jA >= 0) {
            int i13 = b.f35037a[d0Var.ordinal()];
            if (i13 != 1) {
                if (i13 == 2) {
                    sb2.append('+');
                }
            } else if (i12 < 19 && jA >= f35063f[i12]) {
                sb2.append('+');
            }
        } else {
            int i14 = b.f35037a[d0Var.ordinal()];
            if (i14 == 1 || i14 == 2 || i14 == 3) {
                sb2.append(decimalStyle.f35028b);
            } else if (i14 == 4) {
                throw new j$.time.c("Field " + temporalField + " cannot be printed as the value " + jA + " cannot be negative according to the SignStyle");
            }
        }
        for (int i15 = 0; i15 < i12 - strA.length(); i15++) {
            sb2.append(decimalStyle.f35027a);
        }
        sb2.append(strA);
        return true;
    }

    public boolean b(v vVar) {
        int i11 = this.f35068e;
        if (i11 != -1) {
            return i11 > 0 && this.f35065b == this.f35066c && this.f35067d == d0.NOT_NEGATIVE;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:119:0x0172  */
    /* JADX WARN: Code duplicated, block: B:121:0x017a  */
    /* JADX WARN: Code duplicated, block: B:124:0x0192  */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0169, code lost:
    
        if (r7 <= r11) goto L98;
     */
    @Override // j$.time.format.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int B(j$.time.format.v r29, java.lang.CharSequence r30, int r31) {
        /*
            Method dump skipped, instruction units count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.j.B(j$.time.format.v, java.lang.CharSequence, int):int");
    }

    public int c(v vVar, long j11, int i11, int i12) {
        return vVar.g(this.f35064a, j11, i11, i12);
    }

    public String toString() {
        int i11 = this.f35066c;
        TemporalField temporalField = this.f35064a;
        d0 d0Var = this.f35067d;
        int i12 = this.f35065b;
        if (i12 == 1 && i11 == 19 && d0Var == d0.NORMAL) {
            return "Value(" + temporalField + ")";
        }
        if (i12 == i11 && d0Var == d0.NOT_NEGATIVE) {
            return "Value(" + temporalField + "," + i12 + ")";
        }
        return "Value(" + temporalField + "," + i12 + "," + i11 + "," + d0Var + ")";
    }
}
