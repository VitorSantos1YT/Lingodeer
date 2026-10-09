package com.google.j2objc.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@Target({ElementType.LOCAL_VARIABLE})
@Retention(RetentionPolicy.SOURCE)
public @interface LoopTranslation {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class LoopStyle {
        private static final /* synthetic */ LoopStyle[] $VALUES;
        public static final LoopStyle FAST_ENUMERATION;
        public static final LoopStyle JAVA_ITERATOR;

        static {
            LoopStyle loopStyle = new LoopStyle("JAVA_ITERATOR", 0);
            JAVA_ITERATOR = loopStyle;
            LoopStyle loopStyle2 = new LoopStyle("FAST_ENUMERATION", 1);
            FAST_ENUMERATION = loopStyle2;
            $VALUES = new LoopStyle[]{loopStyle, loopStyle2};
        }

        public static LoopStyle valueOf(String str) {
            return (LoopStyle) Enum.valueOf(LoopStyle.class, str);
        }

        public static LoopStyle[] values() {
            return (LoopStyle[]) $VALUES.clone();
        }
    }
}
