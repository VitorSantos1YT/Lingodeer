package q3;

import java.util.Locale;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Locale f47417a;

    public a(Locale locale) {
        this.f47417a = locale;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof a)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return m.a(this.f47417a.toLanguageTag(), ((a) obj).f47417a.toLanguageTag());
    }

    public final int hashCode() {
        return this.f47417a.toLanguageTag().hashCode();
    }

    public final String toString() {
        return this.f47417a.toLanguageTag();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(String str) {
        c.f47421a.getClass();
        Locale localeForLanguageTag = Locale.forLanguageTag(str);
        m.a(localeForLanguageTag.toLanguageTag(), "und");
        this(localeForLanguageTag);
    }
}
