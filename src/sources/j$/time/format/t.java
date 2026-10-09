package j$.time.format;

import com.tbruyelle.rxpermissions3.BuildConfig;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.temporal.ChronoField;
import java.text.ParsePosition;
import java.util.AbstractMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class t implements e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile Map.Entry f35097c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile Map.Entry f35098d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j$.time.f f35099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f35100b;

    public n a(v vVar) {
        Set<String> set = j$.time.zone.i.f35236d;
        int size = set.size();
        Map.Entry simpleImmutableEntry = vVar.f35107b ? f35097c : f35098d;
        if (simpleImmutableEntry == null || ((Integer) simpleImmutableEntry.getKey()).intValue() != size) {
            synchronized (this) {
                try {
                    simpleImmutableEntry = vVar.f35107b ? f35097c : f35098d;
                    if (simpleImmutableEntry == null || ((Integer) simpleImmutableEntry.getKey()).intValue() != size) {
                        Integer numValueOf = Integer.valueOf(size);
                        n nVar = vVar.f35107b ? new n(BuildConfig.VERSION_NAME, null, null) : new m(BuildConfig.VERSION_NAME, null, null);
                        for (String str : set) {
                            nVar.a(str, str);
                        }
                        simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry(numValueOf, nVar);
                        if (vVar.f35107b) {
                            f35097c = simpleImmutableEntry;
                        } else {
                            f35098d = simpleImmutableEntry;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return (n) simpleImmutableEntry.getValue();
    }

    public t(j$.time.f fVar, String str) {
        this.f35099a = fVar;
        this.f35100b = str;
    }

    @Override // j$.time.format.e
    public boolean w(x xVar, StringBuilder sb2) {
        ZoneId zoneId = (ZoneId) xVar.b(this.f35099a);
        if (zoneId == null) {
            return false;
        }
        sb2.append(zoneId.q());
        return true;
    }

    @Override // j$.time.format.e
    public final int B(v vVar, CharSequence charSequence, int i11) {
        int i12;
        int length = charSequence.length();
        if (i11 > length) {
            throw new IndexOutOfBoundsException();
        }
        if (i11 == length) {
            return ~i11;
        }
        char cCharAt = charSequence.charAt(i11);
        if (cCharAt == '+' || cCharAt == '-') {
            return b(vVar, charSequence, i11, i11, k.f35070e);
        }
        int i13 = i11 + 2;
        if (length >= i13) {
            char cCharAt2 = charSequence.charAt(i11 + 1);
            if (vVar.a(cCharAt, 'U') && vVar.a(cCharAt2, 'T')) {
                int i14 = i11 + 3;
                if (length >= i14 && vVar.a(charSequence.charAt(i13), 'C')) {
                    return b(vVar, charSequence, i11, i14, k.f35071f);
                }
                return b(vVar, charSequence, i11, i13, k.f35071f);
            }
            if (vVar.a(cCharAt, 'G') && length >= (i12 = i11 + 3) && vVar.a(cCharAt2, 'M') && vVar.a(charSequence.charAt(i13), 'T')) {
                int i15 = i11 + 4;
                if (length >= i15 && vVar.a(charSequence.charAt(i12), '0')) {
                    vVar.f(ZoneId.of("GMT0"));
                    return i15;
                }
                return b(vVar, charSequence, i11, i12, k.f35071f);
            }
        }
        n nVarA = a(vVar);
        ParsePosition parsePosition = new ParsePosition(i11);
        String strC = nVarA.c(charSequence, parsePosition);
        if (strC == null) {
            if (!vVar.a(cCharAt, 'Z')) {
                return ~i11;
            }
            vVar.f(ZoneOffset.UTC);
            return i11 + 1;
        }
        vVar.f(ZoneId.of(strC));
        return parsePosition.getIndex();
    }

    public static int b(v vVar, CharSequence charSequence, int i11, int i12, k kVar) {
        String upperCase = charSequence.subSequence(i11, i12).toString().toUpperCase();
        if (i12 >= charSequence.length()) {
            vVar.f(ZoneId.of(upperCase));
            return i12;
        }
        if (charSequence.charAt(i12) != '0' && !vVar.a(charSequence.charAt(i12), 'Z')) {
            v vVar2 = new v(vVar.f35106a);
            vVar2.f35107b = vVar.f35107b;
            vVar2.f35108c = vVar.f35108c;
            int iB = kVar.B(vVar2, charSequence, i12);
            try {
                if (iB < 0) {
                    if (kVar == k.f35070e) {
                        return ~i11;
                    }
                    vVar.f(ZoneId.of(upperCase));
                    return i12;
                }
                vVar.f(ZoneId.J(upperCase, ZoneOffset.c0((int) vVar2.e(ChronoField.OFFSET_SECONDS).longValue())));
                return iB;
            } catch (j$.time.c unused) {
                return ~i11;
            }
        }
        vVar.f(ZoneId.of(upperCase));
        return i12;
    }

    public final String toString() {
        return this.f35100b;
    }
}
