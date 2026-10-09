package oz;

import java.util.List;
import java.util.regex.Matcher;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Matcher f46169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CharSequence f46170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f46171c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public j f46172d;

    public l(Matcher matcher, CharSequence input) {
        kotlin.jvm.internal.m.f(input, "input");
        this.f46169a = matcher;
        this.f46170b = input;
        this.f46171c = new k(this, 0);
    }

    public final List a() {
        if (this.f46172d == null) {
            this.f46172d = new j(this);
        }
        j jVar = this.f46172d;
        kotlin.jvm.internal.m.c(jVar);
        return jVar;
    }

    public final lz.g b() {
        Matcher matcher = this.f46169a;
        return hz.b.U(matcher.start(), matcher.end());
    }

    public final String c() {
        String strGroup = this.f46169a.group();
        kotlin.jvm.internal.m.e(strGroup, "group(...)");
        return strGroup;
    }

    public final l d() {
        Matcher matcher = this.f46169a;
        int iEnd = matcher.end() + (matcher.end() == matcher.start() ? 1 : 0);
        CharSequence charSequence = this.f46170b;
        if (iEnd > charSequence.length()) {
            return null;
        }
        Matcher matcher2 = matcher.pattern().matcher(charSequence);
        kotlin.jvm.internal.m.e(matcher2, "matcher(...)");
        return se.k.e(matcher2, iEnd, charSequence);
    }
}
