package com.google.common.base;

import com.tbruyelle.rxpermissions3.BuildConfig;
import java.io.Serializable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public abstract class CaseFormat {
    private static final /* synthetic */ CaseFormat[] $VALUES;
    public static final CaseFormat LOWER_CAMEL;
    public static final CaseFormat LOWER_HYPHEN;
    public static final CaseFormat LOWER_UNDERSCORE;
    public static final CaseFormat UPPER_CAMEL;
    public static final CaseFormat UPPER_UNDERSCORE;
    private final CharMatcher wordBoundary;
    private final String wordSeparator;

    /* JADX INFO: renamed from: com.google.common.base.CaseFormat$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public final enum AnonymousClass1 extends CaseFormat {
    }

    /* JADX INFO: renamed from: com.google.common.base.CaseFormat$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public final enum AnonymousClass2 extends CaseFormat {
    }

    /* JADX INFO: renamed from: com.google.common.base.CaseFormat$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public final enum AnonymousClass3 extends CaseFormat {
    }

    /* JADX INFO: renamed from: com.google.common.base.CaseFormat$4, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public final enum AnonymousClass4 extends CaseFormat {
    }

    /* JADX INFO: renamed from: com.google.common.base.CaseFormat$5, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public final enum AnonymousClass5 extends CaseFormat {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class StringConverter extends Converter<String, String> implements Serializable {
        private static final long serialVersionUID = 0;

        @Override // com.google.common.base.Converter
        public final Object b(Object obj) {
            throw null;
        }

        @Override // com.google.common.base.Function
        public final boolean equals(Object obj) {
            if (obj instanceof StringConverter) {
                throw null;
            }
            return false;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "null.converterTo(null)";
        }
    }

    static {
        AnonymousClass1 anonymousClass1 = new AnonymousClass1("LOWER_HYPHEN", 0, new CharMatcher.Is('-'), "-");
        LOWER_HYPHEN = anonymousClass1;
        AnonymousClass2 anonymousClass2 = new AnonymousClass2("LOWER_UNDERSCORE", 1, new CharMatcher.Is('_'), "_");
        LOWER_UNDERSCORE = anonymousClass2;
        AnonymousClass3 anonymousClass3 = new AnonymousClass3("LOWER_CAMEL", 2, new CharMatcher.InRange('A', 'Z'), BuildConfig.VERSION_NAME);
        LOWER_CAMEL = anonymousClass3;
        AnonymousClass4 anonymousClass4 = new AnonymousClass4("UPPER_CAMEL", 3, new CharMatcher.InRange('A', 'Z'), BuildConfig.VERSION_NAME);
        UPPER_CAMEL = anonymousClass4;
        AnonymousClass5 anonymousClass5 = new AnonymousClass5("UPPER_UNDERSCORE", 4, new CharMatcher.Is('_'), "_");
        UPPER_UNDERSCORE = anonymousClass5;
        $VALUES = new CaseFormat[]{anonymousClass1, anonymousClass2, anonymousClass3, anonymousClass4, anonymousClass5};
    }

    public CaseFormat(String str, int i11, CharMatcher charMatcher, String str2) {
        super(str, i11);
        this.wordBoundary = charMatcher;
        this.wordSeparator = str2;
    }

    public static CaseFormat valueOf(String str) {
        return (CaseFormat) Enum.valueOf(CaseFormat.class, str);
    }

    public static CaseFormat[] values() {
        return (CaseFormat[]) $VALUES.clone();
    }
}
