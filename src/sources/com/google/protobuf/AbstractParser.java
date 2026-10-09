package com.google.protobuf;

import com.google.protobuf.MessageLite;
import java.io.FileInputStream;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractParser<MessageType extends MessageLite> implements Parser<MessageType> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ExtensionRegistryLite f21141a = ExtensionRegistryLite.a();

    public static void c(MessageLite messageLite) throws InvalidProtocolBufferException {
        if (messageLite.c()) {
            return;
        }
        InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException((messageLite instanceof AbstractMessageLite ? new UninitializedMessageException() : new UninitializedMessageException()).getMessage());
        invalidProtocolBufferException.f21285a = messageLite;
        throw invalidProtocolBufferException;
    }

    @Override // com.google.protobuf.Parser
    public final MessageLite a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        GeneratedMessageLite generatedMessageLiteD = ((GeneratedMessageLite.DefaultInstanceBasedParser) this).d(codedInputStream, extensionRegistryLite);
        c(generatedMessageLiteD);
        return generatedMessageLiteD;
    }

    @Override // com.google.protobuf.Parser
    public final MessageLite b(FileInputStream fileInputStream) throws InvalidProtocolBufferException {
        CodedInputStream codedInputStreamF = CodedInputStream.f(fileInputStream);
        GeneratedMessageLite generatedMessageLiteD = ((GeneratedMessageLite.DefaultInstanceBasedParser) this).d(codedInputStreamF, f21141a);
        try {
            codedInputStreamF.a(0);
            c(generatedMessageLiteD);
            return generatedMessageLiteD;
        } catch (InvalidProtocolBufferException e8) {
            e8.f21285a = generatedMessageLiteD;
            throw e8;
        }
    }
}
