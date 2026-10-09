package j$.time.format;

import com.tbruyelle.rxpermissions3.BuildConfig;
import j$.time.temporal.TemporalField;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class f extends j {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f35058g;

    @Override // j$.time.format.j, j$.time.format.e
    public final int B(v vVar, CharSequence charSequence, int i11) {
        boolean z11 = vVar.f35108c;
        DateTimeFormatter dateTimeFormatter = vVar.f35106a;
        int i12 = (z11 || b(vVar)) ? this.f35065b : 0;
        int i13 = (vVar.f35108c || b(vVar)) ? this.f35066c : 9;
        int length = charSequence.length();
        if (i11 != length) {
            if (this.f35058g) {
                if (charSequence.charAt(i11) == dateTimeFormatter.f35013c.f35029c) {
                    i11++;
                } else if (i12 > 0) {
                    return ~i11;
                }
            }
            int i14 = i11;
            int i15 = i12 + i14;
            if (i15 > length) {
                return ~i14;
            }
            int iMin = Math.min(i13 + i14, length);
            int i16 = 0;
            int i17 = i14;
            while (i17 < iMin) {
                int i18 = i17 + 1;
                int iCharAt = charSequence.charAt(i17) - dateTimeFormatter.f35013c.f35027a;
                if (iCharAt < 0 || iCharAt > 9) {
                    iCharAt = -1;
                }
                if (iCharAt < 0) {
                    if (i18 >= i15) {
                        break;
                    }
                    return ~i14;
                }
                i16 = (i16 * 10) + iCharAt;
                i17 = i18;
            }
            BigDecimal bigDecimalMovePointLeft = new BigDecimal(i16).movePointLeft(i17 - i14);
            j$.time.temporal.p pVarJ = this.f35064a.J();
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(pVarJ.f35183a);
            return vVar.g(this.f35064a, bigDecimalMovePointLeft.multiply(BigDecimal.valueOf(pVarJ.f35186d).subtract(bigDecimalValueOf).add(BigDecimal.ONE)).setScale(0, RoundingMode.FLOOR).add(bigDecimalValueOf).longValueExact(), i14, i17);
        }
        if (i12 > 0) {
            return ~i11;
        }
        return i11;
    }

    @Override // j$.time.format.j
    public final boolean b(v vVar) {
        return vVar.f35108c && this.f35065b == this.f35066c && !this.f35058g;
    }

    public f(TemporalField temporalField, int i11, int i12, boolean z11) {
        this(temporalField, i11, i12, z11, 0);
        Objects.requireNonNull(temporalField, "field");
        j$.time.temporal.p pVarJ = temporalField.J();
        if (pVarJ.f35183a != pVarJ.f35184b || pVarJ.f35185c != pVarJ.f35186d) {
            throw new IllegalArgumentException(j$.time.d.a("Field must have a fixed set of values: ", temporalField));
        }
        if (i11 < 0 || i11 > 9) {
            throw new IllegalArgumentException("Minimum width must be from 0 to 9 inclusive but was " + i11);
        }
        if (i12 < 1 || i12 > 9) {
            throw new IllegalArgumentException("Maximum width must be from 1 to 9 inclusive but was " + i12);
        }
        if (i12 >= i11) {
            return;
        }
        throw new IllegalArgumentException("Maximum width must exceed or equal the minimum width but " + i12 + " < " + i11);
    }

    public f(TemporalField temporalField, int i11, int i12, boolean z11, int i13) {
        super(temporalField, i11, i12, d0.NOT_NEGATIVE, i13);
        this.f35058g = z11;
    }

    @Override // j$.time.format.j
    public final j d() {
        if (this.f35068e == -1) {
            return this;
        }
        return new f(this.f35064a, this.f35065b, this.f35066c, this.f35058g, -1);
    }

    @Override // j$.time.format.j
    public final j e(int i11) {
        return new f(this.f35064a, this.f35065b, this.f35066c, this.f35058g, this.f35068e + i11);
    }

    @Override // j$.time.format.j, j$.time.format.e
    public final boolean w(x xVar, StringBuilder sb2) {
        TemporalField temporalField = this.f35064a;
        Long lA = xVar.a(temporalField);
        if (lA == null) {
            return false;
        }
        DecimalStyle decimalStyle = xVar.f35116b.f35013c;
        long jLongValue = lA.longValue();
        j$.time.temporal.p pVarJ = temporalField.J();
        pVarJ.b(temporalField, jLongValue);
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(pVarJ.f35183a);
        BigDecimal bigDecimalAdd = BigDecimal.valueOf(pVarJ.f35186d).subtract(bigDecimalValueOf).add(BigDecimal.ONE);
        BigDecimal bigDecimalSubtract = BigDecimal.valueOf(jLongValue).subtract(bigDecimalValueOf);
        RoundingMode roundingMode = RoundingMode.FLOOR;
        BigDecimal bigDecimalDivide = bigDecimalSubtract.divide(bigDecimalAdd, 9, roundingMode);
        BigDecimal bigDecimal = BigDecimal.ZERO;
        if (bigDecimalDivide.compareTo(bigDecimal) != 0) {
            bigDecimal = bigDecimalDivide.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimalDivide.stripTrailingZeros();
        }
        int iScale = bigDecimal.scale();
        boolean z11 = this.f35058g;
        int i11 = this.f35065b;
        if (iScale != 0) {
            String strA = decimalStyle.a(bigDecimal.setScale(Math.min(Math.max(bigDecimal.scale(), i11), this.f35066c), roundingMode).toPlainString().substring(2));
            if (z11) {
                sb2.append(decimalStyle.f35029c);
            }
            sb2.append(strA);
            return true;
        }
        if (i11 > 0) {
            if (z11) {
                sb2.append(decimalStyle.f35029c);
            }
            for (int i12 = 0; i12 < i11; i12++) {
                sb2.append(decimalStyle.f35027a);
            }
        }
        return true;
    }

    @Override // j$.time.format.j
    public final String toString() {
        return "Fraction(" + this.f35064a + "," + this.f35065b + "," + this.f35066c + (this.f35058g ? ",DecimalPoint" : BuildConfig.VERSION_NAME) + ")";
    }
}
