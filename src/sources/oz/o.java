package oz;

import com.tbruyelle.rxpermissions3.BuildConfig;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l1.z1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class o implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Pattern f46176a;

    public o(Pattern pattern) {
        this.f46176a = pattern;
    }

    public static cz.i c(o oVar, String input) {
        kotlin.jvm.internal.m.f(input, "input");
        if (input.length() >= 0) {
            return new cz.i(1, new z1(26, oVar, input), n.f46175a);
        }
        StringBuilder sbI = w4.c.i(0, "Start index out of bounds: ", ", input length: ");
        sbI.append(input.length());
        throw new IndexOutOfBoundsException(sbI.toString());
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        Pattern pattern = this.f46176a;
        String strPattern = pattern.pattern();
        kotlin.jvm.internal.m.e(strPattern, "pattern(...)");
        return new m(strPattern, pattern.flags());
    }

    public final boolean a(CharSequence input) {
        kotlin.jvm.internal.m.f(input, "input");
        return this.f46176a.matcher(input).find();
    }

    public final l b(CharSequence input) {
        kotlin.jvm.internal.m.f(input, "input");
        Matcher matcher = this.f46176a.matcher(input);
        kotlin.jvm.internal.m.e(matcher, "matcher(...)");
        return se.k.e(matcher, 0, input);
    }

    public final l d(int i11, String input) {
        kotlin.jvm.internal.m.f(input, "input");
        Matcher matcherRegion = this.f46176a.matcher(input).useAnchoringBounds(false).useTransparentBounds(true).region(i11, input.length());
        if (matcherRegion.lookingAt()) {
            return new l(matcherRegion, input);
        }
        return null;
    }

    public final l e(String input) {
        kotlin.jvm.internal.m.f(input, "input");
        Matcher matcher = this.f46176a.matcher(input);
        kotlin.jvm.internal.m.e(matcher, "matcher(...)");
        if (matcher.matches()) {
            return new l(matcher, input);
        }
        return null;
    }

    public final boolean f(CharSequence input) {
        kotlin.jvm.internal.m.f(input, "input");
        return this.f46176a.matcher(input).matches();
    }

    public final String g(String input) {
        kotlin.jvm.internal.m.f(input, "input");
        String strReplaceAll = this.f46176a.matcher(input).replaceAll(BuildConfig.VERSION_NAME);
        kotlin.jvm.internal.m.e(strReplaceAll, "replaceAll(...)");
        return strReplaceAll;
    }

    public final String h(String input, fz.c transform) {
        kotlin.jvm.internal.m.f(input, "input");
        kotlin.jvm.internal.m.f(transform, "transform");
        l lVarB = b(input);
        if (lVarB == null) {
            return input.toString();
        }
        int length = input.length();
        StringBuilder sb2 = new StringBuilder(length);
        int i11 = 0;
        do {
            sb2.append((CharSequence) input, i11, lVarB.b().f40532a);
            sb2.append((CharSequence) transform.invoke(lVarB));
            i11 = lVarB.b().f40533b + 1;
            lVarB = lVarB.d();
            if (i11 >= length) {
                break;
            }
        } while (lVarB != null);
        if (i11 < length) {
            sb2.append((CharSequence) input, i11, length);
        }
        String string = sb2.toString();
        kotlin.jvm.internal.m.e(string, "toString(...)");
        return string;
    }

    public final String toString() {
        String string = this.f46176a.toString();
        kotlin.jvm.internal.m.e(string, "toString(...)");
        return string;
    }

    public o(String pattern) {
        kotlin.jvm.internal.m.f(pattern, "pattern");
        Pattern patternCompile = Pattern.compile(pattern);
        kotlin.jvm.internal.m.e(patternCompile, "compile(...)");
        this.f46176a = patternCompile;
    }

    public o(String pattern, p option) {
        kotlin.jvm.internal.m.f(pattern, "pattern");
        kotlin.jvm.internal.m.f(option, "option");
        int iA = option.a();
        Pattern patternCompile = Pattern.compile(pattern, (iA & 2) != 0 ? iA | 64 : iA);
        kotlin.jvm.internal.m.e(patternCompile, "compile(...)");
        this.f46176a = patternCompile;
    }
}
