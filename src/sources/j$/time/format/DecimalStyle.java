package j$.time.format;

import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes2.dex */
public final class DecimalStyle {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final DecimalStyle f35025d = new DecimalStyle('0', '-', '.');

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ConcurrentMap f35026e = new ConcurrentHashMap(16, 0.75f, 2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final char f35027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final char f35028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final char f35029c;

    public static DecimalStyle of(Locale locale) {
        DecimalStyle decimalStyle;
        Objects.requireNonNull(locale, "locale");
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) f35026e;
        DecimalStyle decimalStyle2 = (DecimalStyle) concurrentHashMap.get(locale);
        if (decimalStyle2 != null) {
            return decimalStyle2;
        }
        DecimalFormatSymbols decimalFormatSymbols = DecimalFormatSymbols.getInstance(locale);
        char zeroDigit = decimalFormatSymbols.getZeroDigit();
        char minusSign = decimalFormatSymbols.getMinusSign();
        char decimalSeparator = decimalFormatSymbols.getDecimalSeparator();
        if (zeroDigit == '0' && minusSign == '-' && decimalSeparator == '.') {
            decimalStyle = f35025d;
        } else {
            decimalStyle = new DecimalStyle(zeroDigit, minusSign, decimalSeparator);
        }
        concurrentHashMap.putIfAbsent(locale, decimalStyle);
        return (DecimalStyle) concurrentHashMap.get(locale);
    }

    public DecimalStyle(char c11, char c12, char c13) {
        this.f35027a = c11;
        this.f35028b = c12;
        this.f35029c = c13;
    }

    public final String a(String str) {
        char c11 = this.f35027a;
        if (c11 == '0') {
            return str;
        }
        int i11 = c11 - '0';
        char[] charArray = str.toCharArray();
        for (int i12 = 0; i12 < charArray.length; i12++) {
            charArray[i12] = (char) (charArray[i12] + i11);
        }
        return new String(charArray);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DecimalStyle)) {
            return false;
        }
        DecimalStyle decimalStyle = (DecimalStyle) obj;
        return this.f35027a == decimalStyle.f35027a && this.f35028b == decimalStyle.f35028b && this.f35029c == decimalStyle.f35029c;
    }

    public final int hashCode() {
        return this.f35027a + '+' + this.f35028b + this.f35029c;
    }

    public final String toString() {
        return "DecimalStyle[" + this.f35027a + '+' + this.f35028b + this.f35029c + "]";
    }
}
