package com.google.protobuf;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@CheckReturnValue
class UnknownFieldSetLiteSchema extends UnknownFieldSchema<UnknownFieldSetLite, UnknownFieldSetLite> {
    @Override // com.google.protobuf.UnknownFieldSchema
    public final void a(int i11, int i12, Object obj) {
        ((UnknownFieldSetLite) obj).d((i11 << 3) | 5, Integer.valueOf(i12));
    }

    @Override // com.google.protobuf.UnknownFieldSchema
    public final void b(long j11, Object obj, int i11) {
        ((UnknownFieldSetLite) obj).d((i11 << 3) | 1, Long.valueOf(j11));
    }

    @Override // com.google.protobuf.UnknownFieldSchema
    public final void c(int i11, Object obj, Object obj2) {
        ((UnknownFieldSetLite) obj).d((i11 << 3) | 3, (UnknownFieldSetLite) obj2);
    }

    @Override // com.google.protobuf.UnknownFieldSchema
    public final void d(Object obj, int i11, ByteString byteString) {
        ((UnknownFieldSetLite) obj).d((i11 << 3) | 2, byteString);
    }

    @Override // com.google.protobuf.UnknownFieldSchema
    public final void e(long j11, Object obj, int i11) {
        ((UnknownFieldSetLite) obj).d(i11 << 3, Long.valueOf(j11));
    }

    @Override // com.google.protobuf.UnknownFieldSchema
    public final UnknownFieldSetLite f(Object obj) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        UnknownFieldSetLite unknownFieldSetLite = generatedMessageLite.unknownFields;
        if (unknownFieldSetLite != UnknownFieldSetLite.f21406f) {
            return unknownFieldSetLite;
        }
        UnknownFieldSetLite unknownFieldSetLiteC = UnknownFieldSetLite.c();
        generatedMessageLite.unknownFields = unknownFieldSetLiteC;
        return unknownFieldSetLiteC;
    }

    @Override // com.google.protobuf.UnknownFieldSchema
    public final UnknownFieldSetLite g(Object obj) {
        return ((GeneratedMessageLite) obj).unknownFields;
    }

    @Override // com.google.protobuf.UnknownFieldSchema
    public final int h(Object obj) {
        return ((UnknownFieldSetLite) obj).b();
    }

    @Override // com.google.protobuf.UnknownFieldSchema
    public final int i(Object obj) {
        UnknownFieldSetLite unknownFieldSetLite = (UnknownFieldSetLite) obj;
        int i11 = unknownFieldSetLite.f21410d;
        if (i11 != -1) {
            return i11;
        }
        int iW = 0;
        for (int i12 = 0; i12 < unknownFieldSetLite.f21407a; i12++) {
            int i13 = unknownFieldSetLite.f21408b[i12] >>> 3;
            ByteString byteString = (ByteString) unknownFieldSetLite.f21409c[i12];
            int iW2 = CodedOutputStream.W(i13) + CodedOutputStream.V(2) + (CodedOutputStream.V(1) * 2);
            int iV = CodedOutputStream.V(3);
            int size = byteString.size();
            iW += CodedOutputStream.W(size) + size + iV + iW2;
        }
        unknownFieldSetLite.f21410d = iW;
        return iW;
    }

    @Override // com.google.protobuf.UnknownFieldSchema
    public final void j(Object obj) {
        UnknownFieldSetLite unknownFieldSetLite = ((GeneratedMessageLite) obj).unknownFields;
        if (unknownFieldSetLite.f21411e) {
            unknownFieldSetLite.f21411e = false;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.protobuf.UnknownFieldSchema
    public final UnknownFieldSetLite k(Object obj, Object obj2) {
        UnknownFieldSetLite unknownFieldSetLite = (UnknownFieldSetLite) obj;
        UnknownFieldSetLite unknownFieldSetLite2 = (UnknownFieldSetLite) obj2;
        UnknownFieldSetLite unknownFieldSetLite3 = UnknownFieldSetLite.f21406f;
        if (unknownFieldSetLite3.equals(unknownFieldSetLite2)) {
            return unknownFieldSetLite;
        }
        if (unknownFieldSetLite3.equals(unknownFieldSetLite)) {
            int i11 = unknownFieldSetLite.f21407a + unknownFieldSetLite2.f21407a;
            int[] iArrCopyOf = Arrays.copyOf(unknownFieldSetLite.f21408b, i11);
            System.arraycopy(unknownFieldSetLite2.f21408b, 0, iArrCopyOf, unknownFieldSetLite.f21407a, unknownFieldSetLite2.f21407a);
            Object[] objArrCopyOf = Arrays.copyOf(unknownFieldSetLite.f21409c, i11);
            System.arraycopy(unknownFieldSetLite2.f21409c, 0, objArrCopyOf, unknownFieldSetLite.f21407a, unknownFieldSetLite2.f21407a);
            return new UnknownFieldSetLite(i11, iArrCopyOf, objArrCopyOf, true);
        }
        unknownFieldSetLite.getClass();
        if (unknownFieldSetLite2.equals(unknownFieldSetLite3)) {
            return unknownFieldSetLite;
        }
        if (!unknownFieldSetLite.f21411e) {
            throw new UnsupportedOperationException();
        }
        int i12 = unknownFieldSetLite.f21407a + unknownFieldSetLite2.f21407a;
        unknownFieldSetLite.a(i12);
        System.arraycopy(unknownFieldSetLite2.f21408b, 0, unknownFieldSetLite.f21408b, unknownFieldSetLite.f21407a, unknownFieldSetLite2.f21407a);
        System.arraycopy(unknownFieldSetLite2.f21409c, 0, unknownFieldSetLite.f21409c, unknownFieldSetLite.f21407a, unknownFieldSetLite2.f21407a);
        unknownFieldSetLite.f21407a = i12;
        return unknownFieldSetLite;
    }

    @Override // com.google.protobuf.UnknownFieldSchema
    public final UnknownFieldSetLite m() {
        return UnknownFieldSetLite.c();
    }

    @Override // com.google.protobuf.UnknownFieldSchema
    public final void n(Object obj, Object obj2) {
        ((GeneratedMessageLite) obj).unknownFields = (UnknownFieldSetLite) obj2;
    }

    @Override // com.google.protobuf.UnknownFieldSchema
    public final void o(Object obj, Object obj2) {
        ((GeneratedMessageLite) obj).unknownFields = (UnknownFieldSetLite) obj2;
    }

    @Override // com.google.protobuf.UnknownFieldSchema
    public final UnknownFieldSetLite p(Object obj) {
        UnknownFieldSetLite unknownFieldSetLite = (UnknownFieldSetLite) obj;
        if (unknownFieldSetLite.f21411e) {
            unknownFieldSetLite.f21411e = false;
        }
        return unknownFieldSetLite;
    }

    @Override // com.google.protobuf.UnknownFieldSchema
    public final void q(Object obj, Writer writer) {
        UnknownFieldSetLite unknownFieldSetLite = (UnknownFieldSetLite) obj;
        unknownFieldSetLite.getClass();
        if (writer.l() == Writer.FieldOrder.DESCENDING) {
            for (int i11 = unknownFieldSetLite.f21407a - 1; i11 >= 0; i11--) {
                writer.e(unknownFieldSetLite.f21408b[i11] >>> 3, unknownFieldSetLite.f21409c[i11]);
            }
            return;
        }
        for (int i12 = 0; i12 < unknownFieldSetLite.f21407a; i12++) {
            writer.e(unknownFieldSetLite.f21408b[i12] >>> 3, unknownFieldSetLite.f21409c[i12]);
        }
    }

    @Override // com.google.protobuf.UnknownFieldSchema
    public final void r(Object obj, Writer writer) {
        ((UnknownFieldSetLite) obj).f(writer);
    }
}
