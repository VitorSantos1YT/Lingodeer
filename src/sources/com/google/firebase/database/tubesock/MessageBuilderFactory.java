package com.google.firebase.database.tubesock;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
class MessageBuilderFactory {

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class BinaryBuilder implements Builder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f19560b = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f19559a = new ArrayList();

        @Override // com.google.firebase.database.tubesock.MessageBuilderFactory.Builder
        public final boolean a(byte[] bArr) {
            this.f19559a.add(bArr);
            this.f19560b += bArr.length;
            return true;
        }

        @Override // com.google.firebase.database.tubesock.MessageBuilderFactory.Builder
        public final WebSocketMessage b() {
            byte[] bArr = new byte[this.f19560b];
            int i11 = 0;
            int length = 0;
            while (true) {
                ArrayList arrayList = this.f19559a;
                if (i11 >= arrayList.size()) {
                    return new WebSocketMessage();
                }
                byte[] bArr2 = (byte[]) arrayList.get(i11);
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
                i11++;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface Builder {
        boolean a(byte[] bArr);

        WebSocketMessage b();
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class TextBuilder implements Builder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final ThreadLocal f19561b = new ThreadLocal<CharsetDecoder>() { // from class: com.google.firebase.database.tubesock.MessageBuilderFactory.TextBuilder.1
            @Override // java.lang.ThreadLocal
            public final CharsetDecoder initialValue() {
                CharsetDecoder charsetDecoderNewDecoder = Charset.forName("UTF8").newDecoder();
                CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
                charsetDecoderNewDecoder.onMalformedInput(codingErrorAction);
                charsetDecoderNewDecoder.onUnmappableCharacter(codingErrorAction);
                return charsetDecoderNewDecoder;
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StringBuilder f19562a = new StringBuilder();

        static {
            new ThreadLocal<CharsetEncoder>() { // from class: com.google.firebase.database.tubesock.MessageBuilderFactory.TextBuilder.2
                @Override // java.lang.ThreadLocal
                public final CharsetEncoder initialValue() {
                    CharsetEncoder charsetEncoderNewEncoder = Charset.forName("UTF8").newEncoder();
                    CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
                    charsetEncoderNewEncoder.onMalformedInput(codingErrorAction);
                    charsetEncoderNewEncoder.onUnmappableCharacter(codingErrorAction);
                    return charsetEncoderNewEncoder;
                }
            };
        }

        @Override // com.google.firebase.database.tubesock.MessageBuilderFactory.Builder
        public final boolean a(byte[] bArr) {
            String string;
            try {
                string = ((CharsetDecoder) f19561b.get()).decode(ByteBuffer.wrap(bArr)).toString();
            } catch (CharacterCodingException unused) {
                string = null;
            }
            if (string == null) {
                return false;
            }
            this.f19562a.append(string);
            return true;
        }

        @Override // com.google.firebase.database.tubesock.MessageBuilderFactory.Builder
        public final WebSocketMessage b() {
            String string = this.f19562a.toString();
            WebSocketMessage webSocketMessage = new WebSocketMessage();
            webSocketMessage.f19582a = string;
            return webSocketMessage;
        }
    }
}
