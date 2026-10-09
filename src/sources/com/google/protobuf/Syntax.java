package com.google.protobuf;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public enum Syntax implements Internal.EnumLite {
    SYNTAX_PROTO2(0),
    SYNTAX_PROTO3(1),
    SYNTAX_EDITIONS(2),
    UNRECOGNIZED(-1);

    public static final int SYNTAX_EDITIONS_VALUE = 2;
    public static final int SYNTAX_PROTO2_VALUE = 0;
    public static final int SYNTAX_PROTO3_VALUE = 1;
    private static final Internal.EnumLiteMap<Syntax> internalValueMap = new Internal.EnumLiteMap<Syntax>() { // from class: com.google.protobuf.Syntax.1
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final Internal.EnumLite a(int i11) {
            if (i11 == 0) {
                return Syntax.SYNTAX_PROTO2;
            }
            if (i11 == 1) {
                return Syntax.SYNTAX_PROTO3;
            }
            if (i11 == 2) {
                return Syntax.SYNTAX_EDITIONS;
            }
            Syntax syntax = Syntax.SYNTAX_PROTO2;
            return null;
        }
    };
    private final int value;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class SyntaxVerifier implements Internal.EnumVerifier {
        static {
            new SyntaxVerifier();
        }

        private SyntaxVerifier() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean a(int i11) {
            Syntax syntax;
            if (i11 == 0) {
                syntax = Syntax.SYNTAX_PROTO2;
            } else if (i11 == 1) {
                syntax = Syntax.SYNTAX_PROTO3;
            } else if (i11 != 2) {
                Syntax syntax2 = Syntax.SYNTAX_PROTO2;
                syntax = null;
            } else {
                syntax = Syntax.SYNTAX_EDITIONS;
            }
            return syntax != null;
        }
    }

    Syntax(int i11) {
        this.value = i11;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int d() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
