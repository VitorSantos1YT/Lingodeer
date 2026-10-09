package com.google.common.base;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
final class JdkPattern extends CommonPattern implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Pattern f16363a;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class JdkMatcher extends CommonMatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Matcher f16364a;

        public JdkMatcher(Matcher matcher) {
            matcher.getClass();
            this.f16364a = matcher;
        }

        @Override // com.google.common.base.CommonMatcher
        public final int a() {
            return this.f16364a.end();
        }

        @Override // com.google.common.base.CommonMatcher
        public final boolean b(int i11) {
            return this.f16364a.find(i11);
        }

        @Override // com.google.common.base.CommonMatcher
        public final int c() {
            return this.f16364a.start();
        }
    }

    public JdkPattern(Pattern pattern) {
        pattern.getClass();
        this.f16363a = pattern;
    }

    public final JdkMatcher a(CharSequence charSequence) {
        return new JdkMatcher(this.f16363a.matcher(charSequence));
    }

    public final String toString() {
        return this.f16363a.toString();
    }
}
