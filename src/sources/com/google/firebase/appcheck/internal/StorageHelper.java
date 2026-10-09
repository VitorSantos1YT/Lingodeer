package com.google.firebase.appcheck.internal;

import com.google.firebase.components.Lazy;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class StorageHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Lazy f17833a;

    /* JADX INFO: renamed from: com.google.firebase.appcheck.internal.StorageHelper$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f17834a;

        static {
            int[] iArr = new int[TokenType.values().length];
            f17834a = iArr;
            try {
                iArr[TokenType.DEFAULT_APP_CHECK_TOKEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17834a[TokenType.UNKNOWN_APP_CHECK_TOKEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class TokenType {
        private static final /* synthetic */ TokenType[] $VALUES;
        public static final TokenType DEFAULT_APP_CHECK_TOKEN;
        public static final TokenType UNKNOWN_APP_CHECK_TOKEN;

        static {
            TokenType tokenType = new TokenType("DEFAULT_APP_CHECK_TOKEN", 0);
            DEFAULT_APP_CHECK_TOKEN = tokenType;
            TokenType tokenType2 = new TokenType("UNKNOWN_APP_CHECK_TOKEN", 1);
            UNKNOWN_APP_CHECK_TOKEN = tokenType2;
            $VALUES = new TokenType[]{tokenType, tokenType2};
        }

        public static TokenType valueOf(String str) {
            return (TokenType) Enum.valueOf(TokenType.class, str);
        }

        public static TokenType[] values() {
            return (TokenType[]) $VALUES.clone();
        }
    }
}
